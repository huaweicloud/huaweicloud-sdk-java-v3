package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrafficTrendVO
 */
public class TrafficTrendVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agg_time")

    private Long aggTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bps")

    private Double bps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_bps")

    private Double inBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_bps")

    private Double outBps;

    public TrafficTrendVO withAggTime(Long aggTime) {
        this.aggTime = aggTime;
        return this;
    }

    /**
     * **参数解释**： 聚合时间点 **取值范围**： 不涉及
     * @return aggTime
     */
    public Long getAggTime() {
        return aggTime;
    }

    public void setAggTime(Long aggTime) {
        this.aggTime = aggTime;
    }

    public TrafficTrendVO withBps(Double bps) {
        this.bps = bps;
        return this;
    }

    /**
     * **参数解释**： bps **取值范围**： 不涉及
     * @return bps
     */
    public Double getBps() {
        return bps;
    }

    public void setBps(Double bps) {
        this.bps = bps;
    }

    public TrafficTrendVO withInBps(Double inBps) {
        this.inBps = inBps;
        return this;
    }

    /**
     * **参数解释**： 入方向bps **取值范围**： 不涉及
     * @return inBps
     */
    public Double getInBps() {
        return inBps;
    }

    public void setInBps(Double inBps) {
        this.inBps = inBps;
    }

    public TrafficTrendVO withOutBps(Double outBps) {
        this.outBps = outBps;
        return this;
    }

    /**
     * **参数解释**： 出方向bps **取值范围**： 不涉及
     * @return outBps
     */
    public Double getOutBps() {
        return outBps;
    }

    public void setOutBps(Double outBps) {
        this.outBps = outBps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrafficTrendVO that = (TrafficTrendVO) obj;
        return Objects.equals(this.aggTime, that.aggTime) && Objects.equals(this.bps, that.bps)
            && Objects.equals(this.inBps, that.inBps) && Objects.equals(this.outBps, that.outBps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggTime, bps, inBps, outBps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficTrendVO {\n");
        sb.append("    aggTime: ").append(toIndentedString(aggTime)).append("\n");
        sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
        sb.append("    inBps: ").append(toIndentedString(inBps)).append("\n");
        sb.append("    outBps: ").append(toIndentedString(outBps)).append("\n");
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
