package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.QueryAuthorizedNodeDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchAssociateNaToNodesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    private List<QueryAuthorizedNodeDTO> nodes = null;
    
    public BatchAssociateNaToNodesResponse withNodes(List<QueryAuthorizedNodeDTO> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public BatchAssociateNaToNodesResponse addNodesItem(QueryAuthorizedNodeDTO nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public BatchAssociateNaToNodesResponse withNodes(Consumer<List<QueryAuthorizedNodeDTO>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 授权北向NA信息到边缘节点列表的返回结构体，仅返回本次授权的节点列表信息
     * @return nodes
     */
    public List<QueryAuthorizedNodeDTO> getNodes() {
        return nodes;
    }

    public void setNodes(List<QueryAuthorizedNodeDTO> nodes) {
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
        BatchAssociateNaToNodesResponse batchAssociateNaToNodesResponse = (BatchAssociateNaToNodesResponse) o;
        return Objects.equals(this.nodes, batchAssociateNaToNodesResponse.nodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssociateNaToNodesResponse {\n");
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

