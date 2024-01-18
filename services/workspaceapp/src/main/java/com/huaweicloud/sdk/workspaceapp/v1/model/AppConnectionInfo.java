package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 应用连接信息。
 */
public class AppConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_name")

    private String machineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_name")

    private String appGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokering_time")

    private OffsetDateTime brokeringTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_code")

    private String failedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_failure_reason")

    private String connectionFailureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_mac")

    private String clientMac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_name")

    private String clientName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_version")

    private String clientVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_type")

    private String clientType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_ip")

    private String vmIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wi_ip")

    private String wiIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_ip")

    private String virtualIp;

    public AppConnectionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用连接唯一标识ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppConnectionInfo withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 应用服务器sid。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public AppConnectionInfo withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * 应用服务器名称。
     * @return machineName
     */
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public AppConnectionInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 登录用户。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AppConnectionInfo withAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }

    /**
     * 应用组名称。
     * @return appGroupName
     */
    public String getAppGroupName() {
        return appGroupName;
    }

    public void setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
    }

    public AppConnectionInfo withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组ID。
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public AppConnectionInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppConnectionInfo withBrokeringTime(OffsetDateTime brokeringTime) {
        this.brokeringTime = brokeringTime;
        return this;
    }

    /**
     * 登录应用时间。
     * @return brokeringTime
     */
    public OffsetDateTime getBrokeringTime() {
        return brokeringTime;
    }

    public void setBrokeringTime(OffsetDateTime brokeringTime) {
        this.brokeringTime = brokeringTime;
    }

    public AppConnectionInfo withFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }

    /**
     * 连接失败状态码。
     * @return failedCode
     */
    public String getFailedCode() {
        return failedCode;
    }

    public void setFailedCode(String failedCode) {
        this.failedCode = failedCode;
    }

    public AppConnectionInfo withConnectionFailureReason(String connectionFailureReason) {
        this.connectionFailureReason = connectionFailureReason;
        return this;
    }

    /**
     * 连接失败原因。
     * @return connectionFailureReason
     */
    public String getConnectionFailureReason() {
        return connectionFailureReason;
    }

    public void setConnectionFailureReason(String connectionFailureReason) {
        this.connectionFailureReason = connectionFailureReason;
    }

    public AppConnectionInfo withClientMac(String clientMac) {
        this.clientMac = clientMac;
        return this;
    }

    /**
     * 客户端Mac。
     * @return clientMac
     */
    public String getClientMac() {
        return clientMac;
    }

    public void setClientMac(String clientMac) {
        this.clientMac = clientMac;
    }

    public AppConnectionInfo withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * 客户端名称。
     * @return clientName
     */
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public AppConnectionInfo withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端ip。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public AppConnectionInfo withClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    /**
     * 客户端版本。
     * @return clientVersion
     */
    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public AppConnectionInfo withClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * 客户端操作系统类型。
     * @return clientType
     */
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public AppConnectionInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * aps hda版本。
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public AppConnectionInfo withVmIp(String vmIp) {
        this.vmIp = vmIp;
        return this;
    }

    /**
     * 应用服务器ip。
     * @return vmIp
     */
    public String getVmIp() {
        return vmIp;
    }

    public void setVmIp(String vmIp) {
        this.vmIp = vmIp;
    }

    public AppConnectionInfo withWiIp(String wiIp) {
        this.wiIp = wiIp;
        return this;
    }

    /**
     * 连接IP。
     * @return wiIp
     */
    public String getWiIp() {
        return wiIp;
    }

    public void setWiIp(String wiIp) {
        this.wiIp = wiIp;
    }

    public AppConnectionInfo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public AppConnectionInfo withVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
        return this;
    }

    /**
     * 会话虚拟ip。
     * @return virtualIp
     */
    public String getVirtualIp() {
        return virtualIp;
    }

    public void setVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppConnectionInfo that = (AppConnectionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.machineName, that.machineName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.appGroupName, that.appGroupName) && Objects.equals(this.appGroupId, that.appGroupId)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.brokeringTime, that.brokeringTime)
            && Objects.equals(this.failedCode, that.failedCode)
            && Objects.equals(this.connectionFailureReason, that.connectionFailureReason)
            && Objects.equals(this.clientMac, that.clientMac) && Objects.equals(this.clientName, that.clientName)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.clientVersion, that.clientVersion)
            && Objects.equals(this.clientType, that.clientType) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.vmIp, that.vmIp) && Objects.equals(this.wiIp, that.wiIp)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.virtualIp, that.virtualIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sid,
            machineName,
            userName,
            appGroupName,
            appGroupId,
            appName,
            brokeringTime,
            failedCode,
            connectionFailureReason,
            clientMac,
            clientName,
            clientIp,
            clientVersion,
            clientType,
            agentVersion,
            vmIp,
            wiIp,
            tenantId,
            virtualIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppConnectionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    appGroupName: ").append(toIndentedString(appGroupName)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    brokeringTime: ").append(toIndentedString(brokeringTime)).append("\n");
        sb.append("    failedCode: ").append(toIndentedString(failedCode)).append("\n");
        sb.append("    connectionFailureReason: ").append(toIndentedString(connectionFailureReason)).append("\n");
        sb.append("    clientMac: ").append(toIndentedString(clientMac)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    vmIp: ").append(toIndentedString(vmIp)).append("\n");
        sb.append("    wiIp: ").append(toIndentedString(wiIp)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    virtualIp: ").append(toIndentedString(virtualIp)).append("\n");
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
