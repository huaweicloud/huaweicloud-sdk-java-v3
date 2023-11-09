package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVgwResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_gateway")

    private ResponseVpnGateway vpnGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowVgwResponse withVpnGateway(ResponseVpnGateway vpnGateway) {
        this.vpnGateway = vpnGateway;
        return this;
    }

    public ShowVgwResponse withVpnGateway(Consumer<ResponseVpnGateway> vpnGatewaySetter) {
        if (this.vpnGateway == null) {
            this.vpnGateway = new ResponseVpnGateway();
            vpnGatewaySetter.accept(this.vpnGateway);
        }

        return this;
    }

    /**
     * Get vpnGateway
     * @return vpnGateway
     */
    public ResponseVpnGateway getVpnGateway() {
        return vpnGateway;
    }

    public void setVpnGateway(ResponseVpnGateway vpnGateway) {
        this.vpnGateway = vpnGateway;
    }

    public ShowVgwResponse withRequestId(String requestId) {
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
        ShowVgwResponse that = (ShowVgwResponse) obj;
        return Objects.equals(this.vpnGateway, that.vpnGateway) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnGateway, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVgwResponse {\n");
        sb.append("    vpnGateway: ").append(toIndentedString(vpnGateway)).append("\n");
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
