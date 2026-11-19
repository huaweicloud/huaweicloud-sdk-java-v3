package com.huaweicloud.sdk.kms.v2.model;

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
public class ShowKeyUsageFlowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ShowKeyUsageFlowResponseBodyNodes> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edges")

    private List<ShowKeyUsageFlowResponseBodyEdges> edges = null;

    public ShowKeyUsageFlowResponse withNodes(List<ShowKeyUsageFlowResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowKeyUsageFlowResponse addNodesItem(ShowKeyUsageFlowResponseBodyNodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowKeyUsageFlowResponse withNodes(Consumer<List<ShowKeyUsageFlowResponseBodyNodes>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释：** 使用流图节点列表，当前固定包含一个元素，元素内按类型分组展示各类节点 **取值范围：** 不涉及
     * @return nodes
     */
    public List<ShowKeyUsageFlowResponseBodyNodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<ShowKeyUsageFlowResponseBodyNodes> nodes) {
        this.nodes = nodes;
    }

    public ShowKeyUsageFlowResponse withEdges(List<ShowKeyUsageFlowResponseBodyEdges> edges) {
        this.edges = edges;
        return this;
    }

    public ShowKeyUsageFlowResponse addEdgesItem(ShowKeyUsageFlowResponseBodyEdges edgesItem) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        this.edges.add(edgesItem);
        return this;
    }

    public ShowKeyUsageFlowResponse withEdges(Consumer<List<ShowKeyUsageFlowResponseBodyEdges>> edgesSetter) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        edgesSetter.accept(this.edges);
        return this;
    }

    /**
     * **参数解释：** 使用流关系边列表，表示起点节点到策略节点、策略节点到密钥节点的使用流关系 **取值范围：** 不涉及
     * @return edges
     */
    public List<ShowKeyUsageFlowResponseBodyEdges> getEdges() {
        return edges;
    }

    public void setEdges(List<ShowKeyUsageFlowResponseBodyEdges> edges) {
        this.edges = edges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKeyUsageFlowResponse that = (ShowKeyUsageFlowResponse) obj;
        return Objects.equals(this.nodes, that.nodes) && Objects.equals(this.edges, that.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, edges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeyUsageFlowResponse {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
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
