package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVpnGatewayCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private VpnGatewayCertificate certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowVpnGatewayCertificateResponse withCertificate(VpnGatewayCertificate certificate) {
        this.certificate = certificate;
        return this;
    }

    public ShowVpnGatewayCertificateResponse withCertificate(Consumer<VpnGatewayCertificate> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new VpnGatewayCertificate();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    /**
     * Get certificate
     * @return certificate
     */
    public VpnGatewayCertificate getCertificate() {
        return certificate;
    }

    public void setCertificate(VpnGatewayCertificate certificate) {
        this.certificate = certificate;
    }

    public ShowVpnGatewayCertificateResponse withRequestId(String requestId) {
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
        ShowVpnGatewayCertificateResponse that = (ShowVpnGatewayCertificateResponse) obj;
        return Objects.equals(this.certificate, that.certificate) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpnGatewayCertificateResponse {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
