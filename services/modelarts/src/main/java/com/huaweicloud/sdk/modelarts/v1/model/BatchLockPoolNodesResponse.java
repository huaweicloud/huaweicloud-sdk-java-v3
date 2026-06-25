package com.huaweicloud.sdk.modelarts.v1.model;

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
public class BatchLockPoolNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<NodesResultMsg> nodes = null;

    public BatchLockPoolNodesResponse withNodes(List<NodesResultMsg> nodes) {
        this.nodes = nodes;
        return this;
    }

    public BatchLockPoolNodesResponse addNodesItem(NodesResultMsg nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public BatchLockPoolNodesResponse withNodes(Consumer<List<NodesResultMsg>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**：批量操作的资源池节点ID列表及状态。
     * @return nodes
     */
    public List<NodesResultMsg> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodesResultMsg> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchLockPoolNodesResponse that = (BatchLockPoolNodesResponse) obj;
        return Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchLockPoolNodesResponse {\n");
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
