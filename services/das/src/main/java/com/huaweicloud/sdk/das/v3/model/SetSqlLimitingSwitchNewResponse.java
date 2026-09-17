package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SetSqlLimitingSwitchNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    private String switchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private Boolean retry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_status")

    private String detailStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_status")

    private String jobStatus;

    public SetSqlLimitingSwitchNewResponse withSwitchOn(String switchOn) {
        this.switchOn = switchOn;
        return this;
    }

    /**
     * 开关状态
     * @return switchOn
     */
    public String getSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(String switchOn) {
        this.switchOn = switchOn;
    }

    public SetSqlLimitingSwitchNewResponse withRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    /**
     * 是否需要重试
     * @return retry
     */
    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public SetSqlLimitingSwitchNewResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public SetSqlLimitingSwitchNewResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public SetSqlLimitingSwitchNewResponse withDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
        return this;
    }

    /**
     * 详细状态
     * @return detailStatus
     */
    public String getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
    }

    public SetSqlLimitingSwitchNewResponse withFailReason(String failReason) {
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

    public SetSqlLimitingSwitchNewResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 工作流ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SetSqlLimitingSwitchNewResponse withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * 工作流状态
     * @return jobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetSqlLimitingSwitchNewResponse that = (SetSqlLimitingSwitchNewResponse) obj;
        return Objects.equals(this.switchOn, that.switchOn) && Objects.equals(this.retry, that.retry)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.status, that.status)
            && Objects.equals(this.detailStatus, that.detailStatus) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobStatus, that.jobStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOn, retry, errorMsg, status, detailStatus, failReason, jobId, jobStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetSqlLimitingSwitchNewResponse {\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detailStatus: ").append(toIndentedString(detailStatus)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
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
