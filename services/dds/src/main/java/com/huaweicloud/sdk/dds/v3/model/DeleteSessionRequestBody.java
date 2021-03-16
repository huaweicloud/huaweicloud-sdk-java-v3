package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DeleteSessionRequestBody
 */
public class DeleteSessionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sessions")
    
    private List<String> sessions = null;
    
    public DeleteSessionRequestBody withSessions(List<String> sessions) {
        this.sessions = sessions;
        return this;
    }

    
    public DeleteSessionRequestBody addSessionsItem(String sessionsItem) {
        this.sessions.add(sessionsItem);
        return this;
    }

    public DeleteSessionRequestBody withSessions(Consumer<List<String>> sessionsSetter) {
        if(this.sessions == null ){
            this.sessions = new ArrayList<>();
        }
        sessionsSetter.accept(this.sessions);
        return this;
    }

    /**
     * 需要终结的会话ID列表。
     * @return sessions
     */
    public List<String> getSessions() {
        return sessions;
    }

    public void setSessions(List<String> sessions) {
        this.sessions = sessions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSessionRequestBody deleteSessionRequestBody = (DeleteSessionRequestBody) o;
        return Objects.equals(this.sessions, deleteSessionRequestBody.sessions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sessions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSessionRequestBody {\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

