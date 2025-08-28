package com.huaweicloud.sdk.iam.v5.model;

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
 * Request Object
 */
public class DeleteResourceTagsV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 资源类型，可以为“信任委托”（trust agency）或“IAM用户”（user）。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum AGENCY for value: "agency"
         */
        public static final ResourceTypeEnum AGENCY = new ResourceTypeEnum("agency");

        /**
         * Enum USER for value: "user"
         */
        public static final ResourceTypeEnum USER = new ResourceTypeEnum("user");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("agency", AGENCY);
            map.put("user", USER);
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
    @JsonProperty(value = "body")

    private List<String> body = null;

    public DeleteResourceTagsV5Request withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public DeleteResourceTagsV5Request withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，可以为“信任委托”（trust agency）或“IAM用户”（user）。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public DeleteResourceTagsV5Request withBody(List<String> body) {
        this.body = body;
        return this;
    }

    public DeleteResourceTagsV5Request addBodyItem(String bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public DeleteResourceTagsV5Request withBody(Consumer<List<String>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 待删除的标签键列表。
     * @return body
     */
    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
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
        DeleteResourceTagsV5Request that = (DeleteResourceTagsV5Request) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResourceTagsV5Request {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
