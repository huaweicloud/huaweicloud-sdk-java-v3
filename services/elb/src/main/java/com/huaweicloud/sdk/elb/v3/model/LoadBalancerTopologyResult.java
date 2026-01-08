package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class LoadBalancerTopologyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private TopologyNodes nodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edges")

    private List<TopologyEdge> edges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private TopologyLabels labels;

    public LoadBalancerTopologyResult withNodes(TopologyNodes nodes) {
        this.nodes = nodes;
        return this;
    }

    public LoadBalancerTopologyResult withNodes(Consumer<TopologyNodes> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new TopologyNodes();
            nodesSetter.accept(this.nodes);
        }

        return this;
    }

    /**
     * Get nodes
     * @return nodes
     */
    public TopologyNodes getNodes() {
        return nodes;
    }

    public void setNodes(TopologyNodes nodes) {
        this.nodes = nodes;
    }

    public LoadBalancerTopologyResult withEdges(List<TopologyEdge> edges) {
        this.edges = edges;
        return this;
    }

    public LoadBalancerTopologyResult addEdgesItem(TopologyEdge edgesItem) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        this.edges.add(edgesItem);
        return this;
    }

    public LoadBalancerTopologyResult withEdges(Consumer<List<TopologyEdge>> edgesSetter) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        edgesSetter.accept(this.edges);
        return this;
    }

    /**
     * **参数解释**：拓扑边的信息
     * @return edges
     */
    public List<TopologyEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<TopologyEdge> edges) {
        this.edges = edges;
    }

    public LoadBalancerTopologyResult withLabels(TopologyLabels labels) {
        this.labels = labels;
        return this;
    }

    public LoadBalancerTopologyResult withLabels(Consumer<TopologyLabels> labelsSetter) {
        if (this.labels == null) {
            this.labels = new TopologyLabels();
            labelsSetter.accept(this.labels);
        }

        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public TopologyLabels getLabels() {
        return labels;
    }

    public void setLabels(TopologyLabels labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadBalancerTopologyResult that = (LoadBalancerTopologyResult) obj;
        return Objects.equals(this.nodes, that.nodes) && Objects.equals(this.edges, that.edges)
            && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, edges, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerTopologyResult {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
