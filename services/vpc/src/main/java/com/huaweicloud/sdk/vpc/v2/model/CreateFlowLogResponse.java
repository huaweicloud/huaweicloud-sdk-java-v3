package com.huaweicloud.sdk.vpc.v2.model;

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

    private FlowLogResp flowLog;

    public CreateFlowLogResponse withFlowLog(FlowLogResp flowLog) {
        this.flowLog = flowLog;
        return this;
    }

    public CreateFlowLogResponse withFlowLog(Consumer<FlowLogResp> flowLogSetter) {
        if (this.flowLog == null) {
            this.flowLog = new FlowLogResp();
            flowLogSetter.accept(this.flowLog);
        }

        return this;
    }

    /**
     * Get flowLog
     * @return flowLog
     */
    public FlowLogResp getFlowLog() {
        return flowLog;
    }

    public void setFlowLog(FlowLogResp flowLog) {
        this.flowLog = flowLog;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFlowLogResponse createFlowLogResponse = (CreateFlowLogResponse) o;
        return Objects.equals(this.flowLog, createFlowLogResponse.flowLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowLogResponse {\n");
        sb.append("    flowLog: ").append(toIndentedString(flowLog)).append("\n");
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
