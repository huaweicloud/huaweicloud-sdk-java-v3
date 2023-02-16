package com.huaweicloud.sdk.cbs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.PostQaSessionReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteSessionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_id")
    
    
    private String qabotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    
    
    private String sessionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private PostQaSessionReq body;

    public ExecuteSessionRequest withQabotId(String qabotId) {
        this.qabotId = qabotId;
        return this;
    }

    


    /**
     * 机器人标识符。
     * @return qabotId
     */
    public String getQabotId() {
        return qabotId;
    }

    public void setQabotId(String qabotId) {
        this.qabotId = qabotId;
    }

    

    public ExecuteSessionRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    


    /**
     * 会话标识符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    

    public ExecuteSessionRequest withBody(PostQaSessionReq body) {
        this.body = body;
        return this;
    }

    public ExecuteSessionRequest withBody(Consumer<PostQaSessionReq> bodySetter) {
        if(this.body == null ){
            this.body = new PostQaSessionReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PostQaSessionReq getBody() {
        return body;
    }

    public void setBody(PostQaSessionReq body) {
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
        ExecuteSessionRequest executeSessionRequest = (ExecuteSessionRequest) o;
        return Objects.equals(this.qabotId, executeSessionRequest.qabotId) &&
            Objects.equals(this.sessionId, executeSessionRequest.sessionId) &&
            Objects.equals(this.body, executeSessionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qabotId, sessionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteSessionRequest {\n");
        sb.append("    qabotId: ").append(toIndentedString(qabotId)).append("\n");
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

