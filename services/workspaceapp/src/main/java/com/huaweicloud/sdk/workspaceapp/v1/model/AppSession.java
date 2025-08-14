package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 根据用户名查询当前会话-会话信息。
 */
public class AppSession {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_stamp")

    private String sessionStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_session_id")

    private String osSessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private String protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user")

    private String loginUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_type")

    private String sessionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_server_group_id")

    private String appServerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_conn_time")

    private String preConnTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_continue_time")

    private String statusContinueTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_sid")

    private String machineSid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_name")

    private String machineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_state")

    private String sessionState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

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
    @JsonProperty(value = "public_ip")

    private String publicIp;

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
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_code")

    private String failedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_status_time")

    private String lastUpdateStatusTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    public AppSession withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppSession withSessionStamp(String sessionStamp) {
        this.sessionStamp = sessionStamp;
        return this;
    }

    /**
     * 会话标识。
     * @return sessionStamp
     */
    public String getSessionStamp() {
        return sessionStamp;
    }

    public void setSessionStamp(String sessionStamp) {
        this.sessionStamp = sessionStamp;
    }

    public AppSession withOsSessionId(String osSessionId) {
        this.osSessionId = osSessionId;
        return this;
    }

    /**
     * 会话在hda的os中会话id。
     * @return osSessionId
     */
    public String getOsSessionId() {
        return osSessionId;
    }

    public void setOsSessionId(String osSessionId) {
        this.osSessionId = osSessionId;
    }

    public AppSession withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * 协议类型。
     * @return protocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public AppSession withLoginUser(String loginUser) {
        this.loginUser = loginUser;
        return this;
    }

    /**
     * 当前会话的登录用户。
     * @return loginUser
     */
    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public AppSession withSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }

    /**
     * 会话类型，1表示共享桌面，2表示应用。
     * @return sessionType
     */
    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public AppSession withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * App组ID。
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public AppSession withAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
        return this;
    }

    /**
     * AppServer组ID。
     * @return appServerGroupId
     */
    public String getAppServerGroupId() {
        return appServerGroupId;
    }

    public void setAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
    }

    public AppSession withPreConnTime(String preConnTime) {
        this.preConnTime = preConnTime;
        return this;
    }

    /**
     * 预连接时间。
     * @return preConnTime
     */
    public String getPreConnTime() {
        return preConnTime;
    }

    public void setPreConnTime(String preConnTime) {
        this.preConnTime = preConnTime;
    }

    public AppSession withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 会话开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AppSession withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 会话结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AppSession withStatusContinueTime(String statusContinueTime) {
        this.statusContinueTime = statusContinueTime;
        return this;
    }

    /**
     * 状态持续时间。
     * @return statusContinueTime
     */
    public String getStatusContinueTime() {
        return statusContinueTime;
    }

    public void setStatusContinueTime(String statusContinueTime) {
        this.statusContinueTime = statusContinueTime;
    }

    public AppSession withMachineSid(String machineSid) {
        this.machineSid = machineSid;
        return this;
    }

    /**
     * 服务器SID。。
     * @return machineSid
     */
    public String getMachineSid() {
        return machineSid;
    }

    public void setMachineSid(String machineSid) {
        this.machineSid = machineSid;
    }

    public AppSession withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * 服务器名称。
     * @return machineName
     */
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public AppSession withSessionState(String sessionState) {
        this.sessionState = sessionState;
        return this;
    }

    /**
     * 会话状态。
     * @return sessionState
     */
    public String getSessionState() {
        return sessionState;
    }

    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    public AppSession withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 会话中的应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppSession withClientMac(String clientMac) {
        this.clientMac = clientMac;
        return this;
    }

    /**
     * 客户端Mac地址。
     * @return clientMac
     */
    public String getClientMac() {
        return clientMac;
    }

    public void setClientMac(String clientMac) {
        this.clientMac = clientMac;
    }

    public AppSession withClientName(String clientName) {
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

    public AppSession withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端IP。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public AppSession withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 客户端出口ip。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public AppSession withClientVersion(String clientVersion) {
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

    public AppSession withClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * 客户端类型。
     * @return clientType
     */
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public AppSession withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * agent版本。
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public AppSession withVmIp(String vmIp) {
        this.vmIp = vmIp;
        return this;
    }

    /**
     * 服务器IP。
     * @return vmIp
     */
    public String getVmIp() {
        return vmIp;
    }

    public void setVmIp(String vmIp) {
        this.vmIp = vmIp;
    }

    public AppSession withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 错误原因消息。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public AppSession withFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }

    /**
     * 错误原因码。
     * @return failedCode
     */
    public String getFailedCode() {
        return failedCode;
    }

    public void setFailedCode(String failedCode) {
        this.failedCode = failedCode;
    }

    public AppSession withLastUpdateStatusTime(String lastUpdateStatusTime) {
        this.lastUpdateStatusTime = lastUpdateStatusTime;
        return this;
    }

    /**
     * 状态最后变化时间。
     * @return lastUpdateStatusTime
     */
    public String getLastUpdateStatusTime() {
        return lastUpdateStatusTime;
    }

    public void setLastUpdateStatusTime(String lastUpdateStatusTime) {
        this.lastUpdateStatusTime = lastUpdateStatusTime;
    }

    public AppSession withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppSession that = (AppSession) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sessionStamp, that.sessionStamp)
            && Objects.equals(this.osSessionId, that.osSessionId)
            && Objects.equals(this.protocolType, that.protocolType) && Objects.equals(this.loginUser, that.loginUser)
            && Objects.equals(this.sessionType, that.sessionType) && Objects.equals(this.appGroupId, that.appGroupId)
            && Objects.equals(this.appServerGroupId, that.appServerGroupId)
            && Objects.equals(this.preConnTime, that.preConnTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.statusContinueTime, that.statusContinueTime)
            && Objects.equals(this.machineSid, that.machineSid) && Objects.equals(this.machineName, that.machineName)
            && Objects.equals(this.sessionState, that.sessionState) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.clientMac, that.clientMac) && Objects.equals(this.clientName, that.clientName)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.clientVersion, that.clientVersion)
            && Objects.equals(this.clientType, that.clientType) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.vmIp, that.vmIp) && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.failedCode, that.failedCode)
            && Objects.equals(this.lastUpdateStatusTime, that.lastUpdateStatusTime)
            && Objects.equals(this.tenantId, that.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sessionStamp,
            osSessionId,
            protocolType,
            loginUser,
            sessionType,
            appGroupId,
            appServerGroupId,
            preConnTime,
            startTime,
            endTime,
            statusContinueTime,
            machineSid,
            machineName,
            sessionState,
            appName,
            clientMac,
            clientName,
            clientIp,
            publicIp,
            clientVersion,
            clientType,
            agentVersion,
            vmIp,
            failedReason,
            failedCode,
            lastUpdateStatusTime,
            tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppSession {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sessionStamp: ").append(toIndentedString(sessionStamp)).append("\n");
        sb.append("    osSessionId: ").append(toIndentedString(osSessionId)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    loginUser: ").append(toIndentedString(loginUser)).append("\n");
        sb.append("    sessionType: ").append(toIndentedString(sessionType)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    appServerGroupId: ").append(toIndentedString(appServerGroupId)).append("\n");
        sb.append("    preConnTime: ").append(toIndentedString(preConnTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    statusContinueTime: ").append(toIndentedString(statusContinueTime)).append("\n");
        sb.append("    machineSid: ").append(toIndentedString(machineSid)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    sessionState: ").append(toIndentedString(sessionState)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    clientMac: ").append(toIndentedString(clientMac)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    vmIp: ").append(toIndentedString(vmIp)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedCode: ").append(toIndentedString(failedCode)).append("\n");
        sb.append("    lastUpdateStatusTime: ").append(toIndentedString(lastUpdateStatusTime)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
