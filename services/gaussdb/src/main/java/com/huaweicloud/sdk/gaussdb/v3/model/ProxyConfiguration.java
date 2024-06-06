package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProxyConfiguration
 */
public class ProxyConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elem_type")

    private String elemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ProxyConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProxyConfiguration withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 参数数据类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ProxyConfiguration withElemType(String elemType) {
        this.elemType = elemType;
        return this;
    }

    /**
     * 参数父标签类型
     * @return elemType
     */
    public String getElemType() {
        return elemType;
    }

    public void setElemType(String elemType) {
        this.elemType = elemType;
    }

    public ProxyConfiguration withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 取值范围
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public ProxyConfiguration withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数默认值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ProxyConfiguration withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述
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
        ProxyConfiguration that = (ProxyConfiguration) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.elemType, that.elemType) && Objects.equals(this.valueRange, that.valueRange)
            && Objects.equals(this.value, that.value) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType, elemType, valueRange, value, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyConfiguration {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    elemType: ").append(toIndentedString(elemType)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
