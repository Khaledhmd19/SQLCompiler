package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for WHEN clause in CASE expression.
 */
public class WhenClause extends ASTNode {

    private ASTNode condition;
    private ASTNode result;

    public WhenClause() {
        super();
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
        addChild(condition);
    }

    public ASTNode getCondition() {
        return condition;
    }

    public void setResult(ASTNode result) {
        this.result = result;
        addChild(result);
    }

    public ASTNode getResult() {
        return result;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Handled through CaseExpression
    }

    @Override
    public String toString() {
        return "WHEN ... THEN ...";
    }
}
