package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for DELETE statement.
 */
public class DeleteStatement extends ASTNode {

    private Identifier tableName;
    private WhereClause whereClause;

    public DeleteStatement() {
        super();
    }

    public void setTableName(Identifier tableName) {
        this.tableName = tableName;
        addChild(tableName);
    }

    public Identifier getTableName() {
        return tableName;
    }

    public void setWhereClause(WhereClause whereClause) {
        this.whereClause = whereClause;
        addChild(whereClause);
    }

    public WhereClause getWhereClause() {
        return whereClause;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        if (tableName != null) {
            sb.append(tableName.getName());
        }
        return sb.toString();
    }
}
