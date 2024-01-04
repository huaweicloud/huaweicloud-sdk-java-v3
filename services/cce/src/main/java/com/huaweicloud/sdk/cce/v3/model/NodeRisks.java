package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点风险来源
 */
public class NodeRisks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NodeID")

    private String nodeID;

    public NodeRisks withNodeID(String nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    /**
     * 用户节点ID
     * @return nodeID
     */
    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeRisks that = (NodeRisks) obj;
        return Objects.equals(this.nodeID, that.nodeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeRisks {\n");
        sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
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
