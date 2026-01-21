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
    private Table table;
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

    public void setTable(Table table) {
        this.table = table;
        addChild(table);
    }

    public Table getTable() {
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
            // Table node's toString will be used or we can access its formatted name if
            // implemented
            sb.append(" ").append(table.toString());
        }
        return sb.toString();
    }
}
