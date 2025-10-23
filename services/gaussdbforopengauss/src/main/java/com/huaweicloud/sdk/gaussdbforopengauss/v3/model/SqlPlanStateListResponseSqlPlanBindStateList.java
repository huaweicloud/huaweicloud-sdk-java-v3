package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SqlPlanStateListResponseSqlPlanBindStateList
 */
public class SqlPlanStateListResponseSqlPlanBindStateList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outline")

    private String outline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost")

    private String cost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_hash")

    private String sqlHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    public SqlPlanStateListResponseSqlPlanBindStateList withOutline(String outline) {
        this.outline = outline;
        return this;
    }

    /**
     * **参数解释**: 当前计划的概览。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return outline
     */
    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public SqlPlanStateListResponseSqlPlanBindStateList withCost(String cost) {
        this.cost = cost;
        return this;
    }

    /**
     * **参数解释**: SQL执行计划的开销。 **取值范围**: 不涉及。
     * @return cost
     */
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public SqlPlanStateListResponseSqlPlanBindStateList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 绑定状态。 **取值范围**: - bind：绑定。 - drop：解绑。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SqlPlanStateListResponseSqlPlanBindStateList withSqlHash(String sqlHash) {
        this.sqlHash = sqlHash;
        return this;
    }

    /**
     * **参数解释**: SQL文本的哈希值。 **取值范围**: 不涉及。
     * @return sqlHash
     */
    public String getSqlHash() {
        return sqlHash;
    }

    public void setSqlHash(String sqlHash) {
        this.sqlHash = sqlHash;
    }

    public SqlPlanStateListResponseSqlPlanBindStateList withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * **参数解释**: SQL执行计划ID。 **取值范围**: 不涉及。
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlPlanStateListResponseSqlPlanBindStateList that = (SqlPlanStateListResponseSqlPlanBindStateList) obj;
        return Objects.equals(this.outline, that.outline) && Objects.equals(this.cost, that.cost)
            && Objects.equals(this.status, that.status) && Objects.equals(this.sqlHash, that.sqlHash)
            && Objects.equals(this.planId, that.planId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outline, cost, status, sqlHash, planId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlPlanStateListResponseSqlPlanBindStateList {\n");
        sb.append("    outline: ").append(toIndentedString(outline)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sqlHash: ").append(toIndentedString(sqlHash)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
