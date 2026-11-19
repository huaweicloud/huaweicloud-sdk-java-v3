package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 保留策略信息。
 */
public class RetainedBackupPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_retention_strategy")

    private String backupRetentionStrategy;

    public RetainedBackupPolicy withBackupRetentionStrategy(String backupRetentionStrategy) {
        this.backupRetentionStrategy = backupRetentionStrategy;
        return this;
    }

    /**
     * **参数解释**：  实例释放保留策略。  **约束限制**：  不涉及。  **默认取值**：  不涉及。
     * @return backupRetentionStrategy
     */
    public String getBackupRetentionStrategy() {
        return backupRetentionStrategy;
    }

    public void setBackupRetentionStrategy(String backupRetentionStrategy) {
        this.backupRetentionStrategy = backupRetentionStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetainedBackupPolicy that = (RetainedBackupPolicy) obj;
        return Objects.equals(this.backupRetentionStrategy, that.backupRetentionStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupRetentionStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetainedBackupPolicy {\n");
        sb.append("    backupRetentionStrategy: ").append(toIndentedString(backupRetentionStrategy)).append("\n");
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
