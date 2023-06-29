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
public class SearchIssuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_list")

    private List<WorkTableIssuseListResponseBodyIssueList> issueList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public SearchIssuesResponse withIssueList(List<WorkTableIssuseListResponseBodyIssueList> issueList) {
        this.issueList = issueList;
        return this;
    }

    public SearchIssuesResponse addIssueListItem(WorkTableIssuseListResponseBodyIssueList issueListItem) {
        if (this.issueList == null) {
            this.issueList = new ArrayList<>();
        }
        this.issueList.add(issueListItem);
        return this;
    }

    public SearchIssuesResponse withIssueList(
        Consumer<List<WorkTableIssuseListResponseBodyIssueList>> issueListSetter) {
        if (this.issueList == null) {
            this.issueList = new ArrayList<>();
        }
        issueListSetter.accept(this.issueList);
        return this;
    }

    /**
     * 工作项信息列表
     * @return issueList
     */
    public List<WorkTableIssuseListResponseBodyIssueList> getIssueList() {
        return issueList;
    }

    public void setIssueList(List<WorkTableIssuseListResponseBodyIssueList> issueList) {
        this.issueList = issueList;
    }

    public SearchIssuesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 工作项总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchIssuesResponse that = (SearchIssuesResponse) obj;
        return Objects.equals(this.issueList, that.issueList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchIssuesResponse {\n");
        sb.append("    issueList: ").append(toIndentedString(issueList)).append("\n");
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
