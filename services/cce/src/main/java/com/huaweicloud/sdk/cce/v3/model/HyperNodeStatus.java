package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HyperNodeStatus
 */
public class HyperNodeStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceID")

    private String instanceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentNode")

    private Integer currentNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletingNode")

    private Integer deletingNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatingNode")

    private Integer creatingNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeNode")

    private Integer activeNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isStatic")

    private Boolean isStatic;

    public HyperNodeStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**： 超节点状态 **约束限制**： 不涉及 **取值范围**： - provisioning：创建中。 - active：整体可用，代表超节点下所有节点都可用。 - partially-available：超节点下存在不可用节点时会从 active 转成此状态。 - error：错误状态。 - deleting：删除中。 - reinstalling：重置中。 - scaling：扩容或缩容中。  **默认取值**： 不涉及
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public HyperNodeStatus withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * **参数解释**： 超节点ID **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return instanceID
     */
    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public HyperNodeStatus withCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
        return this;
    }

    /**
     * **参数解释**： 超节点下节点总数 **约束限制**： 不涉及 **取值范围**： 大于等于0的整数 **默认取值**： 不涉及
     * @return currentNode
     */
    public Integer getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
    }

    public HyperNodeStatus withDeletingNode(Integer deletingNode) {
        this.deletingNode = deletingNode;
        return this;
    }

    /**
     * **参数解释**： 超节点下处于删除中的节点数 **约束限制**： 不涉及 **取值范围**： 大于等于0的整数 **默认取值**： 不涉及
     * @return deletingNode
     */
    public Integer getDeletingNode() {
        return deletingNode;
    }

    public void setDeletingNode(Integer deletingNode) {
        this.deletingNode = deletingNode;
    }

    public HyperNodeStatus withCreatingNode(Integer creatingNode) {
        this.creatingNode = creatingNode;
        return this;
    }

    /**
     * **参数解释**： 超节点下处于创建中的节点数 **约束限制**： 不涉及 **取值范围**： 大于等于0的整数 **默认取值**： 不涉及
     * @return creatingNode
     */
    public Integer getCreatingNode() {
        return creatingNode;
    }

    public void setCreatingNode(Integer creatingNode) {
        this.creatingNode = creatingNode;
    }

    public HyperNodeStatus withActiveNode(Integer activeNode) {
        this.activeNode = activeNode;
        return this;
    }

    /**
     * **参数解释**： 超节点下处于可用状态的节点数 **约束限制**： 不涉及 **取值范围**： 大于等于0的整数 **默认取值**： 不涉及
     * @return activeNode
     */
    public Integer getActiveNode() {
        return activeNode;
    }

    public void setActiveNode(Integer activeNode) {
        this.activeNode = activeNode;
    }

    public HyperNodeStatus withIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    /**
     * **参数解释**： 超节点是否为纳管节点。纳管节点指用户已有的存量服务器接入CCE集群，而非由CCE自动创建的ECS/BMS。 **约束限制**： 不涉及 **取值范围**： - true：纳管节点，服务器在加入集群前已存在，删除超节点时不会释放底层云服务器资源。 - false：CCE创建的节点，生命周期由CCE管理，删除时会释放底层资源。 **默认取值**： false
     * @return isStatic
     */
    public Boolean getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperNodeStatus that = (HyperNodeStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.instanceID, that.instanceID)
            && Objects.equals(this.currentNode, that.currentNode)
            && Objects.equals(this.deletingNode, that.deletingNode)
            && Objects.equals(this.creatingNode, that.creatingNode) && Objects.equals(this.activeNode, that.activeNode)
            && Objects.equals(this.isStatic, that.isStatic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, instanceID, currentNode, deletingNode, creatingNode, activeNode, isStatic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperNodeStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
        sb.append("    currentNode: ").append(toIndentedString(currentNode)).append("\n");
        sb.append("    deletingNode: ").append(toIndentedString(deletingNode)).append("\n");
        sb.append("    creatingNode: ").append(toIndentedString(creatingNode)).append("\n");
        sb.append("    activeNode: ").append(toIndentedString(activeNode)).append("\n");
        sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
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
