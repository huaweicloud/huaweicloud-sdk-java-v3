package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class DnsAssignMent  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_address")
    
    private String ipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fqdn")
    
    private String fqdn;

    public DnsAssignMent withHostname(String hostname) {
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

    public DnsAssignMent withIpAddress(String ipAddress) {
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

    public DnsAssignMent withFqdn(String fqdn) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DnsAssignMent dnsAssignMent = (DnsAssignMent) o;
        return Objects.equals(this.hostname, dnsAssignMent.hostname) &&
            Objects.equals(this.ipAddress, dnsAssignMent.ipAddress) &&
            Objects.equals(this.fqdn, dnsAssignMent.fqdn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hostname, ipAddress, fqdn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsAssignMent {\n");
            sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
            sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
            sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
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

