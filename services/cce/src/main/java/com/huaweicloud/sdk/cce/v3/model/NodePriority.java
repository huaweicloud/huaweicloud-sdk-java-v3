package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点优先级批量配置
 */
public class NodePriority {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeSelector")

    private NodeSelector nodeSelector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public NodePriority withNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public NodePriority withNodeSelector(Consumer<NodeSelector> nodeSelectorSetter) {
        if (this.nodeSelector == null) {
            this.nodeSelector = new NodeSelector();
            nodeSelectorSetter.accept(this.nodeSelector);
        }

        return this;
    }

    /**
     * Get nodeSelector
     * @return nodeSelector
     */
    public NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public NodePriority withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 该批次节点的优先级，默认值为0，优先级最低，数值越大优先级越高
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodePriority nodePriority = (NodePriority) o;
        return Objects.equals(this.nodeSelector, nodePriority.nodeSelector)
            && Objects.equals(this.priority, nodePriority.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeSelector, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePriority {\n");
        sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
