package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for a table source (table with optional alias).
 */
public class TableSource extends ASTNode {

    private Identifier tableName;
    private Identifier alias;

    public TableSource() {
        super();
    }

    public void setTableName(Identifier tableName) {
        this.tableName = tableName;
        addChild(tableName);
    }

    public Identifier getTableName() {
        return tableName;
    }

    public void setAlias(Identifier alias) {
        this.alias = alias;
    }

    public Identifier getAlias() {
        return alias;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Generic visit through parent
    }

    @Override
    public String toString() {
        String result = tableName != null ? tableName.getName() : "";
        if (alias != null) {
            result += " AS " + alias.getName();
        }
        return "Table: " + result;
    }
}
