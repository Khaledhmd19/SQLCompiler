// Generated from C:/Users/KMHam/IdeaProjects/sql_compiler_lexer/src/mysqlparser.g4 by ANTLR 4.13.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mysqlparser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mysqlparserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mysqlparser#sqlFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlFile(mysqlparser.SqlFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(mysqlparser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(mysqlparser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(mysqlparser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(mysqlparser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(mysqlparser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(mysqlparser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(mysqlparser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(mysqlparser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(mysqlparser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(mysqlparser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(mysqlparser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(mysqlparser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(mysqlparser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#truncateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStatement(mysqlparser.TruncateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(mysqlparser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(mysqlparser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#alterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStatement(mysqlparser.AlterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAction(mysqlparser.AlterActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#dropStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatement(mysqlparser.DropStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(mysqlparser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(mysqlparser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(mysqlparser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(mysqlparser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(mysqlparser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(mysqlparser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(mysqlparser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(mysqlparser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(mysqlparser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(mysqlparser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(mysqlparser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(mysqlparser.ColumnNameContext ctx);
}