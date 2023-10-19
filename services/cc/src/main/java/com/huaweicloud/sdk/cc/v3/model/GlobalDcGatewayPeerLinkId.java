package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GDGW的连接ID。
 */
public class GlobalDcGatewayPeerLinkId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_peer_link_id")

    private String globalDcGatewayPeerLinkId;

    public GlobalDcGatewayPeerLinkId withGlobalDcGatewayPeerLinkId(String globalDcGatewayPeerLinkId) {
        this.globalDcGatewayPeerLinkId = globalDcGatewayPeerLinkId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return globalDcGatewayPeerLinkId
     */
    public String getGlobalDcGatewayPeerLinkId() {
        return globalDcGatewayPeerLinkId;
    }

    public void setGlobalDcGatewayPeerLinkId(String globalDcGatewayPeerLinkId) {
        this.globalDcGatewayPeerLinkId = globalDcGatewayPeerLinkId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalDcGatewayPeerLinkId that = (GlobalDcGatewayPeerLinkId) obj;
        return Objects.equals(this.globalDcGatewayPeerLinkId, that.globalDcGatewayPeerLinkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGatewayPeerLinkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalDcGatewayPeerLinkId {\n");
        sb.append("    globalDcGatewayPeerLinkId: ").append(toIndentedString(globalDcGatewayPeerLinkId)).append("\n");
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
