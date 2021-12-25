package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 容器需要使用的最小资源 */
public class VersionDetailResourcesRequests {

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

    public VersionDetailResourcesRequests withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /** cpu核数，大于等于0.01，最大1000；请求不需要带单位
     * 
     * @return cpu */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public VersionDetailResourcesRequests withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /** 内存大小，单位兆，大于等于0.01，最大1024000。注意：内存的limits值最小为4；请求不需要带单位
     * 
     * @return memory */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public VersionDetailResourcesRequests withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /** Gpu显存大小，单位兆，大于等于0.01，最大1024000；请求不需要带单位
     * 
     * @return gpu */
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public VersionDetailResourcesRequests withNpu(String npu) {
        this.npu = npu;
        return this;
    }

    /** Npu个数，大于0，最大1000；请求不需要带单位
     * 
     * @return npu */
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
        VersionDetailResourcesRequests versionDetailResourcesRequests = (VersionDetailResourcesRequests) o;
        return Objects.equals(this.cpu, versionDetailResourcesRequests.cpu)
            && Objects.equals(this.memory, versionDetailResourcesRequests.memory)
            && Objects.equals(this.gpu, versionDetailResourcesRequests.gpu)
            && Objects.equals(this.npu, versionDetailResourcesRequests.npu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, gpu, npu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDetailResourcesRequests {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
