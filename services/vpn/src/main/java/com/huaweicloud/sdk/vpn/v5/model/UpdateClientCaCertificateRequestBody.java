package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateClientCaCertificateRequestBody
 */
public class UpdateClientCaCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_certificate")

    private UpdateClientCaCertificateRequestBodyClientCaCertificate clientCaCertificate;

    public UpdateClientCaCertificateRequestBody withClientCaCertificate(
        UpdateClientCaCertificateRequestBodyClientCaCertificate clientCaCertificate) {
        this.clientCaCertificate = clientCaCertificate;
        return this;
    }

    public UpdateClientCaCertificateRequestBody withClientCaCertificate(
        Consumer<UpdateClientCaCertificateRequestBodyClientCaCertificate> clientCaCertificateSetter) {
        if (this.clientCaCertificate == null) {
            this.clientCaCertificate = new UpdateClientCaCertificateRequestBodyClientCaCertificate();
            clientCaCertificateSetter.accept(this.clientCaCertificate);
        }

        return this;
    }

    /**
     * Get clientCaCertificate
     * @return clientCaCertificate
     */
    public UpdateClientCaCertificateRequestBodyClientCaCertificate getClientCaCertificate() {
        return clientCaCertificate;
    }

    public void setClientCaCertificate(UpdateClientCaCertificateRequestBodyClientCaCertificate clientCaCertificate) {
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
        UpdateClientCaCertificateRequestBody that = (UpdateClientCaCertificateRequestBody) obj;
        return Objects.equals(this.clientCaCertificate, that.clientCaCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCaCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClientCaCertificateRequestBody {\n");
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
