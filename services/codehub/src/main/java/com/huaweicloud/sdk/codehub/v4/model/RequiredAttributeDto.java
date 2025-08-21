package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RequiredAttributeDto
 */
public class RequiredAttributeDto {

    /**
     * **参数解释：** 必填字段名称。 描述：Body 严重程度：Severity 指派给：AssigneeId 意见分类：ReviewCategories 意见模块：ReviewModules
     */
    public static final class NameEnum {

        /**
         * Enum BODY for value: "Body"
         */
        public static final NameEnum BODY = new NameEnum("Body");

        /**
         * Enum SEVERITY for value: "Severity"
         */
        public static final NameEnum SEVERITY = new NameEnum("Severity");

        /**
         * Enum ASSIGNEEID for value: "AssigneeId"
         */
        public static final NameEnum ASSIGNEEID = new NameEnum("AssigneeId");

        /**
         * Enum REVIEWCATEGORIES for value: "ReviewCategories"
         */
        public static final NameEnum REVIEWCATEGORIES = new NameEnum("ReviewCategories");

        /**
         * Enum REVIEWMODULES for value: "ReviewModules"
         */
        public static final NameEnum REVIEWMODULES = new NameEnum("ReviewModules");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("Body", BODY);
            map.put("Severity", SEVERITY);
            map.put("AssigneeId", ASSIGNEEID);
            map.put("ReviewCategories", REVIEWCATEGORIES);
            map.put("ReviewModules", REVIEWMODULES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NameEnum(value));
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_required")

    private Boolean isRequired;

    public RequiredAttributeDto withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 必填字段名称。 描述：Body 严重程度：Severity 指派给：AssigneeId 意见分类：ReviewCategories 意见模块：ReviewModules
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public RequiredAttributeDto withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * **参数解释：** 是否必填。
     * @return isRequired
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequiredAttributeDto that = (RequiredAttributeDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.isRequired, that.isRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequiredAttributeDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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
