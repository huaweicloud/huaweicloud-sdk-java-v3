package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文档分段任务信息。
 */
public class DocumentTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_process")

    private String taskProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result")

    private String taskResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public DocumentTaskInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public DocumentTaskInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public DocumentTaskInfo withTaskProcess(String taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }

    /**
     * 任务进度
     * @return taskProcess
     */
    public String getTaskProcess() {
        return taskProcess;
    }

    public void setTaskProcess(String taskProcess) {
        this.taskProcess = taskProcess;
    }

    public DocumentTaskInfo withTaskResult(String taskResult) {
        this.taskResult = taskResult;
        return this;
    }

    /**
     * 任务结果
     * @return taskResult
     */
    public String getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(String taskResult) {
        this.taskResult = taskResult;
    }

    public DocumentTaskInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public DocumentTaskInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DocumentTaskInfo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务开始时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public DocumentTaskInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DocumentTaskInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 任务更新时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentTaskInfo that = (DocumentTaskInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.taskProcess, that.taskProcess) && Objects.equals(this.taskResult, that.taskResult)
            && Objects.equals(this.failReason, that.failReason) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskId, taskStatus, taskProcess, taskResult, failReason, createTime, beginTime, endTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentTaskInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskProcess: ").append(toIndentedString(taskProcess)).append("\n");
        sb.append("    taskResult: ").append(toIndentedString(taskResult)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
