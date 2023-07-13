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
public class ListIssueAssociatedCommitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits")

    private List<CommitRecordDetail> commits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListIssueAssociatedCommitsResponse withCommits(List<CommitRecordDetail> commits) {
        this.commits = commits;
        return this;
    }

    public ListIssueAssociatedCommitsResponse addCommitsItem(CommitRecordDetail commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    public ListIssueAssociatedCommitsResponse withCommits(Consumer<List<CommitRecordDetail>> commitsSetter) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        commitsSetter.accept(this.commits);
        return this;
    }

    /**
     * 提交记录列表
     * @return commits
     */
    public List<CommitRecordDetail> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitRecordDetail> commits) {
        this.commits = commits;
    }

    public ListIssueAssociatedCommitsResponse withTotal(Integer total) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIssueAssociatedCommitsResponse that = (ListIssueAssociatedCommitsResponse) obj;
        return Objects.equals(this.commits, that.commits) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commits, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueAssociatedCommitsResponse {\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
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
