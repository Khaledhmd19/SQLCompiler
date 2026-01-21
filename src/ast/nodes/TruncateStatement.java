package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for TRUNCATE TABLE statement.
 */
public class TruncateStatement extends ASTNode {

    private Identifier tableName;

    public TruncateStatement() {
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
        return "TRUNCATE TABLE " + (tableName != null ? tableName.getName() : "");
    }
}
