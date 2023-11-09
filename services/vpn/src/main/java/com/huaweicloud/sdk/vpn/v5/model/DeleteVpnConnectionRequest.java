package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVpnConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connection_id")

    private String vpnConnectionId;

    public DeleteVpnConnectionRequest withVpnConnectionId(String vpnConnectionId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVpnConnectionRequest that = (DeleteVpnConnectionRequest) obj;
        return Objects.equals(this.vpnConnectionId, that.vpnConnectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVpnConnectionRequest {\n");
        sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
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
