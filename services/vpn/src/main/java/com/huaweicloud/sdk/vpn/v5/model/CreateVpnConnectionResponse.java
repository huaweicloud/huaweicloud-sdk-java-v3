package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVpnConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connection")

    private CreateResponseVpnConnection vpnConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public CreateVpnConnectionResponse withVpnConnection(CreateResponseVpnConnection vpnConnection) {
        this.vpnConnection = vpnConnection;
        return this;
    }

    public CreateVpnConnectionResponse withVpnConnection(Consumer<CreateResponseVpnConnection> vpnConnectionSetter) {
        if (this.vpnConnection == null) {
            this.vpnConnection = new CreateResponseVpnConnection();
            vpnConnectionSetter.accept(this.vpnConnection);
        }

        return this;
    }

    /**
     * Get vpnConnection
     * @return vpnConnection
     */
    public CreateResponseVpnConnection getVpnConnection() {
        return vpnConnection;
    }

    public void setVpnConnection(CreateResponseVpnConnection vpnConnection) {
        this.vpnConnection = vpnConnection;
    }

    public CreateVpnConnectionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateVpnConnectionResponse withHeaderResponseToken(String headerResponseToken) {
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
        CreateVpnConnectionResponse that = (CreateVpnConnectionResponse) obj;
        return Objects.equals(this.vpnConnection, that.vpnConnection) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnection, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpnConnectionResponse {\n");
        sb.append("    vpnConnection: ").append(toIndentedString(vpnConnection)).append("\n");
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
