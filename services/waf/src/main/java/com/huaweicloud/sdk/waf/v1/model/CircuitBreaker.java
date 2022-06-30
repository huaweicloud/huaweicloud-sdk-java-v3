package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 熔断配置
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
     * 熔断开关
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
     * 源站不可达数量阈值
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
     * 源站不可达比例阈值
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
     * 源站不可达熔断时间
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
     * 熔断阈值叠加次数
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
     * 连接数占用阈值
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
     * 连接数占用熔断时间
     * @return susBlockTime
     */
    public Integer getSusBlockTime() {
        return susBlockTime;
    }

    public void setSusBlockTime(Integer susBlockTime) {
        this.susBlockTime = susBlockTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CircuitBreaker circuitBreaker = (CircuitBreaker) o;
        return Objects.equals(this._switch, circuitBreaker._switch)
            && Objects.equals(this.deadNum, circuitBreaker.deadNum)
            && Objects.equals(this.deadRatio, circuitBreaker.deadRatio)
            && Objects.equals(this.blockTime, circuitBreaker.blockTime)
            && Objects.equals(this.superpositionNum, circuitBreaker.superpositionNum)
            && Objects.equals(this.suspendNum, circuitBreaker.suspendNum)
            && Objects.equals(this.susBlockTime, circuitBreaker.susBlockTime);
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
