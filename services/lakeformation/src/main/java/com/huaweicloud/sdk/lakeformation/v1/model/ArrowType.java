package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Arrow的类型定义，支持简单类型和复杂类型，遵循Apache Arrow类型系统标准。
 */
public class ArrowType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bit_width")

    private Integer bitWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_signed")

    private Boolean isSigned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precision")

    private Integer precision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale")

    private Integer scale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_size")

    private Integer listSize;

    public ArrowType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Arrow类型名称，如Int, Float, Utf8, Bool, Date, Timestamp, List, Struct等。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrowType withBitWidth(Integer bitWidth) {
        this.bitWidth = bitWidth;
        return this;
    }

    /**
     * 类型的位宽，适用于Int、Float等数值类型。如Int32的bit_width为32。
     * minimum: 1
     * maximum: 256
     * @return bitWidth
     */
    public Integer getBitWidth() {
        return bitWidth;
    }

    public void setBitWidth(Integer bitWidth) {
        this.bitWidth = bitWidth;
    }

    public ArrowType withIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
        return this;
    }

    /**
     * 是否为有符号类型，适用于整数类型。
     * @return isSigned
     */
    public Boolean getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
    }

    public ArrowType withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * Decimal类型的精度。
     * minimum: 1
     * maximum: 76
     * @return precision
     */
    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public ArrowType withScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Decimal类型的标度。
     * minimum: 0
     * maximum: 76
     * @return scale
     */
    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public ArrowType withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 时间单位，适用于Date、Timestamp、Time类型。如SECOND、MILLISECOND、MICROSECOND、NANOSECOND。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ArrowType withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 时区信息，适用于Timestamp类型。
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ArrowType withListSize(Integer listSize) {
        this.listSize = listSize;
        return this;
    }

    /**
     * FixedSizeList类型的列表大小，表示固定大小列表中的元素数量。
     * minimum: 0
     * maximum: 2147483647
     * @return listSize
     */
    public Integer getListSize() {
        return listSize;
    }

    public void setListSize(Integer listSize) {
        this.listSize = listSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArrowType that = (ArrowType) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.bitWidth, that.bitWidth)
            && Objects.equals(this.isSigned, that.isSigned) && Objects.equals(this.precision, that.precision)
            && Objects.equals(this.scale, that.scale) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.timezone, that.timezone) && Objects.equals(this.listSize, that.listSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bitWidth, isSigned, precision, scale, unit, timezone, listSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArrowType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    bitWidth: ").append(toIndentedString(bitWidth)).append("\n");
        sb.append("    isSigned: ").append(toIndentedString(isSigned)).append("\n");
        sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    listSize: ").append(toIndentedString(listSize)).append("\n");
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
