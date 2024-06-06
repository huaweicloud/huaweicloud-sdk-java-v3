package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点监控详情。
 */
public class NodeDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_status")

    private String runningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private String cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_usage")

    private String memoryUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_usage")

    private String diskUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_memory")

    private String totalMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_memory")

    private String availableMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_hard_disk_space")

    private String totalHardDiskSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_hard_disk_space")

    private String availableHardDiskSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_read")

    private String networkRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_write")

    private String networkWrite;

    public NodeDetail withRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }

    /**
     * 运行状态。
     * @return runningStatus
     */
    public String getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public NodeDetail withCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * CPU使用率。
     * @return cpuUsage
     */
    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public NodeDetail withMemoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }

    /**
     * 内存使用率。
     * @return memoryUsage
     */
    public String getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public NodeDetail withDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * 硬盘使用率。
     * @return diskUsage
     */
    public String getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
    }

    public NodeDetail withTotalMemory(String totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }

    /**
     * 总内存。单位MB。
     * @return totalMemory
     */
    public String getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(String totalMemory) {
        this.totalMemory = totalMemory;
    }

    public NodeDetail withAvailableMemory(String availableMemory) {
        this.availableMemory = availableMemory;
        return this;
    }

    /**
     * 可用内存。单位MB。
     * @return availableMemory
     */
    public String getAvailableMemory() {
        return availableMemory;
    }

    public void setAvailableMemory(String availableMemory) {
        this.availableMemory = availableMemory;
    }

    public NodeDetail withTotalHardDiskSpace(String totalHardDiskSpace) {
        this.totalHardDiskSpace = totalHardDiskSpace;
        return this;
    }

    /**
     * 总硬盘空间。单位GB。
     * @return totalHardDiskSpace
     */
    public String getTotalHardDiskSpace() {
        return totalHardDiskSpace;
    }

    public void setTotalHardDiskSpace(String totalHardDiskSpace) {
        this.totalHardDiskSpace = totalHardDiskSpace;
    }

    public NodeDetail withAvailableHardDiskSpace(String availableHardDiskSpace) {
        this.availableHardDiskSpace = availableHardDiskSpace;
        return this;
    }

    /**
     * 可用硬盘空间。单位GB。
     * @return availableHardDiskSpace
     */
    public String getAvailableHardDiskSpace() {
        return availableHardDiskSpace;
    }

    public void setAvailableHardDiskSpace(String availableHardDiskSpace) {
        this.availableHardDiskSpace = availableHardDiskSpace;
    }

    public NodeDetail withNetworkRead(String networkRead) {
        this.networkRead = networkRead;
        return this;
    }

    /**
     * 网络读取速度。单位Byte/s。
     * @return networkRead
     */
    public String getNetworkRead() {
        return networkRead;
    }

    public void setNetworkRead(String networkRead) {
        this.networkRead = networkRead;
    }

    public NodeDetail withNetworkWrite(String networkWrite) {
        this.networkWrite = networkWrite;
        return this;
    }

    /**
     * 网络写入速度。单位Byte/s。
     * @return networkWrite
     */
    public String getNetworkWrite() {
        return networkWrite;
    }

    public void setNetworkWrite(String networkWrite) {
        this.networkWrite = networkWrite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeDetail that = (NodeDetail) obj;
        return Objects.equals(this.runningStatus, that.runningStatus) && Objects.equals(this.cpuUsage, that.cpuUsage)
            && Objects.equals(this.memoryUsage, that.memoryUsage) && Objects.equals(this.diskUsage, that.diskUsage)
            && Objects.equals(this.totalMemory, that.totalMemory)
            && Objects.equals(this.availableMemory, that.availableMemory)
            && Objects.equals(this.totalHardDiskSpace, that.totalHardDiskSpace)
            && Objects.equals(this.availableHardDiskSpace, that.availableHardDiskSpace)
            && Objects.equals(this.networkRead, that.networkRead)
            && Objects.equals(this.networkWrite, that.networkWrite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runningStatus,
            cpuUsage,
            memoryUsage,
            diskUsage,
            totalMemory,
            availableMemory,
            totalHardDiskSpace,
            availableHardDiskSpace,
            networkRead,
            networkWrite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeDetail {\n");
        sb.append("    runningStatus: ").append(toIndentedString(runningStatus)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
        sb.append("    availableMemory: ").append(toIndentedString(availableMemory)).append("\n");
        sb.append("    totalHardDiskSpace: ").append(toIndentedString(totalHardDiskSpace)).append("\n");
        sb.append("    availableHardDiskSpace: ").append(toIndentedString(availableHardDiskSpace)).append("\n");
        sb.append("    networkRead: ").append(toIndentedString(networkRead)).append("\n");
        sb.append("    networkWrite: ").append(toIndentedString(networkWrite)).append("\n");
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
