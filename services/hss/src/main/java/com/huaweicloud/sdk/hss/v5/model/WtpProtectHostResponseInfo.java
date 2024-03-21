package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WtpProtectHostResponseInfo
 */
public class WtpProtectHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6")

    private String ipv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private String osBit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_protect_status")

    private String raspProtectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_tampering_times")

    private Long antiTamperingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_tampering_times")

    private Long detectTamperingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_detect_time")

    private Long lastDetectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_shutdown_status")

    private String scheduledShutdownStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    public WtpProtectHostResponseInfo withHostName(String hostName) {
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

    public WtpProtectHostResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public WtpProtectHostResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public WtpProtectHostResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public WtpProtectHostResponseInfo withIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    /**
     * 私有IPv6地址
     * @return ipv6
     */
    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public WtpProtectHostResponseInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 服务器组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public WtpProtectHostResponseInfo withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    /**
     * 操作系统位数
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public WtpProtectHostResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统（linux，windows）
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public WtpProtectHostResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态   - closed : 未开启   - opened : 防护中
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public WtpProtectHostResponseInfo withRaspProtectStatus(String raspProtectStatus) {
        this.raspProtectStatus = raspProtectStatus;
        return this;
    }

    /**
     * 动态网页防篡改状态   - closed : 未开启   - opened : 防护中
     * @return raspProtectStatus
     */
    public String getRaspProtectStatus() {
        return raspProtectStatus;
    }

    public void setRaspProtectStatus(String raspProtectStatus) {
        this.raspProtectStatus = raspProtectStatus;
    }

    public WtpProtectHostResponseInfo withAntiTamperingTimes(Long antiTamperingTimes) {
        this.antiTamperingTimes = antiTamperingTimes;
        return this;
    }

    /**
     * 已防御篡改攻击次数
     * minimum: 0
     * maximum: 2000000000
     * @return antiTamperingTimes
     */
    public Long getAntiTamperingTimes() {
        return antiTamperingTimes;
    }

    public void setAntiTamperingTimes(Long antiTamperingTimes) {
        this.antiTamperingTimes = antiTamperingTimes;
    }

    public WtpProtectHostResponseInfo withDetectTamperingTimes(Long detectTamperingTimes) {
        this.detectTamperingTimes = detectTamperingTimes;
        return this;
    }

    /**
     * 已发现篡改攻击
     * minimum: 0
     * maximum: 2000000000
     * @return detectTamperingTimes
     */
    public Long getDetectTamperingTimes() {
        return detectTamperingTimes;
    }

    public void setDetectTamperingTimes(Long detectTamperingTimes) {
        this.detectTamperingTimes = detectTamperingTimes;
    }

    public WtpProtectHostResponseInfo withLastDetectTime(Long lastDetectTime) {
        this.lastDetectTime = lastDetectTime;
        return this;
    }

    /**
     * 最近检测时间(ms)
     * minimum: 0
     * maximum: 4070880000000
     * @return lastDetectTime
     */
    public Long getLastDetectTime() {
        return lastDetectTime;
    }

    public void setLastDetectTime(Long lastDetectTime) {
        this.lastDetectTime = lastDetectTime;
    }

    public WtpProtectHostResponseInfo withScheduledShutdownStatus(String scheduledShutdownStatus) {
        this.scheduledShutdownStatus = scheduledShutdownStatus;
        return this;
    }

    /**
     * 定时关闭防护开关状态   - opened : 开启   - closed : 未开启
     * @return scheduledShutdownStatus
     */
    public String getScheduledShutdownStatus() {
        return scheduledShutdownStatus;
    }

    public void setScheduledShutdownStatus(String scheduledShutdownStatus) {
        this.scheduledShutdownStatus = scheduledShutdownStatus;
    }

    public WtpProtectHostResponseInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * Agent状态   - not_installed : agent未安装   - online : agent在线   - offline : agent不在线
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WtpProtectHostResponseInfo that = (WtpProtectHostResponseInfo) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.ipv6, that.ipv6) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.osBit, that.osBit) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.raspProtectStatus, that.raspProtectStatus)
            && Objects.equals(this.antiTamperingTimes, that.antiTamperingTimes)
            && Objects.equals(this.detectTamperingTimes, that.detectTamperingTimes)
            && Objects.equals(this.lastDetectTime, that.lastDetectTime)
            && Objects.equals(this.scheduledShutdownStatus, that.scheduledShutdownStatus)
            && Objects.equals(this.agentStatus, that.agentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName,
            hostId,
            publicIp,
            privateIp,
            ipv6,
            groupName,
            osBit,
            osType,
            protectStatus,
            raspProtectStatus,
            antiTamperingTimes,
            detectTamperingTimes,
            lastDetectTime,
            scheduledShutdownStatus,
            agentStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WtpProtectHostResponseInfo {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    raspProtectStatus: ").append(toIndentedString(raspProtectStatus)).append("\n");
        sb.append("    antiTamperingTimes: ").append(toIndentedString(antiTamperingTimes)).append("\n");
        sb.append("    detectTamperingTimes: ").append(toIndentedString(detectTamperingTimes)).append("\n");
        sb.append("    lastDetectTime: ").append(toIndentedString(lastDetectTime)).append("\n");
        sb.append("    scheduledShutdownStatus: ").append(toIndentedString(scheduledShutdownStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
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
