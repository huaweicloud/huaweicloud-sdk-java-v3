package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostRaspProtectHistoryResponseInfo
 */
public class HostRaspProtectHistoryResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_time")

    private Long alarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threat_type")

    private String threatType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attacked_url")

    private String attackedUrl;

    public HostRaspProtectHistoryResponseInfo withAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }

    /**
     * 告警时间
     * minimum: 0
     * maximum: 4070880000000
     * @return alarmTime
     */
    public Long getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
    }

    public HostRaspProtectHistoryResponseInfo withThreatType(String threatType) {
        this.threatType = threatType;
        return this;
    }

    /**
     * 威胁类型
     * @return threatType
     */
    public String getThreatType() {
        return threatType;
    }

    public void setThreatType(String threatType) {
        this.threatType = threatType;
    }

    public HostRaspProtectHistoryResponseInfo withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别
     * minimum: 0
     * maximum: 100
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public HostRaspProtectHistoryResponseInfo withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * 源IP
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public HostRaspProtectHistoryResponseInfo withAttackedUrl(String attackedUrl) {
        this.attackedUrl = attackedUrl;
        return this;
    }

    /**
     * 攻击URL
     * @return attackedUrl
     */
    public String getAttackedUrl() {
        return attackedUrl;
    }

    public void setAttackedUrl(String attackedUrl) {
        this.attackedUrl = attackedUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostRaspProtectHistoryResponseInfo hostRaspProtectHistoryResponseInfo = (HostRaspProtectHistoryResponseInfo) o;
        return Objects.equals(this.alarmTime, hostRaspProtectHistoryResponseInfo.alarmTime)
            && Objects.equals(this.threatType, hostRaspProtectHistoryResponseInfo.threatType)
            && Objects.equals(this.alarmLevel, hostRaspProtectHistoryResponseInfo.alarmLevel)
            && Objects.equals(this.sourceIp, hostRaspProtectHistoryResponseInfo.sourceIp)
            && Objects.equals(this.attackedUrl, hostRaspProtectHistoryResponseInfo.attackedUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmTime, threatType, alarmLevel, sourceIp, attackedUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostRaspProtectHistoryResponseInfo {\n");
        sb.append("    alarmTime: ").append(toIndentedString(alarmTime)).append("\n");
        sb.append("    threatType: ").append(toIndentedString(threatType)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    attackedUrl: ").append(toIndentedString(attackedUrl)).append("\n");
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
