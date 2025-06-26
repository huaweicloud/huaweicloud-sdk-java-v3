package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Task
 */
public class Task {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private Integer executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private String repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_revision")

    private Integer statusRevision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retained")

    private Integer retained;

    public Task withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 老化策略执行记录任务ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Task withExecutionId(Integer executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 老化策略执行记录ID
     * @return executionId
     */
    public Integer getExecutionId() {
        return executionId;
    }

    public void setExecutionId(Integer executionId) {
        this.executionId = executionId;
    }

    public Task withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * 制品仓库名称
     * @return repository
     */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public Task withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务名称
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Task withStatus(String status) {
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

    public Task withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态码
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Task withStatusRevision(Integer statusRevision) {
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

    public Task withStartTime(String startTime) {
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

    public Task withEndTime(String endTime) {
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

    public Task withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 版本总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Task withRetained(Integer retained) {
        this.retained = retained;
        return this;
    }

    /**
     * 保留版本总数
     * @return retained
     */
    public Integer getRetained() {
        return retained;
    }

    public void setRetained(Integer retained) {
        this.retained = retained;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task that = (Task) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.repository, that.repository) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusCode, that.statusCode)
            && Objects.equals(this.statusRevision, that.statusRevision)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.total, that.total) && Objects.equals(this.retained, that.retained);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            executionId,
            repository,
            jobId,
            status,
            statusCode,
            statusRevision,
            startTime,
            endTime,
            total,
            retained);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Task {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusRevision: ").append(toIndentedString(statusRevision)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    retained: ").append(toIndentedString(retained)).append("\n");
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
