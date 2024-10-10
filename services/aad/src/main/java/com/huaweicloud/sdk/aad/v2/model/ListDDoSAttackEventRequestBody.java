package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListDDoSAttackEventRequestBody
 */
public class ListDDoSAttackEventRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_flow_low")

    private String attackFlowLow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_flow_up")

    private String attackFlowUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_status")

    private String attackStatus;

    public ListDDoSAttackEventRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（毫秒时间戳）
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListDDoSAttackEventRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间（毫秒时间戳）
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListDDoSAttackEventRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDDoSAttackEventRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制条数，范围1-100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDDoSAttackEventRequestBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 高防ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ListDDoSAttackEventRequestBody withAttackFlowLow(String attackFlowLow) {
        this.attackFlowLow = attackFlowLow;
        return this;
    }

    /**
     * 攻击流量最小值
     * @return attackFlowLow
     */
    public String getAttackFlowLow() {
        return attackFlowLow;
    }

    public void setAttackFlowLow(String attackFlowLow) {
        this.attackFlowLow = attackFlowLow;
    }

    public ListDDoSAttackEventRequestBody withAttackFlowUp(String attackFlowUp) {
        this.attackFlowUp = attackFlowUp;
        return this;
    }

    /**
     * 攻击流量最大值
     * @return attackFlowUp
     */
    public String getAttackFlowUp() {
        return attackFlowUp;
    }

    public void setAttackFlowUp(String attackFlowUp) {
        this.attackFlowUp = attackFlowUp;
    }

    public ListDDoSAttackEventRequestBody withAttackStatus(String attackStatus) {
        this.attackStatus = attackStatus;
        return this;
    }

    /**
     * 攻击状态：attack-攻击; normal-结束攻击
     * @return attackStatus
     */
    public String getAttackStatus() {
        return attackStatus;
    }

    public void setAttackStatus(String attackStatus) {
        this.attackStatus = attackStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDDoSAttackEventRequestBody that = (ListDDoSAttackEventRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.attackFlowLow, that.attackFlowLow)
            && Objects.equals(this.attackFlowUp, that.attackFlowUp)
            && Objects.equals(this.attackStatus, that.attackStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, offset, limit, ip, attackFlowLow, attackFlowUp, attackStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDDoSAttackEventRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    attackFlowLow: ").append(toIndentedString(attackFlowLow)).append("\n");
        sb.append("    attackFlowUp: ").append(toIndentedString(attackFlowUp)).append("\n");
        sb.append("    attackStatus: ").append(toIndentedString(attackStatus)).append("\n");
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
