package ast.nodes;

import ast.ASTNode;
import ast.ASTVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * AST node for SELECT statement.
 */
public class SelectStatement extends ASTNode {

    private boolean distinct = false;
    private Integer topCount = null;
    private boolean topPercent = false;
    private List<ASTNode> selectItems = new ArrayList<>();
    private FromClause fromClause;
    private List<JoinClause> joinClauses = new ArrayList<>();
    private WhereClause whereClause;
    private GroupByClause groupByClause;
    private HavingClause havingClause;
    private OrderByClause orderByClause;

    public SelectStatement() {
        super();
    }

    // Getters and setters
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setTopCount(Integer topCount) {
        this.topCount = topCount;
    }

    public void setTopPercent(boolean topPercent) {
        this.topPercent = topPercent;
    }

    public void addSelectItem(ASTNode item) {
        selectItems.add(item);
        addChild(item);
    }

    public List<ASTNode> getSelectItems() {
        return selectItems;
    }

    public void setFromClause(FromClause fromClause) {
        this.fromClause = fromClause;
        addChild(fromClause);
    }

    public FromClause getFromClause() {
        return fromClause;
    }

    public void addJoinClause(JoinClause joinClause) {
        joinClauses.add(joinClause);
        addChild(joinClause);
    }

    public List<JoinClause> getJoinClauses() {
        return joinClauses;
    }

    public void setWhereClause(WhereClause whereClause) {
        this.whereClause = whereClause;
        addChild(whereClause);
    }

    public WhereClause getWhereClause() {
        return whereClause;
    }

    public void setGroupByClause(GroupByClause groupByClause) {
        this.groupByClause = groupByClause;
        addChild(groupByClause);
    }

    public void setHavingClause(HavingClause havingClause) {
        this.havingClause = havingClause;
        addChild(havingClause);
    }

    public void setOrderByClause(OrderByClause orderByClause) {
        this.orderByClause = orderByClause;
        addChild(orderByClause);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SELECT");
        if (distinct) sb.append(" DISTINCT");
        if (topCount != null) {
            sb.append(" TOP ").append(topCount);
            if (topPercent) sb.append(" PERCENT");
        }
        return sb.toString();
    }
}
