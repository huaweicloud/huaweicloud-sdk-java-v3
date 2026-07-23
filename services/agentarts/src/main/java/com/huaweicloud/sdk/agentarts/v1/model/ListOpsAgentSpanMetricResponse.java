package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsAgentSpanMetricResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_span_metric_list")

    private List<AgentSpanMetricInfo> agentSpanMetricList = null;

    public ListOpsAgentSpanMetricResponse withAgentSpanMetricList(List<AgentSpanMetricInfo> agentSpanMetricList) {
        this.agentSpanMetricList = agentSpanMetricList;
        return this;
    }

    public ListOpsAgentSpanMetricResponse addAgentSpanMetricListItem(AgentSpanMetricInfo agentSpanMetricListItem) {
        if (this.agentSpanMetricList == null) {
            this.agentSpanMetricList = new ArrayList<>();
        }
        this.agentSpanMetricList.add(agentSpanMetricListItem);
        return this;
    }

    public ListOpsAgentSpanMetricResponse withAgentSpanMetricList(
        Consumer<List<AgentSpanMetricInfo>> agentSpanMetricListSetter) {
        if (this.agentSpanMetricList == null) {
            this.agentSpanMetricList = new ArrayList<>();
        }
        agentSpanMetricListSetter.accept(this.agentSpanMetricList);
        return this;
    }

    /**
     * span列表
     * @return agentSpanMetricList
     */
    public List<AgentSpanMetricInfo> getAgentSpanMetricList() {
        return agentSpanMetricList;
    }

    public void setAgentSpanMetricList(List<AgentSpanMetricInfo> agentSpanMetricList) {
        this.agentSpanMetricList = agentSpanMetricList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentSpanMetricResponse that = (ListOpsAgentSpanMetricResponse) obj;
        return Objects.equals(this.agentSpanMetricList, that.agentSpanMetricList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentSpanMetricList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentSpanMetricResponse {\n");
        sb.append("    agentSpanMetricList: ").append(toIndentedString(agentSpanMetricList)).append("\n");
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
