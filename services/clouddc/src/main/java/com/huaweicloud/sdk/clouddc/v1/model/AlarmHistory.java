package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmHistory
 */
public class AlarmHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_record_id")

    private String alarmRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_name")

    private String alarmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_status")

    private String alarmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_alarm_time")

    private Long lastAlarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private Metric metric;

    public AlarmHistory withAlarmRecordId(String alarmRecordId) {
        this.alarmRecordId = alarmRecordId;
        return this;
    }

    /**
     * 告警记录ID
     * @return alarmRecordId
     */
    public String getAlarmRecordId() {
        return alarmRecordId;
    }

    public void setAlarmRecordId(String alarmRecordId) {
        this.alarmRecordId = alarmRecordId;
    }

    public AlarmHistory withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警ID
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public AlarmHistory withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * 告警名称
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public AlarmHistory withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * 告警状态
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public AlarmHistory withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmHistory withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 告警开始时间，Unix时间戳
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public AlarmHistory withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 告警结束时间，Unix时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public AlarmHistory withLastAlarmTime(Long lastAlarmTime) {
        this.lastAlarmTime = lastAlarmTime;
        return this;
    }

    /**
     * 最后一次告警时间，Unix时间戳
     * @return lastAlarmTime
     */
    public Long getLastAlarmTime() {
        return lastAlarmTime;
    }

    public void setLastAlarmTime(Long lastAlarmTime) {
        this.lastAlarmTime = lastAlarmTime;
    }

    public AlarmHistory withMetric(Metric metric) {
        this.metric = metric;
        return this;
    }

    public AlarmHistory withMetric(Consumer<Metric> metricSetter) {
        if (this.metric == null) {
            this.metric = new Metric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmHistory that = (AlarmHistory) obj;
        return Objects.equals(this.alarmRecordId, that.alarmRecordId) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.alarmName, that.alarmName) && Objects.equals(this.alarmStatus, that.alarmStatus)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.lastAlarmTime, that.lastAlarmTime)
            && Objects.equals(this.metric, that.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRecordId,
            alarmId,
            alarmName,
            alarmStatus,
            alarmLevel,
            beginTime,
            endTime,
            lastAlarmTime,
            metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmHistory {\n");
        sb.append("    alarmRecordId: ").append(toIndentedString(alarmRecordId)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastAlarmTime: ").append(toIndentedString(lastAlarmTime)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
