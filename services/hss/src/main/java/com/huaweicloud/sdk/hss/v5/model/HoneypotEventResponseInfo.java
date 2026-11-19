package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HoneypotEventResponseInfo
 */
public class HoneypotEventResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_ip")

    private String attackIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_num")

    private Integer attackNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_last_time")

    private Long attackLastTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_start_time")

    private Long attackStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_fingerprint")

    private String deviceFingerprint;

    public HoneypotEventResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HoneypotEventResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器的唯一标识ID **取值范围**: 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HoneypotEventResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: 主机上安装的杀毒Agent的唯一标识ID，用于关联主机与杀毒服务 **取值范围**: 字符长度1-64位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public HoneypotEventResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 服务器私有IP **取值范围**: 字符长度1-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public HoneypotEventResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**: 服务器弹性IP地址 **取值范围**: IPv4格式（长度7-15位）、IPv6格式（长度15-39位） 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public HoneypotEventResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 威胁等级 **取值范围**： - Security：安全 - Low: 低危 - Medium: 中危 - High: 高危 - Critical: 危急 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public HoneypotEventResponseInfo withAttackIp(String attackIp) {
        this.attackIp = attackIp;
        return this;
    }

    /**
     * **参数解释**: 攻击源IP **取值范围**: 字符长度1-128位 
     * @return attackIp
     */
    public String getAttackIp() {
        return attackIp;
    }

    public void setAttackIp(String attackIp) {
        this.attackIp = attackIp;
    }

    public HoneypotEventResponseInfo withAttackNum(Integer attackNum) {
        this.attackNum = attackNum;
        return this;
    }

    /**
     * **参数解释**: 攻击次数 **取值范围**: 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return attackNum
     */
    public Integer getAttackNum() {
        return attackNum;
    }

    public void setAttackNum(Integer attackNum) {
        this.attackNum = attackNum;
    }

    public HoneypotEventResponseInfo withAttackLastTime(Long attackLastTime) {
        this.attackLastTime = attackLastTime;
        return this;
    }

    /**
     * **参数解释**: 最近攻击时间，毫秒级时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return attackLastTime
     */
    public Long getAttackLastTime() {
        return attackLastTime;
    }

    public void setAttackLastTime(Long attackLastTime) {
        this.attackLastTime = attackLastTime;
    }

    public HoneypotEventResponseInfo withAttackStartTime(Long attackStartTime) {
        this.attackStartTime = attackStartTime;
        return this;
    }

    /**
     * **参数解释**: 攻击开始时间，毫秒级时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return attackStartTime
     */
    public Long getAttackStartTime() {
        return attackStartTime;
    }

    public void setAttackStartTime(Long attackStartTime) {
        this.attackStartTime = attackStartTime;
    }

    public HoneypotEventResponseInfo withDeviceFingerprint(String deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
        return this;
    }

    /**
     * **参数解释**: 设备指纹 **取值范围**: 字符长度1-512位 
     * @return deviceFingerprint
     */
    public String getDeviceFingerprint() {
        return deviceFingerprint;
    }

    public void setDeviceFingerprint(String deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HoneypotEventResponseInfo that = (HoneypotEventResponseInfo) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.attackIp, that.attackIp) && Objects.equals(this.attackNum, that.attackNum)
            && Objects.equals(this.attackLastTime, that.attackLastTime)
            && Objects.equals(this.attackStartTime, that.attackStartTime)
            && Objects.equals(this.deviceFingerprint, that.deviceFingerprint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName,
            hostId,
            agentId,
            privateIp,
            publicIp,
            severity,
            attackIp,
            attackNum,
            attackLastTime,
            attackStartTime,
            deviceFingerprint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HoneypotEventResponseInfo {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    attackIp: ").append(toIndentedString(attackIp)).append("\n");
        sb.append("    attackNum: ").append(toIndentedString(attackNum)).append("\n");
        sb.append("    attackLastTime: ").append(toIndentedString(attackLastTime)).append("\n");
        sb.append("    attackStartTime: ").append(toIndentedString(attackStartTime)).append("\n");
        sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
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
