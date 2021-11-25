package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 改变告警规则状态 */
public class ChangeAlarmRuleStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_id")

    private String alarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ChangeAlarmRuleStatus withAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    /** 告警规则ID
     * 
     * @return alarmRuleId */
    public String getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public ChangeAlarmRuleStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 状态（RUNNING/STOPPING）
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ChangeAlarmRuleStatus withType(String type) {
        this.type = type;
        return this;
    }

    /** 类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeAlarmRuleStatus changeAlarmRuleStatus = (ChangeAlarmRuleStatus) o;
        return Objects.equals(this.alarmRuleId, changeAlarmRuleStatus.alarmRuleId)
            && Objects.equals(this.status, changeAlarmRuleStatus.status)
            && Objects.equals(this.type, changeAlarmRuleStatus.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleId, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAlarmRuleStatus {\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
