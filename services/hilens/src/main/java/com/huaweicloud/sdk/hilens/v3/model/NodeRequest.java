package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeRequest
 */
public class NodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node")

    private NodeReqDetail node;

    public NodeRequest withNode(NodeReqDetail node) {
        this.node = node;
        return this;
    }

    public NodeRequest withNode(Consumer<NodeReqDetail> nodeSetter) {
        if (this.node == null) {
            this.node = new NodeReqDetail();
            nodeSetter.accept(this.node);
        }

        return this;
    }

    /**
     * Get node
     * @return node
     */
    public NodeReqDetail getNode() {
        return node;
    }

    public void setNode(NodeReqDetail node) {
        this.node = node;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeRequest nodeRequest = (NodeRequest) o;
        return Objects.equals(this.node, nodeRequest.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeRequest {\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
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
