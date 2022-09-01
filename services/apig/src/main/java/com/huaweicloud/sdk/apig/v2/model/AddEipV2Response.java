package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AddEipV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    @JacksonXmlProperty(localName = "eip_id")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_address")

    @JacksonXmlProperty(localName = "eip_address")

    private String eipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_status")

    @JacksonXmlProperty(localName = "eip_status")

    private String eipStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_ipv6_address")

    @JacksonXmlProperty(localName = "eip_ipv6_address")

    private String eipIpv6Address;

    public AddEipV2Response withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * 弹性公网IP编号
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public AddEipV2Response withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    /**
     * 弹性公网IP
     * @return eipAddress
     */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    public AddEipV2Response withEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
        return this;
    }

    /**
     * 弹性公网IP状态
     * @return eipStatus
     */
    public String getEipStatus() {
        return eipStatus;
    }

    public void setEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
    }

    public AddEipV2Response withEipIpv6Address(String eipIpv6Address) {
        this.eipIpv6Address = eipIpv6Address;
        return this;
    }

    /**
     * 弹性公网IP(IPV6)
     * @return eipIpv6Address
     */
    public String getEipIpv6Address() {
        return eipIpv6Address;
    }

    public void setEipIpv6Address(String eipIpv6Address) {
        this.eipIpv6Address = eipIpv6Address;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddEipV2Response addEipV2Response = (AddEipV2Response) o;
        return Objects.equals(this.eipId, addEipV2Response.eipId)
            && Objects.equals(this.eipAddress, addEipV2Response.eipAddress)
            && Objects.equals(this.eipStatus, addEipV2Response.eipStatus)
            && Objects.equals(this.eipIpv6Address, addEipV2Response.eipIpv6Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipId, eipAddress, eipStatus, eipIpv6Address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEipV2Response {\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
        sb.append("    eipStatus: ").append(toIndentedString(eipStatus)).append("\n");
        sb.append("    eipIpv6Address: ").append(toIndentedString(eipIpv6Address)).append("\n");
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
