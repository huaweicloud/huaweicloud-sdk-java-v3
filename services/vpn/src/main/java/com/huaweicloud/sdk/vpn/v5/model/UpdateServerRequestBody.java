package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateServerRequestBody
 */
public class UpdateServerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server")

    private UpdateServerRequest vpnServer;

    public UpdateServerRequestBody withVpnServer(UpdateServerRequest vpnServer) {
        this.vpnServer = vpnServer;
        return this;
    }

    public UpdateServerRequestBody withVpnServer(Consumer<UpdateServerRequest> vpnServerSetter) {
        if (this.vpnServer == null) {
            this.vpnServer = new UpdateServerRequest();
            vpnServerSetter.accept(this.vpnServer);
        }

        return this;
    }

    /**
     * Get vpnServer
     * @return vpnServer
     */
    public UpdateServerRequest getVpnServer() {
        return vpnServer;
    }

    public void setVpnServer(UpdateServerRequest vpnServer) {
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
        UpdateServerRequestBody that = (UpdateServerRequestBody) obj;
        return Objects.equals(this.vpnServer, that.vpnServer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerRequestBody {\n");
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
