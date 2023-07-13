package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InnerLatencyStats
 */
public class InnerLatencyStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_inner_latency")

    private Integer maxInnerLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_inner_latency")

    private Float avgInnerLatency;

    public InnerLatencyStats withMaxInnerLatency(Integer maxInnerLatency) {
        this.maxInnerLatency = maxInnerLatency;
        return this;
    }

    /**
     * 最大网关内部延时
     * @return maxInnerLatency
     */
    public Integer getMaxInnerLatency() {
        return maxInnerLatency;
    }

    public void setMaxInnerLatency(Integer maxInnerLatency) {
        this.maxInnerLatency = maxInnerLatency;
    }

    public InnerLatencyStats withAvgInnerLatency(Float avgInnerLatency) {
        this.avgInnerLatency = avgInnerLatency;
        return this;
    }

    /**
     * 平均网关内部延时
     * @return avgInnerLatency
     */
    public Float getAvgInnerLatency() {
        return avgInnerLatency;
    }

    public void setAvgInnerLatency(Float avgInnerLatency) {
        this.avgInnerLatency = avgInnerLatency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InnerLatencyStats that = (InnerLatencyStats) obj;
        return Objects.equals(this.maxInnerLatency, that.maxInnerLatency)
            && Objects.equals(this.avgInnerLatency, that.avgInnerLatency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxInnerLatency, avgInnerLatency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InnerLatencyStats {\n");
        sb.append("    maxInnerLatency: ").append(toIndentedString(maxInnerLatency)).append("\n");
        sb.append("    avgInnerLatency: ").append(toIndentedString(avgInnerLatency)).append("\n");
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
