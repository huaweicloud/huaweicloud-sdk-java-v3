package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmLogResponseAlarmLog
 */
public class AlarmLogResponseAlarmLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmLife")

    private String alarmLife;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendEmail")

    private Boolean sendEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_time")

    private String alarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private String alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_fix_time")

    private String alarmFixTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_status")

    private String alarmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_risk")

    private String alarmRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_description")

    private String alarmDescription;

    public AlarmLogResponseAlarmLog withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 告警ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlarmLogResponseAlarmLog withAlarmLife(String alarmLife) {
        this.alarmLife = alarmLife;
        return this;
    }

    /**
     * 告警状态 - ON - OFF
     * @return alarmLife
     */
    public String getAlarmLife() {
        return alarmLife;
    }

    public void setAlarmLife(String alarmLife) {
        this.alarmLife = alarmLife;
    }

    public AlarmLogResponseAlarmLog withSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * 是否发送邮件
     * @return sendEmail
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public AlarmLogResponseAlarmLog withAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }

    /**
     * 告警发生时间
     * @return alarmTime
     */
    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    public AlarmLogResponseAlarmLog withAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * 告警类型 - RISK_RULE: 风险规则 - RISK_CPU: CPU超限 - RISK_MEMORY: 内存超限 - RISK_DISK: 磁盘超限 - RISK_DISK_CAPACITY: 磁盘容量不足六个月 - RISK_BACKUP: 备份失败 - AUDIT_QPS_OVERFLOW: 流量超限入库延迟告警 - RISK_AGENT: Agent异常 - AUDIT_BACKUP_FAILED: 实例备份失败(运维侧)
     * @return alarmType
     */
    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public AlarmLogResponseAlarmLog withAlarmFixTime(String alarmFixTime) {
        this.alarmFixTime = alarmFixTime;
        return this;
    }

    /**
     * 告警恢复时间
     * @return alarmFixTime
     */
    public String getAlarmFixTime() {
        return alarmFixTime;
    }

    public void setAlarmFixTime(String alarmFixTime) {
        this.alarmFixTime = alarmFixTime;
    }

    public AlarmLogResponseAlarmLog withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * 告警确认状态 - DONE: 已确认 - UNDO: 未确认
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public AlarmLogResponseAlarmLog withAlarmRisk(String alarmRisk) {
        this.alarmRisk = alarmRisk;
        return this;
    }

    /**
     * 告警风险等级 - LOW：低 - MEDIUM：中 - HIGH：高
     * @return alarmRisk
     */
    public String getAlarmRisk() {
        return alarmRisk;
    }

    public void setAlarmRisk(String alarmRisk) {
        this.alarmRisk = alarmRisk;
    }

    public AlarmLogResponseAlarmLog withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * 告警描述信息
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmLogResponseAlarmLog that = (AlarmLogResponseAlarmLog) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.alarmLife, that.alarmLife)
            && Objects.equals(this.sendEmail, that.sendEmail) && Objects.equals(this.alarmTime, that.alarmTime)
            && Objects.equals(this.alarmType, that.alarmType) && Objects.equals(this.alarmFixTime, that.alarmFixTime)
            && Objects.equals(this.alarmStatus, that.alarmStatus) && Objects.equals(this.alarmRisk, that.alarmRisk)
            && Objects.equals(this.alarmDescription, that.alarmDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            alarmLife,
            sendEmail,
            alarmTime,
            alarmType,
            alarmFixTime,
            alarmStatus,
            alarmRisk,
            alarmDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmLogResponseAlarmLog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    alarmLife: ").append(toIndentedString(alarmLife)).append("\n");
        sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
        sb.append("    alarmTime: ").append(toIndentedString(alarmTime)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    alarmFixTime: ").append(toIndentedString(alarmFixTime)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    alarmRisk: ").append(toIndentedString(alarmRisk)).append("\n");
        sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
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
