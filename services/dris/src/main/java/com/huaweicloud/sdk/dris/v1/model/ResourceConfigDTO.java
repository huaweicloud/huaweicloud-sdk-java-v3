package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceConfigDTO
 */
public class ResourceConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Float cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Float memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Float gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private Float npu;

    public ResourceConfigDTO withCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数说明**：cpu个数。
     * minimum: 0.01
     * maximum: 1E+3
     * @return cpu
     */
    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    public ResourceConfigDTO withMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数说明**：内存大小。
     * minimum: 0.01
     * maximum: 1.024E+6
     * @return memory
     */
    public Float getMemory() {
        return memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    public ResourceConfigDTO withGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数说明**：gpu个数。
     * minimum: 0.01
     * maximum: 1.024E+6
     * @return gpu
     */
    public Float getGpu() {
        return gpu;
    }

    public void setGpu(Float gpu) {
        this.gpu = gpu;
    }

    public ResourceConfigDTO withNpu(Float npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数说明**：npu个数。
     * minimum: 0.01
     * maximum: 1E+3
     * @return npu
     */
    public Float getNpu() {
        return npu;
    }

    public void setNpu(Float npu) {
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
        ResourceConfigDTO that = (ResourceConfigDTO) obj;
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
        sb.append("class ResourceConfigDTO {\n");
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
