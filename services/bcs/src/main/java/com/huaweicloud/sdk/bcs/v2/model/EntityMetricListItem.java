package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 监控数据列表项目 */
public class EntityMetricListItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsage")

    private String cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskReadRate")

    private String diskReadRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskWriteRate")

    private String diskWriteRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memUsage")

    private String memUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recvBytesRate")

    private String recvBytesRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendBytesRate")

    private String sendBytesRate;

    public EntityMetricListItem withCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /** cpu使用率
     * 
     * @return cpuUsage */
    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public EntityMetricListItem withDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }

    /** 磁盘使用率
     * 
     * @return diskReadRate */
    public String getDiskReadRate() {
        return diskReadRate;
    }

    public void setDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
    }

    public EntityMetricListItem withDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }

    /** 磁盘写入速率
     * 
     * @return diskWriteRate */
    public String getDiskWriteRate() {
        return diskWriteRate;
    }

    public void setDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
    }

    public EntityMetricListItem withMemUsage(String memUsage) {
        this.memUsage = memUsage;
        return this;
    }

    /** 物理内存使用率
     * 
     * @return memUsage */
    public String getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(String memUsage) {
        this.memUsage = memUsage;
    }

    public EntityMetricListItem withRecvBytesRate(String recvBytesRate) {
        this.recvBytesRate = recvBytesRate;
        return this;
    }

    /** 下行BPs
     * 
     * @return recvBytesRate */
    public String getRecvBytesRate() {
        return recvBytesRate;
    }

    public void setRecvBytesRate(String recvBytesRate) {
        this.recvBytesRate = recvBytesRate;
    }

    public EntityMetricListItem withSendBytesRate(String sendBytesRate) {
        this.sendBytesRate = sendBytesRate;
        return this;
    }

    /** 上行BPs
     * 
     * @return sendBytesRate */
    public String getSendBytesRate() {
        return sendBytesRate;
    }

    public void setSendBytesRate(String sendBytesRate) {
        this.sendBytesRate = sendBytesRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityMetricListItem entityMetricListItem = (EntityMetricListItem) o;
        return Objects.equals(this.cpuUsage, entityMetricListItem.cpuUsage)
            && Objects.equals(this.diskReadRate, entityMetricListItem.diskReadRate)
            && Objects.equals(this.diskWriteRate, entityMetricListItem.diskWriteRate)
            && Objects.equals(this.memUsage, entityMetricListItem.memUsage)
            && Objects.equals(this.recvBytesRate, entityMetricListItem.recvBytesRate)
            && Objects.equals(this.sendBytesRate, entityMetricListItem.sendBytesRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuUsage, diskReadRate, diskWriteRate, memUsage, recvBytesRate, sendBytesRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityMetricListItem {\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    diskReadRate: ").append(toIndentedString(diskReadRate)).append("\n");
        sb.append("    diskWriteRate: ").append(toIndentedString(diskWriteRate)).append("\n");
        sb.append("    memUsage: ").append(toIndentedString(memUsage)).append("\n");
        sb.append("    recvBytesRate: ").append(toIndentedString(recvBytesRate)).append("\n");
        sb.append("    sendBytesRate: ").append(toIndentedString(sendBytesRate)).append("\n");
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
