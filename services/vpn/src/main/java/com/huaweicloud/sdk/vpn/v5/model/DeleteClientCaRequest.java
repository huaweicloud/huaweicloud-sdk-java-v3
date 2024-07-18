package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteClientCaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server_id")

    private String vpnServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_certificate_id")

    private String clientCaCertificateId;

    public DeleteClientCaRequest withVpnServerId(String vpnServerId) {
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

    public DeleteClientCaRequest withClientCaCertificateId(String clientCaCertificateId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteClientCaRequest that = (DeleteClientCaRequest) obj;
        return Objects.equals(this.vpnServerId, that.vpnServerId)
            && Objects.equals(this.clientCaCertificateId, that.clientCaCertificateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServerId, clientCaCertificateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClientCaRequest {\n");
        sb.append("    vpnServerId: ").append(toIndentedString(vpnServerId)).append("\n");
        sb.append("    clientCaCertificateId: ").append(toIndentedString(clientCaCertificateId)).append("\n");
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
