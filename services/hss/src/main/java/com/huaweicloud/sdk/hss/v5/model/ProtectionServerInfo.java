package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtectionServerInfo
 */
public class ProtectionServerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ransom_protection_status")

    private String ransomProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_policy_id")

    private String protectPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_policy_name")

    private String protectPolicyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_error")

    private ProtectionServerInfoBackupError backupError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_protection_status")

    private String backupProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_protect_event")

    private Integer countProtectEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_backuped")

    private Integer countBackuped;

    public ProtectionServerInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ProtectionServerInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * Agent ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ProtectionServerInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ProtectionServerInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 弹性公网IP地址
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ProtectionServerInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有IP地址
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ProtectionServerInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ProtectionServerInfo withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 服务器状态，包含如下2种。   - ACTIVE ：运行中。   - SHUTOFF ：关机。
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ProtectionServerInfo withRansomProtectionStatus(String ransomProtectionStatus) {
        this.ransomProtectionStatus = ransomProtectionStatus;
        return this;
    }

    /**
     * 勒索防护状态，包含如下4种。   - closed ：关闭。   - opened ：开启。   - opening ：开启中。   - closing ：关闭中。
     * @return ransomProtectionStatus
     */
    public String getRansomProtectionStatus() {
        return ransomProtectionStatus;
    }

    public void setRansomProtectionStatus(String ransomProtectionStatus) {
        this.ransomProtectionStatus = ransomProtectionStatus;
    }

    public ProtectionServerInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态，包含如下2种。 - closed ：未防护。 - opened ：防护中。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ProtectionServerInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 服务器组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ProtectionServerInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 服务器组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ProtectionServerInfo withProtectPolicyId(String protectPolicyId) {
        this.protectPolicyId = protectPolicyId;
        return this;
    }

    /**
     * 策略ID
     * @return protectPolicyId
     */
    public String getProtectPolicyId() {
        return protectPolicyId;
    }

    public void setProtectPolicyId(String protectPolicyId) {
        this.protectPolicyId = protectPolicyId;
    }

    public ProtectionServerInfo withProtectPolicyName(String protectPolicyName) {
        this.protectPolicyName = protectPolicyName;
        return this;
    }

    /**
     * 策略名称
     * @return protectPolicyName
     */
    public String getProtectPolicyName() {
        return protectPolicyName;
    }

    public void setProtectPolicyName(String protectPolicyName) {
        this.protectPolicyName = protectPolicyName;
    }

    public ProtectionServerInfo withBackupError(ProtectionServerInfoBackupError backupError) {
        this.backupError = backupError;
        return this;
    }

    public ProtectionServerInfo withBackupError(Consumer<ProtectionServerInfoBackupError> backupErrorSetter) {
        if (this.backupError == null) {
            this.backupError = new ProtectionServerInfoBackupError();
            backupErrorSetter.accept(this.backupError);
        }

        return this;
    }

    /**
     * Get backupError
     * @return backupError
     */
    public ProtectionServerInfoBackupError getBackupError() {
        return backupError;
    }

    public void setBackupError(ProtectionServerInfoBackupError backupError) {
        this.backupError = backupError;
    }

    public ProtectionServerInfo withBackupProtectionStatus(String backupProtectionStatus) {
        this.backupProtectionStatus = backupProtectionStatus;
        return this;
    }

    /**
     * 是否开启备份，包含如下3种。   - failed_to_turn_on_backup: 无法开启备份   - closed ：关闭。   - opened ：开启。
     * @return backupProtectionStatus
     */
    public String getBackupProtectionStatus() {
        return backupProtectionStatus;
    }

    public void setBackupProtectionStatus(String backupProtectionStatus) {
        this.backupProtectionStatus = backupProtectionStatus;
    }

    public ProtectionServerInfo withCountProtectEvent(Integer countProtectEvent) {
        this.countProtectEvent = countProtectEvent;
        return this;
    }

    /**
     * 防护事件数
     * minimum: 0
     * maximum: 2097152
     * @return countProtectEvent
     */
    public Integer getCountProtectEvent() {
        return countProtectEvent;
    }

    public void setCountProtectEvent(Integer countProtectEvent) {
        this.countProtectEvent = countProtectEvent;
    }

    public ProtectionServerInfo withCountBackuped(Integer countBackuped) {
        this.countBackuped = countBackuped;
        return this;
    }

    /**
     * 已有备份数
     * minimum: 0
     * maximum: 2097152
     * @return countBackuped
     */
    public Integer getCountBackuped() {
        return countBackuped;
    }

    public void setCountBackuped(Integer countBackuped) {
        this.countBackuped = countBackuped;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectionServerInfo protectionServerInfo = (ProtectionServerInfo) o;
        return Objects.equals(this.hostId, protectionServerInfo.hostId)
            && Objects.equals(this.agentId, protectionServerInfo.agentId)
            && Objects.equals(this.hostName, protectionServerInfo.hostName)
            && Objects.equals(this.hostIp, protectionServerInfo.hostIp)
            && Objects.equals(this.privateIp, protectionServerInfo.privateIp)
            && Objects.equals(this.osType, protectionServerInfo.osType)
            && Objects.equals(this.hostStatus, protectionServerInfo.hostStatus)
            && Objects.equals(this.ransomProtectionStatus, protectionServerInfo.ransomProtectionStatus)
            && Objects.equals(this.protectStatus, protectionServerInfo.protectStatus)
            && Objects.equals(this.groupId, protectionServerInfo.groupId)
            && Objects.equals(this.groupName, protectionServerInfo.groupName)
            && Objects.equals(this.protectPolicyId, protectionServerInfo.protectPolicyId)
            && Objects.equals(this.protectPolicyName, protectionServerInfo.protectPolicyName)
            && Objects.equals(this.backupError, protectionServerInfo.backupError)
            && Objects.equals(this.backupProtectionStatus, protectionServerInfo.backupProtectionStatus)
            && Objects.equals(this.countProtectEvent, protectionServerInfo.countProtectEvent)
            && Objects.equals(this.countBackuped, protectionServerInfo.countBackuped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            agentId,
            hostName,
            hostIp,
            privateIp,
            osType,
            hostStatus,
            ransomProtectionStatus,
            protectStatus,
            groupId,
            groupName,
            protectPolicyId,
            protectPolicyName,
            backupError,
            backupProtectionStatus,
            countProtectEvent,
            countBackuped);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionServerInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    ransomProtectionStatus: ").append(toIndentedString(ransomProtectionStatus)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    protectPolicyId: ").append(toIndentedString(protectPolicyId)).append("\n");
        sb.append("    protectPolicyName: ").append(toIndentedString(protectPolicyName)).append("\n");
        sb.append("    backupError: ").append(toIndentedString(backupError)).append("\n");
        sb.append("    backupProtectionStatus: ").append(toIndentedString(backupProtectionStatus)).append("\n");
        sb.append("    countProtectEvent: ").append(toIndentedString(countProtectEvent)).append("\n");
        sb.append("    countBackuped: ").append(toIndentedString(countBackuped)).append("\n");
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
