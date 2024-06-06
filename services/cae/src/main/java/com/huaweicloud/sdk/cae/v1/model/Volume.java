package com.huaweicloud.sdk.cae.v1.model;

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
 * Volume
 */
public class Volume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_info")

    private Map<String, String> resourceInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    /**
     * 存储资源子类型。
     */
    public static final class ResourceSubTypeEnum {

        /**
         * Enum PARALLEL_FILE_SYSTEM for value: "parallel_file_system"
         */
        public static final ResourceSubTypeEnum PARALLEL_FILE_SYSTEM = new ResourceSubTypeEnum("parallel_file_system");

        /**
         * Enum OBJECT_BUCKET for value: "object_bucket"
         */
        public static final ResourceSubTypeEnum OBJECT_BUCKET = new ResourceSubTypeEnum("object_bucket");

        /**
         * Enum SFS3_0 for value: "sfs3.0"
         */
        public static final ResourceSubTypeEnum SFS3_0 = new ResourceSubTypeEnum("sfs3.0");

        private static final Map<String, ResourceSubTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceSubTypeEnum> createStaticFields() {
            Map<String, ResourceSubTypeEnum> map = new HashMap<>();
            map.put("parallel_file_system", PARALLEL_FILE_SYSTEM);
            map.put("object_bucket", OBJECT_BUCKET);
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
    @JsonProperty(value = "access")

    private String access;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public Volume withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云存储ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Volume withResourceInfo(Map<String, String> resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }

    public Volume putResourceInfoItem(String key, String resourceInfoItem) {
        if (this.resourceInfo == null) {
            this.resourceInfo = new HashMap<>();
        }
        this.resourceInfo.put(key, resourceInfoItem);
        return this;
    }

    public Volume withResourceInfo(Consumer<Map<String, String>> resourceInfoSetter) {
        if (this.resourceInfo == null) {
            this.resourceInfo = new HashMap<>();
        }
        resourceInfoSetter.accept(this.resourceInfo);
        return this;
    }

    /**
     * 存储资源详情。
     * @return resourceInfo
     */
    public Map<String, String> getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(Map<String, String> resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public Volume withResourceName(String resourceName) {
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

    public Volume withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，当前只支持“obs”和“sfs”。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Volume withResourceSubType(ResourceSubTypeEnum resourceSubType) {
        this.resourceSubType = resourceSubType;
        return this;
    }

    /**
     * 存储资源子类型。
     * @return resourceSubType
     */
    public ResourceSubTypeEnum getResourceSubType() {
        return resourceSubType;
    }

    public void setResourceSubType(ResourceSubTypeEnum resourceSubType) {
        this.resourceSubType = resourceSubType;
    }

    public Volume withAccess(String access) {
        this.access = access;
        return this;
    }

    /**
     * 用户access key。
     * @return access
     */
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public Volume withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 创建时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Volume that = (Volume) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceInfo, that.resourceInfo)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSubType, that.resourceSubType) && Objects.equals(this.access, that.access)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceInfo, resourceName, resourceType, resourceSubType, access, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceInfo: ").append(toIndentedString(resourceInfo)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSubType: ").append(toIndentedString(resourceSubType)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
