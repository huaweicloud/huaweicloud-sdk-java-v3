package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVpnConnectionRequestBody
 */
public class CreateVpnConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connection")

    private CreateVpnConnectionRequestBodyContent vpnConnection;

    public CreateVpnConnectionRequestBody withVpnConnection(CreateVpnConnectionRequestBodyContent vpnConnection) {
        this.vpnConnection = vpnConnection;
        return this;
    }

    public CreateVpnConnectionRequestBody withVpnConnection(
        Consumer<CreateVpnConnectionRequestBodyContent> vpnConnectionSetter) {
        if (this.vpnConnection == null) {
            this.vpnConnection = new CreateVpnConnectionRequestBodyContent();
            vpnConnectionSetter.accept(this.vpnConnection);
        }

        return this;
    }

    /**
     * Get vpnConnection
     * @return vpnConnection
     */
    public CreateVpnConnectionRequestBodyContent getVpnConnection() {
        return vpnConnection;
    }

    public void setVpnConnection(CreateVpnConnectionRequestBodyContent vpnConnection) {
        this.vpnConnection = vpnConnection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpnConnectionRequestBody that = (CreateVpnConnectionRequestBody) obj;
        return Objects.equals(this.vpnConnection, that.vpnConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpnConnectionRequestBody {\n");
        sb.append("    vpnConnection: ").append(toIndentedString(vpnConnection)).append("\n");
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
