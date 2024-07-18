package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateClientCaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server_id")

    private String vpnServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_certificate_id")

    private String clientCaCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateClientCaCertificateRequestBody body;

    public UpdateClientCaRequest withVpnServerId(String vpnServerId) {
        this.vpnServerId = vpnServerId;
        return this;
    }

    /**
     * VPN服务端 ID
     * @return vpnServerId
     */
    public String getVpnServerId() {
        return vpnServerId;
    }

    public void setVpnServerId(String vpnServerId) {
        this.vpnServerId = vpnServerId;
    }

    public UpdateClientCaRequest withClientCaCertificateId(String clientCaCertificateId) {
        this.clientCaCertificateId = clientCaCertificateId;
        return this;
    }

    /**
     * 客户端 CA 证书 ID
     * @return clientCaCertificateId
     */
    public String getClientCaCertificateId() {
        return clientCaCertificateId;
    }

    public void setClientCaCertificateId(String clientCaCertificateId) {
        this.clientCaCertificateId = clientCaCertificateId;
    }

    public UpdateClientCaRequest withBody(UpdateClientCaCertificateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateClientCaRequest withBody(Consumer<UpdateClientCaCertificateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateClientCaCertificateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateClientCaCertificateRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateClientCaCertificateRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClientCaRequest that = (UpdateClientCaRequest) obj;
        return Objects.equals(this.vpnServerId, that.vpnServerId)
            && Objects.equals(this.clientCaCertificateId, that.clientCaCertificateId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServerId, clientCaCertificateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClientCaRequest {\n");
        sb.append("    vpnServerId: ").append(toIndentedString(vpnServerId)).append("\n");
        sb.append("    clientCaCertificateId: ").append(toIndentedString(clientCaCertificateId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
