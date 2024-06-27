package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行阶段信息汇总
 */
public class ExecuteSummaryVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_case_num")

    private Integer executeCaseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_num")

    private Integer defectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_defect_num")

    private Integer completedDefectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_success_rate")

    private String caseSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_execution_rate")

    private String caseExecutionRate;

    public ExecuteSummaryVo withExecuteCaseNum(Integer executeCaseNum) {
        this.executeCaseNum = executeCaseNum;
        return this;
    }

    /**
     * 已执行用例数
     * @return executeCaseNum
     */
    public Integer getExecuteCaseNum() {
        return executeCaseNum;
    }

    public void setExecuteCaseNum(Integer executeCaseNum) {
        this.executeCaseNum = executeCaseNum;
    }

    public ExecuteSummaryVo withDefectNum(Integer defectNum) {
        this.defectNum = defectNum;
        return this;
    }

    /**
     * 缺陷总数
     * @return defectNum
     */
    public Integer getDefectNum() {
        return defectNum;
    }

    public void setDefectNum(Integer defectNum) {
        this.defectNum = defectNum;
    }

    public ExecuteSummaryVo withCompletedDefectNum(Integer completedDefectNum) {
        this.completedDefectNum = completedDefectNum;
        return this;
    }

    /**
     * 已完成缺陷数
     * @return completedDefectNum
     */
    public Integer getCompletedDefectNum() {
        return completedDefectNum;
    }

    public void setCompletedDefectNum(Integer completedDefectNum) {
        this.completedDefectNum = completedDefectNum;
    }

    public ExecuteSummaryVo withCaseSuccessRate(String caseSuccessRate) {
        this.caseSuccessRate = caseSuccessRate;
        return this;
    }

    /**
     * 测试用例通过率
     * @return caseSuccessRate
     */
    public String getCaseSuccessRate() {
        return caseSuccessRate;
    }

    public void setCaseSuccessRate(String caseSuccessRate) {
        this.caseSuccessRate = caseSuccessRate;
    }

    public ExecuteSummaryVo withCaseExecutionRate(String caseExecutionRate) {
        this.caseExecutionRate = caseExecutionRate;
        return this;
    }

    /**
     * 用例执行率
     * @return caseExecutionRate
     */
    public String getCaseExecutionRate() {
        return caseExecutionRate;
    }

    public void setCaseExecutionRate(String caseExecutionRate) {
        this.caseExecutionRate = caseExecutionRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteSummaryVo that = (ExecuteSummaryVo) obj;
        return Objects.equals(this.executeCaseNum, that.executeCaseNum)
            && Objects.equals(this.defectNum, that.defectNum)
            && Objects.equals(this.completedDefectNum, that.completedDefectNum)
            && Objects.equals(this.caseSuccessRate, that.caseSuccessRate)
            && Objects.equals(this.caseExecutionRate, that.caseExecutionRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeCaseNum, defectNum, completedDefectNum, caseSuccessRate, caseExecutionRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteSummaryVo {\n");
        sb.append("    executeCaseNum: ").append(toIndentedString(executeCaseNum)).append("\n");
        sb.append("    defectNum: ").append(toIndentedString(defectNum)).append("\n");
        sb.append("    completedDefectNum: ").append(toIndentedString(completedDefectNum)).append("\n");
        sb.append("    caseSuccessRate: ").append(toIndentedString(caseSuccessRate)).append("\n");
        sb.append("    caseExecutionRate: ").append(toIndentedString(caseExecutionRate)).append("\n");
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
