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

/** 备份信息。 */
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

    /** 备份类型。 - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。 */
    public static final class TypeEnum {

        /** Enum AUTO for value: "auto" */
        public static final TypeEnum AUTO = new TypeEnum("auto");

        /** Enum MANUAL for value: "manual" */
        public static final TypeEnum MANUAL = new TypeEnum("manual");

        /** Enum FRAGMENT for value: "fragment" */
        public static final TypeEnum FRAGMENT = new TypeEnum("fragment");

        /** Enum INCREMENTAL for value: "incremental" */
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 备份状态。 取值： - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。 - DISABLED：备份删除中。 */
    public static final class StatusEnum {

        /** Enum BUILDING for value: "BUILDING" */
        public static final StatusEnum BUILDING = new StatusEnum("BUILDING");

        /** Enum COMPLETED for value: "COMPLETED" */
        public static final StatusEnum COMPLETED = new StatusEnum("COMPLETED");

        /** Enum FAILED for value: "FAILED" */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /** Enum DELETING for value: "DELETING" */
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public BackupForList withId(String id) {
        this.id = id;
        return this;
    }

    /** 备份ID。
     * 
     * @return id */
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

    /** 备份名称。
     * 
     * @return name */
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

    /** 备份所属的实例ID。
     * 
     * @return instanceId */
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

    /** 备份所属的实例名称。
     * 
     * @return instanceName */
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

    /** Get datastore
     * 
     * @return datastore */
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

    /** 备份类型。 - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。
     * 
     * @return type */
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

    /** 备份开始时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。
     * 
     * @return beginTime */
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

    /** 备份结束时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。
     * 
     * @return endTime */
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

    /** 备份状态。 取值： - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。 - DISABLED：备份删除中。
     * 
     * @return status */
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

    /** 备份大小，单位：KB。
     * 
     * @return size */
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

    /** 备份描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupForList backupForList = (BackupForList) o;
        return Objects.equals(this.id, backupForList.id) && Objects.equals(this.name, backupForList.name)
            && Objects.equals(this.instanceId, backupForList.instanceId)
            && Objects.equals(this.instanceName, backupForList.instanceName)
            && Objects.equals(this.datastore, backupForList.datastore) && Objects.equals(this.type, backupForList.type)
            && Objects.equals(this.beginTime, backupForList.beginTime)
            && Objects.equals(this.endTime, backupForList.endTime) && Objects.equals(this.status, backupForList.status)
            && Objects.equals(this.size, backupForList.size)
            && Objects.equals(this.description, backupForList.description);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, instanceId, instanceName, datastore, type, beginTime, endTime, status, size, description);
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
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
