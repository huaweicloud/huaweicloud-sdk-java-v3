package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateFlowLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_log")

    private FlowLog flowLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")

    private String xClientToken;

    public CreateFlowLogResponse withFlowLog(FlowLog flowLog) {
        this.flowLog = flowLog;
        return this;
    }

    public CreateFlowLogResponse withFlowLog(Consumer<FlowLog> flowLogSetter) {
        if (this.flowLog == null) {
            this.flowLog = new FlowLog();
            flowLogSetter.accept(this.flowLog);
        }

        return this;
    }

    /**
     * Get flowLog
     * @return flowLog
     */
    public FlowLog getFlowLog() {
        return flowLog;
    }

    public void setFlowLog(FlowLog flowLog) {
        this.flowLog = flowLog;
    }

    public CreateFlowLogResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateFlowLogResponse withXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
        return this;
    }

    /**
     * Get xClientToken
     * @return xClientToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")
    public String getXClientToken() {
        return xClientToken;
    }

    public void setXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlowLogResponse that = (CreateFlowLogResponse) obj;
        return Objects.equals(this.flowLog, that.flowLog) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.xClientToken, that.xClientToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowLog, requestId, xClientToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowLogResponse {\n");
        sb.append("    flowLog: ").append(toIndentedString(flowLog)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    xClientToken: ").append(toIndentedString(xClientToken)).append("\n");
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
