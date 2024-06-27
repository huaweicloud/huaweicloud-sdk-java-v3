package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ItemParam
 */
public class ItemParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_value")

    private AwParamBasicValue basicValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultValue")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_type")

    private String enumType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_type_selected")

    private String enumTypeSelected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_big_field")

    private Boolean isBigField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxItems")

    private Integer maxItems;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxLength")

    private Long maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum")

    private Number maximum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minItems")

    private Integer minItems;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minLength")

    private Long minLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum")

    private Number minimum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_rule")

    private ValidateRule validateRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private Integer valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xChoiceValue")

    private String xChoiceValue;

    public ItemParam withBasicValue(AwParamBasicValue basicValue) {
        this.basicValue = basicValue;
        return this;
    }

    public ItemParam withBasicValue(Consumer<AwParamBasicValue> basicValueSetter) {
        if (this.basicValue == null) {
            this.basicValue = new AwParamBasicValue();
            basicValueSetter.accept(this.basicValue);
        }

        return this;
    }

    /**
     * Get basicValue
     * @return basicValue
     */
    public AwParamBasicValue getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(AwParamBasicValue basicValue) {
        this.basicValue = basicValue;
    }

    public ItemParam withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ItemParam withEnumType(String enumType) {
        this.enumType = enumType;
        return this;
    }

    /**
     * 枚举类型
     * @return enumType
     */
    public String getEnumType() {
        return enumType;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public ItemParam withEnumTypeSelected(String enumTypeSelected) {
        this.enumTypeSelected = enumTypeSelected;
        return this;
    }

    /**
     * 当前选中的枚举类型
     * @return enumTypeSelected
     */
    public String getEnumTypeSelected() {
        return enumTypeSelected;
    }

    public void setEnumTypeSelected(String enumTypeSelected) {
        this.enumTypeSelected = enumTypeSelected;
    }

    public ItemParam withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * num和String有效
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ItemParam withIsBigField(Boolean isBigField) {
        this.isBigField = isBigField;
        return this;
    }

    /**
     * 是否是大字段参数
     * @return isBigField
     */
    public Boolean getIsBigField() {
        return isBigField;
    }

    public void setIsBigField(Boolean isBigField) {
        this.isBigField = isBigField;
    }

    public ItemParam withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Array类型最大元素数
     * @return maxItems
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    public ItemParam withMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * String类型最大长度
     * @return maxLength
     */
    public Long getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public ItemParam withMaximum(Number maximum) {
        this.maximum = maximum;
        return this;
    }

    public ItemParam withMaximum(Consumer<Number> maximumSetter) {
        if (this.maximum == null) {
            this.maximum = new Number();
            maximumSetter.accept(this.maximum);
        }

        return this;
    }

    /**
     * Get maximum
     * @return maximum
     */
    public Number getMaximum() {
        return maximum;
    }

    public void setMaximum(Number maximum) {
        this.maximum = maximum;
    }

    public ItemParam withMinItems(Integer minItems) {
        this.minItems = minItems;
        return this;
    }

    /**
     * Array类型最小元素数
     * @return minItems
     */
    public Integer getMinItems() {
        return minItems;
    }

    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
    }

    public ItemParam withMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * String类型最小长度
     * @return minLength
     */
    public Long getMinLength() {
        return minLength;
    }

    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public ItemParam withMinimum(Number minimum) {
        this.minimum = minimum;
        return this;
    }

    public ItemParam withMinimum(Consumer<Number> minimumSetter) {
        if (this.minimum == null) {
            this.minimum = new Number();
            minimumSetter.accept(this.minimum);
        }

        return this;
    }

    /**
     * Get minimum
     * @return minimum
     */
    public Number getMinimum() {
        return minimum;
    }

    public void setMinimum(Number minimum) {
        this.minimum = minimum;
    }

    public ItemParam withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * num和String有效
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public ItemParam withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ItemParam withValidateRule(ValidateRule validateRule) {
        this.validateRule = validateRule;
        return this;
    }

    public ItemParam withValidateRule(Consumer<ValidateRule> validateRuleSetter) {
        if (this.validateRule == null) {
            this.validateRule = new ValidateRule();
            validateRuleSetter.accept(this.validateRule);
        }

        return this;
    }

    /**
     * Get validateRule
     * @return validateRule
     */
    public ValidateRule getValidateRule() {
        return validateRule;
    }

    public void setValidateRule(ValidateRule validateRule) {
        this.validateRule = validateRule;
    }

    public ItemParam withValueType(Integer valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 参数值类型 0-基本类型，type字段为String,Integer等基本类型 1-基本类型数组,type字段为List<String>,List<Integer>等基本类型List 2-结构体，type字段为除了基本类型以外的结构体 3-结构体数组，type字段为List<结构体> 5-前端枚举类型
     * @return valueType
     */
    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public ItemParam withXChoiceValue(String xChoiceValue) {
        this.xChoiceValue = xChoiceValue;
        return this;
    }

    /**
     * choice选择关系
     * @return xChoiceValue
     */
    public String getXChoiceValue() {
        return xChoiceValue;
    }

    public void setXChoiceValue(String xChoiceValue) {
        this.xChoiceValue = xChoiceValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemParam that = (ItemParam) obj;
        return Objects.equals(this.basicValue, that.basicValue) && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.enumType, that.enumType)
            && Objects.equals(this.enumTypeSelected, that.enumTypeSelected) && Objects.equals(this.format, that.format)
            && Objects.equals(this.isBigField, that.isBigField) && Objects.equals(this.maxItems, that.maxItems)
            && Objects.equals(this.maxLength, that.maxLength) && Objects.equals(this.maximum, that.maximum)
            && Objects.equals(this.minItems, that.minItems) && Objects.equals(this.minLength, that.minLength)
            && Objects.equals(this.minimum, that.minimum) && Objects.equals(this.pattern, that.pattern)
            && Objects.equals(this.type, that.type) && Objects.equals(this.validateRule, that.validateRule)
            && Objects.equals(this.valueType, that.valueType) && Objects.equals(this.xChoiceValue, that.xChoiceValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicValue,
            defaultValue,
            enumType,
            enumTypeSelected,
            format,
            isBigField,
            maxItems,
            maxLength,
            maximum,
            minItems,
            minLength,
            minimum,
            pattern,
            type,
            validateRule,
            valueType,
            xChoiceValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemParam {\n");
        sb.append("    basicValue: ").append(toIndentedString(basicValue)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    enumType: ").append(toIndentedString(enumType)).append("\n");
        sb.append("    enumTypeSelected: ").append(toIndentedString(enumTypeSelected)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    isBigField: ").append(toIndentedString(isBigField)).append("\n");
        sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
        sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    validateRule: ").append(toIndentedString(validateRule)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    xChoiceValue: ").append(toIndentedString(xChoiceValue)).append("\n");
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
