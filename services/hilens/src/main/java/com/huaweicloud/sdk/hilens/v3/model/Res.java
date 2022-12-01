package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Res
 */
public class Res {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private String gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private String npu;

    public Res withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu数量，字符串所对应的数值在0.01到1000之间
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Res withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * gpu数量，值在0到1000
     * @return gpu
     */
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public Res withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存数量，如果是资源限制，其值范围在4到1024000之间，否则在0.01到1024000之间
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Res withNpu(String npu) {
        this.npu = npu;
        return this;
    }

    /**
     * npu数量，字符串所对应的数值在0.到1000之间
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
        Res res = (Res) o;
        return Objects.equals(this.cpu, res.cpu) && Objects.equals(this.gpu, res.gpu)
            && Objects.equals(this.memory, res.memory) && Objects.equals(this.npu, res.npu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, gpu, memory, npu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Res {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
