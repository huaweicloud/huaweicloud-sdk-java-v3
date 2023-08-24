package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SessionConfiguration
 */
public class SessionConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_session_expire_time")

    private Integer tcpSessionExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udp_session_expire_time")

    private Integer udpSessionExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icmp_session_expire_time")

    private Integer icmpSessionExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_time_wait_time")

    private Integer tcpTimeWaitTime;

    public SessionConfiguration withTcpSessionExpireTime(Integer tcpSessionExpireTime) {
        this.tcpSessionExpireTime = tcpSessionExpireTime;
        return this;
    }

    /**
     * TCP会话过期时间。
     * minimum: 40
     * maximum: 7200
     * @return tcpSessionExpireTime
     */
    public Integer getTcpSessionExpireTime() {
        return tcpSessionExpireTime;
    }

    public void setTcpSessionExpireTime(Integer tcpSessionExpireTime) {
        this.tcpSessionExpireTime = tcpSessionExpireTime;
    }

    public SessionConfiguration withUdpSessionExpireTime(Integer udpSessionExpireTime) {
        this.udpSessionExpireTime = udpSessionExpireTime;
        return this;
    }

    /**
     * UDP会话过期时间。
     * minimum: 40
     * maximum: 7200
     * @return udpSessionExpireTime
     */
    public Integer getUdpSessionExpireTime() {
        return udpSessionExpireTime;
    }

    public void setUdpSessionExpireTime(Integer udpSessionExpireTime) {
        this.udpSessionExpireTime = udpSessionExpireTime;
    }

    public SessionConfiguration withIcmpSessionExpireTime(Integer icmpSessionExpireTime) {
        this.icmpSessionExpireTime = icmpSessionExpireTime;
        return this;
    }

    /**
     * ICMP会话过期时间。
     * minimum: 10
     * maximum: 7200
     * @return icmpSessionExpireTime
     */
    public Integer getIcmpSessionExpireTime() {
        return icmpSessionExpireTime;
    }

    public void setIcmpSessionExpireTime(Integer icmpSessionExpireTime) {
        this.icmpSessionExpireTime = icmpSessionExpireTime;
    }

    public SessionConfiguration withTcpTimeWaitTime(Integer tcpTimeWaitTime) {
        this.tcpTimeWaitTime = tcpTimeWaitTime;
        return this;
    }

    /**
     * TCP连接关闭时TIME_WAIT状态持续时间。
     * minimum: 0
     * maximum: 1800
     * @return tcpTimeWaitTime
     */
    public Integer getTcpTimeWaitTime() {
        return tcpTimeWaitTime;
    }

    public void setTcpTimeWaitTime(Integer tcpTimeWaitTime) {
        this.tcpTimeWaitTime = tcpTimeWaitTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionConfiguration that = (SessionConfiguration) obj;
        return Objects.equals(this.tcpSessionExpireTime, that.tcpSessionExpireTime)
            && Objects.equals(this.udpSessionExpireTime, that.udpSessionExpireTime)
            && Objects.equals(this.icmpSessionExpireTime, that.icmpSessionExpireTime)
            && Objects.equals(this.tcpTimeWaitTime, that.tcpTimeWaitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tcpSessionExpireTime, udpSessionExpireTime, icmpSessionExpireTime, tcpTimeWaitTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionConfiguration {\n");
        sb.append("    tcpSessionExpireTime: ").append(toIndentedString(tcpSessionExpireTime)).append("\n");
        sb.append("    udpSessionExpireTime: ").append(toIndentedString(udpSessionExpireTime)).append("\n");
        sb.append("    icmpSessionExpireTime: ").append(toIndentedString(icmpSessionExpireTime)).append("\n");
        sb.append("    tcpTimeWaitTime: ").append(toIndentedString(tcpTimeWaitTime)).append("\n");
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
