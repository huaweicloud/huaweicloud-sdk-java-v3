package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRealTimeSessionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private List<RealTimeSessionResult> sessions = null;

    public ListRealTimeSessionsResponse withSessions(List<RealTimeSessionResult> sessions) {
        this.sessions = sessions;
        return this;
    }

    public ListRealTimeSessionsResponse addSessionsItem(RealTimeSessionResult sessionsItem) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    public ListRealTimeSessionsResponse withSessions(Consumer<List<RealTimeSessionResult>> sessionsSetter) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        sessionsSetter.accept(this.sessions);
        return this;
    }

    /**
     * **参数解释**： 数据库实例的实时会话列表。
     * @return sessions
     */
    public List<RealTimeSessionResult> getSessions() {
        return sessions;
    }

    public void setSessions(List<RealTimeSessionResult> sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRealTimeSessionsResponse that = (ListRealTimeSessionsResponse) obj;
        return Objects.equals(this.sessions, that.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRealTimeSessionsResponse {\n");
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
