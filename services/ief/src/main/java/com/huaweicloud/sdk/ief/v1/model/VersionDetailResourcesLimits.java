package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 允许容器使用的最大资源
 */
public class VersionDetailResourcesLimits {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private String gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private String npu;

    public VersionDetailResourcesLimits withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu核数，大于等于0.01，最大1000；请求不需要带单位
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public VersionDetailResourcesLimits withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存大小，单位兆，大于等于0.01，最大1024000。注意：内存的limits值最小为4；请求不需要带单位
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public VersionDetailResourcesLimits withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * Gpu显存大小，单位兆，大于等于0.01，最大1024000；请求不需要带单位
     * @return gpu
     */
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public VersionDetailResourcesLimits withNpu(String npu) {
        this.npu = npu;
        return this;
    }

    /**
     * Npu个数，大于0，最大1000；请求不需要带单位
     * @return npu
     */
    public String getNpu() {
        return npu;
    }

    public void setNpu(String npu) {
        this.npu = npu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionDetailResourcesLimits versionDetailResourcesLimits = (VersionDetailResourcesLimits) o;
        return Objects.equals(this.cpu, versionDetailResourcesLimits.cpu)
            && Objects.equals(this.memory, versionDetailResourcesLimits.memory)
            && Objects.equals(this.gpu, versionDetailResourcesLimits.gpu)
            && Objects.equals(this.npu, versionDetailResourcesLimits.npu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, gpu, npu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDetailResourcesLimits {\n");
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
