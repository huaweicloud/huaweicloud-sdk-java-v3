package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeInfo
 */
public class NodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_node_name")

    private String superNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_node_id")

    private String superNodeId;

    public NodeInfo withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * **参数解释**：节点IP。 **取值范围**：[0,50]。
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public NodeInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**：节点名称。 **取值范围**：[0,50]。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeInfo withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释**：服务器ID。 **取值范围**：[0,50]。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public NodeInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**：节点id。 **约束限制**：不涉及。 **取值范围**：长度为[1,64]的英文字符、数字、下划线(_)和中划线(-)的组合。 **默认取值**：不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * - **参数解释**：虚拟私有云id。 - **约束限制**：不涉及。 - **取值范围**：长度为[1,64]的英文字符、数字、下划线(_)和中划线(-)的组合。 - **默认取值**：不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public NodeInfo withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：规格。 **取值范围**：[0,64]。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public NodeInfo withSuperNodeName(String superNodeName) {
        this.superNodeName = superNodeName;
        return this;
    }

    /**
     * **参数解释**：超节点名称。 **取值范围**：[0,255]。
     * @return superNodeName
     */
    public String getSuperNodeName() {
        return superNodeName;
    }

    public void setSuperNodeName(String superNodeName) {
        this.superNodeName = superNodeName;
    }

    public NodeInfo withSuperNodeId(String superNodeId) {
        this.superNodeId = superNodeId;
        return this;
    }

    /**
     * **参数解释**：超节点ID。 **取值范围**：[0,64]。
     * @return superNodeId
     */
    public String getSuperNodeId() {
        return superNodeId;
    }

    public void setSuperNodeId(String superNodeId) {
        this.superNodeId = superNodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeInfo that = (NodeInfo) obj;
        return Objects.equals(this.nodeIp, that.nodeIp) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.superNodeName, that.superNodeName)
            && Objects.equals(this.superNodeId, that.superNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeIp, nodeName, serverId, nodeId, vpcId, flavor, superNodeName, superNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeInfo {\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    superNodeName: ").append(toIndentedString(superNodeName)).append("\n");
        sb.append("    superNodeId: ").append(toIndentedString(superNodeId)).append("\n");
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
