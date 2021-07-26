package com.huaweicloud.sdk.cloudtest.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 测试计划设计阶段信息
 */
public class ShowPlansResponseDesignStage  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_count")
    
    private Integer caseCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_count")
    
    private Integer issueCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_covered_count")
    
    private String issueCoveredCount;

    public ShowPlansResponseDesignStage withCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
        return this;
    }

    


    /**
     * 用例个数
     * @return caseCount
     */
    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }

    

    public ShowPlansResponseDesignStage withIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
        return this;
    }

    


    /**
     * 需求个数
     * @return issueCount
     */
    public Integer getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
    }

    

    public ShowPlansResponseDesignStage withIssueCoveredCount(String issueCoveredCount) {
        this.issueCoveredCount = issueCoveredCount;
        return this;
    }

    


    /**
     * 已被用例关联的需求个数
     * @return issueCoveredCount
     */
    public String getIssueCoveredCount() {
        return issueCoveredCount;
    }

    public void setIssueCoveredCount(String issueCoveredCount) {
        this.issueCoveredCount = issueCoveredCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPlansResponseDesignStage showPlansResponseDesignStage = (ShowPlansResponseDesignStage) o;
        return Objects.equals(this.caseCount, showPlansResponseDesignStage.caseCount) &&
            Objects.equals(this.issueCount, showPlansResponseDesignStage.issueCount) &&
            Objects.equals(this.issueCoveredCount, showPlansResponseDesignStage.issueCoveredCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caseCount, issueCount, issueCoveredCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlansResponseDesignStage {\n");
        sb.append("    caseCount: ").append(toIndentedString(caseCount)).append("\n");
        sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
        sb.append("    issueCoveredCount: ").append(toIndentedString(issueCoveredCount)).append("\n");
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

