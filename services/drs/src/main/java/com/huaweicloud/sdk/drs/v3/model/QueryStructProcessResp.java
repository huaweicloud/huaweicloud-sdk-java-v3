package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 查询灾备初始化进度 */
public class QueryStructProcessResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "struct_process")

    private StructProcessResp structProcess;

    public QueryStructProcessResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryStructProcessResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 错误码
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryStructProcessResp withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /** 错误信息
     * 
     * @return errorMessage */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public QueryStructProcessResp withStructProcess(StructProcessResp structProcess) {
        this.structProcess = structProcess;
        return this;
    }

    public QueryStructProcessResp withStructProcess(Consumer<StructProcessResp> structProcessSetter) {
        if (this.structProcess == null) {
            this.structProcess = new StructProcessResp();
            structProcessSetter.accept(this.structProcess);
        }

        return this;
    }

    /** Get structProcess
     * 
     * @return structProcess */
    public StructProcessResp getStructProcess() {
        return structProcess;
    }

    public void setStructProcess(StructProcessResp structProcess) {
        this.structProcess = structProcess;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryStructProcessResp queryStructProcessResp = (QueryStructProcessResp) o;
        return Objects.equals(this.jobId, queryStructProcessResp.jobId)
            && Objects.equals(this.errorCode, queryStructProcessResp.errorCode)
            && Objects.equals(this.errorMessage, queryStructProcessResp.errorMessage)
            && Objects.equals(this.structProcess, queryStructProcessResp.structProcess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, errorCode, errorMessage, structProcess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryStructProcessResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    structProcess: ").append(toIndentedString(structProcess)).append("\n");
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
