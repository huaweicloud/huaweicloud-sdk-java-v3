package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPeakResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_kbps_peak")

    private BigDecimal attackKbpsPeak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_kbps_peak")

    private BigDecimal inKbpsPeak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos_count")

    private BigDecimal ddosCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private BigDecimal timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip")

    private String vip;

    public ListPeakResponse withAttackKbpsPeak(BigDecimal attackKbpsPeak) {
        this.attackKbpsPeak = attackKbpsPeak;
        return this;
    }

    /**
     * 攻击峰值
     * minimum: 0
     * maximum: 1E+8
     * @return attackKbpsPeak
     */
    public BigDecimal getAttackKbpsPeak() {
        return attackKbpsPeak;
    }

    public void setAttackKbpsPeak(BigDecimal attackKbpsPeak) {
        this.attackKbpsPeak = attackKbpsPeak;
    }

    public ListPeakResponse withInKbpsPeak(BigDecimal inKbpsPeak) {
        this.inKbpsPeak = inKbpsPeak;
        return this;
    }

    /**
     * 流量峰值
     * minimum: 0
     * maximum: 1E+8
     * @return inKbpsPeak
     */
    public BigDecimal getInKbpsPeak() {
        return inKbpsPeak;
    }

    public void setInKbpsPeak(BigDecimal inKbpsPeak) {
        this.inKbpsPeak = inKbpsPeak;
    }

    public ListPeakResponse withDdosCount(BigDecimal ddosCount) {
        this.ddosCount = ddosCount;
        return this;
    }

    /**
     * 攻击次数
     * minimum: 0
     * maximum: 1E+8
     * @return ddosCount
     */
    public BigDecimal getDdosCount() {
        return ddosCount;
    }

    public void setDdosCount(BigDecimal ddosCount) {
        this.ddosCount = ddosCount;
    }

    public ListPeakResponse withTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 攻击峰值发生时间点
     * minimum: 0
     * maximum: 4.8038112E+12
     * @return timestamp
     */
    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public ListPeakResponse withVip(String vip) {
        this.vip = vip;
        return this;
    }

    /**
     * 高防IP
     * @return vip
     */
    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPeakResponse that = (ListPeakResponse) obj;
        return Objects.equals(this.attackKbpsPeak, that.attackKbpsPeak)
            && Objects.equals(this.inKbpsPeak, that.inKbpsPeak) && Objects.equals(this.ddosCount, that.ddosCount)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.vip, that.vip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackKbpsPeak, inKbpsPeak, ddosCount, timestamp, vip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPeakResponse {\n");
        sb.append("    attackKbpsPeak: ").append(toIndentedString(attackKbpsPeak)).append("\n");
        sb.append("    inKbpsPeak: ").append(toIndentedString(inKbpsPeak)).append("\n");
        sb.append("    ddosCount: ").append(toIndentedString(ddosCount)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
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
