package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListKeyViewExecuteNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<OpsKeyViewExecuteNodeResult> nodes = null;

    public ListKeyViewExecuteNodeResponse withNodes(List<OpsKeyViewExecuteNodeResult> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ListKeyViewExecuteNodeResponse addNodesItem(OpsKeyViewExecuteNodeResult nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListKeyViewExecuteNodeResponse withNodes(Consumer<List<OpsKeyViewExecuteNodeResult>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**: 节点信息列表。
     * @return nodes
     */
    public List<OpsKeyViewExecuteNodeResult> getNodes() {
        return nodes;
    }

    public void setNodes(List<OpsKeyViewExecuteNodeResult> nodes) {
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
        ListKeyViewExecuteNodeResponse that = (ListKeyViewExecuteNodeResponse) obj;
        return Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeyViewExecuteNodeResponse {\n");
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
