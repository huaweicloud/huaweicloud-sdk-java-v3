package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDDoSPeakResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_kbytes_total")

    private Integer attackKbytesTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_pps_peak")

    private Integer attackPpsPeak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_pps_peak")

    private Integer inPpsPeak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_bps_peak")

    private Integer attackBpsPeak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_bps_peak")

    private Integer inBpsPeak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos_count")

    private Integer ddosCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "utime")

    private Integer utime;

    public ShowDDoSPeakResponse withAttackKbytesTotal(Integer attackKbytesTotal) {
        this.attackKbytesTotal = attackKbytesTotal;
        return this;
    }

    /**
     * 攻击流量
     * minimum: 0
     * maximum: 2000
     * @return attackKbytesTotal
     */
    public Integer getAttackKbytesTotal() {
        return attackKbytesTotal;
    }

    public void setAttackKbytesTotal(Integer attackKbytesTotal) {
        this.attackKbytesTotal = attackKbytesTotal;
    }

    public ShowDDoSPeakResponse withAttackPpsPeak(Integer attackPpsPeak) {
        this.attackPpsPeak = attackPpsPeak;
        return this;
    }

    /**
     * 攻击流量峰值包速率
     * minimum: 0
     * maximum: 2000
     * @return attackPpsPeak
     */
    public Integer getAttackPpsPeak() {
        return attackPpsPeak;
    }

    public void setAttackPpsPeak(Integer attackPpsPeak) {
        this.attackPpsPeak = attackPpsPeak;
    }

    public ShowDDoSPeakResponse withInPpsPeak(Integer inPpsPeak) {
        this.inPpsPeak = inPpsPeak;
        return this;
    }

    /**
     * 入流量峰值包速率
     * minimum: 0
     * maximum: 2000
     * @return inPpsPeak
     */
    public Integer getInPpsPeak() {
        return inPpsPeak;
    }

    public void setInPpsPeak(Integer inPpsPeak) {
        this.inPpsPeak = inPpsPeak;
    }

    public ShowDDoSPeakResponse withAttackBpsPeak(Integer attackBpsPeak) {
        this.attackBpsPeak = attackBpsPeak;
        return this;
    }

    /**
     * 攻击流量峰值
     * minimum: 0
     * maximum: 2000
     * @return attackBpsPeak
     */
    public Integer getAttackBpsPeak() {
        return attackBpsPeak;
    }

    public void setAttackBpsPeak(Integer attackBpsPeak) {
        this.attackBpsPeak = attackBpsPeak;
    }

    public ShowDDoSPeakResponse withInBpsPeak(Integer inBpsPeak) {
        this.inBpsPeak = inBpsPeak;
        return this;
    }

    /**
     * 入流量峰值
     * minimum: 0
     * maximum: 2000
     * @return inBpsPeak
     */
    public Integer getInBpsPeak() {
        return inBpsPeak;
    }

    public void setInBpsPeak(Integer inBpsPeak) {
        this.inBpsPeak = inBpsPeak;
    }

    public ShowDDoSPeakResponse withDdosCount(Integer ddosCount) {
        this.ddosCount = ddosCount;
        return this;
    }

    /**
     * 攻击数量
     * minimum: 0
     * maximum: 2000
     * @return ddosCount
     */
    public Integer getDdosCount() {
        return ddosCount;
    }

    public void setDdosCount(Integer ddosCount) {
        this.ddosCount = ddosCount;
    }

    public ShowDDoSPeakResponse withUtime(Integer utime) {
        this.utime = utime;
        return this;
    }

    /**
     * 峰值时间
     * minimum: 0
     * maximum: 2000
     * @return utime
     */
    public Integer getUtime() {
        return utime;
    }

    public void setUtime(Integer utime) {
        this.utime = utime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDDoSPeakResponse that = (ShowDDoSPeakResponse) obj;
        return Objects.equals(this.attackKbytesTotal, that.attackKbytesTotal)
            && Objects.equals(this.attackPpsPeak, that.attackPpsPeak) && Objects.equals(this.inPpsPeak, that.inPpsPeak)
            && Objects.equals(this.attackBpsPeak, that.attackBpsPeak) && Objects.equals(this.inBpsPeak, that.inBpsPeak)
            && Objects.equals(this.ddosCount, that.ddosCount) && Objects.equals(this.utime, that.utime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackKbytesTotal, attackPpsPeak, inPpsPeak, attackBpsPeak, inBpsPeak, ddosCount, utime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDDoSPeakResponse {\n");
        sb.append("    attackKbytesTotal: ").append(toIndentedString(attackKbytesTotal)).append("\n");
        sb.append("    attackPpsPeak: ").append(toIndentedString(attackPpsPeak)).append("\n");
        sb.append("    inPpsPeak: ").append(toIndentedString(inPpsPeak)).append("\n");
        sb.append("    attackBpsPeak: ").append(toIndentedString(attackBpsPeak)).append("\n");
        sb.append("    inBpsPeak: ").append(toIndentedString(inBpsPeak)).append("\n");
        sb.append("    ddosCount: ").append(toIndentedString(ddosCount)).append("\n");
        sb.append("    utime: ").append(toIndentedString(utime)).append("\n");
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
