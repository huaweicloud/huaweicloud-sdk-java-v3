package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量设置同区域备份策略请求体
 */
public class BatchUpdateBackupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    private MysqlBackupPolicyInfo backupPolicy;

    public BatchUpdateBackupPolicyRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public BatchUpdateBackupPolicyRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public BatchUpdateBackupPolicyRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * **参数解释**：  需要设置备份策略的实例ID列表。  获取方法请参见[查询实例列表](https://support.huaweicloud.com/api-taurusdb/ListGaussMySqlInstancesUnifyStatus.html)。  **约束限制**：  列表数量小于等于50。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public BatchUpdateBackupPolicyRequestBody withBackupPolicy(MysqlBackupPolicyInfo backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public BatchUpdateBackupPolicyRequestBody withBackupPolicy(Consumer<MysqlBackupPolicyInfo> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new MysqlBackupPolicyInfo();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public MysqlBackupPolicyInfo getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(MysqlBackupPolicyInfo backupPolicy) {
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
        BatchUpdateBackupPolicyRequestBody that = (BatchUpdateBackupPolicyRequestBody) obj;
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
        sb.append("class BatchUpdateBackupPolicyRequestBody {\n");
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
