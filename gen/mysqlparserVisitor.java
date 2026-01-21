// Generated from src/mysqlparser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link mysqlparser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(mysqlparser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#execStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecStatement(mysqlparser.ExecStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#controlFlowStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFlowStatement(mysqlparser.ControlFlowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(mysqlparser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#beginEndBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginEndBlock(mysqlparser.BeginEndBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#tryCatchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchBlock(mysqlparser.TryCatchBlockContext ctx);
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
	 * Visit a parse tree produced by {@link mysqlparser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(mysqlparser.SelectClauseContext ctx);
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
	 * Visit a parse tree produced by {@link mysqlparser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSource(mysqlparser.TableSourceContext ctx);
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
	 * Visit a parse tree produced by {@link mysqlparser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeStatement(mysqlparser.MergeStatementContext ctx);
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
	 * Visit a parse tree produced by {@link mysqlparser#renameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameStatement(mysqlparser.RenameStatementContext ctx);
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
	 * Visit a parse tree produced by {@link mysqlparser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(mysqlparser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorStatement(mysqlparser.CursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#declareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStatement(mysqlparser.DeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#openCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCursor(mysqlparser.OpenCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#fetchCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchCursor(mysqlparser.FetchCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#closeCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCursor(mysqlparser.CloseCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#deallocateCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocateCursor(mysqlparser.DeallocateCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#cteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteStatement(mysqlparser.CteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#cteDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteDefinition(mysqlparser.CteDefinitionContext ctx);
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
	 * Visit a parse tree produced by {@link mysqlparser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(mysqlparser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(mysqlparser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(mysqlparser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlparser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(mysqlparser.IdentifierContext ctx);
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