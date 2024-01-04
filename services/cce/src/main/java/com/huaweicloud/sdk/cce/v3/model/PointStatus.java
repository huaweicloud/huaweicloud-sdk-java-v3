package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PointStatus
 */
public class PointStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskType")

    private TaskType taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskID")

    private String taskID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private UpgradeWorkflowTaskStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTimeStamp")

    private String startTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTimeStamp")

    private String endTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTimeStamp")

    private String expireTimeStamp;

    public PointStatus withTaskType(TaskType taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get taskType
     * @return taskType
     */
    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public PointStatus withTaskID(String taskID) {
        this.taskID = taskID;
        return this;
    }

    /**
     * 升级任务项ID
     * @return taskID
     */
    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public PointStatus withStatus(UpgradeWorkflowTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public UpgradeWorkflowTaskStatus getStatus() {
        return status;
    }

    public void setStatus(UpgradeWorkflowTaskStatus status) {
        this.status = status;
    }

    public PointStatus withStartTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }

    /**
     * 升级任务开始时间
     * @return startTimeStamp
     */
    public String getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public PointStatus withEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }

    /**
     * 升级任务结束时间
     * @return endTimeStamp
     */
    public String getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public PointStatus withExpireTimeStamp(String expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
        return this;
    }

    /**
     * 升级任务过期时间（当前仅升级前检查任务适用）
     * @return expireTimeStamp
     */
    public String getExpireTimeStamp() {
        return expireTimeStamp;
    }

    public void setExpireTimeStamp(String expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PointStatus that = (PointStatus) obj;
        return Objects.equals(this.taskType, that.taskType) && Objects.equals(this.taskID, that.taskID)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTimeStamp, that.startTimeStamp)
            && Objects.equals(this.endTimeStamp, that.endTimeStamp)
            && Objects.equals(this.expireTimeStamp, that.expireTimeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType, taskID, status, startTimeStamp, endTimeStamp, expireTimeStamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointStatus {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTimeStamp: ").append(toIndentedString(startTimeStamp)).append("\n");
        sb.append("    endTimeStamp: ").append(toIndentedString(endTimeStamp)).append("\n");
        sb.append("    expireTimeStamp: ").append(toIndentedString(expireTimeStamp)).append("\n");
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
