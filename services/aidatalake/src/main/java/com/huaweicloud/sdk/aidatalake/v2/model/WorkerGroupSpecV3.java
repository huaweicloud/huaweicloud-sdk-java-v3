package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray worker group配置信息。
 */
public class WorkerGroupSpecV3 {

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
    @JsonProperty(value = "resource")

    private ResourceSpecV3 resource;

    public WorkerGroupSpecV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Worker Group的名称。 **约束限制**：不涉及。 **取值范围**：长度0~128字母、数字、中划线的组合。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerGroupSpecV3 withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * **参数解释**：最小副本数。 **约束限制**：不涉及。 **取值范围**：0~10000。 **默认取值**：不涉及。
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

    public WorkerGroupSpecV3 withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * **参数解释**：最大副本数。 **约束限制**：不涉及。 **取值范围**：1~10000。 **默认取值**：不涉及。
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

    public WorkerGroupSpecV3 withResource(ResourceSpecV3 resource) {
        this.resource = resource;
        return this;
    }

    public WorkerGroupSpecV3 withResource(Consumer<ResourceSpecV3> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ResourceSpecV3();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public ResourceSpecV3 getResource() {
        return resource;
    }

    public void setResource(ResourceSpecV3 resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkerGroupSpecV3 that = (WorkerGroupSpecV3) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.minReplicas, that.minReplicas)
            && Objects.equals(this.maxReplicas, that.maxReplicas) && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, minReplicas, maxReplicas, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkerGroupSpecV3 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
        sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
