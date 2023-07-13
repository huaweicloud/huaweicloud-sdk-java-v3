package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机迁移任务。
 */
public class PhoneMigrateJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_phone_id")

    private String sourcePhoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_phone_id")

    private String targetPhoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public PhoneMigrateJob withSourcePhoneId(String sourcePhoneId) {
        this.sourcePhoneId = sourcePhoneId;
        return this;
    }

    /**
     * 源云手机id。
     * @return sourcePhoneId
     */
    public String getSourcePhoneId() {
        return sourcePhoneId;
    }

    public void setSourcePhoneId(String sourcePhoneId) {
        this.sourcePhoneId = sourcePhoneId;
    }

    public PhoneMigrateJob withTargetPhoneId(String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
        return this;
    }

    /**
     * 目标云手机id。
     * @return targetPhoneId
     */
    public String getTargetPhoneId() {
        return targetPhoneId;
    }

    public void setTargetPhoneId(String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
    }

    public PhoneMigrateJob withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务的唯一标识。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public PhoneMigrateJob withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public PhoneMigrateJob withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误说明。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneMigrateJob that = (PhoneMigrateJob) obj;
        return Objects.equals(this.sourcePhoneId, that.sourcePhoneId)
            && Objects.equals(this.targetPhoneId, that.targetPhoneId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourcePhoneId, targetPhoneId, jobId, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneMigrateJob {\n");
        sb.append("    sourcePhoneId: ").append(toIndentedString(sourcePhoneId)).append("\n");
        sb.append("    targetPhoneId: ").append(toIndentedString(targetPhoneId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
