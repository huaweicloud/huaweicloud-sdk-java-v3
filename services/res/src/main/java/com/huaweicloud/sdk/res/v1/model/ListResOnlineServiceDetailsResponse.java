package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListResOnlineServiceDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private Jobs jobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public ListResOnlineServiceDetailsResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /** 是否成功。
     * 
     * @return isSuccess */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListResOnlineServiceDetailsResponse withJobs(Jobs jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListResOnlineServiceDetailsResponse withJobs(Consumer<Jobs> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new Jobs();
            jobsSetter.accept(this.jobs);
        }

        return this;
    }

    /** Get jobs
     * 
     * @return jobs */
    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public ListResOnlineServiceDetailsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /** 返回消息（请求成功时，不返回此字段）。
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListResOnlineServiceDetailsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 错误码（请求成功时，不返回此字段）。
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
        ListResOnlineServiceDetailsResponse listResOnlineServiceDetailsResponse =
            (ListResOnlineServiceDetailsResponse) o;
        return Objects.equals(this.isSuccess, listResOnlineServiceDetailsResponse.isSuccess)
            && Objects.equals(this.jobs, listResOnlineServiceDetailsResponse.jobs)
            && Objects.equals(this.message, listResOnlineServiceDetailsResponse.message)
            && Objects.equals(this.errorCode, listResOnlineServiceDetailsResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, jobs, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResOnlineServiceDetailsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
