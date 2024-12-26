package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateAttackLogAlarmConfigDto
 */
public class UpdateAttackLogAlarmConfigDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_time_period")

    private Integer alarmTimePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private Integer alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_status")

    private Integer enableStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_count")

    private Integer frequencyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_time")

    private Integer frequencyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    public UpdateAttackLogAlarmConfigDto withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 账号名称
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public UpdateAttackLogAlarmConfigDto withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警id
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public UpdateAttackLogAlarmConfigDto withAlarmTimePeriod(Integer alarmTimePeriod) {
        this.alarmTimePeriod = alarmTimePeriod;
        return this;
    }

    /**
     * 告警周期，0：全天，1：8时到22时
     * @return alarmTimePeriod
     */
    public Integer getAlarmTimePeriod() {
        return alarmTimePeriod;
    }

    public void setAlarmTimePeriod(Integer alarmTimePeriod) {
        this.alarmTimePeriod = alarmTimePeriod;
    }

    public UpdateAttackLogAlarmConfigDto withAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * 告警类型 0:攻击告警; 1:流量超额预警; 2:EIP未防护告警; 3:威胁情报告警
     * @return alarmType
     */
    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public UpdateAttackLogAlarmConfigDto withEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    /**
     * 告警状态 0:失效; 1:生效
     * @return enableStatus
     */
    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public UpdateAttackLogAlarmConfigDto withFrequencyCount(Integer frequencyCount) {
        this.frequencyCount = frequencyCount;
        return this;
    }

    /**
     * 告警触发频次
     * @return frequencyCount
     */
    public Integer getFrequencyCount() {
        return frequencyCount;
    }

    public void setFrequencyCount(Integer frequencyCount) {
        this.frequencyCount = frequencyCount;
    }

    public UpdateAttackLogAlarmConfigDto withFrequencyTime(Integer frequencyTime) {
        this.frequencyTime = frequencyTime;
        return this;
    }

    /**
     * 告警频次时间范围
     * @return frequencyTime
     */
    public Integer getFrequencyTime() {
        return frequencyTime;
    }

    public void setFrequencyTime(Integer frequencyTime) {
        this.frequencyTime = frequencyTime;
    }

    public UpdateAttackLogAlarmConfigDto withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 告警语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public UpdateAttackLogAlarmConfigDto withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 告警等级
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public UpdateAttackLogAlarmConfigDto withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 告警urn
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateAttackLogAlarmConfigDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名称
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAttackLogAlarmConfigDto that = (UpdateAttackLogAlarmConfigDto) obj;
        return Objects.equals(this.accountName, that.accountName) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.alarmTimePeriod, that.alarmTimePeriod)
            && Objects.equals(this.alarmType, that.alarmType) && Objects.equals(this.enableStatus, that.enableStatus)
            && Objects.equals(this.frequencyCount, that.frequencyCount)
            && Objects.equals(this.frequencyTime, that.frequencyTime) && Objects.equals(this.language, that.language)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName,
            alarmId,
            alarmTimePeriod,
            alarmType,
            enableStatus,
            frequencyCount,
            frequencyTime,
            language,
            severity,
            topicUrn,
            username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAttackLogAlarmConfigDto {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmTimePeriod: ").append(toIndentedString(alarmTimePeriod)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    enableStatus: ").append(toIndentedString(enableStatus)).append("\n");
        sb.append("    frequencyCount: ").append(toIndentedString(frequencyCount)).append("\n");
        sb.append("    frequencyTime: ").append(toIndentedString(frequencyTime)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
