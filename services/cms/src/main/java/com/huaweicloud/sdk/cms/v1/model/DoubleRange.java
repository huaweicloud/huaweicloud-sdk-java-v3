package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源取值范围，最大值最小值可取。 约束：min&lt;&#x3D;max
 */
public class DoubleRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Double max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Double min;

    public DoubleRange withMax(Double max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值：999999999.9
     * @return max
     */
    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public DoubleRange withMin(Double min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值：0
     * @return min
     */
    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
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
        DoubleRange doubleRange = (DoubleRange) o;
        return Objects.equals(this.max, doubleRange.max) && Objects.equals(this.min, doubleRange.min);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DoubleRange {\n");
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
