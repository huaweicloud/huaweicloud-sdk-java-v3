package com.huaweicloud.sdk.ief.v1.model;

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
public class ListEdgeNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<EdgeNodeResp> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListEdgeNodesResponse withNodes(List<EdgeNodeResp> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ListEdgeNodesResponse addNodesItem(EdgeNodeResp nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListEdgeNodesResponse withNodes(Consumer<List<EdgeNodeResp>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 边缘节点列表
     * @return nodes
     */
    public List<EdgeNodeResp> getNodes() {
        return nodes;
    }

    public void setNodes(List<EdgeNodeResp> nodes) {
        this.nodes = nodes;
    }

    public ListEdgeNodesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 满足条件的边缘节点个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEdgeNodesResponse listEdgeNodesResponse = (ListEdgeNodesResponse) o;
        return Objects.equals(this.nodes, listEdgeNodesResponse.nodes)
            && Objects.equals(this.count, listEdgeNodesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeNodesResponse {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
