package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportVpnConnectionPeerConfigurationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connection_id")

    private String vpnConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExportPeerConfigurationRequestBody body;

    public ExportVpnConnectionPeerConfigurationRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * vpn连接ID
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    public ExportVpnConnectionPeerConfigurationRequest withBody(ExportPeerConfigurationRequestBody body) {
        this.body = body;
        return this;
    }

    public ExportVpnConnectionPeerConfigurationRequest withBody(
        Consumer<ExportPeerConfigurationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExportPeerConfigurationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExportPeerConfigurationRequestBody getBody() {
        return body;
    }

    public void setBody(ExportPeerConfigurationRequestBody body) {
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
        ExportVpnConnectionPeerConfigurationRequest that = (ExportVpnConnectionPeerConfigurationRequest) obj;
        return Objects.equals(this.vpnConnectionId, that.vpnConnectionId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnectionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportVpnConnectionPeerConfigurationRequest {\n");
        sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
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
