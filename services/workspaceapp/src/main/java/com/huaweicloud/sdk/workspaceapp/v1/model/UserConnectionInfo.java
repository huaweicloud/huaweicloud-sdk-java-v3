package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 用户登录记录信息。
 */
public class UserConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_type")

    private String connectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_group_name")

    private String desktopGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_conn_time")

    private OffsetDateTime preConnTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_sid")

    private String machineSid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_name")

    private String machineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_code")

    private String failedCode;

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
    @JsonProperty(value = "connect_flag")

    private String connectFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wi_ip")

    private String wiIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_ip")

    private String virtualIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    public UserConnectionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserConnectionInfo withConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }

    /**
     * 连接类型。
     * @return connectType
     */
    public String getConnectType() {
        return connectType;
    }

    public void setConnectType(String connectType) {
        this.connectType = connectType;
    }

    public UserConnectionInfo withUserName(String userName) {
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

    public UserConnectionInfo withDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }

    /**
     * 桌面组名。
     * @return desktopGroupName
     */
    public String getDesktopGroupName() {
        return desktopGroupName;
    }

    public void setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
    }

    public UserConnectionInfo withPreConnTime(OffsetDateTime preConnTime) {
        this.preConnTime = preConnTime;
        return this;
    }

    /**
     * 预连接时间。
     * @return preConnTime
     */
    public OffsetDateTime getPreConnTime() {
        return preConnTime;
    }

    public void setPreConnTime(OffsetDateTime preConnTime) {
        this.preConnTime = preConnTime;
    }

    public UserConnectionInfo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public UserConnectionInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public UserConnectionInfo withMachineSid(String machineSid) {
        this.machineSid = machineSid;
        return this;
    }

    /**
     * 应用服务器sid。
     * @return machineSid
     */
    public String getMachineSid() {
        return machineSid;
    }

    public void setMachineSid(String machineSid) {
        this.machineSid = machineSid;
    }

    public UserConnectionInfo withMachineName(String machineName) {
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

    public UserConnectionInfo withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 连接失败原因。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public UserConnectionInfo withFailedCode(String failedCode) {
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

    public UserConnectionInfo withClientMac(String clientMac) {
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

    public UserConnectionInfo withClientName(String clientName) {
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

    public UserConnectionInfo withClientIp(String clientIp) {
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

    public UserConnectionInfo withClientVersion(String clientVersion) {
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

    public UserConnectionInfo withClientType(String clientType) {
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

    public UserConnectionInfo withAgentVersion(String agentVersion) {
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

    public UserConnectionInfo withVmIp(String vmIp) {
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

    public UserConnectionInfo withConnectFlag(String connectFlag) {
        this.connectFlag = connectFlag;
        return this;
    }

    /**
     * 连接标志。
     * @return connectFlag
     */
    public String getConnectFlag() {
        return connectFlag;
    }

    public void setConnectFlag(String connectFlag) {
        this.connectFlag = connectFlag;
    }

    public UserConnectionInfo withWiIp(String wiIp) {
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

    public UserConnectionInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public UserConnectionInfo withTenantId(String tenantId) {
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

    public UserConnectionInfo withVirtualIp(String virtualIp) {
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

    public UserConnectionInfo withPublicIp(String publicIp) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserConnectionInfo that = (UserConnectionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.connectType, that.connectType)
            && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.desktopGroupName, that.desktopGroupName)
            && Objects.equals(this.preConnTime, that.preConnTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.machineSid, that.machineSid)
            && Objects.equals(this.machineName, that.machineName)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.failedCode, that.failedCode)
            && Objects.equals(this.clientMac, that.clientMac) && Objects.equals(this.clientName, that.clientName)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.clientVersion, that.clientVersion)
            && Objects.equals(this.clientType, that.clientType) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.vmIp, that.vmIp) && Objects.equals(this.connectFlag, that.connectFlag)
            && Objects.equals(this.wiIp, that.wiIp) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.virtualIp, that.virtualIp)
            && Objects.equals(this.publicIp, that.publicIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            connectType,
            userName,
            desktopGroupName,
            preConnTime,
            startTime,
            endTime,
            machineSid,
            machineName,
            failedReason,
            failedCode,
            clientMac,
            clientName,
            clientIp,
            clientVersion,
            clientType,
            agentVersion,
            vmIp,
            connectFlag,
            wiIp,
            updateTime,
            tenantId,
            virtualIp,
            publicIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserConnectionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    connectType: ").append(toIndentedString(connectType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    desktopGroupName: ").append(toIndentedString(desktopGroupName)).append("\n");
        sb.append("    preConnTime: ").append(toIndentedString(preConnTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    machineSid: ").append(toIndentedString(machineSid)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedCode: ").append(toIndentedString(failedCode)).append("\n");
        sb.append("    clientMac: ").append(toIndentedString(clientMac)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    vmIp: ").append(toIndentedString(vmIp)).append("\n");
        sb.append("    connectFlag: ").append(toIndentedString(connectFlag)).append("\n");
        sb.append("    wiIp: ").append(toIndentedString(wiIp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    virtualIp: ").append(toIndentedString(virtualIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
