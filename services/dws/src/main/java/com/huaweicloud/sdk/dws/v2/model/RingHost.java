package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群主机信息
 */
public class RingHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_ip")

    private String backIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_cores")

    private Integer cpuCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Double memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_size")

    private Double diskSize;

    public RingHost withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public RingHost withBackIp(String backIp) {
        this.backIp = backIp;
        return this;
    }

    /**
     * 后端IP地址
     * @return backIp
     */
    public String getBackIp() {
        return backIp;
    }

    public void setBackIp(String backIp) {
        this.backIp = backIp;
    }

    public RingHost withCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * 主机CPU核数
     * @return cpuCores
     */
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public RingHost withMemory(Double memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 主机内存
     * @return memory
     */
    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public RingHost withDiskSize(Double diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * 主机磁盘大小
     * @return diskSize
     */
    public Double getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Double diskSize) {
        this.diskSize = diskSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RingHost that = (RingHost) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.backIp, that.backIp)
            && Objects.equals(this.cpuCores, that.cpuCores) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.diskSize, that.diskSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, backIp, cpuCores, memory, diskSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RingHost {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    backIp: ").append(toIndentedString(backIp)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
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
