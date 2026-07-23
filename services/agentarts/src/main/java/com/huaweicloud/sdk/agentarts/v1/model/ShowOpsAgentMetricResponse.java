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
public class ShowOpsAgentMetricResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_agent_list")

    private List<MetricResponse> metricAgentList = null;

    public ShowOpsAgentMetricResponse withMetricAgentList(List<MetricResponse> metricAgentList) {
        this.metricAgentList = metricAgentList;
        return this;
    }

    public ShowOpsAgentMetricResponse addMetricAgentListItem(MetricResponse metricAgentListItem) {
        if (this.metricAgentList == null) {
            this.metricAgentList = new ArrayList<>();
        }
        this.metricAgentList.add(metricAgentListItem);
        return this;
    }

    public ShowOpsAgentMetricResponse withMetricAgentList(Consumer<List<MetricResponse>> metricAgentListSetter) {
        if (this.metricAgentList == null) {
            this.metricAgentList = new ArrayList<>();
        }
        metricAgentListSetter.accept(this.metricAgentList);
        return this;
    }

    /**
     * 指标响应体信息
     * @return metricAgentList
     */
    public List<MetricResponse> getMetricAgentList() {
        return metricAgentList;
    }

    public void setMetricAgentList(List<MetricResponse> metricAgentList) {
        this.metricAgentList = metricAgentList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsAgentMetricResponse that = (ShowOpsAgentMetricResponse) obj;
        return Objects.equals(this.metricAgentList, that.metricAgentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricAgentList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsAgentMetricResponse {\n");
        sb.append("    metricAgentList: ").append(toIndentedString(metricAgentList)).append("\n");
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
