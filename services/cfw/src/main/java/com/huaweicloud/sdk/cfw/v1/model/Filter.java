package com.huaweicloud.sdk.cfw.v1.model;

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
 * Filter
 */
public class Filter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    /**
     * **参数解释**： 操作符 **约束限制**： 不涉及 **取值范围**： equal 等于 not_equal 不等于 contain 包含 starts_with 以开始 **默认取值**： 不涉及
     */
    public static final class OperatorEnum {

        /**
         * Enum EQUAL for value: "equal"
         */
        public static final OperatorEnum EQUAL = new OperatorEnum("equal");

        /**
         * Enum NOT_EQUAL for value: "not_equal"
         */
        public static final OperatorEnum NOT_EQUAL = new OperatorEnum("not_equal");

        /**
         * Enum CONTAIN for value: "contain"
         */
        public static final OperatorEnum CONTAIN = new OperatorEnum("contain");

        /**
         * Enum STARTS_WITH for value: "starts_with"
         */
        public static final OperatorEnum STARTS_WITH = new OperatorEnum("starts_with");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("equal", EQUAL);
            map.put("not_equal", NOT_EQUAL);
            map.put("contain", CONTAIN);
            map.put("starts_with", STARTS_WITH);
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

    public Filter withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * **参数解释**： 日志字段，如src_ip **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Filter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public Filter addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public Filter withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释**： 值 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Filter withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**： 操作符 **约束限制**： 不涉及 **取值范围**： equal 等于 not_equal 不等于 contain 包含 starts_with 以开始 **默认取值**： 不涉及
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
        Filter that = (Filter) obj;
        return Objects.equals(this.field, that.field) && Objects.equals(this.values, that.values)
            && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, values, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Filter {\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
