package com.huaweicloud.sdk.drs.v3.model;

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
public class ListAvailableNodeTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_types")

    private List<QuerySupportNodeTypeBean> nodeTypes = null;

    public ListAvailableNodeTypesResponse withNodeTypes(List<QuerySupportNodeTypeBean> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    public ListAvailableNodeTypesResponse addNodeTypesItem(QuerySupportNodeTypeBean nodeTypesItem) {
        if (this.nodeTypes == null) {
            this.nodeTypes = new ArrayList<>();
        }
        this.nodeTypes.add(nodeTypesItem);
        return this;
    }

    public ListAvailableNodeTypesResponse withNodeTypes(Consumer<List<QuerySupportNodeTypeBean>> nodeTypesSetter) {
        if (this.nodeTypes == null) {
            this.nodeTypes = new ArrayList<>();
        }
        nodeTypesSetter.accept(this.nodeTypes);
        return this;
    }

    /**
     * Node规格列表
     * @return nodeTypes
     */
    public List<QuerySupportNodeTypeBean> getNodeTypes() {
        return nodeTypes;
    }

    public void setNodeTypes(List<QuerySupportNodeTypeBean> nodeTypes) {
        this.nodeTypes = nodeTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailableNodeTypesResponse that = (ListAvailableNodeTypesResponse) obj;
        return Objects.equals(this.nodeTypes, that.nodeTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableNodeTypesResponse {\n");
        sb.append("    nodeTypes: ").append(toIndentedString(nodeTypes)).append("\n");
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
