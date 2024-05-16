package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecoveryBackupSource
 */
public class RecoveryBackupSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private String restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_list")

    private List<RestoreTableListDetail> tableList = null;

    /**
     * 备份级别取值, 默认值：INSTANCE
     */
    public static final class SchemaTypeEnum {

        /**
         * Enum INSTANCE_ for value: "INSTANCE 实例级备份"
         */
        public static final SchemaTypeEnum INSTANCE_ = new SchemaTypeEnum("INSTANCE 实例级备份");

        /**
         * Enum DATABASE_ for value: "DATABASE 库级备份"
         */
        public static final SchemaTypeEnum DATABASE_ = new SchemaTypeEnum("DATABASE 库级备份");

        /**
         * Enum DATABASE_TABLE_ for value: "DATABASE_TABLE 表级备份"
         */
        public static final SchemaTypeEnum DATABASE_TABLE_ = new SchemaTypeEnum("DATABASE_TABLE 表级备份");

        private static final Map<String, SchemaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchemaTypeEnum> createStaticFields() {
            Map<String, SchemaTypeEnum> map = new HashMap<>();
            map.put("INSTANCE 实例级备份", INSTANCE_);
            map.put("DATABASE 库级备份", DATABASE_);
            map.put("DATABASE_TABLE 表级备份", DATABASE_TABLE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchemaTypeEnum(String value) {
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
        public static SchemaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SchemaTypeEnum(value));
        }

        public static SchemaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchemaTypeEnum) {
                return this.value.equals(((SchemaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_type")

    private SchemaTypeEnum schemaType;

    public RecoveryBackupSource withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RecoveryBackupSource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 恢复备份类型：backup，timestamp，different
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RecoveryBackupSource withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 用于恢复的备份ID。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RecoveryBackupSource withRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * UTC时间，时间戳
     * @return restoreTime
     */
    public String getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RecoveryBackupSource withTableList(List<RestoreTableListDetail> tableList) {
        this.tableList = tableList;
        return this;
    }

    public RecoveryBackupSource addTableListItem(RestoreTableListDetail tableListItem) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        this.tableList.add(tableListItem);
        return this;
    }

    public RecoveryBackupSource withTableList(Consumer<List<RestoreTableListDetail>> tableListSetter) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        tableListSetter.accept(this.tableList);
        return this;
    }

    /**
     * 表基础信息。
     * @return tableList
     */
    public List<RestoreTableListDetail> getTableList() {
        return tableList;
    }

    public void setTableList(List<RestoreTableListDetail> tableList) {
        this.tableList = tableList;
    }

    public RecoveryBackupSource withSchemaType(SchemaTypeEnum schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    /**
     * 备份级别取值, 默认值：INSTANCE
     * @return schemaType
     */
    public SchemaTypeEnum getSchemaType() {
        return schemaType;
    }

    public void setSchemaType(SchemaTypeEnum schemaType) {
        this.schemaType = schemaType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecoveryBackupSource that = (RecoveryBackupSource) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.backupId, that.backupId) && Objects.equals(this.restoreTime, that.restoreTime)
            && Objects.equals(this.tableList, that.tableList) && Objects.equals(this.schemaType, that.schemaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type, backupId, restoreTime, tableList, schemaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecoveryBackupSource {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    tableList: ").append(toIndentedString(tableList)).append("\n");
        sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
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
