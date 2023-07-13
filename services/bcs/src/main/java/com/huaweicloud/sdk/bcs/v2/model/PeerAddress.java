package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PeerAddress
 */
public class PeerAddress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_port")

    private String domainPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_port")

    private String ipPort;

    public PeerAddress withDomainPort(String domainPort) {
        this.domainPort = domainPort;
        return this;
    }

    /**
     * 域名地址
     * @return domainPort
     */
    public String getDomainPort() {
        return domainPort;
    }

    public void setDomainPort(String domainPort) {
        this.domainPort = domainPort;
    }

    public PeerAddress withIpPort(String ipPort) {
        this.ipPort = ipPort;
        return this;
    }

    /**
     * IP地址
     * @return ipPort
     */
    public String getIpPort() {
        return ipPort;
    }

    public void setIpPort(String ipPort) {
        this.ipPort = ipPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeerAddress that = (PeerAddress) obj;
        return Objects.equals(this.domainPort, that.domainPort) && Objects.equals(this.ipPort, that.ipPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainPort, ipPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeerAddress {\n");
        sb.append("    domainPort: ").append(toIndentedString(domainPort)).append("\n");
        sb.append("    ipPort: ").append(toIndentedString(ipPort)).append("\n");
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
