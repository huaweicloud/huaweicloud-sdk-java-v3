package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackendLatencyStats
 */
public class BackendLatencyStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_backend_latency")

    private Integer maxBackendLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_backend_latency")

    private Float avgBackendLatency;

    public BackendLatencyStats withMaxBackendLatency(Integer maxBackendLatency) {
        this.maxBackendLatency = maxBackendLatency;
        return this;
    }

    /**
     * 最大后端延时
     * @return maxBackendLatency
     */
    public Integer getMaxBackendLatency() {
        return maxBackendLatency;
    }

    public void setMaxBackendLatency(Integer maxBackendLatency) {
        this.maxBackendLatency = maxBackendLatency;
    }

    public BackendLatencyStats withAvgBackendLatency(Float avgBackendLatency) {
        this.avgBackendLatency = avgBackendLatency;
        return this;
    }

    /**
     * 平均后端延时
     * @return avgBackendLatency
     */
    public Float getAvgBackendLatency() {
        return avgBackendLatency;
    }

    public void setAvgBackendLatency(Float avgBackendLatency) {
        this.avgBackendLatency = avgBackendLatency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackendLatencyStats backendLatencyStats = (BackendLatencyStats) o;
        return Objects.equals(this.maxBackendLatency, backendLatencyStats.maxBackendLatency)
            && Objects.equals(this.avgBackendLatency, backendLatencyStats.avgBackendLatency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxBackendLatency, avgBackendLatency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendLatencyStats {\n");
        sb.append("    maxBackendLatency: ").append(toIndentedString(maxBackendLatency)).append("\n");
        sb.append("    avgBackendLatency: ").append(toIndentedString(avgBackendLatency)).append("\n");
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
