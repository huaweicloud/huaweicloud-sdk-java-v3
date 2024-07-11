package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NodePoolSpecUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeTemplate")

    private NodeSpecUpdate nodeTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialNodeCount")

    private Integer initialNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private NodePoolNodeAutoscaling autoscaling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensionScaleGroups")

    private ExtensionScaleGroup extensionScaleGroups;

    public NodePoolSpecUpdate withNodeTemplate(NodeSpecUpdate nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
        return this;
    }

    public NodePoolSpecUpdate withNodeTemplate(Consumer<NodeSpecUpdate> nodeTemplateSetter) {
        if (this.nodeTemplate == null) {
            this.nodeTemplate = new NodeSpecUpdate();
            nodeTemplateSetter.accept(this.nodeTemplate);
        }

        return this;
    }

    /**
     * Get nodeTemplate
     * @return nodeTemplate
     */
    public NodeSpecUpdate getNodeTemplate() {
        return nodeTemplate;
    }

    public void setNodeTemplate(NodeSpecUpdate nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
    }

    public NodePoolSpecUpdate withInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
        return this;
    }

    /**
     * 节点池初始化节点个数。查询时为节点池目标节点数量。默认值为0。
     * @return initialNodeCount
     */
    public Integer getInitialNodeCount() {
        return initialNodeCount;
    }

    public void setInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
    }

    public NodePoolSpecUpdate withAutoscaling(NodePoolNodeAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public NodePoolSpecUpdate withAutoscaling(Consumer<NodePoolNodeAutoscaling> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new NodePoolNodeAutoscaling();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    /**
     * Get autoscaling
     * @return autoscaling
     */
    public NodePoolNodeAutoscaling getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(NodePoolNodeAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
    }

    public NodePoolSpecUpdate withExtensionScaleGroups(ExtensionScaleGroup extensionScaleGroups) {
        this.extensionScaleGroups = extensionScaleGroups;
        return this;
    }

    public NodePoolSpecUpdate withExtensionScaleGroups(Consumer<ExtensionScaleGroup> extensionScaleGroupsSetter) {
        if (this.extensionScaleGroups == null) {
            this.extensionScaleGroups = new ExtensionScaleGroup();
            extensionScaleGroupsSetter.accept(this.extensionScaleGroups);
        }

        return this;
    }

    /**
     * Get extensionScaleGroups
     * @return extensionScaleGroups
     */
    public ExtensionScaleGroup getExtensionScaleGroups() {
        return extensionScaleGroups;
    }

    public void setExtensionScaleGroups(ExtensionScaleGroup extensionScaleGroups) {
        this.extensionScaleGroups = extensionScaleGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolSpecUpdate that = (NodePoolSpecUpdate) obj;
        return Objects.equals(this.nodeTemplate, that.nodeTemplate)
            && Objects.equals(this.initialNodeCount, that.initialNodeCount)
            && Objects.equals(this.autoscaling, that.autoscaling)
            && Objects.equals(this.extensionScaleGroups, that.extensionScaleGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeTemplate, initialNodeCount, autoscaling, extensionScaleGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolSpecUpdate {\n");
        sb.append("    nodeTemplate: ").append(toIndentedString(nodeTemplate)).append("\n");
        sb.append("    initialNodeCount: ").append(toIndentedString(initialNodeCount)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("    extensionScaleGroups: ").append(toIndentedString(extensionScaleGroups)).append("\n");
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
