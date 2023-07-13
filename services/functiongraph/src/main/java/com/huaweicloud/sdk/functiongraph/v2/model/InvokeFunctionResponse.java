package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class InvokeFunctionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private String log;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cff-Request-Id")

    private String xCffRequestId;

    public InvokeFunctionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public InvokeFunctionResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 函数执行结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public InvokeFunctionResponse withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * 函数执行返回日志
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public InvokeFunctionResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 函数执行返回状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public InvokeFunctionResponse withXCffRequestId(String xCffRequestId) {
        this.xCffRequestId = xCffRequestId;
        return this;
    }

    /**
     * Get xCffRequestId
     * @return xCffRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cff-Request-Id")
    public String getXCffRequestId() {
        return xCffRequestId;
    }

    public void setXCffRequestId(String xCffRequestId) {
        this.xCffRequestId = xCffRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeFunctionResponse that = (InvokeFunctionResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.result, that.result)
            && Objects.equals(this.log, that.log) && Objects.equals(this.status, that.status)
            && Objects.equals(this.xCffRequestId, that.xCffRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, result, log, status, xCffRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeFunctionResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    xCffRequestId: ").append(toIndentedString(xCffRequestId)).append("\n");
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
