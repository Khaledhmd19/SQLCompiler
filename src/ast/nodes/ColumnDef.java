package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for a column definition in CREATE TABLE.
 */
public class ColumnDef extends ASTNode {

    private Identifier columnName;
    private String dataType;
    private Integer precision;
    private Integer scale;
    private boolean identity = false;
    private List<String> constraints = new ArrayList<>();

    public ColumnDef() {
        super();
    }

    public void setColumnName(Identifier columnName) {
        this.columnName = columnName;
        addChild(columnName);
    }

    public Identifier getColumnName() {
        return columnName;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getScale() {
        return scale;
    }

    public void setIdentity(boolean identity) {
        this.identity = identity;
    }

    public boolean isIdentity() {
        return identity;
    }

    public void addConstraint(String constraint) {
        constraints.add(constraint);
    }

    public List<String> getConstraints() {
        return constraints;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Column: ");
        if (columnName != null) {
            sb.append(columnName.getName());
        }
        sb.append(" ").append(dataType);
        if (precision != null) {
            sb.append("(").append(precision);
            if (scale != null) {
                sb.append(",").append(scale);
            }
            sb.append(")");
        }
        if (identity) {
            sb.append(" IDENTITY");
        }
        if (!constraints.isEmpty()) {
            sb.append(" [").append(String.join(", ", constraints)).append("]");
        }
        return sb.toString();
    }
}
