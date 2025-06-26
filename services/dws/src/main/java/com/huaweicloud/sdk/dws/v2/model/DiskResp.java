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
    @JsonProperty(value = "instance_id")

    private String instanceId;

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
     * **参数解释**： 实例名称。 **取值范围**： 不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DiskResp withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **取值范围**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DiskResp withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 主机名称。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘名称。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘类型(系统盘、数据盘、日志盘)。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘总容量(GB)。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘已使用容量(GB)。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘可用容量(GB)。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘使用率(%)。 **取值范围**： 不涉及。
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
     * **参数解释**： IO等待时间(ms)。 **取值范围**： 不涉及。
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
     * **参数解释**： IO服务时间(ms)。 **取值范围**： 不涉及。
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
     * **参数解释**： IO使用率(%)。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘读速率(KB/s)。 **取值范围**： 不涉及。
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
     * **参数解释**： 磁盘写速率(KB/s)。 **取值范围**： 不涉及。
     * @return writeRate
     */
    public Double getWriteRate() {
        return writeRate;
    }

    public void setWriteRate(Double writeRate) {
        this.writeRate = writeRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskResp that = (DiskResp) obj;
        return Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.diskName, that.diskName)
            && Objects.equals(this.diskType, that.diskType) && Objects.equals(this.total, that.total)
            && Objects.equals(this.used, that.used) && Objects.equals(this.available, that.available)
            && Objects.equals(this.usedPercentage, that.usedPercentage) && Objects.equals(this.await, that.await)
            && Objects.equals(this.svctm, that.svctm) && Objects.equals(this.util, that.util)
            && Objects.equals(this.readRate, that.readRate) && Objects.equals(this.writeRate, that.writeRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName,
            instanceId,
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
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
