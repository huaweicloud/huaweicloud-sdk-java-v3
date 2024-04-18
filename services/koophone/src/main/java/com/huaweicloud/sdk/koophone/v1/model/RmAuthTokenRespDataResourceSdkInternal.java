package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内网信息
 */
public class RmAuthTokenRespDataResourceSdkInternal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aport")

    private String aport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atype")

    private String atype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_ipv6")

    private String addressIpv6;

    public RmAuthTokenRespDataResourceSdkInternal withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 内网ip地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RmAuthTokenRespDataResourceSdkInternal withAport(String aport) {
        this.aport = aport;
        return this;
    }

    /**
     * 音频端口
     * @return aport
     */
    public String getAport() {
        return aport;
    }

    public void setAport(String aport) {
        this.aport = aport;
    }

    public RmAuthTokenRespDataResourceSdkInternal withAtype(String atype) {
        this.atype = atype;
        return this;
    }

    /**
     * 音频类型
     * @return atype
     */
    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public RmAuthTokenRespDataResourceSdkInternal withAddressIpv6(String addressIpv6) {
        this.addressIpv6 = addressIpv6;
        return this;
    }

    /**
     * ipv6地址
     * @return addressIpv6
     */
    public String getAddressIpv6() {
        return addressIpv6;
    }

    public void setAddressIpv6(String addressIpv6) {
        this.addressIpv6 = addressIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmAuthTokenRespDataResourceSdkInternal that = (RmAuthTokenRespDataResourceSdkInternal) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.aport, that.aport)
            && Objects.equals(this.atype, that.atype) && Objects.equals(this.addressIpv6, that.addressIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, aport, atype, addressIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmAuthTokenRespDataResourceSdkInternal {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    aport: ").append(toIndentedString(aport)).append("\n");
        sb.append("    atype: ").append(toIndentedString(atype)).append("\n");
        sb.append("    addressIpv6: ").append(toIndentedString(addressIpv6)).append("\n");
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
