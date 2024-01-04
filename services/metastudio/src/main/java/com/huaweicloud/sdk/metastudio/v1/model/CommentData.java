package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户提交的评论信息。
 */
public class CommentData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_title")

    private String commentTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_message")

    private String commentMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_name")

    private List<String> attachmentName = null;

    public CommentData withCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
        return this;
    }

    /**
     * 标题。
     * @return commentTitle
     */
    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public CommentData withCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
        return this;
    }

    /**
     * 消息。
     * @return commentMessage
     */
    public String getCommentMessage() {
        return commentMessage;
    }

    public void setCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
    }

    public CommentData withAttachmentName(List<String> attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    public CommentData addAttachmentNameItem(String attachmentNameItem) {
        if (this.attachmentName == null) {
            this.attachmentName = new ArrayList<>();
        }
        this.attachmentName.add(attachmentNameItem);
        return this;
    }

    public CommentData withAttachmentName(Consumer<List<String>> attachmentNameSetter) {
        if (this.attachmentName == null) {
            this.attachmentName = new ArrayList<>();
        }
        attachmentNameSetter.accept(this.attachmentName);
        return this;
    }

    /**
     * 附件名字
     * @return attachmentName
     */
    public List<String> getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(List<String> attachmentName) {
        this.attachmentName = attachmentName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentData that = (CommentData) obj;
        return Objects.equals(this.commentTitle, that.commentTitle)
            && Objects.equals(this.commentMessage, that.commentMessage)
            && Objects.equals(this.attachmentName, that.attachmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentTitle, commentMessage, attachmentName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentData {\n");
        sb.append("    commentTitle: ").append(toIndentedString(commentTitle)).append("\n");
        sb.append("    commentMessage: ").append(toIndentedString(commentMessage)).append("\n");
        sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
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
