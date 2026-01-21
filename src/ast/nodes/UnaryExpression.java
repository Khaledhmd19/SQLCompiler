package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for a unary expression (operator operand).
 */
public class UnaryExpression extends ASTNode {

    public enum Operator {
        MINUS, NOT, EXISTS
    }

    private Operator operator;
    private ASTNode operand;

    public UnaryExpression() {
        super();
    }

    public UnaryExpression(Operator operator, ASTNode operand) {
        super();
        this.operator = operator;
        setOperand(operand);
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperand(ASTNode operand) {
        this.operand = operand;
        addChild(operand);
    }

    public ASTNode getOperand() {
        return operand;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "UnaryExpr: " + operator.name();
    }
}
