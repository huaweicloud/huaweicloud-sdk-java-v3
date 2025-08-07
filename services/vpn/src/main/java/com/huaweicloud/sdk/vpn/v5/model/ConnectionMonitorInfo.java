package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConnectionMonitorInfo
 */
public class ConnectionMonitorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connection_id")

    private String vpnConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_ip")

    private String destinationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proto_type")

    private String protoType;

    public ConnectionMonitorInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPN连接监控ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectionMonitorInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * VPN连接监控状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConnectionMonitorInfo withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * VPN连接监控对应的VPN连接ID
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    public ConnectionMonitorInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 监控类型，取值范围：gateway
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConnectionMonitorInfo withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * VPN连接监控的源地址
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public ConnectionMonitorInfo withDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }

    /**
     * VPN连接监控的目的地址
     * @return destinationIp
     */
    public String getDestinationIp() {
        return destinationIp;
    }

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    public ConnectionMonitorInfo withProtoType(String protoType) {
        this.protoType = protoType;
        return this;
    }

    /**
     * 预留字段，nqa使用的协议类型，目前使用默认值ICMP
     * @return protoType
     */
    public String getProtoType() {
        return protoType;
    }

    public void setProtoType(String protoType) {
        this.protoType = protoType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionMonitorInfo that = (ConnectionMonitorInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.vpnConnectionId, that.vpnConnectionId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.sourceIp, that.sourceIp) && Objects.equals(this.destinationIp, that.destinationIp)
            && Objects.equals(this.protoType, that.protoType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, vpnConnectionId, type, sourceIp, destinationIp, protoType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionMonitorInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    destinationIp: ").append(toIndentedString(destinationIp)).append("\n");
        sb.append("    protoType: ").append(toIndentedString(protoType)).append("\n");
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
