package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

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
public class ListAuraSqlSessionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private List<SqlSessionInfo> sessions = null;

    public ListAuraSqlSessionsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * **参数解释**：下一页查询marker值，若为空表示当前已是最后一页。 **取值范围**：不涉及。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListAuraSqlSessionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总数。 **取值范围**：1~2147483647。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAuraSqlSessionsResponse withSessions(List<SqlSessionInfo> sessions) {
        this.sessions = sessions;
        return this;
    }

    public ListAuraSqlSessionsResponse addSessionsItem(SqlSessionInfo sessionsItem) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    public ListAuraSqlSessionsResponse withSessions(Consumer<List<SqlSessionInfo>> sessionsSetter) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        sessionsSetter.accept(this.sessions);
        return this;
    }

    /**
     * **参数解释**：Session列表。
     * @return sessions
     */
    public List<SqlSessionInfo> getSessions() {
        return sessions;
    }

    public void setSessions(List<SqlSessionInfo> sessions) {
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
        ListAuraSqlSessionsResponse that = (ListAuraSqlSessionsResponse) obj;
        return Objects.equals(this.nextMarker, that.nextMarker) && Objects.equals(this.total, that.total)
            && Objects.equals(this.sessions, that.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextMarker, total, sessions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuraSqlSessionsResponse {\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
