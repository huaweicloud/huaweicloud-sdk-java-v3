package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEdgeNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_node_id")

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_external_node")

    private Boolean deleteExternalNode;

    public DeleteEdgeNodeRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    public DeleteEdgeNodeRequest withDeleteExternalNode(Boolean deleteExternalNode) {
        this.deleteExternalNode = deleteExternalNode;
        return this;
    }

    /**
     * 是否同时删除外部节点（仅对高级版有效），默认为false不删除IEF侧的边缘节点
     * @return deleteExternalNode
     */
    public Boolean getDeleteExternalNode() {
        return deleteExternalNode;
    }

    public void setDeleteExternalNode(Boolean deleteExternalNode) {
        this.deleteExternalNode = deleteExternalNode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteEdgeNodeRequest that = (DeleteEdgeNodeRequest) obj;
        return Objects.equals(this.edgeNodeId, that.edgeNodeId)
            && Objects.equals(this.deleteExternalNode, that.deleteExternalNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, deleteExternalNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEdgeNodeRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    deleteExternalNode: ").append(toIndentedString(deleteExternalNode)).append("\n");
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
