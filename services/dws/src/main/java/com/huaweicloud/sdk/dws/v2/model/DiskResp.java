package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiskResp
 */
public class DiskResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_name")

    private String diskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_type")

    private String diskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Double total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Double used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available")

    private Double available;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_percentage")

    private Double usedPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "await")

    private Double await;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svctm")

    private Double svctm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "util")

    private Double util;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_rate")

    private Double readRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_rate")

    private Double writeRate;

    public DiskResp withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DiskResp withHostName(String hostName) {
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

    public DiskResp withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * 磁盘名称
     * @return diskName
     */
    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public DiskResp withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * 磁盘类型(系统盘、数据盘、日志盘)。
     * @return diskType
     */
    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public DiskResp withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * 磁盘总容量(GB)。
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public DiskResp withUsed(Double used) {
        this.used = used;
        return this;
    }

    /**
     * 磁盘已使用容量(GB)。
     * @return used
     */
    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    public DiskResp withAvailable(Double available) {
        this.available = available;
        return this;
    }

    /**
     * 磁盘可用容量(GB)。
     * @return available
     */
    public Double getAvailable() {
        return available;
    }

    public void setAvailable(Double available) {
        this.available = available;
    }

    public DiskResp withUsedPercentage(Double usedPercentage) {
        this.usedPercentage = usedPercentage;
        return this;
    }

    /**
     * 磁盘使用率(%)。
     * @return usedPercentage
     */
    public Double getUsedPercentage() {
        return usedPercentage;
    }

    public void setUsedPercentage(Double usedPercentage) {
        this.usedPercentage = usedPercentage;
    }

    public DiskResp withAwait(Double await) {
        this.await = await;
        return this;
    }

    /**
     * IO等待时间(ms)。
     * @return await
     */
    public Double getAwait() {
        return await;
    }

    public void setAwait(Double await) {
        this.await = await;
    }

    public DiskResp withSvctm(Double svctm) {
        this.svctm = svctm;
        return this;
    }

    /**
     * IO服务时间(ms)。
     * @return svctm
     */
    public Double getSvctm() {
        return svctm;
    }

    public void setSvctm(Double svctm) {
        this.svctm = svctm;
    }

    public DiskResp withUtil(Double util) {
        this.util = util;
        return this;
    }

    /**
     * IO使用率(%)。
     * @return util
     */
    public Double getUtil() {
        return util;
    }

    public void setUtil(Double util) {
        this.util = util;
    }

    public DiskResp withReadRate(Double readRate) {
        this.readRate = readRate;
        return this;
    }

    /**
     * 磁盘读速率(KB/s)。
     * @return readRate
     */
    public Double getReadRate() {
        return readRate;
    }

    public void setReadRate(Double readRate) {
        this.readRate = readRate;
    }

    public DiskResp withWriteRate(Double writeRate) {
        this.writeRate = writeRate;
        return this;
    }

    /**
     * 磁盘写速率(KB/s)。
     * @return writeRate
     */
    public Double getWriteRate() {
        return writeRate;
    }

    public void setWriteRate(Double writeRate) {
        this.writeRate = writeRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskResp diskResp = (DiskResp) o;
        return Objects.equals(this.instanceName, diskResp.instanceName)
            && Objects.equals(this.hostName, diskResp.hostName) && Objects.equals(this.diskName, diskResp.diskName)
            && Objects.equals(this.diskType, diskResp.diskType) && Objects.equals(this.total, diskResp.total)
            && Objects.equals(this.used, diskResp.used) && Objects.equals(this.available, diskResp.available)
            && Objects.equals(this.usedPercentage, diskResp.usedPercentage)
            && Objects.equals(this.await, diskResp.await) && Objects.equals(this.svctm, diskResp.svctm)
            && Objects.equals(this.util, diskResp.util) && Objects.equals(this.readRate, diskResp.readRate)
            && Objects.equals(this.writeRate, diskResp.writeRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName,
            hostName,
            diskName,
            diskType,
            total,
            used,
            available,
            usedPercentage,
            await,
            svctm,
            util,
            readRate,
            writeRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskResp {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
        sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    usedPercentage: ").append(toIndentedString(usedPercentage)).append("\n");
        sb.append("    await: ").append(toIndentedString(await)).append("\n");
        sb.append("    svctm: ").append(toIndentedString(svctm)).append("\n");
        sb.append("    util: ").append(toIndentedString(util)).append("\n");
        sb.append("    readRate: ").append(toIndentedString(readRate)).append("\n");
        sb.append("    writeRate: ").append(toIndentedString(writeRate)).append("\n");
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
