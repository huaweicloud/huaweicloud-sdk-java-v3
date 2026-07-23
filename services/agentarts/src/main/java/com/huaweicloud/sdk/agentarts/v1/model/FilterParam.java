package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * FilterParam
 */
public class FilterParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_name")

    private String labelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_value")

    private String labelValue;

    /**
     * 操作类型,equal,like,not_like,empty,not_empty,greater_than,less_than,in,not_in
     */
    public static final class OperatorEnum {

        /**
         * Enum EQUAL for value: "equal"
         */
        public static final OperatorEnum EQUAL = new OperatorEnum("equal");

        /**
         * Enum LIKE for value: "like"
         */
        public static final OperatorEnum LIKE = new OperatorEnum("like");

        /**
         * Enum NOT_LIKE for value: "not_like"
         */
        public static final OperatorEnum NOT_LIKE = new OperatorEnum("not_like");

        /**
         * Enum EMPTY for value: "empty"
         */
        public static final OperatorEnum EMPTY = new OperatorEnum("empty");

        /**
         * Enum NOT_EMPTY for value: "not_empty"
         */
        public static final OperatorEnum NOT_EMPTY = new OperatorEnum("not_empty");

        /**
         * Enum GREATER_THAN for value: "greater_than"
         */
        public static final OperatorEnum GREATER_THAN = new OperatorEnum("greater_than");

        /**
         * Enum LESS_THAN for value: "less_than"
         */
        public static final OperatorEnum LESS_THAN = new OperatorEnum("less_than");

        /**
         * Enum IN for value: "in"
         */
        public static final OperatorEnum IN = new OperatorEnum("in");

        /**
         * Enum NOT_IN for value: "not_in"
         */
        public static final OperatorEnum NOT_IN = new OperatorEnum("not_in");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("equal", EQUAL);
            map.put("like", LIKE);
            map.put("not_like", NOT_LIKE);
            map.put("empty", EMPTY);
            map.put("not_empty", NOT_EMPTY);
            map.put("greater_than", GREATER_THAN);
            map.put("less_than", LESS_THAN);
            map.put("in", IN);
            map.put("not_in", NOT_IN);
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

    public FilterParam withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * 标签名
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public FilterParam withLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    /**
     * 标签值
     * @return labelValue
     */
    public String getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

    public FilterParam withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作类型,equal,like,not_like,empty,not_empty,greater_than,less_than,in,not_in
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilterParam that = (FilterParam) obj;
        return Objects.equals(this.labelName, that.labelName) && Objects.equals(this.labelValue, that.labelValue)
            && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelName, labelValue, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterParam {\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
        sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
