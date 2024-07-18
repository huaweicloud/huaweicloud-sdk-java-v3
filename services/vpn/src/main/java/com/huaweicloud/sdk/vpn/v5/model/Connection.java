package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Connection
 */
public class Connection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_virtual_ip")

    private String clientVirtualIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_user_name")

    private String clientUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_packets")

    private Long inboundPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outbound_packets")

    private Long outboundPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_bytes")

    private Long inboundBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outbound_bytes")

    private Long outboundBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_established_time")

    private OffsetDateTime connectionEstablishedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private OffsetDateTime timestamp;

    public Connection withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public Connection withClientVirtualIp(String clientVirtualIp) {
        this.clientVirtualIp = clientVirtualIp;
        return this;
    }

    /**
     * 客户端虚拟IP
     * @return clientVirtualIp
     */
    public String getClientVirtualIp() {
        return clientVirtualIp;
    }

    public void setClientVirtualIp(String clientVirtualIp) {
        this.clientVirtualIp = clientVirtualIp;
    }

    public Connection withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端IP
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Connection withClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
        return this;
    }

    /**
     * 客户端用户名称
     * @return clientUserName
     */
    public String getClientUserName() {
        return clientUserName;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public Connection withInboundPackets(Long inboundPackets) {
        this.inboundPackets = inboundPackets;
        return this;
    }

    /**
     * 入网包数
     * @return inboundPackets
     */
    public Long getInboundPackets() {
        return inboundPackets;
    }

    public void setInboundPackets(Long inboundPackets) {
        this.inboundPackets = inboundPackets;
    }

    public Connection withOutboundPackets(Long outboundPackets) {
        this.outboundPackets = outboundPackets;
        return this;
    }

    /**
     * 出网包数
     * @return outboundPackets
     */
    public Long getOutboundPackets() {
        return outboundPackets;
    }

    public void setOutboundPackets(Long outboundPackets) {
        this.outboundPackets = outboundPackets;
    }

    public Connection withInboundBytes(Long inboundBytes) {
        this.inboundBytes = inboundBytes;
        return this;
    }

    /**
     * 入网字节数
     * @return inboundBytes
     */
    public Long getInboundBytes() {
        return inboundBytes;
    }

    public void setInboundBytes(Long inboundBytes) {
        this.inboundBytes = inboundBytes;
    }

    public Connection withOutboundBytes(Long outboundBytes) {
        this.outboundBytes = outboundBytes;
        return this;
    }

    /**
     * 出网字节数
     * @return outboundBytes
     */
    public Long getOutboundBytes() {
        return outboundBytes;
    }

    public void setOutboundBytes(Long outboundBytes) {
        this.outboundBytes = outboundBytes;
    }

    public Connection withConnectionEstablishedTime(OffsetDateTime connectionEstablishedTime) {
        this.connectionEstablishedTime = connectionEstablishedTime;
        return this;
    }

    /**
     * 连接建立时间
     * @return connectionEstablishedTime
     */
    public OffsetDateTime getConnectionEstablishedTime() {
        return connectionEstablishedTime;
    }

    public void setConnectionEstablishedTime(OffsetDateTime connectionEstablishedTime) {
        this.connectionEstablishedTime = connectionEstablishedTime;
    }

    public Connection withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间戳
     * @return timestamp
     */
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Connection that = (Connection) obj;
        return Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.clientVirtualIp, that.clientVirtualIp)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.clientUserName, that.clientUserName)
            && Objects.equals(this.inboundPackets, that.inboundPackets)
            && Objects.equals(this.outboundPackets, that.outboundPackets)
            && Objects.equals(this.inboundBytes, that.inboundBytes)
            && Objects.equals(this.outboundBytes, that.outboundBytes)
            && Objects.equals(this.connectionEstablishedTime, that.connectionEstablishedTime)
            && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId,
            clientVirtualIp,
            clientIp,
            clientUserName,
            inboundPackets,
            outboundPackets,
            inboundBytes,
            outboundBytes,
            connectionEstablishedTime,
            timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Connection {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    clientVirtualIp: ").append(toIndentedString(clientVirtualIp)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientUserName: ").append(toIndentedString(clientUserName)).append("\n");
        sb.append("    inboundPackets: ").append(toIndentedString(inboundPackets)).append("\n");
        sb.append("    outboundPackets: ").append(toIndentedString(outboundPackets)).append("\n");
        sb.append("    inboundBytes: ").append(toIndentedString(inboundBytes)).append("\n");
        sb.append("    outboundBytes: ").append(toIndentedString(outboundBytes)).append("\n");
        sb.append("    connectionEstablishedTime: ").append(toIndentedString(connectionEstablishedTime)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
