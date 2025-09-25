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
public class ListReadonlyNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ListReadonlyNodesResult> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_readonly_node_num")

    private Integer maxReadonlyNodeNum;

    public ListReadonlyNodesResponse withNodes(List<ListReadonlyNodesResult> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ListReadonlyNodesResponse addNodesItem(ListReadonlyNodesResult nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListReadonlyNodesResponse withNodes(Consumer<List<ListReadonlyNodesResult>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**: 只读节点列表。 **约束限制**: 不涉及。
     * @return nodes
     */
    public List<ListReadonlyNodesResult> getNodes() {
        return nodes;
    }

    public void setNodes(List<ListReadonlyNodesResult> nodes) {
        this.nodes = nodes;
    }

    public ListReadonlyNodesResponse withMaxReadonlyNodeNum(Integer maxReadonlyNodeNum) {
        this.maxReadonlyNodeNum = maxReadonlyNodeNum;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **取值范围**: 不涉及。
     * @return maxReadonlyNodeNum
     */
    public Integer getMaxReadonlyNodeNum() {
        return maxReadonlyNodeNum;
    }

    public void setMaxReadonlyNodeNum(Integer maxReadonlyNodeNum) {
        this.maxReadonlyNodeNum = maxReadonlyNodeNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReadonlyNodesResponse that = (ListReadonlyNodesResponse) obj;
        return Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.maxReadonlyNodeNum, that.maxReadonlyNodeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, maxReadonlyNodeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReadonlyNodesResponse {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    maxReadonlyNodeNum: ").append(toIndentedString(maxReadonlyNodeNum)).append("\n");
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
