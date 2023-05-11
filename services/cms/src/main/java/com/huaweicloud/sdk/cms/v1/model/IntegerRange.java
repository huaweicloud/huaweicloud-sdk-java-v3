package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源取值范围，最大值最小值可取。 约束：min&lt;&#x3D;max
 */
public class IntegerRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    public IntegerRange withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值：2147483647
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public IntegerRange withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值：-2147483648
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegerRange integerRange = (IntegerRange) o;
        return Objects.equals(this.max, integerRange.max) && Objects.equals(this.min, integerRange.min);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegerRange {\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
