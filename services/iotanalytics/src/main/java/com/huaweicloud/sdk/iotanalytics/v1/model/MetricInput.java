package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 定义指标计算查询的输入资产属性
 */
public class MetricInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    @JacksonXmlProperty(localName = "property_name")

    private String propertyName;

    public MetricInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指标计算表达式的入参名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetricInput withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * 入参所对应的资产属性名称
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricInput metricInput = (MetricInput) o;
        return Objects.equals(this.name, metricInput.name)
            && Objects.equals(this.propertyName, metricInput.propertyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, propertyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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
