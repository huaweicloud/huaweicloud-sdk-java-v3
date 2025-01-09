package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器的accessAgent详细信息。
 */
public class ServerHdaUpgradeRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_name")

    private String machineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_name")

    private String serverGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_status")

    private String upgradeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_time")

    private String upgradeTime;

    public ServerHdaUpgradeRecord withServerId(String serverId) {
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

    public ServerHdaUpgradeRecord withMachineName(String machineName) {
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

    public ServerHdaUpgradeRecord withServerName(String serverName) {
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

    public ServerHdaUpgradeRecord withServerGroupName(String serverGroupName) {
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

    public ServerHdaUpgradeRecord withSid(String sid) {
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

    public ServerHdaUpgradeRecord withCurrentVersion(String currentVersion) {
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

    public ServerHdaUpgradeRecord withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标的accessAgent版本。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ServerHdaUpgradeRecord withUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
        return this;
    }

    /**
     * HDA升级状态。
     * @return upgradeStatus
     */
    public String getUpgradeStatus() {
        return upgradeStatus;
    }

    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    public ServerHdaUpgradeRecord withUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }

    /**
     * 更新时间
     * @return upgradeTime
     */
    public String getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerHdaUpgradeRecord that = (ServerHdaUpgradeRecord) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.machineName, that.machineName)
            && Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.serverGroupName, that.serverGroupName) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.upgradeStatus, that.upgradeStatus)
            && Objects.equals(this.upgradeTime, that.upgradeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId,
            machineName,
            serverName,
            serverGroupName,
            sid,
            currentVersion,
            targetVersion,
            upgradeStatus,
            upgradeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerHdaUpgradeRecord {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    upgradeStatus: ").append(toIndentedString(upgradeStatus)).append("\n");
        sb.append("    upgradeTime: ").append(toIndentedString(upgradeTime)).append("\n");
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
