package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSqlAlarmRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule")

    private List<SqlAlarmRuleRespList> sqlAlarmRule = null;

    public ListSqlAlarmRulesResponse withSqlAlarmRule(List<SqlAlarmRuleRespList> sqlAlarmRule) {
        this.sqlAlarmRule = sqlAlarmRule;
        return this;
    }

    public ListSqlAlarmRulesResponse addSqlAlarmRuleItem(SqlAlarmRuleRespList sqlAlarmRuleItem) {
        if (this.sqlAlarmRule == null) {
            this.sqlAlarmRule = new ArrayList<>();
        }
        this.sqlAlarmRule.add(sqlAlarmRuleItem);
        return this;
    }

    public ListSqlAlarmRulesResponse withSqlAlarmRule(Consumer<List<SqlAlarmRuleRespList>> sqlAlarmRuleSetter) {
        if (this.sqlAlarmRule == null) {
            this.sqlAlarmRule = new ArrayList<>();
        }
        sqlAlarmRuleSetter.accept(this.sqlAlarmRule);
        return this;
    }

    /** SQL告警
     * 
     * @return sqlAlarmRule */
    public List<SqlAlarmRuleRespList> getSqlAlarmRule() {
        return sqlAlarmRule;
    }

    public void setSqlAlarmRule(List<SqlAlarmRuleRespList> sqlAlarmRule) {
        this.sqlAlarmRule = sqlAlarmRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSqlAlarmRulesResponse listSqlAlarmRulesResponse = (ListSqlAlarmRulesResponse) o;
        return Objects.equals(this.sqlAlarmRule, listSqlAlarmRulesResponse.sqlAlarmRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlAlarmRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlAlarmRulesResponse {\n");
        sb.append("    sqlAlarmRule: ").append(toIndentedString(sqlAlarmRule)).append("\n");
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
