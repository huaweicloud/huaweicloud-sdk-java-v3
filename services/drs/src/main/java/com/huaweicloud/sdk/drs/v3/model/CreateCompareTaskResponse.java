package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCompareTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_level_compare_create_result")

    @JacksonXmlProperty(localName = "object_level_compare_create_result")

    private CreateCompareTaskResult objectLevelCompareCreateResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_level_compare_create_result")

    @JacksonXmlProperty(localName = "data_level_compare_create_result")

    private CreateCompareTaskResult dataLevelCompareCreateResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    @JacksonXmlProperty(localName = "error_msg")

    private String errorMsg;

    public CreateCompareTaskResponse withJobId(String jobId) {
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

    public CreateCompareTaskResponse withObjectLevelCompareCreateResult(
        CreateCompareTaskResult objectLevelCompareCreateResult) {
        this.objectLevelCompareCreateResult = objectLevelCompareCreateResult;
        return this;
    }

    public CreateCompareTaskResponse withObjectLevelCompareCreateResult(
        Consumer<CreateCompareTaskResult> objectLevelCompareCreateResultSetter) {
        if (this.objectLevelCompareCreateResult == null) {
            this.objectLevelCompareCreateResult = new CreateCompareTaskResult();
            objectLevelCompareCreateResultSetter.accept(this.objectLevelCompareCreateResult);
        }

        return this;
    }

    /**
     * Get objectLevelCompareCreateResult
     * @return objectLevelCompareCreateResult
     */
    public CreateCompareTaskResult getObjectLevelCompareCreateResult() {
        return objectLevelCompareCreateResult;
    }

    public void setObjectLevelCompareCreateResult(CreateCompareTaskResult objectLevelCompareCreateResult) {
        this.objectLevelCompareCreateResult = objectLevelCompareCreateResult;
    }

    public CreateCompareTaskResponse withDataLevelCompareCreateResult(
        CreateCompareTaskResult dataLevelCompareCreateResult) {
        this.dataLevelCompareCreateResult = dataLevelCompareCreateResult;
        return this;
    }

    public CreateCompareTaskResponse withDataLevelCompareCreateResult(
        Consumer<CreateCompareTaskResult> dataLevelCompareCreateResultSetter) {
        if (this.dataLevelCompareCreateResult == null) {
            this.dataLevelCompareCreateResult = new CreateCompareTaskResult();
            dataLevelCompareCreateResultSetter.accept(this.dataLevelCompareCreateResult);
        }

        return this;
    }

    /**
     * Get dataLevelCompareCreateResult
     * @return dataLevelCompareCreateResult
     */
    public CreateCompareTaskResult getDataLevelCompareCreateResult() {
        return dataLevelCompareCreateResult;
    }

    public void setDataLevelCompareCreateResult(CreateCompareTaskResult dataLevelCompareCreateResult) {
        this.dataLevelCompareCreateResult = dataLevelCompareCreateResult;
    }

    public CreateCompareTaskResponse withErrorCode(String errorCode) {
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

    public CreateCompareTaskResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息。
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
        CreateCompareTaskResponse createCompareTaskResponse = (CreateCompareTaskResponse) o;
        return Objects.equals(this.jobId, createCompareTaskResponse.jobId)
            && Objects.equals(this.objectLevelCompareCreateResult,
                createCompareTaskResponse.objectLevelCompareCreateResult)
            && Objects.equals(this.dataLevelCompareCreateResult, createCompareTaskResponse.dataLevelCompareCreateResult)
            && Objects.equals(this.errorCode, createCompareTaskResponse.errorCode)
            && Objects.equals(this.errorMsg, createCompareTaskResponse.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, objectLevelCompareCreateResult, dataLevelCompareCreateResult, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompareTaskResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    objectLevelCompareCreateResult: ")
            .append(toIndentedString(objectLevelCompareCreateResult))
            .append("\n");
        sb.append("    dataLevelCompareCreateResult: ")
            .append(toIndentedString(dataLevelCompareCreateResult))
            .append("\n");
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
