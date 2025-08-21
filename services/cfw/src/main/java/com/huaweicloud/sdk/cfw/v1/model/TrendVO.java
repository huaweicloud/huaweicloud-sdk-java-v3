package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrendVO
 */
public class TrendVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agg_time")

    private Long aggTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bps")

    private Double bps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny")

    private Long deny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_bps")

    private Double inBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_bps")

    private Double outBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit")

    private Long permit;

    public TrendVO withAggTime(Long aggTime) {
        this.aggTime = aggTime;
        return this;
    }

    /**
     * **参数解释**： 聚合时间 **取值范围**： 不涉及
     * @return aggTime
     */
    public Long getAggTime() {
        return aggTime;
    }

    public void setAggTime(Long aggTime) {
        this.aggTime = aggTime;
    }

    public TrendVO withBps(Double bps) {
        this.bps = bps;
        return this;
    }

    /**
     * **参数解释**： 带宽 **取值范围**： 不涉及
     * @return bps
     */
    public Double getBps() {
        return bps;
    }

    public void setBps(Double bps) {
        this.bps = bps;
    }

    public TrendVO withDeny(Long deny) {
        this.deny = deny;
        return this;
    }

    /**
     * **参数解释**： 阻断数量 **取值范围**： 不涉及
     * @return deny
     */
    public Long getDeny() {
        return deny;
    }

    public void setDeny(Long deny) {
        this.deny = deny;
    }

    public TrendVO withInBps(Double inBps) {
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

    public TrendVO withOutBps(Double outBps) {
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

    public TrendVO withPermit(Long permit) {
        this.permit = permit;
        return this;
    }

    /**
     * **参数解释**： 允许数量 **取值范围**： 不涉及
     * @return permit
     */
    public Long getPermit() {
        return permit;
    }

    public void setPermit(Long permit) {
        this.permit = permit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrendVO that = (TrendVO) obj;
        return Objects.equals(this.aggTime, that.aggTime) && Objects.equals(this.bps, that.bps)
            && Objects.equals(this.deny, that.deny) && Objects.equals(this.inBps, that.inBps)
            && Objects.equals(this.outBps, that.outBps) && Objects.equals(this.permit, that.permit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggTime, bps, deny, inBps, outBps, permit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendVO {\n");
        sb.append("    aggTime: ").append(toIndentedString(aggTime)).append("\n");
        sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
        sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
        sb.append("    inBps: ").append(toIndentedString(inBps)).append("\n");
        sb.append("    outBps: ").append(toIndentedString(outBps)).append("\n");
        sb.append("    permit: ").append(toIndentedString(permit)).append("\n");
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
