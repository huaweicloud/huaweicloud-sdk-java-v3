package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVgwsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_gateways")

    private List<ResponseVpnGateway> vpnGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListVgwsResponse withVpnGateways(List<ResponseVpnGateway> vpnGateways) {
        this.vpnGateways = vpnGateways;
        return this;
    }

    public ListVgwsResponse addVpnGatewaysItem(ResponseVpnGateway vpnGatewaysItem) {
        if (this.vpnGateways == null) {
            this.vpnGateways = new ArrayList<>();
        }
        this.vpnGateways.add(vpnGatewaysItem);
        return this;
    }

    public ListVgwsResponse withVpnGateways(Consumer<List<ResponseVpnGateway>> vpnGatewaysSetter) {
        if (this.vpnGateways == null) {
            this.vpnGateways = new ArrayList<>();
        }
        vpnGatewaysSetter.accept(this.vpnGateways);
        return this;
    }

    /**
     * 网关信息
     * @return vpnGateways
     */
    public List<ResponseVpnGateway> getVpnGateways() {
        return vpnGateways;
    }

    public void setVpnGateways(List<ResponseVpnGateway> vpnGateways) {
        this.vpnGateways = vpnGateways;
    }

    public ListVgwsResponse withRequestId(String requestId) {
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
        ListVgwsResponse that = (ListVgwsResponse) obj;
        return Objects.equals(this.vpnGateways, that.vpnGateways) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnGateways, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVgwsResponse {\n");
        sb.append("    vpnGateways: ").append(toIndentedString(vpnGateways)).append("\n");
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
