package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteAlarmRuleV4RequestBody
 */
public class DeleteAlarmRuleV4RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rules")

    private List<String> alarmRules = null;

    public DeleteAlarmRuleV4RequestBody withAlarmRules(List<String> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }

    public DeleteAlarmRuleV4RequestBody addAlarmRulesItem(String alarmRulesItem) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        this.alarmRules.add(alarmRulesItem);
        return this;
    }

    public DeleteAlarmRuleV4RequestBody withAlarmRules(Consumer<List<String>> alarmRulesSetter) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        alarmRulesSetter.accept(this.alarmRules);
        return this;
    }

    /**
     * 告警规则名称列表。
     * @return alarmRules
     */
    public List<String> getAlarmRules() {
        return alarmRules;
    }

    public void setAlarmRules(List<String> alarmRules) {
        this.alarmRules = alarmRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAlarmRuleV4RequestBody that = (DeleteAlarmRuleV4RequestBody) obj;
        return Objects.equals(this.alarmRules, that.alarmRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlarmRuleV4RequestBody {\n");
        sb.append("    alarmRules: ").append(toIndentedString(alarmRules)).append("\n");
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
