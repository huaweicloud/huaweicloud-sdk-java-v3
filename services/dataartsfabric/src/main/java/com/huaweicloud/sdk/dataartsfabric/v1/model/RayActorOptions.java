package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：RayActor配置。 **约束限制**：不涉及。 
 */
public class RayActorOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cpus")

    private Double numCpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Double memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private String resources;

    public RayActorOptions withNumCpus(Double numCpus) {
        this.numCpus = numCpus;
        return this;
    }

    /**
     * **参数解释**：CPU数量。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return numCpus
     */
    public Double getNumCpus() {
        return numCpus;
    }

    public void setNumCpus(Double numCpus) {
        this.numCpus = numCpus;
    }

    public RayActorOptions withMemory(Double memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存数量。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return memory
     */
    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public RayActorOptions withResources(String resources) {
        this.resources = resources;
        return this;
    }

    /**
     * **参数解释**：资源配置。 **约束限制**：不涉及。 **取值范围**：长度[0,1024]。 **默认取值**：不涉及。 
     * @return resources
     */
    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
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
        RayActorOptions that = (RayActorOptions) obj;
        return Objects.equals(this.numCpus, that.numCpus) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCpus, memory, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayActorOptions {\n");
        sb.append("    numCpus: ").append(toIndentedString(numCpus)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
