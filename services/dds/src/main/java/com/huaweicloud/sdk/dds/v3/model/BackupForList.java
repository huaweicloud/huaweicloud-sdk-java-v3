package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份信息。
 */
public class BackupForList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private BackupDatabase datastore;

    /**
     * **参数解释：** 备份类型。 **取值范围：** - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。
     */
    public static final class TypeEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final TypeEnum AUTO = new TypeEnum("auto");

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final TypeEnum MANUAL = new TypeEnum("manual");

        /**
         * Enum FRAGMENT for value: "fragment"
         */
        public static final TypeEnum FRAGMENT = new TypeEnum("fragment");

        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final TypeEnum INCREMENTAL = new TypeEnum("incremental");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("manual", MANUAL);
            map.put("fragment", FRAGMENT);
            map.put("incremental", INCREMENTAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * **参数解释：** 备份状态。 **取值范围：** - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。 - DISABLED：备份删除中。
     */
    public static final class StatusEnum {

        /**
         * Enum BUILDING for value: "BUILDING"
         */
        public static final StatusEnum BUILDING = new StatusEnum("BUILDING");

        /**
         * Enum COMPLETED for value: "COMPLETED"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("COMPLETED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILDING", BUILDING);
            map.put("COMPLETED", COMPLETED);
            map.put("FAILED", FAILED);
            map.put("DELETING", DELETING);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：** 实例状态。 **取值范围：** - normal，表示实例正常。 - abnormal，表示实例异常。 - creating，表示实例创建中。 - frozen，表示实例被冻结。 - data_disk_full，表示存储空间满。 - enlargefail，表示实例扩容节点个数失败。
     */
    public static final class InstanceStatusEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final InstanceStatusEnum NORMAL = new InstanceStatusEnum("normal");

        /**
         * Enum ABNORMAL for value: "abnormal"
         */
        public static final InstanceStatusEnum ABNORMAL = new InstanceStatusEnum("abnormal");

        /**
         * Enum CREATING for value: "creating"
         */
        public static final InstanceStatusEnum CREATING = new InstanceStatusEnum("creating");

        /**
         * Enum FROZEN for value: "frozen"
         */
        public static final InstanceStatusEnum FROZEN = new InstanceStatusEnum("frozen");

        /**
         * Enum DATA_DISK_FULL for value: "data_disk_full"
         */
        public static final InstanceStatusEnum DATA_DISK_FULL = new InstanceStatusEnum("data_disk_full");

        /**
         * Enum ENLARGEFAIL for value: "enlargefail"
         */
        public static final InstanceStatusEnum ENLARGEFAIL = new InstanceStatusEnum("enlargefail");

        private static final Map<String, InstanceStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceStatusEnum> createStaticFields() {
            Map<String, InstanceStatusEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("abnormal", ABNORMAL);
            map.put("creating", CREATING);
            map.put("frozen", FROZEN);
            map.put("data_disk_full", DATA_DISK_FULL);
            map.put("enlargefail", ENLARGEFAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceStatusEnum(String value) {
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
        public static InstanceStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceStatusEnum(value));
        }

        public static InstanceStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceStatusEnum) {
                return this.value.equals(((InstanceStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private InstanceStatusEnum instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private String instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_instance_restoring")

    private Boolean isInstanceRestoring;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_method")

    private String backupMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_enable")

    private Boolean kmsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    public BackupForList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 备份ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackupForList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 备份名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupForList withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：** 备份所属的实例ID，可以调用“查询实例列表”接口获取。如果未申请实例，可以调用“创建实例”接口创建。 **取值范围：** 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BackupForList withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释：** 备份所属的实例名称。 **取值范围：** 不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public BackupForList withDatastore(BackupDatabase datastore) {
        this.datastore = datastore;
        return this;
    }

    public BackupForList withDatastore(Consumer<BackupDatabase> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new BackupDatabase();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public BackupDatabase getDatastore() {
        return datastore;
    }

    public void setDatastore(BackupDatabase datastore) {
        this.datastore = datastore;
    }

    public BackupForList withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 备份类型。 **取值范围：** - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BackupForList withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释：** 备份开始时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。 **取值范围：** 不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public BackupForList withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 备份结束时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。 **取值范围：** 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public BackupForList withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 备份状态。 **取值范围：** - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。 - DISABLED：备份删除中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BackupForList withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 备份大小，单位：KB。 **取值范围：** 不涉及。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public BackupForList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 备份描述。 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BackupForList withInstanceStatus(InstanceStatusEnum instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * **参数解释：** 实例状态。 **取值范围：** - normal，表示实例正常。 - abnormal，表示实例异常。 - creating，表示实例创建中。 - frozen，表示实例被冻结。 - data_disk_full，表示存储空间满。 - enlargefail，表示实例扩容节点个数失败。
     * @return instanceStatus
     */
    public InstanceStatusEnum getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(InstanceStatusEnum instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public BackupForList withInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /**
     * **参数解释：** 实例模式。 **取值范围：** - Sharding - ReplicaSet - Single
     * @return instanceMode
     */
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public BackupForList withIsInstanceRestoring(Boolean isInstanceRestoring) {
        this.isInstanceRestoring = isInstanceRestoring;
        return this;
    }

    /**
     * **参数解释：** 当前实例是否处于恢复中或者恢复检查中。 **取值范围：** - true，表示实例处于恢复中或者恢复检查中，不允许删除该实例备份。 - false，当前实例未处于恢复中或者恢复检查中，允许删除该实例备份。
     * @return isInstanceRestoring
     */
    public Boolean getIsInstanceRestoring() {
        return isInstanceRestoring;
    }

    public void setIsInstanceRestoring(Boolean isInstanceRestoring) {
        this.isInstanceRestoring = isInstanceRestoring;
    }

    public BackupForList withBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }

    /**
     * **参数解释：** 备份方式。 **取值范围：** - Snapshot，快照备份。 - Physical，物理备份。 - Logical，逻辑备份。 - Incremental，增量备份。
     * @return backupMethod
     */
    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    public BackupForList withKmsEnable(Boolean kmsEnable) {
        this.kmsEnable = kmsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启kms加密。 **取值范围：** - true，已开启kms加密。 - false，未开启kms加密。
     * @return kmsEnable
     */
    public Boolean getKmsEnable() {
        return kmsEnable;
    }

    public void setKmsEnable(Boolean kmsEnable) {
        this.kmsEnable = kmsEnable;
    }

    public BackupForList withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * **参数解释：** 是否支持删除该备份。当全备策略存在时，不允许删除自动备份。手动备份允许删除。 **取值范围：** - true，允许删除该备份。 - false，不允许删除该备份。
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupForList that = (BackupForList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.type, that.type)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.size, that.size)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.instanceMode, that.instanceMode)
            && Objects.equals(this.isInstanceRestoring, that.isInstanceRestoring)
            && Objects.equals(this.backupMethod, that.backupMethod) && Objects.equals(this.kmsEnable, that.kmsEnable)
            && Objects.equals(this.deletable, that.deletable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            instanceId,
            instanceName,
            datastore,
            type,
            beginTime,
            endTime,
            status,
            size,
            description,
            instanceStatus,
            instanceMode,
            isInstanceRestoring,
            backupMethod,
            kmsEnable,
            deletable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupForList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    isInstanceRestoring: ").append(toIndentedString(isInstanceRestoring)).append("\n");
        sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
        sb.append("    kmsEnable: ").append(toIndentedString(kmsEnable)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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
