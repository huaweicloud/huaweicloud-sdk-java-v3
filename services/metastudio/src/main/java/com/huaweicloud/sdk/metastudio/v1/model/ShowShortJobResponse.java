package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowShortJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private ShortJobType jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private JobState state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_failed_code")

    private String jobFailedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_failed_reason")

    private String jobFailedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastupdate_time")

    private Long lastupdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assess_result")

    private AssessResult assessResult;

    public ShowShortJobResponse withJobType(ShortJobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get jobType
     * @return jobType
     */
    public ShortJobType getJobType() {
        return jobType;
    }

    public void setJobType(ShortJobType jobType) {
        this.jobType = jobType;
    }

    public ShowShortJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowShortJobResponse withState(JobState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public JobState getState() {
        return state;
    }

    public void setState(JobState state) {
        this.state = state;
    }

    public ShowShortJobResponse withJobFailedCode(String jobFailedCode) {
        this.jobFailedCode = jobFailedCode;
        return this;
    }

    /**
     * 当任务失败时呈现,失败错误码。
     * @return jobFailedCode
     */
    public String getJobFailedCode() {
        return jobFailedCode;
    }

    public void setJobFailedCode(String jobFailedCode) {
        this.jobFailedCode = jobFailedCode;
    }

    public ShowShortJobResponse withJobFailedReason(String jobFailedReason) {
        this.jobFailedReason = jobFailedReason;
        return this;
    }

    /**
     * 当任务失败时呈现,失败原因。
     * @return jobFailedReason
     */
    public String getJobFailedReason() {
        return jobFailedReason;
    }

    public void setJobFailedReason(String jobFailedReason) {
        this.jobFailedReason = jobFailedReason;
    }

    public ShowShortJobResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * minimum: 1
     * maximum: 2147483647
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowShortJobResponse withLastupdateTime(Long lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
        return this;
    }

    /**
     * 任务状态更新时间。
     * minimum: 1
     * maximum: 2147483647
     * @return lastupdateTime
     */
    public Long getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(Long lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }

    public ShowShortJobResponse withAssessResult(AssessResult assessResult) {
        this.assessResult = assessResult;
        return this;
    }

    public ShowShortJobResponse withAssessResult(Consumer<AssessResult> assessResultSetter) {
        if (this.assessResult == null) {
            this.assessResult = new AssessResult();
            assessResultSetter.accept(this.assessResult);
        }

        return this;
    }

    /**
     * Get assessResult
     * @return assessResult
     */
    public AssessResult getAssessResult() {
        return assessResult;
    }

    public void setAssessResult(AssessResult assessResult) {
        this.assessResult = assessResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShortJobResponse that = (ShowShortJobResponse) obj;
        return Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.jobFailedCode, that.jobFailedCode)
            && Objects.equals(this.jobFailedReason, that.jobFailedReason)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastupdateTime, that.lastupdateTime)
            && Objects.equals(this.assessResult, that.assessResult);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(jobType, jobId, state, jobFailedCode, jobFailedReason, createTime, lastupdateTime, assessResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShortJobResponse {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    jobFailedCode: ").append(toIndentedString(jobFailedCode)).append("\n");
        sb.append("    jobFailedReason: ").append(toIndentedString(jobFailedReason)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastupdateTime: ").append(toIndentedString(lastupdateTime)).append("\n");
        sb.append("    assessResult: ").append(toIndentedString(assessResult)).append("\n");
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
