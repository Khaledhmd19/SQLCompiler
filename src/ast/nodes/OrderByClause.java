package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for ORDER BY clause.
 */
public class OrderByClause extends ASTNode {

    private List<OrderByItem> items = new ArrayList<>();

    public OrderByClause() {
        super();
    }

    public void addItem(OrderByItem item) {
        items.add(item);
        addChild(item);
    }

    public List<OrderByItem> getItems() {
        return items;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ORDER BY";
    }
}
