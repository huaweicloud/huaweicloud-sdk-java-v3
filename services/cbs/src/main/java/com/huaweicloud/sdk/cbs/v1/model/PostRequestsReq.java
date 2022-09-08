package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ModelExtends;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PostRequestsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extends")
    
    
    private ModelExtends _extends;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chat_enable")
    
    
    private Boolean chatEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question")
    
    
    private String question;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    
    
    private String sessionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_types")
    
    
    private List<Integer> queryTypes = null;
    
    public PostRequestsReq withExtends(ModelExtends _extends) {
        this._extends = _extends;
        return this;
    }

    public PostRequestsReq withExtends(Consumer<ModelExtends> _extendsSetter) {
        if(this._extends == null ){
            this._extends = new ModelExtends();
            _extendsSetter.accept(this._extends);
        }
        
        return this;
    }


    /**
     * Get _extends
     * @return _extends
     */
    public ModelExtends getExtends() {
        return _extends;
    }

    public void setExtends(ModelExtends _extends) {
        this._extends = _extends;
    }

    

    public PostRequestsReq withChatEnable(Boolean chatEnable) {
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

    

    public PostRequestsReq withUserId(String userId) {
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

    

    public PostRequestsReq withQuestion(String question) {
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

    

    public PostRequestsReq withSessionId(String sessionId) {
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

    

    public PostRequestsReq withQueryTypes(List<Integer> queryTypes) {
        this.queryTypes = queryTypes;
        return this;
    }

    
    public PostRequestsReq addQueryTypesItem(Integer queryTypesItem) {
        if(this.queryTypes == null) {
            this.queryTypes = new ArrayList<>();
        }
        this.queryTypes.add(queryTypesItem);
        return this;
    }

    public PostRequestsReq withQueryTypes(Consumer<List<Integer>> queryTypesSetter) {
        if(this.queryTypes == null) {
            this.queryTypes = new ArrayList<>();
        }
        queryTypesSetter.accept(this.queryTypes);
        return this;
    }

    /**
     * 指定发送的机器人类型集合。  0 知识库问答。  1 技能问答。  2 闲聊问答。  3 图谱问答。  4 文档问答。  5 表格问答。  非必填字段。如果不填，会使用默认的机器人融合策略。
     * @return queryTypes
     */
    public List<Integer> getQueryTypes() {
        return queryTypes;
    }

    public void setQueryTypes(List<Integer> queryTypes) {
        this.queryTypes = queryTypes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostRequestsReq postRequestsReq = (PostRequestsReq) o;
        return Objects.equals(this._extends, postRequestsReq._extends) &&
            Objects.equals(this.chatEnable, postRequestsReq.chatEnable) &&
            Objects.equals(this.userId, postRequestsReq.userId) &&
            Objects.equals(this.question, postRequestsReq.question) &&
            Objects.equals(this.sessionId, postRequestsReq.sessionId) &&
            Objects.equals(this.queryTypes, postRequestsReq.queryTypes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(_extends, chatEnable, userId, question, sessionId, queryTypes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostRequestsReq {\n");
        sb.append("    _extends: ").append(toIndentedString(_extends)).append("\n");
        sb.append("    chatEnable: ").append(toIndentedString(chatEnable)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    queryTypes: ").append(toIndentedString(queryTypes)).append("\n");
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

