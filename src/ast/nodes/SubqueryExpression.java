package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for a subquery expression.
 */
public class SubqueryExpression extends ASTNode {

    private SelectStatement subquery;

    public SubqueryExpression() {
        super();
    }

    public SubqueryExpression(SelectStatement subquery) {
        super();
        setSubquery(subquery);
    }

    public void setSubquery(SelectStatement subquery) {
        this.subquery = subquery;
        addChild(subquery);
    }

    public SelectStatement getSubquery() {
        return subquery;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Subquery";
    }
}
