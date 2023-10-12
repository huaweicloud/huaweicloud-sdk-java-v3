package com.huaweicloud.sdk.cae.v1.model;

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
 * 云存储配置数据。
 */
public class VolumeConfigurationDataVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    /**
     * 云存储类型，支持obs、sfs。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum OBS for value: "obs"
         */
        public static final ResourceTypeEnum OBS = new ResourceTypeEnum("obs");

        /**
         * Enum SFS for value: "sfs"
         */
        public static final ResourceTypeEnum SFS = new ResourceTypeEnum("sfs");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("obs", OBS);
            map.put("sfs", SFS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    /**
     * 云存储子类型，支持object_bucket、parallel_file_system、sfs3.0。
     */
    public static final class ResourceSubTypeEnum {

        /**
         * Enum OBJECT_BUCKET for value: "object_bucket"
         */
        public static final ResourceSubTypeEnum OBJECT_BUCKET = new ResourceSubTypeEnum("object_bucket");

        /**
         * Enum PARALLEL_FILE_SYSTEM for value: "parallel_file_system"
         */
        public static final ResourceSubTypeEnum PARALLEL_FILE_SYSTEM = new ResourceSubTypeEnum("parallel_file_system");

        /**
         * Enum SFS3_0 for value: "sfs3.0"
         */
        public static final ResourceSubTypeEnum SFS3_0 = new ResourceSubTypeEnum("sfs3.0");

        private static final Map<String, ResourceSubTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceSubTypeEnum> createStaticFields() {
            Map<String, ResourceSubTypeEnum> map = new HashMap<>();
            map.put("object_bucket", OBJECT_BUCKET);
            map.put("parallel_file_system", PARALLEL_FILE_SYSTEM);
            map.put("sfs3.0", SFS3_0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceSubTypeEnum(String value) {
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
        public static ResourceSubTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceSubTypeEnum(value));
        }

        public static ResourceSubTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceSubTypeEnum) {
                return this.value.equals(((ResourceSubTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_sub_type")

    private ResourceSubTypeEnum resourceSubType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_info")

    private List<VolumeConfigurationMountInfo> mountInfo = null;

    public VolumeConfigurationDataVolume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 云存储ID。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public VolumeConfigurationDataVolume withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 云存储名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public VolumeConfigurationDataVolume withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 云存储类型，支持obs、sfs。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public VolumeConfigurationDataVolume withResourceSubType(ResourceSubTypeEnum resourceSubType) {
        this.resourceSubType = resourceSubType;
        return this;
    }

    /**
     * 云存储子类型，支持object_bucket、parallel_file_system、sfs3.0。
     * @return resourceSubType
     */
    public ResourceSubTypeEnum getResourceSubType() {
        return resourceSubType;
    }

    public void setResourceSubType(ResourceSubTypeEnum resourceSubType) {
        this.resourceSubType = resourceSubType;
    }

    public VolumeConfigurationDataVolume withMountInfo(List<VolumeConfigurationMountInfo> mountInfo) {
        this.mountInfo = mountInfo;
        return this;
    }

    public VolumeConfigurationDataVolume addMountInfoItem(VolumeConfigurationMountInfo mountInfoItem) {
        if (this.mountInfo == null) {
            this.mountInfo = new ArrayList<>();
        }
        this.mountInfo.add(mountInfoItem);
        return this;
    }

    public VolumeConfigurationDataVolume withMountInfo(Consumer<List<VolumeConfigurationMountInfo>> mountInfoSetter) {
        if (this.mountInfo == null) {
            this.mountInfo = new ArrayList<>();
        }
        mountInfoSetter.accept(this.mountInfo);
        return this;
    }

    /**
     * Get mountInfo
     * @return mountInfo
     */
    public List<VolumeConfigurationMountInfo> getMountInfo() {
        return mountInfo;
    }

    public void setMountInfo(List<VolumeConfigurationMountInfo> mountInfo) {
        this.mountInfo = mountInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeConfigurationDataVolume that = (VolumeConfigurationDataVolume) obj;
        return Objects.equals(this.volumeId, that.volumeId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSubType, that.resourceSubType)
            && Objects.equals(this.mountInfo, that.mountInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeId, resourceName, resourceType, resourceSubType, mountInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeConfigurationDataVolume {\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSubType: ").append(toIndentedString(resourceSubType)).append("\n");
        sb.append("    mountInfo: ").append(toIndentedString(mountInfo)).append("\n");
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
