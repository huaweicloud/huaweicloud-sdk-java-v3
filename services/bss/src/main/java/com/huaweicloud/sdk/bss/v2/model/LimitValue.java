package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** LimitValue */
public class LimitValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value1")

    private String value1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value2")

    private String value2;

    public LimitValue withValue1(String value1) {
        this.value1 = value1;
        return this;
    }

    /** 属性值1。
     * 
     * @return value1 */
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public LimitValue withValue2(String value2) {
        this.value2 = value2;
        return this;
    }

    /** 属性值2。
     * 
     * @return value2 */
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LimitValue limitValue = (LimitValue) o;
        return Objects.equals(this.value1, limitValue.value1) && Objects.equals(this.value2, limitValue.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LimitValue {\n");
        sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
        sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
