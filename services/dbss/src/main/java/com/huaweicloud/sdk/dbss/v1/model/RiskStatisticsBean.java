package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RiskStatisticsBean
 */
public class RiskStatisticsBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk_num")

    private Long highRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risk_num")

    private Long lowRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle_risk_num")

    private Long middleRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_risk_num")

    private Long noRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    public RiskStatisticsBean withHighRiskNum(Long highRiskNum) {
        this.highRiskNum = highRiskNum;
        return this;
    }

    /**
     * 高风险数量
     * @return highRiskNum
     */
    public Long getHighRiskNum() {
        return highRiskNum;
    }

    public void setHighRiskNum(Long highRiskNum) {
        this.highRiskNum = highRiskNum;
    }

    public RiskStatisticsBean withLowRiskNum(Long lowRiskNum) {
        this.lowRiskNum = lowRiskNum;
        return this;
    }

    /**
     * 低风险数量
     * @return lowRiskNum
     */
    public Long getLowRiskNum() {
        return lowRiskNum;
    }

    public void setLowRiskNum(Long lowRiskNum) {
        this.lowRiskNum = lowRiskNum;
    }

    public RiskStatisticsBean withMiddleRiskNum(Long middleRiskNum) {
        this.middleRiskNum = middleRiskNum;
        return this;
    }

    /**
     * 中风险数量
     * @return middleRiskNum
     */
    public Long getMiddleRiskNum() {
        return middleRiskNum;
    }

    public void setMiddleRiskNum(Long middleRiskNum) {
        this.middleRiskNum = middleRiskNum;
    }

    public RiskStatisticsBean withNoRiskNum(Long noRiskNum) {
        this.noRiskNum = noRiskNum;
        return this;
    }

    /**
     * 无风险数量
     * @return noRiskNum
     */
    public Long getNoRiskNum() {
        return noRiskNum;
    }

    public void setNoRiskNum(Long noRiskNum) {
        this.noRiskNum = noRiskNum;
    }

    public RiskStatisticsBean withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 周期
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskStatisticsBean that = (RiskStatisticsBean) obj;
        return Objects.equals(this.highRiskNum, that.highRiskNum) && Objects.equals(this.lowRiskNum, that.lowRiskNum)
            && Objects.equals(this.middleRiskNum, that.middleRiskNum) && Objects.equals(this.noRiskNum, that.noRiskNum)
            && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highRiskNum, lowRiskNum, middleRiskNum, noRiskNum, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskStatisticsBean {\n");
        sb.append("    highRiskNum: ").append(toIndentedString(highRiskNum)).append("\n");
        sb.append("    lowRiskNum: ").append(toIndentedString(lowRiskNum)).append("\n");
        sb.append("    middleRiskNum: ").append(toIndentedString(middleRiskNum)).append("\n");
        sb.append("    noRiskNum: ").append(toIndentedString(noRiskNum)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
