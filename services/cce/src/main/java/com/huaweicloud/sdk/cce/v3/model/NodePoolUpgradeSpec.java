package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 同步点池请求详细参数
 */
public class NodePoolUpgradeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxUnavailable")

    private Integer maxUnavailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryTimes")

    private Integer retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skippedNodes")

    private List<String> skippedNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeIDs")

    private List<String> nodeIDs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodePoolID")

    private String nodePoolID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeTemplate")

    private NodeTemplate nodeTemplate;

    public NodePoolUpgradeSpec withMaxUnavailable(Integer maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    /**
     * **参数解释**： 每批最大同步节点。节点升级时，允许节点不可用的最大数量。节点重置方式进行同步时节点将不可用，请合理设置该参数，尽量避免出现集群节点不可用数量过多导致Pod无法调度的情况。 **约束限制**： 不涉及 **取值范围**： 取值范围[1-20] **默认取值**： 不涉及 
     * minimum: 1
     * maximum: 20
     * @return maxUnavailable
     */
    public Integer getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(Integer maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    public NodePoolUpgradeSpec withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Pod无法驱逐时，是否强制重置。
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public NodePoolUpgradeSpec withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * Get retryTimes
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public NodePoolUpgradeSpec withSkippedNodes(List<String> skippedNodes) {
        this.skippedNodes = skippedNodes;
        return this;
    }

    public NodePoolUpgradeSpec addSkippedNodesItem(String skippedNodesItem) {
        if (this.skippedNodes == null) {
            this.skippedNodes = new ArrayList<>();
        }
        this.skippedNodes.add(skippedNodesItem);
        return this;
    }

    public NodePoolUpgradeSpec withSkippedNodes(Consumer<List<String>> skippedNodesSetter) {
        if (this.skippedNodes == null) {
            this.skippedNodes = new ArrayList<>();
        }
        skippedNodesSetter.accept(this.skippedNodes);
        return this;
    }

    /**
     * Get skippedNodes
     * @return skippedNodes
     */
    public List<String> getSkippedNodes() {
        return skippedNodes;
    }

    public void setSkippedNodes(List<String> skippedNodes) {
        this.skippedNodes = skippedNodes;
    }

    public NodePoolUpgradeSpec withNodeIDs(List<String> nodeIDs) {
        this.nodeIDs = nodeIDs;
        return this;
    }

    public NodePoolUpgradeSpec addNodeIDsItem(String nodeIDsItem) {
        if (this.nodeIDs == null) {
            this.nodeIDs = new ArrayList<>();
        }
        this.nodeIDs.add(nodeIDsItem);
        return this;
    }

    public NodePoolUpgradeSpec withNodeIDs(Consumer<List<String>> nodeIDsSetter) {
        if (this.nodeIDs == null) {
            this.nodeIDs = new ArrayList<>();
        }
        nodeIDsSetter.accept(this.nodeIDs);
        return this;
    }

    /**
     * **参数解释**： 本次操作同步的节点池中选择的节点ID列表，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return nodeIDs
     */
    public List<String> getNodeIDs() {
        return nodeIDs;
    }

    public void setNodeIDs(List<String> nodeIDs) {
        this.nodeIDs = nodeIDs;
    }

    public NodePoolUpgradeSpec withNodePoolID(String nodePoolID) {
        this.nodePoolID = nodePoolID;
        return this;
    }

    /**
     * **参数解释**： 节点池ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return nodePoolID
     */
    public String getNodePoolID() {
        return nodePoolID;
    }

    public void setNodePoolID(String nodePoolID) {
        this.nodePoolID = nodePoolID;
    }

    public NodePoolUpgradeSpec withNodeTemplate(NodeTemplate nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
        return this;
    }

    public NodePoolUpgradeSpec withNodeTemplate(Consumer<NodeTemplate> nodeTemplateSetter) {
        if (this.nodeTemplate == null) {
            this.nodeTemplate = new NodeTemplate();
            nodeTemplateSetter.accept(this.nodeTemplate);
        }

        return this;
    }

    /**
     * Get nodeTemplate
     * @return nodeTemplate
     */
    public NodeTemplate getNodeTemplate() {
        return nodeTemplate;
    }

    public void setNodeTemplate(NodeTemplate nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolUpgradeSpec that = (NodePoolUpgradeSpec) obj;
        return Objects.equals(this.maxUnavailable, that.maxUnavailable) && Objects.equals(this.force, that.force)
            && Objects.equals(this.retryTimes, that.retryTimes) && Objects.equals(this.skippedNodes, that.skippedNodes)
            && Objects.equals(this.nodeIDs, that.nodeIDs) && Objects.equals(this.nodePoolID, that.nodePoolID)
            && Objects.equals(this.nodeTemplate, that.nodeTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxUnavailable, force, retryTimes, skippedNodes, nodeIDs, nodePoolID, nodeTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolUpgradeSpec {\n");
        sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    skippedNodes: ").append(toIndentedString(skippedNodes)).append("\n");
        sb.append("    nodeIDs: ").append(toIndentedString(nodeIDs)).append("\n");
        sb.append("    nodePoolID: ").append(toIndentedString(nodePoolID)).append("\n");
        sb.append("    nodeTemplate: ").append(toIndentedString(nodeTemplate)).append("\n");
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
