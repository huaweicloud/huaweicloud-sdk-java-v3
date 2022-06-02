package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAssociatedIssuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issues")

    private List<AssociateIssueDetail> issues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAssociatedIssuesResponse withIssues(List<AssociateIssueDetail> issues) {
        this.issues = issues;
        return this;
    }

    public ListAssociatedIssuesResponse addIssuesItem(AssociateIssueDetail issuesItem) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        this.issues.add(issuesItem);
        return this;
    }

    public ListAssociatedIssuesResponse withIssues(Consumer<List<AssociateIssueDetail>> issuesSetter) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        issuesSetter.accept(this.issues);
        return this;
    }

    /**
     * 关联的工作项列表
     * @return issues
     */
    public List<AssociateIssueDetail> getIssues() {
        return issues;
    }

    public void setIssues(List<AssociateIssueDetail> issues) {
        this.issues = issues;
    }

    public ListAssociatedIssuesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssociatedIssuesResponse listAssociatedIssuesResponse = (ListAssociatedIssuesResponse) o;
        return Objects.equals(this.issues, listAssociatedIssuesResponse.issues)
            && Objects.equals(this.total, listAssociatedIssuesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issues, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssociatedIssuesResponse {\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
