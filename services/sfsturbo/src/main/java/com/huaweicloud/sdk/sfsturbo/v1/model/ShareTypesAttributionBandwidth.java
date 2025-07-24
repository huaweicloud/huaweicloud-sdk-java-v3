package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ShareTypesAttributionBandwidth
 */
public class ShareTypesAttributionBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "density")

    private BigDecimal density;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base")

    private Integer base;

    public ShareTypesAttributionBandwidth withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大带宽
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public ShareTypesAttributionBandwidth withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 最小带宽
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public ShareTypesAttributionBandwidth withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * 带宽梯度
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public ShareTypesAttributionBandwidth withDensity(BigDecimal density) {
        this.density = density;
        return this;
    }

    /**
     * 带宽密度
     * @return density
     */
    public BigDecimal getDensity() {
        return density;
    }

    public void setDensity(BigDecimal density) {
        this.density = density;
    }

    public ShareTypesAttributionBandwidth withBase(Integer base) {
        this.base = base;
        return this;
    }

    /**
     * 基础带宽
     * @return base
     */
    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareTypesAttributionBandwidth that = (ShareTypesAttributionBandwidth) obj;
        return Objects.equals(this.max, that.max) && Objects.equals(this.min, that.min)
            && Objects.equals(this.step, that.step) && Objects.equals(this.density, that.density)
            && Objects.equals(this.base, that.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min, step, density, base);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareTypesAttributionBandwidth {\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    density: ").append(toIndentedString(density)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
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
