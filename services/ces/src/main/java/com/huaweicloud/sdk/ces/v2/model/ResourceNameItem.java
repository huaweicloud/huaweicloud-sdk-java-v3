package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 资源名称
 */
public class ResourceNameItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    /**
     * **参数解释** 实例操作符，含义是真实资源的名称与资源名称条件值的运算关系。 **约束限制** 不涉及 **取值范围** - include: 表示包含 - prefix: 表示前缀 - suffix: 表示后缀 - notInclude: 表示不包含 - equal: 表示相等 - all: 表示全部 **默认取值** 不涉及 
     */
    public static final class OperatorEnum {

        /**
         * Enum INCLUDE for value: "include"
         */
        public static final OperatorEnum INCLUDE = new OperatorEnum("include");

        /**
         * Enum PREFIX for value: "prefix"
         */
        public static final OperatorEnum PREFIX = new OperatorEnum("prefix");

        /**
         * Enum SUFFIX for value: "suffix"
         */
        public static final OperatorEnum SUFFIX = new OperatorEnum("suffix");

        /**
         * Enum NOTINCLUDE for value: "notInclude"
         */
        public static final OperatorEnum NOTINCLUDE = new OperatorEnum("notInclude");

        /**
         * Enum EQUAL for value: "equal"
         */
        public static final OperatorEnum EQUAL = new OperatorEnum("equal");

        /**
         * Enum ALL for value: "all"
         */
        public static final OperatorEnum ALL = new OperatorEnum("all");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("include", INCLUDE);
            map.put("prefix", PREFIX);
            map.put("suffix", SUFFIX);
            map.put("notInclude", NOTINCLUDE);
            map.put("equal", EQUAL);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperatorEnum(String value) {
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
        public static OperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperatorEnum(value));
        }

        public static OperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperatorEnum) {
                return this.value.equals(((OperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private OperatorEnum operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name_is_ignore_case")

    private Boolean resourceNameIsIgnoreCase;

    public ResourceNameItem withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释** 资源名称条件值 **约束限制** 不涉及 **取值范围** 长度[0,128]个字符 **默认取值** 不涉及 
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceNameItem withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释** 实例操作符，含义是真实资源的名称与资源名称条件值的运算关系。 **约束限制** 不涉及 **取值范围** - include: 表示包含 - prefix: 表示前缀 - suffix: 表示后缀 - notInclude: 表示不包含 - equal: 表示相等 - all: 表示全部 **默认取值** 不涉及 
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public ResourceNameItem withResourceNameIsIgnoreCase(Boolean resourceNameIsIgnoreCase) {
        this.resourceNameIsIgnoreCase = resourceNameIsIgnoreCase;
        return this;
    }

    /**
     * **参数解释** 资源名称忽略大小写 **约束限制** 不涉及 **取值范围** - true: 名称忽略大小写 - false: 名称不忽略大小写 **默认取值** false 
     * @return resourceNameIsIgnoreCase
     */
    public Boolean getResourceNameIsIgnoreCase() {
        return resourceNameIsIgnoreCase;
    }

    public void setResourceNameIsIgnoreCase(Boolean resourceNameIsIgnoreCase) {
        this.resourceNameIsIgnoreCase = resourceNameIsIgnoreCase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceNameItem that = (ResourceNameItem) obj;
        return Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.resourceNameIsIgnoreCase, that.resourceNameIsIgnoreCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, operator, resourceNameIsIgnoreCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceNameItem {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    resourceNameIsIgnoreCase: ").append(toIndentedString(resourceNameIsIgnoreCase)).append("\n");
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
