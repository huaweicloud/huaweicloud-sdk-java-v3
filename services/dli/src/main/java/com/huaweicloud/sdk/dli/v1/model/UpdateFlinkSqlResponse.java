package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateFlinkSqlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    @JacksonXmlProperty(localName = "job")

    private UpdateJobRespJob job;

    public UpdateFlinkSqlResponse withIsSuccess(Boolean isSuccess) {
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

    public UpdateFlinkSqlResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UpdateFlinkSqlResponse withJob(UpdateJobRespJob job) {
        this.job = job;
        return this;
    }

    public UpdateFlinkSqlResponse withJob(Consumer<UpdateJobRespJob> jobSetter) {
        if (this.job == null) {
            this.job = new UpdateJobRespJob();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public UpdateJobRespJob getJob() {
        return job;
    }

    public void setJob(UpdateJobRespJob job) {
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
        UpdateFlinkSqlResponse updateFlinkSqlResponse = (UpdateFlinkSqlResponse) o;
        return Objects.equals(this.isSuccess, updateFlinkSqlResponse.isSuccess)
            && Objects.equals(this.message, updateFlinkSqlResponse.message)
            && Objects.equals(this.job, updateFlinkSqlResponse.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, job);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlinkSqlResponse {\n");
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
