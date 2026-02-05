package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器的accessAgent详细信息。
 */
public class ServerHdaDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_name")

    private String machineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_status")

    private Boolean maintainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_name")

    private String serverGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_count")

    private Integer sessionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ServerStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    public ServerHdaDetails withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器id。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ServerHdaDetails withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * 机器名称。
     * @return machineName
     */
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public ServerHdaDetails withMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
        return this;
    }

    /**
     * 服务器维护状态： - true : 维护态的实例。 - false: 非维护态的实例。
     * @return maintainStatus
     */
    public Boolean getMaintainStatus() {
        return maintainStatus;
    }

    public void setMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
    }

    public ServerHdaDetails withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 服务器名称。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ServerHdaDetails withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 服务器组id。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ServerHdaDetails withServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
        return this;
    }

    /**
     * 服务器组名称。
     * @return serverGroupName
     */
    public String getServerGroupName() {
        return serverGroupName;
    }

    public void setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
    }

    public ServerHdaDetails withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 服务器的sid。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public ServerHdaDetails withSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    /**
     * 会话数量。
     * @return sessionCount
     */
    public Integer getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
    }

    public ServerHdaDetails withStatus(ServerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ServerStatus getStatus() {
        return status;
    }

    public void setStatus(ServerStatus status) {
        this.status = status;
    }

    public ServerHdaDetails withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 当前的accessAgent版本。
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerHdaDetails that = (ServerHdaDetails) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.machineName, that.machineName)
            && Objects.equals(this.maintainStatus, that.maintainStatus)
            && Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.serverGroupId, that.serverGroupId)
            && Objects.equals(this.serverGroupName, that.serverGroupName) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.sessionCount, that.sessionCount) && Objects.equals(this.status, that.status)
            && Objects.equals(this.currentVersion, that.currentVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId,
            machineName,
            maintainStatus,
            serverName,
            serverGroupId,
            serverGroupName,
            sid,
            sessionCount,
            status,
            currentVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerHdaDetails {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    maintainStatus: ").append(toIndentedString(maintainStatus)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
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
