package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiRequestPara
 */
public class ApiRequestPara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping")

    private String mapping;

    /**
     * 操作符
     */
    public static final class ConditionEnum {

        /**
         * Enum CONDITION_TYPE_EQ for value: "CONDITION_TYPE_EQ"
         */
        public static final ConditionEnum CONDITION_TYPE_EQ = new ConditionEnum("CONDITION_TYPE_EQ");

        /**
         * Enum CONDITION_TYPE_NE for value: "CONDITION_TYPE_NE"
         */
        public static final ConditionEnum CONDITION_TYPE_NE = new ConditionEnum("CONDITION_TYPE_NE");

        /**
         * Enum CONDITION_TYPE_GT for value: "CONDITION_TYPE_GT"
         */
        public static final ConditionEnum CONDITION_TYPE_GT = new ConditionEnum("CONDITION_TYPE_GT");

        /**
         * Enum CONDITION_TYPE_GE for value: "CONDITION_TYPE_GE"
         */
        public static final ConditionEnum CONDITION_TYPE_GE = new ConditionEnum("CONDITION_TYPE_GE");

        /**
         * Enum CONDITION_TYPE_LT for value: "CONDITION_TYPE_LT"
         */
        public static final ConditionEnum CONDITION_TYPE_LT = new ConditionEnum("CONDITION_TYPE_LT");

        /**
         * Enum CONDITION_TYPE_LE for value: "CONDITION_TYPE_LE"
         */
        public static final ConditionEnum CONDITION_TYPE_LE = new ConditionEnum("CONDITION_TYPE_LE");

        /**
         * Enum CONDITION_TYPE_LIKE for value: "CONDITION_TYPE_LIKE"
         */
        public static final ConditionEnum CONDITION_TYPE_LIKE = new ConditionEnum("CONDITION_TYPE_LIKE");

        /**
         * Enum CONDITION_TYPE_LIKE_L for value: "CONDITION_TYPE_LIKE_L"
         */
        public static final ConditionEnum CONDITION_TYPE_LIKE_L = new ConditionEnum("CONDITION_TYPE_LIKE_L");

        /**
         * Enum CONDITION_TYPE_LIKE_R for value: "CONDITION_TYPE_LIKE_R"
         */
        public static final ConditionEnum CONDITION_TYPE_LIKE_R = new ConditionEnum("CONDITION_TYPE_LIKE_R");

        private static final Map<String, ConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionEnum> createStaticFields() {
            Map<String, ConditionEnum> map = new HashMap<>();
            map.put("CONDITION_TYPE_EQ", CONDITION_TYPE_EQ);
            map.put("CONDITION_TYPE_NE", CONDITION_TYPE_NE);
            map.put("CONDITION_TYPE_GT", CONDITION_TYPE_GT);
            map.put("CONDITION_TYPE_GE", CONDITION_TYPE_GE);
            map.put("CONDITION_TYPE_LT", CONDITION_TYPE_LT);
            map.put("CONDITION_TYPE_LE", CONDITION_TYPE_LE);
            map.put("CONDITION_TYPE_LIKE", CONDITION_TYPE_LIKE);
            map.put("CONDITION_TYPE_LIKE_L", CONDITION_TYPE_LIKE_L);
            map.put("CONDITION_TYPE_LIKE_R", CONDITION_TYPE_LIKE_R);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionEnum(String value) {
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
        public static ConditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConditionEnum(value));
        }

        public static ConditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionEnum) {
                return this.value.equals(((ConditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionEnum condition;

    public ApiRequestPara withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiRequestPara withMapping(String mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * 映射字段
     * @return mapping
     */
    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public ApiRequestPara withCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 操作符
     * @return condition
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiRequestPara that = (ApiRequestPara) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.mapping, that.mapping)
            && Objects.equals(this.condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mapping, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiRequestPara {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
