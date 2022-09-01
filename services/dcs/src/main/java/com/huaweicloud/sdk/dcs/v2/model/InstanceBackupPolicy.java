package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceBackupPolicy
 */
public class InstanceBackupPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy_id")

    @JacksonXmlProperty(localName = "backup_policy_id")

    private String backupPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    @JacksonXmlProperty(localName = "policy")

    private BackupPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    @JacksonXmlProperty(localName = "tenant_id")

    private String tenantId;

    public InstanceBackupPolicy withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * 备份策略ID
     * @return backupPolicyId
     */
    public String getBackupPolicyId() {
        return backupPolicyId;
    }

    public void setBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
    }

    public InstanceBackupPolicy withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。格式为：2022-04-11T09:45:24.790Z
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public InstanceBackupPolicy withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。格式为：2022-04-12T02:22:03.269Z
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public InstanceBackupPolicy withPolicy(BackupPolicy policy) {
        this.policy = policy;
        return this;
    }

    public InstanceBackupPolicy withPolicy(Consumer<BackupPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new BackupPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public BackupPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(BackupPolicy policy) {
        this.policy = policy;
    }

    public InstanceBackupPolicy withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceBackupPolicy instanceBackupPolicy = (InstanceBackupPolicy) o;
        return Objects.equals(this.backupPolicyId, instanceBackupPolicy.backupPolicyId)
            && Objects.equals(this.createdAt, instanceBackupPolicy.createdAt)
            && Objects.equals(this.updatedAt, instanceBackupPolicy.updatedAt)
            && Objects.equals(this.policy, instanceBackupPolicy.policy)
            && Objects.equals(this.tenantId, instanceBackupPolicy.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicyId, createdAt, updatedAt, policy, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBackupPolicy {\n");
        sb.append("    backupPolicyId: ").append(toIndentedString(backupPolicyId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
