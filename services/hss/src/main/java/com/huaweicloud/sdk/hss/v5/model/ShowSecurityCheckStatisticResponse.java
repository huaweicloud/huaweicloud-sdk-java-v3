package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSecurityCheckStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_host_num")

    private Integer totalHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_host_num")

    private Integer riskHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk_host_num")

    private Integer highRiskHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_risk_host_num")

    private Integer mediumRiskHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risk_host_num")

    private Integer lowRiskHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "safe_host_num")

    private Integer safeHostNum;

    public ShowSecurityCheckStatisticResponse withTotalHostNum(Integer totalHostNum) {
        this.totalHostNum = totalHostNum;
        return this;
    }

    /**
     * **参数解释**: 本次体检服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalHostNum
     */
    public Integer getTotalHostNum() {
        return totalHostNum;
    }

    public void setTotalHostNum(Integer totalHostNum) {
        this.totalHostNum = totalHostNum;
    }

    public ShowSecurityCheckStatisticResponse withRiskHostNum(Integer riskHostNum) {
        this.riskHostNum = riskHostNum;
        return this;
    }

    /**
     * **参数解释**: 有安全风险的服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskHostNum
     */
    public Integer getRiskHostNum() {
        return riskHostNum;
    }

    public void setRiskHostNum(Integer riskHostNum) {
        this.riskHostNum = riskHostNum;
    }

    public ShowSecurityCheckStatisticResponse withHighRiskHostNum(Integer highRiskHostNum) {
        this.highRiskHostNum = highRiskHostNum;
        return this;
    }

    /**
     * **参数解释**: 高危风险的服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return highRiskHostNum
     */
    public Integer getHighRiskHostNum() {
        return highRiskHostNum;
    }

    public void setHighRiskHostNum(Integer highRiskHostNum) {
        this.highRiskHostNum = highRiskHostNum;
    }

    public ShowSecurityCheckStatisticResponse withMediumRiskHostNum(Integer mediumRiskHostNum) {
        this.mediumRiskHostNum = mediumRiskHostNum;
        return this;
    }

    /**
     * **参数解释**: 中危风险的服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return mediumRiskHostNum
     */
    public Integer getMediumRiskHostNum() {
        return mediumRiskHostNum;
    }

    public void setMediumRiskHostNum(Integer mediumRiskHostNum) {
        this.mediumRiskHostNum = mediumRiskHostNum;
    }

    public ShowSecurityCheckStatisticResponse withLowRiskHostNum(Integer lowRiskHostNum) {
        this.lowRiskHostNum = lowRiskHostNum;
        return this;
    }

    /**
     * **参数解释**: 低危风险的服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return lowRiskHostNum
     */
    public Integer getLowRiskHostNum() {
        return lowRiskHostNum;
    }

    public void setLowRiskHostNum(Integer lowRiskHostNum) {
        this.lowRiskHostNum = lowRiskHostNum;
    }

    public ShowSecurityCheckStatisticResponse withSafeHostNum(Integer safeHostNum) {
        this.safeHostNum = safeHostNum;
        return this;
    }

    /**
     * **参数解释**: 无风险的服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return safeHostNum
     */
    public Integer getSafeHostNum() {
        return safeHostNum;
    }

    public void setSafeHostNum(Integer safeHostNum) {
        this.safeHostNum = safeHostNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityCheckStatisticResponse that = (ShowSecurityCheckStatisticResponse) obj;
        return Objects.equals(this.totalHostNum, that.totalHostNum)
            && Objects.equals(this.riskHostNum, that.riskHostNum)
            && Objects.equals(this.highRiskHostNum, that.highRiskHostNum)
            && Objects.equals(this.mediumRiskHostNum, that.mediumRiskHostNum)
            && Objects.equals(this.lowRiskHostNum, that.lowRiskHostNum)
            && Objects.equals(this.safeHostNum, that.safeHostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalHostNum, riskHostNum, highRiskHostNum, mediumRiskHostNum, lowRiskHostNum, safeHostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityCheckStatisticResponse {\n");
        sb.append("    totalHostNum: ").append(toIndentedString(totalHostNum)).append("\n");
        sb.append("    riskHostNum: ").append(toIndentedString(riskHostNum)).append("\n");
        sb.append("    highRiskHostNum: ").append(toIndentedString(highRiskHostNum)).append("\n");
        sb.append("    mediumRiskHostNum: ").append(toIndentedString(mediumRiskHostNum)).append("\n");
        sb.append("    lowRiskHostNum: ").append(toIndentedString(lowRiskHostNum)).append("\n");
        sb.append("    safeHostNum: ").append(toIndentedString(safeHostNum)).append("\n");
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
