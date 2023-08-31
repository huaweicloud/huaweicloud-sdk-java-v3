package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机详情信息
 */
public class HostInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

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
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host")

    private String proxyHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_status")

    private String connectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastest_connection_time")

    private String lastestConnectionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_result")

    private String connectionResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_icagent")

    private Boolean installIcagent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    public HostInfoDetail withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HostInfoDetail withIp(String ip) {
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

    public HostInfoDetail withOs(String os) {
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

    public HostInfoDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HostInfoDetail withAuthorization(HostAuthorizationBody authorization) {
        this.authorization = authorization;
        return this;
    }

    public HostInfoDetail withAuthorization(Consumer<HostAuthorizationBody> authorizationSetter) {
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

    public HostInfoDetail withPermission(PermissionHostDetail permission) {
        this.permission = permission;
        return this;
    }

    public HostInfoDetail withPermission(Consumer<PermissionHostDetail> permissionSetter) {
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

    public HostInfoDetail withGroupId(String groupId) {
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

    public HostInfoDetail withHostName(String hostName) {
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

    public HostInfoDetail withAsProxy(Boolean asProxy) {
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

    public HostInfoDetail withProxyHostId(String proxyHostId) {
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

    public HostInfoDetail withOwnerName(String ownerName) {
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

    public HostInfoDetail withProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    /**
     * 代理机
     * @return proxyHost
     */
    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public HostInfoDetail withConnectionStatus(String connectionStatus) {
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

    public HostInfoDetail withCreateTime(String createTime) {
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

    public HostInfoDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public HostInfoDetail withLastestConnectionTime(String lastestConnectionTime) {
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

    public HostInfoDetail withConnectionResult(String connectionResult) {
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

    public HostInfoDetail withInstallIcagent(Boolean installIcagent) {
        this.installIcagent = installIcagent;
        return this;
    }

    /**
     * 免费启用应用运维服务（AOM），提供指标监控、日志查询、告警功能（自动安装数据采集器 ICAgent，仅支持华为云linux主机）
     * @return installIcagent
     */
    public Boolean getInstallIcagent() {
        return installIcagent;
    }

    public void setInstallIcagent(Boolean installIcagent) {
        this.installIcagent = installIcagent;
    }

    public HostInfoDetail withNickName(String nickName) {
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
        HostInfoDetail that = (HostInfoDetail) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.os, that.os) && Objects.equals(this.port, that.port)
            && Objects.equals(this.authorization, that.authorization)
            && Objects.equals(this.permission, that.permission) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.asProxy, that.asProxy)
            && Objects.equals(this.proxyHostId, that.proxyHostId) && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.proxyHost, that.proxyHost)
            && Objects.equals(this.connectionStatus, that.connectionStatus)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.lastestConnectionTime, that.lastestConnectionTime)
            && Objects.equals(this.connectionResult, that.connectionResult)
            && Objects.equals(this.installIcagent, that.installIcagent) && Objects.equals(this.nickName, that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            ip,
            os,
            port,
            authorization,
            permission,
            groupId,
            hostName,
            asProxy,
            proxyHostId,
            ownerName,
            proxyHost,
            connectionStatus,
            createTime,
            updateTime,
            lastestConnectionTime,
            connectionResult,
            installIcagent,
            nickName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostInfoDetail {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    asProxy: ").append(toIndentedString(asProxy)).append("\n");
        sb.append("    proxyHostId: ").append(toIndentedString(proxyHostId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
        sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastestConnectionTime: ").append(toIndentedString(lastestConnectionTime)).append("\n");
        sb.append("    connectionResult: ").append(toIndentedString(connectionResult)).append("\n");
        sb.append("    installIcagent: ").append(toIndentedString(installIcagent)).append("\n");
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
