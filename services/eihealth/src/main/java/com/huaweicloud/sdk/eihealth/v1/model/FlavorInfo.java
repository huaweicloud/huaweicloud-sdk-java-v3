package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * notebook规格信息
 */
public class FlavorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    private String cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Float cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Float gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_type")

    private String gpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Float memory;

    public FlavorInfo withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /**
     * **参数解释**： cpu架构类型。 **约束限制**： 不涉及 **取值范围**： * X86: X86架构 * ARM：ARM架构 **默认取值**： X86 
     * @return cpuType
     */
    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public FlavorInfo withCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * notebook占用的cpu,0.1核为100m,单位为\"C\"
     * minimum: 1
     * maximum: 128
     * @return cpu
     */
    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    public FlavorInfo withGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * notebook占用的gpu，0.1为使用单卡10%，1为占满单个显卡，1+为使用多个显卡
     * minimum: 0
     * maximum: 16
     * @return gpu
     */
    public Float getGpu() {
        return gpu;
    }

    public void setGpu(Float gpu) {
        this.gpu = gpu;
    }

    public FlavorInfo withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * **参数解释**： gpu架构类型。 **约束限制**： 不涉及 **取值范围**： * GPU：支持GPU * [Snt9：支持Snt9](tag:hws) **默认取值**： 不涉及 
     * @return gpuType
     */
    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public FlavorInfo withMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    /**
     * notebook占用的内存,单位为\"G\"
     * minimum: 2
     * maximum: 512
     * @return memory
     */
    public Float getMemory() {
        return memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorInfo that = (FlavorInfo) obj;
        return Objects.equals(this.cpuType, that.cpuType) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.gpu, that.gpu) && Objects.equals(this.gpuType, that.gpuType)
            && Objects.equals(this.memory, that.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuType, cpu, gpu, gpuType, memory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorInfo {\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
