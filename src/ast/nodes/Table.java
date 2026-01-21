package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for a table source (table with optional alias).
 */
public class Table extends ASTNode {

    private ASTNode tableName;

    public Table() {
        super();
    }

    public void setTableName(ASTNode tableName) {
        this.tableName = tableName;
        if (tableName != null) {
            addChild(tableName);
        }
    }

    public ASTNode getTableName() {
        return tableName;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Generic visit through parent
    }

    @Override
    public String toString() {
        return "Table";
    }
}
