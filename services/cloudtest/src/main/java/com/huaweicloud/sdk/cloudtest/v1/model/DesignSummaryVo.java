package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设计阶段信息汇总
 */
public class DesignSummaryVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_num")

    private Integer issueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_cover_num")

    private Integer issueCoverNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_num")

    private Integer caseNum;

    public DesignSummaryVo withIssueNum(Integer issueNum) {
        this.issueNum = issueNum;
        return this;
    }

    /**
     * 需求总数
     * @return issueNum
     */
    public Integer getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(Integer issueNum) {
        this.issueNum = issueNum;
    }

    public DesignSummaryVo withIssueCoverNum(Integer issueCoverNum) {
        this.issueCoverNum = issueCoverNum;
        return this;
    }

    /**
     * 已覆盖需求数
     * @return issueCoverNum
     */
    public Integer getIssueCoverNum() {
        return issueCoverNum;
    }

    public void setIssueCoverNum(Integer issueCoverNum) {
        this.issueCoverNum = issueCoverNum;
    }

    public DesignSummaryVo withCaseNum(Integer caseNum) {
        this.caseNum = caseNum;
        return this;
    }

    /**
     * 用例数
     * @return caseNum
     */
    public Integer getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Integer caseNum) {
        this.caseNum = caseNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesignSummaryVo that = (DesignSummaryVo) obj;
        return Objects.equals(this.issueNum, that.issueNum) && Objects.equals(this.issueCoverNum, that.issueCoverNum)
            && Objects.equals(this.caseNum, that.caseNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueNum, issueCoverNum, caseNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesignSummaryVo {\n");
        sb.append("    issueNum: ").append(toIndentedString(issueNum)).append("\n");
        sb.append("    issueCoverNum: ").append(toIndentedString(issueCoverNum)).append("\n");
        sb.append("    caseNum: ").append(toIndentedString(caseNum)).append("\n");
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
