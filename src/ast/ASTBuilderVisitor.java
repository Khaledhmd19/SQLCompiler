package ast;

import ast.nodes.*;
import parser.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Visitor that traverses the parse tree and builds the AST.
 * Extends the ANTLR-generated BaseVisitor.
 */
public class ASTBuilderVisitor extends mysqlparserBaseVisitor<ASTNode> {

    // ==========================================
    // Entry Point
    // ==========================================

    @Override
    public ASTNode visitSqlFile(mysqlparser.SqlFileContext ctx) {
        SqlFile sqlFile = new SqlFile();
        for (mysqlparser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode stmt = visit(stmtCtx);
            if (stmt != null) {
                sqlFile.addStatement(stmt);
            }
        }
        return sqlFile;
    }

    // ==========================================
    // Statements
    // ==========================================

    @Override
    public ASTNode visitStatement(mysqlparser.StatementContext ctx) {
        if (ctx.dmlStatement() != null) {
            return visit(ctx.dmlStatement());
        } else if (ctx.ddlStatement() != null) {
            return visit(ctx.ddlStatement());
        } else if (ctx.controlFlowStatement() != null) {
            return visit(ctx.controlFlowStatement());
        } else if (ctx.useStatement() != null) {
            return visit(ctx.useStatement());
        } else if (ctx.setStatement() != null) {
            return visit(ctx.setStatement());
        } else if (ctx.cursorStatement() != null) {
            return visit(ctx.cursorStatement());
        } else if (ctx.cteStatement() != null) {
            return visit(ctx.cteStatement());
        } else if (ctx.execStatement() != null) {
            return visit(ctx.execStatement());
        } else if (ctx.GO() != null) {
            // GO is a batch separator, we can skip it or create a marker
            return null;
        }
        return null;
    }

    @Override
    public ASTNode visitDmlStatement(mysqlparser.DmlStatementContext ctx) {
        if (ctx.selectStatement() != null) {
            return visit(ctx.selectStatement());
        } else if (ctx.insertStatement() != null) {
            return visit(ctx.insertStatement());
        } else if (ctx.updateStatement() != null) {
            return visit(ctx.updateStatement());
        } else if (ctx.deleteStatement() != null) {
            return visit(ctx.deleteStatement());
        } else if (ctx.truncateStatement() != null) {
            return visit(ctx.truncateStatement());
        }
        return null;
    }

    @Override
    public ASTNode visitDdlStatement(mysqlparser.DdlStatementContext ctx) {
        if (ctx.createStatement() != null) {
            return visit(ctx.createStatement());
        } else if (ctx.alterStatement() != null) {
            return visit(ctx.alterStatement());
        } else if (ctx.dropStatement() != null) {
            return visit(ctx.dropStatement());
        }
        return null;
    }

    // ==========================================
    // SELECT Statement
    // ==========================================

    @Override
    public ASTNode visitSelectStatement(mysqlparser.SelectStatementContext ctx) {
        SelectStatement select = new SelectStatement();

        // Visit SELECT clause
        if (ctx.selectClause() != null) {
            mysqlparser.SelectClauseContext selectClause = ctx.selectClause();

            // Check for DISTINCT
            if (selectClause.DISTINCT() != null) {
                select.setDistinct(true);
            }

            // Check for TOP
            if (selectClause.TOP() != null && selectClause.INT() != null) {
                select.setTopCount(Integer.parseInt(selectClause.INT().getText()));
                if (selectClause.PERCENT() != null) {
                    select.setTopPercent(true);
                }
            }

            // Visit select list
            if (selectClause.selectList() != null) {
                mysqlparser.SelectListContext listCtx = selectClause.selectList();
                if (listCtx.STAR() != null) {
                    SelectItem starItem = new SelectItem();
                    starItem.setAllColumns(true);
                    select.addSelectItem(starItem);
                } else {
                    for (mysqlparser.SelectItemContext itemCtx : listCtx.selectItem()) {
                        ASTNode item = visitSelectItem(itemCtx);
                        if (item != null) {
                            select.addSelectItem(item);
                        }
                    }
                }
            }
        }

        // Visit FROM clause
        if (ctx.fromClause() != null) {
            FromClause fromClause = (FromClause) visit(ctx.fromClause());
            select.setFromClause(fromClause);
        }

        // Visit JOIN clauses
        for (mysqlparser.JoinClauseContext joinCtx : ctx.joinClause()) {
            JoinClause joinClause = (JoinClause) visit(joinCtx);
            if (joinClause != null) {
                select.addJoinClause(joinClause);
            }
        }

        // Visit WHERE clause
        if (ctx.whereClause() != null) {
            WhereClause whereClause = (WhereClause) visit(ctx.whereClause());
            select.setWhereClause(whereClause);
        }

        // Visit GROUP BY clause
        if (ctx.groupByClause() != null) {
            GroupByClause groupByClause = (GroupByClause) visit(ctx.groupByClause());
            select.setGroupByClause(groupByClause);
        }

        // Visit HAVING clause
        if (ctx.havingClause() != null) {
            HavingClause havingClause = (HavingClause) visit(ctx.havingClause());
            select.setHavingClause(havingClause);
        }

        // Visit ORDER BY clause
        if (ctx.orderByClause() != null) {
            OrderByClause orderByClause = (OrderByClause) visit(ctx.orderByClause());
            select.setOrderByClause(orderByClause);
        }

        return select;
    }

    @Override
    public ASTNode visitSelectItem(mysqlparser.SelectItemContext ctx) {
        SelectItem item = new SelectItem();

        if (ctx.expression() != null) {
            ASTNode expr = visit(ctx.expression());
            item.setExpression(expr);
        }

        if (ctx.alias() != null) {
            String aliasName = null;
            if (ctx.alias().identifier() != null) {
                aliasName = ctx.alias().identifier().getText();
            } else if (ctx.alias().STRING() != null) {
                String alias = ctx.alias().STRING().getText();
                // Remove quotes
                if (alias.startsWith("'") && alias.endsWith("'")) {
                    alias = alias.substring(1, alias.length() - 1);
                }
                aliasName = alias;
            }
            if (aliasName != null) {
                Alias aliasNode = new Alias(aliasName);
                item.setAlias(aliasNode);
            }
        }

        return item;
    }

    // ==========================================
    // INSERT Statement
    // ==========================================

    @Override
    public ASTNode visitInsertStatement(mysqlparser.InsertStatementContext ctx) {
        InsertStatement insert = new InsertStatement();

        // Table name
        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            insert.setTableName(tableName);
        }

        // Column names
        for (mysqlparser.ColumnNameContext colCtx : ctx.columnName()) {
            Identifier colName = visitColumnName(colCtx);
            insert.addColumn(colName);
        }

        // VALUES or SELECT
        if (ctx.selectStatement() != null) {
            // INSERT ... SELECT
            SelectStatement selectStmt = (SelectStatement) visit(ctx.selectStatement());
            insert.setSelectStatement(selectStmt);
        } else {
            // INSERT ... VALUES
            for (mysqlparser.ValueRowContext rowCtx : ctx.valueRow()) {
                List<ASTNode> values = new ArrayList<>();
                for (mysqlparser.ExpressionContext exprCtx : rowCtx.expression()) {
                    ASTNode value = visit(exprCtx);
                    if (value != null) {
                        values.add(value);
                    }
                }
                insert.addValueRow(values);
            }
        }

        return insert;
    }

    // ==========================================
    // UPDATE Statement
    // ==========================================

    @Override
    public ASTNode visitUpdateStatement(mysqlparser.UpdateStatementContext ctx) {
        UpdateStatement update = new UpdateStatement();

        // Table name
        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            update.setTableName(tableName);
        }

        // Assignments
        for (mysqlparser.AssignmentContext assignCtx : ctx.assignment()) {
            Assignment assignment = (Assignment) visit(assignCtx);
            if (assignment != null) {
                update.addAssignment(assignment);
            }
        }

        // WHERE clause
        if (ctx.whereClause() != null) {
            WhereClause whereClause = (WhereClause) visit(ctx.whereClause());
            update.setWhereClause(whereClause);
        }

        return update;
    }

    @Override
    public ASTNode visitAssignment(mysqlparser.AssignmentContext ctx) {
        Assignment assignment = new Assignment();

        if (ctx.columnName() != null) {
            Identifier colName = visitColumnName(ctx.columnName());
            assignment.setColumn(colName);
        }

        if (ctx.expression() != null) {
            ASTNode value = visit(ctx.expression());
            assignment.setValue(value);
        }

        return assignment;
    }

    // ==========================================
    // DELETE Statement
    // ==========================================

    @Override
    public ASTNode visitDeleteStatement(mysqlparser.DeleteStatementContext ctx) {
        DeleteStatement delete = new DeleteStatement();

        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            delete.setTableName(tableName);
        }

        if (ctx.whereClause() != null) {
            WhereClause whereClause = (WhereClause) visit(ctx.whereClause());
            delete.setWhereClause(whereClause);
        }

        return delete;
    }

    // ==========================================
    // TRUNCATE Statement
    // ==========================================

    @Override
    public ASTNode visitTruncateStatement(mysqlparser.TruncateStatementContext ctx) {
        TruncateStatement truncate = new TruncateStatement();

        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            truncate.setTableName(tableName);
        }

        return truncate;
    }

    // ==========================================
    // USE Statement
    // ==========================================

    @Override
    public ASTNode visitUseStatement(mysqlparser.UseStatementContext ctx) {
        UseStatement use = new UseStatement();

        if (ctx.identifier() != null) {
            Identifier dbName = new Identifier(ctx.identifier().getText());
            use.setDatabaseName(dbName);
        }

        return use;
    }

    // ==========================================
    // CREATE TABLE Statement
    // ==========================================

    @Override
    public ASTNode visitCreateStatement(mysqlparser.CreateStatementContext ctx) {
        CreateTableStatement create = new CreateTableStatement();

        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            create.setTableName(tableName);
        }

        // Visit table elements (columns and constraints)
        for (mysqlparser.TableElementContext elemCtx : ctx.tableElement()) {
            if (elemCtx.columnDef() != null) {
                ColumnDef colDef = (ColumnDef) visit(elemCtx.columnDef());
                if (colDef != null) {
                    create.addColumn(colDef);
                }
            } else if (elemCtx.tableConstraint() != null) {
                TableConstraint constraint = (TableConstraint) visit(elemCtx.tableConstraint());
                if (constraint != null) {
                    create.addConstraint(constraint);
                }
            }
        }

        return create;
    }

    @Override
    public ASTNode visitColumnDef(mysqlparser.ColumnDefContext ctx) {
        ColumnDef colDef = new ColumnDef();

        if (ctx.columnName() != null) {
            Identifier colName = visitColumnName(ctx.columnName());
            colDef.setColumnName(colName);
        }

        if (ctx.dataType() != null) {
            mysqlparser.DataTypeContext dtCtx = ctx.dataType();
            if (dtCtx.identifier() != null) {
                colDef.setDataType(dtCtx.identifier().getText());
            }
            // Handle precision/scale
            if (dtCtx.INT() != null && dtCtx.INT().size() > 0) {
                colDef.setPrecision(Integer.parseInt(dtCtx.INT(0).getText()));
                if (dtCtx.INT().size() > 1) {
                    colDef.setScale(Integer.parseInt(dtCtx.INT(1).getText()));
                }
            }
            if (dtCtx.MAX() != null) {
                colDef.setDataType(colDef.getDataType() + "(MAX)");
            }
        }

        // Check for IDENTITY
        if (ctx.identitySpec() != null) {
            colDef.setIdentity(true);
        }

        // Column constraints
        for (mysqlparser.ColumnConstraintContext constrCtx : ctx.columnConstraint()) {
            if (constrCtx.NOT() != null && constrCtx.NULL() != null) {
                colDef.addConstraint("NOT NULL");
            } else if (constrCtx.NULL() != null) {
                colDef.addConstraint("NULL");
            } else if (constrCtx.PRIMARY() != null) {
                colDef.addConstraint("PRIMARY KEY");
            } else if (constrCtx.UNIQUE() != null) {
                colDef.addConstraint("UNIQUE");
            }
        }

        return colDef;
    }

    @Override
    public ASTNode visitTableConstraint(mysqlparser.TableConstraintContext ctx) {
        TableConstraint constraint = new TableConstraint();

        // Constraint name
        if (ctx.CONSTRAINT() != null && ctx.identifier() != null) {
            constraint.setConstraintName(ctx.identifier().getText());
        }

        // Constraint type
        if (ctx.PRIMARY() != null) {
            constraint.setType(TableConstraint.ConstraintType.PRIMARY_KEY);
        } else if (ctx.UNIQUE() != null) {
            constraint.setType(TableConstraint.ConstraintType.UNIQUE);
        } else if (ctx.REFERENCES() != null) {
            constraint.setType(TableConstraint.ConstraintType.FOREIGN_KEY);
        }

        // Clustered
        if (ctx.CLUSTERED() != null) {
            constraint.setClustered(true);
        }

        // Columns
        for (mysqlparser.ColumnNameContext colCtx : ctx.columnName()) {
            Identifier colName = visitColumnName(colCtx);
            constraint.addColumn(colName);
        }

        return constraint;
    }

    @Override
    public ASTNode visitDropStatement(mysqlparser.DropStatementContext ctx) {
        DropTableStatement drop = new DropTableStatement();

        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            drop.setTableName(tableName);
        }

        return drop;
    }

    @Override
    public ASTNode visitAlterStatement(mysqlparser.AlterStatementContext ctx) {
        AlterTableStatement alter = new AlterTableStatement();

        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            alter.setTableName(tableName);
        }

        return alter;
    }

    // ==========================================
    // Clauses
    // ==========================================

    @Override
    public ASTNode visitFromClause(mysqlparser.FromClauseContext ctx) {
        FromClause fromClause = new FromClause();

        for (mysqlparser.TableSourceContext srcCtx : ctx.tableSource()) {
            Table table = (Table) visit(srcCtx);
            if (table != null) {
                fromClause.addTable(table);
            }
        }

        return fromClause;
    }

    @Override
    public ASTNode visitTableSource(mysqlparser.TableSourceContext ctx) {
        Table table = new Table();

        if (ctx.tableName() != null) {
            Identifier tableName = visitTableName(ctx.tableName());
            table.setTableName(tableName);
        }

        // TODO: Handle table aliases if needed
        if (ctx.identifier() != null) {
            // Table aliases can be added as needed
        }

        return table;
    }

    @Override
    public ASTNode visitJoinClause(mysqlparser.JoinClauseContext ctx) {
        JoinClause join = new JoinClause();

        // Join type
        if (ctx.joinType() != null) {
            mysqlparser.JoinTypeContext typeCtx = ctx.joinType();
            if (typeCtx.INNER() != null) {
                join.setJoinType(JoinClause.JoinType.INNER);
            } else if (typeCtx.LEFT() != null) {
                join.setJoinType(JoinClause.JoinType.LEFT);
            } else if (typeCtx.RIGHT() != null) {
                join.setJoinType(JoinClause.JoinType.RIGHT);
            } else if (typeCtx.FULL() != null) {
                join.setJoinType(JoinClause.JoinType.FULL);
            } else if (typeCtx.CROSS() != null) {
                join.setJoinType(JoinClause.JoinType.CROSS);
            }
        }

        // Table
        if (ctx.tableSource() != null) {
            TableSource table = (TableSource) visit(ctx.tableSource());
            join.setTable(table);
        }

        // ON condition
        if (ctx.expression() != null) {
            ASTNode condition = visit(ctx.expression());
            join.setOnCondition(condition);
        }

        return join;
    }

    @Override
    public ASTNode visitWhereClause(mysqlparser.WhereClauseContext ctx) {
        WhereClause where = new WhereClause();

        if (ctx.expression() != null) {
            ASTNode condition = visit(ctx.expression());
            where.setCondition(condition);
        }

        return where;
    }

    @Override
    public ASTNode visitGroupByClause(mysqlparser.GroupByClauseContext ctx) {
        GroupByClause groupBy = new GroupByClause();

        for (mysqlparser.ExpressionContext exprCtx : ctx.expression()) {
            ASTNode expr = visit(exprCtx);
            if (expr != null) {
                groupBy.addExpression(expr);
            }
        }

        return groupBy;
    }

    @Override
    public ASTNode visitHavingClause(mysqlparser.HavingClauseContext ctx) {
        HavingClause having = new HavingClause();

        if (ctx.expression() != null) {
            ASTNode condition = visit(ctx.expression());
            having.setCondition(condition);
        }

        return having;
    }

    @Override
    public ASTNode visitOrderByClause(mysqlparser.OrderByClauseContext ctx) {
        OrderByClause orderBy = new OrderByClause();

        for (mysqlparser.OrderByItemContext itemCtx : ctx.orderByItem()) {
            OrderByItem item = (OrderByItem) visit(itemCtx);
            if (item != null) {
                orderBy.addItem(item);
            }
        }

        return orderBy;
    }

    @Override
    public ASTNode visitOrderByItem(mysqlparser.OrderByItemContext ctx) {
        OrderByItem item = new OrderByItem();

        if (ctx.expression() != null) {
            ASTNode expr = visit(ctx.expression());
            item.setExpression(expr);
        }

        if (ctx.DESC() != null) {
            Direction direction = new Direction(Direction.SortOrder.DESC);
            item.setDirection(direction);
        } else {
            Direction direction = new Direction(Direction.SortOrder.ASC);
            item.setDirection(direction);
        }

        return item;
    }

    // ==========================================
    // Expressions
    // ==========================================

    @Override
    public ASTNode visitExpression(mysqlparser.ExpressionContext ctx) {
        return visit(ctx.logicalExpression());
    }

    @Override
    public ASTNode visitLogicalExpression(mysqlparser.LogicalExpressionContext ctx) {
        if (ctx.relationalExpression().size() == 1) {
            return visit(ctx.relationalExpression(0));
        }

        // Multiple relational expressions with AND/OR
        ASTNode left = visit(ctx.relationalExpression(0));
        for (int i = 1; i < ctx.relationalExpression().size(); i++) {
            ASTNode right = visit(ctx.relationalExpression(i));
            BinaryExpression.Operator op = BinaryExpression.Operator.AND;

            // Check if OR (position i-1 in the operator list)
            if (ctx.OR(i - 1) != null) {
                op = BinaryExpression.Operator.OR;
            }

            left = new BinaryExpression(left, op, right);
        }
        return left;
    }

    @Override
    public ASTNode visitRelationalExpression(mysqlparser.RelationalExpressionContext ctx) {
        ASTNode left = visit(ctx.additiveExpression(0));

        // LIKE (check first before other comparisons)
        if (ctx.LIKE() != null && ctx.additiveExpression().size() > 1) {
            ASTNode right = visit(ctx.additiveExpression(1));
            LikeExpr likeExpr = new LikeExpr();
            likeExpr.setLeft(left);
            likeExpr.setRight(right);
            if (ctx.NOT() != null) {
                return new UnaryExpression(UnaryExpression.Operator.NOT, likeExpr);
            }
            return likeExpr;
        }

        // Comparison operators (=, <>, <, <=, >, >=)
        if (ctx.additiveExpression().size() > 1) {
            ASTNode right = visit(ctx.additiveExpression(1));
            BinaryExpression.Operator op = BinaryExpression.Operator.EQUALS;

            if (ctx.EQ() != null) {
                op = BinaryExpression.Operator.EQUALS;
            } else if (ctx.NEQ() != null) {
                op = BinaryExpression.Operator.NOT_EQUALS;
            } else if (ctx.LT() != null) {
                op = BinaryExpression.Operator.LESS_THAN;
            } else if (ctx.LTE() != null) {
                op = BinaryExpression.Operator.LESS_THAN_OR_EQUALS;
            } else if (ctx.GT() != null) {
                op = BinaryExpression.Operator.GREATER_THAN;
            } else if (ctx.GTE() != null) {
                op = BinaryExpression.Operator.GREATER_THAN_OR_EQUALS;
            }

            return new BinaryExpression(left, op, right);
        }

        // IS NULL / IS NOT NULL
        if (ctx.IS() != null && ctx.NULL() != null) {
            BinaryExpression.Operator op = ctx.NOT() != null
                ? BinaryExpression.Operator.IS_NOT_NULL
                : BinaryExpression.Operator.IS_NULL;
            return new BinaryExpression(left, op, new Literal(Literal.LiteralType.NULL, "NULL"));
        }

        // IN
        if (ctx.IN() != null) {
            // For simplicity, return the left side with IN marker
            // A more complete implementation would create an InExpression node
            return left;
        }

        // EXISTS
        if (ctx.EXISTS() != null && ctx.selectStatement() != null) {
            SelectStatement subquery = (SelectStatement) visit(ctx.selectStatement());
            SubqueryExpression subqueryExpr = new SubqueryExpression(subquery);
            UnaryExpression exists = new UnaryExpression(UnaryExpression.Operator.EXISTS, subqueryExpr);
            if (ctx.NOT() != null) {
                return new UnaryExpression(UnaryExpression.Operator.NOT, exists);
            }
            return exists;
        }

        return left;
    }

    @Override
    public ASTNode visitAdditiveExpression(mysqlparser.AdditiveExpressionContext ctx) {
        if (ctx.multiplicativeExpression().size() == 1) {
            return visit(ctx.multiplicativeExpression(0));
        }

        ASTNode left = visit(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            ASTNode right = visit(ctx.multiplicativeExpression(i));
            BinaryExpression.Operator op = ctx.PLUS(i - 1) != null
                ? BinaryExpression.Operator.PLUS
                : BinaryExpression.Operator.MINUS;
            left = new BinaryExpression(left, op, right);
        }
        return left;
    }

    @Override
    public ASTNode visitMultiplicativeExpression(mysqlparser.MultiplicativeExpressionContext ctx) {
        if (ctx.unaryExpression().size() == 1) {
            return visit(ctx.unaryExpression(0));
        }

        ASTNode left = visit(ctx.unaryExpression(0));
        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            ASTNode right = visit(ctx.unaryExpression(i));
            BinaryExpression.Operator op = BinaryExpression.Operator.MULTIPLY;
            if (ctx.SLASH(i - 1) != null) {
                op = BinaryExpression.Operator.DIVIDE;
            } else if (ctx.PERCENT_OP(i - 1) != null) {
                op = BinaryExpression.Operator.MODULO;
            }
            left = new BinaryExpression(left, op, right);
        }
        return left;
    }

    @Override
    public ASTNode visitUnaryExpression(mysqlparser.UnaryExpressionContext ctx) {
        if (ctx.MINUS() != null) {
            ASTNode operand = visit(ctx.unaryExpression());
            return new UnaryExpression(UnaryExpression.Operator.MINUS, operand);
        } else if (ctx.NOT() != null) {
            ASTNode operand = visit(ctx.unaryExpression());
            return new UnaryExpression(UnaryExpression.Operator.NOT, operand);
        } else if (ctx.EXISTS() != null && ctx.selectStatement() != null) {
            SelectStatement subquery = (SelectStatement) visit(ctx.selectStatement());
            SubqueryExpression subqueryExpr = new SubqueryExpression(subquery);
            return new UnaryExpression(UnaryExpression.Operator.EXISTS, subqueryExpr);
        } else if (ctx.primary() != null) {
            return visit(ctx.primary());
        }
        return null;
    }

    @Override
    public ASTNode visitPrimary(mysqlparser.PrimaryContext ctx) {
        if (ctx.literal() != null) {
            return visit(ctx.literal());
        } else if (ctx.caseExpression() != null) {
            return visit(ctx.caseExpression());
        } else if (ctx.USER_VAR() != null) {
            return new Identifier(ctx.USER_VAR().getText());
        } else if (ctx.SYSTEM_VAR() != null) {
            return new Identifier(ctx.SYSTEM_VAR().getText());
        } else if (ctx.selectStatement() != null) {
            // Subquery
            SelectStatement subquery = (SelectStatement) visit(ctx.selectStatement());
            return new SubqueryExpression(subquery);
        } else if (ctx.expression() != null) {
            // Parenthesized expression
            return visit(ctx.expression());
        } else if (ctx.aggregateFunction() != null) {
            return visit(ctx.aggregateFunction());
        } else if (ctx.identifierOrFunction() != null) {
            return visit(ctx.identifierOrFunction());
        }
        return null;
    }

    @Override
    public ASTNode visitAggregateFunction(mysqlparser.AggregateFunctionContext ctx) {
        FunctionCall func = new FunctionCall();

        // Function name
        if (ctx.COUNT() != null) {
            func.setFunctionName("COUNT");
        } else if (ctx.SUM() != null) {
            func.setFunctionName("SUM");
        } else if (ctx.AVG() != null) {
            func.setFunctionName("AVG");
        } else if (ctx.MIN() != null) {
            func.setFunctionName("MIN");
        } else if (ctx.MAX() != null) {
            func.setFunctionName("MAX");
        }

        // Check for STAR (COUNT(*))
        if (ctx.STAR() != null) {
            func.setAllColumns(true);
        } else if (ctx.expression() != null) {
            if (ctx.DISTINCT() != null) {
                func.setDistinct(true);
            }
            ASTNode arg = visit(ctx.expression());
            func.addArgument(arg);
        }

        return func;
    }

    @Override
    public ASTNode visitIdentifierOrFunction(mysqlparser.IdentifierOrFunctionContext ctx) {
        if (ctx.columnName() != null) {
            Identifier name = visitColumnName(ctx.columnName());

            // Check if it's a function call (has parentheses)
            if (ctx.LPAREN() != null) {
                FunctionCall func = new FunctionCall(name.getName());

                for (mysqlparser.ExpressionContext exprCtx : ctx.expression()) {
                    ASTNode arg = visit(exprCtx);
                    if (arg != null) {
                        func.addArgument(arg);
                    }
                }

                return func;
            }

            return name;
        }
        return null;
    }

    @Override
    public ASTNode visitCaseExpression(mysqlparser.CaseExpressionContext ctx) {
        CaseExpression caseExpr = new CaseExpression();

        // Simple CASE (CASE expr WHEN...)
        if (ctx.expression() != null && ctx.expression().size() > 0) {
            // First expression is the case operand if there's one before WHEN
            // This is a simplified implementation
        }

        // WHEN clauses
        for (mysqlparser.WhenClauseContext whenCtx : ctx.whenClause()) {
            WhenClause when = (WhenClause) visit(whenCtx);
            if (when != null) {
                caseExpr.addWhenClause(when);
            }
        }

        // ELSE clause - get the last expression after ELSE
        if (ctx.ELSE() != null && ctx.expression() != null && ctx.expression().size() > 0) {
            // The expression after ELSE is the last one
            ASTNode elseExpr = visit(ctx.expression(ctx.expression().size() - 1));
            caseExpr.setElseExpression(elseExpr);
        }

        return caseExpr;
    }

    @Override
    public ASTNode visitWhenClause(mysqlparser.WhenClauseContext ctx) {
        WhenClause when = new WhenClause();

        if (ctx.expression().size() >= 2) {
            ASTNode condition = visit(ctx.expression(0));
            when.setCondition(condition);

            ASTNode result = visit(ctx.expression(1));
            when.setResult(result);
        }

        return when;
    }

    @Override
    public ASTNode visitLiteral(mysqlparser.LiteralContext ctx) {
        Literal literal = new Literal();

        if (ctx.INT() != null) {
            literal.setType(Literal.LiteralType.INTEGER);
            literal.setValue(ctx.INT().getText());
        } else if (ctx.DECIMAL() != null) {
            literal.setType(Literal.LiteralType.DECIMAL);
            literal.setValue(ctx.DECIMAL().getText());
        } else if (ctx.FLOAT() != null) {
            literal.setType(Literal.LiteralType.FLOAT);
            literal.setValue(ctx.FLOAT().getText());
        } else if (ctx.STRING() != null) {
            literal.setType(Literal.LiteralType.STRING);
            literal.setValue(ctx.STRING().getText());
        } else if (ctx.HEX_STRING() != null) {
            literal.setType(Literal.LiteralType.HEX_STRING);
            literal.setValue(ctx.HEX_STRING().getText());
        } else if (ctx.BIT_STRING() != null) {
            literal.setType(Literal.LiteralType.BIT_STRING);
            literal.setValue(ctx.BIT_STRING().getText());
        } else if (ctx.TRUE() != null) {
            literal.setType(Literal.LiteralType.BOOLEAN);
            literal.setValue("TRUE");
        } else if (ctx.FALSE() != null) {
            literal.setType(Literal.LiteralType.BOOLEAN);
            literal.setValue("FALSE");
        } else if (ctx.NULL() != null) {
            literal.setType(Literal.LiteralType.NULL);
            literal.setValue("NULL");
        }

        return literal;
    }

    // ==========================================
    // Identifiers
    // ==========================================

    public Identifier visitTableName(mysqlparser.TableNameContext ctx) {
        Identifier id = new Identifier();
        for (mysqlparser.IdentifierContext idCtx : ctx.identifier()) {
            id.addPart(cleanIdentifier(idCtx.getText()));
        }
        return id;
    }

    public Identifier visitColumnName(mysqlparser.ColumnNameContext ctx) {
        Identifier id = new Identifier();
        for (mysqlparser.IdentifierContext idCtx : ctx.identifier()) {
            id.addPart(cleanIdentifier(idCtx.getText()));
        }
        return id;
    }

    /**
     * Remove brackets or quotes from identifier
     */
    private String cleanIdentifier(String text) {
        if (text.startsWith("[") && text.endsWith("]")) {
            return text.substring(1, text.length() - 1);
        }
        if (text.startsWith("\"") && text.endsWith("\"")) {
            return text.substring(1, text.length() - 1);
        }
        return text;
    }

    // ==========================================
    // Control Flow (simplified)
    // ==========================================

    @Override
    public ASTNode visitControlFlowStatement(mysqlparser.ControlFlowStatementContext ctx) {
        // For simplicity, we'll skip control flow in AST
        // A complete implementation would handle IF, BEGIN/END, TRY/CATCH
        return null;
    }
}
