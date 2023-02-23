package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSessionResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="greeting")
    

    private String greeting;

    public CreateSessionResponse withSessionId(String sessionId) {
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

    

    public CreateSessionResponse withGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }

    


    /**
     * 机器人问候语。
     * @return greeting
     */
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSessionResponse createSessionResponse = (CreateSessionResponse) o;
        return Objects.equals(this.sessionId, createSessionResponse.sessionId) &&
            Objects.equals(this.greeting, createSessionResponse.greeting);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sessionId, greeting);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSessionResponse {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
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

