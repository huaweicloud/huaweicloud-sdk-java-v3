package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RiskInfo对象
 */
public class RiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private InstanceInfoForRisk instanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<Double> values = null;

    public RiskInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public RiskInfo withInstanceInfo(InstanceInfoForRisk instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public RiskInfo withInstanceInfo(Consumer<InstanceInfoForRisk> instanceInfoSetter) {
        if (this.instanceInfo == null) {
            this.instanceInfo = new InstanceInfoForRisk();
            instanceInfoSetter.accept(this.instanceInfo);
        }

        return this;
    }

    /**
     * Get instanceInfo
     * @return instanceInfo
     */
    public InstanceInfoForRisk getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(InstanceInfoForRisk instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    public RiskInfo withValues(List<Double> values) {
        this.values = values;
        return this;
    }

    public RiskInfo addValuesItem(Double valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public RiskInfo withValues(Consumer<List<Double>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 指标值
     * @return values
     */
    public List<Double> getValues() {
        return values;
    }

    public void setValues(List<Double> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskInfo that = (RiskInfo) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.instanceInfo, that.instanceInfo)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, instanceInfo, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskInfo {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
