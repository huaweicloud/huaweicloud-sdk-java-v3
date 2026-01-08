package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSetBackupPolicyRequestBody
 */
public class BatchSetBackupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    private BatchSetBackupPolicyOption backupPolicy;

    public BatchSetBackupPolicyRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public BatchSetBackupPolicyRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public BatchSetBackupPolicyRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * **参数解释**: 实例ID列表。 **约束限制**: 列表中的实例ID需严格匹配UUID规则，只能由英文字母、数字组成，且长度为36个字符。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public BatchSetBackupPolicyRequestBody withBackupPolicy(BatchSetBackupPolicyOption backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public BatchSetBackupPolicyRequestBody withBackupPolicy(Consumer<BatchSetBackupPolicyOption> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new BatchSetBackupPolicyOption();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public BatchSetBackupPolicyOption getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(BatchSetBackupPolicyOption backupPolicy) {
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
        BatchSetBackupPolicyRequestBody that = (BatchSetBackupPolicyRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.backupPolicy, that.backupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, backupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetBackupPolicyRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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
