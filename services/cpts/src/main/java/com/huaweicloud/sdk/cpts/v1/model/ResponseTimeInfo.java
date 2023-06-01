package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResponseTimeInfo
 */
public class ResponseTimeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_response_time")

    private Float avgResponseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_tp50")

    private Integer avgTp50;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_tp90")

    private Integer avgTp90;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_response_time")

    private Integer maxResponseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_response_time")

    private Integer minResponseTime;

    public ResponseTimeInfo withAvgResponseTime(Float avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
        return this;
    }

    /**
     * 平均响应时间
     * @return avgResponseTime
     */
    public Float getAvgResponseTime() {
        return avgResponseTime;
    }

    public void setAvgResponseTime(Float avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public ResponseTimeInfo withAvgTp50(Integer avgTp50) {
        this.avgTp50 = avgTp50;
        return this;
    }

    /**
     * TP50
     * @return avgTp50
     */
    public Integer getAvgTp50() {
        return avgTp50;
    }

    public void setAvgTp50(Integer avgTp50) {
        this.avgTp50 = avgTp50;
    }

    public ResponseTimeInfo withAvgTp90(Integer avgTp90) {
        this.avgTp90 = avgTp90;
        return this;
    }

    /**
     * TP90
     * @return avgTp90
     */
    public Integer getAvgTp90() {
        return avgTp90;
    }

    public void setAvgTp90(Integer avgTp90) {
        this.avgTp90 = avgTp90;
    }

    public ResponseTimeInfo withMaxResponseTime(Integer maxResponseTime) {
        this.maxResponseTime = maxResponseTime;
        return this;
    }

    /**
     * 最大响应时间
     * @return maxResponseTime
     */
    public Integer getMaxResponseTime() {
        return maxResponseTime;
    }

    public void setMaxResponseTime(Integer maxResponseTime) {
        this.maxResponseTime = maxResponseTime;
    }

    public ResponseTimeInfo withMinResponseTime(Integer minResponseTime) {
        this.minResponseTime = minResponseTime;
        return this;
    }

    /**
     * 最小响应时间
     * @return minResponseTime
     */
    public Integer getMinResponseTime() {
        return minResponseTime;
    }

    public void setMinResponseTime(Integer minResponseTime) {
        this.minResponseTime = minResponseTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseTimeInfo responseTimeInfo = (ResponseTimeInfo) o;
        return Objects.equals(this.avgResponseTime, responseTimeInfo.avgResponseTime)
            && Objects.equals(this.avgTp50, responseTimeInfo.avgTp50)
            && Objects.equals(this.avgTp90, responseTimeInfo.avgTp90)
            && Objects.equals(this.maxResponseTime, responseTimeInfo.maxResponseTime)
            && Objects.equals(this.minResponseTime, responseTimeInfo.minResponseTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avgResponseTime, avgTp50, avgTp90, maxResponseTime, minResponseTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseTimeInfo {\n");
        sb.append("    avgResponseTime: ").append(toIndentedString(avgResponseTime)).append("\n");
        sb.append("    avgTp50: ").append(toIndentedString(avgTp50)).append("\n");
        sb.append("    avgTp90: ").append(toIndentedString(avgTp90)).append("\n");
        sb.append("    maxResponseTime: ").append(toIndentedString(maxResponseTime)).append("\n");
        sb.append("    minResponseTime: ").append(toIndentedString(minResponseTime)).append("\n");
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
