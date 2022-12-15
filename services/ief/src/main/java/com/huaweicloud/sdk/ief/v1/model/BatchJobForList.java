package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 批量处理作业详情
 */
public class BatchJobForList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Integer createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_total_count")

    private Integer taskTotalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_success_count")

    private Integer taskSuccessCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_failed_count")

    private Integer taskFailedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_last_updated_at")

    private Integer statusLastUpdatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public BatchJobForList withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 批量处理作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public BatchJobForList withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 批量处理作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public BatchJobForList withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 批量处理作业类型，支持以下选项： - node_upgrade： 节点升级 - deployment_deploy：应用部署 - deployment_upgrade：应用升级
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public BatchJobForList withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间戳
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public BatchJobForList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchJobForList withTaskTotalCount(Integer taskTotalCount) {
        this.taskTotalCount = taskTotalCount;
        return this;
    }

    /**
     * 任务总数
     * @return taskTotalCount
     */
    public Integer getTaskTotalCount() {
        return taskTotalCount;
    }

    public void setTaskTotalCount(Integer taskTotalCount) {
        this.taskTotalCount = taskTotalCount;
    }

    public BatchJobForList withTaskSuccessCount(Integer taskSuccessCount) {
        this.taskSuccessCount = taskSuccessCount;
        return this;
    }

    /**
     * 任务项执行成功数
     * @return taskSuccessCount
     */
    public Integer getTaskSuccessCount() {
        return taskSuccessCount;
    }

    public void setTaskSuccessCount(Integer taskSuccessCount) {
        this.taskSuccessCount = taskSuccessCount;
    }

    public BatchJobForList withTaskFailedCount(Integer taskFailedCount) {
        this.taskFailedCount = taskFailedCount;
        return this;
    }

    /**
     * 任务项执行失败数
     * @return taskFailedCount
     */
    public Integer getTaskFailedCount() {
        return taskFailedCount;
    }

    public void setTaskFailedCount(Integer taskFailedCount) {
        this.taskFailedCount = taskFailedCount;
    }

    public BatchJobForList withStatusLastUpdatedAt(Integer statusLastUpdatedAt) {
        this.statusLastUpdatedAt = statusLastUpdatedAt;
        return this;
    }

    /**
     * 状态更新时间戳
     * @return statusLastUpdatedAt
     */
    public Integer getStatusLastUpdatedAt() {
        return statusLastUpdatedAt;
    }

    public void setStatusLastUpdatedAt(Integer statusLastUpdatedAt) {
        this.statusLastUpdatedAt = statusLastUpdatedAt;
    }

    public BatchJobForList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchJobForList batchJobForList = (BatchJobForList) o;
        return Objects.equals(this.jobId, batchJobForList.jobId)
            && Objects.equals(this.jobName, batchJobForList.jobName)
            && Objects.equals(this.jobType, batchJobForList.jobType)
            && Objects.equals(this.createdAt, batchJobForList.createdAt)
            && Objects.equals(this.status, batchJobForList.status)
            && Objects.equals(this.taskTotalCount, batchJobForList.taskTotalCount)
            && Objects.equals(this.taskSuccessCount, batchJobForList.taskSuccessCount)
            && Objects.equals(this.taskFailedCount, batchJobForList.taskFailedCount)
            && Objects.equals(this.statusLastUpdatedAt, batchJobForList.statusLastUpdatedAt)
            && Objects.equals(this.description, batchJobForList.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobName,
            jobType,
            createdAt,
            status,
            taskTotalCount,
            taskSuccessCount,
            taskFailedCount,
            statusLastUpdatedAt,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchJobForList {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskTotalCount: ").append(toIndentedString(taskTotalCount)).append("\n");
        sb.append("    taskSuccessCount: ").append(toIndentedString(taskSuccessCount)).append("\n");
        sb.append("    taskFailedCount: ").append(toIndentedString(taskFailedCount)).append("\n");
        sb.append("    statusLastUpdatedAt: ").append(toIndentedString(statusLastUpdatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
