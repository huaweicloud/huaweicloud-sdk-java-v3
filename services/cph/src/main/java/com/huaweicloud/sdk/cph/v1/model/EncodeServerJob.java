package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 编码容器任务。
 */
public class EncodeServerJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_server_id")

    private String encodeServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public EncodeServerJob withEncodeServerId(String encodeServerId) {
        this.encodeServerId = encodeServerId;
        return this;
    }

    /**
     * 编码服务的唯一标识ID，编码服务相关任务包含此字段。
     * @return encodeServerId
     */
    public String getEncodeServerId() {
        return encodeServerId;
    }

    public void setEncodeServerId(String encodeServerId) {
        this.encodeServerId = encodeServerId;
    }

    public EncodeServerJob withJobId(String jobId) {
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

    public EncodeServerJob withErrorCode(String errorCode) {
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

    public EncodeServerJob withErrorMsg(String errorMsg) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EncodeServerJob encodeServerJob = (EncodeServerJob) o;
        return Objects.equals(this.encodeServerId, encodeServerJob.encodeServerId)
            && Objects.equals(this.jobId, encodeServerJob.jobId)
            && Objects.equals(this.errorCode, encodeServerJob.errorCode)
            && Objects.equals(this.errorMsg, encodeServerJob.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodeServerId, jobId, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncodeServerJob {\n");
        sb.append("    encodeServerId: ").append(toIndentedString(encodeServerId)).append("\n");
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
