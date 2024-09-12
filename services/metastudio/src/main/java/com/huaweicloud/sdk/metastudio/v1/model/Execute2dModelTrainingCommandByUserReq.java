package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户执行分身数字人模型训练任务命令请求。
 */
public class Execute2dModelTrainingCommandByUserReq {

    /**
     * 命令类型。 * SUBMITVERIFYING: 提交审核 * CONFIRM_ACCEPT：用户确认训练效果 * CONFIRM_REJECT：用户驳回训练效果 * CONFIRM_ANSWER：用户答复 * CONFIRM_PENDING：用户挂起任务 * CONFIRM_ACTIVE：用户激活任务 * GET_MULTIPART_UPLOADED：获取训练视频分片上传地址 * CONFIRM_REPAIR:用户发起优化模型请求 * GET_MULTIPART_UPLOADED：获取训练视频已上传分片信息 * CONFIRM_MULTIPART_UPLOADED：确认训练视频所有分片文件已上传 * GET_ACTION_VIDEO_MULTIPART_UPLOADED：获取动作编排视频分片上传地址 * CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED：确认动作编排视频所有分片文件已上传 > * CONFIRM_ACCEPT/CONFIRM_REJECT/CONFIRM_ANSWER/CONFIRM_PENDING/CONFIRM_ACTIVE命令仅NA白名单用户可用。
     */
    public static final class CommandEnum {

        /**
         * Enum SUBMITVERIFYING for value: "SUBMITVERIFYING"
         */
        public static final CommandEnum SUBMITVERIFYING = new CommandEnum("SUBMITVERIFYING");

        /**
         * Enum CONFIRM_ACCEPT for value: "CONFIRM_ACCEPT"
         */
        public static final CommandEnum CONFIRM_ACCEPT = new CommandEnum("CONFIRM_ACCEPT");

        /**
         * Enum CONFIRM_REJECT for value: "CONFIRM_REJECT"
         */
        public static final CommandEnum CONFIRM_REJECT = new CommandEnum("CONFIRM_REJECT");

        /**
         * Enum CONFIRM_ANSWER for value: "CONFIRM_ANSWER"
         */
        public static final CommandEnum CONFIRM_ANSWER = new CommandEnum("CONFIRM_ANSWER");

        /**
         * Enum CONFIRM_PENDING for value: "CONFIRM_PENDING"
         */
        public static final CommandEnum CONFIRM_PENDING = new CommandEnum("CONFIRM_PENDING");

        /**
         * Enum CONFIRM_ACTIVE for value: "CONFIRM_ACTIVE"
         */
        public static final CommandEnum CONFIRM_ACTIVE = new CommandEnum("CONFIRM_ACTIVE");

        /**
         * Enum GET_MULTIPART_UPLOADED for value: "GET_MULTIPART_UPLOADED"
         */
        public static final CommandEnum GET_MULTIPART_UPLOADED = new CommandEnum("GET_MULTIPART_UPLOADED");

        /**
         * Enum CONFIRM_REPAIR for value: "CONFIRM_REPAIR"
         */
        public static final CommandEnum CONFIRM_REPAIR = new CommandEnum("CONFIRM_REPAIR");

        /**
         * Enum CONFIRM_MULTIPART_UPLOADED for value: "CONFIRM_MULTIPART_UPLOADED"
         */
        public static final CommandEnum CONFIRM_MULTIPART_UPLOADED = new CommandEnum("CONFIRM_MULTIPART_UPLOADED");

        /**
         * Enum GET_ACTION_VIDEO_MULTIPART_UPLOADED for value: "GET_ACTION_VIDEO_MULTIPART_UPLOADED"
         */
        public static final CommandEnum GET_ACTION_VIDEO_MULTIPART_UPLOADED =
            new CommandEnum("GET_ACTION_VIDEO_MULTIPART_UPLOADED");

        /**
         * Enum CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED for value: "CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED"
         */
        public static final CommandEnum CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED =
            new CommandEnum("CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED");

        private static final Map<String, CommandEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandEnum> createStaticFields() {
            Map<String, CommandEnum> map = new HashMap<>();
            map.put("SUBMITVERIFYING", SUBMITVERIFYING);
            map.put("CONFIRM_ACCEPT", CONFIRM_ACCEPT);
            map.put("CONFIRM_REJECT", CONFIRM_REJECT);
            map.put("CONFIRM_ANSWER", CONFIRM_ANSWER);
            map.put("CONFIRM_PENDING", CONFIRM_PENDING);
            map.put("CONFIRM_ACTIVE", CONFIRM_ACTIVE);
            map.put("GET_MULTIPART_UPLOADED", GET_MULTIPART_UPLOADED);
            map.put("CONFIRM_REPAIR", CONFIRM_REPAIR);
            map.put("CONFIRM_MULTIPART_UPLOADED", CONFIRM_MULTIPART_UPLOADED);
            map.put("GET_ACTION_VIDEO_MULTIPART_UPLOADED", GET_ACTION_VIDEO_MULTIPART_UPLOADED);
            map.put("CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED", CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommandEnum(String value) {
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
        public static CommandEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommandEnum(value));
        }

        public static CommandEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommandEnum) {
                return this.value.equals(((CommandEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private CommandEnum command;

    /**
     * 命令类型： * UPDATE_VIDEO: 更新视频 * UPLOAD_VIDEO: 上传视频 * CONFIRM_ACTION_VIDEO: 确认动作编排视频 * GET_ACTION_VIDEO_MULTIPART: 获取动作编排视频分片
     */
    public static final class CommandMessageEnum {

        /**
         * Enum UPDATE_VIDEO for value: "UPDATE_VIDEO"
         */
        public static final CommandMessageEnum UPDATE_VIDEO = new CommandMessageEnum("UPDATE_VIDEO");

        /**
         * Enum UPLOAD_VIDEO for value: "UPLOAD_VIDEO"
         */
        public static final CommandMessageEnum UPLOAD_VIDEO = new CommandMessageEnum("UPLOAD_VIDEO");

        /**
         * Enum CONFIRM_ACTION_VIDEO for value: "CONFIRM_ACTION_VIDEO"
         */
        public static final CommandMessageEnum CONFIRM_ACTION_VIDEO = new CommandMessageEnum("CONFIRM_ACTION_VIDEO");

        /**
         * Enum GET_ACTION_VIDEO_MULTIPART for value: "GET_ACTION_VIDEO_MULTIPART"
         */
        public static final CommandMessageEnum GET_ACTION_VIDEO_MULTIPART =
            new CommandMessageEnum("GET_ACTION_VIDEO_MULTIPART");

        private static final Map<String, CommandMessageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandMessageEnum> createStaticFields() {
            Map<String, CommandMessageEnum> map = new HashMap<>();
            map.put("UPDATE_VIDEO", UPDATE_VIDEO);
            map.put("UPLOAD_VIDEO", UPLOAD_VIDEO);
            map.put("CONFIRM_ACTION_VIDEO", CONFIRM_ACTION_VIDEO);
            map.put("GET_ACTION_VIDEO_MULTIPART", GET_ACTION_VIDEO_MULTIPART);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommandMessageEnum(String value) {
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
        public static CommandMessageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommandMessageEnum(value));
        }

        public static CommandMessageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommandMessageEnum) {
                return this.value.equals(((CommandMessageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_message")

    private CommandMessageEnum commandMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_data")

    private CommentData commentData;

    public Execute2dModelTrainingCommandByUserReq withCommand(CommandEnum command) {
        this.command = command;
        return this;
    }

    /**
     * 命令类型。 * SUBMITVERIFYING: 提交审核 * CONFIRM_ACCEPT：用户确认训练效果 * CONFIRM_REJECT：用户驳回训练效果 * CONFIRM_ANSWER：用户答复 * CONFIRM_PENDING：用户挂起任务 * CONFIRM_ACTIVE：用户激活任务 * GET_MULTIPART_UPLOADED：获取训练视频分片上传地址 * CONFIRM_REPAIR:用户发起优化模型请求 * GET_MULTIPART_UPLOADED：获取训练视频已上传分片信息 * CONFIRM_MULTIPART_UPLOADED：确认训练视频所有分片文件已上传 * GET_ACTION_VIDEO_MULTIPART_UPLOADED：获取动作编排视频分片上传地址 * CONFIRM_ACTION_VIDEO_MULTIPART_UPLOADED：确认动作编排视频所有分片文件已上传 > * CONFIRM_ACCEPT/CONFIRM_REJECT/CONFIRM_ANSWER/CONFIRM_PENDING/CONFIRM_ACTIVE命令仅NA白名单用户可用。
     * @return command
     */
    public CommandEnum getCommand() {
        return command;
    }

    public void setCommand(CommandEnum command) {
        this.command = command;
    }

    public Execute2dModelTrainingCommandByUserReq withCommandMessage(CommandMessageEnum commandMessage) {
        this.commandMessage = commandMessage;
        return this;
    }

    /**
     * 命令类型： * UPDATE_VIDEO: 更新视频 * UPLOAD_VIDEO: 上传视频 * CONFIRM_ACTION_VIDEO: 确认动作编排视频 * GET_ACTION_VIDEO_MULTIPART: 获取动作编排视频分片
     * @return commandMessage
     */
    public CommandMessageEnum getCommandMessage() {
        return commandMessage;
    }

    public void setCommandMessage(CommandMessageEnum commandMessage) {
        this.commandMessage = commandMessage;
    }

    public Execute2dModelTrainingCommandByUserReq withCommentData(CommentData commentData) {
        this.commentData = commentData;
        return this;
    }

    public Execute2dModelTrainingCommandByUserReq withCommentData(Consumer<CommentData> commentDataSetter) {
        if (this.commentData == null) {
            this.commentData = new CommentData();
            commentDataSetter.accept(this.commentData);
        }

        return this;
    }

    /**
     * Get commentData
     * @return commentData
     */
    public CommentData getCommentData() {
        return commentData;
    }

    public void setCommentData(CommentData commentData) {
        this.commentData = commentData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Execute2dModelTrainingCommandByUserReq that = (Execute2dModelTrainingCommandByUserReq) obj;
        return Objects.equals(this.command, that.command) && Objects.equals(this.commandMessage, that.commandMessage)
            && Objects.equals(this.commentData, that.commentData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, commandMessage, commentData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Execute2dModelTrainingCommandByUserReq {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    commandMessage: ").append(toIndentedString(commandMessage)).append("\n");
        sb.append("    commentData: ").append(toIndentedString(commentData)).append("\n");
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
