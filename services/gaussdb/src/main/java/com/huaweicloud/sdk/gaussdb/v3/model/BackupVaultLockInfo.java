package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackupVaultLockInfo
 */
public class BackupVaultLockInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_retention_days")

    private Integer lockRetentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_policy")

    private Boolean lockPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_start_time")

    private Long lockStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_end_time")

    private Long lockEndTime;

    public BackupVaultLockInfo withLockRetentionDays(Integer lockRetentionDays) {
        this.lockRetentionDays = lockRetentionDays;
        return this;
    }

    /**
     * **参数解释**：  合规锁保留期，单位是天。  **取值范围**：  1-36500。
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

    public BackupVaultLockInfo withLockPolicy(Boolean lockPolicy) {
        this.lockPolicy = lockPolicy;
        return this;
    }

    /**
     * **参数解释**：  合规锁配置策略。  **取值范围**：  - true：已开启合规锁配置。 - false: 未开启合规锁配置。
     * @return lockPolicy
     */
    public Boolean getLockPolicy() {
        return lockPolicy;
    }

    public void setLockPolicy(Boolean lockPolicy) {
        this.lockPolicy = lockPolicy;
    }

    public BackupVaultLockInfo withLockStartTime(Long lockStartTime) {
        this.lockStartTime = lockStartTime;
        return this;
    }

    /**
     * **参数解释**：  合规锁开始时间，时间戳格式。  **取值范围**：  不涉及。
     * @return lockStartTime
     */
    public Long getLockStartTime() {
        return lockStartTime;
    }

    public void setLockStartTime(Long lockStartTime) {
        this.lockStartTime = lockStartTime;
    }

    public BackupVaultLockInfo withLockEndTime(Long lockEndTime) {
        this.lockEndTime = lockEndTime;
        return this;
    }

    /**
     * **参数解释**：  合规锁结束时间，时间戳格式。  **取值范围**：  不涉及。
     * @return lockEndTime
     */
    public Long getLockEndTime() {
        return lockEndTime;
    }

    public void setLockEndTime(Long lockEndTime) {
        this.lockEndTime = lockEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupVaultLockInfo that = (BackupVaultLockInfo) obj;
        return Objects.equals(this.lockRetentionDays, that.lockRetentionDays)
            && Objects.equals(this.lockPolicy, that.lockPolicy)
            && Objects.equals(this.lockStartTime, that.lockStartTime)
            && Objects.equals(this.lockEndTime, that.lockEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockRetentionDays, lockPolicy, lockStartTime, lockEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupVaultLockInfo {\n");
        sb.append("    lockRetentionDays: ").append(toIndentedString(lockRetentionDays)).append("\n");
        sb.append("    lockPolicy: ").append(toIndentedString(lockPolicy)).append("\n");
        sb.append("    lockStartTime: ").append(toIndentedString(lockStartTime)).append("\n");
        sb.append("    lockEndTime: ").append(toIndentedString(lockEndTime)).append("\n");
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
