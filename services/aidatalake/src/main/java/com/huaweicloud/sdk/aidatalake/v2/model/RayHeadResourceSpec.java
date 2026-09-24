package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RayHeadResourceSpec
 */
public class RayHeadResourceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Double gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private Double npu;

    public RayHeadResourceSpec withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU核数量，单位为毫核。 **约束限制**：不涉及。 **取值范围**：最小值为1000。 **默认取值**：不涉及。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public RayHeadResourceSpec withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：单个head内存大小，单位MB。 **约束限制**：不涉及。 **取值范围**：最小值为1024。 **默认取值**：不涉及。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public RayHeadResourceSpec withGpu(Double gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释**：节点的GPU数量。 **约束限制**：不支持小于1的值或带小数部分的值（如0.5, 1.5）。 **取值范围**：需配置为大于等于1.0，且必须为整数值（如1.0, 2.0, 3.0, ...）。 **默认取值**：不涉及。
     * @return gpu
     */
    public Double getGpu() {
        return gpu;
    }

    public void setGpu(Double gpu) {
        this.gpu = gpu;
    }

    public RayHeadResourceSpec withNpu(Double npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数解释**：节点的NPU数量。 **约束限制**：不支持小于1的值或带小数部分的值（如0.5, 1.5）。 **取值范围**：需配置为大于等于1.0，且必须为整数值（如1.0, 2.0, 3.0, ...）。 **默认取值**：不涉及。
     * @return npu
     */
    public Double getNpu() {
        return npu;
    }

    public void setNpu(Double npu) {
        this.npu = npu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayHeadResourceSpec that = (RayHeadResourceSpec) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.gpu, that.gpu) && Objects.equals(this.npu, that.npu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, gpu, npu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayHeadResourceSpec {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
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
