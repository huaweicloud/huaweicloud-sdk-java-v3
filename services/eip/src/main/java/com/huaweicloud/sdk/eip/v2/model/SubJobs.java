package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubJobs
 */
public class SubJobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private SubJobs entities;

    public SubJobs withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * job id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SubJobs withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * job类型
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public SubJobs withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 创建时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public SubJobs withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 创建完成时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SubJobs withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * job状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SubJobs withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public SubJobs withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 错误信息
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public SubJobs withEntities(SubJobs entities) {
        this.entities = entities;
        return this;
    }

    public SubJobs withEntities(Consumer<SubJobs> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new SubJobs();
            entitiesSetter.accept(this.entities);
        }

        return this;
    }

    /**
     * Get entities
     * @return entities
     */
    public SubJobs getEntities() {
        return entities;
    }

    public void setEntities(SubJobs entities) {
        this.entities = entities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubJobs subJobs = (SubJobs) o;
        return Objects.equals(this.jobId, subJobs.jobId) && Objects.equals(this.jobType, subJobs.jobType)
            && Objects.equals(this.beginTime, subJobs.beginTime) && Objects.equals(this.endTime, subJobs.endTime)
            && Objects.equals(this.status, subJobs.status) && Objects.equals(this.errorCode, subJobs.errorCode)
            && Objects.equals(this.failReason, subJobs.failReason) && Objects.equals(this.entities, subJobs.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobType, beginTime, endTime, status, errorCode, failReason, entities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJobs {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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
