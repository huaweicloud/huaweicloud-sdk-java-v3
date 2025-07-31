package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetworkNodeInfo
 */
public class NetworkNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_addr")

    private String ipAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_addr")

    private String ipv6Addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_addr")

    private String privateIpAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ipv6_addr")

    private String privateIpv6Addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_version")

    private String runtimeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private String securityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    public NetworkNodeInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NetworkNodeInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetworkNodeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NetworkNodeInfo withIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * ip地址
     * @return ipAddr
     */
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public NetworkNodeInfo withIpv6Addr(String ipv6Addr) {
        this.ipv6Addr = ipv6Addr;
        return this;
    }

    /**
     * ipv6地址
     * @return ipv6Addr
     */
    public String getIpv6Addr() {
        return ipv6Addr;
    }

    public void setIpv6Addr(String ipv6Addr) {
        this.ipv6Addr = ipv6Addr;
    }

    public NetworkNodeInfo withPrivateIpAddr(String privateIpAddr) {
        this.privateIpAddr = privateIpAddr;
        return this;
    }

    /**
     * 私有ip地址
     * @return privateIpAddr
     */
    public String getPrivateIpAddr() {
        return privateIpAddr;
    }

    public void setPrivateIpAddr(String privateIpAddr) {
        this.privateIpAddr = privateIpAddr;
    }

    public NetworkNodeInfo withPrivateIpv6Addr(String privateIpv6Addr) {
        this.privateIpv6Addr = privateIpv6Addr;
        return this;
    }

    /**
     * 私有ipv6地址
     * @return privateIpv6Addr
     */
    public String getPrivateIpv6Addr() {
        return privateIpv6Addr;
    }

    public void setPrivateIpv6Addr(String privateIpv6Addr) {
        this.privateIpv6Addr = privateIpv6Addr;
    }

    public NetworkNodeInfo withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * 运行时版本
     * @return runtimeVersion
     */
    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    public NetworkNodeInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * os版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public NetworkNodeInfo withSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    /**
     * 安全组
     * @return securityGroup
     */
    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public NetworkNodeInfo withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器id
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public NetworkNodeInfo withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 服务器类型
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkNodeInfo that = (NetworkNodeInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.ipAddr, that.ipAddr)
            && Objects.equals(this.ipv6Addr, that.ipv6Addr) && Objects.equals(this.privateIpAddr, that.privateIpAddr)
            && Objects.equals(this.privateIpv6Addr, that.privateIpv6Addr)
            && Objects.equals(this.runtimeVersion, that.runtimeVersion)
            && Objects.equals(this.osVersion, that.osVersion) && Objects.equals(this.securityGroup, that.securityGroup)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.serverType, that.serverType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            ipAddr,
            ipv6Addr,
            privateIpAddr,
            privateIpv6Addr,
            runtimeVersion,
            osVersion,
            securityGroup,
            serverId,
            serverType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkNodeInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    ipv6Addr: ").append(toIndentedString(ipv6Addr)).append("\n");
        sb.append("    privateIpAddr: ").append(toIndentedString(privateIpAddr)).append("\n");
        sb.append("    privateIpv6Addr: ").append(toIndentedString(privateIpv6Addr)).append("\n");
        sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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
