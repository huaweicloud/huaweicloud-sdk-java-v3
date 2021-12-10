package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateResOnlineInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private Jobs job;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public CreateResOnlineInstanceResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /** 是否成功
     * 
     * @return isSuccess */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public CreateResOnlineInstanceResponse withJob(Jobs job) {
        this.job = job;
        return this;
    }

    public CreateResOnlineInstanceResponse withJob(Consumer<Jobs> jobSetter) {
        if (this.job == null) {
            this.job = new Jobs();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /** Get job
     * 
     * @return job */
    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    public CreateResOnlineInstanceResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /** 返回消息（请求成功时，不返回此字段）
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateResOnlineInstanceResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 错误码（请求成功时，不返回此字段）
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResOnlineInstanceResponse createResOnlineInstanceResponse = (CreateResOnlineInstanceResponse) o;
        return Objects.equals(this.isSuccess, createResOnlineInstanceResponse.isSuccess)
            && Objects.equals(this.job, createResOnlineInstanceResponse.job)
            && Objects.equals(this.message, createResOnlineInstanceResponse.message)
            && Objects.equals(this.errorCode, createResOnlineInstanceResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, job, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResOnlineInstanceResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
