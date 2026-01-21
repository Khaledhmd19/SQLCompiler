package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for JOIN clause.
 */
public class JoinClause extends ASTNode {

    public enum JoinType {
        INNER, LEFT, RIGHT, FULL, CROSS
    }

    private JoinType joinType = JoinType.INNER;
    private TableSource table;
    private ASTNode onCondition;

    public JoinClause() {
        super();
    }

    public void setJoinType(JoinType joinType) {
        this.joinType = joinType;
    }

    public JoinType getJoinType() {
        return joinType;
    }

    public void setTable(TableSource table) {
        this.table = table;
        addChild(table);
    }

    public TableSource getTable() {
        return table;
    }

    public void setOnCondition(ASTNode onCondition) {
        this.onCondition = onCondition;
        addChild(onCondition);
    }

    public ASTNode getOnCondition() {
        return onCondition;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(joinType.name()).append(" JOIN");
        if (table != null) {
            sb.append(" ").append(table.getTableName() != null ? table.getTableName().getName() : "");
        }
        return sb.toString();
    }
}
