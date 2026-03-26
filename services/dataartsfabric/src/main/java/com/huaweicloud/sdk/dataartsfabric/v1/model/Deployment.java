package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Deployment配置信息。 **约束限制**：不涉及。
 */
public class Deployment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_actor_options")

    private RayActorOptions rayActorOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling_config")

    private AutoscalingConfig autoscalingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_replicas")

    private Integer numReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_config")

    private Object userConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replicas_per_node")

    private Integer maxReplicasPerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ongoing_requests")

    private Integer maxOngoingRequests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_queued_requests")

    private Integer maxQueuedRequests;

    public Deployment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Deployment的名称。 **约束限制**：不涉及。 **取值范围**：长度为[1,64]的中文、字母、数字、下划线、中划线、半角句号（.）、空格的组合。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deployment withRayActorOptions(RayActorOptions rayActorOptions) {
        this.rayActorOptions = rayActorOptions;
        return this;
    }

    public Deployment withRayActorOptions(Consumer<RayActorOptions> rayActorOptionsSetter) {
        if (this.rayActorOptions == null) {
            this.rayActorOptions = new RayActorOptions();
            rayActorOptionsSetter.accept(this.rayActorOptions);
        }

        return this;
    }

    /**
     * Get rayActorOptions
     * @return rayActorOptions
     */
    public RayActorOptions getRayActorOptions() {
        return rayActorOptions;
    }

    public void setRayActorOptions(RayActorOptions rayActorOptions) {
        this.rayActorOptions = rayActorOptions;
    }

    public Deployment withAutoscalingConfig(AutoscalingConfig autoscalingConfig) {
        this.autoscalingConfig = autoscalingConfig;
        return this;
    }

    public Deployment withAutoscalingConfig(Consumer<AutoscalingConfig> autoscalingConfigSetter) {
        if (this.autoscalingConfig == null) {
            this.autoscalingConfig = new AutoscalingConfig();
            autoscalingConfigSetter.accept(this.autoscalingConfig);
        }

        return this;
    }

    /**
     * Get autoscalingConfig
     * @return autoscalingConfig
     */
    public AutoscalingConfig getAutoscalingConfig() {
        return autoscalingConfig;
    }

    public void setAutoscalingConfig(AutoscalingConfig autoscalingConfig) {
        this.autoscalingConfig = autoscalingConfig;
    }

    public Deployment withNumReplicas(Integer numReplicas) {
        this.numReplicas = numReplicas;
        return this;
    }

    /**
     * **参数解释**：副本数量。 **约束限制**：不涉及。 **取值范围**：[0,1000]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 1000
     * @return numReplicas
     */
    public Integer getNumReplicas() {
        return numReplicas;
    }

    public void setNumReplicas(Integer numReplicas) {
        this.numReplicas = numReplicas;
    }

    public Deployment withUserConfig(Object userConfig) {
        this.userConfig = userConfig;
        return this;
    }

    /**
     * **参数解释**：用户自定义配置。 **约束限制**：不涉及。
     * @return userConfig
     */
    public Object getUserConfig() {
        return userConfig;
    }

    public void setUserConfig(Object userConfig) {
        this.userConfig = userConfig;
    }

    public Deployment withMaxReplicasPerNode(Integer maxReplicasPerNode) {
        this.maxReplicasPerNode = maxReplicasPerNode;
        return this;
    }

    /**
     * **参数解释**：每个节点允许的最大副本数。 **约束限制**：不涉及。 **取值范围**：[1,100]。 **默认取值**：1。
     * minimum: 1
     * maximum: 100
     * @return maxReplicasPerNode
     */
    public Integer getMaxReplicasPerNode() {
        return maxReplicasPerNode;
    }

    public void setMaxReplicasPerNode(Integer maxReplicasPerNode) {
        this.maxReplicasPerNode = maxReplicasPerNode;
    }

    public Deployment withMaxOngoingRequests(Integer maxOngoingRequests) {
        this.maxOngoingRequests = maxOngoingRequests;
        return this;
    }

    /**
     * **参数解释**：每个副本可接受的最大并发请求数。 **约束限制**：不涉及。 **取值范围**：[1,100000]。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 100000
     * @return maxOngoingRequests
     */
    public Integer getMaxOngoingRequests() {
        return maxOngoingRequests;
    }

    public void setMaxOngoingRequests(Integer maxOngoingRequests) {
        this.maxOngoingRequests = maxOngoingRequests;
    }

    public Deployment withMaxQueuedRequests(Integer maxQueuedRequests) {
        this.maxQueuedRequests = maxQueuedRequests;
        return this;
    }

    /**
     * **参数解释**：deployment可接受的排队的最大请求数。-1时表示无限制。 **约束限制**：不涉及。 **取值范围**：[-1,100000]。 **默认取值**：不涉及。
     * minimum: -1
     * maximum: 100000
     * @return maxQueuedRequests
     */
    public Integer getMaxQueuedRequests() {
        return maxQueuedRequests;
    }

    public void setMaxQueuedRequests(Integer maxQueuedRequests) {
        this.maxQueuedRequests = maxQueuedRequests;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Deployment that = (Deployment) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.rayActorOptions, that.rayActorOptions)
            && Objects.equals(this.autoscalingConfig, that.autoscalingConfig)
            && Objects.equals(this.numReplicas, that.numReplicas) && Objects.equals(this.userConfig, that.userConfig)
            && Objects.equals(this.maxReplicasPerNode, that.maxReplicasPerNode)
            && Objects.equals(this.maxOngoingRequests, that.maxOngoingRequests)
            && Objects.equals(this.maxQueuedRequests, that.maxQueuedRequests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            rayActorOptions,
            autoscalingConfig,
            numReplicas,
            userConfig,
            maxReplicasPerNode,
            maxOngoingRequests,
            maxQueuedRequests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Deployment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rayActorOptions: ").append(toIndentedString(rayActorOptions)).append("\n");
        sb.append("    autoscalingConfig: ").append(toIndentedString(autoscalingConfig)).append("\n");
        sb.append("    numReplicas: ").append(toIndentedString(numReplicas)).append("\n");
        sb.append("    userConfig: ").append(toIndentedString(userConfig)).append("\n");
        sb.append("    maxReplicasPerNode: ").append(toIndentedString(maxReplicasPerNode)).append("\n");
        sb.append("    maxOngoingRequests: ").append(toIndentedString(maxOngoingRequests)).append("\n");
        sb.append("    maxQueuedRequests: ").append(toIndentedString(maxQueuedRequests)).append("\n");
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
