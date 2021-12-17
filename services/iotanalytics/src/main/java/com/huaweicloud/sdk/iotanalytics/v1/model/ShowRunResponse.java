package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowRunResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_id")

    private String runId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<RunDetail> details = null;

    public ShowRunResponse withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /** 作业运行ID。
     * 
     * @return runId */
    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public ShowRunResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 作业ID。
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowRunResponse withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /** 作业类型。
     * 
     * @return jobType */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ShowRunResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 此作业的当前状态，包含提交（LAUNCHING）、运行中（RUNNING）、完成（FINISHED）、失败（FAILED）、取消（CANCELLED）。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowRunResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建运行时间。
     * 
     * @return createdTime */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowRunResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /** 系统提示信息。运行失败时，失败原因。
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowRunResponse withDetails(List<RunDetail> details) {
        this.details = details;
        return this;
    }

    public ShowRunResponse addDetailsItem(RunDetail detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public ShowRunResponse withDetails(Consumer<List<RunDetail>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /** 作业运行详情。
     * 
     * @return details */
    public List<RunDetail> getDetails() {
        return details;
    }

    public void setDetails(List<RunDetail> details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRunResponse showRunResponse = (ShowRunResponse) o;
        return Objects.equals(this.runId, showRunResponse.runId) && Objects.equals(this.jobId, showRunResponse.jobId)
            && Objects.equals(this.jobType, showRunResponse.jobType)
            && Objects.equals(this.status, showRunResponse.status)
            && Objects.equals(this.createdTime, showRunResponse.createdTime)
            && Objects.equals(this.message, showRunResponse.message)
            && Objects.equals(this.details, showRunResponse.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runId, jobId, jobType, status, createdTime, message, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRunResponse {\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
