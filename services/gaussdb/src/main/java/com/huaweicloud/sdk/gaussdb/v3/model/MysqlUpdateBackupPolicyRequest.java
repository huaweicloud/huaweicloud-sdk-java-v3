package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置自动备份策略信息
 */
public class MysqlUpdateBackupPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    private MysqlBackupPolicy backupPolicy;

    public MysqlUpdateBackupPolicyRequest withBackupPolicy(MysqlBackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public MysqlUpdateBackupPolicyRequest withBackupPolicy(Consumer<MysqlBackupPolicy> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new MysqlBackupPolicy();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public MysqlBackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(MysqlBackupPolicy backupPolicy) {
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
        MysqlUpdateBackupPolicyRequest that = (MysqlUpdateBackupPolicyRequest) obj;
        return Objects.equals(this.backupPolicy, that.backupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlUpdateBackupPolicyRequest {\n");
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
