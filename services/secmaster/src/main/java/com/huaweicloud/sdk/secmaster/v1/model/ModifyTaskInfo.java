package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Information of task
 */
public class ModifyTaskInfo {

    /**
     * **参数解释**: 更新的待办动作 - TERMINATE 终止待办 - CONTINUE 继续执行 - ADD_COMMENT 添加评论 - DELETE_COMMENT 删除评论  - ADD_ATTACHMENT 添加附件 - DELETE_ATTACHMENT 删除附件   **约束限制**: - TERMINATE 不涉及 - CONTINUE 不涉及 - ADD_COMMENT 需要和请求参数comment配合使用 - DELETE_COMMENT 需要和请求参数comment_id配合使用  - ADD_ATTACHMENT 需要和请求参数attachment_id配合使用 - DELETE_ATTACHMENT 需要和请求参数attachment_id配合使用    **取值范围**: - TERMINATE - CONTINUE - ADD_COMMENT - DELETE_COMMENT  - ADD_ATTACHMENT - DELETE_ATTACHMENT  **默认值**:  ADD_ATTACHMENT 添加评论
     */
    public static final class ActionEnum {

        /**
         * Enum TERMINATE for value: "TERMINATE"
         */
        public static final ActionEnum TERMINATE = new ActionEnum("TERMINATE");

        /**
         * Enum CONTINUE for value: "CONTINUE"
         */
        public static final ActionEnum CONTINUE = new ActionEnum("CONTINUE");

        /**
         * Enum ADD_COMMEN for value: "ADD_COMMEN"
         */
        public static final ActionEnum ADD_COMMEN = new ActionEnum("ADD_COMMEN");

        /**
         * Enum DELETE_COMMENT for value: "DELETE_COMMENT"
         */
        public static final ActionEnum DELETE_COMMENT = new ActionEnum("DELETE_COMMENT");

        /**
         * Enum ADD_ATTACHMENT for value: "ADD_ATTACHMENT"
         */
        public static final ActionEnum ADD_ATTACHMENT = new ActionEnum("ADD_ATTACHMENT");

        /**
         * Enum DELETE_ATTACHMEN for value: "DELETE_ATTACHMEN"
         */
        public static final ActionEnum DELETE_ATTACHMEN = new ActionEnum("DELETE_ATTACHMEN");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("TERMINATE", TERMINATE);
            map.put("CONTINUE", CONTINUE);
            map.put("ADD_COMMEN", ADD_COMMEN);
            map.put("DELETE_COMMENT", DELETE_COMMENT);
            map.put("ADD_ATTACHMENT", ADD_ATTACHMENT);
            map.put("DELETE_ATTACHMEN", DELETE_ATTACHMEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_id")

    private String commentId;

    public ModifyTaskInfo withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**: 更新的待办动作 - TERMINATE 终止待办 - CONTINUE 继续执行 - ADD_COMMENT 添加评论 - DELETE_COMMENT 删除评论  - ADD_ATTACHMENT 添加附件 - DELETE_ATTACHMENT 删除附件   **约束限制**: - TERMINATE 不涉及 - CONTINUE 不涉及 - ADD_COMMENT 需要和请求参数comment配合使用 - DELETE_COMMENT 需要和请求参数comment_id配合使用  - ADD_ATTACHMENT 需要和请求参数attachment_id配合使用 - DELETE_ATTACHMENT 需要和请求参数attachment_id配合使用    **取值范围**: - TERMINATE - CONTINUE - ADD_COMMENT - DELETE_COMMENT  - ADD_ATTACHMENT - DELETE_ATTACHMENT  **默认值**:  ADD_ATTACHMENT 添加评论
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ModifyTaskInfo withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 附件id
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public ModifyTaskInfo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 待办评论内容
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ModifyTaskInfo withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }

    /**
     * 待办评论id
     * @return commentId
     */
    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyTaskInfo that = (ModifyTaskInfo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.attachmentId, that.attachmentId)
            && Objects.equals(this.comment, that.comment) && Objects.equals(this.commentId, that.commentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, attachmentId, comment, commentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTaskInfo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
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
