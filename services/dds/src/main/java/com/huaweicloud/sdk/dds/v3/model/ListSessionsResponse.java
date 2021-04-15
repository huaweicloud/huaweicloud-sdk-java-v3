package com.huaweicloud.sdk.dds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.QuerySessionResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSessionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sessions")
    
    private List<QuerySessionResponse> sessions = null;
    
    public ListSessionsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListSessionsResponse withSessions(List<QuerySessionResponse> sessions) {
        this.sessions = sessions;
        return this;
    }

    
    public ListSessionsResponse addSessionsItem(QuerySessionResponse sessionsItem) {
        if(this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    public ListSessionsResponse withSessions(Consumer<List<QuerySessionResponse>> sessionsSetter) {
        if(this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        sessionsSetter.accept(this.sessions);
        return this;
    }

    /**
     * 具体信息。
     * @return sessions
     */
    public List<QuerySessionResponse> getSessions() {
        return sessions;
    }

    public void setSessions(List<QuerySessionResponse> sessions) {
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
        ListSessionsResponse listSessionsResponse = (ListSessionsResponse) o;
        return Objects.equals(this.totalCount, listSessionsResponse.totalCount) &&
            Objects.equals(this.sessions, listSessionsResponse.sessions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, sessions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

