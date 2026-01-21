package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for DROP TABLE statement.
 */
public class DropTableStatement extends ASTNode {

    private Identifier tableName;

    public DropTableStatement() {
        super();
    }

    public void setTableName(Identifier tableName) {
        this.tableName = tableName;
        addChild(tableName);
    }

    public Identifier getTableName() {
        return tableName;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "DROP TABLE " + (tableName != null ? tableName.getName() : "");
    }
}
