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
 * VolumeSpec
 */
public class VolumeSpec {

    /**
     * 资源类型，当前只支持“obs”和“sfs”。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum SFS for value: "sfs"
         */
        public static final ResourceTypeEnum SFS = new ResourceTypeEnum("sfs");

        /**
         * Enum OBS for value: "obs"
         */
        public static final ResourceTypeEnum OBS = new ResourceTypeEnum("obs");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("sfs", SFS);
            map.put("obs", OBS);
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
     * 对象存储类型。
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
    @JsonProperty(value = "resources")

    private List<String> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_credentials")

    private List<ResourcesCredential> resourcesCredentials = null;

    public VolumeSpec withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，当前只支持“obs”和“sfs”。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public VolumeSpec withResourceSubType(ResourceSubTypeEnum resourceSubType) {
        this.resourceSubType = resourceSubType;
        return this;
    }

    /**
     * 对象存储类型。
     * @return resourceSubType
     */
    public ResourceSubTypeEnum getResourceSubType() {
        return resourceSubType;
    }

    public void setResourceSubType(ResourceSubTypeEnum resourceSubType) {
        this.resourceSubType = resourceSubType;
    }

    public VolumeSpec withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public VolumeSpec addResourcesItem(String resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public VolumeSpec withResources(Consumer<List<String>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 云存储名称。
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public VolumeSpec withResourcesCredentials(List<ResourcesCredential> resourcesCredentials) {
        this.resourcesCredentials = resourcesCredentials;
        return this;
    }

    public VolumeSpec addResourcesCredentialsItem(ResourcesCredential resourcesCredentialsItem) {
        if (this.resourcesCredentials == null) {
            this.resourcesCredentials = new ArrayList<>();
        }
        this.resourcesCredentials.add(resourcesCredentialsItem);
        return this;
    }

    public VolumeSpec withResourcesCredentials(Consumer<List<ResourcesCredential>> resourcesCredentialsSetter) {
        if (this.resourcesCredentials == null) {
            this.resourcesCredentials = new ArrayList<>();
        }
        resourcesCredentialsSetter.accept(this.resourcesCredentials);
        return this;
    }

    /**
     * 云存储和授权凭证，获取环境列表接口响应中env_category字段为v2时需添加该字段的值。
     * @return resourcesCredentials
     */
    public List<ResourcesCredential> getResourcesCredentials() {
        return resourcesCredentials;
    }

    public void setResourcesCredentials(List<ResourcesCredential> resourcesCredentials) {
        this.resourcesCredentials = resourcesCredentials;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeSpec that = (VolumeSpec) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSubType, that.resourceSubType)
            && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.resourcesCredentials, that.resourcesCredentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceSubType, resources, resourcesCredentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeSpec {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSubType: ").append(toIndentedString(resourceSubType)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    resourcesCredentials: ").append(toIndentedString(resourcesCredentials)).append("\n");
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
