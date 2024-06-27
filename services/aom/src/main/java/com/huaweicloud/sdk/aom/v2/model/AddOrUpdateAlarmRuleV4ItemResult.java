package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddOrUpdateAlarmRuleV4ItemResult
 */
public class AddOrUpdateAlarmRuleV4ItemResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_name")

    private String alarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    public AddOrUpdateAlarmRuleV4ItemResult withAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }

    /**
     * 告警规则名称。
     * @return alarmRuleName
     */
    public String getAlarmRuleName() {
        return alarmRuleName;
    }

    public void setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
    }

    public AddOrUpdateAlarmRuleV4ItemResult withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 告警规则新增或修改结果。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddOrUpdateAlarmRuleV4ItemResult that = (AddOrUpdateAlarmRuleV4ItemResult) obj;
        return Objects.equals(this.alarmRuleName, that.alarmRuleName) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleName, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateAlarmRuleV4ItemResult {\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
