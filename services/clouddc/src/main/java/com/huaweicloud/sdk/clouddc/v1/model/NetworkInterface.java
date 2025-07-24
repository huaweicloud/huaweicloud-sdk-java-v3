package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弹性网卡
 */
public class NetworkInterface {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv4_address")

    private String ipv4Address;

    public NetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * subnet id
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public NetworkInterface withIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
    }

    /**
     * 弹性网卡私有IPv4地址
     * @return ipv4Address
     */
    public String getIpv4Address() {
        return ipv4Address;
    }

    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkInterface that = (NetworkInterface) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.ipv4Address, that.ipv4Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipv4Address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkInterface {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
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
