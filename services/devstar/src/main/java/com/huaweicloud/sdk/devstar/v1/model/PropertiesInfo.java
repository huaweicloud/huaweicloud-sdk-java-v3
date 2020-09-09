package com.huaweicloud.sdk.devstar.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PropertiesInfo
 */
public class PropertiesInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="defaultValue")
    
    private String defaultValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="helpText")
    
    private String helpText;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readOnly")
    
    private Boolean readOnly;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="required")
    
    private Boolean required;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regType")
    
    private String regType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regPattern")
    
    private String regPattern;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regTip")
    
    private String regTip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isShow")
    
    private Boolean isShow;

    public PropertiesInfo withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PropertiesInfo withDefaultValue(String defaultValue) {
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

    public PropertiesInfo withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 模板的描述信息
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public PropertiesInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型 txet 或 select
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PropertiesInfo withHelpText(String helpText) {
        this.helpText = helpText;
        return this;
    }

    


    /**
     * 提示信息
     * @return helpText
     */
    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public PropertiesInfo withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    


    /**
     * 是否只读
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public PropertiesInfo withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    


    /**
     * 是否必填
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public PropertiesInfo withRegType(String regType) {
        this.regType = regType;
        return this;
    }

    


    /**
     * 正则校验类型
     * @return regType
     */
    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public PropertiesInfo withRegPattern(String regPattern) {
        this.regPattern = regPattern;
        return this;
    }

    


    /**
     * 正则表达式
     * @return regPattern
     */
    public String getRegPattern() {
        return regPattern;
    }

    public void setRegPattern(String regPattern) {
        this.regPattern = regPattern;
    }

    public PropertiesInfo withRegTip(String regTip) {
        this.regTip = regTip;
        return this;
    }

    


    /**
     * 正则提示信息
     * @return regTip
     */
    public String getRegTip() {
        return regTip;
    }

    public void setRegTip(String regTip) {
        this.regTip = regTip;
    }

    public PropertiesInfo withIsShow(Boolean isShow) {
        this.isShow = isShow;
        return this;
    }

    


    /**
     * 是否显示
     * @return isShow
     */
    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertiesInfo propertiesInfo = (PropertiesInfo) o;
        return Objects.equals(this.key, propertiesInfo.key) &&
            Objects.equals(this.defaultValue, propertiesInfo.defaultValue) &&
            Objects.equals(this.label, propertiesInfo.label) &&
            Objects.equals(this.type, propertiesInfo.type) &&
            Objects.equals(this.helpText, propertiesInfo.helpText) &&
            Objects.equals(this.readOnly, propertiesInfo.readOnly) &&
            Objects.equals(this.required, propertiesInfo.required) &&
            Objects.equals(this.regType, propertiesInfo.regType) &&
            Objects.equals(this.regPattern, propertiesInfo.regPattern) &&
            Objects.equals(this.regTip, propertiesInfo.regTip) &&
            Objects.equals(this.isShow, propertiesInfo.isShow);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, defaultValue, label, type, helpText, readOnly, required, regType, regPattern, regTip, isShow);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertiesInfo {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    regType: ").append(toIndentedString(regType)).append("\n");
        sb.append("    regPattern: ").append(toIndentedString(regPattern)).append("\n");
        sb.append("    regTip: ").append(toIndentedString(regTip)).append("\n");
        sb.append("    isShow: ").append(toIndentedString(isShow)).append("\n");
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

