package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PostOldRequestsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extends")

    private OldExtends _extends;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_enable")

    private Boolean chatEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_enable")

    private Boolean thresholdEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private Integer operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    public PostOldRequestsReq withExtends(OldExtends _extends) {
        this._extends = _extends;
        return this;
    }

    public PostOldRequestsReq withExtends(Consumer<OldExtends> _extendsSetter) {
        if (this._extends == null) {
            this._extends = new OldExtends();
            _extendsSetter.accept(this._extends);
        }

        return this;
    }

    /**
     * Get _extends
     * @return _extends
     */
    public OldExtends getExtends() {
        return _extends;
    }

    public void setExtends(OldExtends _extends) {
        this._extends = _extends;
    }

    public PostOldRequestsReq withChatEnable(Boolean chatEnable) {
        this.chatEnable = chatEnable;
        return this;
    }

    /**
     * 默认false true：使用内部闲聊语料进行兜底 false：不使用闲聊兜底
     * @return chatEnable
     */
    public Boolean getChatEnable() {
        return chatEnable;
    }

    public void setChatEnable(Boolean chatEnable) {
        this.chatEnable = chatEnable;
    }

    public PostOldRequestsReq withThresholdEnable(Boolean thresholdEnable) {
        this.thresholdEnable = thresholdEnable;
        return this;
    }

    /**
     * true：启动内部阈值 返回经过阈值处理之后的答案。 false：不启用内部阈值 返回原答案。
     * @return thresholdEnable
     */
    public Boolean getThresholdEnable() {
        return thresholdEnable;
    }

    public void setThresholdEnable(Boolean thresholdEnable) {
        this.thresholdEnable = thresholdEnable;
    }

    public PostOldRequestsReq withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id，在日志中用于标识不通用户，可以为任意String
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PostOldRequestsReq withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * 用户输入
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public PostOldRequestsReq withOperateType(Integer operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 调用接口时候传入，用以标记的问答的行为，默认为0，最终会展示在问答日志里。 0 用户输入 1 单击热点问题 3 单击推荐问题 4 单击问题提示
     * @return operateType
     */
    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public PostOldRequestsReq withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话标识符，UUID格式。如：c04e6f7b-61d7-4a2d-a0c8-f9ecd2f62359。  每次对话开启，机器人创建会话id，下次请求中传入该id表示继续该轮对话，每轮会话有效时间为2分钟。 若传入的会话id已过期或者为空，则机器人会重新创建新的会话id（重新创建会话id会消耗一定时间）。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostOldRequestsReq that = (PostOldRequestsReq) obj;
        return Objects.equals(this._extends, that._extends) && Objects.equals(this.chatEnable, that.chatEnable)
            && Objects.equals(this.thresholdEnable, that.thresholdEnable) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.question, that.question) && Objects.equals(this.operateType, that.operateType)
            && Objects.equals(this.sessionId, that.sessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_extends, chatEnable, thresholdEnable, userId, question, operateType, sessionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostOldRequestsReq {\n");
        sb.append("    _extends: ").append(toIndentedString(_extends)).append("\n");
        sb.append("    chatEnable: ").append(toIndentedString(chatEnable)).append("\n");
        sb.append("    thresholdEnable: ").append(toIndentedString(thresholdEnable)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
