package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReviewCommentEntity
 */
public class ReviewCommentEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_user_id")

    private String otherUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    public ReviewCommentEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 评审意见对象ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReviewCommentEntity withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 评审用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ReviewCommentEntity withOtherUserId(String otherUserId) {
        this.otherUserId = otherUserId;
        return this;
    }

    /**
     * 其他用户Id（转他人）。
     * @return otherUserId
     */
    public String getOtherUserId() {
        return otherUserId;
    }

    public void setOtherUserId(String otherUserId) {
        this.otherUserId = otherUserId;
    }

    public ReviewCommentEntity withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 评审结果。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ReviewCommentEntity withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 评审意见。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewCommentEntity that = (ReviewCommentEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.otherUserId, that.otherUserId) && Objects.equals(this.result, that.result)
            && Objects.equals(this.comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, otherUserId, result, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewCommentEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    otherUserId: ").append(toIndentedString(otherUserId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
