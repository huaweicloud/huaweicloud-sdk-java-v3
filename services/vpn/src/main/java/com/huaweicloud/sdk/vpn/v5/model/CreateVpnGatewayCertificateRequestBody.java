package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVpnGatewayCertificateRequestBody
 */
public class CreateVpnGatewayCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private CreateVpnGatewayCertificateRequestBodyContent certificate;

    public CreateVpnGatewayCertificateRequestBody withCertificate(
        CreateVpnGatewayCertificateRequestBodyContent certificate) {
        this.certificate = certificate;
        return this;
    }

    public CreateVpnGatewayCertificateRequestBody withCertificate(
        Consumer<CreateVpnGatewayCertificateRequestBodyContent> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new CreateVpnGatewayCertificateRequestBodyContent();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    /**
     * Get certificate
     * @return certificate
     */
    public CreateVpnGatewayCertificateRequestBodyContent getCertificate() {
        return certificate;
    }

    public void setCertificate(CreateVpnGatewayCertificateRequestBodyContent certificate) {
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
        CreateVpnGatewayCertificateRequestBody that = (CreateVpnGatewayCertificateRequestBody) obj;
        return Objects.equals(this.certificate, that.certificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpnGatewayCertificateRequestBody {\n");
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
