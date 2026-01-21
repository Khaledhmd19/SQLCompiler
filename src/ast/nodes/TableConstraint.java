package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for a table-level constraint in CREATE TABLE.
 */
public class TableConstraint extends ASTNode {

    public enum ConstraintType {
        PRIMARY_KEY, UNIQUE, FOREIGN_KEY
    }

    private String constraintName;
    private ConstraintType type;
    private boolean clustered = false;
    private List<Identifier> columns = new ArrayList<>();
    private Identifier referencedTable;
    private List<Identifier> referencedColumns = new ArrayList<>();

    public TableConstraint() {
        super();
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setType(ConstraintType type) {
        this.type = type;
    }

    public ConstraintType getType() {
        return type;
    }

    public void setClustered(boolean clustered) {
        this.clustered = clustered;
    }

    public boolean isClustered() {
        return clustered;
    }

    public void addColumn(Identifier column) {
        columns.add(column);
        addChild(column);
    }

    public List<Identifier> getColumns() {
        return columns;
    }

    public void setReferencedTable(Identifier referencedTable) {
        this.referencedTable = referencedTable;
    }

    public Identifier getReferencedTable() {
        return referencedTable;
    }

    public void addReferencedColumn(Identifier column) {
        referencedColumns.add(column);
    }

    public List<Identifier> getReferencedColumns() {
        return referencedColumns;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Handled through CreateTableStatement
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Constraint: ");
        if (constraintName != null) {
            sb.append(constraintName).append(" ");
        }
        sb.append(type.name());
        if (clustered) {
            sb.append(" CLUSTERED");
        }
        sb.append(" (").append(columns.size()).append(" columns)");
        return sb.toString();
    }
}
