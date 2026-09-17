package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IPD工作项评论列表查询结果
 */
public class CommentResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_list")

    private List<CommentEntity> commentList = null;

    public CommentResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 符合过滤条件的工作项评论总数。 **取值范围**： 不涉及。
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CommentResult withCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;
        return this;
    }

    public CommentResult addCommentListItem(CommentEntity commentListItem) {
        if (this.commentList == null) {
            this.commentList = new ArrayList<>();
        }
        this.commentList.add(commentListItem);
        return this;
    }

    public CommentResult withCommentList(Consumer<List<CommentEntity>> commentListSetter) {
        if (this.commentList == null) {
            this.commentList = new ArrayList<>();
        }
        commentListSetter.accept(this.commentList);
        return this;
    }

    /**
     * **参数解释**： 工作项评论列表。 **取值范围**： 不涉及。
     * @return commentList
     */
    public List<CommentEntity> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentResult that = (CommentResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.commentList, that.commentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, commentList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    commentList: ").append(toIndentedString(commentList)).append("\n");
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
