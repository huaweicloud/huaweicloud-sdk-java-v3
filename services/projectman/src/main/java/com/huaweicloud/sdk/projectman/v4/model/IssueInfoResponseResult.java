package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 返回信息。
 */
public class IssueInfoResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue")

    private IssueDetailResponseV2 issue;

    public IssueInfoResponseResult withIssue(IssueDetailResponseV2 issue) {
        this.issue = issue;
        return this;
    }

    public IssueInfoResponseResult withIssue(Consumer<IssueDetailResponseV2> issueSetter) {
        if (this.issue == null) {
            this.issue = new IssueDetailResponseV2();
            issueSetter.accept(this.issue);
        }

        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    public IssueDetailResponseV2 getIssue() {
        return issue;
    }

    public void setIssue(IssueDetailResponseV2 issue) {
        this.issue = issue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueInfoResponseResult that = (IssueInfoResponseResult) obj;
        return Objects.equals(this.issue, that.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueInfoResponseResult {\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
