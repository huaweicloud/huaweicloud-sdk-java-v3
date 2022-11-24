package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSqlLimitRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_limit_rules")

    private List<SqlLimitRule> sqlLimitRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListSqlLimitRulesResponse withSqlLimitRules(List<SqlLimitRule> sqlLimitRules) {
        this.sqlLimitRules = sqlLimitRules;
        return this;
    }

    public ListSqlLimitRulesResponse addSqlLimitRulesItem(SqlLimitRule sqlLimitRulesItem) {
        if (this.sqlLimitRules == null) {
            this.sqlLimitRules = new ArrayList<>();
        }
        this.sqlLimitRules.add(sqlLimitRulesItem);
        return this;
    }

    public ListSqlLimitRulesResponse withSqlLimitRules(Consumer<List<SqlLimitRule>> sqlLimitRulesSetter) {
        if (this.sqlLimitRules == null) {
            this.sqlLimitRules = new ArrayList<>();
        }
        sqlLimitRulesSetter.accept(this.sqlLimitRules);
        return this;
    }

    /**
     * SQL限流规则列表
     * @return sqlLimitRules
     */
    public List<SqlLimitRule> getSqlLimitRules() {
        return sqlLimitRules;
    }

    public void setSqlLimitRules(List<SqlLimitRule> sqlLimitRules) {
        this.sqlLimitRules = sqlLimitRules;
    }

    public ListSqlLimitRulesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * SQL限流规则总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSqlLimitRulesResponse listSqlLimitRulesResponse = (ListSqlLimitRulesResponse) o;
        return Objects.equals(this.sqlLimitRules, listSqlLimitRulesResponse.sqlLimitRules)
            && Objects.equals(this.totalCount, listSqlLimitRulesResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlLimitRules, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlLimitRulesResponse {\n");
        sb.append("    sqlLimitRules: ").append(toIndentedString(sqlLimitRules)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
