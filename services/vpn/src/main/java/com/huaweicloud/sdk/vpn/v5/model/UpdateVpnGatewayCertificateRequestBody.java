package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVpnGatewayCertificateRequestBody
 */
public class UpdateVpnGatewayCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private UpdateVpnGatewayCertificateRequestBodyContent certificate;

    public UpdateVpnGatewayCertificateRequestBody withCertificate(
        UpdateVpnGatewayCertificateRequestBodyContent certificate) {
        this.certificate = certificate;
        return this;
    }

    public UpdateVpnGatewayCertificateRequestBody withCertificate(
        Consumer<UpdateVpnGatewayCertificateRequestBodyContent> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new UpdateVpnGatewayCertificateRequestBodyContent();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    /**
     * Get certificate
     * @return certificate
     */
    public UpdateVpnGatewayCertificateRequestBodyContent getCertificate() {
        return certificate;
    }

    public void setCertificate(UpdateVpnGatewayCertificateRequestBodyContent certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpnGatewayCertificateRequestBody that = (UpdateVpnGatewayCertificateRequestBody) obj;
        return Objects.equals(this.certificate, that.certificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnGatewayCertificateRequestBody {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
