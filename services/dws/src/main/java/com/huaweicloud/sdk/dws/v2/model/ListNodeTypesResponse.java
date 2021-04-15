package com.huaweicloud.sdk.dws.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.NodeTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNodeTypesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_types")
    
    private List<NodeTypes> nodeTypes = null;
    
    public ListNodeTypesResponse withNodeTypes(List<NodeTypes> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    
    public ListNodeTypesResponse addNodeTypesItem(NodeTypes nodeTypesItem) {
        if(this.nodeTypes == null) {
            this.nodeTypes = new ArrayList<>();
        }
        this.nodeTypes.add(nodeTypesItem);
        return this;
    }

    public ListNodeTypesResponse withNodeTypes(Consumer<List<NodeTypes>> nodeTypesSetter) {
        if(this.nodeTypes == null) {
            this.nodeTypes = new ArrayList<>();
        }
        nodeTypesSetter.accept(this.nodeTypes);
        return this;
    }

    /**
     * 节点类型对象列表
     * @return nodeTypes
     */
    public List<NodeTypes> getNodeTypes() {
        return nodeTypes;
    }

    public void setNodeTypes(List<NodeTypes> nodeTypes) {
        this.nodeTypes = nodeTypes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNodeTypesResponse listNodeTypesResponse = (ListNodeTypesResponse) o;
        return Objects.equals(this.nodeTypes, listNodeTypesResponse.nodeTypes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeTypes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodeTypesResponse {\n");
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

