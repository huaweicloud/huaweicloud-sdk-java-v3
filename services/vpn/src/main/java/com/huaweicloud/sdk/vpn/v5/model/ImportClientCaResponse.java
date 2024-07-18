package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ImportClientCaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_certificate")

    private ImportClientCaCertificateResponseBodyClientCaCertificate clientCaCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public ImportClientCaResponse withClientCaCertificate(
        ImportClientCaCertificateResponseBodyClientCaCertificate clientCaCertificate) {
        this.clientCaCertificate = clientCaCertificate;
        return this;
    }

    public ImportClientCaResponse withClientCaCertificate(
        Consumer<ImportClientCaCertificateResponseBodyClientCaCertificate> clientCaCertificateSetter) {
        if (this.clientCaCertificate == null) {
            this.clientCaCertificate = new ImportClientCaCertificateResponseBodyClientCaCertificate();
            clientCaCertificateSetter.accept(this.clientCaCertificate);
        }

        return this;
    }

    /**
     * Get clientCaCertificate
     * @return clientCaCertificate
     */
    public ImportClientCaCertificateResponseBodyClientCaCertificate getClientCaCertificate() {
        return clientCaCertificate;
    }

    public void setClientCaCertificate(ImportClientCaCertificateResponseBodyClientCaCertificate clientCaCertificate) {
        this.clientCaCertificate = clientCaCertificate;
    }

    public ImportClientCaResponse withRequestId(String requestId) {
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

    public ImportClientCaResponse withHeaderResponseToken(String headerResponseToken) {
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
        ImportClientCaResponse that = (ImportClientCaResponse) obj;
        return Objects.equals(this.clientCaCertificate, that.clientCaCertificate)
            && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCaCertificate, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportClientCaResponse {\n");
        sb.append("    clientCaCertificate: ").append(toIndentedString(clientCaCertificate)).append("\n");
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
