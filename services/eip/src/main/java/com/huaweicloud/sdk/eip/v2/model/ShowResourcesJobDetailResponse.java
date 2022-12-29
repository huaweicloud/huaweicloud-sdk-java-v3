package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourcesJobDetailResponse extends SdkResponse {

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

    private SubJobsInfo entities;

    public ShowResourcesJobDetailResponse withJobId(String jobId) {
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

    public ShowResourcesJobDetailResponse withJobType(String jobType) {
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

    public ShowResourcesJobDetailResponse withBeginTime(String beginTime) {
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

    public ShowResourcesJobDetailResponse withEndTime(String endTime) {
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

    public ShowResourcesJobDetailResponse withStatus(String status) {
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

    public ShowResourcesJobDetailResponse withErrorCode(String errorCode) {
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

    public ShowResourcesJobDetailResponse withFailReason(String failReason) {
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

    public ShowResourcesJobDetailResponse withEntities(SubJobsInfo entities) {
        this.entities = entities;
        return this;
    }

    public ShowResourcesJobDetailResponse withEntities(Consumer<SubJobsInfo> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new SubJobsInfo();
            entitiesSetter.accept(this.entities);
        }

        return this;
    }

    /**
     * Get entities
     * @return entities
     */
    public SubJobsInfo getEntities() {
        return entities;
    }

    public void setEntities(SubJobsInfo entities) {
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
        ShowResourcesJobDetailResponse showResourcesJobDetailResponse = (ShowResourcesJobDetailResponse) o;
        return Objects.equals(this.jobId, showResourcesJobDetailResponse.jobId)
            && Objects.equals(this.jobType, showResourcesJobDetailResponse.jobType)
            && Objects.equals(this.beginTime, showResourcesJobDetailResponse.beginTime)
            && Objects.equals(this.endTime, showResourcesJobDetailResponse.endTime)
            && Objects.equals(this.status, showResourcesJobDetailResponse.status)
            && Objects.equals(this.errorCode, showResourcesJobDetailResponse.errorCode)
            && Objects.equals(this.failReason, showResourcesJobDetailResponse.failReason)
            && Objects.equals(this.entities, showResourcesJobDetailResponse.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobType, beginTime, endTime, status, errorCode, failReason, entities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourcesJobDetailResponse {\n");
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
