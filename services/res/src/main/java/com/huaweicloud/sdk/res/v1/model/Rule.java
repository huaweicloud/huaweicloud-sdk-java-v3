package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class Rule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ratio")

    private Integer ruleRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public Rule withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /** 候选集表名。
     * 
     * @return tableName */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Rule withRuleRatio(Integer ruleRatio) {
        this.ruleRatio = ruleRatio;
        return this;
    }

    /** 规则占比。 minimum: 1 maximum: 100
     * 
     * @return ruleRatio */
    public Integer getRuleRatio() {
        return ruleRatio;
    }

    public void setRuleRatio(Integer ruleRatio) {
        this.ruleRatio = ruleRatio;
    }

    public Rule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /** 优先级。 minimum: 1 maximum: 10
     * 
     * @return priority */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rule rule = (Rule) o;
        return Objects.equals(this.tableName, rule.tableName) && Objects.equals(this.ruleRatio, rule.ruleRatio)
            && Objects.equals(this.priority, rule.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, ruleRatio, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rule {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    ruleRatio: ").append(toIndentedString(ruleRatio)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
