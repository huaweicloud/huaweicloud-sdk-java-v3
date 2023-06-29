package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 熔断配置，当502/504请求数量或读等待URL请求数量以及占比阈值达到您设置的值时，将触发WAF熔断功能开关，实现宕机保护和读等待URL请求保护
 */
public class CircuitBreaker {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch")

    private Boolean _switch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_num")

    private Integer deadNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_ratio")

    private BigDecimal deadRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_time")

    private Integer blockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "superposition_num")

    private Integer superpositionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suspend_num")

    private Integer suspendNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sus_block_time")

    private Integer susBlockTime;

    public CircuitBreaker withSwitch(Boolean _switch) {
        this._switch = _switch;
        return this;
    }

    /**
     * 熔断开关，是否开启连接保护   - true：开启连接保护   - false: 关闭连接保护 
     * @return _switch
     */
    public Boolean getSwitch() {
        return _switch;
    }

    public void setSwitch(Boolean _switch) {
        this._switch = _switch;
    }

    public CircuitBreaker withDeadNum(Integer deadNum) {
        this.deadNum = deadNum;
        return this;
    }

    /**
     * 502/504数量阈值，每30s累加的502/504数量阈值
     * @return deadNum
     */
    public Integer getDeadNum() {
        return deadNum;
    }

    public void setDeadNum(Integer deadNum) {
        this.deadNum = deadNum;
    }

    public CircuitBreaker withDeadRatio(BigDecimal deadRatio) {
        this.deadRatio = deadRatio;
        return this;
    }

    /**
     * 502/504数量占比(%)，总请求数量中502/504数量占比达到所设定值，并且与数量阈值同时满足时触发宕机保护
     * @return deadRatio
     */
    public BigDecimal getDeadRatio() {
        return deadRatio;
    }

    public void setDeadRatio(BigDecimal deadRatio) {
        this.deadRatio = deadRatio;
    }

    public CircuitBreaker withBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * 初次触发宕机的保护时间，即WAF将停止转发用户请求的时间。
     * @return blockTime
     */
    public Integer getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }

    public CircuitBreaker withSuperpositionNum(Integer superpositionNum) {
        this.superpositionNum = superpositionNum;
        return this;
    }

    /**
     * 连续触发时，保护时间延长最大倍数，叠加周期为3600s。例如，“初次保护时间”设置为180s，“连续触发叠加系数”设置为3。   - 当触发次数为2（即小于3）时，保护时间为360s。   - 当次数大于等于3时，保护时间为540s。   - 当累计保护时间超过1小时（3600s），叠加次数会从头计数。
     * @return superpositionNum
     */
    public Integer getSuperpositionNum() {
        return superpositionNum;
    }

    public void setSuperpositionNum(Integer superpositionNum) {
        this.superpositionNum = superpositionNum;
    }

    public CircuitBreaker withSuspendNum(Integer suspendNum) {
        this.suspendNum = suspendNum;
        return this;
    }

    /**
     * 读等待URL请求数量阈值，读等待URL请求数量到达设定值即触发连接保护
     * @return suspendNum
     */
    public Integer getSuspendNum() {
        return suspendNum;
    }

    public void setSuspendNum(Integer suspendNum) {
        this.suspendNum = suspendNum;
    }

    public CircuitBreaker withSusBlockTime(Integer susBlockTime) {
        this.susBlockTime = susBlockTime;
        return this;
    }

    /**
     * 读等待URL请求数量超过阈值后的熔断时间，达到数量阈值所触发的保护时间，即WAF将停止转发用户请求的时间。
     * @return susBlockTime
     */
    public Integer getSusBlockTime() {
        return susBlockTime;
    }

    public void setSusBlockTime(Integer susBlockTime) {
        this.susBlockTime = susBlockTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CircuitBreaker that = (CircuitBreaker) obj;
        return Objects.equals(this._switch, that._switch) && Objects.equals(this.deadNum, that.deadNum)
            && Objects.equals(this.deadRatio, that.deadRatio) && Objects.equals(this.blockTime, that.blockTime)
            && Objects.equals(this.superpositionNum, that.superpositionNum)
            && Objects.equals(this.suspendNum, that.suspendNum) && Objects.equals(this.susBlockTime, that.susBlockTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_switch, deadNum, deadRatio, blockTime, superpositionNum, suspendNum, susBlockTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CircuitBreaker {\n");
        sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
        sb.append("    deadNum: ").append(toIndentedString(deadNum)).append("\n");
        sb.append("    deadRatio: ").append(toIndentedString(deadRatio)).append("\n");
        sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
        sb.append("    superpositionNum: ").append(toIndentedString(superpositionNum)).append("\n");
        sb.append("    suspendNum: ").append(toIndentedString(suspendNum)).append("\n");
        sb.append("    susBlockTime: ").append(toIndentedString(susBlockTime)).append("\n");
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
