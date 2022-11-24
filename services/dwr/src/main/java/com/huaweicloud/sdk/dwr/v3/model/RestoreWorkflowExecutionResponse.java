package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RestoreWorkflowExecutionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_urn")

    private String executionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restored_at")

    private String restoredAt;

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

    public RestoreWorkflowExecutionResponse withExecutionUrn(String executionUrn) {
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

    public RestoreWorkflowExecutionResponse withRestoredAt(String restoredAt) {
        this.restoredAt = restoredAt;
        return this;
    }

    /**
     * 运行实例的恢复启动时间。
     * @return restoredAt
     */
    public String getRestoredAt() {
        return restoredAt;
    }

    public void setRestoredAt(String restoredAt) {
        this.restoredAt = restoredAt;
    }

    public RestoreWorkflowExecutionResponse withExecutionName(String executionName) {
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

    public RestoreWorkflowExecutionResponse withXRequestId(String xRequestId) {
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

    public RestoreWorkflowExecutionResponse withConnection(String connection) {
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

    public RestoreWorkflowExecutionResponse withContentLength(String contentLength) {
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

    public RestoreWorkflowExecutionResponse withDate(String date) {
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
        RestoreWorkflowExecutionResponse restoreWorkflowExecutionResponse = (RestoreWorkflowExecutionResponse) o;
        return Objects.equals(this.executionUrn, restoreWorkflowExecutionResponse.executionUrn)
            && Objects.equals(this.restoredAt, restoreWorkflowExecutionResponse.restoredAt)
            && Objects.equals(this.executionName, restoreWorkflowExecutionResponse.executionName)
            && Objects.equals(this.xRequestId, restoreWorkflowExecutionResponse.xRequestId)
            && Objects.equals(this.connection, restoreWorkflowExecutionResponse.connection)
            && Objects.equals(this.contentLength, restoreWorkflowExecutionResponse.contentLength)
            && Objects.equals(this.date, restoreWorkflowExecutionResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionUrn, restoredAt, executionName, xRequestId, connection, contentLength, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreWorkflowExecutionResponse {\n");
        sb.append("    executionUrn: ").append(toIndentedString(executionUrn)).append("\n");
        sb.append("    restoredAt: ").append(toIndentedString(restoredAt)).append("\n");
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
