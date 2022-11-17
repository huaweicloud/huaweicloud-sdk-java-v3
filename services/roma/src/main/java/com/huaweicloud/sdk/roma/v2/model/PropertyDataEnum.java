package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据类型为boolean时的布尔值
 */
public class PropertyDataEnum {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bool_false")

    private String boolFalse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bool_true")

    private String boolTrue;

    public PropertyDataEnum withBoolFalse(String boolFalse) {
        this.boolFalse = boolFalse;
        return this;
    }

    /**
     * boolean枚举值为0时对应的值
     * @return boolFalse
     */
    public String getBoolFalse() {
        return boolFalse;
    }

    public void setBoolFalse(String boolFalse) {
        this.boolFalse = boolFalse;
    }

    public PropertyDataEnum withBoolTrue(String boolTrue) {
        this.boolTrue = boolTrue;
        return this;
    }

    /**
     * boolean枚举值为1时对应的值
     * @return boolTrue
     */
    public String getBoolTrue() {
        return boolTrue;
    }

    public void setBoolTrue(String boolTrue) {
        this.boolTrue = boolTrue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyDataEnum propertyDataEnum = (PropertyDataEnum) o;
        return Objects.equals(this.boolFalse, propertyDataEnum.boolFalse)
            && Objects.equals(this.boolTrue, propertyDataEnum.boolTrue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boolFalse, boolTrue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyDataEnum {\n");
        sb.append("    boolFalse: ").append(toIndentedString(boolFalse)).append("\n");
        sb.append("    boolTrue: ").append(toIndentedString(boolTrue)).append("\n");
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
