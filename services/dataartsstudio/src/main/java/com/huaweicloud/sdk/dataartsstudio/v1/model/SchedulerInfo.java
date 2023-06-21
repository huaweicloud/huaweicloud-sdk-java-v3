package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SchedulerInfo
 */
public class SchedulerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron_expression")

    private String cronExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_time_out")

    private Integer maxTimeOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private String interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private String scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Integer jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Integer enabled;

    public SchedulerInfo withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * 表达式
     * @return cronExpression
     */
    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public SchedulerInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SchedulerInfo withMaxTimeOut(Integer maxTimeOut) {
        this.maxTimeOut = maxTimeOut;
        return this;
    }

    /**
     * 最大超时时间
     * @return maxTimeOut
     */
    public Integer getMaxTimeOut() {
        return maxTimeOut;
    }

    public void setMaxTimeOut(Integer maxTimeOut) {
        this.maxTimeOut = maxTimeOut;
    }

    public SchedulerInfo withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 间隔
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public SchedulerInfo withScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * 调度类型
     * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public SchedulerInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SchedulerInfo withJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 工作id
     * @return jobId
     */
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public SchedulerInfo withEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 启用
     * @return enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchedulerInfo schedulerInfo = (SchedulerInfo) o;
        return Objects.equals(this.cronExpression, schedulerInfo.cronExpression)
            && Objects.equals(this.endTime, schedulerInfo.endTime)
            && Objects.equals(this.maxTimeOut, schedulerInfo.maxTimeOut)
            && Objects.equals(this.interval, schedulerInfo.interval)
            && Objects.equals(this.scheduleType, schedulerInfo.scheduleType)
            && Objects.equals(this.startTime, schedulerInfo.startTime)
            && Objects.equals(this.jobId, schedulerInfo.jobId) && Objects.equals(this.enabled, schedulerInfo.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cronExpression, endTime, maxTimeOut, interval, scheduleType, startTime, jobId, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulerInfo {\n");
        sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    maxTimeOut: ").append(toIndentedString(maxTimeOut)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
