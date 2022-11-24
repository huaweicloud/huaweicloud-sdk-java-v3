package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源配置限制
 */
public class LimitsRequests {

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

    private Integer npu;

    public LimitsRequests withCpu(Float cpu) {
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

    public LimitsRequests withMemory(Float memory) {
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

    public LimitsRequests withGpu(Float gpu) {
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

    public LimitsRequests withNpu(Integer npu) {
        this.npu = npu;
        return this;
    }

    /**
     * Npu个数，大于0，最大1000；请求不需要带单位
     * @return npu
     */
    public Integer getNpu() {
        return npu;
    }

    public void setNpu(Integer npu) {
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
        LimitsRequests limitsRequests = (LimitsRequests) o;
        return Objects.equals(this.cpu, limitsRequests.cpu) && Objects.equals(this.memory, limitsRequests.memory)
            && Objects.equals(this.gpu, limitsRequests.gpu) && Objects.equals(this.npu, limitsRequests.npu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, gpu, npu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LimitsRequests {\n");
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
