package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：超时代答节点信息。
 */
public class ProxyResponseDelimitNodeList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_index")

    private Integer nodeIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate")

    private String rate;

    public ProxyResponseDelimitNodeList withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**：超时代答节点id。 **取值范围**：不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ProxyResponseDelimitNodeList withNodeIndex(Integer nodeIndex) {
        this.nodeIndex = nodeIndex;
        return this;
    }

    /**
     * **参数解释**：超时代答节点所在超节点序号。 **取值范围**：不涉及。
     * @return nodeIndex
     */
    public Integer getNodeIndex() {
        return nodeIndex;
    }

    public void setNodeIndex(Integer nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public ProxyResponseDelimitNodeList withRate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * **参数解释**：根因概率。 **取值范围**：不涉及。
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyResponseDelimitNodeList that = (ProxyResponseDelimitNodeList) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeIndex, that.nodeIndex)
            && Objects.equals(this.rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, nodeIndex, rate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyResponseDelimitNodeList {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeIndex: ").append(toIndentedString(nodeIndex)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
