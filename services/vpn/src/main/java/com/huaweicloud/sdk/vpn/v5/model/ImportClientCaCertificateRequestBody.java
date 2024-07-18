package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportClientCaCertificateRequestBody
 */
public class ImportClientCaCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_certificate")

    private ImportClientCaCertificateRequestBodyClientCaCertificate clientCaCertificate;

    public ImportClientCaCertificateRequestBody withClientCaCertificate(
        ImportClientCaCertificateRequestBodyClientCaCertificate clientCaCertificate) {
        this.clientCaCertificate = clientCaCertificate;
        return this;
    }

    public ImportClientCaCertificateRequestBody withClientCaCertificate(
        Consumer<ImportClientCaCertificateRequestBodyClientCaCertificate> clientCaCertificateSetter) {
        if (this.clientCaCertificate == null) {
            this.clientCaCertificate = new ImportClientCaCertificateRequestBodyClientCaCertificate();
            clientCaCertificateSetter.accept(this.clientCaCertificate);
        }

        return this;
    }

    /**
     * Get clientCaCertificate
     * @return clientCaCertificate
     */
    public ImportClientCaCertificateRequestBodyClientCaCertificate getClientCaCertificate() {
        return clientCaCertificate;
    }

    public void setClientCaCertificate(ImportClientCaCertificateRequestBodyClientCaCertificate clientCaCertificate) {
        this.clientCaCertificate = clientCaCertificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportClientCaCertificateRequestBody that = (ImportClientCaCertificateRequestBody) obj;
        return Objects.equals(this.clientCaCertificate, that.clientCaCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCaCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportClientCaCertificateRequestBody {\n");
        sb.append("    clientCaCertificate: ").append(toIndentedString(clientCaCertificate)).append("\n");
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
