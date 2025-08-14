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
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

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
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ransom_protection_status")

    private String ransomProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ransom_protection_fail_reason")

    private String ransomProtectionFailReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_decoy_dir")

    private String failedDecoyDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_source")

    private String hostSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_name")

    private String vaultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_size")

    private Integer vaultSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_used")

    private Integer vaultUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_allocated")

    private Integer vaultAllocated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_charging_mode")

    private String vaultChargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_status")

    private String vaultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy_id")

    private String backupPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy_name")

    private String backupPolicyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy_enabled")

    private Boolean backupPolicyEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_num")

    private Integer resourcesNum;

    public ProtectionServerInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 项目ID **取值范围**: 字符长度0-128 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProtectionServerInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID **取值范围**: 字符长度0-128 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ProtectionServerInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **取值范围**: 字符长度0-128 
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
     * **参数解释**: Agent ID **取值范围**: 字符长度0-128 
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
     * **参数解释**: 服务器名称 **取值范围**: 字符长度0-128 
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
     * **参数解释**: 弹性公网IP地址 **取值范围**: 字符长度0-128 
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
     * **参数解释**: 私有IP地址 **取值范围**: 字符长度0-128 
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
     * **参数解释**: 操作系统类型 **取值范围**:   包含如下2种。     - Linux ：Linux。     - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ProtectionServerInfo withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * **参数解释**: 系统名称 **取值范围**: 字符长度0-128 
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public ProtectionServerInfo withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * **参数解释**: 服务器状态 **取值范围**: 包含如下2种。   - ACTIVE ：运行中。   - SHUTOFF ：关机。
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
     * **参数解释**: 勒索防护状态 **取值范围**: 包含如下6种。   - closed ：未开启。   - opened ：防护中。   - opening ：开启中。   - closing ：关闭中。   - protect_failed：防护失败。   - protect_degraded：防护降级
     * @return ransomProtectionStatus
     */
    public String getRansomProtectionStatus() {
        return ransomProtectionStatus;
    }

    public void setRansomProtectionStatus(String ransomProtectionStatus) {
        this.ransomProtectionStatus = ransomProtectionStatus;
    }

    public ProtectionServerInfo withRansomProtectionFailReason(String ransomProtectionFailReason) {
        this.ransomProtectionFailReason = ransomProtectionFailReason;
        return this;
    }

    /**
     * **参数解释**: 勒索防护失败细分原因 **取值范围**: 包含如下4种。   - driver_load_failed ：驱动加载失败。   - protect_interrupted ：防护中断。   - decoy_deploy_totally_failed ：全部诱饵部署失败。   - decoy_deploy_partially_failed ：部分诱饵部署失败。
     * @return ransomProtectionFailReason
     */
    public String getRansomProtectionFailReason() {
        return ransomProtectionFailReason;
    }

    public void setRansomProtectionFailReason(String ransomProtectionFailReason) {
        this.ransomProtectionFailReason = ransomProtectionFailReason;
    }

    public ProtectionServerInfo withFailedDecoyDir(String failedDecoyDir) {
        this.failedDecoyDir = failedDecoyDir;
        return this;
    }

    /**
     * **参数解释**: 诱饵防护失败的目录（仅部分诱饵部署失败状态有值） **取值范围**: 字符长度0-512 
     * @return failedDecoyDir
     */
    public String getFailedDecoyDir() {
        return failedDecoyDir;
    }

    public void setFailedDecoyDir(String failedDecoyDir) {
        this.failedDecoyDir = failedDecoyDir;
    }

    public ProtectionServerInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * **参数解释**: agent版本 **取值范围**: 字符长度1-128 
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public ProtectionServerInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **取值范围**: 包含如下2种。 - closed ：未防护。 - opened ：防护中。
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
     * **参数解释**: 服务器组ID **取值范围**: 字符长度1-128 
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
     * **参数解释**: 服务器组名称 **取值范围**: 字符长度1-128 
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
     * **参数解释**: 防护策略ID **取值范围**: 字符长度1-128 
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
     * **参数解释**: 防护策略名称 **取值范围**: 字符长度1-128 
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
     * **参数解释**: 是否开启备份 **取值范围**: 包含如下3种。   - failed_to_turn_on_backup: 无法开启备份   - closed ：关闭。   - opened ：开启。
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
     * **参数解释**: 防护事件数 **取值范围**: 取值0-2097152 
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
     * **参数解释**: 已有备份数 **取值范围**: 取值0-2097152 
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

    public ProtectionServerInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent状态 **取值范围**: 字符长度1-128 
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ProtectionServerInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 主机开通的版本    **取值范围**: 包含如下7种输入：   - hss.version.null ：无。   - hss.version.basic ：基础版。   - hss.version.advanced ：专业版。   - hss.version.enterprise ：企业版。   - hss.version.premium ：旗舰版。   - hss.version.wtp ：网页防篡改版。   - hss.version.container.enterprise ：容器版。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ProtectionServerInfo withHostSource(String hostSource) {
        this.hostSource = hostSource;
        return this;
    }

    /**
     * **参数解释**: 服务器类型 **取值范围**: 包含如下3种输入：   - ecs ：弹性云服务器。   - outside ：线下主机。   - workspace ：云桌面。
     * @return hostSource
     */
    public String getHostSource() {
        return hostSource;
    }

    public void setHostSource(String hostSource) {
        this.hostSource = hostSource;
    }

    public ProtectionServerInfo withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * **参数解释**: 存储库ID **取值范围**: 字符长度0-128 
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public ProtectionServerInfo withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * **参数解释**: 存储库名称 **取值范围**: 字符长度0-128 
     * @return vaultName
     */
    public String getVaultName() {
        return vaultName;
    }

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    public ProtectionServerInfo withVaultSize(Integer vaultSize) {
        this.vaultSize = vaultSize;
        return this;
    }

    /**
     * **参数解释**: 总容量，单位GB **取值范围**: 取值0-2097152 
     * minimum: 0
     * maximum: 2097152
     * @return vaultSize
     */
    public Integer getVaultSize() {
        return vaultSize;
    }

    public void setVaultSize(Integer vaultSize) {
        this.vaultSize = vaultSize;
    }

    public ProtectionServerInfo withVaultUsed(Integer vaultUsed) {
        this.vaultUsed = vaultUsed;
        return this;
    }

    /**
     * **参数解释**: 已使用容量，单位MB **取值范围**: 取值0-2097152 
     * minimum: 0
     * maximum: 2097152
     * @return vaultUsed
     */
    public Integer getVaultUsed() {
        return vaultUsed;
    }

    public void setVaultUsed(Integer vaultUsed) {
        this.vaultUsed = vaultUsed;
    }

    public ProtectionServerInfo withVaultAllocated(Integer vaultAllocated) {
        this.vaultAllocated = vaultAllocated;
        return this;
    }

    /**
     * **参数解释**: 已分配容量，单位GB，指绑定的服务器大小 **取值范围**: 取值0-2097152 
     * minimum: 0
     * maximum: 2097152
     * @return vaultAllocated
     */
    public Integer getVaultAllocated() {
        return vaultAllocated;
    }

    public void setVaultAllocated(Integer vaultAllocated) {
        this.vaultAllocated = vaultAllocated;
    }

    public ProtectionServerInfo withVaultChargingMode(String vaultChargingMode) {
        this.vaultChargingMode = vaultChargingMode;
        return this;
    }

    /**
     * **参数解释**: 存储库创建模式 **取值范围**: 包含如下2种： - 按需：post_paid - 包周期：pre_paid 
     * @return vaultChargingMode
     */
    public String getVaultChargingMode() {
        return vaultChargingMode;
    }

    public void setVaultChargingMode(String vaultChargingMode) {
        this.vaultChargingMode = vaultChargingMode;
    }

    public ProtectionServerInfo withVaultStatus(String vaultStatus) {
        this.vaultStatus = vaultStatus;
        return this;
    }

    /**
     * **参数解释**: 存储库状态。 **取值范围**: 包含如下5种：   - available ：可用。   - lock ：被锁定。   - frozen：冻结。   - deleting：删除中。   - error：错误。
     * @return vaultStatus
     */
    public String getVaultStatus() {
        return vaultStatus;
    }

    public void setVaultStatus(String vaultStatus) {
        this.vaultStatus = vaultStatus;
    }

    public ProtectionServerInfo withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * **参数解释**: 备份策略ID，若为空，则为未绑定状态，若不为空，通过backup_policy_enabled字段判断策略是否启用。 **取值范围**: 字符长度1-128 
     * @return backupPolicyId
     */
    public String getBackupPolicyId() {
        return backupPolicyId;
    }

    public void setBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
    }

    public ProtectionServerInfo withBackupPolicyName(String backupPolicyName) {
        this.backupPolicyName = backupPolicyName;
        return this;
    }

    /**
     * **参数解释**: 备份策略名称 **取值范围**: 字符长度1-128 
     * @return backupPolicyName
     */
    public String getBackupPolicyName() {
        return backupPolicyName;
    }

    public void setBackupPolicyName(String backupPolicyName) {
        this.backupPolicyName = backupPolicyName;
    }

    public ProtectionServerInfo withBackupPolicyEnabled(Boolean backupPolicyEnabled) {
        this.backupPolicyEnabled = backupPolicyEnabled;
        return this;
    }

    /**
     * **参数解释**: 策略是否启用 **取值范围**: 包含如下2种：   - true ：策略已启用。   - false ：策略未启用。 
     * @return backupPolicyEnabled
     */
    public Boolean getBackupPolicyEnabled() {
        return backupPolicyEnabled;
    }

    public void setBackupPolicyEnabled(Boolean backupPolicyEnabled) {
        this.backupPolicyEnabled = backupPolicyEnabled;
    }

    public ProtectionServerInfo withResourcesNum(Integer resourcesNum) {
        this.resourcesNum = resourcesNum;
        return this;
    }

    /**
     * **参数解释**: 已绑定服务器（个） **取值范围**: 取值0-2097152 
     * minimum: 0
     * maximum: 2097152
     * @return resourcesNum
     */
    public Integer getResourcesNum() {
        return resourcesNum;
    }

    public void setResourcesNum(Integer resourcesNum) {
        this.resourcesNum = resourcesNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectionServerInfo that = (ProtectionServerInfo) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.osName, that.osName) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.ransomProtectionStatus, that.ransomProtectionStatus)
            && Objects.equals(this.ransomProtectionFailReason, that.ransomProtectionFailReason)
            && Objects.equals(this.failedDecoyDir, that.failedDecoyDir)
            && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.protectPolicyId, that.protectPolicyId)
            && Objects.equals(this.protectPolicyName, that.protectPolicyName)
            && Objects.equals(this.backupError, that.backupError)
            && Objects.equals(this.backupProtectionStatus, that.backupProtectionStatus)
            && Objects.equals(this.countProtectEvent, that.countProtectEvent)
            && Objects.equals(this.countBackuped, that.countBackuped)
            && Objects.equals(this.agentStatus, that.agentStatus) && Objects.equals(this.version, that.version)
            && Objects.equals(this.hostSource, that.hostSource) && Objects.equals(this.vaultId, that.vaultId)
            && Objects.equals(this.vaultName, that.vaultName) && Objects.equals(this.vaultSize, that.vaultSize)
            && Objects.equals(this.vaultUsed, that.vaultUsed)
            && Objects.equals(this.vaultAllocated, that.vaultAllocated)
            && Objects.equals(this.vaultChargingMode, that.vaultChargingMode)
            && Objects.equals(this.vaultStatus, that.vaultStatus)
            && Objects.equals(this.backupPolicyId, that.backupPolicyId)
            && Objects.equals(this.backupPolicyName, that.backupPolicyName)
            && Objects.equals(this.backupPolicyEnabled, that.backupPolicyEnabled)
            && Objects.equals(this.resourcesNum, that.resourcesNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            enterpriseProjectId,
            hostId,
            agentId,
            hostName,
            hostIp,
            privateIp,
            osType,
            osName,
            hostStatus,
            ransomProtectionStatus,
            ransomProtectionFailReason,
            failedDecoyDir,
            agentVersion,
            protectStatus,
            groupId,
            groupName,
            protectPolicyId,
            protectPolicyName,
            backupError,
            backupProtectionStatus,
            countProtectEvent,
            countBackuped,
            agentStatus,
            version,
            hostSource,
            vaultId,
            vaultName,
            vaultSize,
            vaultUsed,
            vaultAllocated,
            vaultChargingMode,
            vaultStatus,
            backupPolicyId,
            backupPolicyName,
            backupPolicyEnabled,
            resourcesNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionServerInfo {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    ransomProtectionStatus: ").append(toIndentedString(ransomProtectionStatus)).append("\n");
        sb.append("    ransomProtectionFailReason: ").append(toIndentedString(ransomProtectionFailReason)).append("\n");
        sb.append("    failedDecoyDir: ").append(toIndentedString(failedDecoyDir)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    protectPolicyId: ").append(toIndentedString(protectPolicyId)).append("\n");
        sb.append("    protectPolicyName: ").append(toIndentedString(protectPolicyName)).append("\n");
        sb.append("    backupError: ").append(toIndentedString(backupError)).append("\n");
        sb.append("    backupProtectionStatus: ").append(toIndentedString(backupProtectionStatus)).append("\n");
        sb.append("    countProtectEvent: ").append(toIndentedString(countProtectEvent)).append("\n");
        sb.append("    countBackuped: ").append(toIndentedString(countBackuped)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    hostSource: ").append(toIndentedString(hostSource)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    vaultName: ").append(toIndentedString(vaultName)).append("\n");
        sb.append("    vaultSize: ").append(toIndentedString(vaultSize)).append("\n");
        sb.append("    vaultUsed: ").append(toIndentedString(vaultUsed)).append("\n");
        sb.append("    vaultAllocated: ").append(toIndentedString(vaultAllocated)).append("\n");
        sb.append("    vaultChargingMode: ").append(toIndentedString(vaultChargingMode)).append("\n");
        sb.append("    vaultStatus: ").append(toIndentedString(vaultStatus)).append("\n");
        sb.append("    backupPolicyId: ").append(toIndentedString(backupPolicyId)).append("\n");
        sb.append("    backupPolicyName: ").append(toIndentedString(backupPolicyName)).append("\n");
        sb.append("    backupPolicyEnabled: ").append(toIndentedString(backupPolicyEnabled)).append("\n");
        sb.append("    resourcesNum: ").append(toIndentedString(resourcesNum)).append("\n");
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
