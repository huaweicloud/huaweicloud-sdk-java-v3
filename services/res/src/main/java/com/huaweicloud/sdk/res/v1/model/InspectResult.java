package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * InspectResult
 */
public class InspectResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_num")

    @JacksonXmlProperty(localName = "count_num")

    private Integer countNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiplicity")

    @JacksonXmlProperty(localName = "multiplicity")

    private Double multiplicity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legal_rate")

    @JacksonXmlProperty(localName = "legal_rate")

    private Double legalRate;

    public InspectResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InspectResult withCountNum(Integer countNum) {
        this.countNum = countNum;
        return this;
    }

    /**
     * 条目数。
     * @return countNum
     */
    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    public InspectResult withMultiplicity(Double multiplicity) {
        this.multiplicity = multiplicity;
        return this;
    }

    /**
     * 重复读。
     * @return multiplicity
     */
    public Double getMultiplicity() {
        return multiplicity;
    }

    public void setMultiplicity(Double multiplicity) {
        this.multiplicity = multiplicity;
    }

    public InspectResult withLegalRate(Double legalRate) {
        this.legalRate = legalRate;
        return this;
    }

    /**
     * 合法率。
     * @return legalRate
     */
    public Double getLegalRate() {
        return legalRate;
    }

    public void setLegalRate(Double legalRate) {
        this.legalRate = legalRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InspectResult inspectResult = (InspectResult) o;
        return Objects.equals(this.type, inspectResult.type) && Objects.equals(this.countNum, inspectResult.countNum)
            && Objects.equals(this.multiplicity, inspectResult.multiplicity)
            && Objects.equals(this.legalRate, inspectResult.legalRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, countNum, multiplicity, legalRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    countNum: ").append(toIndentedString(countNum)).append("\n");
        sb.append("    multiplicity: ").append(toIndentedString(multiplicity)).append("\n");
        sb.append("    legalRate: ").append(toIndentedString(legalRate)).append("\n");
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
