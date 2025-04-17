package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EIP防护流量响应体
 */
public class DailyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_start")

    private Long periodStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bps_in")

    private Integer bpsIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bps_attack")

    private Long bpsAttack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_bps")

    private Long totalBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pps_in")

    private Long ppsIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pps_attack")

    private Long ppsAttack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pps")

    private Long totalPps;

    public DailyData withPeriodStart(Long periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * 开始时间
     * minimum: 1
     * maximum: 9999999999999
     * @return periodStart
     */
    public Long getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(Long periodStart) {
        this.periodStart = periodStart;
    }

    public DailyData withBpsIn(Integer bpsIn) {
        this.bpsIn = bpsIn;
        return this;
    }

    /**
     * 入流量（bit/s）
     * minimum: 0
     * maximum: 2147483647
     * @return bpsIn
     */
    public Integer getBpsIn() {
        return bpsIn;
    }

    public void setBpsIn(Integer bpsIn) {
        this.bpsIn = bpsIn;
    }

    public DailyData withBpsAttack(Long bpsAttack) {
        this.bpsAttack = bpsAttack;
        return this;
    }

    /**
     * 攻击流量（bit/s）
     * minimum: 0
     * maximum: 2147483647
     * @return bpsAttack
     */
    public Long getBpsAttack() {
        return bpsAttack;
    }

    public void setBpsAttack(Long bpsAttack) {
        this.bpsAttack = bpsAttack;
    }

    public DailyData withTotalBps(Long totalBps) {
        this.totalBps = totalBps;
        return this;
    }

    /**
     * 总流量
     * minimum: 0
     * maximum: 2147483647
     * @return totalBps
     */
    public Long getTotalBps() {
        return totalBps;
    }

    public void setTotalBps(Long totalBps) {
        this.totalBps = totalBps;
    }

    public DailyData withPpsIn(Long ppsIn) {
        this.ppsIn = ppsIn;
        return this;
    }

    /**
     * 入报文速率（个/s）
     * minimum: 0
     * maximum: 2147483647
     * @return ppsIn
     */
    public Long getPpsIn() {
        return ppsIn;
    }

    public void setPpsIn(Long ppsIn) {
        this.ppsIn = ppsIn;
    }

    public DailyData withPpsAttack(Long ppsAttack) {
        this.ppsAttack = ppsAttack;
        return this;
    }

    /**
     * 攻击文速率（个/s）
     * minimum: 0
     * maximum: 2147483647
     * @return ppsAttack
     */
    public Long getPpsAttack() {
        return ppsAttack;
    }

    public void setPpsAttack(Long ppsAttack) {
        this.ppsAttack = ppsAttack;
    }

    public DailyData withTotalPps(Long totalPps) {
        this.totalPps = totalPps;
        return this;
    }

    /**
     * 总报文速率
     * minimum: 0
     * maximum: 2147483647
     * @return totalPps
     */
    public Long getTotalPps() {
        return totalPps;
    }

    public void setTotalPps(Long totalPps) {
        this.totalPps = totalPps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DailyData that = (DailyData) obj;
        return Objects.equals(this.periodStart, that.periodStart) && Objects.equals(this.bpsIn, that.bpsIn)
            && Objects.equals(this.bpsAttack, that.bpsAttack) && Objects.equals(this.totalBps, that.totalBps)
            && Objects.equals(this.ppsIn, that.ppsIn) && Objects.equals(this.ppsAttack, that.ppsAttack)
            && Objects.equals(this.totalPps, that.totalPps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodStart, bpsIn, bpsAttack, totalBps, ppsIn, ppsAttack, totalPps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyData {\n");
        sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
        sb.append("    bpsIn: ").append(toIndentedString(bpsIn)).append("\n");
        sb.append("    bpsAttack: ").append(toIndentedString(bpsAttack)).append("\n");
        sb.append("    totalBps: ").append(toIndentedString(totalBps)).append("\n");
        sb.append("    ppsIn: ").append(toIndentedString(ppsIn)).append("\n");
        sb.append("    ppsAttack: ").append(toIndentedString(ppsAttack)).append("\n");
        sb.append("    totalPps: ").append(toIndentedString(totalPps)).append("\n");
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
