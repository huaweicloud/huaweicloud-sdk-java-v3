package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 删除/退订实例请求体。
 */
public class DeleteGaussMySqlInstanceRequestBody {

    /**
     * **参数解释**：  释放实例时的备份保留策略。  **约束限制**：  不涉及。  **取值范围**：  - retain_all：永久保留全部备份，包含回收站备份、自动全量备份、自动差量备份、手动备份，不包含增量备份。实例删除后，永久保留的备份会产生费用。 - retain_last：保留回收站备份和手动备份。超过回收站策略的保留天数后，系统将删除回收站备份，仅保留手动备份。手动备份会产生费用，其余保留的备份不收费。 - delete_all：删除全部备份。  **默认取值**：  retain_last。
     */
    public static final class BackupRetentionStrategyEnum {

        /**
         * Enum RETAIN_ALL for value: "retain_all"
         */
        public static final BackupRetentionStrategyEnum RETAIN_ALL = new BackupRetentionStrategyEnum("retain_all");

        /**
         * Enum RETAIN_LAST for value: "retain_last"
         */
        public static final BackupRetentionStrategyEnum RETAIN_LAST = new BackupRetentionStrategyEnum("retain_last");

        /**
         * Enum DELETE_ALL for value: "delete_all"
         */
        public static final BackupRetentionStrategyEnum DELETE_ALL = new BackupRetentionStrategyEnum("delete_all");

        private static final Map<String, BackupRetentionStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupRetentionStrategyEnum> createStaticFields() {
            Map<String, BackupRetentionStrategyEnum> map = new HashMap<>();
            map.put("retain_all", RETAIN_ALL);
            map.put("retain_last", RETAIN_LAST);
            map.put("delete_all", DELETE_ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupRetentionStrategyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BackupRetentionStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new BackupRetentionStrategyEnum(value));
        }

        public static BackupRetentionStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupRetentionStrategyEnum) {
                return this.value.equals(((BackupRetentionStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_retention_strategy")

    private BackupRetentionStrategyEnum backupRetentionStrategy;

    public DeleteGaussMySqlInstanceRequestBody withBackupRetentionStrategy(
        BackupRetentionStrategyEnum backupRetentionStrategy) {
        this.backupRetentionStrategy = backupRetentionStrategy;
        return this;
    }

    /**
     * **参数解释**：  释放实例时的备份保留策略。  **约束限制**：  不涉及。  **取值范围**：  - retain_all：永久保留全部备份，包含回收站备份、自动全量备份、自动差量备份、手动备份，不包含增量备份。实例删除后，永久保留的备份会产生费用。 - retain_last：保留回收站备份和手动备份。超过回收站策略的保留天数后，系统将删除回收站备份，仅保留手动备份。手动备份会产生费用，其余保留的备份不收费。 - delete_all：删除全部备份。  **默认取值**：  retain_last。
     * @return backupRetentionStrategy
     */
    public BackupRetentionStrategyEnum getBackupRetentionStrategy() {
        return backupRetentionStrategy;
    }

    public void setBackupRetentionStrategy(BackupRetentionStrategyEnum backupRetentionStrategy) {
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
        DeleteGaussMySqlInstanceRequestBody that = (DeleteGaussMySqlInstanceRequestBody) obj;
        return Objects.equals(this.backupRetentionStrategy, that.backupRetentionStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupRetentionStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGaussMySqlInstanceRequestBody {\n");
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
