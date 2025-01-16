package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库配置参数。
 */
public class DbParameter {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_modifiable")

    private String isModifiable;

    public DbParameter withParamName(String paramName) {
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

    public DbParameter withDataType(String dataType) {
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

    public DbParameter withDefaultValue(String defaultValue) {
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

    public DbParameter withValueRange(String valueRange) {
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

    public DbParameter withDescription(String description) {
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

    public DbParameter withIsModifiable(String isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * **参数解释**：  新增子任务的场景，用于区分库参数是否支持修改。  **取值范围**：  不涉及。
     * @return isModifiable
     */
    public String getIsModifiable() {
        return isModifiable;
    }

    public void setIsModifiable(String isModifiable) {
        this.isModifiable = isModifiable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbParameter that = (DbParameter) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.valueRange, that.valueRange)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.isModifiable, that.isModifiable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, dataType, defaultValue, valueRange, description, isModifiable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbParameter {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isModifiable: ").append(toIndentedString(isModifiable)).append("\n");
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
