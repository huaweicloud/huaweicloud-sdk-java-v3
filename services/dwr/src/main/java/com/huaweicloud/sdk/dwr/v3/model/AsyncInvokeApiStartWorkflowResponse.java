package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AsyncInvokeApiStartWorkflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_urn")

    private String executionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_at")

    private String startedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_name")

    private String executionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    public AsyncInvokeApiStartWorkflowResponse withExecutionUrn(String executionUrn) {
        this.executionUrn = executionUrn;
        return this;
    }

    /**
     * 运行实例的URN。
     * @return executionUrn
     */
    public String getExecutionUrn() {
        return executionUrn;
    }

    public void setExecutionUrn(String executionUrn) {
        this.executionUrn = executionUrn;
    }

    public AsyncInvokeApiStartWorkflowResponse withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * 运行实例启动时间。
     * @return startedAt
     */
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public AsyncInvokeApiStartWorkflowResponse withExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }

    /**
     * 运行实例的名字。
     * @return executionName
     */
    public String getExecutionName() {
        return executionName;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName;
    }

    public AsyncInvokeApiStartWorkflowResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public AsyncInvokeApiStartWorkflowResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public AsyncInvokeApiStartWorkflowResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public AsyncInvokeApiStartWorkflowResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AsyncInvokeApiStartWorkflowResponse asyncInvokeApiStartWorkflowResponse =
            (AsyncInvokeApiStartWorkflowResponse) o;
        return Objects.equals(this.executionUrn, asyncInvokeApiStartWorkflowResponse.executionUrn)
            && Objects.equals(this.startedAt, asyncInvokeApiStartWorkflowResponse.startedAt)
            && Objects.equals(this.executionName, asyncInvokeApiStartWorkflowResponse.executionName)
            && Objects.equals(this.xRequestId, asyncInvokeApiStartWorkflowResponse.xRequestId)
            && Objects.equals(this.connection, asyncInvokeApiStartWorkflowResponse.connection)
            && Objects.equals(this.contentLength, asyncInvokeApiStartWorkflowResponse.contentLength)
            && Objects.equals(this.date, asyncInvokeApiStartWorkflowResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionUrn, startedAt, executionName, xRequestId, connection, contentLength, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncInvokeApiStartWorkflowResponse {\n");
        sb.append("    executionUrn: ").append(toIndentedString(executionUrn)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    executionName: ").append(toIndentedString(executionName)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
