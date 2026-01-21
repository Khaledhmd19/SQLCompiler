package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for sort direction (ASC or DESC).
 */
public class Direction extends ASTNode {

    public enum SortOrder {
        ASC, DESC
    }

    private SortOrder direction;

    public Direction(SortOrder direction) {
        super();
        this.direction = direction;
    }

    public SortOrder getDirection() {
        return direction;
    }

    public void setDirection(SortOrder direction) {
        this.direction = direction;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Direction is a leaf node
    }

    @Override
    public String toString() {
        return "Direction: " + direction.name();
    }
}
