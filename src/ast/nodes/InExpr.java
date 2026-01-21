package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * AST node for IN expression.
 */
public class InExpr extends ASTNode {

    private ASTNode left;
    private List<ASTNode> items = new ArrayList<>();
    private boolean not = false;

    public InExpr() {
        super();
    }

    public void setLeft(ASTNode left) {
        this.left = left;
        addChild(left);
    }

    public ASTNode getLeft() {
        return left;
    }

    public void addItem(ASTNode item) {
        if (item != null) {
            items.add(item);
            addChild(item);
        }
    }

    public List<ASTNode> getItems() {
        return items;
    }

    public void setNot(boolean not) {
        this.not = not;
    }

    public boolean isNot() {
        return not;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // visitor.visit(this);
    }

    @Override
    public String toString() {
        return (not ? "NOT " : "") + "IN";
    }
}
