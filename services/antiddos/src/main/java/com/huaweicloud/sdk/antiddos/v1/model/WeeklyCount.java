package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * WeeklyCount
 */
public class WeeklyCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos_intercept_times")

    @JacksonXmlProperty(localName = "ddos_intercept_times")

    private Integer ddosInterceptTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos_blackhole_times")

    @JacksonXmlProperty(localName = "ddos_blackhole_times")

    private Integer ddosBlackholeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_attack_bps")

    @JacksonXmlProperty(localName = "max_attack_bps")

    private Integer maxAttackBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_attack_conns")

    @JacksonXmlProperty(localName = "max_attack_conns")

    private Integer maxAttackConns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_start_date")

    @JacksonXmlProperty(localName = "period_start_date")

    private Long periodStartDate;

    public WeeklyCount withDdosInterceptTimes(Integer ddosInterceptTimes) {
        this.ddosInterceptTimes = ddosInterceptTimes;
        return this;
    }

    /**
     * DDoS拦截次数
     * @return ddosInterceptTimes
     */
    public Integer getDdosInterceptTimes() {
        return ddosInterceptTimes;
    }

    public void setDdosInterceptTimes(Integer ddosInterceptTimes) {
        this.ddosInterceptTimes = ddosInterceptTimes;
    }

    public WeeklyCount withDdosBlackholeTimes(Integer ddosBlackholeTimes) {
        this.ddosBlackholeTimes = ddosBlackholeTimes;
        return this;
    }

    /**
     * DDoS黑洞次数
     * @return ddosBlackholeTimes
     */
    public Integer getDdosBlackholeTimes() {
        return ddosBlackholeTimes;
    }

    public void setDdosBlackholeTimes(Integer ddosBlackholeTimes) {
        this.ddosBlackholeTimes = ddosBlackholeTimes;
    }

    public WeeklyCount withMaxAttackBps(Integer maxAttackBps) {
        this.maxAttackBps = maxAttackBps;
        return this;
    }

    /**
     * 最大攻击流量
     * @return maxAttackBps
     */
    public Integer getMaxAttackBps() {
        return maxAttackBps;
    }

    public void setMaxAttackBps(Integer maxAttackBps) {
        this.maxAttackBps = maxAttackBps;
    }

    public WeeklyCount withMaxAttackConns(Integer maxAttackConns) {
        this.maxAttackConns = maxAttackConns;
        return this;
    }

    /**
     * 最大攻击连接数
     * @return maxAttackConns
     */
    public Integer getMaxAttackConns() {
        return maxAttackConns;
    }

    public void setMaxAttackConns(Integer maxAttackConns) {
        this.maxAttackConns = maxAttackConns;
    }

    public WeeklyCount withPeriodStartDate(Long periodStartDate) {
        this.periodStartDate = periodStartDate;
        return this;
    }

    /**
     * 开始时间
     * @return periodStartDate
     */
    public Long getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(Long periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeeklyCount weeklyCount = (WeeklyCount) o;
        return Objects.equals(this.ddosInterceptTimes, weeklyCount.ddosInterceptTimes)
            && Objects.equals(this.ddosBlackholeTimes, weeklyCount.ddosBlackholeTimes)
            && Objects.equals(this.maxAttackBps, weeklyCount.maxAttackBps)
            && Objects.equals(this.maxAttackConns, weeklyCount.maxAttackConns)
            && Objects.equals(this.periodStartDate, weeklyCount.periodStartDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddosInterceptTimes, ddosBlackholeTimes, maxAttackBps, maxAttackConns, periodStartDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeeklyCount {\n");
        sb.append("    ddosInterceptTimes: ").append(toIndentedString(ddosInterceptTimes)).append("\n");
        sb.append("    ddosBlackholeTimes: ").append(toIndentedString(ddosBlackholeTimes)).append("\n");
        sb.append("    maxAttackBps: ").append(toIndentedString(maxAttackBps)).append("\n");
        sb.append("    maxAttackConns: ").append(toIndentedString(maxAttackConns)).append("\n");
        sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
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
