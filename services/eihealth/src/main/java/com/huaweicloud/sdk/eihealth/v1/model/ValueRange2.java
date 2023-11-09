package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数值值域区间定义
 */
public class ValueRange2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower")

    private Float lower;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upper")

    private Float upper;

    public ValueRange2 withLower(Float lower) {
        this.lower = lower;
        return this;
    }

    /**
     * 值域下限
     * @return lower
     */
    public Float getLower() {
        return lower;
    }

    public void setLower(Float lower) {
        this.lower = lower;
    }

    public ValueRange2 withUpper(Float upper) {
        this.upper = upper;
        return this;
    }

    /**
     * 值域上限
     * @return upper
     */
    public Float getUpper() {
        return upper;
    }

    public void setUpper(Float upper) {
        this.upper = upper;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValueRange2 that = (ValueRange2) obj;
        return Objects.equals(this.lower, that.lower) && Objects.equals(this.upper, that.upper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lower, upper);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueRange2 {\n");
        sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
        sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
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
