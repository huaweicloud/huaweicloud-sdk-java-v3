package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 *  
 */
public class NovaAttachInterfaceFixedIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    public NovaAttachInterfaceFixedIp withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP地址。
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
        NovaAttachInterfaceFixedIp novaAttachInterfaceFixedIp = (NovaAttachInterfaceFixedIp) o;
        return Objects.equals(this.ipAddress, novaAttachInterfaceFixedIp.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaAttachInterfaceFixedIp {\n");
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
