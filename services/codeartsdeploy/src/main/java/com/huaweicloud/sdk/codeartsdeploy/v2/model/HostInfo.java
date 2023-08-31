package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机信息
 */
public class HostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private HostAuthorizationBody authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionHostDetail permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as_proxy")

    private Boolean asProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host_id")

    private String proxyHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host")

    private HostInfo proxyHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_status")

    private String connectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastest_connection_time")

    private String lastestConnectionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_result")

    private String connectionResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_status")

    private String importStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_count")

    private Integer envCount;

    public HostInfo withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 主机ID
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public HostInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 主机IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public HostInfo withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 主机操作系统
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public HostInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HostInfo withAuthorization(HostAuthorizationBody authorization) {
        this.authorization = authorization;
        return this;
    }

    public HostInfo withAuthorization(Consumer<HostAuthorizationBody> authorizationSetter) {
        if (this.authorization == null) {
            this.authorization = new HostAuthorizationBody();
            authorizationSetter.accept(this.authorization);
        }

        return this;
    }

    /**
     * Get authorization
     * @return authorization
     */
    public HostAuthorizationBody getAuthorization() {
        return authorization;
    }

    public void setAuthorization(HostAuthorizationBody authorization) {
        this.authorization = authorization;
    }

    public HostInfo withPermission(PermissionHostDetail permission) {
        this.permission = permission;
        return this;
    }

    public HostInfo withPermission(Consumer<PermissionHostDetail> permissionSetter) {
        if (this.permission == null) {
            this.permission = new PermissionHostDetail();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    public PermissionHostDetail getPermission() {
        return permission;
    }

    public void setPermission(PermissionHostDetail permission) {
        this.permission = permission;
    }

    public HostInfo withHostName(String hostName) {
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

    public HostInfo withAsProxy(Boolean asProxy) {
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

    public HostInfo withGroupId(String groupId) {
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

    public HostInfo withProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
        return this;
    }

    /**
     * 代理机ID
     * @return proxyHostId
     */
    public String getProxyHostId() {
        return proxyHostId;
    }

    public void setProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
    }

    public HostInfo withOwnerId(String ownerId) {
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

    public HostInfo withOwnerName(String ownerName) {
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

    public HostInfo withProxyHost(HostInfo proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    public HostInfo withProxyHost(Consumer<HostInfo> proxyHostSetter) {
        if (this.proxyHost == null) {
            this.proxyHost = new HostInfo();
            proxyHostSetter.accept(this.proxyHost);
        }

        return this;
    }

    /**
     * Get proxyHost
     * @return proxyHost
     */
    public HostInfo getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(HostInfo proxyHost) {
        this.proxyHost = proxyHost;
    }

    public HostInfo withConnectionStatus(String connectionStatus) {
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

    public HostInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public HostInfo withLastestConnectionTime(String lastestConnectionTime) {
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

    public HostInfo withConnectionResult(String connectionResult) {
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

    public HostInfo withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 主机所属人昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public HostInfo withImportStatus(String importStatus) {
        this.importStatus = importStatus;
        return this;
    }

    /**
     * 导入状态
     * @return importStatus
     */
    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public HostInfo withEnvCount(Integer envCount) {
        this.envCount = envCount;
        return this;
    }

    /**
     * 关联环境数量
     * @return envCount
     */
    public Integer getEnvCount() {
        return envCount;
    }

    public void setEnvCount(Integer envCount) {
        this.envCount = envCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostInfo that = (HostInfo) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.os, that.os) && Objects.equals(this.port, that.port)
            && Objects.equals(this.authorization, that.authorization)
            && Objects.equals(this.permission, that.permission) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.asProxy, that.asProxy) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.proxyHostId, that.proxyHostId) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.ownerName, that.ownerName) && Objects.equals(this.proxyHost, that.proxyHost)
            && Objects.equals(this.connectionStatus, that.connectionStatus)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastestConnectionTime, that.lastestConnectionTime)
            && Objects.equals(this.connectionResult, that.connectionResult)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.importStatus, that.importStatus)
            && Objects.equals(this.envCount, that.envCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid,
            ip,
            os,
            port,
            authorization,
            permission,
            hostName,
            asProxy,
            groupId,
            proxyHostId,
            ownerId,
            ownerName,
            proxyHost,
            connectionStatus,
            createTime,
            lastestConnectionTime,
            connectionResult,
            nickName,
            importStatus,
            envCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostInfo {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    asProxy: ").append(toIndentedString(asProxy)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    proxyHostId: ").append(toIndentedString(proxyHostId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
        sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastestConnectionTime: ").append(toIndentedString(lastestConnectionTime)).append("\n");
        sb.append("    connectionResult: ").append(toIndentedString(connectionResult)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
        sb.append("    envCount: ").append(toIndentedString(envCount)).append("\n");
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
