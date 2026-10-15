package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：作业启动资源配置。  **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class ResourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private Integer npu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Integer gpu;

    public ResourceConfig withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU数量（单位：毫核）  **约束限制**：不涉及。 **取值范围**：300~100000，包含边界值。 **默认取值**：不涉及。
     * minimum: 300
     * maximum: 100000
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ResourceConfig withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存配置（单位：兆字节）  **约束限制**：不涉及。 **取值范围**：500~204800，包含边界值。 **默认取值**：不涉及。
     * minimum: 500
     * maximum: 204800
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ResourceConfig withNpu(Integer npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数解释**：NPU配置，卡数。  **约束限制**：不涉及。 **取值范围**：1~8，包含边界值。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 8
     * @return npu
     */
    public Integer getNpu() {
        return npu;
    }

    public void setNpu(Integer npu) {
        this.npu = npu;
    }

    public ResourceConfig withGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释**：GPU配置，卡数。  **约束限制**：不涉及。 **取值范围**：1~8，包含边界值。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 8
     * @return gpu
     */
    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceConfig that = (ResourceConfig) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.npu, that.npu) && Objects.equals(this.gpu, that.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, npu, gpu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceConfig {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
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
