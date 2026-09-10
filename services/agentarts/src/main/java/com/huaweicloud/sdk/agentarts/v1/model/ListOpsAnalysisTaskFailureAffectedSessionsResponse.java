package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsAnalysisTaskFailureAffectedSessionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private List<OpsFailureSession> sessions = null;

    public ListOpsAnalysisTaskFailureAffectedSessionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足过滤条件的记录总数，用于计算分页总页数。 **取值范围：** 不涉及
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsAnalysisTaskFailureAffectedSessionsResponse withSessions(List<OpsFailureSession> sessions) {
        this.sessions = sessions;
        return this;
    }

    public ListOpsAnalysisTaskFailureAffectedSessionsResponse addSessionsItem(OpsFailureSession sessionsItem) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    public ListOpsAnalysisTaskFailureAffectedSessionsResponse withSessions(
        Consumer<List<OpsFailureSession>> sessionsSetter) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        sessionsSetter.accept(this.sessions);
        return this;
    }

    /**
     * **参数解释：** 满足过滤条件的session清单与错误详情。 **取值范围：** 不涉及
     * @return sessions
     */
    public List<OpsFailureSession> getSessions() {
        return sessions;
    }

    public void setSessions(List<OpsFailureSession> sessions) {
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
        ListOpsAnalysisTaskFailureAffectedSessionsResponse that =
            (ListOpsAnalysisTaskFailureAffectedSessionsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.sessions, that.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, sessions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAnalysisTaskFailureAffectedSessionsResponse {\n");
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
