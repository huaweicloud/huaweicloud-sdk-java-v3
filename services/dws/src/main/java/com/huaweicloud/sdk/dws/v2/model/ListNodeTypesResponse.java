package com.huaweicloud.sdk.dws.v2.model;

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
public class ListNodeTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_types")

    private List<NodeTypes> nodeTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListNodeTypesResponse withNodeTypes(List<NodeTypes> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    public ListNodeTypesResponse addNodeTypesItem(NodeTypes nodeTypesItem) {
        if (this.nodeTypes == null) {
            this.nodeTypes = new ArrayList<>();
        }
        this.nodeTypes.add(nodeTypesItem);
        return this;
    }

    public ListNodeTypesResponse withNodeTypes(Consumer<List<NodeTypes>> nodeTypesSetter) {
        if (this.nodeTypes == null) {
            this.nodeTypes = new ArrayList<>();
        }
        nodeTypesSetter.accept(this.nodeTypes);
        return this;
    }

    /**
     * **参数解释**： 可用的规格列表。 **取值范围**： 非空对象列表。
     * @return nodeTypes
     */
    public List<NodeTypes> getNodeTypes() {
        return nodeTypes;
    }

    public void setNodeTypes(List<NodeTypes> nodeTypes) {
        this.nodeTypes = nodeTypes;
    }

    public ListNodeTypesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 规格总数 **取值范围**： 大于等于0的正整数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNodeTypesResponse that = (ListNodeTypesResponse) obj;
        return Objects.equals(this.nodeTypes, that.nodeTypes) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeTypes, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodeTypesResponse {\n");
        sb.append("    nodeTypes: ").append(toIndentedString(nodeTypes)).append("\n");
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
