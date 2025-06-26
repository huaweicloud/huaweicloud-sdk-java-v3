package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskDetail
 */
public class TaskDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private Integer executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_resource")

    private String srcResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_resource")

    private String dstResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "StatusRevision")

    private Integer statusRevision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public TaskDetail withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TaskDetail withExecutionId(Integer executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 执行任务的ID
     * @return executionId
     */
    public Integer getExecutionId() {
        return executionId;
    }

    public void setExecutionId(Integer executionId) {
        this.executionId = executionId;
    }

    public TaskDetail withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public TaskDetail withSrcResource(String srcResource) {
        this.srcResource = srcResource;
        return this;
    }

    /**
     * 源资源
     * @return srcResource
     */
    public String getSrcResource() {
        return srcResource;
    }

    public void setSrcResource(String srcResource) {
        this.srcResource = srcResource;
    }

    public TaskDetail withDstResource(String dstResource) {
        this.dstResource = dstResource;
        return this;
    }

    /**
     * 目标资源
     * @return dstResource
     */
    public String getDstResource() {
        return dstResource;
    }

    public void setDstResource(String dstResource) {
        this.dstResource = dstResource;
    }

    public TaskDetail withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作类型
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public TaskDetail withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * harbor任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public TaskDetail withStatus(String status) {
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

    public TaskDetail withStatusRevision(Integer statusRevision) {
        this.statusRevision = statusRevision;
        return this;
    }

    /**
     * 状态修订
     * @return statusRevision
     */
    public Integer getStatusRevision() {
        return statusRevision;
    }

    public void setStatusRevision(Integer statusRevision) {
        this.statusRevision = statusRevision;
    }

    public TaskDetail withStartTime(String startTime) {
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

    public TaskDetail withEndTime(String endTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDetail that = (TaskDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.srcResource, that.srcResource) && Objects.equals(this.dstResource, that.dstResource)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusRevision, that.statusRevision)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            executionId,
            resourceType,
            srcResource,
            dstResource,
            operation,
            jobId,
            status,
            statusRevision,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    srcResource: ").append(toIndentedString(srcResource)).append("\n");
        sb.append("    dstResource: ").append(toIndentedString(dstResource)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusRevision: ").append(toIndentedString(statusRevision)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
