package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetResp
 */
public class NetResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_cluster_id")

    private Integer virtualClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ctime")

    private Long ctime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private Integer hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "up")

    private Boolean up;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Long speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recv_packets")

    private Long recvPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_packets")

    private Long sendPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recv_drop")

    private Long recvDrop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recv_rate")

    private Double recvRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_rate")

    private Double sendRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_rate")

    private Double ioRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    public NetResp withVirtualClusterId(Integer virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
        return this;
    }

    /**
     * 虚拟集群ID。
     * @return virtualClusterId
     */
    public Integer getVirtualClusterId() {
        return virtualClusterId;
    }

    public void setVirtualClusterId(Integer virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    public NetResp withCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }

    /**
     * 查询时间。
     * @return ctime
     */
    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public NetResp withHostId(Integer hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID。
     * @return hostId
     */
    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public NetResp withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称。
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public NetResp withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public NetResp withUp(Boolean up) {
        this.up = up;
        return this;
    }

    /**
     * 网卡状态（true代表up/false代表down）。
     * @return up
     */
    public Boolean getUp() {
        return up;
    }

    public void setUp(Boolean up) {
        this.up = up;
    }

    public NetResp withSpeed(Long speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 网卡速度(Mbps)。
     * @return speed
     */
    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public NetResp withRecvPackets(Long recvPackets) {
        this.recvPackets = recvPackets;
        return this;
    }

    /**
     * 接收包数(个)。
     * @return recvPackets
     */
    public Long getRecvPackets() {
        return recvPackets;
    }

    public void setRecvPackets(Long recvPackets) {
        this.recvPackets = recvPackets;
    }

    public NetResp withSendPackets(Long sendPackets) {
        this.sendPackets = sendPackets;
        return this;
    }

    /**
     * 发送包数(个)。
     * @return sendPackets
     */
    public Long getSendPackets() {
        return sendPackets;
    }

    public void setSendPackets(Long sendPackets) {
        this.sendPackets = sendPackets;
    }

    public NetResp withRecvDrop(Long recvDrop) {
        this.recvDrop = recvDrop;
        return this;
    }

    /**
     * 接收丢包数(个)。
     * @return recvDrop
     */
    public Long getRecvDrop() {
        return recvDrop;
    }

    public void setRecvDrop(Long recvDrop) {
        this.recvDrop = recvDrop;
    }

    public NetResp withRecvRate(Double recvRate) {
        this.recvRate = recvRate;
        return this;
    }

    /**
     * 接收速率(KB/s)。
     * @return recvRate
     */
    public Double getRecvRate() {
        return recvRate;
    }

    public void setRecvRate(Double recvRate) {
        this.recvRate = recvRate;
    }

    public NetResp withSendRate(Double sendRate) {
        this.sendRate = sendRate;
        return this;
    }

    /**
     * 发送速率(KB/s)。
     * @return sendRate
     */
    public Double getSendRate() {
        return sendRate;
    }

    public void setSendRate(Double sendRate) {
        this.sendRate = sendRate;
    }

    public NetResp withIoRate(Double ioRate) {
        this.ioRate = ioRate;
        return this;
    }

    /**
     * 网络速率(KB/s)。
     * @return ioRate
     */
    public Double getIoRate() {
        return ioRate;
    }

    public void setIoRate(Double ioRate) {
        this.ioRate = ioRate;
    }

    public NetResp withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * 网卡名称。
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetResp that = (NetResp) obj;
        return Objects.equals(this.virtualClusterId, that.virtualClusterId) && Objects.equals(this.ctime, that.ctime)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.up, that.up)
            && Objects.equals(this.speed, that.speed) && Objects.equals(this.recvPackets, that.recvPackets)
            && Objects.equals(this.sendPackets, that.sendPackets) && Objects.equals(this.recvDrop, that.recvDrop)
            && Objects.equals(this.recvRate, that.recvRate) && Objects.equals(this.sendRate, that.sendRate)
            && Objects.equals(this.ioRate, that.ioRate) && Objects.equals(this.interfaceName, that.interfaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualClusterId,
            ctime,
            hostId,
            hostName,
            instanceName,
            up,
            speed,
            recvPackets,
            sendPackets,
            recvDrop,
            recvRate,
            sendRate,
            ioRate,
            interfaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetResp {\n");
        sb.append("    virtualClusterId: ").append(toIndentedString(virtualClusterId)).append("\n");
        sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    up: ").append(toIndentedString(up)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    recvPackets: ").append(toIndentedString(recvPackets)).append("\n");
        sb.append("    sendPackets: ").append(toIndentedString(sendPackets)).append("\n");
        sb.append("    recvDrop: ").append(toIndentedString(recvDrop)).append("\n");
        sb.append("    recvRate: ").append(toIndentedString(recvRate)).append("\n");
        sb.append("    sendRate: ").append(toIndentedString(sendRate)).append("\n");
        sb.append("    ioRate: ").append(toIndentedString(ioRate)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
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
