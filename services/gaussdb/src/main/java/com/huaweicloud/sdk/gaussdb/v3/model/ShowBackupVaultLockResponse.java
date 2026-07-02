package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackupVaultLockResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_vaultlock_info")

    private BackupVaultLockInfo backupVaultlockInfo;

    public ShowBackupVaultLockResponse withBackupVaultlockInfo(BackupVaultLockInfo backupVaultlockInfo) {
        this.backupVaultlockInfo = backupVaultlockInfo;
        return this;
    }

    public ShowBackupVaultLockResponse withBackupVaultlockInfo(
        Consumer<BackupVaultLockInfo> backupVaultlockInfoSetter) {
        if (this.backupVaultlockInfo == null) {
            this.backupVaultlockInfo = new BackupVaultLockInfo();
            backupVaultlockInfoSetter.accept(this.backupVaultlockInfo);
        }

        return this;
    }

    /**
     * Get backupVaultlockInfo
     * @return backupVaultlockInfo
     */
    public BackupVaultLockInfo getBackupVaultlockInfo() {
        return backupVaultlockInfo;
    }

    public void setBackupVaultlockInfo(BackupVaultLockInfo backupVaultlockInfo) {
        this.backupVaultlockInfo = backupVaultlockInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupVaultLockResponse that = (ShowBackupVaultLockResponse) obj;
        return Objects.equals(this.backupVaultlockInfo, that.backupVaultlockInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupVaultlockInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupVaultLockResponse {\n");
        sb.append("    backupVaultlockInfo: ").append(toIndentedString(backupVaultlockInfo)).append("\n");
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
