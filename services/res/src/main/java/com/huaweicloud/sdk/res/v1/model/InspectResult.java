package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InspectResult
 */
public class InspectResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_num")

    private Integer countNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiplicity")

    private Double multiplicity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legal_rate")

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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectResult that = (InspectResult) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.countNum, that.countNum)
            && Objects.equals(this.multiplicity, that.multiplicity) && Objects.equals(this.legalRate, that.legalRate);
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
