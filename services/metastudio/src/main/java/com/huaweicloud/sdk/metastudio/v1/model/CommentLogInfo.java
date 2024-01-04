package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 评论记录。
 */
public class CommentLogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private String operateTime;

    /**
     * * USER_REJECT：用户驳回 * USER_COMMENT：用户评论 * ADMIN_COMMENT：管理员评论
     */
    public static final class CommentTypeEnum {

        /**
         * Enum USER_REJECT for value: "USER_REJECT"
         */
        public static final CommentTypeEnum USER_REJECT = new CommentTypeEnum("USER_REJECT");

        /**
         * Enum USER_COMMENT for value: "USER_COMMENT"
         */
        public static final CommentTypeEnum USER_COMMENT = new CommentTypeEnum("USER_COMMENT");

        /**
         * Enum ADMIN_COMMENT for value: "ADMIN_COMMENT"
         */
        public static final CommentTypeEnum ADMIN_COMMENT = new CommentTypeEnum("ADMIN_COMMENT");

        private static final Map<String, CommentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommentTypeEnum> createStaticFields() {
            Map<String, CommentTypeEnum> map = new HashMap<>();
            map.put("USER_REJECT", USER_REJECT);
            map.put("USER_COMMENT", USER_COMMENT);
            map.put("ADMIN_COMMENT", ADMIN_COMMENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommentTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CommentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommentTypeEnum(value));
        }

        public static CommentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommentTypeEnum) {
                return this.value.equals(((CommentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_type")

    private CommentTypeEnum commentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_title")

    private String commentTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_message")

    private String commentMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_download_url")

    private List<String> attachmentDownloadUrl = null;

    public CommentLogInfo withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * 操作时间,格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public CommentLogInfo withCommentType(CommentTypeEnum commentType) {
        this.commentType = commentType;
        return this;
    }

    /**
     * * USER_REJECT：用户驳回 * USER_COMMENT：用户评论 * ADMIN_COMMENT：管理员评论
     * @return commentType
     */
    public CommentTypeEnum getCommentType() {
        return commentType;
    }

    public void setCommentType(CommentTypeEnum commentType) {
        this.commentType = commentType;
    }

    public CommentLogInfo withCommentTitle(String commentTitle) {
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

    public CommentLogInfo withCommentMessage(String commentMessage) {
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

    public CommentLogInfo withAttachmentDownloadUrl(List<String> attachmentDownloadUrl) {
        this.attachmentDownloadUrl = attachmentDownloadUrl;
        return this;
    }

    public CommentLogInfo addAttachmentDownloadUrlItem(String attachmentDownloadUrlItem) {
        if (this.attachmentDownloadUrl == null) {
            this.attachmentDownloadUrl = new ArrayList<>();
        }
        this.attachmentDownloadUrl.add(attachmentDownloadUrlItem);
        return this;
    }

    public CommentLogInfo withAttachmentDownloadUrl(Consumer<List<String>> attachmentDownloadUrlSetter) {
        if (this.attachmentDownloadUrl == null) {
            this.attachmentDownloadUrl = new ArrayList<>();
        }
        attachmentDownloadUrlSetter.accept(this.attachmentDownloadUrl);
        return this;
    }

    /**
     * 附件下载地址
     * @return attachmentDownloadUrl
     */
    public List<String> getAttachmentDownloadUrl() {
        return attachmentDownloadUrl;
    }

    public void setAttachmentDownloadUrl(List<String> attachmentDownloadUrl) {
        this.attachmentDownloadUrl = attachmentDownloadUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentLogInfo that = (CommentLogInfo) obj;
        return Objects.equals(this.operateTime, that.operateTime) && Objects.equals(this.commentType, that.commentType)
            && Objects.equals(this.commentTitle, that.commentTitle)
            && Objects.equals(this.commentMessage, that.commentMessage)
            && Objects.equals(this.attachmentDownloadUrl, that.attachmentDownloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateTime, commentType, commentTitle, commentMessage, attachmentDownloadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentLogInfo {\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    commentType: ").append(toIndentedString(commentType)).append("\n");
        sb.append("    commentTitle: ").append(toIndentedString(commentTitle)).append("\n");
        sb.append("    commentMessage: ").append(toIndentedString(commentMessage)).append("\n");
        sb.append("    attachmentDownloadUrl: ").append(toIndentedString(attachmentDownloadUrl)).append("\n");
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
