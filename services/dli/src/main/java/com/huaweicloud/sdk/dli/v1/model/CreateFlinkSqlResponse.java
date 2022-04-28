package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateFlinkSqlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private CreateJobRespJob job;

    public CreateFlinkSqlResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public CreateFlinkSqlResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateFlinkSqlResponse withJob(CreateJobRespJob job) {
        this.job = job;
        return this;
    }

    public CreateFlinkSqlResponse withJob(Consumer<CreateJobRespJob> jobSetter) {
        if (this.job == null) {
            this.job = new CreateJobRespJob();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public CreateJobRespJob getJob() {
        return job;
    }

    public void setJob(CreateJobRespJob job) {
        this.job = job;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFlinkSqlResponse createFlinkSqlResponse = (CreateFlinkSqlResponse) o;
        return Objects.equals(this.isSuccess, createFlinkSqlResponse.isSuccess)
            && Objects.equals(this.message, createFlinkSqlResponse.message)
            && Objects.equals(this.job, createFlinkSqlResponse.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, job);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlinkSqlResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
