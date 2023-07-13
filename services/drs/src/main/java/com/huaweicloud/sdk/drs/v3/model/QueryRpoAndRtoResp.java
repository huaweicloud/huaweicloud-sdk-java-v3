package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RPO和RTO信息体
 */
public class QueryRpoAndRtoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rpo_info")

    private RpoAndRtoInfo rpoInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto_info")

    private RpoAndRtoInfo rtoInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public QueryRpoAndRtoResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryRpoAndRtoResp withRpoInfo(RpoAndRtoInfo rpoInfo) {
        this.rpoInfo = rpoInfo;
        return this;
    }

    public QueryRpoAndRtoResp withRpoInfo(Consumer<RpoAndRtoInfo> rpoInfoSetter) {
        if (this.rpoInfo == null) {
            this.rpoInfo = new RpoAndRtoInfo();
            rpoInfoSetter.accept(this.rpoInfo);
        }

        return this;
    }

    /**
     * Get rpoInfo
     * @return rpoInfo
     */
    public RpoAndRtoInfo getRpoInfo() {
        return rpoInfo;
    }

    public void setRpoInfo(RpoAndRtoInfo rpoInfo) {
        this.rpoInfo = rpoInfo;
    }

    public QueryRpoAndRtoResp withRtoInfo(RpoAndRtoInfo rtoInfo) {
        this.rtoInfo = rtoInfo;
        return this;
    }

    public QueryRpoAndRtoResp withRtoInfo(Consumer<RpoAndRtoInfo> rtoInfoSetter) {
        if (this.rtoInfo == null) {
            this.rtoInfo = new RpoAndRtoInfo();
            rtoInfoSetter.accept(this.rtoInfo);
        }

        return this;
    }

    /**
     * Get rtoInfo
     * @return rtoInfo
     */
    public RpoAndRtoInfo getRtoInfo() {
        return rtoInfo;
    }

    public void setRtoInfo(RpoAndRtoInfo rtoInfo) {
        this.rtoInfo = rtoInfo;
    }

    public QueryRpoAndRtoResp withErrorCode(String errorCode) {
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

    public QueryRpoAndRtoResp withErrorMsg(String errorMsg) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryRpoAndRtoResp that = (QueryRpoAndRtoResp) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.rpoInfo, that.rpoInfo)
            && Objects.equals(this.rtoInfo, that.rtoInfo) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, rpoInfo, rtoInfo, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRpoAndRtoResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    rpoInfo: ").append(toIndentedString(rpoInfo)).append("\n");
        sb.append("    rtoInfo: ").append(toIndentedString(rtoInfo)).append("\n");
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
