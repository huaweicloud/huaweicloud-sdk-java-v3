package com.huaweicloud.sdk.gaussdb.v3.model;

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
 * Backups
 */
public class Backups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "take_up_time")

    private Integer takeUpTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private MysqlDatastoreInBackup datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    /**
     * 备份级别。当开启一级备份开关时，返回该参数。
     */
    public static final class BackupLevelEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final BackupLevelEnum _0 = new BackupLevelEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final BackupLevelEnum _1 = new BackupLevelEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final BackupLevelEnum _2 = new BackupLevelEnum("2");

        private static final Map<String, BackupLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupLevelEnum> createStaticFields() {
            Map<String, BackupLevelEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupLevelEnum(String value) {
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
        public static BackupLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BackupLevelEnum(value));
        }

        public static BackupLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupLevelEnum) {
                return this.value.equals(((BackupLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_level")

    private BackupLevelEnum backupLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public Backups withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 备份ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Backups withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Backups withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 备份开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Backups withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 备份结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Backups withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 备份状态，取值： - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。 - AVAILABLE：备份可用。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Backups withTakeUpTime(Integer takeUpTime) {
        this.takeUpTime = takeUpTime;
        return this;
    }

    /**
     * 备份花费时间（单位：minutes）
     * @return takeUpTime
     */
    public Integer getTakeUpTime() {
        return takeUpTime;
    }

    public void setTakeUpTime(Integer takeUpTime) {
        this.takeUpTime = takeUpTime;
    }

    public Backups withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 备份类型，取值：  - auto：自动全量备份。 - manual：手动全量备份。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Backups withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 备份大小（单位：MB）。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Backups withDatastore(MysqlDatastoreInBackup datastore) {
        this.datastore = datastore;
        return this;
    }

    public Backups withDatastore(Consumer<MysqlDatastoreInBackup> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new MysqlDatastoreInBackup();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public MysqlDatastoreInBackup getDatastore() {
        return datastore;
    }

    public void setDatastore(MysqlDatastoreInBackup datastore) {
        this.datastore = datastore;
    }

    public Backups withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，严格匹配UUID规则。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Backups withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Backups withBackupLevel(BackupLevelEnum backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }

    /**
     * 备份级别。当开启一级备份开关时，返回该参数。
     * @return backupLevel
     */
    public BackupLevelEnum getBackupLevel() {
        return backupLevel;
    }

    public void setBackupLevel(BackupLevelEnum backupLevel) {
        this.backupLevel = backupLevel;
    }

    public Backups withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备份文件描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Backups that = (Backups) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.takeUpTime, that.takeUpTime)
            && Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.backupLevel, that.backupLevel) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            beginTime,
            endTime,
            status,
            takeUpTime,
            type,
            size,
            datastore,
            instanceId,
            instanceName,
            backupLevel,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backups {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    takeUpTime: ").append(toIndentedString(takeUpTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    backupLevel: ").append(toIndentedString(backupLevel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
