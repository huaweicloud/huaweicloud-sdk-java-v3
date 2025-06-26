package com.huaweicloud.sdk.swr.v2.model;

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
 * Request Object
 */
public class CreateSubResourceTagsRequest {

    /**
     * 资源类型，支持的资源类型为：instances
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum INSTANCES for value: "instances"
         */
        public static final ResourceTypeEnum INSTANCES = new ResourceTypeEnum("instances");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("instances", INSTANCES);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 子资源类型，支持的子资源类型为：namespaces
     */
    public static final class SubResourceTypeEnum {

        /**
         * Enum NAMESPACES for value: "namespaces"
         */
        public static final SubResourceTypeEnum NAMESPACES = new SubResourceTypeEnum("namespaces");

        private static final Map<String, SubResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubResourceTypeEnum> createStaticFields() {
            Map<String, SubResourceTypeEnum> map = new HashMap<>();
            map.put("namespaces", NAMESPACES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubResourceTypeEnum(String value) {
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
        public static SubResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubResourceTypeEnum(value));
        }

        public static SubResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubResourceTypeEnum) {
                return this.value.equals(((SubResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource_type")

    private SubResourceTypeEnum subResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource_id")

    private String subResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateResourceTagsRequestBody body;

    public CreateSubResourceTagsRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，支持的资源类型为：instances
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public CreateSubResourceTagsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CreateSubResourceTagsRequest withSubResourceType(SubResourceTypeEnum subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    /**
     * 子资源类型，支持的子资源类型为：namespaces
     * @return subResourceType
     */
    public SubResourceTypeEnum getSubResourceType() {
        return subResourceType;
    }

    public void setSubResourceType(SubResourceTypeEnum subResourceType) {
        this.subResourceType = subResourceType;
    }

    public CreateSubResourceTagsRequest withSubResourceId(String subResourceId) {
        this.subResourceId = subResourceId;
        return this;
    }

    /**
     * 子资源id
     * @return subResourceId
     */
    public String getSubResourceId() {
        return subResourceId;
    }

    public void setSubResourceId(String subResourceId) {
        this.subResourceId = subResourceId;
    }

    public CreateSubResourceTagsRequest withBody(CreateResourceTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSubResourceTagsRequest withBody(Consumer<CreateResourceTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateResourceTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateResourceTagsRequestBody getBody() {
        return body;
    }

    public void setBody(CreateResourceTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubResourceTagsRequest that = (CreateSubResourceTagsRequest) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.subResourceType, that.subResourceType)
            && Objects.equals(this.subResourceId, that.subResourceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId, subResourceType, subResourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubResourceTagsRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    subResourceType: ").append(toIndentedString(subResourceType)).append("\n");
        sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
