package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点规格变更参数
 */
public class NodeResizeParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodePool")

    private String nodePool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatingStep")

    private Object creatingStep;

    public NodeResizeParams withNodePool(String nodePool) {
        this.nodePool = nodePool;
        return this;
    }

    /**
     * **参数解释**：节点池。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nodePool
     */
    public String getNodePool() {
        return nodePool;
    }

    public void setNodePool(String nodePool) {
        this.nodePool = nodePool;
    }

    public NodeResizeParams withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：规格。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public NodeResizeParams withCreatingStep(Object creatingStep) {
        this.creatingStep = creatingStep;
        return this;
    }

    /**
     * **参数解释**：步长。 **约束限制**：不涉及。
     * @return creatingStep
     */
    public Object getCreatingStep() {
        return creatingStep;
    }

    public void setCreatingStep(Object creatingStep) {
        this.creatingStep = creatingStep;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeResizeParams that = (NodeResizeParams) obj;
        return Objects.equals(this.nodePool, that.nodePool) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.creatingStep, that.creatingStep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodePool, flavor, creatingStep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeResizeParams {\n");
        sb.append("    nodePool: ").append(toIndentedString(nodePool)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    creatingStep: ").append(toIndentedString(creatingStep)).append("\n");
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
