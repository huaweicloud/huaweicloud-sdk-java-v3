package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LatencyStats
 */
public class LatencyStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_latency")

    private Integer maxLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_latency")

    private Float avgLatency;

    public LatencyStats withMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
        return this;
    }

    /**
     * 最大延时
     * @return maxLatency
     */
    public Integer getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
    }

    public LatencyStats withAvgLatency(Float avgLatency) {
        this.avgLatency = avgLatency;
        return this;
    }

    /**
     * 平均延时
     * @return avgLatency
     */
    public Float getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(Float avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LatencyStats latencyStats = (LatencyStats) o;
        return Objects.equals(this.maxLatency, latencyStats.maxLatency)
            && Objects.equals(this.avgLatency, latencyStats.avgLatency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxLatency, avgLatency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LatencyStats {\n");
        sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
        sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
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
