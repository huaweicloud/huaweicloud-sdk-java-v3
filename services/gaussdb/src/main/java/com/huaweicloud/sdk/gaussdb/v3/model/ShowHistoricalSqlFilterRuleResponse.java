package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowHistoricalSqlFilterRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_filter_rules")

    private List<HistoricalSqlFilterRule> sqlFilterRules = null;

    public ShowHistoricalSqlFilterRuleResponse withSqlFilterRules(List<HistoricalSqlFilterRule> sqlFilterRules) {
        this.sqlFilterRules = sqlFilterRules;
        return this;
    }

    public ShowHistoricalSqlFilterRuleResponse addSqlFilterRulesItem(HistoricalSqlFilterRule sqlFilterRulesItem) {
        if (this.sqlFilterRules == null) {
            this.sqlFilterRules = new ArrayList<>();
        }
        this.sqlFilterRules.add(sqlFilterRulesItem);
        return this;
    }

    public ShowHistoricalSqlFilterRuleResponse withSqlFilterRules(
        Consumer<List<HistoricalSqlFilterRule>> sqlFilterRulesSetter) {
        if (this.sqlFilterRules == null) {
            this.sqlFilterRules = new ArrayList<>();
        }
        sqlFilterRulesSetter.accept(this.sqlFilterRules);
        return this;
    }

    /**
     * **参数解释**：  历史SQL限流规则。
     * @return sqlFilterRules
     */
    public List<HistoricalSqlFilterRule> getSqlFilterRules() {
        return sqlFilterRules;
    }

    public void setSqlFilterRules(List<HistoricalSqlFilterRule> sqlFilterRules) {
        this.sqlFilterRules = sqlFilterRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHistoricalSqlFilterRuleResponse that = (ShowHistoricalSqlFilterRuleResponse) obj;
        return Objects.equals(this.sqlFilterRules, that.sqlFilterRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlFilterRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoricalSqlFilterRuleResponse {\n");
        sb.append("    sqlFilterRules: ").append(toIndentedString(sqlFilterRules)).append("\n");
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
