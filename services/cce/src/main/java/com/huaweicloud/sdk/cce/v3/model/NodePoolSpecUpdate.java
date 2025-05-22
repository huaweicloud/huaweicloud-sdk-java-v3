package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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
    @JsonProperty(value = "ignoreInitialNodeCount")

    private Boolean ignoreInitialNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private NodePoolNodeAutoscaling autoscaling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeManagementUpdate")

    private NodeManagement nodeManagementUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taintPolicyOnExistingNodes")

    private String taintPolicyOnExistingNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelPolicyOnExistingNodes")

    private String labelPolicyOnExistingNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userTagsPolicyOnExistingNodes")

    private String userTagsPolicyOnExistingNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensionScaleGroups")

    private List<ExtensionScaleGroup> extensionScaleGroups = null;

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
     * **参数解释：** 节点池期望节点个数。 **约束限制：** 更新节点池时，此字段为必填字段。 > 注意：如果更新节点池时不填此字段，节点池期望节点个数将取默认值0，如果此时节点池节点个数大于0将导致节点池缩容。  **取值范围：** 大于0，小于集群节点规模。 **默认取值：** 0
     * @return initialNodeCount
     */
    public Integer getInitialNodeCount() {
        return initialNodeCount;
    }

    public void setInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
    }

    public NodePoolSpecUpdate withIgnoreInitialNodeCount(Boolean ignoreInitialNodeCount) {
        this.ignoreInitialNodeCount = ignoreInitialNodeCount;
        return this;
    }

    /**
     * **参数解释：** 该参数用于控制更新节点池时 **节点池期望节点个数(spec.initialNodeCount)** 的默认行为。当该参数未设置或者为false时，如果用户请求Body体中未设置spec.initialNodeCount，更新时将自动初始化spec.initialNodeCount为0。当该参数为true时，将忽略spec.initialNodeCount参数。 > 当用户不需要更新节点池spec.initialNodeCount时，必须显示的设置该参数为true，同时在更新节点池Body体中不设置spec.initialNodeCount。  **约束限制：** 不涉及 **取值范围：** - false：更新节点池时，如果spec.initialNodeCount参数未设置，将初始化spec.initialNodeCount为0。 > 如果节点池当前spec.initialNodeCount 不等于0将导致节点池缩容。  - true：更新节点池时，忽略spec.initialNodeCount参数，节点池spec.initialNodeCount参数将保持原样。  **默认取值：** false
     * @return ignoreInitialNodeCount
     */
    public Boolean getIgnoreInitialNodeCount() {
        return ignoreInitialNodeCount;
    }

    public void setIgnoreInitialNodeCount(Boolean ignoreInitialNodeCount) {
        this.ignoreInitialNodeCount = ignoreInitialNodeCount;
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

    public NodePoolSpecUpdate withNodeManagementUpdate(NodeManagement nodeManagementUpdate) {
        this.nodeManagementUpdate = nodeManagementUpdate;
        return this;
    }

    public NodePoolSpecUpdate withNodeManagementUpdate(Consumer<NodeManagement> nodeManagementUpdateSetter) {
        if (this.nodeManagementUpdate == null) {
            this.nodeManagementUpdate = new NodeManagement();
            nodeManagementUpdateSetter.accept(this.nodeManagementUpdate);
        }

        return this;
    }

    /**
     * Get nodeManagementUpdate
     * @return nodeManagementUpdate
     */
    public NodeManagement getNodeManagementUpdate() {
        return nodeManagementUpdate;
    }

    public void setNodeManagementUpdate(NodeManagement nodeManagementUpdate) {
        this.nodeManagementUpdate = nodeManagementUpdate;
    }

    public NodePoolSpecUpdate withTaintPolicyOnExistingNodes(String taintPolicyOnExistingNodes) {
        this.taintPolicyOnExistingNodes = taintPolicyOnExistingNodes;
        return this;
    }

    /**
     * **参数解释：** 是否同步K8S污点。 **约束限制**： 不涉及 **取值范围：** - 填写为refresh，K8S污点的改动将会被同步更新到存量节点上。 - 填写为ignore，节点池K8S污点将不会同步更新到存量节点上。  **默认取值：** 无
     * @return taintPolicyOnExistingNodes
     */
    public String getTaintPolicyOnExistingNodes() {
        return taintPolicyOnExistingNodes;
    }

    public void setTaintPolicyOnExistingNodes(String taintPolicyOnExistingNodes) {
        this.taintPolicyOnExistingNodes = taintPolicyOnExistingNodes;
    }

    public NodePoolSpecUpdate withLabelPolicyOnExistingNodes(String labelPolicyOnExistingNodes) {
        this.labelPolicyOnExistingNodes = labelPolicyOnExistingNodes;
        return this;
    }

    /**
     * **参数解释：** 是否同步K8S标签。 **约束限制**： 不涉及 **取值范围：** - 填写为refresh，K8S标签的改动将会被同步更新到存量节点上。 - 填写为ignore，K8S标签将不会同步更新到存量节点上。  **默认取值：** 无
     * @return labelPolicyOnExistingNodes
     */
    public String getLabelPolicyOnExistingNodes() {
        return labelPolicyOnExistingNodes;
    }

    public void setLabelPolicyOnExistingNodes(String labelPolicyOnExistingNodes) {
        this.labelPolicyOnExistingNodes = labelPolicyOnExistingNodes;
    }

    public NodePoolSpecUpdate withUserTagsPolicyOnExistingNodes(String userTagsPolicyOnExistingNodes) {
        this.userTagsPolicyOnExistingNodes = userTagsPolicyOnExistingNodes;
        return this;
    }

    /**
     * **参数解释：** 是否同步节点池资源标签。 **约束限制**： 不涉及 **取值范围：** - 填写为refresh，节点池资源标签标签的改动将会被同步更新到存量节点上。 - 填写为ignore，节点池资源标签标签将不会同步更新到存量节点上。  **默认取值：** 无
     * @return userTagsPolicyOnExistingNodes
     */
    public String getUserTagsPolicyOnExistingNodes() {
        return userTagsPolicyOnExistingNodes;
    }

    public void setUserTagsPolicyOnExistingNodes(String userTagsPolicyOnExistingNodes) {
        this.userTagsPolicyOnExistingNodes = userTagsPolicyOnExistingNodes;
    }

    public NodePoolSpecUpdate withExtensionScaleGroups(List<ExtensionScaleGroup> extensionScaleGroups) {
        this.extensionScaleGroups = extensionScaleGroups;
        return this;
    }

    public NodePoolSpecUpdate addExtensionScaleGroupsItem(ExtensionScaleGroup extensionScaleGroupsItem) {
        if (this.extensionScaleGroups == null) {
            this.extensionScaleGroups = new ArrayList<>();
        }
        this.extensionScaleGroups.add(extensionScaleGroupsItem);
        return this;
    }

    public NodePoolSpecUpdate withExtensionScaleGroups(Consumer<List<ExtensionScaleGroup>> extensionScaleGroupsSetter) {
        if (this.extensionScaleGroups == null) {
            this.extensionScaleGroups = new ArrayList<>();
        }
        extensionScaleGroupsSetter.accept(this.extensionScaleGroups);
        return this;
    }

    /**
     * 节点池扩展伸缩组配置列表，详情参见ExtensionScaleGroup类型定义
     * @return extensionScaleGroups
     */
    public List<ExtensionScaleGroup> getExtensionScaleGroups() {
        return extensionScaleGroups;
    }

    public void setExtensionScaleGroups(List<ExtensionScaleGroup> extensionScaleGroups) {
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
            && Objects.equals(this.ignoreInitialNodeCount, that.ignoreInitialNodeCount)
            && Objects.equals(this.autoscaling, that.autoscaling)
            && Objects.equals(this.nodeManagementUpdate, that.nodeManagementUpdate)
            && Objects.equals(this.taintPolicyOnExistingNodes, that.taintPolicyOnExistingNodes)
            && Objects.equals(this.labelPolicyOnExistingNodes, that.labelPolicyOnExistingNodes)
            && Objects.equals(this.userTagsPolicyOnExistingNodes, that.userTagsPolicyOnExistingNodes)
            && Objects.equals(this.extensionScaleGroups, that.extensionScaleGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeTemplate,
            initialNodeCount,
            ignoreInitialNodeCount,
            autoscaling,
            nodeManagementUpdate,
            taintPolicyOnExistingNodes,
            labelPolicyOnExistingNodes,
            userTagsPolicyOnExistingNodes,
            extensionScaleGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolSpecUpdate {\n");
        sb.append("    nodeTemplate: ").append(toIndentedString(nodeTemplate)).append("\n");
        sb.append("    initialNodeCount: ").append(toIndentedString(initialNodeCount)).append("\n");
        sb.append("    ignoreInitialNodeCount: ").append(toIndentedString(ignoreInitialNodeCount)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("    nodeManagementUpdate: ").append(toIndentedString(nodeManagementUpdate)).append("\n");
        sb.append("    taintPolicyOnExistingNodes: ").append(toIndentedString(taintPolicyOnExistingNodes)).append("\n");
        sb.append("    labelPolicyOnExistingNodes: ").append(toIndentedString(labelPolicyOnExistingNodes)).append("\n");
        sb.append("    userTagsPolicyOnExistingNodes: ")
            .append(toIndentedString(userTagsPolicyOnExistingNodes))
            .append("\n");
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
