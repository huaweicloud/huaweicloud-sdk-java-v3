package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.SessionExtends;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PostQaSessionReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extends")
    

    private SessionExtends _extends;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chat_enable")
    

    private Boolean chatEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question")
    

    private String question;

    public PostQaSessionReq withExtends(SessionExtends _extends) {
        this._extends = _extends;
        return this;
    }

    public PostQaSessionReq withExtends(Consumer<SessionExtends> _extendsSetter) {
        if(this._extends == null ){
            this._extends = new SessionExtends();
            _extendsSetter.accept(this._extends);
        }
        
        return this;
    }


    /**
     * Get _extends
     * @return _extends
     */
    public SessionExtends getExtends() {
        return _extends;
    }

    public void setExtends(SessionExtends _extends) {
        this._extends = _extends;
    }

    

    public PostQaSessionReq withChatEnable(Boolean chatEnable) {
        this.chatEnable = chatEnable;
        return this;
    }

    


    /**
     * 默认true true：使用内部闲聊语料进行兜底 false：不使用闲聊兜底
     * @return chatEnable
     */
    public Boolean getChatEnable() {
        return chatEnable;
    }

    public void setChatEnable(Boolean chatEnable) {
        this.chatEnable = chatEnable;
    }

    

    public PostQaSessionReq withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户id，在日志中用于标识不通用户，可以为任意String。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public PostQaSessionReq withQuestion(String question) {
        this.question = question;
        return this;
    }

    


    /**
     * 用户输入。
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostQaSessionReq postQaSessionReq = (PostQaSessionReq) o;
        return Objects.equals(this._extends, postQaSessionReq._extends) &&
            Objects.equals(this.chatEnable, postQaSessionReq.chatEnable) &&
            Objects.equals(this.userId, postQaSessionReq.userId) &&
            Objects.equals(this.question, postQaSessionReq.question);
    }
    @Override
    public int hashCode() {
        return Objects.hash(_extends, chatEnable, userId, question);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostQaSessionReq {\n");
        sb.append("    _extends: ").append(toIndentedString(_extends)).append("\n");
        sb.append("    chatEnable: ").append(toIndentedString(chatEnable)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

