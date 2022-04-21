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
public class ListIssueCommentsV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private List<IssueCommentV4> comments = null;

    public ListIssueCommentsV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 评论总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListIssueCommentsV4Response withComments(List<IssueCommentV4> comments) {
        this.comments = comments;
        return this;
    }

    public ListIssueCommentsV4Response addCommentsItem(IssueCommentV4 commentsItem) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(commentsItem);
        return this;
    }

    public ListIssueCommentsV4Response withComments(Consumer<List<IssueCommentV4>> commentsSetter) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        commentsSetter.accept(this.comments);
        return this;
    }

    /**
     * 品论列表
     * @return comments
     */
    public List<IssueCommentV4> getComments() {
        return comments;
    }

    public void setComments(List<IssueCommentV4> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssueCommentsV4Response listIssueCommentsV4Response = (ListIssueCommentsV4Response) o;
        return Objects.equals(this.total, listIssueCommentsV4Response.total)
            && Objects.equals(this.comments, listIssueCommentsV4Response.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, comments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueCommentsV4Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
