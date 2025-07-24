package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ShareTypesAttributionCapacity
 */
public class ShareTypesAttributionCapacity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private BigDecimal step;

    public ShareTypesAttributionCapacity withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大容量
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public ShareTypesAttributionCapacity withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 最小容量
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public ShareTypesAttributionCapacity withStep(BigDecimal step) {
        this.step = step;
        return this;
    }

    /**
     * 容量梯度
     * @return step
     */
    public BigDecimal getStep() {
        return step;
    }

    public void setStep(BigDecimal step) {
        this.step = step;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareTypesAttributionCapacity that = (ShareTypesAttributionCapacity) obj;
        return Objects.equals(this.max, that.max) && Objects.equals(this.min, that.min)
            && Objects.equals(this.step, that.step);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min, step);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareTypesAttributionCapacity {\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
