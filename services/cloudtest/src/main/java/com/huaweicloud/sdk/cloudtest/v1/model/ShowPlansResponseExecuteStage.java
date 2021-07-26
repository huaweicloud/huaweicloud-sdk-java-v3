package com.huaweicloud.sdk.cloudtest.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 测试计划执行阶段信息
 */
public class ShowPlansResponseExecuteStage  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="defect_count")
    
    private Integer defectCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="completed_defect_count")
    
    private Integer completedDefectCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_pass_rate")
    
    private String casePassRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executed_case_count")
    
    private Integer executedCaseCount;

    public ShowPlansResponseExecuteStage withDefectCount(Integer defectCount) {
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

    

    public ShowPlansResponseExecuteStage withCompletedDefectCount(Integer completedDefectCount) {
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

    

    public ShowPlansResponseExecuteStage withCasePassRate(String casePassRate) {
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

    

    public ShowPlansResponseExecuteStage withExecutedCaseCount(Integer executedCaseCount) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPlansResponseExecuteStage showPlansResponseExecuteStage = (ShowPlansResponseExecuteStage) o;
        return Objects.equals(this.defectCount, showPlansResponseExecuteStage.defectCount) &&
            Objects.equals(this.completedDefectCount, showPlansResponseExecuteStage.completedDefectCount) &&
            Objects.equals(this.casePassRate, showPlansResponseExecuteStage.casePassRate) &&
            Objects.equals(this.executedCaseCount, showPlansResponseExecuteStage.executedCaseCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(defectCount, completedDefectCount, casePassRate, executedCaseCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlansResponseExecuteStage {\n");
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

