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
public class StopMigrationTaskResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_vpc_id")

    private String tenantVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_subnet_id")

    private String tenantSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_security_group_id")

    private String tenantSecurityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_limit_mb")

    private String bandwidthLimitMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    public StopMigrationTaskResponse withTaskId(String taskId) {
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

    public StopMigrationTaskResponse withTaskName(String taskName) {
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

    public StopMigrationTaskResponse withDescription(String description) {
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

    public StopMigrationTaskResponse withStatus(StatusEnum status) {
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

    public StopMigrationTaskResponse withMigrationType(MigrationTypeEnum migrationType) {
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

    public StopMigrationTaskResponse withMigrationMethod(MigrationMethodEnum migrationMethod) {
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

    public StopMigrationTaskResponse withEcsTenantPrivateIp(String ecsTenantPrivateIp) {
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

    public StopMigrationTaskResponse withBackupFiles(BackupFilesBody backupFiles) {
        this.backupFiles = backupFiles;
        return this;
    }

    public StopMigrationTaskResponse withBackupFiles(Consumer<BackupFilesBody> backupFilesSetter) {
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

    public StopMigrationTaskResponse withNetworkType(NetworkTypeEnum networkType) {
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

    public StopMigrationTaskResponse withSourceInstance(SourceInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
        return this;
    }

    public StopMigrationTaskResponse withSourceInstance(Consumer<SourceInstanceBody> sourceInstanceSetter) {
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

    public StopMigrationTaskResponse withTargetInstance(TargetInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
        return this;
    }

    public StopMigrationTaskResponse withTargetInstance(Consumer<TargetInstanceBody> targetInstanceSetter) {
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

    public StopMigrationTaskResponse withCreatedAt(String createdAt) {
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

    public StopMigrationTaskResponse withUpdatedAt(String updatedAt) {
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

    public StopMigrationTaskResponse withReleasedAt(String releasedAt) {
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

    public StopMigrationTaskResponse withVersion(String version) {
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

    public StopMigrationTaskResponse withResumeMode(String resumeMode) {
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

    public StopMigrationTaskResponse withSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    public StopMigrationTaskResponse addSupportedFeaturesItem(String supportedFeaturesItem) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        this.supportedFeatures.add(supportedFeaturesItem);
        return this;
    }

    public StopMigrationTaskResponse withSupportedFeatures(Consumer<List<String>> supportedFeaturesSetter) {
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

    public StopMigrationTaskResponse withTenantVpcId(String tenantVpcId) {
        this.tenantVpcId = tenantVpcId;
        return this;
    }

    /**
     * 租户VPC ID。
     * @return tenantVpcId
     */
    public String getTenantVpcId() {
        return tenantVpcId;
    }

    public void setTenantVpcId(String tenantVpcId) {
        this.tenantVpcId = tenantVpcId;
    }

    public StopMigrationTaskResponse withTenantSubnetId(String tenantSubnetId) {
        this.tenantSubnetId = tenantSubnetId;
        return this;
    }

    /**
     * 租户子网ID。
     * @return tenantSubnetId
     */
    public String getTenantSubnetId() {
        return tenantSubnetId;
    }

    public void setTenantSubnetId(String tenantSubnetId) {
        this.tenantSubnetId = tenantSubnetId;
    }

    public StopMigrationTaskResponse withTenantSecurityGroupId(String tenantSecurityGroupId) {
        this.tenantSecurityGroupId = tenantSecurityGroupId;
        return this;
    }

    /**
     * 租户安全组ID。
     * @return tenantSecurityGroupId
     */
    public String getTenantSecurityGroupId() {
        return tenantSecurityGroupId;
    }

    public void setTenantSecurityGroupId(String tenantSecurityGroupId) {
        this.tenantSecurityGroupId = tenantSecurityGroupId;
    }

    public StopMigrationTaskResponse withBandwidthLimitMb(String bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
        return this;
    }

    /**
     * 带宽限制速度。
     * @return bandwidthLimitMb
     */
    public String getBandwidthLimitMb() {
        return bandwidthLimitMb;
    }

    public void setBandwidthLimitMb(String bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
    }

    public StopMigrationTaskResponse withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopMigrationTaskResponse that = (StopMigrationTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.migrationType, that.migrationType)
            && Objects.equals(this.migrationMethod, that.migrationMethod)
            && Objects.equals(this.ecsTenantPrivateIp, that.ecsTenantPrivateIp)
            && Objects.equals(this.backupFiles, that.backupFiles) && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.sourceInstance, that.sourceInstance)
            && Objects.equals(this.targetInstance, that.targetInstance)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.releasedAt, that.releasedAt) && Objects.equals(this.version, that.version)
            && Objects.equals(this.resumeMode, that.resumeMode)
            && Objects.equals(this.supportedFeatures, that.supportedFeatures)
            && Objects.equals(this.tenantVpcId, that.tenantVpcId)
            && Objects.equals(this.tenantSubnetId, that.tenantSubnetId)
            && Objects.equals(this.tenantSecurityGroupId, that.tenantSecurityGroupId)
            && Objects.equals(this.bandwidthLimitMb, that.bandwidthLimitMb)
            && Objects.equals(this.taskStatus, that.taskStatus);
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
            updatedAt,
            releasedAt,
            version,
            resumeMode,
            supportedFeatures,
            tenantVpcId,
            tenantSubnetId,
            tenantSecurityGroupId,
            bandwidthLimitMb,
            taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopMigrationTaskResponse {\n");
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
        sb.append("    releasedAt: ").append(toIndentedString(releasedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    resumeMode: ").append(toIndentedString(resumeMode)).append("\n");
        sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
        sb.append("    tenantVpcId: ").append(toIndentedString(tenantVpcId)).append("\n");
        sb.append("    tenantSubnetId: ").append(toIndentedString(tenantSubnetId)).append("\n");
        sb.append("    tenantSecurityGroupId: ").append(toIndentedString(tenantSecurityGroupId)).append("\n");
        sb.append("    bandwidthLimitMb: ").append(toIndentedString(bandwidthLimitMb)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
