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
 * OpsSampleFilter
 */
public class OpsSampleFilter {

    /**
     * **参数解释：** 过滤名，指定要过滤的字段名称。  **约束限制：** 不涉及  **取值范围：** Duration,Label,Input,Output  **默认取值：** 无。
     */
    public static final class FieldEnum {

        /**
         * Enum DURATION for value: "Duration"
         */
        public static final FieldEnum DURATION = new FieldEnum("Duration");

        /**
         * Enum LABEL for value: "Label"
         */
        public static final FieldEnum LABEL = new FieldEnum("Label");

        /**
         * Enum INPUT for value: "Input"
         */
        public static final FieldEnum INPUT = new FieldEnum("Input");

        /**
         * Enum OUTPUT for value: "Output"
         */
        public static final FieldEnum OUTPUT = new FieldEnum("Output");

        private static final Map<String, FieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldEnum> createStaticFields() {
            Map<String, FieldEnum> map = new HashMap<>();
            map.put("Duration", DURATION);
            map.put("Label", LABEL);
            map.put("Input", INPUT);
            map.put("Output", OUTPUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldEnum(String value) {
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
        public static FieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldEnum(value));
        }

        public static FieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldEnum) {
                return this.value.equals(((FieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private FieldEnum field;

    /**
     * **参数解释：** 操作符。  **约束限制：** 对不同的field类型，支持不同的操作符。 Duration：greater_than：大于等于，less_than：小于等于 Input：like：包含，not_like：不包含 Output：like：包含，not_like：不包含 Label：greater_than：大于等于，less_than：小于等于，like：包含，not_like：不包含，in：属于，not_in：不属于   **取值范围：** like：包含，not_like：不包含，equals：等于，empty：为空，not_empty：不为空，greater_than：大于等于，less_than：小于等于，in：属于，not_in：不属于  **默认取值：** 无。
     */
    public static final class OperatorEnum {

        /**
         * Enum LIKE for value: "like"
         */
        public static final OperatorEnum LIKE = new OperatorEnum("like");

        /**
         * Enum NOT_LIKE for value: "not_like"
         */
        public static final OperatorEnum NOT_LIKE = new OperatorEnum("not_like");

        /**
         * Enum EQUALS for value: "equals"
         */
        public static final OperatorEnum EQUALS = new OperatorEnum("equals");

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
            map.put("like", LIKE);
            map.put("not_like", NOT_LIKE);
            map.put("equals", EQUALS);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_name")

    private String labelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    public OpsSampleFilter withField(FieldEnum field) {
        this.field = field;
        return this;
    }

    /**
     * **参数解释：** 过滤名，指定要过滤的字段名称。  **约束限制：** 不涉及  **取值范围：** Duration,Label,Input,Output  **默认取值：** 无。
     * @return field
     */
    public FieldEnum getField() {
        return field;
    }

    public void setField(FieldEnum field) {
        this.field = field;
    }

    public OpsSampleFilter withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释：** 操作符。  **约束限制：** 对不同的field类型，支持不同的操作符。 Duration：greater_than：大于等于，less_than：小于等于 Input：like：包含，not_like：不包含 Output：like：包含，not_like：不包含 Label：greater_than：大于等于，less_than：小于等于，like：包含，not_like：不包含，in：属于，not_in：不属于   **取值范围：** like：包含，not_like：不包含，equals：等于，empty：为空，not_empty：不为空，greater_than：大于等于，less_than：小于等于，in：属于，not_in：不属于  **默认取值：** 无。
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public OpsSampleFilter withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * **参数解释：** 标签名。  **约束限制：** 当field为Label时必填。field为其他值时无意义。  **取值范围：**   **默认取值：** 无。
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public OpsSampleFilter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 筛选的值。  **约束限制：** 值类型取决于操作符字段（operator）： 字符串(string)、数字(number)、布尔(boolean)或字符串数组(array)。  greater_than，less_than：数字(number) like，not_like：字符串(string) equals：数字(number) 或 字符串(string) empty，not_empty：不传递该字段 in，not_in：字符串数组(array)  **取值范围：** - 字符串：长度0-64个字符。 - 数字：整数或浮点数。 - 布尔：true或false。 - 数组：长度0-20，每个元素长度0-64个字符的字符串。  **默认取值：** 无。
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        OpsSampleFilter that = (OpsSampleFilter) obj;
        return Objects.equals(this.field, that.field) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.labelName, that.labelName) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, operator, labelName, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsSampleFilter {\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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
