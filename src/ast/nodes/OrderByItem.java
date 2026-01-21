package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for an ORDER BY item (expression with optional ASC/DESC).
 */
public class OrderByItem extends ASTNode {

    private ASTNode expression;
    private Direction direction;

    public OrderByItem() {
        super();
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
        addChild(expression);
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
        if (direction != null) {
            addChild(direction);
        }
    }

    public void setSortOrder(Direction.SortOrder sortOrder) {
        this.direction = new Direction(sortOrder);
        addChild(this.direction);
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Handled through parent
    }

    @Override
    public String toString() {
        return "OrderBy";
    }
}
