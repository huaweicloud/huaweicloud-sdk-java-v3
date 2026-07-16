package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * 轮转节点证书参数。
 */
public class RotateCertNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeID")

    private UUID nodeID;

    public RotateCertNode withNodeID(UUID nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    /**
     * **参数解释**： 节点ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return nodeID
     */
    public UUID getNodeID() {
        return nodeID;
    }

    public void setNodeID(UUID nodeID) {
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
        RotateCertNode that = (RotateCertNode) obj;
        return Objects.equals(this.nodeID, that.nodeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RotateCertNode {\n");
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
