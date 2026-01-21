package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for WHERE clause.
 */
public class WhereClause extends ASTNode {

    private ASTNode condition;

    public WhereClause() {
        super();
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
        addChild(condition);
    }

    public ASTNode getCondition() {
        return condition;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "WHERE";
    }
}
