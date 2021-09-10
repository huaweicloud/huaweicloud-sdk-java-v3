package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteTbSessionReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteTbSessionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bot_id")
    
    
    private String botId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    
    
    private String sessionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ExecuteTbSessionReq body;

    public ExecuteTbSessionRequest withBotId(String botId) {
        this.botId = botId;
        return this;
    }

    


    /**
     * 话务机器人ID
     * @return botId
     */
    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    

    public ExecuteTbSessionRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    


    /**
     * 会话ID，在发起会话API的请求结果消息体response当中产生。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    

    public ExecuteTbSessionRequest withBody(ExecuteTbSessionReq body) {
        this.body = body;
        return this;
    }

    public ExecuteTbSessionRequest withBody(Consumer<ExecuteTbSessionReq> bodySetter) {
        if(this.body == null ){
            this.body = new ExecuteTbSessionReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ExecuteTbSessionReq getBody() {
        return body;
    }

    public void setBody(ExecuteTbSessionReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteTbSessionRequest executeTbSessionRequest = (ExecuteTbSessionRequest) o;
        return Objects.equals(this.botId, executeTbSessionRequest.botId) &&
            Objects.equals(this.sessionId, executeTbSessionRequest.sessionId) &&
            Objects.equals(this.body, executeTbSessionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(botId, sessionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTbSessionRequest {\n");
        sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

