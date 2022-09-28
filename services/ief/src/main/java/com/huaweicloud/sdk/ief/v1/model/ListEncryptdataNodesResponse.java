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
public class ListEncryptdataNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<EncryptDataNodes> nodes = null;

    public ListEncryptdataNodesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 绑定的边缘节点总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListEncryptdataNodesResponse withNodes(List<EncryptDataNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ListEncryptdataNodesResponse addNodesItem(EncryptDataNodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListEncryptdataNodesResponse withNodes(Consumer<List<EncryptDataNodes>> nodesSetter) {
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
    public List<EncryptDataNodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<EncryptDataNodes> nodes) {
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
        ListEncryptdataNodesResponse listEncryptdataNodesResponse = (ListEncryptdataNodesResponse) o;
        return Objects.equals(this.count, listEncryptdataNodesResponse.count)
            && Objects.equals(this.nodes, listEncryptdataNodesResponse.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEncryptdataNodesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
