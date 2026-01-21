package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for HAVING clause.
 */
public class HavingClause extends ASTNode {

    private ASTNode condition;

    public HavingClause() {
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
        return "HAVING";
    }
}
