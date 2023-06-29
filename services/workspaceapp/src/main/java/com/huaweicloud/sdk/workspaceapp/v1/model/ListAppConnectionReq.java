package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 请求应用使用记录响应体
 */
public class ListAppConnectionReq {

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
    @JsonProperty(value = "failed_code")

    private String failedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_failure_reason")

    private String connectionFailureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_name")

    private String clientName;

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
    @JsonProperty(value = "brokering_start_time")

    private OffsetDateTime brokeringStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokering_end_time")

    private OffsetDateTime brokeringEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_ip")

    private String virtualIp;

    public ListAppConnectionReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAppConnectionReq withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 应用服务器sid
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public ListAppConnectionReq withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * 应用服务器名称
     * @return machineName
     */
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public ListAppConnectionReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 登录用户，模糊查询
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListAppConnectionReq withAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }

    /**
     * 应用组名称
     * @return appGroupName
     */
    public String getAppGroupName() {
        return appGroupName;
    }

    public void setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
    }

    public ListAppConnectionReq withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组id
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public ListAppConnectionReq withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称，模糊查询
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListAppConnectionReq withFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }

    /**
     * 连接失败状态码
     * @return failedCode
     */
    public String getFailedCode() {
        return failedCode;
    }

    public void setFailedCode(String failedCode) {
        this.failedCode = failedCode;
    }

    public ListAppConnectionReq withConnectionFailureReason(String connectionFailureReason) {
        this.connectionFailureReason = connectionFailureReason;
        return this;
    }

    /**
     * 连接失败原因
     * @return connectionFailureReason
     */
    public String getConnectionFailureReason() {
        return connectionFailureReason;
    }

    public void setConnectionFailureReason(String connectionFailureReason) {
        this.connectionFailureReason = connectionFailureReason;
    }

    public ListAppConnectionReq withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * 客户端名称
     * @return clientName
     */
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public ListAppConnectionReq withClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    /**
     * 客户端版本
     * @return clientVersion
     */
    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public ListAppConnectionReq withClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * 客户端操作系统类型
     * @return clientType
     */
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public ListAppConnectionReq withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * aps hda版本
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public ListAppConnectionReq withVmIp(String vmIp) {
        this.vmIp = vmIp;
        return this;
    }

    /**
     * 应用服务器ip
     * @return vmIp
     */
    public String getVmIp() {
        return vmIp;
    }

    public void setVmIp(String vmIp) {
        this.vmIp = vmIp;
    }

    public ListAppConnectionReq withWiIp(String wiIp) {
        this.wiIp = wiIp;
        return this;
    }

    /**
     * 连接IP
     * @return wiIp
     */
    public String getWiIp() {
        return wiIp;
    }

    public void setWiIp(String wiIp) {
        this.wiIp = wiIp;
    }

    public ListAppConnectionReq withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ListAppConnectionReq withBrokeringStartTime(OffsetDateTime brokeringStartTime) {
        this.brokeringStartTime = brokeringStartTime;
        return this;
    }

    /**
     * 登录应用开始时间，格式 2022-10-31 08:07:39
     * @return brokeringStartTime
     */
    public OffsetDateTime getBrokeringStartTime() {
        return brokeringStartTime;
    }

    public void setBrokeringStartTime(OffsetDateTime brokeringStartTime) {
        this.brokeringStartTime = brokeringStartTime;
    }

    public ListAppConnectionReq withBrokeringEndTime(OffsetDateTime brokeringEndTime) {
        this.brokeringEndTime = brokeringEndTime;
        return this;
    }

    /**
     * 登录应用结束时间，格式 2022-10-31 08:07:39
     * @return brokeringEndTime
     */
    public OffsetDateTime getBrokeringEndTime() {
        return brokeringEndTime;
    }

    public void setBrokeringEndTime(OffsetDateTime brokeringEndTime) {
        this.brokeringEndTime = brokeringEndTime;
    }

    public ListAppConnectionReq withVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
        return this;
    }

    /**
     * 会话虚拟ip
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
        ListAppConnectionReq that = (ListAppConnectionReq) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.machineName, that.machineName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.appGroupName, that.appGroupName) && Objects.equals(this.appGroupId, that.appGroupId)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.failedCode, that.failedCode)
            && Objects.equals(this.connectionFailureReason, that.connectionFailureReason)
            && Objects.equals(this.clientName, that.clientName)
            && Objects.equals(this.clientVersion, that.clientVersion)
            && Objects.equals(this.clientType, that.clientType) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.vmIp, that.vmIp) && Objects.equals(this.wiIp, that.wiIp)
            && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.brokeringStartTime, that.brokeringStartTime)
            && Objects.equals(this.brokeringEndTime, that.brokeringEndTime)
            && Objects.equals(this.virtualIp, that.virtualIp);
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
            failedCode,
            connectionFailureReason,
            clientName,
            clientVersion,
            clientType,
            agentVersion,
            vmIp,
            wiIp,
            tenantId,
            brokeringStartTime,
            brokeringEndTime,
            virtualIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppConnectionReq {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    appGroupName: ").append(toIndentedString(appGroupName)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    failedCode: ").append(toIndentedString(failedCode)).append("\n");
        sb.append("    connectionFailureReason: ").append(toIndentedString(connectionFailureReason)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    vmIp: ").append(toIndentedString(vmIp)).append("\n");
        sb.append("    wiIp: ").append(toIndentedString(wiIp)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    brokeringStartTime: ").append(toIndentedString(brokeringStartTime)).append("\n");
        sb.append("    brokeringEndTime: ").append(toIndentedString(brokeringEndTime)).append("\n");
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
