package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostRaspProtectHistoryResponseInfo
 */
public class HostRaspProtectHistoryResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

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

    public HostRaspProtectHistoryResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 服务器ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public HostRaspProtectHistoryResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HostRaspProtectHistoryResponseInfo withAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }

    /**
     * 动态网页防篡改的告警时间(ms)
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
     * 攻击主机的源IP
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
     * 攻击请求的URL
     * @return attackedUrl
     */
    public String getAttackedUrl() {
        return attackedUrl;
    }

    public void setAttackedUrl(String attackedUrl) {
        this.attackedUrl = attackedUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostRaspProtectHistoryResponseInfo that = (HostRaspProtectHistoryResponseInfo) obj;
        return Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.alarmTime, that.alarmTime) && Objects.equals(this.threatType, that.threatType)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.sourceIp, that.sourceIp)
            && Objects.equals(this.attackedUrl, that.attackedUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIp, hostName, alarmTime, threatType, alarmLevel, sourceIp, attackedUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostRaspProtectHistoryResponseInfo {\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
