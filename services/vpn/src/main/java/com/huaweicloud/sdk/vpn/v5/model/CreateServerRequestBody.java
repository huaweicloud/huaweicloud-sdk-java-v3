package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateServerRequestBody
 */
public class CreateServerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server")

    private CreateServerRequest vpnServer;

    public CreateServerRequestBody withVpnServer(CreateServerRequest vpnServer) {
        this.vpnServer = vpnServer;
        return this;
    }

    public CreateServerRequestBody withVpnServer(Consumer<CreateServerRequest> vpnServerSetter) {
        if (this.vpnServer == null) {
            this.vpnServer = new CreateServerRequest();
            vpnServerSetter.accept(this.vpnServer);
        }

        return this;
    }

    /**
     * Get vpnServer
     * @return vpnServer
     */
    public CreateServerRequest getVpnServer() {
        return vpnServer;
    }

    public void setVpnServer(CreateServerRequest vpnServer) {
        this.vpnServer = vpnServer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServerRequestBody that = (CreateServerRequestBody) obj;
        return Objects.equals(this.vpnServer, that.vpnServer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerRequestBody {\n");
        sb.append("    vpnServer: ").append(toIndentedString(vpnServer)).append("\n");
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
