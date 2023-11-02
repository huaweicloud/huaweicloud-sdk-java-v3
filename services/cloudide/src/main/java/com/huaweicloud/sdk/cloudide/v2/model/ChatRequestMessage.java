package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * chat request messqge
 */
public class ChatRequestMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case")

    private String _case;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_id")

    private String chatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_end")

    private Boolean inferEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_prompt")

    private List<String> metaPrompt = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_preprocess")

    private Boolean needPreprocess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_parameters")

    private Object taskParameters;

    public ChatRequestMessage withCase(String _case) {
        this._case = _case;
        return this;
    }

    /**
     * case
     * @return _case
     */
    public String getCase() {
        return _case;
    }

    public void setCase(String _case) {
        this._case = _case;
    }

    public ChatRequestMessage withChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * chat id
     * @return chatId
     */
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public ChatRequestMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatRequestMessage withInferEnd(Boolean inferEnd) {
        this.inferEnd = inferEnd;
        return this;
    }

    /**
     * infer end
     * @return inferEnd
     */
    public Boolean getInferEnd() {
        return inferEnd;
    }

    public void setInferEnd(Boolean inferEnd) {
        this.inferEnd = inferEnd;
    }

    public ChatRequestMessage withMetaPrompt(List<String> metaPrompt) {
        this.metaPrompt = metaPrompt;
        return this;
    }

    public ChatRequestMessage addMetaPromptItem(String metaPromptItem) {
        if (this.metaPrompt == null) {
            this.metaPrompt = new ArrayList<>();
        }
        this.metaPrompt.add(metaPromptItem);
        return this;
    }

    public ChatRequestMessage withMetaPrompt(Consumer<List<String>> metaPromptSetter) {
        if (this.metaPrompt == null) {
            this.metaPrompt = new ArrayList<>();
        }
        metaPromptSetter.accept(this.metaPrompt);
        return this;
    }

    /**
     * prompt
     * @return metaPrompt
     */
    public List<String> getMetaPrompt() {
        return metaPrompt;
    }

    public void setMetaPrompt(List<String> metaPrompt) {
        this.metaPrompt = metaPrompt;
    }

    public ChatRequestMessage withNeedPreprocess(Boolean needPreprocess) {
        this.needPreprocess = needPreprocess;
        return this;
    }

    /**
     * need or not
     * @return needPreprocess
     */
    public Boolean getNeedPreprocess() {
        return needPreprocess;
    }

    public void setNeedPreprocess(Boolean needPreprocess) {
        this.needPreprocess = needPreprocess;
    }

    public ChatRequestMessage withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * user id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ChatRequestMessage withTaskParameters(Object taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }

    /**
     * task parameters
     * @return taskParameters
     */
    public Object getTaskParameters() {
        return taskParameters;
    }

    public void setTaskParameters(Object taskParameters) {
        this.taskParameters = taskParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatRequestMessage that = (ChatRequestMessage) obj;
        return Objects.equals(this._case, that._case) && Objects.equals(this.chatId, that.chatId)
            && Objects.equals(this.message, that.message) && Objects.equals(this.inferEnd, that.inferEnd)
            && Objects.equals(this.metaPrompt, that.metaPrompt)
            && Objects.equals(this.needPreprocess, that.needPreprocess) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.taskParameters, that.taskParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_case, chatId, message, inferEnd, metaPrompt, needPreprocess, userId, taskParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatRequestMessage {\n");
        sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    inferEnd: ").append(toIndentedString(inferEnd)).append("\n");
        sb.append("    metaPrompt: ").append(toIndentedString(metaPrompt)).append("\n");
        sb.append("    needPreprocess: ").append(toIndentedString(needPreprocess)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    taskParameters: ").append(toIndentedString(taskParameters)).append("\n");
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
