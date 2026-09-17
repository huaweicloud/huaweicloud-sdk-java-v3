package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceUsage
 */
public class ResourceUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Double total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contrast")

    private Double contrast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public ResourceUsage withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 当前使用量。
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ResourceUsage withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * 总量。
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ResourceUsage withContrast(Double contrast) {
        this.contrast = contrast;
        return this;
    }

    /**
     * 对比值。
     * @return contrast
     */
    public Double getContrast() {
        return contrast;
    }

    public void setContrast(Double contrast) {
        this.contrast = contrast;
    }

    public ResourceUsage withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceUsage that = (ResourceUsage) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.total, that.total)
            && Objects.equals(this.contrast, that.contrast) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, total, contrast, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceUsage {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    contrast: ").append(toIndentedString(contrast)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
