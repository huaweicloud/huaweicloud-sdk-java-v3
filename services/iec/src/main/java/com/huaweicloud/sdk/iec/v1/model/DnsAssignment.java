package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DNS配置
 */
public class DnsAssignment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fqdn")

    @JacksonXmlProperty(localName = "fqdn")

    private String fqdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    @JacksonXmlProperty(localName = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    @JacksonXmlProperty(localName = "ip_address")

    private String ipAddress;

    public DnsAssignment withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * 端口内网fqdn
     * @return fqdn
     */
    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public DnsAssignment withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 端口hostname
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public DnsAssignment withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 端口IP地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DnsAssignment dnsAssignment = (DnsAssignment) o;
        return Objects.equals(this.fqdn, dnsAssignment.fqdn) && Objects.equals(this.hostname, dnsAssignment.hostname)
            && Objects.equals(this.ipAddress, dnsAssignment.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fqdn, hostname, ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsAssignment {\n");
        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
