package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchBindPoolNodesReq
 */
public class BatchBindPoolNodesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<BindNodeItem> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drain")

    private Boolean drain;

    public BatchBindPoolNodesReq withNodes(List<BindNodeItem> nodes) {
        this.nodes = nodes;
        return this;
    }

    public BatchBindPoolNodesReq addNodesItem(BindNodeItem nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public BatchBindPoolNodesReq withNodes(Consumer<List<BindNodeItem>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**：需要进行换绑的节点列表。 **约束限制**：不涉及。
     * @return nodes
     */
    public List<BindNodeItem> getNodes() {
        return nodes;
    }

    public void setNodes(List<BindNodeItem> nodes) {
        this.nodes = nodes;
    }

    public BatchBindPoolNodesReq withDrain(Boolean drain) {
        this.drain = drain;
        return this;
    }

    /**
     * **参数解释**：是否对换绑的节点进行排水。 **约束限制**：不涉及。 **取值范围**： - true：排水 - false：不排水 **默认取值**：不涉及。
     * @return drain
     */
    public Boolean getDrain() {
        return drain;
    }

    public void setDrain(Boolean drain) {
        this.drain = drain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBindPoolNodesReq that = (BatchBindPoolNodesReq) obj;
        return Objects.equals(this.nodes, that.nodes) && Objects.equals(this.drain, that.drain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, drain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBindPoolNodesReq {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    drain: ").append(toIndentedString(drain)).append("\n");
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
