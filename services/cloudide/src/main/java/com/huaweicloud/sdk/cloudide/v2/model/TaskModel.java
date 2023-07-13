package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TaskModel
 */
public class TaskModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docker_id")

    private String dockerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception")

    private String exception;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generated_snippet")

    private String generatedSnippet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private OffsetDateTime recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snippet")

    private String snippet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Integer taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_consuming")

    private BigDecimal timeConsuming;

    public TaskModel withDockerId(String dockerId) {
        this.dockerId = dockerId;
        return this;
    }

    /**
     * the docker_id
     * @return dockerId
     */
    public String getDockerId() {
        return dockerId;
    }

    public void setDockerId(String dockerId) {
        this.dockerId = dockerId;
    }

    public TaskModel withException(String exception) {
        this.exception = exception;
        return this;
    }

    /**
     * exception
     * @return exception
     */
    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public TaskModel withGeneratedSnippet(String generatedSnippet) {
        this.generatedSnippet = generatedSnippet;
        return this;
    }

    /**
     * the generated_snippet
     * @return generatedSnippet
     */
    public String getGeneratedSnippet() {
        return generatedSnippet;
    }

    public void setGeneratedSnippet(String generatedSnippet) {
        this.generatedSnippet = generatedSnippet;
    }

    public TaskModel withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * code language
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TaskModel withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * model_id
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public TaskModel withRecordTime(OffsetDateTime recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * record_time
     * @return recordTime
     */
    public OffsetDateTime getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(OffsetDateTime recordTime) {
        this.recordTime = recordTime;
    }

    public TaskModel withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * the unique id of request
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public TaskModel withSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }

    /**
     * the snippet of code
     * @return snippet
     */
    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public TaskModel withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * start_time
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public TaskModel withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskModel withTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * task_id
     * minimum: 0
     * maximum: 30
     * @return taskId
     */
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public TaskModel withTimeConsuming(BigDecimal timeConsuming) {
        this.timeConsuming = timeConsuming;
        return this;
    }

    /**
     * the time_consuming
     * minimum: 0
     * maximum: 1E+4
     * @return timeConsuming
     */
    public BigDecimal getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(BigDecimal timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskModel that = (TaskModel) obj;
        return Objects.equals(this.dockerId, that.dockerId) && Objects.equals(this.exception, that.exception)
            && Objects.equals(this.generatedSnippet, that.generatedSnippet)
            && Objects.equals(this.language, that.language) && Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.recordTime, that.recordTime) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.snippet, that.snippet) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.timeConsuming, that.timeConsuming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerId,
            exception,
            generatedSnippet,
            language,
            modelId,
            recordTime,
            requestId,
            snippet,
            startTime,
            status,
            taskId,
            timeConsuming);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskModel {\n");
        sb.append("    dockerId: ").append(toIndentedString(dockerId)).append("\n");
        sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
        sb.append("    generatedSnippet: ").append(toIndentedString(generatedSnippet)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    timeConsuming: ").append(toIndentedString(timeConsuming)).append("\n");
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
