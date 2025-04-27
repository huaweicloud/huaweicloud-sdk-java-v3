package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Ipaddresses
 */
public class Ipaddresses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddress")

    private IpaddressInfo ipaddress;

    public Ipaddresses withIpaddress(IpaddressInfo ipaddress) {
        this.ipaddress = ipaddress;
        return this;
    }

    public Ipaddresses withIpaddress(Consumer<IpaddressInfo> ipaddressSetter) {
        if (this.ipaddress == null) {
            this.ipaddress = new IpaddressInfo();
            ipaddressSetter.accept(this.ipaddress);
        }

        return this;
    }

    /**
     * Get ipaddress
     * @return ipaddress
     */
    public IpaddressInfo getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(IpaddressInfo ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ipaddresses that = (Ipaddresses) obj;
        return Objects.equals(this.ipaddress, that.ipaddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipaddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ipaddresses {\n");
        sb.append("    ipaddress: ").append(toIndentedString(ipaddress)).append("\n");
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
