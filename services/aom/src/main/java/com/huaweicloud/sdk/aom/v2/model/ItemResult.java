package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ItemResult
 */
public class ItemResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_name")

    private String alarmRuleName;

    public ItemResult withAlarmRuleName(String alarmRuleName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemResult that = (ItemResult) obj;
        return Objects.equals(this.alarmRuleName, that.alarmRuleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemResult {\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
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
