package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** CheckpointResourceResp */
public class CheckpointResourceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private String extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 保护状态 */
    public static final class ProtectStatusEnum {

        /** Enum AVAILABLE for value: "available" */
        public static final ProtectStatusEnum AVAILABLE = new ProtectStatusEnum("available");

        /** Enum ERROR for value: "error" */
        public static final ProtectStatusEnum ERROR = new ProtectStatusEnum("error");

        /** Enum PROTECTING for value: "protecting" */
        public static final ProtectStatusEnum PROTECTING = new ProtectStatusEnum("protecting");

        /** Enum RESTORING for value: "restoring" */
        public static final ProtectStatusEnum RESTORING = new ProtectStatusEnum("restoring");

        /** Enum REMOVING for value: "removing" */
        public static final ProtectStatusEnum REMOVING = new ProtectStatusEnum("removing");

        private static final Map<String, ProtectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectStatusEnum> createStaticFields() {
            Map<String, ProtectStatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("error", ERROR);
            map.put("protecting", PROTECTING);
            map.put("restoring", RESTORING);
            map.put("removing", REMOVING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectStatusEnum(String value) {
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
        public static ProtectStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtectStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectStatusEnum(value);
            }
            return result;
        }

        public static ProtectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtectStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectStatusEnum) {
                return this.value.equals(((ProtectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private ProtectStatusEnum protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private String resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_size")

    private String backupSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_count")

    private String backupCount;

    public CheckpointResourceResp withExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /** 资源附加信息
     * 
     * @return extraInfo */
    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public CheckpointResourceResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 待备份资源id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckpointResourceResp withName(String name) {
        this.name = name;
        return this;
    }

    /** 待备份资源名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckpointResourceResp withProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 保护状态
     * 
     * @return protectStatus */
    public ProtectStatusEnum getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
    }

    public CheckpointResourceResp withResourceSize(String resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /** 资源已分配容量,单位为GB
     * 
     * @return resourceSize */
    public String getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(String resourceSize) {
        this.resourceSize = resourceSize;
    }

    public CheckpointResourceResp withType(String type) {
        this.type = type;
        return this;
    }

    /** @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CheckpointResourceResp withBackupSize(String backupSize) {
        this.backupSize = backupSize;
        return this;
    }

    /** 副本大小
     * 
     * @return backupSize */
    public String getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(String backupSize) {
        this.backupSize = backupSize;
    }

    public CheckpointResourceResp withBackupCount(String backupCount) {
        this.backupCount = backupCount;
        return this;
    }

    /** 副本数量
     * 
     * @return backupCount */
    public String getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(String backupCount) {
        this.backupCount = backupCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointResourceResp checkpointResourceResp = (CheckpointResourceResp) o;
        return Objects.equals(this.extraInfo, checkpointResourceResp.extraInfo)
            && Objects.equals(this.id, checkpointResourceResp.id)
            && Objects.equals(this.name, checkpointResourceResp.name)
            && Objects.equals(this.protectStatus, checkpointResourceResp.protectStatus)
            && Objects.equals(this.resourceSize, checkpointResourceResp.resourceSize)
            && Objects.equals(this.type, checkpointResourceResp.type)
            && Objects.equals(this.backupSize, checkpointResourceResp.backupSize)
            && Objects.equals(this.backupCount, checkpointResourceResp.backupCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraInfo, id, name, protectStatus, resourceSize, type, backupSize, backupCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointResourceResp {\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backupSize: ").append(toIndentedString(backupSize)).append("\n");
        sb.append("    backupCount: ").append(toIndentedString(backupCount)).append("\n");
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
