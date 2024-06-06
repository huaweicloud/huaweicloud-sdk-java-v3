package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ClusterNode> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_total")

    private Integer nodeTotal;

    public ListNodesResponse withNodes(List<ClusterNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ListNodesResponse addNodesItem(ClusterNode nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListNodesResponse withNodes(Consumer<List<ClusterNode>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点列表。
     * @return nodes
     */
    public List<ClusterNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<ClusterNode> nodes) {
        this.nodes = nodes;
    }

    public ListNodesResponse withNodeTotal(Integer nodeTotal) {
        this.nodeTotal = nodeTotal;
        return this;
    }

    /**
     * 节点数。
     * minimum: 0
     * @return nodeTotal
     */
    public Integer getNodeTotal() {
        return nodeTotal;
    }

    public void setNodeTotal(Integer nodeTotal) {
        this.nodeTotal = nodeTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNodesResponse that = (ListNodesResponse) obj;
        return Objects.equals(this.nodes, that.nodes) && Objects.equals(this.nodeTotal, that.nodeTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, nodeTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodesResponse {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    nodeTotal: ").append(toIndentedString(nodeTotal)).append("\n");
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
