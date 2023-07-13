package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试计划执行阶段信息
 */
public class TestPlanDetailExecuteStage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_count")

    private Integer defectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_defect_count")

    private Integer completedDefectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_pass_rate")

    private String casePassRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_case_count")

    private Integer executedCaseCount;

    public TestPlanDetailExecuteStage withDefectCount(Integer defectCount) {
        this.defectCount = defectCount;
        return this;
    }

    /**
     * 缺陷个数
     * @return defectCount
     */
    public Integer getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(Integer defectCount) {
        this.defectCount = defectCount;
    }

    public TestPlanDetailExecuteStage withCompletedDefectCount(Integer completedDefectCount) {
        this.completedDefectCount = completedDefectCount;
        return this;
    }

    /**
     * 已完成缺陷个数
     * @return completedDefectCount
     */
    public Integer getCompletedDefectCount() {
        return completedDefectCount;
    }

    public void setCompletedDefectCount(Integer completedDefectCount) {
        this.completedDefectCount = completedDefectCount;
    }

    public TestPlanDetailExecuteStage withCasePassRate(String casePassRate) {
        this.casePassRate = casePassRate;
        return this;
    }

    /**
     * 用例通过率,按用例结果计算
     * @return casePassRate
     */
    public String getCasePassRate() {
        return casePassRate;
    }

    public void setCasePassRate(String casePassRate) {
        this.casePassRate = casePassRate;
    }

    public TestPlanDetailExecuteStage withExecutedCaseCount(Integer executedCaseCount) {
        this.executedCaseCount = executedCaseCount;
        return this;
    }

    /**
     * 已执行用例数, 按用例状态统计
     * @return executedCaseCount
     */
    public Integer getExecutedCaseCount() {
        return executedCaseCount;
    }

    public void setExecutedCaseCount(Integer executedCaseCount) {
        this.executedCaseCount = executedCaseCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestPlanDetailExecuteStage that = (TestPlanDetailExecuteStage) obj;
        return Objects.equals(this.defectCount, that.defectCount)
            && Objects.equals(this.completedDefectCount, that.completedDefectCount)
            && Objects.equals(this.casePassRate, that.casePassRate)
            && Objects.equals(this.executedCaseCount, that.executedCaseCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defectCount, completedDefectCount, casePassRate, executedCaseCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanDetailExecuteStage {\n");
        sb.append("    defectCount: ").append(toIndentedString(defectCount)).append("\n");
        sb.append("    completedDefectCount: ").append(toIndentedString(completedDefectCount)).append("\n");
        sb.append("    casePassRate: ").append(toIndentedString(casePassRate)).append("\n");
        sb.append("    executedCaseCount: ").append(toIndentedString(executedCaseCount)).append("\n");
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
