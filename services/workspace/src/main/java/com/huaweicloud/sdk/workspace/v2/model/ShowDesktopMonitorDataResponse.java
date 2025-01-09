package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDesktopMonitorDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_online_info")

    private List<MonitorUserOnlineInfo> userOnlineInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_status")

    private Integer onlineStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_info")

    private List<Datapoints> cpuInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_info")

    private List<Datapoints> memoryInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_util_inband")

    private List<Datapoints> diskUtilInband = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_read_bytes_rate")

    private List<Datapoints> diskReadBytesRate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_write_bytes_rate")

    private List<Datapoints> diskWriteBytesRate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_read_requests_rate")

    private List<Datapoints> diskReadRequestsRate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_write_requests_rate")

    private List<Datapoints> diskWriteRequestsRate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_incoming_bytes_rate_inband")

    private List<Datapoints> networkIncomingBytesRateInband = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_outgoing_bytes_rate_inband")

    private List<Datapoints> networkOutgoingBytesRateInband = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_incoming_bytes_aggregate_rate")

    private List<Datapoints> networkIncomingBytesAggregateRate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_outgoing_bytes_aggregate_rate")

    private List<Datapoints> networkOutgoingBytesAggregateRate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_vm_connections")

    private List<Datapoints> networkVmConnections = null;

    public ShowDesktopMonitorDataResponse withUserOnlineInfo(List<MonitorUserOnlineInfo> userOnlineInfo) {
        this.userOnlineInfo = userOnlineInfo;
        return this;
    }

    public ShowDesktopMonitorDataResponse addUserOnlineInfoItem(MonitorUserOnlineInfo userOnlineInfoItem) {
        if (this.userOnlineInfo == null) {
            this.userOnlineInfo = new ArrayList<>();
        }
        this.userOnlineInfo.add(userOnlineInfoItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withUserOnlineInfo(
        Consumer<List<MonitorUserOnlineInfo>> userOnlineInfoSetter) {
        if (this.userOnlineInfo == null) {
            this.userOnlineInfo = new ArrayList<>();
        }
        userOnlineInfoSetter.accept(this.userOnlineInfo);
        return this;
    }

    /**
     * 在线信息
     * @return userOnlineInfo
     */
    public List<MonitorUserOnlineInfo> getUserOnlineInfo() {
        return userOnlineInfo;
    }

    public void setUserOnlineInfo(List<MonitorUserOnlineInfo> userOnlineInfo) {
        this.userOnlineInfo = userOnlineInfo;
    }

    public ShowDesktopMonitorDataResponse withOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    /**
     * 计算机登录状态，在线信息没值的情况下，查看计算机登录状态 0 未登录， 1 登录中, 2登录状态同当前
     * minimum: 0
     * maximum: 255
     * @return onlineStatus
     */
    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public ShowDesktopMonitorDataResponse withCpuInfo(List<Datapoints> cpuInfo) {
        this.cpuInfo = cpuInfo;
        return this;
    }

    public ShowDesktopMonitorDataResponse addCpuInfoItem(Datapoints cpuInfoItem) {
        if (this.cpuInfo == null) {
            this.cpuInfo = new ArrayList<>();
        }
        this.cpuInfo.add(cpuInfoItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withCpuInfo(Consumer<List<Datapoints>> cpuInfoSetter) {
        if (this.cpuInfo == null) {
            this.cpuInfo = new ArrayList<>();
        }
        cpuInfoSetter.accept(this.cpuInfo);
        return this;
    }

    /**
     * cpu使用率信息
     * @return cpuInfo
     */
    public List<Datapoints> getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(List<Datapoints> cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public ShowDesktopMonitorDataResponse withMemoryInfo(List<Datapoints> memoryInfo) {
        this.memoryInfo = memoryInfo;
        return this;
    }

    public ShowDesktopMonitorDataResponse addMemoryInfoItem(Datapoints memoryInfoItem) {
        if (this.memoryInfo == null) {
            this.memoryInfo = new ArrayList<>();
        }
        this.memoryInfo.add(memoryInfoItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withMemoryInfo(Consumer<List<Datapoints>> memoryInfoSetter) {
        if (this.memoryInfo == null) {
            this.memoryInfo = new ArrayList<>();
        }
        memoryInfoSetter.accept(this.memoryInfo);
        return this;
    }

    /**
     * 内存使用率信息
     * @return memoryInfo
     */
    public List<Datapoints> getMemoryInfo() {
        return memoryInfo;
    }

    public void setMemoryInfo(List<Datapoints> memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    public ShowDesktopMonitorDataResponse withDiskUtilInband(List<Datapoints> diskUtilInband) {
        this.diskUtilInband = diskUtilInband;
        return this;
    }

    public ShowDesktopMonitorDataResponse addDiskUtilInbandItem(Datapoints diskUtilInbandItem) {
        if (this.diskUtilInband == null) {
            this.diskUtilInband = new ArrayList<>();
        }
        this.diskUtilInband.add(diskUtilInbandItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withDiskUtilInband(Consumer<List<Datapoints>> diskUtilInbandSetter) {
        if (this.diskUtilInband == null) {
            this.diskUtilInband = new ArrayList<>();
        }
        diskUtilInbandSetter.accept(this.diskUtilInband);
        return this;
    }

    /**
     * 磁盘使用率
     * @return diskUtilInband
     */
    public List<Datapoints> getDiskUtilInband() {
        return diskUtilInband;
    }

    public void setDiskUtilInband(List<Datapoints> diskUtilInband) {
        this.diskUtilInband = diskUtilInband;
    }

    public ShowDesktopMonitorDataResponse withDiskReadBytesRate(List<Datapoints> diskReadBytesRate) {
        this.diskReadBytesRate = diskReadBytesRate;
        return this;
    }

    public ShowDesktopMonitorDataResponse addDiskReadBytesRateItem(Datapoints diskReadBytesRateItem) {
        if (this.diskReadBytesRate == null) {
            this.diskReadBytesRate = new ArrayList<>();
        }
        this.diskReadBytesRate.add(diskReadBytesRateItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withDiskReadBytesRate(Consumer<List<Datapoints>> diskReadBytesRateSetter) {
        if (this.diskReadBytesRate == null) {
            this.diskReadBytesRate = new ArrayList<>();
        }
        diskReadBytesRateSetter.accept(this.diskReadBytesRate);
        return this;
    }

    /**
     * 磁盘读带宽
     * @return diskReadBytesRate
     */
    public List<Datapoints> getDiskReadBytesRate() {
        return diskReadBytesRate;
    }

    public void setDiskReadBytesRate(List<Datapoints> diskReadBytesRate) {
        this.diskReadBytesRate = diskReadBytesRate;
    }

    public ShowDesktopMonitorDataResponse withDiskWriteBytesRate(List<Datapoints> diskWriteBytesRate) {
        this.diskWriteBytesRate = diskWriteBytesRate;
        return this;
    }

    public ShowDesktopMonitorDataResponse addDiskWriteBytesRateItem(Datapoints diskWriteBytesRateItem) {
        if (this.diskWriteBytesRate == null) {
            this.diskWriteBytesRate = new ArrayList<>();
        }
        this.diskWriteBytesRate.add(diskWriteBytesRateItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withDiskWriteBytesRate(Consumer<List<Datapoints>> diskWriteBytesRateSetter) {
        if (this.diskWriteBytesRate == null) {
            this.diskWriteBytesRate = new ArrayList<>();
        }
        diskWriteBytesRateSetter.accept(this.diskWriteBytesRate);
        return this;
    }

    /**
     * 磁盘写带宽
     * @return diskWriteBytesRate
     */
    public List<Datapoints> getDiskWriteBytesRate() {
        return diskWriteBytesRate;
    }

    public void setDiskWriteBytesRate(List<Datapoints> diskWriteBytesRate) {
        this.diskWriteBytesRate = diskWriteBytesRate;
    }

    public ShowDesktopMonitorDataResponse withDiskReadRequestsRate(List<Datapoints> diskReadRequestsRate) {
        this.diskReadRequestsRate = diskReadRequestsRate;
        return this;
    }

    public ShowDesktopMonitorDataResponse addDiskReadRequestsRateItem(Datapoints diskReadRequestsRateItem) {
        if (this.diskReadRequestsRate == null) {
            this.diskReadRequestsRate = new ArrayList<>();
        }
        this.diskReadRequestsRate.add(diskReadRequestsRateItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withDiskReadRequestsRate(
        Consumer<List<Datapoints>> diskReadRequestsRateSetter) {
        if (this.diskReadRequestsRate == null) {
            this.diskReadRequestsRate = new ArrayList<>();
        }
        diskReadRequestsRateSetter.accept(this.diskReadRequestsRate);
        return this;
    }

    /**
     * 磁盘读IOPS
     * @return diskReadRequestsRate
     */
    public List<Datapoints> getDiskReadRequestsRate() {
        return diskReadRequestsRate;
    }

    public void setDiskReadRequestsRate(List<Datapoints> diskReadRequestsRate) {
        this.diskReadRequestsRate = diskReadRequestsRate;
    }

    public ShowDesktopMonitorDataResponse withDiskWriteRequestsRate(List<Datapoints> diskWriteRequestsRate) {
        this.diskWriteRequestsRate = diskWriteRequestsRate;
        return this;
    }

    public ShowDesktopMonitorDataResponse addDiskWriteRequestsRateItem(Datapoints diskWriteRequestsRateItem) {
        if (this.diskWriteRequestsRate == null) {
            this.diskWriteRequestsRate = new ArrayList<>();
        }
        this.diskWriteRequestsRate.add(diskWriteRequestsRateItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withDiskWriteRequestsRate(
        Consumer<List<Datapoints>> diskWriteRequestsRateSetter) {
        if (this.diskWriteRequestsRate == null) {
            this.diskWriteRequestsRate = new ArrayList<>();
        }
        diskWriteRequestsRateSetter.accept(this.diskWriteRequestsRate);
        return this;
    }

    /**
     * 磁盘写IOPS
     * @return diskWriteRequestsRate
     */
    public List<Datapoints> getDiskWriteRequestsRate() {
        return diskWriteRequestsRate;
    }

    public void setDiskWriteRequestsRate(List<Datapoints> diskWriteRequestsRate) {
        this.diskWriteRequestsRate = diskWriteRequestsRate;
    }

    public ShowDesktopMonitorDataResponse withNetworkIncomingBytesRateInband(
        List<Datapoints> networkIncomingBytesRateInband) {
        this.networkIncomingBytesRateInband = networkIncomingBytesRateInband;
        return this;
    }

    public ShowDesktopMonitorDataResponse addNetworkIncomingBytesRateInbandItem(
        Datapoints networkIncomingBytesRateInbandItem) {
        if (this.networkIncomingBytesRateInband == null) {
            this.networkIncomingBytesRateInband = new ArrayList<>();
        }
        this.networkIncomingBytesRateInband.add(networkIncomingBytesRateInbandItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withNetworkIncomingBytesRateInband(
        Consumer<List<Datapoints>> networkIncomingBytesRateInbandSetter) {
        if (this.networkIncomingBytesRateInband == null) {
            this.networkIncomingBytesRateInband = new ArrayList<>();
        }
        networkIncomingBytesRateInbandSetter.accept(this.networkIncomingBytesRateInband);
        return this;
    }

    /**
     * 带内网络流入速率
     * @return networkIncomingBytesRateInband
     */
    public List<Datapoints> getNetworkIncomingBytesRateInband() {
        return networkIncomingBytesRateInband;
    }

    public void setNetworkIncomingBytesRateInband(List<Datapoints> networkIncomingBytesRateInband) {
        this.networkIncomingBytesRateInband = networkIncomingBytesRateInband;
    }

    public ShowDesktopMonitorDataResponse withNetworkOutgoingBytesRateInband(
        List<Datapoints> networkOutgoingBytesRateInband) {
        this.networkOutgoingBytesRateInband = networkOutgoingBytesRateInband;
        return this;
    }

    public ShowDesktopMonitorDataResponse addNetworkOutgoingBytesRateInbandItem(
        Datapoints networkOutgoingBytesRateInbandItem) {
        if (this.networkOutgoingBytesRateInband == null) {
            this.networkOutgoingBytesRateInband = new ArrayList<>();
        }
        this.networkOutgoingBytesRateInband.add(networkOutgoingBytesRateInbandItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withNetworkOutgoingBytesRateInband(
        Consumer<List<Datapoints>> networkOutgoingBytesRateInbandSetter) {
        if (this.networkOutgoingBytesRateInband == null) {
            this.networkOutgoingBytesRateInband = new ArrayList<>();
        }
        networkOutgoingBytesRateInbandSetter.accept(this.networkOutgoingBytesRateInband);
        return this;
    }

    /**
     * 带内网络流出速率
     * @return networkOutgoingBytesRateInband
     */
    public List<Datapoints> getNetworkOutgoingBytesRateInband() {
        return networkOutgoingBytesRateInband;
    }

    public void setNetworkOutgoingBytesRateInband(List<Datapoints> networkOutgoingBytesRateInband) {
        this.networkOutgoingBytesRateInband = networkOutgoingBytesRateInband;
    }

    public ShowDesktopMonitorDataResponse withNetworkIncomingBytesAggregateRate(
        List<Datapoints> networkIncomingBytesAggregateRate) {
        this.networkIncomingBytesAggregateRate = networkIncomingBytesAggregateRate;
        return this;
    }

    public ShowDesktopMonitorDataResponse addNetworkIncomingBytesAggregateRateItem(
        Datapoints networkIncomingBytesAggregateRateItem) {
        if (this.networkIncomingBytesAggregateRate == null) {
            this.networkIncomingBytesAggregateRate = new ArrayList<>();
        }
        this.networkIncomingBytesAggregateRate.add(networkIncomingBytesAggregateRateItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withNetworkIncomingBytesAggregateRate(
        Consumer<List<Datapoints>> networkIncomingBytesAggregateRateSetter) {
        if (this.networkIncomingBytesAggregateRate == null) {
            this.networkIncomingBytesAggregateRate = new ArrayList<>();
        }
        networkIncomingBytesAggregateRateSetter.accept(this.networkIncomingBytesAggregateRate);
        return this;
    }

    /**
     * 带外网络流入速率
     * @return networkIncomingBytesAggregateRate
     */
    public List<Datapoints> getNetworkIncomingBytesAggregateRate() {
        return networkIncomingBytesAggregateRate;
    }

    public void setNetworkIncomingBytesAggregateRate(List<Datapoints> networkIncomingBytesAggregateRate) {
        this.networkIncomingBytesAggregateRate = networkIncomingBytesAggregateRate;
    }

    public ShowDesktopMonitorDataResponse withNetworkOutgoingBytesAggregateRate(
        List<Datapoints> networkOutgoingBytesAggregateRate) {
        this.networkOutgoingBytesAggregateRate = networkOutgoingBytesAggregateRate;
        return this;
    }

    public ShowDesktopMonitorDataResponse addNetworkOutgoingBytesAggregateRateItem(
        Datapoints networkOutgoingBytesAggregateRateItem) {
        if (this.networkOutgoingBytesAggregateRate == null) {
            this.networkOutgoingBytesAggregateRate = new ArrayList<>();
        }
        this.networkOutgoingBytesAggregateRate.add(networkOutgoingBytesAggregateRateItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withNetworkOutgoingBytesAggregateRate(
        Consumer<List<Datapoints>> networkOutgoingBytesAggregateRateSetter) {
        if (this.networkOutgoingBytesAggregateRate == null) {
            this.networkOutgoingBytesAggregateRate = new ArrayList<>();
        }
        networkOutgoingBytesAggregateRateSetter.accept(this.networkOutgoingBytesAggregateRate);
        return this;
    }

    /**
     * 带外网络流出速率
     * @return networkOutgoingBytesAggregateRate
     */
    public List<Datapoints> getNetworkOutgoingBytesAggregateRate() {
        return networkOutgoingBytesAggregateRate;
    }

    public void setNetworkOutgoingBytesAggregateRate(List<Datapoints> networkOutgoingBytesAggregateRate) {
        this.networkOutgoingBytesAggregateRate = networkOutgoingBytesAggregateRate;
    }

    public ShowDesktopMonitorDataResponse withNetworkVmConnections(List<Datapoints> networkVmConnections) {
        this.networkVmConnections = networkVmConnections;
        return this;
    }

    public ShowDesktopMonitorDataResponse addNetworkVmConnectionsItem(Datapoints networkVmConnectionsItem) {
        if (this.networkVmConnections == null) {
            this.networkVmConnections = new ArrayList<>();
        }
        this.networkVmConnections.add(networkVmConnectionsItem);
        return this;
    }

    public ShowDesktopMonitorDataResponse withNetworkVmConnections(
        Consumer<List<Datapoints>> networkVmConnectionsSetter) {
        if (this.networkVmConnections == null) {
            this.networkVmConnections = new ArrayList<>();
        }
        networkVmConnectionsSetter.accept(this.networkVmConnections);
        return this;
    }

    /**
     * 网络连接数
     * @return networkVmConnections
     */
    public List<Datapoints> getNetworkVmConnections() {
        return networkVmConnections;
    }

    public void setNetworkVmConnections(List<Datapoints> networkVmConnections) {
        this.networkVmConnections = networkVmConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesktopMonitorDataResponse that = (ShowDesktopMonitorDataResponse) obj;
        return Objects.equals(this.userOnlineInfo, that.userOnlineInfo)
            && Objects.equals(this.onlineStatus, that.onlineStatus) && Objects.equals(this.cpuInfo, that.cpuInfo)
            && Objects.equals(this.memoryInfo, that.memoryInfo)
            && Objects.equals(this.diskUtilInband, that.diskUtilInband)
            && Objects.equals(this.diskReadBytesRate, that.diskReadBytesRate)
            && Objects.equals(this.diskWriteBytesRate, that.diskWriteBytesRate)
            && Objects.equals(this.diskReadRequestsRate, that.diskReadRequestsRate)
            && Objects.equals(this.diskWriteRequestsRate, that.diskWriteRequestsRate)
            && Objects.equals(this.networkIncomingBytesRateInband, that.networkIncomingBytesRateInband)
            && Objects.equals(this.networkOutgoingBytesRateInband, that.networkOutgoingBytesRateInband)
            && Objects.equals(this.networkIncomingBytesAggregateRate, that.networkIncomingBytesAggregateRate)
            && Objects.equals(this.networkOutgoingBytesAggregateRate, that.networkOutgoingBytesAggregateRate)
            && Objects.equals(this.networkVmConnections, that.networkVmConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userOnlineInfo,
            onlineStatus,
            cpuInfo,
            memoryInfo,
            diskUtilInband,
            diskReadBytesRate,
            diskWriteBytesRate,
            diskReadRequestsRate,
            diskWriteRequestsRate,
            networkIncomingBytesRateInband,
            networkOutgoingBytesRateInband,
            networkIncomingBytesAggregateRate,
            networkOutgoingBytesAggregateRate,
            networkVmConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesktopMonitorDataResponse {\n");
        sb.append("    userOnlineInfo: ").append(toIndentedString(userOnlineInfo)).append("\n");
        sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
        sb.append("    cpuInfo: ").append(toIndentedString(cpuInfo)).append("\n");
        sb.append("    memoryInfo: ").append(toIndentedString(memoryInfo)).append("\n");
        sb.append("    diskUtilInband: ").append(toIndentedString(diskUtilInband)).append("\n");
        sb.append("    diskReadBytesRate: ").append(toIndentedString(diskReadBytesRate)).append("\n");
        sb.append("    diskWriteBytesRate: ").append(toIndentedString(diskWriteBytesRate)).append("\n");
        sb.append("    diskReadRequestsRate: ").append(toIndentedString(diskReadRequestsRate)).append("\n");
        sb.append("    diskWriteRequestsRate: ").append(toIndentedString(diskWriteRequestsRate)).append("\n");
        sb.append("    networkIncomingBytesRateInband: ")
            .append(toIndentedString(networkIncomingBytesRateInband))
            .append("\n");
        sb.append("    networkOutgoingBytesRateInband: ")
            .append(toIndentedString(networkOutgoingBytesRateInband))
            .append("\n");
        sb.append("    networkIncomingBytesAggregateRate: ")
            .append(toIndentedString(networkIncomingBytesAggregateRate))
            .append("\n");
        sb.append("    networkOutgoingBytesAggregateRate: ")
            .append(toIndentedString(networkOutgoingBytesAggregateRate))
            .append("\n");
        sb.append("    networkVmConnections: ").append(toIndentedString(networkVmConnections)).append("\n");
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
