package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机接入信息
 */
public class ConnectInfoAccessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_ip")

    private String accessIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_ip")

    private String intranetIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_ipv6")

    private String accessIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_port")

    private Integer accessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket")

    private String ticket;

    public ConnectInfoAccessInfo withAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }

    /**
     * 云手机实例的访问IP
     * @return accessIp
     */
    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public ConnectInfoAccessInfo withIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }

    /**
     * 云手机实例的内网访问IP
     * @return intranetIp
     */
    public String getIntranetIp() {
        return intranetIp;
    }

    public void setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
    }

    public ConnectInfoAccessInfo withAccessIpv6(String accessIpv6) {
        this.accessIpv6 = accessIpv6;
        return this;
    }

    /**
     * 云手机服务器IPv6 IP
     * @return accessIpv6
     */
    public String getAccessIpv6() {
        return accessIpv6;
    }

    public void setAccessIpv6(String accessIpv6) {
        this.accessIpv6 = accessIpv6;
    }

    public ConnectInfoAccessInfo withAccessPort(Integer accessPort) {
        this.accessPort = accessPort;
        return this;
    }

    /**
     * 云手机实例的访问端口
     * minimum: 0
     * maximum: 8096
     * @return accessPort
     */
    public Integer getAccessPort() {
        return accessPort;
    }

    public void setAccessPort(Integer accessPort) {
        this.accessPort = accessPort;
    }

    public ConnectInfoAccessInfo withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 本次接入的会话ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ConnectInfoAccessInfo withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间戳
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ConnectInfoAccessInfo withTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }

    /**
     * 签名令牌
     * @return ticket
     */
    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectInfoAccessInfo that = (ConnectInfoAccessInfo) obj;
        return Objects.equals(this.accessIp, that.accessIp) && Objects.equals(this.intranetIp, that.intranetIp)
            && Objects.equals(this.accessIpv6, that.accessIpv6) && Objects.equals(this.accessPort, that.accessPort)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.ticket, that.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessIp, intranetIp, accessIpv6, accessPort, sessionId, timestamp, ticket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectInfoAccessInfo {\n");
        sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
        sb.append("    intranetIp: ").append(toIndentedString(intranetIp)).append("\n");
        sb.append("    accessIpv6: ").append(toIndentedString(accessIpv6)).append("\n");
        sb.append("    accessPort: ").append(toIndentedString(accessPort)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
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
