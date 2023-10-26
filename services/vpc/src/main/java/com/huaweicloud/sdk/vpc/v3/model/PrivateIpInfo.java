package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 端口私有IP信息
 */
public class PrivateIpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private String subnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    public PrivateIpInfo withSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    /**
     * 端口所属子网ID
     * @return subnetCidrId
     */
    public String getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public PrivateIpInfo withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 端口私有IP地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateIpInfo that = (PrivateIpInfo) obj;
        return Objects.equals(this.subnetCidrId, that.subnetCidrId) && Objects.equals(this.ipAddress, that.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetCidrId, ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateIpInfo {\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
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
