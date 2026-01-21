package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for CASE expression.
 */
public class CaseExpression extends ASTNode {

    private ASTNode caseOperand;  // For simple CASE (CASE expr WHEN...)
    private List<WhenClause> whenClauses = new ArrayList<>();
    private ASTNode elseExpression;

    public CaseExpression() {
        super();
    }

    public void setCaseOperand(ASTNode caseOperand) {
        this.caseOperand = caseOperand;
        addChild(caseOperand);
    }

    public ASTNode getCaseOperand() {
        return caseOperand;
    }

    public void addWhenClause(WhenClause whenClause) {
        whenClauses.add(whenClause);
        addChild(whenClause);
    }

    public List<WhenClause> getWhenClauses() {
        return whenClauses;
    }

    public void setElseExpression(ASTNode elseExpression) {
        this.elseExpression = elseExpression;
        addChild(elseExpression);
    }

    public ASTNode getElseExpression() {
        return elseExpression;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CASE (" + whenClauses.size() + " WHEN clauses)";
    }
}
