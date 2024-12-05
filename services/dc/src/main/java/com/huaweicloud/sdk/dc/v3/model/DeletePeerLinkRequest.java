package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletePeerLinkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_link_id")

    private String peerLinkId;

    public DeletePeerLinkRequest withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * 全球接入网关ID
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    public DeletePeerLinkRequest withPeerLinkId(String peerLinkId) {
        this.peerLinkId = peerLinkId;
        return this;
    }

    /**
     * 全球接入网关对等体
     * @return peerLinkId
     */
    public String getPeerLinkId() {
        return peerLinkId;
    }

    public void setPeerLinkId(String peerLinkId) {
        this.peerLinkId = peerLinkId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePeerLinkRequest that = (DeletePeerLinkRequest) obj;
        return Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId)
            && Objects.equals(this.peerLinkId, that.peerLinkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGatewayId, peerLinkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePeerLinkRequest {\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
        sb.append("    peerLinkId: ").append(toIndentedString(peerLinkId)).append("\n");
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
