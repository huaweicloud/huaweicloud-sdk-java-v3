package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateFlinkSqlJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private String isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private FlinkJobUpdateTime job;

    public UpdateFlinkSqlJobResponse withIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public UpdateFlinkSqlJobResponse withMessage(String message) {
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

    public UpdateFlinkSqlJobResponse withJob(FlinkJobUpdateTime job) {
        this.job = job;
        return this;
    }

    public UpdateFlinkSqlJobResponse withJob(Consumer<FlinkJobUpdateTime> jobSetter) {
        if (this.job == null) {
            this.job = new FlinkJobUpdateTime();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public FlinkJobUpdateTime getJob() {
        return job;
    }

    public void setJob(FlinkJobUpdateTime job) {
        this.job = job;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFlinkSqlJobResponse that = (UpdateFlinkSqlJobResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.job, that.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, job);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlinkSqlJobResponse {\n");
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
