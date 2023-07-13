package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMigrationTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING，TERMINATED。
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。
     */
    public static final class MigrationTypeEnum {

        /**
         * Enum BACKUPFILE_IMPORT for value: "backupfile_import"
         */
        public static final MigrationTypeEnum BACKUPFILE_IMPORT = new MigrationTypeEnum("backupfile_import");

        /**
         * Enum ONLINE_MIGRATION for value: "online_migration"
         */
        public static final MigrationTypeEnum ONLINE_MIGRATION = new MigrationTypeEnum("online_migration");

        private static final Map<String, MigrationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationTypeEnum> createStaticFields() {
            Map<String, MigrationTypeEnum> map = new HashMap<>();
            map.put("backupfile_import", BACKUPFILE_IMPORT);
            map.put("online_migration", ONLINE_MIGRATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationTypeEnum(String value) {
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
        public static MigrationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MigrationTypeEnum(value));
        }

        public static MigrationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationTypeEnum) {
                return this.value.equals(((MigrationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_type")

    private MigrationTypeEnum migrationType;

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MigrationMethodEnum(value));
        }

        public static MigrationMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "ecs_tenant_private_ip")

    private String ecsTenantPrivateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_files")

    private BackupFilesBody backupFiles;

    /**
     * 网络类型，包括vpc和vpn两种类型。
     */
    public static final class NetworkTypeEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetworkTypeEnum VPC = new NetworkTypeEnum("vpc");

        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetworkTypeEnum VPN = new NetworkTypeEnum("vpn");

        private static final Map<String, NetworkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkTypeEnum> createStaticFields() {
            Map<String, NetworkTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("vpn", VPN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkTypeEnum(String value) {
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
        public static NetworkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkTypeEnum(value));
        }

        public static NetworkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private NetworkTypeEnum networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance")

    private SourceInstanceBody sourceInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance")

    private TargetInstanceBody targetInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ShowMigrationTaskResponse withTaskId(String taskId) {
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

    public ShowMigrationTaskResponse withTaskName(String taskName) {
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

    public ShowMigrationTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 迁移任务描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowMigrationTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING，TERMINATED。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowMigrationTaskResponse withMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。
     * @return migrationType
     */
    public MigrationTypeEnum getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
    }

    public ShowMigrationTaskResponse withMigrationMethod(MigrationMethodEnum migrationMethod) {
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

    public ShowMigrationTaskResponse withEcsTenantPrivateIp(String ecsTenantPrivateIp) {
        this.ecsTenantPrivateIp = ecsTenantPrivateIp;
        return this;
    }

    /**
     * 迁移机租户侧私有IP，与目的/源redis私有IP处于同VPC，可将此IP加入白名单
     * @return ecsTenantPrivateIp
     */
    public String getEcsTenantPrivateIp() {
        return ecsTenantPrivateIp;
    }

    public void setEcsTenantPrivateIp(String ecsTenantPrivateIp) {
        this.ecsTenantPrivateIp = ecsTenantPrivateIp;
    }

    public ShowMigrationTaskResponse withBackupFiles(BackupFilesBody backupFiles) {
        this.backupFiles = backupFiles;
        return this;
    }

    public ShowMigrationTaskResponse withBackupFiles(Consumer<BackupFilesBody> backupFilesSetter) {
        if (this.backupFiles == null) {
            this.backupFiles = new BackupFilesBody();
            backupFilesSetter.accept(this.backupFiles);
        }

        return this;
    }

    /**
     * Get backupFiles
     * @return backupFiles
     */
    public BackupFilesBody getBackupFiles() {
        return backupFiles;
    }

    public void setBackupFiles(BackupFilesBody backupFiles) {
        this.backupFiles = backupFiles;
    }

    public ShowMigrationTaskResponse withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 网络类型，包括vpc和vpn两种类型。
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public ShowMigrationTaskResponse withSourceInstance(SourceInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
        return this;
    }

    public ShowMigrationTaskResponse withSourceInstance(Consumer<SourceInstanceBody> sourceInstanceSetter) {
        if (this.sourceInstance == null) {
            this.sourceInstance = new SourceInstanceBody();
            sourceInstanceSetter.accept(this.sourceInstance);
        }

        return this;
    }

    /**
     * Get sourceInstance
     * @return sourceInstance
     */
    public SourceInstanceBody getSourceInstance() {
        return sourceInstance;
    }

    public void setSourceInstance(SourceInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
    }

    public ShowMigrationTaskResponse withTargetInstance(TargetInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
        return this;
    }

    public ShowMigrationTaskResponse withTargetInstance(Consumer<TargetInstanceBody> targetInstanceSetter) {
        if (this.targetInstance == null) {
            this.targetInstance = new TargetInstanceBody();
            targetInstanceSetter.accept(this.targetInstance);
        }

        return this;
    }

    /**
     * Get targetInstance
     * @return targetInstance
     */
    public TargetInstanceBody getTargetInstance() {
        return targetInstance;
    }

    public void setTargetInstance(TargetInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
    }

    public ShowMigrationTaskResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 迁移任务创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowMigrationTaskResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 迁移任务完成时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigrationTaskResponse that = (ShowMigrationTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.migrationType, that.migrationType)
            && Objects.equals(this.migrationMethod, that.migrationMethod)
            && Objects.equals(this.ecsTenantPrivateIp, that.ecsTenantPrivateIp)
            && Objects.equals(this.backupFiles, that.backupFiles) && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.sourceInstance, that.sourceInstance)
            && Objects.equals(this.targetInstance, that.targetInstance)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            description,
            status,
            migrationType,
            migrationMethod,
            ecsTenantPrivateIp,
            backupFiles,
            networkType,
            sourceInstance,
            targetInstance,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrationTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
        sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
        sb.append("    ecsTenantPrivateIp: ").append(toIndentedString(ecsTenantPrivateIp)).append("\n");
        sb.append("    backupFiles: ").append(toIndentedString(backupFiles)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    sourceInstance: ").append(toIndentedString(sourceInstance)).append("\n");
        sb.append("    targetInstance: ").append(toIndentedString(targetInstance)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
