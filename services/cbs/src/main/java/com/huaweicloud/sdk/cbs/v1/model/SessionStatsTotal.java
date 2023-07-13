package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class SessionStatsTotal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_count")

    private Long sessionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_count")

    private Long userCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_request_count")

    private Double avgRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_session_time")

    private Double avgSessionTime;

    public SessionStatsTotal withSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    /**
     * 会话总数。
     * @return sessionCount
     */
    public Long getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
    }

    public SessionStatsTotal withUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * 独立用户个数。
     * @return userCount
     */
    public Long getUserCount() {
        return userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }

    public SessionStatsTotal withAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
        return this;
    }

    /**
     * 平均会话轮数，保留小数点后三位。
     * @return avgRequestCount
     */
    public Double getAvgRequestCount() {
        return avgRequestCount;
    }

    public void setAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
    }

    public SessionStatsTotal withAvgSessionTime(Double avgSessionTime) {
        this.avgSessionTime = avgSessionTime;
        return this;
    }

    /**
     * 平均会话时长，保留小数点后三位。
     * @return avgSessionTime
     */
    public Double getAvgSessionTime() {
        return avgSessionTime;
    }

    public void setAvgSessionTime(Double avgSessionTime) {
        this.avgSessionTime = avgSessionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionStatsTotal that = (SessionStatsTotal) obj;
        return Objects.equals(this.sessionCount, that.sessionCount) && Objects.equals(this.userCount, that.userCount)
            && Objects.equals(this.avgRequestCount, that.avgRequestCount)
            && Objects.equals(this.avgSessionTime, that.avgSessionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionCount, userCount, avgRequestCount, avgSessionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionStatsTotal {\n");
        sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
        sb.append("    avgRequestCount: ").append(toIndentedString(avgRequestCount)).append("\n");
        sb.append("    avgSessionTime: ").append(toIndentedString(avgSessionTime)).append("\n");
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
