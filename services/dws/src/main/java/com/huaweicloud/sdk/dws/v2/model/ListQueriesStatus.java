package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListQueriesStatus
 */
public class ListQueriesStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_query_waiting_time")

    private Double averageQueryWaitingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_time_consumption_of_queries")

    private Double averageTimeConsumptionOfQueries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_time_consumption_of_sessions")

    private Double averageTimeConsumptionOfSessions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queries_count")

    private Long queriesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_count")

    private Long sessionCount;

    public ListQueriesStatus withAverageQueryWaitingTime(Double averageQueryWaitingTime) {
        this.averageQueryWaitingTime = averageQueryWaitingTime;
        return this;
    }

    /**
     * 平均查询等待时间。
     * @return averageQueryWaitingTime
     */
    public Double getAverageQueryWaitingTime() {
        return averageQueryWaitingTime;
    }

    public void setAverageQueryWaitingTime(Double averageQueryWaitingTime) {
        this.averageQueryWaitingTime = averageQueryWaitingTime;
    }

    public ListQueriesStatus withAverageTimeConsumptionOfQueries(Double averageTimeConsumptionOfQueries) {
        this.averageTimeConsumptionOfQueries = averageTimeConsumptionOfQueries;
        return this;
    }

    /**
     * 平均查询耗时。
     * @return averageTimeConsumptionOfQueries
     */
    public Double getAverageTimeConsumptionOfQueries() {
        return averageTimeConsumptionOfQueries;
    }

    public void setAverageTimeConsumptionOfQueries(Double averageTimeConsumptionOfQueries) {
        this.averageTimeConsumptionOfQueries = averageTimeConsumptionOfQueries;
    }

    public ListQueriesStatus withAverageTimeConsumptionOfSessions(Double averageTimeConsumptionOfSessions) {
        this.averageTimeConsumptionOfSessions = averageTimeConsumptionOfSessions;
        return this;
    }

    /**
     * 平均会话耗时。
     * @return averageTimeConsumptionOfSessions
     */
    public Double getAverageTimeConsumptionOfSessions() {
        return averageTimeConsumptionOfSessions;
    }

    public void setAverageTimeConsumptionOfSessions(Double averageTimeConsumptionOfSessions) {
        this.averageTimeConsumptionOfSessions = averageTimeConsumptionOfSessions;
    }

    public ListQueriesStatus withQueriesCount(Long queriesCount) {
        this.queriesCount = queriesCount;
        return this;
    }

    /**
     * 查询数量。
     * @return queriesCount
     */
    public Long getQueriesCount() {
        return queriesCount;
    }

    public void setQueriesCount(Long queriesCount) {
        this.queriesCount = queriesCount;
    }

    public ListQueriesStatus withSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    /**
     * 会话数量。
     * @return sessionCount
     */
    public Long getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQueriesStatus that = (ListQueriesStatus) obj;
        return Objects.equals(this.averageQueryWaitingTime, that.averageQueryWaitingTime)
            && Objects.equals(this.averageTimeConsumptionOfQueries, that.averageTimeConsumptionOfQueries)
            && Objects.equals(this.averageTimeConsumptionOfSessions, that.averageTimeConsumptionOfSessions)
            && Objects.equals(this.queriesCount, that.queriesCount)
            && Objects.equals(this.sessionCount, that.sessionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageQueryWaitingTime,
            averageTimeConsumptionOfQueries,
            averageTimeConsumptionOfSessions,
            queriesCount,
            sessionCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueriesStatus {\n");
        sb.append("    averageQueryWaitingTime: ").append(toIndentedString(averageQueryWaitingTime)).append("\n");
        sb.append("    averageTimeConsumptionOfQueries: ")
            .append(toIndentedString(averageTimeConsumptionOfQueries))
            .append("\n");
        sb.append("    averageTimeConsumptionOfSessions: ")
            .append(toIndentedString(averageTimeConsumptionOfSessions))
            .append("\n");
        sb.append("    queriesCount: ").append(toIndentedString(queriesCount)).append("\n");
        sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
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
