package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for IF statement.
 */
public class IfStatement extends ASTNode {

    private ASTNode condition;
    private ASTNode thenStatement;
    private ASTNode elseStatement;

    public IfStatement() {
        super();
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
        addChild(condition);
    }

    public ASTNode getCondition() {
        return condition;
    }

    public void setThenStatement(ASTNode thenStatement) {
        this.thenStatement = thenStatement;
        addChild(thenStatement);
    }

    public ASTNode getThenStatement() {
        return thenStatement;
    }

    public void setElseStatement(ASTNode elseStatement) {
        this.elseStatement = elseStatement;
        addChild(elseStatement);
    }

    public ASTNode getElseStatement() {
        return elseStatement;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // visitor.visit(this);
    }

    @Override
    public String toString() {
        return "IF";
    }
}
