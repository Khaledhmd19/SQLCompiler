package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for GROUP BY clause.
 */
public class GroupByClause extends ASTNode {

    private List<ASTNode> expressions = new ArrayList<>();

    public GroupByClause() {
        super();
    }

    public void addExpression(ASTNode expression) {
        expressions.add(expression);
        addChild(expression);
    }

    public List<ASTNode> getExpressions() {
        return expressions;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "GROUP BY (" + expressions.size() + " expressions)";
    }
}
