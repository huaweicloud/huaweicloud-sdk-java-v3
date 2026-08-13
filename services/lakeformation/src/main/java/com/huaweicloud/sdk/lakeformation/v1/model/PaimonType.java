package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Paimon的类型定义，支持简单类型和复杂类型，遵循Paimon 类型系统标准。
 */
public class PaimonType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precision")

    private Integer precision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale")

    private Integer scale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

    public PaimonType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Paimon类型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaimonType withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 精度，适用于 DECIMAL(p,s) 的 p（1-38），以及 TIME(p)/TIMESTAMP(p)/TIMESTAMP_LTZ(p) 的小数秒精度 p（0-9）。
     * minimum: 0
     * maximum: 38
     * @return precision
     */
    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public PaimonType withScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    /**
     * 标度，适用于 DECIMAL(p,s) 的 s（0-precision）。
     * minimum: 0
     * maximum: 128
     * @return scale
     */
    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public PaimonType withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * CHAR(n)、VARCHAR(n)、BINARY(n)、VARBINARY(n)的长度（n）
     * minimum: 1
     * maximum: 2147483647
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaimonType that = (PaimonType) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.precision, that.precision)
            && Objects.equals(this.scale, that.scale) && Objects.equals(this.length, that.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, precision, scale, length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaimonType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
