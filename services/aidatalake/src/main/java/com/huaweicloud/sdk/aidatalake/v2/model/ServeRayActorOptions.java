package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Actor 资源选项（可选，整体非必填）。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class ServeRayActorOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cpus")

    private BigDecimal numCpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_gpus")

    private BigDecimal numGpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private Map<String, BigDecimal> resources = null;

    public ServeRayActorOptions withNumCpus(BigDecimal numCpus) {
        this.numCpus = numCpus;
        return this;
    }

    /**
     * **参数解释**：CPU 核数。 **约束限制**：不涉及。 **取值范围**：不小于0。 **默认取值**：不涉及。
     * minimum: 0
     * @return numCpus
     */
    public BigDecimal getNumCpus() {
        return numCpus;
    }

    public void setNumCpus(BigDecimal numCpus) {
        this.numCpus = numCpus;
    }

    public ServeRayActorOptions withNumGpus(BigDecimal numGpus) {
        this.numGpus = numGpus;
        return this;
    }

    /**
     * **参数解释**：GPU 卡数。 **约束限制**：不涉及。 **取值范围**：不小于0。 **默认取值**：不涉及。
     * minimum: 0
     * @return numGpus
     */
    public BigDecimal getNumGpus() {
        return numGpus;
    }

    public void setNumGpus(BigDecimal numGpus) {
        this.numGpus = numGpus;
    }

    public ServeRayActorOptions withResources(Map<String, BigDecimal> resources) {
        this.resources = resources;
        return this;
    }

    public ServeRayActorOptions putResourcesItem(String key, BigDecimal resourcesItem) {
        if (this.resources == null) {
            this.resources = new HashMap<>();
        }
        this.resources.put(key, resourcesItem);
        return this;
    }

    public ServeRayActorOptions withResources(Consumer<Map<String, BigDecimal>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new HashMap<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释**：自定义资源映射。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return resources
     */
    public Map<String, BigDecimal> getResources() {
        return resources;
    }

    public void setResources(Map<String, BigDecimal> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServeRayActorOptions that = (ServeRayActorOptions) obj;
        return Objects.equals(this.numCpus, that.numCpus) && Objects.equals(this.numGpus, that.numGpus)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCpus, numGpus, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServeRayActorOptions {\n");
        sb.append("    numCpus: ").append(toIndentedString(numCpus)).append("\n");
        sb.append("    numGpus: ").append(toIndentedString(numGpus)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
