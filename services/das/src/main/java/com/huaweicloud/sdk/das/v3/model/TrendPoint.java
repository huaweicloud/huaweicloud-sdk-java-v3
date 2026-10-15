package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrendPoint
 */
public class TrendPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Long qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_in")

    private Long trafficIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_out")

    private Long trafficOut;

    public TrendPoint withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间点（毫秒时间戳）
     * minimum: 0
     * maximum: 9999999999999
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public TrendPoint withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * key大小（size/storage维度返回）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public TrendPoint withQps(Long qps) {
        this.qps = qps;
        return this;
    }

    /**
     * QPS值（qps维度返回）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return qps
     */
    public Long getQps() {
        return qps;
    }

    public void setQps(Long qps) {
        this.qps = qps;
    }

    public TrendPoint withTrafficIn(Long trafficIn) {
        this.trafficIn = trafficIn;
        return this;
    }

    /**
     * 入口流量（traffic维度返回，字节/秒）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return trafficIn
     */
    public Long getTrafficIn() {
        return trafficIn;
    }

    public void setTrafficIn(Long trafficIn) {
        this.trafficIn = trafficIn;
    }

    public TrendPoint withTrafficOut(Long trafficOut) {
        this.trafficOut = trafficOut;
        return this;
    }

    /**
     * 出口流量（traffic维度返回，字节/秒）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return trafficOut
     */
    public Long getTrafficOut() {
        return trafficOut;
    }

    public void setTrafficOut(Long trafficOut) {
        this.trafficOut = trafficOut;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrendPoint that = (TrendPoint) obj;
        return Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.size, that.size)
            && Objects.equals(this.qps, that.qps) && Objects.equals(this.trafficIn, that.trafficIn)
            && Objects.equals(this.trafficOut, that.trafficOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, size, qps, trafficIn, trafficOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendPoint {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
        sb.append("    trafficIn: ").append(toIndentedString(trafficIn)).append("\n");
        sb.append("    trafficOut: ").append(toIndentedString(trafficOut)).append("\n");
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
