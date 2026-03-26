package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray worker配置信息V2。 **约束限制**：不涉及。 
 */
public class WorkerGroupSpecV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_replicas")

    private Integer minReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replicas")

    private Integer maxReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private ResourceSpec limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private ResourceSpec requests;

    public WorkerGroupSpecV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：名称。 **约束限制**：不涉及。 **取值范围**：长度[0,128]字母、数字、下划线(_)、中划线(-)的组合。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerGroupSpecV2 withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * **参数解释**：最小副本数。 **约束限制**：不涉及。 **取值范围**：[0,10000]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 10000
     * @return minReplicas
     */
    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public WorkerGroupSpecV2 withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * **参数解释**：最大副本数。 **约束限制**：不涉及。 **取值范围**：[1,10000]。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 10000
     * @return maxReplicas
     */
    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public WorkerGroupSpecV2 withLimits(ResourceSpec limits) {
        this.limits = limits;
        return this;
    }

    public WorkerGroupSpecV2 withLimits(Consumer<ResourceSpec> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ResourceSpec();
            limitsSetter.accept(this.limits);
        }

        return this;
    }

    /**
     * Get limits
     * @return limits
     */
    public ResourceSpec getLimits() {
        return limits;
    }

    public void setLimits(ResourceSpec limits) {
        this.limits = limits;
    }

    public WorkerGroupSpecV2 withRequests(ResourceSpec requests) {
        this.requests = requests;
        return this;
    }

    public WorkerGroupSpecV2 withRequests(Consumer<ResourceSpec> requestsSetter) {
        if (this.requests == null) {
            this.requests = new ResourceSpec();
            requestsSetter.accept(this.requests);
        }

        return this;
    }

    /**
     * Get requests
     * @return requests
     */
    public ResourceSpec getRequests() {
        return requests;
    }

    public void setRequests(ResourceSpec requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkerGroupSpecV2 that = (WorkerGroupSpecV2) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.minReplicas, that.minReplicas)
            && Objects.equals(this.maxReplicas, that.maxReplicas) && Objects.equals(this.limits, that.limits)
            && Objects.equals(this.requests, that.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, minReplicas, maxReplicas, limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkerGroupSpecV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
        sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
