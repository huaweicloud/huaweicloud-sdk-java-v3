package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostOverviewResponse
 */
public class HostOverviewResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_stat")

    private String hostStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_ip")

    private String workIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_free")

    private Double memFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_total")

    private Double memTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_usage")

    private Double memUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_cached")

    private Double memCached;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_buffer")

    private Double memBuffer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap_free")

    private Double swapFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap_total")

    private Double swapTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private Double cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage_sys")

    private Double cpuUsageSys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage_usr")

    private Double cpuUsageUsr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_idle")

    private Double cpuIdle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_iowait")

    private Double cpuIowait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_usage_avg")

    private Double diskUsageAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_total")

    private Double diskTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_used")

    private Double diskUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_available")

    private Double diskAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_io")

    private Double diskIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_io_read")

    private Double diskIoRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_io_write")

    private Double diskIoWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_resend_rate")

    private Double tcpResendRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_io")

    private Double netIo;

    public HostOverviewResponse withInstanceName(String instanceName) {
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

    public HostOverviewResponse withHostName(String hostName) {
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

    public HostOverviewResponse withHostStat(String hostStat) {
        this.hostStat = hostStat;
        return this;
    }

    /**
     * 主机状态
     * @return hostStat
     */
    public String getHostStat() {
        return hostStat;
    }

    public void setHostStat(String hostStat) {
        this.hostStat = hostStat;
    }

    public HostOverviewResponse withWorkIp(String workIp) {
        this.workIp = workIp;
        return this;
    }

    /**
     * IP地址
     * @return workIp
     */
    public String getWorkIp() {
        return workIp;
    }

    public void setWorkIp(String workIp) {
        this.workIp = workIp;
    }

    public HostOverviewResponse withMemFree(Double memFree) {
        this.memFree = memFree;
        return this;
    }

    /**
     * 系统中未使用的内存(GB)。
     * @return memFree
     */
    public Double getMemFree() {
        return memFree;
    }

    public void setMemFree(Double memFree) {
        this.memFree = memFree;
    }

    public HostOverviewResponse withMemTotal(Double memTotal) {
        this.memTotal = memTotal;
        return this;
    }

    /**
     * 总内存(GB)。
     * @return memTotal
     */
    public Double getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(Double memTotal) {
        this.memTotal = memTotal;
    }

    public HostOverviewResponse withMemUsage(Double memUsage) {
        this.memUsage = memUsage;
        return this;
    }

    /**
     * 内存使用率(GB)。
     * @return memUsage
     */
    public Double getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(Double memUsage) {
        this.memUsage = memUsage;
    }

    public HostOverviewResponse withMemCached(Double memCached) {
        this.memCached = memCached;
        return this;
    }

    /**
     * 缓存内存(GB)。
     * @return memCached
     */
    public Double getMemCached() {
        return memCached;
    }

    public void setMemCached(Double memCached) {
        this.memCached = memCached;
    }

    public HostOverviewResponse withMemBuffer(Double memBuffer) {
        this.memBuffer = memBuffer;
        return this;
    }

    /**
     * 缓冲内存(MB)。
     * @return memBuffer
     */
    public Double getMemBuffer() {
        return memBuffer;
    }

    public void setMemBuffer(Double memBuffer) {
        this.memBuffer = memBuffer;
    }

    public HostOverviewResponse withSwapFree(Double swapFree) {
        this.swapFree = swapFree;
        return this;
    }

    /**
     * ram暂存在swap中的大小(GB)。
     * @return swapFree
     */
    public Double getSwapFree() {
        return swapFree;
    }

    public void setSwapFree(Double swapFree) {
        this.swapFree = swapFree;
    }

    public HostOverviewResponse withSwapTotal(Double swapTotal) {
        this.swapTotal = swapTotal;
        return this;
    }

    /**
     * 交换空间总和(GB)。
     * @return swapTotal
     */
    public Double getSwapTotal() {
        return swapTotal;
    }

    public void setSwapTotal(Double swapTotal) {
        this.swapTotal = swapTotal;
    }

    public HostOverviewResponse withCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * CPU使用率(%)。
     * @return cpuUsage
     */
    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public HostOverviewResponse withCpuUsageSys(Double cpuUsageSys) {
        this.cpuUsageSys = cpuUsageSys;
        return this;
    }

    /**
     * 系统CPU占用率(%)。
     * @return cpuUsageSys
     */
    public Double getCpuUsageSys() {
        return cpuUsageSys;
    }

    public void setCpuUsageSys(Double cpuUsageSys) {
        this.cpuUsageSys = cpuUsageSys;
    }

    public HostOverviewResponse withCpuUsageUsr(Double cpuUsageUsr) {
        this.cpuUsageUsr = cpuUsageUsr;
        return this;
    }

    /**
     * 用户CPU占用率(%)。
     * @return cpuUsageUsr
     */
    public Double getCpuUsageUsr() {
        return cpuUsageUsr;
    }

    public void setCpuUsageUsr(Double cpuUsageUsr) {
        this.cpuUsageUsr = cpuUsageUsr;
    }

    public HostOverviewResponse withCpuIdle(Double cpuIdle) {
        this.cpuIdle = cpuIdle;
        return this;
    }

    /**
     * 空闲CPU占用率(%)。
     * @return cpuIdle
     */
    public Double getCpuIdle() {
        return cpuIdle;
    }

    public void setCpuIdle(Double cpuIdle) {
        this.cpuIdle = cpuIdle;
    }

    public HostOverviewResponse withCpuIowait(Double cpuIowait) {
        this.cpuIowait = cpuIowait;
        return this;
    }

    /**
     * IO等待(%)。
     * @return cpuIowait
     */
    public Double getCpuIowait() {
        return cpuIowait;
    }

    public void setCpuIowait(Double cpuIowait) {
        this.cpuIowait = cpuIowait;
    }

    public HostOverviewResponse withDiskUsageAvg(Double diskUsageAvg) {
        this.diskUsageAvg = diskUsageAvg;
        return this;
    }

    /**
     * 磁盘平均使用率(%)。
     * @return diskUsageAvg
     */
    public Double getDiskUsageAvg() {
        return diskUsageAvg;
    }

    public void setDiskUsageAvg(Double diskUsageAvg) {
        this.diskUsageAvg = diskUsageAvg;
    }

    public HostOverviewResponse withDiskTotal(Double diskTotal) {
        this.diskTotal = diskTotal;
        return this;
    }

    /**
     * 磁盘总容量(GB)。
     * @return diskTotal
     */
    public Double getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(Double diskTotal) {
        this.diskTotal = diskTotal;
    }

    public HostOverviewResponse withDiskUsed(Double diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }

    /**
     * 磁盘使用容量(GB)。
     * @return diskUsed
     */
    public Double getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(Double diskUsed) {
        this.diskUsed = diskUsed;
    }

    public HostOverviewResponse withDiskAvailable(Double diskAvailable) {
        this.diskAvailable = diskAvailable;
        return this;
    }

    /**
     * 磁盘可用容量(GB)。
     * @return diskAvailable
     */
    public Double getDiskAvailable() {
        return diskAvailable;
    }

    public void setDiskAvailable(Double diskAvailable) {
        this.diskAvailable = diskAvailable;
    }

    public HostOverviewResponse withDiskIo(Double diskIo) {
        this.diskIo = diskIo;
        return this;
    }

    /**
     * 磁盘IO(KB/s)。
     * @return diskIo
     */
    public Double getDiskIo() {
        return diskIo;
    }

    public void setDiskIo(Double diskIo) {
        this.diskIo = diskIo;
    }

    public HostOverviewResponse withDiskIoRead(Double diskIoRead) {
        this.diskIoRead = diskIoRead;
        return this;
    }

    /**
     * 磁盘读速率(KB/s)。
     * @return diskIoRead
     */
    public Double getDiskIoRead() {
        return diskIoRead;
    }

    public void setDiskIoRead(Double diskIoRead) {
        this.diskIoRead = diskIoRead;
    }

    public HostOverviewResponse withDiskIoWrite(Double diskIoWrite) {
        this.diskIoWrite = diskIoWrite;
        return this;
    }

    /**
     * 磁盘写速率(KB/s)。
     * @return diskIoWrite
     */
    public Double getDiskIoWrite() {
        return diskIoWrite;
    }

    public void setDiskIoWrite(Double diskIoWrite) {
        this.diskIoWrite = diskIoWrite;
    }

    public HostOverviewResponse withTcpResendRate(Double tcpResendRate) {
        this.tcpResendRate = tcpResendRate;
        return this;
    }

    /**
     * TCP协议栈重传率(%)。
     * @return tcpResendRate
     */
    public Double getTcpResendRate() {
        return tcpResendRate;
    }

    public void setTcpResendRate(Double tcpResendRate) {
        this.tcpResendRate = tcpResendRate;
    }

    public HostOverviewResponse withNetIo(Double netIo) {
        this.netIo = netIo;
        return this;
    }

    /**
     * 网络IO(KB/s)。
     * @return netIo
     */
    public Double getNetIo() {
        return netIo;
    }

    public void setNetIo(Double netIo) {
        this.netIo = netIo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostOverviewResponse that = (HostOverviewResponse) obj;
        return Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostStat, that.hostStat) && Objects.equals(this.workIp, that.workIp)
            && Objects.equals(this.memFree, that.memFree) && Objects.equals(this.memTotal, that.memTotal)
            && Objects.equals(this.memUsage, that.memUsage) && Objects.equals(this.memCached, that.memCached)
            && Objects.equals(this.memBuffer, that.memBuffer) && Objects.equals(this.swapFree, that.swapFree)
            && Objects.equals(this.swapTotal, that.swapTotal) && Objects.equals(this.cpuUsage, that.cpuUsage)
            && Objects.equals(this.cpuUsageSys, that.cpuUsageSys) && Objects.equals(this.cpuUsageUsr, that.cpuUsageUsr)
            && Objects.equals(this.cpuIdle, that.cpuIdle) && Objects.equals(this.cpuIowait, that.cpuIowait)
            && Objects.equals(this.diskUsageAvg, that.diskUsageAvg) && Objects.equals(this.diskTotal, that.diskTotal)
            && Objects.equals(this.diskUsed, that.diskUsed) && Objects.equals(this.diskAvailable, that.diskAvailable)
            && Objects.equals(this.diskIo, that.diskIo) && Objects.equals(this.diskIoRead, that.diskIoRead)
            && Objects.equals(this.diskIoWrite, that.diskIoWrite)
            && Objects.equals(this.tcpResendRate, that.tcpResendRate) && Objects.equals(this.netIo, that.netIo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName,
            hostName,
            hostStat,
            workIp,
            memFree,
            memTotal,
            memUsage,
            memCached,
            memBuffer,
            swapFree,
            swapTotal,
            cpuUsage,
            cpuUsageSys,
            cpuUsageUsr,
            cpuIdle,
            cpuIowait,
            diskUsageAvg,
            diskTotal,
            diskUsed,
            diskAvailable,
            diskIo,
            diskIoRead,
            diskIoWrite,
            tcpResendRate,
            netIo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostOverviewResponse {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostStat: ").append(toIndentedString(hostStat)).append("\n");
        sb.append("    workIp: ").append(toIndentedString(workIp)).append("\n");
        sb.append("    memFree: ").append(toIndentedString(memFree)).append("\n");
        sb.append("    memTotal: ").append(toIndentedString(memTotal)).append("\n");
        sb.append("    memUsage: ").append(toIndentedString(memUsage)).append("\n");
        sb.append("    memCached: ").append(toIndentedString(memCached)).append("\n");
        sb.append("    memBuffer: ").append(toIndentedString(memBuffer)).append("\n");
        sb.append("    swapFree: ").append(toIndentedString(swapFree)).append("\n");
        sb.append("    swapTotal: ").append(toIndentedString(swapTotal)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    cpuUsageSys: ").append(toIndentedString(cpuUsageSys)).append("\n");
        sb.append("    cpuUsageUsr: ").append(toIndentedString(cpuUsageUsr)).append("\n");
        sb.append("    cpuIdle: ").append(toIndentedString(cpuIdle)).append("\n");
        sb.append("    cpuIowait: ").append(toIndentedString(cpuIowait)).append("\n");
        sb.append("    diskUsageAvg: ").append(toIndentedString(diskUsageAvg)).append("\n");
        sb.append("    diskTotal: ").append(toIndentedString(diskTotal)).append("\n");
        sb.append("    diskUsed: ").append(toIndentedString(diskUsed)).append("\n");
        sb.append("    diskAvailable: ").append(toIndentedString(diskAvailable)).append("\n");
        sb.append("    diskIo: ").append(toIndentedString(diskIo)).append("\n");
        sb.append("    diskIoRead: ").append(toIndentedString(diskIoRead)).append("\n");
        sb.append("    diskIoWrite: ").append(toIndentedString(diskIoWrite)).append("\n");
        sb.append("    tcpResendRate: ").append(toIndentedString(tcpResendRate)).append("\n");
        sb.append("    netIo: ").append(toIndentedString(netIo)).append("\n");
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
