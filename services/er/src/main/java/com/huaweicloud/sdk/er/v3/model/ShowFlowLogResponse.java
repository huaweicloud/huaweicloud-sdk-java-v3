package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlowLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_log")

    private FlowLog flowLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowFlowLogResponse withFlowLog(FlowLog flowLog) {
        this.flowLog = flowLog;
        return this;
    }

    public ShowFlowLogResponse withFlowLog(Consumer<FlowLog> flowLogSetter) {
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

    public ShowFlowLogResponse withRequestId(String requestId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlowLogResponse that = (ShowFlowLogResponse) obj;
        return Objects.equals(this.flowLog, that.flowLog) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowLog, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlowLogResponse {\n");
        sb.append("    flowLog: ").append(toIndentedString(flowLog)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
