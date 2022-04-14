package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 资源详情 */
public class ResourceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private ResourceExtraInfo extraInfo;

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
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_size")

    private Integer backupSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_count")

    private Integer backupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_protect")

    private Boolean autoProtect;

    public ResourceResp withExtraInfo(ResourceExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public ResourceResp withExtraInfo(Consumer<ResourceExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new ResourceExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /** Get extraInfo
     * 
     * @return extraInfo */
    public ResourceExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ResourceExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public ResourceResp withId(String id) {
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

    public ResourceResp withName(String name) {
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

    public ResourceResp withProtectStatus(ProtectStatusEnum protectStatus) {
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

    public ResourceResp withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 资源已分配容量,单位为GB
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ResourceResp withType(String type) {
        this.type = type;
        return this;
    }

    /** 待备份资源的类型, 云服务器: OS::Nova::Server, 云硬盘: OS::Cinder::Volume, 裸金属服务器: OS::Ironic::BareMetalServer, 线下本地服务器:
     * OS::Native::Server, 弹性文件系统: OS::Sfs::Turbo
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceResp withBackupSize(Integer backupSize) {
        this.backupSize = backupSize;
        return this;
    }

    /** 副本大小
     * 
     * @return backupSize */
    public Integer getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(Integer backupSize) {
        this.backupSize = backupSize;
    }

    public ResourceResp withBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
        return this;
    }

    /** 副本数量
     * 
     * @return backupCount */
    public Integer getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
    }

    public ResourceResp withAutoProtect(Boolean autoProtect) {
        this.autoProtect = autoProtect;
        return this;
    }

    /** 是否跟随存储库自动备份策略进行备份
     * 
     * @return autoProtect */
    public Boolean getAutoProtect() {
        return autoProtect;
    }

    public void setAutoProtect(Boolean autoProtect) {
        this.autoProtect = autoProtect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceResp resourceResp = (ResourceResp) o;
        return Objects.equals(this.extraInfo, resourceResp.extraInfo) && Objects.equals(this.id, resourceResp.id)
            && Objects.equals(this.name, resourceResp.name)
            && Objects.equals(this.protectStatus, resourceResp.protectStatus)
            && Objects.equals(this.size, resourceResp.size) && Objects.equals(this.type, resourceResp.type)
            && Objects.equals(this.backupSize, resourceResp.backupSize)
            && Objects.equals(this.backupCount, resourceResp.backupCount)
            && Objects.equals(this.autoProtect, resourceResp.autoProtect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraInfo, id, name, protectStatus, size, type, backupSize, backupCount, autoProtect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceResp {\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backupSize: ").append(toIndentedString(backupSize)).append("\n");
        sb.append("    backupCount: ").append(toIndentedString(backupCount)).append("\n");
        sb.append("    autoProtect: ").append(toIndentedString(autoProtect)).append("\n");
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
