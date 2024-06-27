package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 报告阶段信息汇总
 */
public class ReportSummaryVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_success_rate")

    private String caseSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_complete_rate")

    private String caseCompleteRate;

    public ReportSummaryVo withCaseSuccessRate(String caseSuccessRate) {
        this.caseSuccessRate = caseSuccessRate;
        return this;
    }

    /**
     * 用例通过率
     * @return caseSuccessRate
     */
    public String getCaseSuccessRate() {
        return caseSuccessRate;
    }

    public void setCaseSuccessRate(String caseSuccessRate) {
        this.caseSuccessRate = caseSuccessRate;
    }

    public ReportSummaryVo withCaseCompleteRate(String caseCompleteRate) {
        this.caseCompleteRate = caseCompleteRate;
        return this;
    }

    /**
     * 用例完成率
     * @return caseCompleteRate
     */
    public String getCaseCompleteRate() {
        return caseCompleteRate;
    }

    public void setCaseCompleteRate(String caseCompleteRate) {
        this.caseCompleteRate = caseCompleteRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportSummaryVo that = (ReportSummaryVo) obj;
        return Objects.equals(this.caseSuccessRate, that.caseSuccessRate)
            && Objects.equals(this.caseCompleteRate, that.caseCompleteRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseSuccessRate, caseCompleteRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportSummaryVo {\n");
        sb.append("    caseSuccessRate: ").append(toIndentedString(caseSuccessRate)).append("\n");
        sb.append("    caseCompleteRate: ").append(toIndentedString(caseCompleteRate)).append("\n");
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
