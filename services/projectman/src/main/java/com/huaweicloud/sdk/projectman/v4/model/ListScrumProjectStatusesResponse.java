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
public class ListScrumProjectStatusesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_statuses")

    private List<IssueStatus> issueStatuses = null;

    public ListScrumProjectStatusesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 状态总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListScrumProjectStatusesResponse withIssueStatuses(List<IssueStatus> issueStatuses) {
        this.issueStatuses = issueStatuses;
        return this;
    }

    public ListScrumProjectStatusesResponse addIssueStatusesItem(IssueStatus issueStatusesItem) {
        if (this.issueStatuses == null) {
            this.issueStatuses = new ArrayList<>();
        }
        this.issueStatuses.add(issueStatusesItem);
        return this;
    }

    public ListScrumProjectStatusesResponse withIssueStatuses(Consumer<List<IssueStatus>> issueStatusesSetter) {
        if (this.issueStatuses == null) {
            this.issueStatuses = new ArrayList<>();
        }
        issueStatusesSetter.accept(this.issueStatuses);
        return this;
    }

    /**
     * 状态列表
     * @return issueStatuses
     */
    public List<IssueStatus> getIssueStatuses() {
        return issueStatuses;
    }

    public void setIssueStatuses(List<IssueStatus> issueStatuses) {
        this.issueStatuses = issueStatuses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScrumProjectStatusesResponse listScrumProjectStatusesResponse = (ListScrumProjectStatusesResponse) o;
        return Objects.equals(this.total, listScrumProjectStatusesResponse.total)
            && Objects.equals(this.issueStatuses, listScrumProjectStatusesResponse.issueStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, issueStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScrumProjectStatusesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    issueStatuses: ").append(toIndentedString(issueStatuses)).append("\n");
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
