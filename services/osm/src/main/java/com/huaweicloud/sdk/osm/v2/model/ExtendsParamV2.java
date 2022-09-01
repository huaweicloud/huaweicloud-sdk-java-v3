package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExtendsParamV2
 */
public class ExtendsParamV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tips")

    @JacksonXmlProperty(localName = "tips")

    private String tips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    @JacksonXmlProperty(localName = "required")

    private Integer required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    @JacksonXmlProperty(localName = "length")

    private Integer length;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_key")

    @JacksonXmlProperty(localName = "param_key")

    private String paramKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    @JacksonXmlProperty(localName = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type")

    @JacksonXmlProperty(localName = "param_type")

    private Integer paramType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_desc")

    @JacksonXmlProperty(localName = "param_desc")

    private String paramDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    @JacksonXmlProperty(localName = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    @JacksonXmlProperty(localName = "max_value")

    private Long maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    @JacksonXmlProperty(localName = "min_value")

    private Long minValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_item")

    @JacksonXmlProperty(localName = "select_item")

    private String selectItem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show")

    @JacksonXmlProperty(localName = "is_show")

    private Integer isShow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sensitive")

    @JacksonXmlProperty(localName = "is_sensitive")

    private Integer isSensitive;

    public ExtendsParamV2 withTips(String tips) {
        this.tips = tips;
        return this;
    }

    /**
     * 提示
     * @return tips
     */
    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public ExtendsParamV2 withRequired(Integer required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必填
     * minimum: 0
     * maximum: 1
     * @return required
     */
    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public ExtendsParamV2 withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 限制长度
     * minimum: 0
     * maximum: 65535
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public ExtendsParamV2 withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ExtendsParamV2 withParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }

    /**
     * 参数标识
     * @return paramKey
     */
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public ExtendsParamV2 withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 参数名称
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ExtendsParamV2 withParamType(Integer paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * 参数类型
     * minimum: 0
     * maximum: 10
     * @return paramType
     */
    public Integer getParamType() {
        return paramType;
    }

    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }

    public ExtendsParamV2 withParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
        return this;
    }

    /**
     * 参数描述
     * @return paramDesc
     */
    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

    public ExtendsParamV2 withDefaultValue(String defaultValue) {
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

    public ExtendsParamV2 withMaxValue(Long maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * 最大值
     * minimum: 0
     * maximum: 9223372036854775807
     * @return maxValue
     */
    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    public ExtendsParamV2 withMinValue(Long minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * 最小值
     * minimum: 0
     * maximum: 9223372036854775807
     * @return minValue
     */
    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    public ExtendsParamV2 withSelectItem(String selectItem) {
        this.selectItem = selectItem;
        return this;
    }

    /**
     * 选项值
     * @return selectItem
     */
    public String getSelectItem() {
        return selectItem;
    }

    public void setSelectItem(String selectItem) {
        this.selectItem = selectItem;
    }

    public ExtendsParamV2 withIsShow(Integer isShow) {
        this.isShow = isShow;
        return this;
    }

    /**
     * 是否展示
     * minimum: 0
     * maximum: 1
     * @return isShow
     */
    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public ExtendsParamV2 withIsSensitive(Integer isSensitive) {
        this.isSensitive = isSensitive;
        return this;
    }

    /**
     * 是否敏感
     * minimum: 0
     * maximum: 1
     * @return isSensitive
     */
    public Integer getIsSensitive() {
        return isSensitive;
    }

    public void setIsSensitive(Integer isSensitive) {
        this.isSensitive = isSensitive;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendsParamV2 extendsParamV2 = (ExtendsParamV2) o;
        return Objects.equals(this.tips, extendsParamV2.tips) && Objects.equals(this.required, extendsParamV2.required)
            && Objects.equals(this.length, extendsParamV2.length)
            && Objects.equals(this.language, extendsParamV2.language)
            && Objects.equals(this.paramKey, extendsParamV2.paramKey)
            && Objects.equals(this.paramName, extendsParamV2.paramName)
            && Objects.equals(this.paramType, extendsParamV2.paramType)
            && Objects.equals(this.paramDesc, extendsParamV2.paramDesc)
            && Objects.equals(this.defaultValue, extendsParamV2.defaultValue)
            && Objects.equals(this.maxValue, extendsParamV2.maxValue)
            && Objects.equals(this.minValue, extendsParamV2.minValue)
            && Objects.equals(this.selectItem, extendsParamV2.selectItem)
            && Objects.equals(this.isShow, extendsParamV2.isShow)
            && Objects.equals(this.isSensitive, extendsParamV2.isSensitive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tips,
            required,
            length,
            language,
            paramKey,
            paramName,
            paramType,
            paramDesc,
            defaultValue,
            maxValue,
            minValue,
            selectItem,
            isShow,
            isSensitive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendsParamV2 {\n");
        sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    paramKey: ").append(toIndentedString(paramKey)).append("\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
        sb.append("    paramDesc: ").append(toIndentedString(paramDesc)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    selectItem: ").append(toIndentedString(selectItem)).append("\n");
        sb.append("    isShow: ").append(toIndentedString(isShow)).append("\n");
        sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
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
