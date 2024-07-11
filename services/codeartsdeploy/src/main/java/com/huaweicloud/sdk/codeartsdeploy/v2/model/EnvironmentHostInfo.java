package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机详情信息
 */
public class EnvironmentHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private EnvironmentHostPermission permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as_proxy")

    private Boolean asProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host_id")

    private String proxyHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host_name")

    private String proxyHostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_status")

    private String connectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastest_connection_time")

    private String lastestConnectionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_result")

    private String connectionResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    public EnvironmentHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public EnvironmentHostInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 主机ip，如：161.17.101.12
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public EnvironmentHostInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * ssh端口，如：22
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public EnvironmentHostInfo withPermission(EnvironmentHostPermission permission) {
        this.permission = permission;
        return this;
    }

    public EnvironmentHostInfo withPermission(Consumer<EnvironmentHostPermission> permissionSetter) {
        if (this.permission == null) {
            this.permission = new EnvironmentHostPermission();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    public EnvironmentHostPermission getPermission() {
        return permission;
    }

    public void setPermission(EnvironmentHostPermission permission) {
        this.permission = permission;
    }

    public EnvironmentHostInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 主机集群id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public EnvironmentHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public EnvironmentHostInfo withAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
        return this;
    }

    /**
     * 是否为代理机
     * @return asProxy
     */
    public Boolean getAsProxy() {
        return asProxy;
    }

    public void setAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
    }

    public EnvironmentHostInfo withProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
        return this;
    }

    /**
     * 代理机id
     * @return proxyHostId
     */
    public String getProxyHostId() {
        return proxyHostId;
    }

    public void setProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
    }

    public EnvironmentHostInfo withProxyHostName(String proxyHostName) {
        this.proxyHostName = proxyHostName;
        return this;
    }

    /**
     * 代理机名称
     * @return proxyHostName
     */
    public String getProxyHostName() {
        return proxyHostName;
    }

    public void setProxyHostName(String proxyHostName) {
        this.proxyHostName = proxyHostName;
    }

    public EnvironmentHostInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 主机所属人id
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public EnvironmentHostInfo withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 主机所属人名称
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public EnvironmentHostInfo withConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    /**
     * 连通性状态
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public EnvironmentHostInfo withLastestConnectionTime(String lastestConnectionTime) {
        this.lastestConnectionTime = lastestConnectionTime;
        return this;
    }

    /**
     * 上次连通时间
     * @return lastestConnectionTime
     */
    public String getLastestConnectionTime() {
        return lastestConnectionTime;
    }

    public void setLastestConnectionTime(String lastestConnectionTime) {
        this.lastestConnectionTime = lastestConnectionTime;
    }

    public EnvironmentHostInfo withConnectionResult(String connectionResult) {
        this.connectionResult = connectionResult;
        return this;
    }

    /**
     * 连通性验证结果
     * @return connectionResult
     */
    public String getConnectionResult() {
        return connectionResult;
    }

    public void setConnectionResult(String connectionResult) {
        this.connectionResult = connectionResult;
    }

    public EnvironmentHostInfo withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 创建人昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvironmentHostInfo that = (EnvironmentHostInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.asProxy, that.asProxy) && Objects.equals(this.proxyHostId, that.proxyHostId)
            && Objects.equals(this.proxyHostName, that.proxyHostName) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.connectionStatus, that.connectionStatus)
            && Objects.equals(this.lastestConnectionTime, that.lastestConnectionTime)
            && Objects.equals(this.connectionResult, that.connectionResult)
            && Objects.equals(this.nickName, that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            ip,
            port,
            permission,
            groupId,
            hostName,
            asProxy,
            proxyHostId,
            proxyHostName,
            ownerId,
            ownerName,
            connectionStatus,
            lastestConnectionTime,
            connectionResult,
            nickName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentHostInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    asProxy: ").append(toIndentedString(asProxy)).append("\n");
        sb.append("    proxyHostId: ").append(toIndentedString(proxyHostId)).append("\n");
        sb.append("    proxyHostName: ").append(toIndentedString(proxyHostName)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
        sb.append("    lastestConnectionTime: ").append(toIndentedString(lastestConnectionTime)).append("\n");
        sb.append("    connectionResult: ").append(toIndentedString(connectionResult)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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
