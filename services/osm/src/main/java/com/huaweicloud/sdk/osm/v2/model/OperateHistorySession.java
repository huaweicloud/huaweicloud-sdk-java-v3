package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OperateHistorySession
 */
public class OperateHistorySession {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private Long sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public OperateHistorySession withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 会话时长，格式：hh:ii:ss
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public OperateHistorySession withSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return sessionId
     */
    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public OperateHistorySession withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 会话开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public OperateHistorySession withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 会话结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateHistorySession operateHistorySession = (OperateHistorySession) o;
        return Objects.equals(this.duration, operateHistorySession.duration)
            && Objects.equals(this.sessionId, operateHistorySession.sessionId)
            && Objects.equals(this.startTime, operateHistorySession.startTime)
            && Objects.equals(this.endTime, operateHistorySession.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, sessionId, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateHistorySession {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
