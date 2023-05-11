package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 *  
 */
public class NovaServerInterfaceFixedIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    public NovaServerInterfaceFixedIp withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 网卡私网IP信息。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public NovaServerInterfaceFixedIp withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 网卡私网IP对应子网信息。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServerInterfaceFixedIp novaServerInterfaceFixedIp = (NovaServerInterfaceFixedIp) o;
        return Objects.equals(this.ipAddress, novaServerInterfaceFixedIp.ipAddress)
            && Objects.equals(this.subnetId, novaServerInterfaceFixedIp.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerInterfaceFixedIp {\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
