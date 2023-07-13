package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IntegerRange
 */
public class IntegerRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desire")

    private Integer desire;

    public IntegerRange withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 伸缩组最大实例数
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
     * 伸缩组最小实例数
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public IntegerRange withDesire(Integer desire) {
        this.desire = desire;
        return this;
    }

    /**
     * 伸缩组期望实例数
     * @return desire
     */
    public Integer getDesire() {
        return desire;
    }

    public void setDesire(Integer desire) {
        this.desire = desire;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntegerRange that = (IntegerRange) obj;
        return Objects.equals(this.max, that.max) && Objects.equals(this.min, that.min)
            && Objects.equals(this.desire, that.desire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min, desire);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegerRange {\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    desire: ").append(toIndentedString(desire)).append("\n");
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
