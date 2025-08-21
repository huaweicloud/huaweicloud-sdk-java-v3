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
 * Request Object
 */
public class ListGroupPermissionResourcesRequest {

    /**
     * **参数解释：** 创建资源类型。 **约束限制：** - group 代码组。 - project  项目。 - all 代码组和项目
     */
    public static final class ScopeEnum {

        /**
         * Enum GROUP for value: "group"
         */
        public static final ScopeEnum GROUP = new ScopeEnum("group");

        /**
         * Enum PROJECT for value: "project"
         */
        public static final ScopeEnum PROJECT = new ScopeEnum("project");

        /**
         * Enum ALL for value: "all"
         */
        public static final ScopeEnum ALL = new ScopeEnum("all");

        private static final Map<String, ScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScopeEnum> createStaticFields() {
            Map<String, ScopeEnum> map = new HashMap<>();
            map.put("group", GROUP);
            map.put("project", PROJECT);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScopeEnum(value));
        }

        public static ScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScopeEnum) {
                return this.value.equals(((ScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private ScopeEnum scope;

    public ListGroupPermissionResourcesRequest withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释：** 创建资源类型。 **约束限制：** - group 代码组。 - project  项目。 - all 代码组和项目
     * @return scope
     */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGroupPermissionResourcesRequest that = (ListGroupPermissionResourcesRequest) obj;
        return Objects.equals(this.scope, that.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupPermissionResourcesRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
