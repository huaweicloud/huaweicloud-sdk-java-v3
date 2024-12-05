package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePeerLinkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_link_id")

    private String peerLinkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePeerLinkRequestBody body;

    public UpdatePeerLinkRequest withGlobalDcGatewayId(String globalDcGatewayId) {
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

    public UpdatePeerLinkRequest withPeerLinkId(String peerLinkId) {
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

    public UpdatePeerLinkRequest withBody(UpdatePeerLinkRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePeerLinkRequest withBody(Consumer<UpdatePeerLinkRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePeerLinkRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePeerLinkRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePeerLinkRequestBody body) {
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
        UpdatePeerLinkRequest that = (UpdatePeerLinkRequest) obj;
        return Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId)
            && Objects.equals(this.peerLinkId, that.peerLinkId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGatewayId, peerLinkId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePeerLinkRequest {\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
        sb.append("    peerLinkId: ").append(toIndentedString(peerLinkId)).append("\n");
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
