package ast;

import ast.nodes.*;

/**
 * Visitor interface for traversing AST nodes.
 * Implements the Visitor Design Pattern.
 */
public interface ASTVisitor {

    // Program/File
    void visit(SqlFile node);

    // Statements
    void visit(SelectStatement node);
    void visit(InsertStatement node);
    void visit(UpdateStatement node);
    void visit(DeleteStatement node);
    void visit(CreateTableStatement node);
    void visit(AlterTableStatement node);
    void visit(DropTableStatement node);
    void visit(TruncateStatement node);
    void visit(UseStatement node);

    // Clauses
    void visit(FromClause node);
    void visit(WhereClause node);
    void visit(GroupByClause node);
    void visit(HavingClause node);
    void visit(OrderByClause node);
    void visit(JoinClause node);

    // Expressions
    void visit(BinaryExpression node);
    void visit(UnaryExpression node);
    void visit(FunctionCall node);
    void visit(CaseExpression node);
    void visit(SubqueryExpression node);

    // Terminals with values
    void visit(Identifier node);
    void visit(Literal node);
    void visit(ColumnDef node);
    void visit(Assignment node);
}
