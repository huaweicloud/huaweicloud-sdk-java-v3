package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 请求用户登录记录响应体。
 */
public class ListUserConnectionReq {

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
    @JsonProperty(value = "connect_flag")

    private String connectFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wi_ip")

    private String wiIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_start_time")

    private OffsetDateTime loginStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_end_time")

    private OffsetDateTime loginEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_ip")

    private String virtualIp;

    public ListUserConnectionReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 登录记录唯一标识ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListUserConnectionReq withConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }

    /**
     * 用户连接类别,1代表共享桌面，2代表普通应用。
     * @return connectType
     */
    public String getConnectType() {
        return connectType;
    }

    public void setConnectType(String connectType) {
        this.connectType = connectType;
    }

    public ListUserConnectionReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 登录用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListUserConnectionReq withMachineSid(String machineSid) {
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

    public ListUserConnectionReq withMachineName(String machineName) {
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

    public ListUserConnectionReq withFailedReason(String failedReason) {
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

    public ListUserConnectionReq withFailedCode(String failedCode) {
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

    public ListUserConnectionReq withClientName(String clientName) {
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

    public ListUserConnectionReq withClientVersion(String clientVersion) {
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

    public ListUserConnectionReq withClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * 客户端操作系统类型： - Mac - Windows
     * @return clientType
     */
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public ListUserConnectionReq withAgentVersion(String agentVersion) {
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

    public ListUserConnectionReq withVmIp(String vmIp) {
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

    public ListUserConnectionReq withConnectFlag(String connectFlag) {
        this.connectFlag = connectFlag;
        return this;
    }

    /**
     * 连接标志，目前值为0。
     * @return connectFlag
     */
    public String getConnectFlag() {
        return connectFlag;
    }

    public void setConnectFlag(String connectFlag) {
        this.connectFlag = connectFlag;
    }

    public ListUserConnectionReq withWiIp(String wiIp) {
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

    public ListUserConnectionReq withPublicIp(String publicIp) {
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

    public ListUserConnectionReq withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 登录应用开始时间，只支持导出30天内数据，格式 2022-10-31T08:07:39Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ListUserConnectionReq withTenantId(String tenantId) {
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

    public ListUserConnectionReq withLoginStartTime(OffsetDateTime loginStartTime) {
        this.loginStartTime = loginStartTime;
        return this;
    }

    /**
     * 登录应用开始时间，只支持导出30天内数据，格式 2022-10-31T08:07:39Z，参数中login_start_time与login_end_time必须同时存在或都不存在，都不存在时导出近一个月的数据。
     * @return loginStartTime
     */
    public OffsetDateTime getLoginStartTime() {
        return loginStartTime;
    }

    public void setLoginStartTime(OffsetDateTime loginStartTime) {
        this.loginStartTime = loginStartTime;
    }

    public ListUserConnectionReq withLoginEndTime(OffsetDateTime loginEndTime) {
        this.loginEndTime = loginEndTime;
        return this;
    }

    /**
     * 登录应用结束时间，只支持导出30天内数据，格式 2022-10-31T08:07:39Z，参数中login_start_time与login_end_time必须同时存在或都不存在，都不存在时导出近一个月的数据。
     * @return loginEndTime
     */
    public OffsetDateTime getLoginEndTime() {
        return loginEndTime;
    }

    public void setLoginEndTime(OffsetDateTime loginEndTime) {
        this.loginEndTime = loginEndTime;
    }

    public ListUserConnectionReq withVirtualIp(String virtualIp) {
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
        ListUserConnectionReq that = (ListUserConnectionReq) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.connectType, that.connectType)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.machineSid, that.machineSid)
            && Objects.equals(this.machineName, that.machineName)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.failedCode, that.failedCode)
            && Objects.equals(this.clientName, that.clientName)
            && Objects.equals(this.clientVersion, that.clientVersion)
            && Objects.equals(this.clientType, that.clientType) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.vmIp, that.vmIp) && Objects.equals(this.connectFlag, that.connectFlag)
            && Objects.equals(this.wiIp, that.wiIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.loginStartTime, that.loginStartTime)
            && Objects.equals(this.loginEndTime, that.loginEndTime) && Objects.equals(this.virtualIp, that.virtualIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            connectType,
            userName,
            machineSid,
            machineName,
            failedReason,
            failedCode,
            clientName,
            clientVersion,
            clientType,
            agentVersion,
            vmIp,
            connectFlag,
            wiIp,
            publicIp,
            updateTime,
            tenantId,
            loginStartTime,
            loginEndTime,
            virtualIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserConnectionReq {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    connectType: ").append(toIndentedString(connectType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    machineSid: ").append(toIndentedString(machineSid)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedCode: ").append(toIndentedString(failedCode)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    vmIp: ").append(toIndentedString(vmIp)).append("\n");
        sb.append("    connectFlag: ").append(toIndentedString(connectFlag)).append("\n");
        sb.append("    wiIp: ").append(toIndentedString(wiIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    loginStartTime: ").append(toIndentedString(loginStartTime)).append("\n");
        sb.append("    loginEndTime: ").append(toIndentedString(loginEndTime)).append("\n");
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
