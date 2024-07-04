package com.huaweicloud.sdk.vias.v2.model;

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
public class ListEdgePoolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_pools")

    private List<EdgePoolListItemDto> edgePools = null;

    public ListEdgePoolsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 边缘资源池总量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListEdgePoolsResponse withEdgePools(List<EdgePoolListItemDto> edgePools) {
        this.edgePools = edgePools;
        return this;
    }

    public ListEdgePoolsResponse addEdgePoolsItem(EdgePoolListItemDto edgePoolsItem) {
        if (this.edgePools == null) {
            this.edgePools = new ArrayList<>();
        }
        this.edgePools.add(edgePoolsItem);
        return this;
    }

    public ListEdgePoolsResponse withEdgePools(Consumer<List<EdgePoolListItemDto>> edgePoolsSetter) {
        if (this.edgePools == null) {
            this.edgePools = new ArrayList<>();
        }
        edgePoolsSetter.accept(this.edgePools);
        return this;
    }

    /**
     * 边缘资源池列表响应体
     * @return edgePools
     */
    public List<EdgePoolListItemDto> getEdgePools() {
        return edgePools;
    }

    public void setEdgePools(List<EdgePoolListItemDto> edgePools) {
        this.edgePools = edgePools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgePoolsResponse that = (ListEdgePoolsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.edgePools, that.edgePools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, edgePools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgePoolsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    edgePools: ").append(toIndentedString(edgePools)).append("\n");
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
