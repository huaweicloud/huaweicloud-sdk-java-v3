package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TopRiskInfo
 */
public class TopRiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_names")

    private List<String> metricNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_values")

    private List<Double> metricValues = null;

    public TopRiskInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public TopRiskInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public TopRiskInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TopRiskInfo withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public TopRiskInfo addMetricNamesItem(String metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public TopRiskInfo withMetricNames(Consumer<List<String>> metricNamesSetter) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        metricNamesSetter.accept(this.metricNames);
        return this;
    }

    /**
     * 指标名称。
     * @return metricNames
     */
    public List<String> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
    }

    public TopRiskInfo withMetricValues(List<Double> metricValues) {
        this.metricValues = metricValues;
        return this;
    }

    public TopRiskInfo addMetricValuesItem(Double metricValuesItem) {
        if (this.metricValues == null) {
            this.metricValues = new ArrayList<>();
        }
        this.metricValues.add(metricValuesItem);
        return this;
    }

    public TopRiskInfo withMetricValues(Consumer<List<Double>> metricValuesSetter) {
        if (this.metricValues == null) {
            this.metricValues = new ArrayList<>();
        }
        metricValuesSetter.accept(this.metricValues);
        return this;
    }

    /**
     * 指标值,单位%。
     * @return metricValues
     */
    public List<Double> getMetricValues() {
        return metricValues;
    }

    public void setMetricValues(List<Double> metricValues) {
        this.metricValues = metricValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopRiskInfo that = (TopRiskInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.metricNames, that.metricNames)
            && Objects.equals(this.metricValues, that.metricValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, nodeId, metricNames, metricValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopRiskInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    metricNames: ").append(toIndentedString(metricNames)).append("\n");
        sb.append("    metricValues: ").append(toIndentedString(metricValues)).append("\n");
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
