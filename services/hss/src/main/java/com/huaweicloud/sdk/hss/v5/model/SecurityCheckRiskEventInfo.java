package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 风险事件信息
 */
public class SecurityCheckRiskEventInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_class_id")

    private String eventClassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_flag")

    private String attackFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_time")

    private Long attackTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public SecurityCheckRiskEventInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险级别 **取值范围**： - high：高危 - medium：中危 - low：低危 - safe：安全，无风险 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public SecurityCheckRiskEventInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * **参数解释**： 告警事件名称 **取值范围**： 不涉及 
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public SecurityCheckRiskEventInfo withEventClassId(String eventClassId) {
        this.eventClassId = eventClassId;
        return this;
    }

    /**
     * **参数解释**： 告警事件class，用于前台生成事件名称 **取值范围**： 不涉及 
     * @return eventClassId
     */
    public String getEventClassId() {
        return eventClassId;
    }

    public void setEventClassId(String eventClassId) {
        this.eventClassId = eventClassId;
    }

    public SecurityCheckRiskEventInfo withAttackFlag(String attackFlag) {
        this.attackFlag = attackFlag;
        return this;
    }

    /**
     * **参数解释**： 攻击标识 **取值范围**： 不涉及 
     * @return attackFlag
     */
    public String getAttackFlag() {
        return attackFlag;
    }

    public void setAttackFlag(String attackFlag) {
        this.attackFlag = attackFlag;
    }

    public SecurityCheckRiskEventInfo withAttackTime(Long attackTime) {
        this.attackTime = attackTime;
        return this;
    }

    /**
     * **参数解释**： 攻击时间 **取值范围**： 不涉及 
     * @return attackTime
     */
    public Long getAttackTime() {
        return attackTime;
    }

    public void setAttackTime(Long attackTime) {
        this.attackTime = attackTime;
    }

    public SecurityCheckRiskEventInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 处理状态 **取值范围**： - unhandled：未处理 - handled：已处理 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckRiskEventInfo that = (SecurityCheckRiskEventInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.eventClassId, that.eventClassId) && Objects.equals(this.attackFlag, that.attackFlag)
            && Objects.equals(this.attackTime, that.attackTime) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, eventName, eventClassId, attackFlag, attackTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckRiskEventInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventClassId: ").append(toIndentedString(eventClassId)).append("\n");
        sb.append("    attackFlag: ").append(toIndentedString(attackFlag)).append("\n");
        sb.append("    attackTime: ").append(toIndentedString(attackTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
