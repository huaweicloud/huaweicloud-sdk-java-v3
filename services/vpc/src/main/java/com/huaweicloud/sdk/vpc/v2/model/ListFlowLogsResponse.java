package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListFlowLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_logs")

    private List<FlowLogResp> flowLogs = null;

    public ListFlowLogsResponse withFlowLogs(List<FlowLogResp> flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }

    public ListFlowLogsResponse addFlowLogsItem(FlowLogResp flowLogsItem) {
        if (this.flowLogs == null) {
            this.flowLogs = new ArrayList<>();
        }
        this.flowLogs.add(flowLogsItem);
        return this;
    }

    public ListFlowLogsResponse withFlowLogs(Consumer<List<FlowLogResp>> flowLogsSetter) {
        if (this.flowLogs == null) {
            this.flowLogs = new ArrayList<>();
        }
        flowLogsSetter.accept(this.flowLogs);
        return this;
    }

    /**
     * flow_log对象列表
     * @return flowLogs
     */
    public List<FlowLogResp> getFlowLogs() {
        return flowLogs;
    }

    public void setFlowLogs(List<FlowLogResp> flowLogs) {
        this.flowLogs = flowLogs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlowLogsResponse listFlowLogsResponse = (ListFlowLogsResponse) o;
        return Objects.equals(this.flowLogs, listFlowLogsResponse.flowLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlowLogsResponse {\n");
        sb.append("    flowLogs: ").append(toIndentedString(flowLogs)).append("\n");
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
