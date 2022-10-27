package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMigrationTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_tasks")

    private List<MigrationTaskList> migrationTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_address")

    private String targetInstanceAddress;

    /**
     * 迁移方式，包括全量迁移和增量迁移两种类型。
     */
    public static final class MigrationMethodEnum {

        /**
         * Enum FULL_AMOUNT_MIGRATION for value: "full_amount_migration"
         */
        public static final MigrationMethodEnum FULL_AMOUNT_MIGRATION =
            new MigrationMethodEnum("full_amount_migration");

        /**
         * Enum INCREMENTAL_MIGRATION for value: "incremental_migration"
         */
        public static final MigrationMethodEnum INCREMENTAL_MIGRATION =
            new MigrationMethodEnum("incremental_migration");

        private static final Map<String, MigrationMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationMethodEnum> createStaticFields() {
            Map<String, MigrationMethodEnum> map = new HashMap<>();
            map.put("full_amount_migration", FULL_AMOUNT_MIGRATION);
            map.put("incremental_migration", INCREMENTAL_MIGRATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationMethodEnum(String value) {
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
        public static MigrationMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MigrationMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MigrationMethodEnum(value);
            }
            return result;
        }

        public static MigrationMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MigrationMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationMethodEnum) {
                return this.value.equals(((MigrationMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_method")

    private MigrationMethodEnum migrationMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_name")

    private String sourceInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_name")

    private String targetInstanceName;

    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。
     */
    public static final class MigrateTypeEnum {

        /**
         * Enum BACKUPFILE_IMPORT for value: "backupfile_import"
         */
        public static final MigrateTypeEnum BACKUPFILE_IMPORT = new MigrateTypeEnum("backupfile_import");

        /**
         * Enum ONLINE_MIGRATION for value: "online_migration"
         */
        public static final MigrateTypeEnum ONLINE_MIGRATION = new MigrateTypeEnum("online_migration");

        private static final Map<String, MigrateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrateTypeEnum> createStaticFields() {
            Map<String, MigrateTypeEnum> map = new HashMap<>();
            map.put("backupfile_import", BACKUPFILE_IMPORT);
            map.put("online_migration", ONLINE_MIGRATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrateTypeEnum(String value) {
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
        public static MigrateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MigrateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MigrateTypeEnum(value);
            }
            return result;
        }

        public static MigrateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MigrateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrateTypeEnum) {
                return this.value.equals(((MigrateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_type")

    private MigrateTypeEnum migrateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private String dataSource;

    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING，TERMINATED
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum MIGRATING for value: "MIGRATING"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("MIGRATING");

        /**
         * Enum TERMINATED for value: "TERMINATED"
         */
        public static final StatusEnum TERMINATED = new StatusEnum("TERMINATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            map.put("MIGRATING", MIGRATING);
            map.put("TERMINATED", TERMINATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public ListMigrationTaskResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 迁移任务数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListMigrationTaskResponse withMigrationTasks(List<MigrationTaskList> migrationTasks) {
        this.migrationTasks = migrationTasks;
        return this;
    }

    public ListMigrationTaskResponse addMigrationTasksItem(MigrationTaskList migrationTasksItem) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        this.migrationTasks.add(migrationTasksItem);
        return this;
    }

    public ListMigrationTaskResponse withMigrationTasks(Consumer<List<MigrationTaskList>> migrationTasksSetter) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        migrationTasksSetter.accept(this.migrationTasks);
        return this;
    }

    /**
     * 迁移任务列表。
     * @return migrationTasks
     */
    public List<MigrationTaskList> getMigrationTasks() {
        return migrationTasks;
    }

    public void setMigrationTasks(List<MigrationTaskList> migrationTasks) {
        this.migrationTasks = migrationTasks;
    }

    public ListMigrationTaskResponse withTargetInstanceAddress(String targetInstanceAddress) {
        this.targetInstanceAddress = targetInstanceAddress;
        return this;
    }

    /**
     * 目标实例地址
     * @return targetInstanceAddress
     */
    public String getTargetInstanceAddress() {
        return targetInstanceAddress;
    }

    public void setTargetInstanceAddress(String targetInstanceAddress) {
        this.targetInstanceAddress = targetInstanceAddress;
    }

    public ListMigrationTaskResponse withMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
        return this;
    }

    /**
     * 迁移方式，包括全量迁移和增量迁移两种类型。
     * @return migrationMethod
     */
    public MigrationMethodEnum getMigrationMethod() {
        return migrationMethod;
    }

    public void setMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
    }

    public ListMigrationTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 迁移任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListMigrationTaskResponse withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 目标实例ID。
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public ListMigrationTaskResponse withSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
        return this;
    }

    /**
     * 源实例名称，若自建redis则为空。
     * @return sourceInstanceName
     */
    public String getSourceInstanceName() {
        return sourceInstanceName;
    }

    public void setSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
    }

    public ListMigrationTaskResponse withTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }

    /**
     * 目标实例名称。
     * @return targetInstanceName
     */
    public String getTargetInstanceName() {
        return targetInstanceName;
    }

    public void setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
    }

    public ListMigrationTaskResponse withMigrateType(MigrateTypeEnum migrateType) {
        this.migrateType = migrateType;
        return this;
    }

    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。
     * @return migrateType
     */
    public MigrateTypeEnum getMigrateType() {
        return migrateType;
    }

    public void setMigrateType(MigrateTypeEnum migrateType) {
        this.migrateType = migrateType;
    }

    public ListMigrationTaskResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 迁移任务创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListMigrationTaskResponse withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * 源实例ID，若自建redis则为空。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public ListMigrationTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 迁移任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListMigrationTaskResponse withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * 源redis地址，格式为ip:port或者桶名。
     * @return dataSource
     */
    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public ListMigrationTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING，TERMINATED
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMigrationTaskResponse listMigrationTaskResponse = (ListMigrationTaskResponse) o;
        return Objects.equals(this.count, listMigrationTaskResponse.count)
            && Objects.equals(this.migrationTasks, listMigrationTaskResponse.migrationTasks)
            && Objects.equals(this.targetInstanceAddress, listMigrationTaskResponse.targetInstanceAddress)
            && Objects.equals(this.migrationMethod, listMigrationTaskResponse.migrationMethod)
            && Objects.equals(this.taskName, listMigrationTaskResponse.taskName)
            && Objects.equals(this.targetInstanceId, listMigrationTaskResponse.targetInstanceId)
            && Objects.equals(this.sourceInstanceName, listMigrationTaskResponse.sourceInstanceName)
            && Objects.equals(this.targetInstanceName, listMigrationTaskResponse.targetInstanceName)
            && Objects.equals(this.migrateType, listMigrationTaskResponse.migrateType)
            && Objects.equals(this.createdAt, listMigrationTaskResponse.createdAt)
            && Objects.equals(this.sourceInstanceId, listMigrationTaskResponse.sourceInstanceId)
            && Objects.equals(this.taskId, listMigrationTaskResponse.taskId)
            && Objects.equals(this.dataSource, listMigrationTaskResponse.dataSource)
            && Objects.equals(this.status, listMigrationTaskResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count,
            migrationTasks,
            targetInstanceAddress,
            migrationMethod,
            taskName,
            targetInstanceId,
            sourceInstanceName,
            targetInstanceName,
            migrateType,
            createdAt,
            sourceInstanceId,
            taskId,
            dataSource,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMigrationTaskResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    migrationTasks: ").append(toIndentedString(migrationTasks)).append("\n");
        sb.append("    targetInstanceAddress: ").append(toIndentedString(targetInstanceAddress)).append("\n");
        sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    sourceInstanceName: ").append(toIndentedString(sourceInstanceName)).append("\n");
        sb.append("    targetInstanceName: ").append(toIndentedString(targetInstanceName)).append("\n");
        sb.append("    migrateType: ").append(toIndentedString(migrateType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
