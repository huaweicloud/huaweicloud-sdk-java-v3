package com.huaweicloud.sdk.cbs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSessionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_id")
    
    
    private String qabotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    
    
    private String sessionId;

    public DeleteSessionRequest withQabotId(String qabotId) {
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

    

    public DeleteSessionRequest withSessionId(String sessionId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSessionRequest deleteSessionRequest = (DeleteSessionRequest) o;
        return Objects.equals(this.qabotId, deleteSessionRequest.qabotId) &&
            Objects.equals(this.sessionId, deleteSessionRequest.sessionId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qabotId, sessionId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSessionRequest {\n");
        sb.append("    qabotId: ").append(toIndentedString(qabotId)).append("\n");
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

