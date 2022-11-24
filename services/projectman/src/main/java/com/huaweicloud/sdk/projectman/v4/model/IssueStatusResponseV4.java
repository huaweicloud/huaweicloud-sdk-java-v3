package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项的统计信息
 */
public class IssueStatusResponseV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_num")

    private Integer closedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_num")

    private Integer newNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_num")

    private Integer processNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rejected_num")

    private Integer rejectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solved_num")

    private Integer solvedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_num")

    private Integer testNum;

    public IssueStatusResponseV4 withClosedNum(Integer closedNum) {
        this.closedNum = closedNum;
        return this;
    }

    /**
     * 已关闭数量
     * @return closedNum
     */
    public Integer getClosedNum() {
        return closedNum;
    }

    public void setClosedNum(Integer closedNum) {
        this.closedNum = closedNum;
    }

    public IssueStatusResponseV4 withNewNum(Integer newNum) {
        this.newNum = newNum;
        return this;
    }

    /**
     * 新建的数量
     * @return newNum
     */
    public Integer getNewNum() {
        return newNum;
    }

    public void setNewNum(Integer newNum) {
        this.newNum = newNum;
    }

    public IssueStatusResponseV4 withProcessNum(Integer processNum) {
        this.processNum = processNum;
        return this;
    }

    /**
     * 开发中的数量
     * @return processNum
     */
    public Integer getProcessNum() {
        return processNum;
    }

    public void setProcessNum(Integer processNum) {
        this.processNum = processNum;
    }

    public IssueStatusResponseV4 withRejectedNum(Integer rejectedNum) {
        this.rejectedNum = rejectedNum;
        return this;
    }

    /**
     * 已拒绝数量
     * @return rejectedNum
     */
    public Integer getRejectedNum() {
        return rejectedNum;
    }

    public void setRejectedNum(Integer rejectedNum) {
        this.rejectedNum = rejectedNum;
    }

    public IssueStatusResponseV4 withSolvedNum(Integer solvedNum) {
        this.solvedNum = solvedNum;
        return this;
    }

    /**
     * 已解决数量
     * @return solvedNum
     */
    public Integer getSolvedNum() {
        return solvedNum;
    }

    public void setSolvedNum(Integer solvedNum) {
        this.solvedNum = solvedNum;
    }

    public IssueStatusResponseV4 withTestNum(Integer testNum) {
        this.testNum = testNum;
        return this;
    }

    /**
     * 测试中的数量
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
        IssueStatusResponseV4 issueStatusResponseV4 = (IssueStatusResponseV4) o;
        return Objects.equals(this.closedNum, issueStatusResponseV4.closedNum)
            && Objects.equals(this.newNum, issueStatusResponseV4.newNum)
            && Objects.equals(this.processNum, issueStatusResponseV4.processNum)
            && Objects.equals(this.rejectedNum, issueStatusResponseV4.rejectedNum)
            && Objects.equals(this.solvedNum, issueStatusResponseV4.solvedNum)
            && Objects.equals(this.testNum, issueStatusResponseV4.testNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(closedNum, newNum, processNum, rejectedNum, solvedNum, testNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueStatusResponseV4 {\n");
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
