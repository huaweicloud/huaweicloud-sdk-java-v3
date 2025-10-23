package com.huaweicloud.sdk.codehub.v4.model;

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
public class ListCommitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits")

    private List<CommitDto> commits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_title")

    private List<DateTitleDto> dateTitle = null;

    public ListCommitsResponse withCommits(List<CommitDto> commits) {
        this.commits = commits;
        return this;
    }

    public ListCommitsResponse addCommitsItem(CommitDto commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    public ListCommitsResponse withCommits(Consumer<List<CommitDto>> commitsSetter) {
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
    public List<CommitDto> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitDto> commits) {
        this.commits = commits;
    }

    public ListCommitsResponse withDateTitle(List<DateTitleDto> dateTitle) {
        this.dateTitle = dateTitle;
        return this;
    }

    public ListCommitsResponse addDateTitleItem(DateTitleDto dateTitleItem) {
        if (this.dateTitle == null) {
            this.dateTitle = new ArrayList<>();
        }
        this.dateTitle.add(dateTitleItem);
        return this;
    }

    public ListCommitsResponse withDateTitle(Consumer<List<DateTitleDto>> dateTitleSetter) {
        if (this.dateTitle == null) {
            this.dateTitle = new ArrayList<>();
        }
        dateTitleSetter.accept(this.dateTitle);
        return this;
    }

    /**
     * 按天统计信息
     * @return dateTitle
     */
    public List<DateTitleDto> getDateTitle() {
        return dateTitle;
    }

    public void setDateTitle(List<DateTitleDto> dateTitle) {
        this.dateTitle = dateTitle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCommitsResponse that = (ListCommitsResponse) obj;
        return Objects.equals(this.commits, that.commits) && Objects.equals(this.dateTitle, that.dateTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commits, dateTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommitsResponse {\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    dateTitle: ").append(toIndentedString(dateTitle)).append("\n");
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
