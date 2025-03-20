package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警工单执行结果
 */
public class AlarmHandleHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_id")

    private String workOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_name")

    private String createName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_alias")

    private String createAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public AlarmHandleHistory withWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }

    /**
     * 执行工单id
     * @return workOrderId
     */
    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public AlarmHandleHistory withCreateName(String createName) {
        this.createName = createName;
        return this;
    }

    /**
     * 创建人名
     * @return createName
     */
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public AlarmHandleHistory withCreateAlias(String createAlias) {
        this.createAlias = createAlias;
        return this;
    }

    /**
     * 创建人名
     * @return createAlias
     */
    public String getCreateAlias() {
        return createAlias;
    }

    public void setCreateAlias(String createAlias) {
        this.createAlias = createAlias;
    }

    public AlarmHandleHistory withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public AlarmHandleHistory withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public AlarmHandleHistory withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public AlarmHandleHistory withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 总耗时
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public AlarmHandleHistory withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
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
        AlarmHandleHistory that = (AlarmHandleHistory) obj;
        return Objects.equals(this.workOrderId, that.workOrderId) && Objects.equals(this.createName, that.createName)
            && Objects.equals(this.createAlias, that.createAlias) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workOrderId, createName, createAlias, taskType, startTime, endTime, duration, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmHandleHistory {\n");
        sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
        sb.append("    createName: ").append(toIndentedString(createName)).append("\n");
        sb.append("    createAlias: ").append(toIndentedString(createAlias)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
