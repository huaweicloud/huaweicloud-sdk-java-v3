package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisassociateEndpointIpaddressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddress_id")

    private String ipaddressId;

    public DisassociateEndpointIpaddressRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 待解绑定的ip地址所属endpoint的ID。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public DisassociateEndpointIpaddressRequest withIpaddressId(String ipaddressId) {
        this.ipaddressId = ipaddressId;
        return this;
    }

    /**
     * 待解绑定ip地址的ID。
     * @return ipaddressId
     */
    public String getIpaddressId() {
        return ipaddressId;
    }

    public void setIpaddressId(String ipaddressId) {
        this.ipaddressId = ipaddressId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateEndpointIpaddressRequest disassociateEndpointIpaddressRequest =
            (DisassociateEndpointIpaddressRequest) o;
        return Objects.equals(this.endpointId, disassociateEndpointIpaddressRequest.endpointId)
            && Objects.equals(this.ipaddressId, disassociateEndpointIpaddressRequest.ipaddressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointId, ipaddressId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateEndpointIpaddressRequest {\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    ipaddressId: ").append(toIndentedString(ipaddressId)).append("\n");
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
