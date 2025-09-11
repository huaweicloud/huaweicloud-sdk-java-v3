package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OperationStatisticsBean
 */
public class OperationStatisticsBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_operation_num")

    private Long riskOperationNum;

    public OperationStatisticsBean withPeriod(String period) {
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

    public OperationStatisticsBean withRiskOperationNum(Long riskOperationNum) {
        this.riskOperationNum = riskOperationNum;
        return this;
    }

    /**
     * 风险操作数量
     * @return riskOperationNum
     */
    public Long getRiskOperationNum() {
        return riskOperationNum;
    }

    public void setRiskOperationNum(Long riskOperationNum) {
        this.riskOperationNum = riskOperationNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationStatisticsBean that = (OperationStatisticsBean) obj;
        return Objects.equals(this.period, that.period) && Objects.equals(this.riskOperationNum, that.riskOperationNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, riskOperationNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationStatisticsBean {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    riskOperationNum: ").append(toIndentedString(riskOperationNum)).append("\n");
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
