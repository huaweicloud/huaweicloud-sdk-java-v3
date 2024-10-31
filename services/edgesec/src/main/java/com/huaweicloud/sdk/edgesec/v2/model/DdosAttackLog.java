package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * http攻击日志详情
 */
public class DdosAttackLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_time")

    private Long attackTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_bps")

    private Long avgBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_pps")

    private Long avgPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bps")

    private Long maxBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_pps")

    private Long maxPps;

    public DdosAttackLog withAttackTime(Long attackTime) {
        this.attackTime = attackTime;
        return this;
    }

    /**
     * ddos攻击时间
     * @return attackTime
     */
    public Long getAttackTime() {
        return attackTime;
    }

    public void setAttackTime(Long attackTime) {
        this.attackTime = attackTime;
    }

    public DdosAttackLog withAvgBps(Long avgBps) {
        this.avgBps = avgBps;
        return this;
    }

    /**
     * 攻击流量带宽平均值
     * @return avgBps
     */
    public Long getAvgBps() {
        return avgBps;
    }

    public void setAvgBps(Long avgBps) {
        this.avgBps = avgBps;
    }

    public DdosAttackLog withAvgPps(Long avgPps) {
        this.avgPps = avgPps;
        return this;
    }

    /**
     * 攻击流量带宽峰值
     * @return avgPps
     */
    public Long getAvgPps() {
        return avgPps;
    }

    public void setAvgPps(Long avgPps) {
        this.avgPps = avgPps;
    }

    public DdosAttackLog withMaxBps(Long maxBps) {
        this.maxBps = maxBps;
        return this;
    }

    /**
     * 包转发率平均值
     * @return maxBps
     */
    public Long getMaxBps() {
        return maxBps;
    }

    public void setMaxBps(Long maxBps) {
        this.maxBps = maxBps;
    }

    public DdosAttackLog withMaxPps(Long maxPps) {
        this.maxPps = maxPps;
        return this;
    }

    /**
     * 包转发率峰值
     * @return maxPps
     */
    public Long getMaxPps() {
        return maxPps;
    }

    public void setMaxPps(Long maxPps) {
        this.maxPps = maxPps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DdosAttackLog that = (DdosAttackLog) obj;
        return Objects.equals(this.attackTime, that.attackTime) && Objects.equals(this.avgBps, that.avgBps)
            && Objects.equals(this.avgPps, that.avgPps) && Objects.equals(this.maxBps, that.maxBps)
            && Objects.equals(this.maxPps, that.maxPps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackTime, avgBps, avgPps, maxBps, maxPps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DdosAttackLog {\n");
        sb.append("    attackTime: ").append(toIndentedString(attackTime)).append("\n");
        sb.append("    avgBps: ").append(toIndentedString(avgBps)).append("\n");
        sb.append("    avgPps: ").append(toIndentedString(avgPps)).append("\n");
        sb.append("    maxBps: ").append(toIndentedString(maxBps)).append("\n");
        sb.append("    maxPps: ").append(toIndentedString(maxPps)).append("\n");
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
