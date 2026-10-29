package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Division
 */
public class Division {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_value")

    private BigDecimal beginValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_value")

    private BigDecimal endValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_unit")

    private Integer beginUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_unit")

    private Integer endUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_price")

    private String officialPrice;

    public Division withBeginValue(BigDecimal beginValue) {
        this.beginValue = beginValue;
        return this;
    }

    /**
     * 阶梯起始值
     * @return beginValue
     */
    public BigDecimal getBeginValue() {
        return beginValue;
    }

    public void setBeginValue(BigDecimal beginValue) {
        this.beginValue = beginValue;
    }

    public Division withEndValue(BigDecimal endValue) {
        this.endValue = endValue;
        return this;
    }

    /**
     * 阶梯结束值
     * @return endValue
     */
    public BigDecimal getEndValue() {
        return endValue;
    }

    public void setEndValue(BigDecimal endValue) {
        this.endValue = endValue;
    }

    public Division withBeginUnit(Integer beginUnit) {
        this.beginUnit = beginUnit;
        return this;
    }

    /**
     * 阶梯起始单位
     * @return beginUnit
     */
    public Integer getBeginUnit() {
        return beginUnit;
    }

    public void setBeginUnit(Integer beginUnit) {
        this.beginUnit = beginUnit;
    }

    public Division withEndUnit(Integer endUnit) {
        this.endUnit = endUnit;
        return this;
    }

    /**
     * 阶梯结束单位
     * @return endUnit
     */
    public Integer getEndUnit() {
        return endUnit;
    }

    public void setEndUnit(Integer endUnit) {
        this.endUnit = endUnit;
    }

    public Division withOfficialPrice(String officialPrice) {
        this.officialPrice = officialPrice;
        return this;
    }

    /**
     * 阶梯官网价
     * @return officialPrice
     */
    public String getOfficialPrice() {
        return officialPrice;
    }

    public void setOfficialPrice(String officialPrice) {
        this.officialPrice = officialPrice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Division that = (Division) obj;
        return Objects.equals(this.beginValue, that.beginValue) && Objects.equals(this.endValue, that.endValue)
            && Objects.equals(this.beginUnit, that.beginUnit) && Objects.equals(this.endUnit, that.endUnit)
            && Objects.equals(this.officialPrice, that.officialPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginValue, endValue, beginUnit, endUnit, officialPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Division {\n");
        sb.append("    beginValue: ").append(toIndentedString(beginValue)).append("\n");
        sb.append("    endValue: ").append(toIndentedString(endValue)).append("\n");
        sb.append("    beginUnit: ").append(toIndentedString(beginUnit)).append("\n");
        sb.append("    endUnit: ").append(toIndentedString(endUnit)).append("\n");
        sb.append("    officialPrice: ").append(toIndentedString(officialPrice)).append("\n");
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
