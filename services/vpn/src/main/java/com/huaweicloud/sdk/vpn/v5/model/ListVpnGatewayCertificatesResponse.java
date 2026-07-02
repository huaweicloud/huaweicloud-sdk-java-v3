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
public class ListVpnGatewayCertificatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_gateway_certificates")

    private List<VpnGatewayCertificate> vpnGatewayCertificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListVpnGatewayCertificatesResponse withVpnGatewayCertificates(
        List<VpnGatewayCertificate> vpnGatewayCertificates) {
        this.vpnGatewayCertificates = vpnGatewayCertificates;
        return this;
    }

    public ListVpnGatewayCertificatesResponse addVpnGatewayCertificatesItem(
        VpnGatewayCertificate vpnGatewayCertificatesItem) {
        if (this.vpnGatewayCertificates == null) {
            this.vpnGatewayCertificates = new ArrayList<>();
        }
        this.vpnGatewayCertificates.add(vpnGatewayCertificatesItem);
        return this;
    }

    public ListVpnGatewayCertificatesResponse withVpnGatewayCertificates(
        Consumer<List<VpnGatewayCertificate>> vpnGatewayCertificatesSetter) {
        if (this.vpnGatewayCertificates == null) {
            this.vpnGatewayCertificates = new ArrayList<>();
        }
        vpnGatewayCertificatesSetter.accept(this.vpnGatewayCertificates);
        return this;
    }

    /**
     * VPN网关证书信息
     * @return vpnGatewayCertificates
     */
    public List<VpnGatewayCertificate> getVpnGatewayCertificates() {
        return vpnGatewayCertificates;
    }

    public void setVpnGatewayCertificates(List<VpnGatewayCertificate> vpnGatewayCertificates) {
        this.vpnGatewayCertificates = vpnGatewayCertificates;
    }

    public ListVpnGatewayCertificatesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
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
        ListVpnGatewayCertificatesResponse that = (ListVpnGatewayCertificatesResponse) obj;
        return Objects.equals(this.vpnGatewayCertificates, that.vpnGatewayCertificates)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnGatewayCertificates, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpnGatewayCertificatesResponse {\n");
        sb.append("    vpnGatewayCertificates: ").append(toIndentedString(vpnGatewayCertificates)).append("\n");
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
