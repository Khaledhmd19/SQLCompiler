package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;

/**
 * AST node for a literal value (number, string, boolean, null).
 */
public class Literal extends ASTNode {

    public enum LiteralType {
        INTEGER, DECIMAL, FLOAT, STRING, BOOLEAN, NULL, HEX_STRING, BIT_STRING
    }

    private LiteralType type;
    private String value;

    public Literal() {
        super();
    }

    public Literal(LiteralType type, String value) {
        super();
        this.type = type;
        this.value = value;
    }

    public void setType(LiteralType type) {
        this.type = type;
    }

    public LiteralType getType() {
        return type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        if (type == LiteralType.NULL) {
            return "Literal: NULL";
        }
        return "Literal: " + type.name() + " = " + value;
    }
}
