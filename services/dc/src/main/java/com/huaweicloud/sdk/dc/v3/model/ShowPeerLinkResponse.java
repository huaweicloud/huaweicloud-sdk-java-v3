package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPeerLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_link")

    private PeerLinkEntry peerLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowPeerLinkResponse withPeerLink(PeerLinkEntry peerLink) {
        this.peerLink = peerLink;
        return this;
    }

    public ShowPeerLinkResponse withPeerLink(Consumer<PeerLinkEntry> peerLinkSetter) {
        if (this.peerLink == null) {
            this.peerLink = new PeerLinkEntry();
            peerLinkSetter.accept(this.peerLink);
        }

        return this;
    }

    /**
     * Get peerLink
     * @return peerLink
     */
    public PeerLinkEntry getPeerLink() {
        return peerLink;
    }

    public void setPeerLink(PeerLinkEntry peerLink) {
        this.peerLink = peerLink;
    }

    public ShowPeerLinkResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPeerLinkResponse that = (ShowPeerLinkResponse) obj;
        return Objects.equals(this.peerLink, that.peerLink) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerLink, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPeerLinkResponse {\n");
        sb.append("    peerLink: ").append(toIndentedString(peerLink)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
