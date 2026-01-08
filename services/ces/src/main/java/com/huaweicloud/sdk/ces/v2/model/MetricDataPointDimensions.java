package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 资源维度 
 */
public class MetricDataPointDimensions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_value")

    private String originValue;

    public MetricDataPointDimensions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 资源维度名称 **取值范围**： 最小长度1，最大长度32 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetricDataPointDimensions withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 资源维度值 **取值范围**： 最小长度1，最大长度256 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MetricDataPointDimensions withOriginValue(String originValue) {
        this.originValue = originValue;
        return this;
    }

    /**
     * **参数解释**： 实际维度信息。 **取值范围**： 字符串长度在 1 到 1024 之间。 
     * @return originValue
     */
    public String getOriginValue() {
        return originValue;
    }

    public void setOriginValue(String originValue) {
        this.originValue = originValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricDataPointDimensions that = (MetricDataPointDimensions) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.originValue, that.originValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, originValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataPointDimensions {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    originValue: ").append(toIndentedString(originValue)).append("\n");
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
