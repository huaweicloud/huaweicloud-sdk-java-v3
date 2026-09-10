package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自定义规格配置
 */
public class ModelServiceConfigCustomSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private String gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ascend")

    private String ascend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    public ModelServiceConfigCustomSpec withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU核数
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ModelServiceConfigCustomSpec withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * GPU个数
     * @return gpu
     */
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public ModelServiceConfigCustomSpec withAscend(String ascend) {
        this.ascend = ascend;
        return this;
    }

    /**
     * 昇腾芯片个数
     * @return ascend
     */
    public String getAscend() {
        return ascend;
    }

    public void setAscend(String ascend) {
        this.ascend = ascend;
    }

    public ModelServiceConfigCustomSpec withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存大小
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
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
        ModelServiceConfigCustomSpec that = (ModelServiceConfigCustomSpec) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.gpu, that.gpu)
            && Objects.equals(this.ascend, that.ascend) && Objects.equals(this.memory, that.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, gpu, ascend, memory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelServiceConfigCustomSpec {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    ascend: ").append(toIndentedString(ascend)).append("\n");
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
