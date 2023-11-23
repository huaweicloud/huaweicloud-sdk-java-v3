package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListInstancesSessionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private List<ListInstancesSessionRespondBodySessions> sessions = null;

    public ListInstancesSessionResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 符合查询条件的总会话数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListInstancesSessionResponse withSessions(List<ListInstancesSessionRespondBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }

    public ListInstancesSessionResponse addSessionsItem(ListInstancesSessionRespondBodySessions sessionsItem) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    public ListInstancesSessionResponse withSessions(
        Consumer<List<ListInstancesSessionRespondBodySessions>> sessionsSetter) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        sessionsSetter.accept(this.sessions);
        return this;
    }

    /**
     * 实例会话详细信息列表。
     * @return sessions
     */
    public List<ListInstancesSessionRespondBodySessions> getSessions() {
        return sessions;
    }

    public void setSessions(List<ListInstancesSessionRespondBodySessions> sessions) {
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
        ListInstancesSessionResponse that = (ListInstancesSessionResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.sessions, that.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, sessions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesSessionResponse {\n");
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
