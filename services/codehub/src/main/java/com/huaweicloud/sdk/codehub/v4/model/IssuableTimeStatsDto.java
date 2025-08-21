package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 合并请求的时间统计信息
 */
public class IssuableTimeStatsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_estimate")

    private Integer timeEstimate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time_spent")

    private Integer totalTimeSpent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_time_estimate")

    private String humanTimeEstimate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_total_time_spent")

    private String humanTotalTimeSpent;

    public IssuableTimeStatsDto withTimeEstimate(Integer timeEstimate) {
        this.timeEstimate = timeEstimate;
        return this;
    }

    /**
     * 合并请求时间估计
     * @return timeEstimate
     */
    public Integer getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(Integer timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    public IssuableTimeStatsDto withTotalTimeSpent(Integer totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
        return this;
    }

    /**
     * 合并请求总时长
     * @return totalTimeSpent
     */
    public Integer getTotalTimeSpent() {
        return totalTimeSpent;
    }

    public void setTotalTimeSpent(Integer totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
    }

    public IssuableTimeStatsDto withHumanTimeEstimate(String humanTimeEstimate) {
        this.humanTimeEstimate = humanTimeEstimate;
        return this;
    }

    /**
     * 合并请求人类时间估计
     * @return humanTimeEstimate
     */
    public String getHumanTimeEstimate() {
        return humanTimeEstimate;
    }

    public void setHumanTimeEstimate(String humanTimeEstimate) {
        this.humanTimeEstimate = humanTimeEstimate;
    }

    public IssuableTimeStatsDto withHumanTotalTimeSpent(String humanTotalTimeSpent) {
        this.humanTotalTimeSpent = humanTotalTimeSpent;
        return this;
    }

    /**
     * 合并请求人类总时长
     * @return humanTotalTimeSpent
     */
    public String getHumanTotalTimeSpent() {
        return humanTotalTimeSpent;
    }

    public void setHumanTotalTimeSpent(String humanTotalTimeSpent) {
        this.humanTotalTimeSpent = humanTotalTimeSpent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssuableTimeStatsDto that = (IssuableTimeStatsDto) obj;
        return Objects.equals(this.timeEstimate, that.timeEstimate)
            && Objects.equals(this.totalTimeSpent, that.totalTimeSpent)
            && Objects.equals(this.humanTimeEstimate, that.humanTimeEstimate)
            && Objects.equals(this.humanTotalTimeSpent, that.humanTotalTimeSpent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeEstimate, totalTimeSpent, humanTimeEstimate, humanTotalTimeSpent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuableTimeStatsDto {\n");
        sb.append("    timeEstimate: ").append(toIndentedString(timeEstimate)).append("\n");
        sb.append("    totalTimeSpent: ").append(toIndentedString(totalTimeSpent)).append("\n");
        sb.append("    humanTimeEstimate: ").append(toIndentedString(humanTimeEstimate)).append("\n");
        sb.append("    humanTotalTimeSpent: ").append(toIndentedString(humanTotalTimeSpent)).append("\n");
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
