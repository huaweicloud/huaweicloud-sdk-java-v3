package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartTestsuiteUsingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private Error error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "et_trace_id")

    private String etTraceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private TaskBasicInfoVo result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warn")

    private Warn warn;

    public StartTestsuiteUsingResponse withError(Error error) {
        this.error = error;
        return this;
    }

    public StartTestsuiteUsingResponse withError(Consumer<Error> errorSetter) {
        if (this.error == null) {
            this.error = new Error();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public StartTestsuiteUsingResponse withEtTraceId(String etTraceId) {
        this.etTraceId = etTraceId;
        return this;
    }

    /**
     * Get etTraceId
     * @return etTraceId
     */
    public String getEtTraceId() {
        return etTraceId;
    }

    public void setEtTraceId(String etTraceId) {
        this.etTraceId = etTraceId;
    }

    public StartTestsuiteUsingResponse withResult(TaskBasicInfoVo result) {
        this.result = result;
        return this;
    }

    public StartTestsuiteUsingResponse withResult(Consumer<TaskBasicInfoVo> resultSetter) {
        if (this.result == null) {
            this.result = new TaskBasicInfoVo();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public TaskBasicInfoVo getResult() {
        return result;
    }

    public void setResult(TaskBasicInfoVo result) {
        this.result = result;
    }

    public StartTestsuiteUsingResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StartTestsuiteUsingResponse withWarn(Warn warn) {
        this.warn = warn;
        return this;
    }

    public StartTestsuiteUsingResponse withWarn(Consumer<Warn> warnSetter) {
        if (this.warn == null) {
            this.warn = new Warn();
            warnSetter.accept(this.warn);
        }

        return this;
    }

    /**
     * Get warn
     * @return warn
     */
    public Warn getWarn() {
        return warn;
    }

    public void setWarn(Warn warn) {
        this.warn = warn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartTestsuiteUsingResponse that = (StartTestsuiteUsingResponse) obj;
        return Objects.equals(this.error, that.error) && Objects.equals(this.etTraceId, that.etTraceId)
            && Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status)
            && Objects.equals(this.warn, that.warn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, etTraceId, result, status, warn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartTestsuiteUsingResponse {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    etTraceId: ").append(toIndentedString(etTraceId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    warn: ").append(toIndentedString(warn)).append("\n");
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
