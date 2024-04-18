package com.huaweicloud.sdk.dcs.v2.model;

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
 * 查询迁移任务列表
 */
public class MigrationTaskList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS（成功）, FAILED（失败）, MIGRATING（迁移中），TERMINATED（已结束）。
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
     * 迁移任务类型，包括备份文件导入和在线迁移两种类型。
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
    @JsonProperty(value = "data_source")

    private String dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_name")

    private String sourceInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_addrs")

    private String targetInstanceAddrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_name")

    private String targetInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_status")

    private String sourceInstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_status")

    private String targetInstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_subnet_id")

    private String sourceInstanceSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_subnet_id")

    private String targetInstanceSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_spec_code")

    private String sourceInstanceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_spec_code")

    private String targetInstanceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "released_at")

    private String releasedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_mode")

    private String resumeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_features")

    private List<String> supportedFeatures = null;

    public MigrationTaskList withTaskId(String taskId) {
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

    public MigrationTaskList withTaskName(String taskName) {
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

    public MigrationTaskList withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS（成功）, FAILED（失败）, MIGRATING（迁移中），TERMINATED（已结束）。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public MigrationTaskList withMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * 迁移任务类型，包括备份文件导入和在线迁移两种类型。
     * @return migrationType
     */
    public MigrationTypeEnum getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
    }

    public MigrationTaskList withMigrationMethod(MigrationMethodEnum migrationMethod) {
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

    public MigrationTaskList withEcsTenantPrivateIp(String ecsTenantPrivateIp) {
        this.ecsTenantPrivateIp = ecsTenantPrivateIp;
        return this;
    }

    /**
     * 迁移机租户侧私有IP，与目的/源redis私有IP处于同VPC，可将此IP加入白名单。
     * @return ecsTenantPrivateIp
     */
    public String getEcsTenantPrivateIp() {
        return ecsTenantPrivateIp;
    }

    public void setEcsTenantPrivateIp(String ecsTenantPrivateIp) {
        this.ecsTenantPrivateIp = ecsTenantPrivateIp;
    }

    public MigrationTaskList withDataSource(String dataSource) {
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

    public MigrationTaskList withSourceInstanceName(String sourceInstanceName) {
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

    public MigrationTaskList withSourceInstanceId(String sourceInstanceId) {
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

    public MigrationTaskList withTargetInstanceAddrs(String targetInstanceAddrs) {
        this.targetInstanceAddrs = targetInstanceAddrs;
        return this;
    }

    /**
     * 目标redis地址，格式为ip:port。
     * @return targetInstanceAddrs
     */
    public String getTargetInstanceAddrs() {
        return targetInstanceAddrs;
    }

    public void setTargetInstanceAddrs(String targetInstanceAddrs) {
        this.targetInstanceAddrs = targetInstanceAddrs;
    }

    public MigrationTaskList withTargetInstanceName(String targetInstanceName) {
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

    public MigrationTaskList withTargetInstanceId(String targetInstanceId) {
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

    public MigrationTaskList withCreatedAt(String createdAt) {
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

    public MigrationTaskList withDescription(String description) {
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

    public MigrationTaskList withSourceInstanceStatus(String sourceInstanceStatus) {
        this.sourceInstanceStatus = sourceInstanceStatus;
        return this;
    }

    /**
     * 源实例状态，若自建redis则为空。
     * @return sourceInstanceStatus
     */
    public String getSourceInstanceStatus() {
        return sourceInstanceStatus;
    }

    public void setSourceInstanceStatus(String sourceInstanceStatus) {
        this.sourceInstanceStatus = sourceInstanceStatus;
    }

    public MigrationTaskList withTargetInstanceStatus(String targetInstanceStatus) {
        this.targetInstanceStatus = targetInstanceStatus;
        return this;
    }

    /**
     * 目标实例状态。
     * @return targetInstanceStatus
     */
    public String getTargetInstanceStatus() {
        return targetInstanceStatus;
    }

    public void setTargetInstanceStatus(String targetInstanceStatus) {
        this.targetInstanceStatus = targetInstanceStatus;
    }

    public MigrationTaskList withSourceInstanceSubnetId(String sourceInstanceSubnetId) {
        this.sourceInstanceSubnetId = sourceInstanceSubnetId;
        return this;
    }

    /**
     * 源实例子网ID，若自建redis则为空。
     * @return sourceInstanceSubnetId
     */
    public String getSourceInstanceSubnetId() {
        return sourceInstanceSubnetId;
    }

    public void setSourceInstanceSubnetId(String sourceInstanceSubnetId) {
        this.sourceInstanceSubnetId = sourceInstanceSubnetId;
    }

    public MigrationTaskList withTargetInstanceSubnetId(String targetInstanceSubnetId) {
        this.targetInstanceSubnetId = targetInstanceSubnetId;
        return this;
    }

    /**
     * 目标实例子网ID。
     * @return targetInstanceSubnetId
     */
    public String getTargetInstanceSubnetId() {
        return targetInstanceSubnetId;
    }

    public void setTargetInstanceSubnetId(String targetInstanceSubnetId) {
        this.targetInstanceSubnetId = targetInstanceSubnetId;
    }

    public MigrationTaskList withSourceInstanceSpecCode(String sourceInstanceSpecCode) {
        this.sourceInstanceSpecCode = sourceInstanceSpecCode;
        return this;
    }

    /**
     * 源实例规格编码，若自建redis则为空。
     * @return sourceInstanceSpecCode
     */
    public String getSourceInstanceSpecCode() {
        return sourceInstanceSpecCode;
    }

    public void setSourceInstanceSpecCode(String sourceInstanceSpecCode) {
        this.sourceInstanceSpecCode = sourceInstanceSpecCode;
    }

    public MigrationTaskList withTargetInstanceSpecCode(String targetInstanceSpecCode) {
        this.targetInstanceSpecCode = targetInstanceSpecCode;
        return this;
    }

    /**
     * 目标实例规格编码。
     * @return targetInstanceSpecCode
     */
    public String getTargetInstanceSpecCode() {
        return targetInstanceSpecCode;
    }

    public void setTargetInstanceSpecCode(String targetInstanceSpecCode) {
        this.targetInstanceSpecCode = targetInstanceSpecCode;
    }

    public MigrationTaskList withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public MigrationTaskList withReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
        return this;
    }

    /**
     * 迁移机释放时间。
     * @return releasedAt
     */
    public String getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

    public MigrationTaskList withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MigrationTaskList withResumeMode(String resumeMode) {
        this.resumeMode = resumeMode;
        return this;
    }

    /**
     * 操作模式，分为auto和manual。
     * @return resumeMode
     */
    public String getResumeMode() {
        return resumeMode;
    }

    public void setResumeMode(String resumeMode) {
        this.resumeMode = resumeMode;
    }

    public MigrationTaskList withSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    public MigrationTaskList addSupportedFeaturesItem(String supportedFeaturesItem) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        this.supportedFeatures.add(supportedFeaturesItem);
        return this;
    }

    public MigrationTaskList withSupportedFeatures(Consumer<List<String>> supportedFeaturesSetter) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        supportedFeaturesSetter.accept(this.supportedFeatures);
        return this;
    }

    /**
     * 支持的特性。
     * @return supportedFeatures
     */
    public List<String> getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationTaskList that = (MigrationTaskList) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.migrationType, that.migrationType)
            && Objects.equals(this.migrationMethod, that.migrationMethod)
            && Objects.equals(this.ecsTenantPrivateIp, that.ecsTenantPrivateIp)
            && Objects.equals(this.dataSource, that.dataSource)
            && Objects.equals(this.sourceInstanceName, that.sourceInstanceName)
            && Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.targetInstanceAddrs, that.targetInstanceAddrs)
            && Objects.equals(this.targetInstanceName, that.targetInstanceName)
            && Objects.equals(this.targetInstanceId, that.targetInstanceId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.sourceInstanceStatus, that.sourceInstanceStatus)
            && Objects.equals(this.targetInstanceStatus, that.targetInstanceStatus)
            && Objects.equals(this.sourceInstanceSubnetId, that.sourceInstanceSubnetId)
            && Objects.equals(this.targetInstanceSubnetId, that.targetInstanceSubnetId)
            && Objects.equals(this.sourceInstanceSpecCode, that.sourceInstanceSpecCode)
            && Objects.equals(this.targetInstanceSpecCode, that.targetInstanceSpecCode)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.releasedAt, that.releasedAt)
            && Objects.equals(this.version, that.version) && Objects.equals(this.resumeMode, that.resumeMode)
            && Objects.equals(this.supportedFeatures, that.supportedFeatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            status,
            migrationType,
            migrationMethod,
            ecsTenantPrivateIp,
            dataSource,
            sourceInstanceName,
            sourceInstanceId,
            targetInstanceAddrs,
            targetInstanceName,
            targetInstanceId,
            createdAt,
            description,
            sourceInstanceStatus,
            targetInstanceStatus,
            sourceInstanceSubnetId,
            targetInstanceSubnetId,
            sourceInstanceSpecCode,
            targetInstanceSpecCode,
            errorMessage,
            releasedAt,
            version,
            resumeMode,
            supportedFeatures);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationTaskList {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
        sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
        sb.append("    ecsTenantPrivateIp: ").append(toIndentedString(ecsTenantPrivateIp)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    sourceInstanceName: ").append(toIndentedString(sourceInstanceName)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    targetInstanceAddrs: ").append(toIndentedString(targetInstanceAddrs)).append("\n");
        sb.append("    targetInstanceName: ").append(toIndentedString(targetInstanceName)).append("\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceInstanceStatus: ").append(toIndentedString(sourceInstanceStatus)).append("\n");
        sb.append("    targetInstanceStatus: ").append(toIndentedString(targetInstanceStatus)).append("\n");
        sb.append("    sourceInstanceSubnetId: ").append(toIndentedString(sourceInstanceSubnetId)).append("\n");
        sb.append("    targetInstanceSubnetId: ").append(toIndentedString(targetInstanceSubnetId)).append("\n");
        sb.append("    sourceInstanceSpecCode: ").append(toIndentedString(sourceInstanceSpecCode)).append("\n");
        sb.append("    targetInstanceSpecCode: ").append(toIndentedString(targetInstanceSpecCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    releasedAt: ").append(toIndentedString(releasedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    resumeMode: ").append(toIndentedString(resumeMode)).append("\n");
        sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
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
