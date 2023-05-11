package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 数值值域区间定义
 */
public class ValueRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower")

    private BigDecimal lower;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower_inclusive")

    private Boolean lowerInclusive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upper")

    private BigDecimal upper;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upper_inclusive")

    private Boolean upperInclusive;

    public ValueRange withLower(BigDecimal lower) {
        this.lower = lower;
        return this;
    }

    /**
     * 值域下限
     * @return lower
     */
    public BigDecimal getLower() {
        return lower;
    }

    public void setLower(BigDecimal lower) {
        this.lower = lower;
    }

    public ValueRange withLowerInclusive(Boolean lowerInclusive) {
        this.lowerInclusive = lowerInclusive;
        return this;
    }

    /**
     * 是否包含值域下限
     * @return lowerInclusive
     */
    public Boolean getLowerInclusive() {
        return lowerInclusive;
    }

    public void setLowerInclusive(Boolean lowerInclusive) {
        this.lowerInclusive = lowerInclusive;
    }

    public ValueRange withUpper(BigDecimal upper) {
        this.upper = upper;
        return this;
    }

    /**
     * 值域上限
     * @return upper
     */
    public BigDecimal getUpper() {
        return upper;
    }

    public void setUpper(BigDecimal upper) {
        this.upper = upper;
    }

    public ValueRange withUpperInclusive(Boolean upperInclusive) {
        this.upperInclusive = upperInclusive;
        return this;
    }

    /**
     * 是否包含值域上限
     * @return upperInclusive
     */
    public Boolean getUpperInclusive() {
        return upperInclusive;
    }

    public void setUpperInclusive(Boolean upperInclusive) {
        this.upperInclusive = upperInclusive;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueRange valueRange = (ValueRange) o;
        return Objects.equals(this.lower, valueRange.lower)
            && Objects.equals(this.lowerInclusive, valueRange.lowerInclusive)
            && Objects.equals(this.upper, valueRange.upper)
            && Objects.equals(this.upperInclusive, valueRange.upperInclusive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lower, lowerInclusive, upper, upperInclusive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueRange {\n");
        sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
        sb.append("    lowerInclusive: ").append(toIndentedString(lowerInclusive)).append("\n");
        sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
        sb.append("    upperInclusive: ").append(toIndentedString(upperInclusive)).append("\n");
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
