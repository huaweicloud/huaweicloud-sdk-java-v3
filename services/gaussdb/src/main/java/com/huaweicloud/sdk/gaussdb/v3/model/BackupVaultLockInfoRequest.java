package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackupVaultLockInfoRequest
 */
public class BackupVaultLockInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_retention_days")

    private Integer lockRetentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_policy")

    private Boolean lockPolicy;

    public BackupVaultLockInfoRequest withLockRetentionDays(Integer lockRetentionDays) {
        this.lockRetentionDays = lockRetentionDays;
        return this;
    }

    /**
     * **参数解释**：  合规锁保留期，单位是天。  **约束限制**：  仅支持按天配置。  **取值范围**：  1-36500。  **默认取值**：  1。
     * minimum: 1
     * maximum: 36500
     * @return lockRetentionDays
     */
    public Integer getLockRetentionDays() {
        return lockRetentionDays;
    }

    public void setLockRetentionDays(Integer lockRetentionDays) {
        this.lockRetentionDays = lockRetentionDays;
    }

    public BackupVaultLockInfoRequest withLockPolicy(Boolean lockPolicy) {
        this.lockPolicy = lockPolicy;
        return this;
    }

    /**
     * **参数解释**：  合规锁配置策略。  **约束限制**：  不涉及。  **取值范围**：  当前仅支持设置为true，表示开启或延期合规锁。  **默认取值**：  true。
     * @return lockPolicy
     */
    public Boolean getLockPolicy() {
        return lockPolicy;
    }

    public void setLockPolicy(Boolean lockPolicy) {
        this.lockPolicy = lockPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupVaultLockInfoRequest that = (BackupVaultLockInfoRequest) obj;
        return Objects.equals(this.lockRetentionDays, that.lockRetentionDays)
            && Objects.equals(this.lockPolicy, that.lockPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockRetentionDays, lockPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupVaultLockInfoRequest {\n");
        sb.append("    lockRetentionDays: ").append(toIndentedString(lockRetentionDays)).append("\n");
        sb.append("    lockPolicy: ").append(toIndentedString(lockPolicy)).append("\n");
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
