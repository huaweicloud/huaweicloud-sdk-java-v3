package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RawValue
 */
public class RawValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    @JacksonXmlProperty(localName = "property_name")

    private String propertyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    @JacksonXmlProperty(localName = "values")

    private List<Object> values = null;

    public RawValue withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * 属性名称
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public RawValue withValues(List<Object> values) {
        this.values = values;
        return this;
    }

    public RawValue addValuesItem(Object valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public RawValue withValues(Consumer<List<Object>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 资产属性的历史值序列，示例：[1,2]
     * @return values
     */
    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RawValue rawValue = (RawValue) o;
        return Objects.equals(this.propertyName, rawValue.propertyName) && Objects.equals(this.values, rawValue.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyName, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RawValue {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
