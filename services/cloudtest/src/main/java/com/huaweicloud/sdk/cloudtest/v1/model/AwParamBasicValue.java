package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AwParamBasicValue
 */
public class AwParamBasicValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private String valueRange;

    public AwParamBasicValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数默认值，用例有效
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AwParamBasicValue withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 参数值范围，逻辑用例有效
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AwParamBasicValue that = (AwParamBasicValue) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.valueRange, that.valueRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, valueRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AwParamBasicValue {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
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
