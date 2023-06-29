package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机服务器的属性描述，不超过512个字节
 */
public class ServerModelExtendSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private String disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interface")

    private String networkInterface;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private String gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bms_flavor")

    private String bmsFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_count")

    private Integer gpuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "numa_count")

    private Integer numaCount;

    public ServerModelExtendSpec withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 云手机服务器cpu类型
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ServerModelExtendSpec withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 云手机服务器内存类型
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public ServerModelExtendSpec withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    /**
     * 云手机服务器磁盘类型
     * @return disk
     */
    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public ServerModelExtendSpec withNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }

    /**
     * 云手机服务器网络类型
     * @return networkInterface
     */
    public String getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
    }

    public ServerModelExtendSpec withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * 云手机服务器gpu类型
     * @return gpu
     */
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public ServerModelExtendSpec withBmsFlavor(String bmsFlavor) {
        this.bmsFlavor = bmsFlavor;
        return this;
    }

    /**
     * 云手机服务器bms规格
     * @return bmsFlavor
     */
    public String getBmsFlavor() {
        return bmsFlavor;
    }

    public void setBmsFlavor(String bmsFlavor) {
        this.bmsFlavor = bmsFlavor;
    }

    public ServerModelExtendSpec withGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }

    /**
     * 云手机服务器gpu数量
     * minimum: 0
     * maximum: 1024
     * @return gpuCount
     */
    public Integer getGpuCount() {
        return gpuCount;
    }

    public void setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
    }

    public ServerModelExtendSpec withNumaCount(Integer numaCount) {
        this.numaCount = numaCount;
        return this;
    }

    /**
     * 云手机服务器numa数量
     * minimum: 0
     * maximum: 1024
     * @return numaCount
     */
    public Integer getNumaCount() {
        return numaCount;
    }

    public void setNumaCount(Integer numaCount) {
        this.numaCount = numaCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerModelExtendSpec that = (ServerModelExtendSpec) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.disk, that.disk) && Objects.equals(this.networkInterface, that.networkInterface)
            && Objects.equals(this.gpu, that.gpu) && Objects.equals(this.bmsFlavor, that.bmsFlavor)
            && Objects.equals(this.gpuCount, that.gpuCount) && Objects.equals(this.numaCount, that.numaCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, disk, networkInterface, gpu, bmsFlavor, gpuCount, numaCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerModelExtendSpec {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    networkInterface: ").append(toIndentedString(networkInterface)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    bmsFlavor: ").append(toIndentedString(bmsFlavor)).append("\n");
        sb.append("    gpuCount: ").append(toIndentedString(gpuCount)).append("\n");
        sb.append("    numaCount: ").append(toIndentedString(numaCount)).append("\n");
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
