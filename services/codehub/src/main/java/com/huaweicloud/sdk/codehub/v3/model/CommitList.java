package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommitList
 */
public class CommitList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits")

    private List<Commit> commits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public CommitList withCommits(List<Commit> commits) {
        this.commits = commits;
        return this;
    }

    public CommitList addCommitsItem(Commit commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    public CommitList withCommits(Consumer<List<Commit>> commitsSetter) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        commitsSetter.accept(this.commits);
        return this;
    }

    /**
     * 提交列表
     * @return commits
     */
    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public CommitList withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 提交总数
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
        CommitList that = (CommitList) obj;
        return Objects.equals(this.commits, that.commits) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commits, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitList {\n");
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
