package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AgentSpanMetricInfo
 */
public class AgentSpanMetricInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_total_value")

    private Integer metricTotalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_metric_value_list")

    private List<AgentSpanMetricValueInfo> agentMetricValueList = null;

    public AgentSpanMetricInfo withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public AgentSpanMetricInfo withMetricTotalValue(Integer metricTotalValue) {
        this.metricTotalValue = metricTotalValue;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 100000
     * @return metricTotalValue
     */
    public Integer getMetricTotalValue() {
        return metricTotalValue;
    }

    public void setMetricTotalValue(Integer metricTotalValue) {
        this.metricTotalValue = metricTotalValue;
    }

    public AgentSpanMetricInfo withAgentMetricValueList(List<AgentSpanMetricValueInfo> agentMetricValueList) {
        this.agentMetricValueList = agentMetricValueList;
        return this;
    }

    public AgentSpanMetricInfo addAgentMetricValueListItem(AgentSpanMetricValueInfo agentMetricValueListItem) {
        if (this.agentMetricValueList == null) {
            this.agentMetricValueList = new ArrayList<>();
        }
        this.agentMetricValueList.add(agentMetricValueListItem);
        return this;
    }

    public AgentSpanMetricInfo withAgentMetricValueList(
        Consumer<List<AgentSpanMetricValueInfo>> agentMetricValueListSetter) {
        if (this.agentMetricValueList == null) {
            this.agentMetricValueList = new ArrayList<>();
        }
        agentMetricValueListSetter.accept(this.agentMetricValueList);
        return this;
    }

    /**
     * span列表
     * @return agentMetricValueList
     */
    public List<AgentSpanMetricValueInfo> getAgentMetricValueList() {
        return agentMetricValueList;
    }

    public void setAgentMetricValueList(List<AgentSpanMetricValueInfo> agentMetricValueList) {
        this.agentMetricValueList = agentMetricValueList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentSpanMetricInfo that = (AgentSpanMetricInfo) obj;
        return Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.metricTotalValue, that.metricTotalValue)
            && Objects.equals(this.agentMetricValueList, that.agentMetricValueList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, metricTotalValue, agentMetricValueList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentSpanMetricInfo {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricTotalValue: ").append(toIndentedString(metricTotalValue)).append("\n");
        sb.append("    agentMetricValueList: ").append(toIndentedString(agentMetricValueList)).append("\n");
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
