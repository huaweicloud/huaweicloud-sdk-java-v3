package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置备份策略请求体
 */
public class SetNewBackupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    private BackupPolicyInfo backupPolicy;

    public SetNewBackupPolicyRequestBody withBackupPolicy(BackupPolicyInfo backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public SetNewBackupPolicyRequestBody withBackupPolicy(Consumer<BackupPolicyInfo> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new BackupPolicyInfo();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public BackupPolicyInfo getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(BackupPolicyInfo backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetNewBackupPolicyRequestBody that = (SetNewBackupPolicyRequestBody) obj;
        return Objects.equals(this.backupPolicy, that.backupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetNewBackupPolicyRequestBody {\n");
        sb.append("    backupPolicy: ").append(toIndentedString(backupPolicy)).append("\n");
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
