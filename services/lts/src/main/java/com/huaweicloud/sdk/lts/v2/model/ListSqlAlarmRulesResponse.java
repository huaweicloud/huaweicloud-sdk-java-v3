package com.huaweicloud.sdk.lts.v2.model;

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
public class ListSqlAlarmRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rules")

    private List<SqlAlarmRuleRespList> sqlAlarmRules = null;

    public ListSqlAlarmRulesResponse withSqlAlarmRules(List<SqlAlarmRuleRespList> sqlAlarmRules) {
        this.sqlAlarmRules = sqlAlarmRules;
        return this;
    }

    public ListSqlAlarmRulesResponse addSqlAlarmRulesItem(SqlAlarmRuleRespList sqlAlarmRulesItem) {
        if (this.sqlAlarmRules == null) {
            this.sqlAlarmRules = new ArrayList<>();
        }
        this.sqlAlarmRules.add(sqlAlarmRulesItem);
        return this;
    }

    public ListSqlAlarmRulesResponse withSqlAlarmRules(Consumer<List<SqlAlarmRuleRespList>> sqlAlarmRulesSetter) {
        if (this.sqlAlarmRules == null) {
            this.sqlAlarmRules = new ArrayList<>();
        }
        sqlAlarmRulesSetter.accept(this.sqlAlarmRules);
        return this;
    }

    /**
     * SQL告警
     * @return sqlAlarmRules
     */
    public List<SqlAlarmRuleRespList> getSqlAlarmRules() {
        return sqlAlarmRules;
    }

    public void setSqlAlarmRules(List<SqlAlarmRuleRespList> sqlAlarmRules) {
        this.sqlAlarmRules = sqlAlarmRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlAlarmRulesResponse that = (ListSqlAlarmRulesResponse) obj;
        return Objects.equals(this.sqlAlarmRules, that.sqlAlarmRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlAlarmRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlAlarmRulesResponse {\n");
        sb.append("    sqlAlarmRules: ").append(toIndentedString(sqlAlarmRules)).append("\n");
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
