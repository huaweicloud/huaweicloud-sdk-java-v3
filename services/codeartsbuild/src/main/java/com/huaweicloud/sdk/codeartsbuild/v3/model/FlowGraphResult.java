package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class FlowGraphResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edges")

    private List<FlowGraphResultEdges> edges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertices")

    private List<Vertices> vertices = null;

    public FlowGraphResult withEdges(List<FlowGraphResultEdges> edges) {
        this.edges = edges;
        return this;
    }

    public FlowGraphResult addEdgesItem(FlowGraphResultEdges edgesItem) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        this.edges.add(edgesItem);
        return this;
    }

    public FlowGraphResult withEdges(Consumer<List<FlowGraphResultEdges>> edgesSetter) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        edgesSetter.accept(this.edges);
        return this;
    }

    /**
     * edges
     * @return edges
     */
    public List<FlowGraphResultEdges> getEdges() {
        return edges;
    }

    public void setEdges(List<FlowGraphResultEdges> edges) {
        this.edges = edges;
    }

    public FlowGraphResult withVertices(List<Vertices> vertices) {
        this.vertices = vertices;
        return this;
    }

    public FlowGraphResult addVerticesItem(Vertices verticesItem) {
        if (this.vertices == null) {
            this.vertices = new ArrayList<>();
        }
        this.vertices.add(verticesItem);
        return this;
    }

    public FlowGraphResult withVertices(Consumer<List<Vertices>> verticesSetter) {
        if (this.vertices == null) {
            this.vertices = new ArrayList<>();
        }
        verticesSetter.accept(this.vertices);
        return this;
    }

    /**
     * record信息
     * @return vertices
     */
    public List<Vertices> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertices> vertices) {
        this.vertices = vertices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowGraphResult that = (FlowGraphResult) obj;
        return Objects.equals(this.edges, that.edges) && Objects.equals(this.vertices, that.vertices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges, vertices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowGraphResult {\n");
        sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
        sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
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
