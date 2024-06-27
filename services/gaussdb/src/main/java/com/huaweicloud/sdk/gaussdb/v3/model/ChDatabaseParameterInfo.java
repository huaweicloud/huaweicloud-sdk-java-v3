package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库配置参数。
 */
public class ChDatabaseParameterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ChDatabaseParameterInfo withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 参数名称。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ChDatabaseParameterInfo withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 参数类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ChDatabaseParameterInfo withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 参数默认值。
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ChDatabaseParameterInfo withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 参数取值范围。
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public ChDatabaseParameterInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChDatabaseParameterInfo that = (ChDatabaseParameterInfo) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.valueRange, that.valueRange)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, dataType, defaultValue, valueRange, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChDatabaseParameterInfo {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
