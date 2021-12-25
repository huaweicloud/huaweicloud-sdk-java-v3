package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 边缘节点的终端设备信息 */
public class EdgeNodeUpdateByDevice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private NodeUpdateByDevice nodes;

    public EdgeNodeUpdateByDevice withNodes(NodeUpdateByDevice nodes) {
        this.nodes = nodes;
        return this;
    }

    public EdgeNodeUpdateByDevice withNodes(Consumer<NodeUpdateByDevice> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new NodeUpdateByDevice();
            nodesSetter.accept(this.nodes);
        }

        return this;
    }

    /** Get nodes
     * 
     * @return nodes */
    public NodeUpdateByDevice getNodes() {
        return nodes;
    }

    public void setNodes(NodeUpdateByDevice nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeNodeUpdateByDevice edgeNodeUpdateByDevice = (EdgeNodeUpdateByDevice) o;
        return Objects.equals(this.nodes, edgeNodeUpdateByDevice.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeUpdateByDevice {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
