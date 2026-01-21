package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for LIKE expression.
 */
public class LikeExpr extends ASTNode {

    private ASTNode left;
    private ASTNode right;

    public LikeExpr() {
        super();
    }

    public void setLeft(ASTNode left) {
        this.left = left;
        addChild(left);
    }

    public ASTNode getLeft() {
        return left;
    }

    public void setRight(ASTNode right) {
        this.right = right;
        addChild(right);
    }

    public ASTNode getRight() {
        return right;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Can be extended for visitor pattern
    }

    @Override
    public String toString() {
        return "LikeExpr";
    }
}
