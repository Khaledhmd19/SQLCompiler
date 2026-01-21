package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for CREATE TABLE statement.
 */
public class CreateTableStatement extends ASTNode {

    private Identifier tableName;
    private List<ColumnDef> columns = new ArrayList<>();
    private List<TableConstraint> constraints = new ArrayList<>();

    public CreateTableStatement() {
        super();
    }

    public void setTableName(Identifier tableName) {
        this.tableName = tableName;
        addChild(tableName);
    }

    public Identifier getTableName() {
        return tableName;
    }

    public void addColumn(ColumnDef column) {
        columns.add(column);
        addChild(column);
    }

    public List<ColumnDef> getColumns() {
        return columns;
    }

    public void addConstraint(TableConstraint constraint) {
        constraints.add(constraint);
        addChild(constraint);
    }

    public List<TableConstraint> getConstraints() {
        return constraints;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        if (tableName != null) {
            sb.append(tableName.getName());
        }
        sb.append(" (").append(columns.size()).append(" columns");
        if (!constraints.isEmpty()) {
            sb.append(", ").append(constraints.size()).append(" constraints");
        }
        sb.append(")");
        return sb.toString();
    }
}
