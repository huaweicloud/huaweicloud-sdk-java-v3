package com.huaweicloud.sdk.projectman.v4.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 工作项不同状态下的数量
 */
public class IssueCompletionRateV4IssueStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="closed_num")
    
    private Integer closedNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_num")
    
    private Integer newNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="process_num")
    
    private Integer processNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rejected_num")
    
    private Integer rejectedNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="solved_num")
    
    private Integer solvedNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_num")
    
    private Integer testNum;

    public IssueCompletionRateV4IssueStatus withClosedNum(Integer closedNum) {
        this.closedNum = closedNum;
        return this;
    }

    


    /**
     * 已关闭的工作项
     * @return closedNum
     */
    public Integer getClosedNum() {
        return closedNum;
    }

    public void setClosedNum(Integer closedNum) {
        this.closedNum = closedNum;
    }

    public IssueCompletionRateV4IssueStatus withNewNum(Integer newNum) {
        this.newNum = newNum;
        return this;
    }

    


    /**
     * 新建的工作项
     * @return newNum
     */
    public Integer getNewNum() {
        return newNum;
    }

    public void setNewNum(Integer newNum) {
        this.newNum = newNum;
    }

    public IssueCompletionRateV4IssueStatus withProcessNum(Integer processNum) {
        this.processNum = processNum;
        return this;
    }

    


    /**
     * 进行中的工作项数目
     * @return processNum
     */
    public Integer getProcessNum() {
        return processNum;
    }

    public void setProcessNum(Integer processNum) {
        this.processNum = processNum;
    }

    public IssueCompletionRateV4IssueStatus withRejectedNum(Integer rejectedNum) {
        this.rejectedNum = rejectedNum;
        return this;
    }

    


    /**
     * 已经拒绝的工作项
     * @return rejectedNum
     */
    public Integer getRejectedNum() {
        return rejectedNum;
    }

    public void setRejectedNum(Integer rejectedNum) {
        this.rejectedNum = rejectedNum;
    }

    public IssueCompletionRateV4IssueStatus withSolvedNum(Integer solvedNum) {
        this.solvedNum = solvedNum;
        return this;
    }

    


    /**
     * 已经解决的工作项
     * @return solvedNum
     */
    public Integer getSolvedNum() {
        return solvedNum;
    }

    public void setSolvedNum(Integer solvedNum) {
        this.solvedNum = solvedNum;
    }

    public IssueCompletionRateV4IssueStatus withTestNum(Integer testNum) {
        this.testNum = testNum;
        return this;
    }

    


    /**
     * 测试中的工作项
     * @return testNum
     */
    public Integer getTestNum() {
        return testNum;
    }

    public void setTestNum(Integer testNum) {
        this.testNum = testNum;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueCompletionRateV4IssueStatus issueCompletionRateV4IssueStatus = (IssueCompletionRateV4IssueStatus) o;
        return Objects.equals(this.closedNum, issueCompletionRateV4IssueStatus.closedNum) &&
            Objects.equals(this.newNum, issueCompletionRateV4IssueStatus.newNum) &&
            Objects.equals(this.processNum, issueCompletionRateV4IssueStatus.processNum) &&
            Objects.equals(this.rejectedNum, issueCompletionRateV4IssueStatus.rejectedNum) &&
            Objects.equals(this.solvedNum, issueCompletionRateV4IssueStatus.solvedNum) &&
            Objects.equals(this.testNum, issueCompletionRateV4IssueStatus.testNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(closedNum, newNum, processNum, rejectedNum, solvedNum, testNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCompletionRateV4IssueStatus {\n");
        sb.append("    closedNum: ").append(toIndentedString(closedNum)).append("\n");
        sb.append("    newNum: ").append(toIndentedString(newNum)).append("\n");
        sb.append("    processNum: ").append(toIndentedString(processNum)).append("\n");
        sb.append("    rejectedNum: ").append(toIndentedString(rejectedNum)).append("\n");
        sb.append("    solvedNum: ").append(toIndentedString(solvedNum)).append("\n");
        sb.append("    testNum: ").append(toIndentedString(testNum)).append("\n");
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

