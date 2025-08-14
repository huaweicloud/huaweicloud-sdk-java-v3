package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackupVaultInfo
 */
public class BackupVaultInfo {

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

    public BackupVaultInfo withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public BackupVaultInfo withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * 存储库名称
     * @return vaultName
     */
    public String getVaultName() {
        return vaultName;
    }

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    public BackupVaultInfo withVaultSize(Integer vaultSize) {
        this.vaultSize = vaultSize;
        return this;
    }

    /**
     * 存储库总容量，单位GB
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

    public BackupVaultInfo withVaultUsed(Integer vaultUsed) {
        this.vaultUsed = vaultUsed;
        return this;
    }

    /**
     * 已使用容量，单位MB，指的是已有备份占用的容量，例如绑定了1台主机，已经有两个备份数，两个备份60G，则已使用容量为60G。
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

    public BackupVaultInfo withVaultAllocated(Integer vaultAllocated) {
        this.vaultAllocated = vaultAllocated;
        return this;
    }

    /**
     * 已分配容量，单位GB，指绑定的服务器大小，例如绑定了1台主机，主机大小40G，则已分配容量为40G。
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

    public BackupVaultInfo withVaultChargingMode(String vaultChargingMode) {
        this.vaultChargingMode = vaultChargingMode;
        return this;
    }

    /**
     * 存储库创建模式：   - 按需：post_paid   - 包周期：pre_paid
     * @return vaultChargingMode
     */
    public String getVaultChargingMode() {
        return vaultChargingMode;
    }

    public void setVaultChargingMode(String vaultChargingMode) {
        this.vaultChargingMode = vaultChargingMode;
    }

    public BackupVaultInfo withVaultStatus(String vaultStatus) {
        this.vaultStatus = vaultStatus;
        return this;
    }

    /**
     * 存储库状态。   - available：可用。   - lock：被锁定。   - frozen：冻结。   - deleting：删除中。   - error：错误。
     * @return vaultStatus
     */
    public String getVaultStatus() {
        return vaultStatus;
    }

    public void setVaultStatus(String vaultStatus) {
        this.vaultStatus = vaultStatus;
    }

    public BackupVaultInfo withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * 备份策略ID，若为空，则为未绑定状态，若不为空，通过backup_policy_enabled字段判断策略是否启用
     * @return backupPolicyId
     */
    public String getBackupPolicyId() {
        return backupPolicyId;
    }

    public void setBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
    }

    public BackupVaultInfo withBackupPolicyName(String backupPolicyName) {
        this.backupPolicyName = backupPolicyName;
        return this;
    }

    /**
     * 备份策略名称
     * @return backupPolicyName
     */
    public String getBackupPolicyName() {
        return backupPolicyName;
    }

    public void setBackupPolicyName(String backupPolicyName) {
        this.backupPolicyName = backupPolicyName;
    }

    public BackupVaultInfo withBackupPolicyEnabled(Boolean backupPolicyEnabled) {
        this.backupPolicyEnabled = backupPolicyEnabled;
        return this;
    }

    /**
     * 备份策略是否启用
     * @return backupPolicyEnabled
     */
    public Boolean getBackupPolicyEnabled() {
        return backupPolicyEnabled;
    }

    public void setBackupPolicyEnabled(Boolean backupPolicyEnabled) {
        this.backupPolicyEnabled = backupPolicyEnabled;
    }

    public BackupVaultInfo withResourcesNum(Integer resourcesNum) {
        this.resourcesNum = resourcesNum;
        return this;
    }

    /**
     * 已绑定服务器（个）
     * minimum: 0
     * maximum: 256
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
        BackupVaultInfo that = (BackupVaultInfo) obj;
        return Objects.equals(this.vaultId, that.vaultId) && Objects.equals(this.vaultName, that.vaultName)
            && Objects.equals(this.vaultSize, that.vaultSize) && Objects.equals(this.vaultUsed, that.vaultUsed)
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
        return Objects.hash(vaultId,
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
        sb.append("class BackupVaultInfo {\n");
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
