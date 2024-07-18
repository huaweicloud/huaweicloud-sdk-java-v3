package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowP2cVgwResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2c_vpn_gateway")

    private ShowResponseP2cVgw p2cVpnGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowP2cVgwResponse withP2cVpnGateway(ShowResponseP2cVgw p2cVpnGateway) {
        this.p2cVpnGateway = p2cVpnGateway;
        return this;
    }

    public ShowP2cVgwResponse withP2cVpnGateway(Consumer<ShowResponseP2cVgw> p2cVpnGatewaySetter) {
        if (this.p2cVpnGateway == null) {
            this.p2cVpnGateway = new ShowResponseP2cVgw();
            p2cVpnGatewaySetter.accept(this.p2cVpnGateway);
        }

        return this;
    }

    /**
     * Get p2cVpnGateway
     * @return p2cVpnGateway
     */
    public ShowResponseP2cVgw getP2cVpnGateway() {
        return p2cVpnGateway;
    }

    public void setP2cVpnGateway(ShowResponseP2cVgw p2cVpnGateway) {
        this.p2cVpnGateway = p2cVpnGateway;
    }

    public ShowP2cVgwResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowP2cVgwResponse that = (ShowP2cVgwResponse) obj;
        return Objects.equals(this.p2cVpnGateway, that.p2cVpnGateway) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p2cVpnGateway, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowP2cVgwResponse {\n");
        sb.append("    p2cVpnGateway: ").append(toIndentedString(p2cVpnGateway)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
