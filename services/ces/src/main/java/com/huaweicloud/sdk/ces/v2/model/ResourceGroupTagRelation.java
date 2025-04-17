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
 * ResourceGroupTagRelation
 */
public class ResourceGroupTagRelation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    /**
     * tag操作符，含义是标签key与value的关系。   include表示包含   prefix表示前缀   suffix表示后缀   notInclude表示不包含   equal表示相等   当operator为equal，value为空字符串时表示为全部   all表示全部 
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
    @JsonProperty(value = "value")

    private String value;

    public ResourceGroupTagRelation withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * TMS标签键规范。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ResourceGroupTagRelation withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * tag操作符，含义是标签key与value的关系。   include表示包含   prefix表示前缀   suffix表示后缀   notInclude表示不包含   equal表示相等   当operator为equal，value为空字符串时表示为全部   all表示全部 
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public ResourceGroupTagRelation withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * TMS标签值规范。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceGroupTagRelation that = (ResourceGroupTagRelation) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, operator, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceGroupTagRelation {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
