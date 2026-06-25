package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点状态数据模型。
 */
public class NodeStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateIp")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private NodeResource resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableResources")

    private NodeResource availableResources;

    public NodeStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**：节点当前状态。 **取值范围**：可选值如下： - Available：节点可用。 - Creating：节点创建中。 - Deleting：节点删除中。 - Abnormal：节点异常。 - Checking: 节点自检中。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public NodeStatus withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * **参数解释**：节点所在的az。 **取值范围**：不涉及。
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public NodeStatus withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**：节点的IP地址。 **取值范围**：不涉及。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public NodeStatus withResources(NodeResource resources) {
        this.resources = resources;
        return this;
    }

    public NodeStatus withResources(Consumer<NodeResource> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new NodeResource();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public NodeResource getResources() {
        return resources;
    }

    public void setResources(NodeResource resources) {
        this.resources = resources;
    }

    public NodeStatus withAvailableResources(NodeResource availableResources) {
        this.availableResources = availableResources;
        return this;
    }

    public NodeStatus withAvailableResources(Consumer<NodeResource> availableResourcesSetter) {
        if (this.availableResources == null) {
            this.availableResources = new NodeResource();
            availableResourcesSetter.accept(this.availableResources);
        }

        return this;
    }

    /**
     * Get availableResources
     * @return availableResources
     */
    public NodeResource getAvailableResources() {
        return availableResources;
    }

    public void setAvailableResources(NodeResource availableResources) {
        this.availableResources = availableResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeStatus that = (NodeStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.az, that.az)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.availableResources, that.availableResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, az, privateIp, resources, availableResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    availableResources: ").append(toIndentedString(availableResources)).append("\n");
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
