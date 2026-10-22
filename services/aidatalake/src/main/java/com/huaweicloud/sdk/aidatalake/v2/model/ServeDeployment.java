package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Serve 应用 Deployment 配置。
 */
public class ServeDeployment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_replicas")

    private Integer numReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replicas_per_node")

    private Integer maxReplicasPerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ongoing_requests")

    private Integer maxOngoingRequests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_queued_requests")

    private Integer maxQueuedRequests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_actor_options")

    private ServeRayActorOptions rayActorOptions;

    public ServeDeployment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Deployment 名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServeDeployment withNumReplicas(Integer numReplicas) {
        this.numReplicas = numReplicas;
        return this;
    }

    /**
     * **参数解释**：副本数。 **约束限制**：不涉及。 **取值范围**：不小于1。 **默认取值**：不涉及。
     * minimum: 1
     * @return numReplicas
     */
    public Integer getNumReplicas() {
        return numReplicas;
    }

    public void setNumReplicas(Integer numReplicas) {
        this.numReplicas = numReplicas;
    }

    public ServeDeployment withMaxReplicasPerNode(Integer maxReplicasPerNode) {
        this.maxReplicasPerNode = maxReplicasPerNode;
        return this;
    }

    /**
     * **参数解释**：单节点最大副本数。 **约束限制**：不涉及。 **取值范围**：不小于1。 **默认取值**：不涉及。
     * minimum: 1
     * @return maxReplicasPerNode
     */
    public Integer getMaxReplicasPerNode() {
        return maxReplicasPerNode;
    }

    public void setMaxReplicasPerNode(Integer maxReplicasPerNode) {
        this.maxReplicasPerNode = maxReplicasPerNode;
    }

    public ServeDeployment withMaxOngoingRequests(Integer maxOngoingRequests) {
        this.maxOngoingRequests = maxOngoingRequests;
        return this;
    }

    /**
     * **参数解释**：最大进行中请求数。 **约束限制**：不涉及。 **取值范围**：不小于1。 **默认取值**：不涉及。
     * minimum: 1
     * @return maxOngoingRequests
     */
    public Integer getMaxOngoingRequests() {
        return maxOngoingRequests;
    }

    public void setMaxOngoingRequests(Integer maxOngoingRequests) {
        this.maxOngoingRequests = maxOngoingRequests;
    }

    public ServeDeployment withMaxQueuedRequests(Integer maxQueuedRequests) {
        this.maxQueuedRequests = maxQueuedRequests;
        return this;
    }

    /**
     * **参数解释**：最大排队请求数。 **约束限制**：不涉及。 **取值范围**：不小于1。 **默认取值**：不涉及。
     * minimum: 1
     * @return maxQueuedRequests
     */
    public Integer getMaxQueuedRequests() {
        return maxQueuedRequests;
    }

    public void setMaxQueuedRequests(Integer maxQueuedRequests) {
        this.maxQueuedRequests = maxQueuedRequests;
    }

    public ServeDeployment withRayActorOptions(ServeRayActorOptions rayActorOptions) {
        this.rayActorOptions = rayActorOptions;
        return this;
    }

    public ServeDeployment withRayActorOptions(Consumer<ServeRayActorOptions> rayActorOptionsSetter) {
        if (this.rayActorOptions == null) {
            this.rayActorOptions = new ServeRayActorOptions();
            rayActorOptionsSetter.accept(this.rayActorOptions);
        }

        return this;
    }

    /**
     * Get rayActorOptions
     * @return rayActorOptions
     */
    public ServeRayActorOptions getRayActorOptions() {
        return rayActorOptions;
    }

    public void setRayActorOptions(ServeRayActorOptions rayActorOptions) {
        this.rayActorOptions = rayActorOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServeDeployment that = (ServeDeployment) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.numReplicas, that.numReplicas)
            && Objects.equals(this.maxReplicasPerNode, that.maxReplicasPerNode)
            && Objects.equals(this.maxOngoingRequests, that.maxOngoingRequests)
            && Objects.equals(this.maxQueuedRequests, that.maxQueuedRequests)
            && Objects.equals(this.rayActorOptions, that.rayActorOptions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, numReplicas, maxReplicasPerNode, maxOngoingRequests, maxQueuedRequests, rayActorOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServeDeployment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numReplicas: ").append(toIndentedString(numReplicas)).append("\n");
        sb.append("    maxReplicasPerNode: ").append(toIndentedString(maxReplicasPerNode)).append("\n");
        sb.append("    maxOngoingRequests: ").append(toIndentedString(maxOngoingRequests)).append("\n");
        sb.append("    maxQueuedRequests: ").append(toIndentedString(maxQueuedRequests)).append("\n");
        sb.append("    rayActorOptions: ").append(toIndentedString(rayActorOptions)).append("\n");
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
