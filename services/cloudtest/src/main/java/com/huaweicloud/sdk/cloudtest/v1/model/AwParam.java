package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AwParam
 */
public class AwParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_value")

    private AwParamBasicValue basicValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_value_list")

    private List<AwParamBasicValue> basicValueList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_body")

    private String customBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultValue")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drop_down_value")

    private String dropDownValue;

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
    @JsonProperty(value = "in_type")

    private Integer inType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isChecked")

    private Boolean isChecked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_big_field")

    private Boolean isBigField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_body_custom")

    private Integer isBodyCustom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_contract_param")

    private Integer isContractParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sensitive")

    private Boolean isSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private ItemParam item;

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
    @JsonProperty(value = "mock")

    private MockInfo mock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_value")

    private List<AwParam> objectValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_value_list")

    private List<List<AwParam>> objectValueList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

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

    public AwParam withBasicValue(AwParamBasicValue basicValue) {
        this.basicValue = basicValue;
        return this;
    }

    public AwParam withBasicValue(Consumer<AwParamBasicValue> basicValueSetter) {
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

    public AwParam withBasicValueList(List<AwParamBasicValue> basicValueList) {
        this.basicValueList = basicValueList;
        return this;
    }

    public AwParam addBasicValueListItem(AwParamBasicValue basicValueListItem) {
        if (this.basicValueList == null) {
            this.basicValueList = new ArrayList<>();
        }
        this.basicValueList.add(basicValueListItem);
        return this;
    }

    public AwParam withBasicValueList(Consumer<List<AwParamBasicValue>> basicValueListSetter) {
        if (this.basicValueList == null) {
            this.basicValueList = new ArrayList<>();
        }
        basicValueListSetter.accept(this.basicValueList);
        return this;
    }

    /**
     * valueType为1时该值有效
     * @return basicValueList
     */
    public List<AwParamBasicValue> getBasicValueList() {
        return basicValueList;
    }

    public void setBasicValueList(List<AwParamBasicValue> basicValueList) {
        this.basicValueList = basicValueList;
    }

    public AwParam withCustomBody(String customBody) {
        this.customBody = customBody;
        return this;
    }

    /**
     * 自定义requestBody内容,inType为2且isBodyCustom为1时有效
     * @return customBody
     */
    public String getCustomBody() {
        return customBody;
    }

    public void setCustomBody(String customBody) {
        this.customBody = customBody;
    }

    public AwParam withDefaultValue(String defaultValue) {
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

    public AwParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * aw参数描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AwParam withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 是否禁用 只有非必需参数才能被禁用
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public AwParam withDropDownValue(String dropDownValue) {
        this.dropDownValue = dropDownValue;
        return this;
    }

    /**
     * 用于存储下拉菜单的值
     * @return dropDownValue
     */
    public String getDropDownValue() {
        return dropDownValue;
    }

    public void setDropDownValue(String dropDownValue) {
        this.dropDownValue = dropDownValue;
    }

    public AwParam withEnumType(String enumType) {
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

    public AwParam withEnumTypeSelected(String enumTypeSelected) {
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

    public AwParam withFormat(String format) {
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

    public AwParam withInType(Integer inType) {
        this.inType = inType;
        return this;
    }

    /**
     * rest接口输入参数类型 0-query 1-path 2-body 3-header 4-formdata 5-config
     * @return inType
     */
    public Integer getInType() {
        return inType;
    }

    public void setInType(Integer inType) {
        this.inType = inType;
    }

    public AwParam withIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
        return this;
    }

    /**
     * 是否是被选中参数
     * @return isChecked
     */
    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public AwParam withIsBigField(Boolean isBigField) {
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

    public AwParam withIsBodyCustom(Integer isBodyCustom) {
        this.isBodyCustom = isBodyCustom;
        return this;
    }

    /**
     * requestBody是否自定义，inType为2时有效。0-非自定义，用原有逻辑；1-自定义body,requestBody直接使用字段customBody
     * @return isBodyCustom
     */
    public Integer getIsBodyCustom() {
        return isBodyCustom;
    }

    public void setIsBodyCustom(Integer isBodyCustom) {
        this.isBodyCustom = isBodyCustom;
    }

    public AwParam withIsContractParam(Integer isContractParam) {
        this.isContractParam = isContractParam;
        return this;
    }

    /**
     * 是否是契约AW 0-否；1-yes
     * @return isContractParam
     */
    public Integer getIsContractParam() {
        return isContractParam;
    }

    public void setIsContractParam(Integer isContractParam) {
        this.isContractParam = isContractParam;
    }

    public AwParam withIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
        return this;
    }

    /**
     * 是否敏感参数，0  是，  1 不是
     * @return isSensitive
     */
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    public void setIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
    }

    public AwParam withItem(ItemParam item) {
        this.item = item;
        return this;
    }

    public AwParam withItem(Consumer<ItemParam> itemSetter) {
        if (this.item == null) {
            this.item = new ItemParam();
            itemSetter.accept(this.item);
        }

        return this;
    }

    /**
     * Get item
     * @return item
     */
    public ItemParam getItem() {
        return item;
    }

    public void setItem(ItemParam item) {
        this.item = item;
    }

    public AwParam withMaxItems(Integer maxItems) {
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

    public AwParam withMaxLength(Long maxLength) {
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

    public AwParam withMaximum(Number maximum) {
        this.maximum = maximum;
        return this;
    }

    public AwParam withMaximum(Consumer<Number> maximumSetter) {
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

    public AwParam withMinItems(Integer minItems) {
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

    public AwParam withMinLength(Long minLength) {
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

    public AwParam withMinimum(Number minimum) {
        this.minimum = minimum;
        return this;
    }

    public AwParam withMinimum(Consumer<Number> minimumSetter) {
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

    public AwParam withMock(MockInfo mock) {
        this.mock = mock;
        return this;
    }

    public AwParam withMock(Consumer<MockInfo> mockSetter) {
        if (this.mock == null) {
            this.mock = new MockInfo();
            mockSetter.accept(this.mock);
        }

        return this;
    }

    /**
     * Get mock
     * @return mock
     */
    public MockInfo getMock() {
        return mock;
    }

    public void setMock(MockInfo mock) {
        this.mock = mock;
    }

    public AwParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AwParam withObjectValue(List<AwParam> objectValue) {
        this.objectValue = objectValue;
        return this;
    }

    public AwParam addObjectValueItem(AwParam objectValueItem) {
        if (this.objectValue == null) {
            this.objectValue = new ArrayList<>();
        }
        this.objectValue.add(objectValueItem);
        return this;
    }

    public AwParam withObjectValue(Consumer<List<AwParam>> objectValueSetter) {
        if (this.objectValue == null) {
            this.objectValue = new ArrayList<>();
        }
        objectValueSetter.accept(this.objectValue);
        return this;
    }

    /**
     * valueType为2时该值有效。valueType为3时，该值用来表示数组中单个结构体
     * @return objectValue
     */
    public List<AwParam> getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(List<AwParam> objectValue) {
        this.objectValue = objectValue;
    }

    public AwParam withObjectValueList(List<List<AwParam>> objectValueList) {
        this.objectValueList = objectValueList;
        return this;
    }

    public AwParam addObjectValueListItem(List<AwParam> objectValueListItem) {
        if (this.objectValueList == null) {
            this.objectValueList = new ArrayList<>();
        }
        this.objectValueList.add(objectValueListItem);
        return this;
    }

    public AwParam withObjectValueList(Consumer<List<List<AwParam>>> objectValueListSetter) {
        if (this.objectValueList == null) {
            this.objectValueList = new ArrayList<>();
        }
        objectValueListSetter.accept(this.objectValueList);
        return this;
    }

    /**
     * valueType为3时该值有效
     * @return objectValueList
     */
    public List<List<AwParam>> getObjectValueList() {
        return objectValueList;
    }

    public void setObjectValueList(List<List<AwParam>> objectValueList) {
        this.objectValueList = objectValueList;
    }

    public AwParam withPattern(String pattern) {
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

    public AwParam withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必需参数
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public AwParam withType(String type) {
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

    public AwParam withValidateRule(ValidateRule validateRule) {
        this.validateRule = validateRule;
        return this;
    }

    public AwParam withValidateRule(Consumer<ValidateRule> validateRuleSetter) {
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

    public AwParam withValueType(Integer valueType) {
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

    public AwParam withXChoiceValue(String xChoiceValue) {
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
        AwParam that = (AwParam) obj;
        return Objects.equals(this.basicValue, that.basicValue)
            && Objects.equals(this.basicValueList, that.basicValueList)
            && Objects.equals(this.customBody, that.customBody) && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.description, that.description) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.dropDownValue, that.dropDownValue) && Objects.equals(this.enumType, that.enumType)
            && Objects.equals(this.enumTypeSelected, that.enumTypeSelected) && Objects.equals(this.format, that.format)
            && Objects.equals(this.inType, that.inType) && Objects.equals(this.isChecked, that.isChecked)
            && Objects.equals(this.isBigField, that.isBigField) && Objects.equals(this.isBodyCustom, that.isBodyCustom)
            && Objects.equals(this.isContractParam, that.isContractParam)
            && Objects.equals(this.isSensitive, that.isSensitive) && Objects.equals(this.item, that.item)
            && Objects.equals(this.maxItems, that.maxItems) && Objects.equals(this.maxLength, that.maxLength)
            && Objects.equals(this.maximum, that.maximum) && Objects.equals(this.minItems, that.minItems)
            && Objects.equals(this.minLength, that.minLength) && Objects.equals(this.minimum, that.minimum)
            && Objects.equals(this.mock, that.mock) && Objects.equals(this.name, that.name)
            && Objects.equals(this.objectValue, that.objectValue)
            && Objects.equals(this.objectValueList, that.objectValueList) && Objects.equals(this.pattern, that.pattern)
            && Objects.equals(this.required, that.required) && Objects.equals(this.type, that.type)
            && Objects.equals(this.validateRule, that.validateRule) && Objects.equals(this.valueType, that.valueType)
            && Objects.equals(this.xChoiceValue, that.xChoiceValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicValue,
            basicValueList,
            customBody,
            defaultValue,
            description,
            disabled,
            dropDownValue,
            enumType,
            enumTypeSelected,
            format,
            inType,
            isChecked,
            isBigField,
            isBodyCustom,
            isContractParam,
            isSensitive,
            item,
            maxItems,
            maxLength,
            maximum,
            minItems,
            minLength,
            minimum,
            mock,
            name,
            objectValue,
            objectValueList,
            pattern,
            required,
            type,
            validateRule,
            valueType,
            xChoiceValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AwParam {\n");
        sb.append("    basicValue: ").append(toIndentedString(basicValue)).append("\n");
        sb.append("    basicValueList: ").append(toIndentedString(basicValueList)).append("\n");
        sb.append("    customBody: ").append(toIndentedString(customBody)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    dropDownValue: ").append(toIndentedString(dropDownValue)).append("\n");
        sb.append("    enumType: ").append(toIndentedString(enumType)).append("\n");
        sb.append("    enumTypeSelected: ").append(toIndentedString(enumTypeSelected)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    inType: ").append(toIndentedString(inType)).append("\n");
        sb.append("    isChecked: ").append(toIndentedString(isChecked)).append("\n");
        sb.append("    isBigField: ").append(toIndentedString(isBigField)).append("\n");
        sb.append("    isBodyCustom: ").append(toIndentedString(isBodyCustom)).append("\n");
        sb.append("    isContractParam: ").append(toIndentedString(isContractParam)).append("\n");
        sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
        sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
        sb.append("    mock: ").append(toIndentedString(mock)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objectValue: ").append(toIndentedString(objectValue)).append("\n");
        sb.append("    objectValueList: ").append(toIndentedString(objectValueList)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
