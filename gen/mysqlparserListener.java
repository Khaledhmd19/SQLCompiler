// Generated from C:/Users/KMHam/IdeaProjects/sql_compiler_lexer/src/mysqlparser.g4 by ANTLR 4.13.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mysqlparser}.
 */
public interface mysqlparserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mysqlparser#sqlFile}.
	 * @param ctx the parse tree
	 */
	void enterSqlFile(mysqlparser.SqlFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#sqlFile}.
	 * @param ctx the parse tree
	 */
	void exitSqlFile(mysqlparser.SqlFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mysqlparser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mysqlparser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(mysqlparser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(mysqlparser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(mysqlparser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(mysqlparser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(mysqlparser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(mysqlparser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(mysqlparser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(mysqlparser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(mysqlparser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(mysqlparser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(mysqlparser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(mysqlparser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(mysqlparser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(mysqlparser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(mysqlparser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(mysqlparser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(mysqlparser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(mysqlparser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(mysqlparser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(mysqlparser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(mysqlparser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(mysqlparser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(mysqlparser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(mysqlparser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#truncateStatement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStatement(mysqlparser.TruncateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#truncateStatement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStatement(mysqlparser.TruncateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(mysqlparser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(mysqlparser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(mysqlparser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(mysqlparser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatement(mysqlparser.AlterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatement(mysqlparser.AlterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterAction(mysqlparser.AlterActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterAction(mysqlparser.AlterActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropStatement(mysqlparser.DropStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropStatement(mysqlparser.DropStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(mysqlparser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(mysqlparser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(mysqlparser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(mysqlparser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mysqlparser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mysqlparser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(mysqlparser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(mysqlparser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(mysqlparser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(mysqlparser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(mysqlparser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(mysqlparser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(mysqlparser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(mysqlparser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(mysqlparser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(mysqlparser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(mysqlparser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(mysqlparser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(mysqlparser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(mysqlparser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(mysqlparser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(mysqlparser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlparser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(mysqlparser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlparser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(mysqlparser.ColumnNameContext ctx);
}