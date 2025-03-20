package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 定时运维历史记录
 */
public class ScheduledTaskHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name")

    private String associatedTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name_en")

    private String associatedTaskNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_time")

    private Long startedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_time")

    private Long finishedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_msg")

    private String executionMsg;

    public ScheduledTaskHistory withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 历史记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduledTaskHistory withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 引用任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ScheduledTaskHistory withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 执行ID
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public ScheduledTaskHistory withAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
        return this;
    }

    /**
     * 引用任务名称
     * @return associatedTaskName
     */
    public String getAssociatedTaskName() {
        return associatedTaskName;
    }

    public void setAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
    }

    public ScheduledTaskHistory withAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
        return this;
    }

    /**
     * 引用任务名称(英文)
     * @return associatedTaskNameEn
     */
    public String getAssociatedTaskNameEn() {
        return associatedTaskNameEn;
    }

    public void setAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
    }

    public ScheduledTaskHistory withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ScheduledTaskHistory withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ScheduledTaskHistory withStartedTime(Long startedTime) {
        this.startedTime = startedTime;
        return this;
    }

    /**
     * 开始时间时间戳
     * @return startedTime
     */
    public Long getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(Long startedTime) {
        this.startedTime = startedTime;
    }

    public ScheduledTaskHistory withFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    /**
     * 结束时间时间戳
     * @return finishedTime
     */
    public Long getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
    }

    public ScheduledTaskHistory withStatus(String status) {
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

    public ScheduledTaskHistory withExecutionMsg(String executionMsg) {
        this.executionMsg = executionMsg;
        return this;
    }

    /**
     * 执行结果描述
     * @return executionMsg
     */
    public String getExecutionMsg() {
        return executionMsg;
    }

    public void setExecutionMsg(String executionMsg) {
        this.executionMsg = executionMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTaskHistory that = (ScheduledTaskHistory) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.associatedTaskName, that.associatedTaskName)
            && Objects.equals(this.associatedTaskNameEn, that.associatedTaskNameEn)
            && Objects.equals(this.region, that.region) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.startedTime, that.startedTime)
            && Objects.equals(this.finishedTime, that.finishedTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.executionMsg, that.executionMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskType,
            executionId,
            associatedTaskName,
            associatedTaskNameEn,
            region,
            createdBy,
            startedTime,
            finishedTime,
            status,
            executionMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTaskHistory {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    associatedTaskName: ").append(toIndentedString(associatedTaskName)).append("\n");
        sb.append("    associatedTaskNameEn: ").append(toIndentedString(associatedTaskNameEn)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    startedTime: ").append(toIndentedString(startedTime)).append("\n");
        sb.append("    finishedTime: ").append(toIndentedString(finishedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    executionMsg: ").append(toIndentedString(executionMsg)).append("\n");
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
