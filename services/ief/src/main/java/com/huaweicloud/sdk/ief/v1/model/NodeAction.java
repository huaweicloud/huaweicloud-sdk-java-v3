package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 节点启停 */
public class NodeAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node")

    private Action node;

    public NodeAction withNode(Action node) {
        this.node = node;
        return this;
    }

    public NodeAction withNode(Consumer<Action> nodeSetter) {
        if (this.node == null) {
            this.node = new Action();
            nodeSetter.accept(this.node);
        }

        return this;
    }

    /** Get node
     * 
     * @return node */
    public Action getNode() {
        return node;
    }

    public void setNode(Action node) {
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
        NodeAction nodeAction = (NodeAction) o;
        return Objects.equals(this.node, nodeAction.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeAction {\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
