package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for a SELECT item (expression with optional alias).
 */
public class SelectItem extends ASTNode {

    private ASTNode expression;
    private Alias alias;
    private boolean allColumns = false;  // For SELECT *

    public SelectItem() {
        super();
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
        addChild(expression);
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
        if (alias != null) {
            addChild(alias);
        }
    }

    public void setAlias(String aliasName) {
        if (aliasName != null) {
            this.alias = new Alias(aliasName);
            addChild(this.alias);
        }
    }

    public Alias getAlias() {
        return alias;
    }

    public void setAllColumns(boolean allColumns) {
        this.allColumns = allColumns;
    }

    public boolean isAllColumns() {
        return allColumns;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Handled through SelectStatement
    }

    @Override
    public String toString() {
        return "SelectItem";
    }
}
