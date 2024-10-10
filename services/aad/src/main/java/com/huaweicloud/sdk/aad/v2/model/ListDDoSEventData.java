package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListDDoSEventData
 */
public class ListDDoSEventData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_ip")

    private String zoneIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_drop_kbps")

    private String maxDropKbps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_drop_pps")

    private String maxDropPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_in_kbps")

    private String maxInKbps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_in_pps")

    private String maxInPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_types")

    private String attackTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_ips")

    private String attackIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_ips_desc")

    private String attackIpsDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_status")

    private String attackStatus;

    public ListDDoSEventData withZoneIp(String zoneIp) {
        this.zoneIp = zoneIp;
        return this;
    }

    /**
     * 防护IP
     * @return zoneIp
     */
    public String getZoneIp() {
        return zoneIp;
    }

    public void setZoneIp(String zoneIp) {
        this.zoneIp = zoneIp;
    }

    public ListDDoSEventData withStartTime(String startTime) {
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

    public ListDDoSEventData withEndTime(String endTime) {
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

    public ListDDoSEventData withMaxDropKbps(String maxDropKbps) {
        this.maxDropKbps = maxDropKbps;
        return this;
    }

    /**
     * 攻击流量峰值，单位“kbps”
     * @return maxDropKbps
     */
    public String getMaxDropKbps() {
        return maxDropKbps;
    }

    public void setMaxDropKbps(String maxDropKbps) {
        this.maxDropKbps = maxDropKbps;
    }

    public ListDDoSEventData withMaxDropPps(String maxDropPps) {
        this.maxDropPps = maxDropPps;
        return this;
    }

    /**
     * 攻击报文数峰值，单位“pps”
     * @return maxDropPps
     */
    public String getMaxDropPps() {
        return maxDropPps;
    }

    public void setMaxDropPps(String maxDropPps) {
        this.maxDropPps = maxDropPps;
    }

    public ListDDoSEventData withMaxInKbps(String maxInKbps) {
        this.maxInKbps = maxInKbps;
        return this;
    }

    /**
     * 入流量峰值，单位“kbps”
     * @return maxInKbps
     */
    public String getMaxInKbps() {
        return maxInKbps;
    }

    public void setMaxInKbps(String maxInKbps) {
        this.maxInKbps = maxInKbps;
    }

    public ListDDoSEventData withMaxInPps(String maxInPps) {
        this.maxInPps = maxInPps;
        return this;
    }

    /**
     * 入报文数峰值，单位“pps”
     * @return maxInPps
     */
    public String getMaxInPps() {
        return maxInPps;
    }

    public void setMaxInPps(String maxInPps) {
        this.maxInPps = maxInPps;
    }

    public ListDDoSEventData withAttackTypes(String attackTypes) {
        this.attackTypes = attackTypes;
        return this;
    }

    /**
     * 攻击类型
     * @return attackTypes
     */
    public String getAttackTypes() {
        return attackTypes;
    }

    public void setAttackTypes(String attackTypes) {
        this.attackTypes = attackTypes;
    }

    public ListDDoSEventData withAttackIps(String attackIps) {
        this.attackIps = attackIps;
        return this;
    }

    /**
     * 攻击源IP
     * @return attackIps
     */
    public String getAttackIps() {
        return attackIps;
    }

    public void setAttackIps(String attackIps) {
        this.attackIps = attackIps;
    }

    public ListDDoSEventData withAttackIpsDesc(String attackIpsDesc) {
        this.attackIpsDesc = attackIpsDesc;
        return this;
    }

    /**
     * 攻击IP描述
     * @return attackIpsDesc
     */
    public String getAttackIpsDesc() {
        return attackIpsDesc;
    }

    public void setAttackIpsDesc(String attackIpsDesc) {
        this.attackIpsDesc = attackIpsDesc;
    }

    public ListDDoSEventData withAttackStatus(String attackStatus) {
        this.attackStatus = attackStatus;
        return this;
    }

    /**
     * 攻击状态
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
        ListDDoSEventData that = (ListDDoSEventData) obj;
        return Objects.equals(this.zoneIp, that.zoneIp) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.maxDropKbps, that.maxDropKbps)
            && Objects.equals(this.maxDropPps, that.maxDropPps) && Objects.equals(this.maxInKbps, that.maxInKbps)
            && Objects.equals(this.maxInPps, that.maxInPps) && Objects.equals(this.attackTypes, that.attackTypes)
            && Objects.equals(this.attackIps, that.attackIps) && Objects.equals(this.attackIpsDesc, that.attackIpsDesc)
            && Objects.equals(this.attackStatus, that.attackStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneIp,
            startTime,
            endTime,
            maxDropKbps,
            maxDropPps,
            maxInKbps,
            maxInPps,
            attackTypes,
            attackIps,
            attackIpsDesc,
            attackStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDDoSEventData {\n");
        sb.append("    zoneIp: ").append(toIndentedString(zoneIp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    maxDropKbps: ").append(toIndentedString(maxDropKbps)).append("\n");
        sb.append("    maxDropPps: ").append(toIndentedString(maxDropPps)).append("\n");
        sb.append("    maxInKbps: ").append(toIndentedString(maxInKbps)).append("\n");
        sb.append("    maxInPps: ").append(toIndentedString(maxInPps)).append("\n");
        sb.append("    attackTypes: ").append(toIndentedString(attackTypes)).append("\n");
        sb.append("    attackIps: ").append(toIndentedString(attackIps)).append("\n");
        sb.append("    attackIpsDesc: ").append(toIndentedString(attackIpsDesc)).append("\n");
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
