package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServiceNetwork
 */
public class ServiceNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IPv4CIDR")

    private String ipv4CIDR;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IPv6CIDR")

    private String ipv6CIDR;

    public ServiceNetwork withIpv4CIDR(String ipv4CIDR) {
        this.ipv4CIDR = ipv4CIDR;
        return this;
    }

    /**
     * **参数解释：** kubernetes clusterIP IPv4 CIDR取值范围。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 默认为\"10.247.0.0/16\"。 
     * @return ipv4CIDR
     */
    public String getIpv4CIDR() {
        return ipv4CIDR;
    }

    public void setIpv4CIDR(String ipv4CIDR) {
        this.ipv4CIDR = ipv4CIDR;
    }

    public ServiceNetwork withIpv6CIDR(String ipv6CIDR) {
        this.ipv6CIDR = ipv6CIDR;
        return this;
    }

    /**
     * **参数解释：** kubernetes clusterIP IPv6 CIDR取值范围。 **约束限制：** 仅开启IPV6双栈的Turbo集群支持配置IPv6服务网段。 **取值范围：** 不涉及 **默认取值：** Turbo集群默认为\"fc00::/112\" CCE集群默认为\"fd00:1234::/120\" 
     * @return ipv6CIDR
     */
    public String getIpv6CIDR() {
        return ipv6CIDR;
    }

    public void setIpv6CIDR(String ipv6CIDR) {
        this.ipv6CIDR = ipv6CIDR;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceNetwork that = (ServiceNetwork) obj;
        return Objects.equals(this.ipv4CIDR, that.ipv4CIDR) && Objects.equals(this.ipv6CIDR, that.ipv6CIDR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipv4CIDR, ipv6CIDR);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceNetwork {\n");
        sb.append("    ipv4CIDR: ").append(toIndentedString(ipv4CIDR)).append("\n");
        sb.append("    ipv6CIDR: ").append(toIndentedString(ipv6CIDR)).append("\n");
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
