package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器需要使用的最小资源
 */
public class ResourcesRequests {

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

    public ResourcesRequests withCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu核数，大于等于0.01，最大1000；请求不需要带单位
     * @return cpu
     */
    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    public ResourcesRequests withMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存大小，单位兆，大于等于0.01，最大1024000。注意：内存的limits值最小为4；请求不需要带单位
     * @return memory
     */
    public Float getMemory() {
        return memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    public ResourcesRequests withGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * Gpu显存大小，单位兆，大于等于0.01，最大1024000；请求不需要带单位
     * @return gpu
     */
    public Float getGpu() {
        return gpu;
    }

    public void setGpu(Float gpu) {
        this.gpu = gpu;
    }

    public ResourcesRequests withNpu(Float npu) {
        this.npu = npu;
        return this;
    }

    /**
     * Npu个数，大于0，最大1000；请求不需要带单位
     * @return npu
     */
    public Float getNpu() {
        return npu;
    }

    public void setNpu(Float npu) {
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
        ResourcesRequests resourcesRequests = (ResourcesRequests) o;
        return Objects.equals(this.cpu, resourcesRequests.cpu) && Objects.equals(this.memory, resourcesRequests.memory)
            && Objects.equals(this.gpu, resourcesRequests.gpu) && Objects.equals(this.npu, resourcesRequests.npu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, gpu, npu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesRequests {\n");
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