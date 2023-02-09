package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Decimal
 */
public class Decimal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale")

    private Integer scale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unscaled")

    private byte[] unscaled;

    public Decimal withScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    /**
     * 整数部分
     * @return scale
     */
    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Decimal withUnscaled(byte[] unscaled) {
        this.unscaled = unscaled;
        return this;
    }

    /**
     * 小数部分
     * @return unscaled
     */
    public byte[] getUnscaled() {
        return unscaled;
    }

    public void setUnscaled(byte[] unscaled) {
        this.unscaled = unscaled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Decimal decimal = (Decimal) o;
        return Objects.equals(this.scale, decimal.scale) && Objects.equals(this.unscaled, decimal.unscaled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scale, unscaled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Decimal {\n");
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
        sb.append("    unscaled: ").append(toIndentedString(unscaled)).append("\n");
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
