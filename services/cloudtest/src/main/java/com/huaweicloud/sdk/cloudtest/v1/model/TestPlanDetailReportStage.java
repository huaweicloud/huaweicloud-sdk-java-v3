package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试计划完成阶段信息
 */
public class TestPlanDetailReportStage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_complete_rate")

    private String caseCompleteRate;

    public TestPlanDetailReportStage withCaseCompleteRate(String caseCompleteRate) {
        this.caseCompleteRate = caseCompleteRate;
        return this;
    }

    /**
     * 用例完成率,按状态统计
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
        TestPlanDetailReportStage that = (TestPlanDetailReportStage) obj;
        return Objects.equals(this.caseCompleteRate, that.caseCompleteRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseCompleteRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanDetailReportStage {\n");
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
