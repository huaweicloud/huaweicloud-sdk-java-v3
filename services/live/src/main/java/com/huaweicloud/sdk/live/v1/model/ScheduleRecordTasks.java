package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScheduleRecordTasks
 */
public class ScheduleRecordTasks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    private Long stopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public ScheduleRecordTasks withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ScheduleRecordTasks withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名称
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ScheduleRecordTasks withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名称
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public ScheduleRecordTasks withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。EndTime - StartTime不能超过24小时。
     * minimum: 0
     * maximum: 9999999999999
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ScheduleRecordTasks withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 录制任务结束时间，Unix时间戳。设置时间必须大于StartTime及当前时间，且小于当前时间+7天。
     * minimum: 0
     * maximum: 9999999999999
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ScheduleRecordTasks withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 录制模板ID，对应模板必须存在否则会启动失败。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ScheduleRecordTasks withStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 任务停止时间，当前还在生效的任务此值为0，任务未被停止但是超过了end_time后此值为自动停止时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return stopTime
     */
    public Long getStopTime() {
        return stopTime;
    }

    public void setStopTime(Long stopTime) {
        this.stopTime = stopTime;
    }

    public ScheduleRecordTasks withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 录制任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleRecordTasks that = (ScheduleRecordTasks) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.app, that.app)
            && Objects.equals(this.stream, that.stream) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.stopTime, that.stopTime) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, app, stream, startTime, endTime, templateId, stopTime, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleRecordTasks {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
