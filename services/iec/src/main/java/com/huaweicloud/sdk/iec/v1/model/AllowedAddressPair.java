package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** IP/Mac对象 */
public class AllowedAddressPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_address")

    private String macAddress;

    public AllowedAddressPair withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /** IP地址 约束：不支持0.0.0.0/0 建议：如果allowed_address_pairs配置地址池较大的CIDR（掩码小于24位），建议为该port配置一个单独的安全组。
     * 
     * @return ipAddress */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AllowedAddressPair withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /** MAC地址
     * 
     * @return macAddress */
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllowedAddressPair allowedAddressPair = (AllowedAddressPair) o;
        return Objects.equals(this.ipAddress, allowedAddressPair.ipAddress)
            && Objects.equals(this.macAddress, allowedAddressPair.macAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, macAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowedAddressPair {\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
