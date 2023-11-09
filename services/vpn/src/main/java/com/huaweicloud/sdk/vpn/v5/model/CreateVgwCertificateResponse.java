package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVgwCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private VpnGatewayCertificateConfig certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public CreateVgwCertificateResponse withCertificate(VpnGatewayCertificateConfig certificate) {
        this.certificate = certificate;
        return this;
    }

    public CreateVgwCertificateResponse withCertificate(Consumer<VpnGatewayCertificateConfig> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new VpnGatewayCertificateConfig();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    /**
     * Get certificate
     * @return certificate
     */
    public VpnGatewayCertificateConfig getCertificate() {
        return certificate;
    }

    public void setCertificate(VpnGatewayCertificateConfig certificate) {
        this.certificate = certificate;
    }

    public CreateVgwCertificateResponse withRequestId(String requestId) {
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

    public CreateVgwCertificateResponse withHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
        return this;
    }

    /**
     * Get headerResponseToken
     * @return headerResponseToken
     */
    public String getHeaderResponseToken() {
        return headerResponseToken;
    }

    public void setHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVgwCertificateResponse that = (CreateVgwCertificateResponse) obj;
        return Objects.equals(this.certificate, that.certificate) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVgwCertificateResponse {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    headerResponseToken: ").append(toIndentedString(headerResponseToken)).append("\n");
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
