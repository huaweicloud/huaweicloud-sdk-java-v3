package com.huaweicloud.sdk.config.v1.model;

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
 * 预定义合规包模板参数详情。
 */
public class TemplateParameterDefinition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private Object defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_values")

    private List<Object> allowedValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum")

    private Float minimum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum")

    private Float maximum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_items")

    private Integer minItems;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_items")

    private Integer maxItems;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_length")

    private Integer minLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    /**
     * 预定义合规包模板参数类型。
     */
    public static final class TypeEnum {

        /**
         * Enum ARRAY for value: "Array"
         */
        public static final TypeEnum ARRAY = new TypeEnum("Array");

        /**
         * Enum BOOLEAN for value: "Boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("Boolean");

        /**
         * Enum INTEGER for value: "Integer"
         */
        public static final TypeEnum INTEGER = new TypeEnum("Integer");

        /**
         * Enum FLOAT for value: "Float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("Float");

        /**
         * Enum STRING for value: "String"
         */
        public static final TypeEnum STRING = new TypeEnum("String");

        /**
         * Enum OBJECT for value: "Object"
         */
        public static final TypeEnum OBJECT = new TypeEnum("Object");

        /**
         * Enum DATE for value: "Date"
         */
        public static final TypeEnum DATE = new TypeEnum("Date");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Array", ARRAY);
            map.put("Boolean", BOOLEAN);
            map.put("Integer", INTEGER);
            map.put("Float", FLOAT);
            map.put("String", STRING);
            map.put("Object", OBJECT);
            map.put("Date", DATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public TemplateParameterDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 预定义合规包模板参数名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateParameterDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 预定义合规包模板参数描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateParameterDefinition withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 预定义合规包模板参数默认值。
     * @return defaultValue
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public TemplateParameterDefinition withAllowedValues(List<Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    public TemplateParameterDefinition addAllowedValuesItem(Object allowedValuesItem) {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<>();
        }
        this.allowedValues.add(allowedValuesItem);
        return this;
    }

    public TemplateParameterDefinition withAllowedValues(Consumer<List<Object>> allowedValuesSetter) {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<>();
        }
        allowedValuesSetter.accept(this.allowedValues);
        return this;
    }

    /**
     * 预定义合规包模板参数允许值列表。
     * @return allowedValues
     */
    public List<Object> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<Object> allowedValues) {
        this.allowedValues = allowedValues;
    }

    public TemplateParameterDefinition withMinimum(Float minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * 策略参数的最小值，当参数类型为Integer或Float时生效。
     * @return minimum
     */
    public Float getMinimum() {
        return minimum;
    }

    public void setMinimum(Float minimum) {
        this.minimum = minimum;
    }

    public TemplateParameterDefinition withMaximum(Float maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * 策略参数的最大值，当参数类型为Integer或Float时生效。
     * @return maximum
     */
    public Float getMaximum() {
        return maximum;
    }

    public void setMaximum(Float maximum) {
        this.maximum = maximum;
    }

    public TemplateParameterDefinition withMinItems(Integer minItems) {
        this.minItems = minItems;
        return this;
    }

    /**
     * 策略参数的最小项数，当参数类型为Array时生效。
     * @return minItems
     */
    public Integer getMinItems() {
        return minItems;
    }

    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
    }

    public TemplateParameterDefinition withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * 策略参数的最大项数，当参数类型为Array时生效。
     * @return maxItems
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    public TemplateParameterDefinition withMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * 策略参数的最小字符串长度或每项的最小字符串长度，当参数类型为String或Array时生效。
     * @return minLength
     */
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public TemplateParameterDefinition withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * 策略参数的最大字符串长度或每项的最大字符串长度，当参数类型为String或Array时生效。
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public TemplateParameterDefinition withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * 策略参数的字符串正则要求或每项的字符串正则要求，当参数类型为String或Array时生效。
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public TemplateParameterDefinition withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 预定义合规包模板参数类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateParameterDefinition that = (TemplateParameterDefinition) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.allowedValues, that.allowedValues) && Objects.equals(this.minimum, that.minimum)
            && Objects.equals(this.maximum, that.maximum) && Objects.equals(this.minItems, that.minItems)
            && Objects.equals(this.maxItems, that.maxItems) && Objects.equals(this.minLength, that.minLength)
            && Objects.equals(this.maxLength, that.maxLength) && Objects.equals(this.pattern, that.pattern)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            defaultValue,
            allowedValues,
            minimum,
            maximum,
            minItems,
            maxItems,
            minLength,
            maxLength,
            pattern,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateParameterDefinition {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
        sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
        sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
        sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
        sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
