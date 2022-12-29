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

    private IpaddressData ipaddress;

    public Ipaddresses withIpaddress(IpaddressData ipaddress) {
        this.ipaddress = ipaddress;
        return this;
    }

    public Ipaddresses withIpaddress(Consumer<IpaddressData> ipaddressSetter) {
        if (this.ipaddress == null) {
            this.ipaddress = new IpaddressData();
            ipaddressSetter.accept(this.ipaddress);
        }

        return this;
    }

    /**
     * Get ipaddress
     * @return ipaddress
     */
    public IpaddressData getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(IpaddressData ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ipaddresses ipaddresses = (Ipaddresses) o;
        return Objects.equals(this.ipaddress, ipaddresses.ipaddress);
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
