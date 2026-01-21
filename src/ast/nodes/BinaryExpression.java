package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for a binary expression (left operator right).
 */
public class BinaryExpression extends ASTNode {

    public enum Operator {
        // Arithmetic
        PLUS, MINUS, MULTIPLY, DIVIDE, MODULO,
        // Comparison
        EQUALS, NOT_EQUALS, LESS_THAN, LESS_THAN_OR_EQUALS, GREATER_THAN, GREATER_THAN_OR_EQUALS,
        // Logical
        AND, OR,
        // Other
        LIKE, IN, BETWEEN, IS_NULL, IS_NOT_NULL
    }

    private ASTNode left;
    private Operator operator;
    private ASTNode right;

    public BinaryExpression() {
        super();
    }

    public BinaryExpression(ASTNode left, Operator operator, ASTNode right) {
        super();
        setLeft(left);
        this.operator = operator;
        setRight(right);
    }

    public void setLeft(ASTNode left) {
        this.left = left;
        addChild(left);
    }

    public ASTNode getLeft() {
        return left;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
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
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "BinaryExpr: " + operator.name();
    }
}
