package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * AST node for an identifier (table name, column name, etc.).
 * Can be qualified (schema.table or table.column).
 */
public class Identifier extends ASTNode {

    private List<String> parts = new ArrayList<>();

    public Identifier() {
        super();
    }

    public Identifier(String name) {
        super();
        parts.add(name);
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public List<String> getParts() {
        return parts;
    }

    public String getName() {
        return String.join(".", parts);
    }

    public String getSimpleName() {
        return parts.isEmpty() ? "" : parts.get(parts.size() - 1);
    }

    public boolean isQualified() {
        return parts.size() > 1;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Identifier: " + getName();
    }
}
