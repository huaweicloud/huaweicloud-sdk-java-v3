package com.huaweicloud.sdk.dris.v1.model;

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
public class ListV2xEdgesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edges")

    private List<V2XEdgeListResponseDTO> edges = null;

    public ListV2xEdgesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListV2xEdgesResponse withEdges(List<V2XEdgeListResponseDTO> edges) {
        this.edges = edges;
        return this;
    }

    public ListV2xEdgesResponse addEdgesItem(V2XEdgeListResponseDTO edgesItem) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        this.edges.add(edgesItem);
        return this;
    }

    public ListV2xEdgesResponse withEdges(Consumer<List<V2XEdgeListResponseDTO>> edgesSetter) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        edgesSetter.accept(this.edges);
        return this;
    }

    /**
     * **参数说明**：数据列表。
     * @return edges
     */
    public List<V2XEdgeListResponseDTO> getEdges() {
        return edges;
    }

    public void setEdges(List<V2XEdgeListResponseDTO> edges) {
        this.edges = edges;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListV2xEdgesResponse listV2xEdgesResponse = (ListV2xEdgesResponse) o;
        return Objects.equals(this.count, listV2xEdgesResponse.count)
            && Objects.equals(this.edges, listV2xEdgesResponse.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, edges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2xEdgesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
