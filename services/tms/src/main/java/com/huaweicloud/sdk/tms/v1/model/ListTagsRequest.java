package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private String resourceTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * 标签类型
     */
    public static final class TagTypesEnum {

        /**
         * Enum RESOURCE for value: "resource"
         */
        public static final TagTypesEnum RESOURCE = new TagTypesEnum("resource");

        private static final Map<String, TagTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TagTypesEnum> createStaticFields() {
            Map<String, TagTypesEnum> map = new HashMap<>();
            map.put("resource", RESOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TagTypesEnum(String value) {
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
        public static TagTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TagTypesEnum(value));
        }

        public static TagTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TagTypesEnum) {
                return this.value.equals(((TagTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_types")

    private TagTypesEnum tagTypes;

    public ListTagsRequest withResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * 资源类型
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public ListTagsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListTagsRequest withTagTypes(TagTypesEnum tagTypes) {
        this.tagTypes = tagTypes;
        return this;
    }

    /**
     * 标签类型
     * @return tagTypes
     */
    public TagTypesEnum getTagTypes() {
        return tagTypes;
    }

    public void setTagTypes(TagTypesEnum tagTypes) {
        this.tagTypes = tagTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTagsRequest that = (ListTagsRequest) obj;
        return Objects.equals(this.resourceTypes, that.resourceTypes) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.tagTypes, that.tagTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceTypes, projectId, tagTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsRequest {\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tagTypes: ").append(toIndentedString(tagTypes)).append("\n");
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
