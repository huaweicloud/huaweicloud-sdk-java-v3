package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Resize
 */
public class Resize {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_node")

    private Integer numberOfNode;

    public Resize withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 调整大小目标规格
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Resize withNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
        return this;
    }

    /**
     * 调整大小目标节点数
     * @return numberOfNode
     */
    public Integer getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resize that = (Resize) obj;
        return Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.numberOfNode, that.numberOfNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeType, numberOfNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resize {\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    numberOfNode: ").append(toIndentedString(numberOfNode)).append("\n");
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
