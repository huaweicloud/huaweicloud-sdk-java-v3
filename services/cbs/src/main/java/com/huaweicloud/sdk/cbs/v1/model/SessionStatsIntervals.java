package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class SessionStatsIntervals  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    
    
    private String start;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_count")
    
    
    private Long sessionCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_count")
    
    
    private Long userCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_request_count")
    
    
    private Double avgRequestCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_session_time")
    
    
    private Double avgSessionTime;

    public SessionStatsIntervals withStart(String start) {
        this.start = start;
        return this;
    }

    


    /**
     * 间隔周期开始时间。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    

    public SessionStatsIntervals withSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    


    /**
     * 间隔周期会话总数。
     * @return sessionCount
     */
    public Long getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
    }

    

    public SessionStatsIntervals withUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }

    


    /**
     * 间隔周期独立用户个数。
     * @return userCount
     */
    public Long getUserCount() {
        return userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }

    

    public SessionStatsIntervals withAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
        return this;
    }

    


    /**
     * 间隔周期平均会话轮数，保留小数点后三位。
     * @return avgRequestCount
     */
    public Double getAvgRequestCount() {
        return avgRequestCount;
    }

    public void setAvgRequestCount(Double avgRequestCount) {
        this.avgRequestCount = avgRequestCount;
    }

    

    public SessionStatsIntervals withAvgSessionTime(Double avgSessionTime) {
        this.avgSessionTime = avgSessionTime;
        return this;
    }

    


    /**
     * 间隔周期平均会话时长，保留小数点后三位。
     * @return avgSessionTime
     */
    public Double getAvgSessionTime() {
        return avgSessionTime;
    }

    public void setAvgSessionTime(Double avgSessionTime) {
        this.avgSessionTime = avgSessionTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionStatsIntervals sessionStatsIntervals = (SessionStatsIntervals) o;
        return Objects.equals(this.start, sessionStatsIntervals.start) &&
            Objects.equals(this.sessionCount, sessionStatsIntervals.sessionCount) &&
            Objects.equals(this.userCount, sessionStatsIntervals.userCount) &&
            Objects.equals(this.avgRequestCount, sessionStatsIntervals.avgRequestCount) &&
            Objects.equals(this.avgSessionTime, sessionStatsIntervals.avgSessionTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(start, sessionCount, userCount, avgRequestCount, avgSessionTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionStatsIntervals {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

