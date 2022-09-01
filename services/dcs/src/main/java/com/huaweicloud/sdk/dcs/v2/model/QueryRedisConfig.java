package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 实例配置项
 */
public class QueryRedisConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_value")

    @JacksonXmlProperty(localName = "param_value")

    private String paramValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    @JacksonXmlProperty(localName = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    @JacksonXmlProperty(localName = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    @JacksonXmlProperty(localName = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    @JacksonXmlProperty(localName = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_id")

    @JacksonXmlProperty(localName = "param_id")

    private String paramId;

    public QueryRedisConfig withParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }

    /**
     * 配置参数值。
     * @return paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public QueryRedisConfig withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 配置参数的值类型。
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public QueryRedisConfig withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 配置参数的取值范围。
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public QueryRedisConfig withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 配置项的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryRedisConfig withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 配置参数的默认值。
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public QueryRedisConfig withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 配置参数名称。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public QueryRedisConfig withParamId(String paramId) {
        this.paramId = paramId;
        return this;
    }

    /**
     * 配置参数ID。
     * @return paramId
     */
    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryRedisConfig queryRedisConfig = (QueryRedisConfig) o;
        return Objects.equals(this.paramValue, queryRedisConfig.paramValue)
            && Objects.equals(this.valueType, queryRedisConfig.valueType)
            && Objects.equals(this.valueRange, queryRedisConfig.valueRange)
            && Objects.equals(this.description, queryRedisConfig.description)
            && Objects.equals(this.defaultValue, queryRedisConfig.defaultValue)
            && Objects.equals(this.paramName, queryRedisConfig.paramName)
            && Objects.equals(this.paramId, queryRedisConfig.paramId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramValue, valueType, valueRange, description, defaultValue, paramName, paramId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRedisConfig {\n");
        sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramId: ").append(toIndentedString(paramId)).append("\n");
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
