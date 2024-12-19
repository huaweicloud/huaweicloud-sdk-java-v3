package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdatePeerLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_link")

    private ExternalUpdatePeerLink peerLink;

    public UpdatePeerLinkResponse withRequestId(String requestId) {
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

    public UpdatePeerLinkResponse withPeerLink(ExternalUpdatePeerLink peerLink) {
        this.peerLink = peerLink;
        return this;
    }

    public UpdatePeerLinkResponse withPeerLink(Consumer<ExternalUpdatePeerLink> peerLinkSetter) {
        if (this.peerLink == null) {
            this.peerLink = new ExternalUpdatePeerLink();
            peerLinkSetter.accept(this.peerLink);
        }

        return this;
    }

    /**
     * Get peerLink
     * @return peerLink
     */
    public ExternalUpdatePeerLink getPeerLink() {
        return peerLink;
    }

    public void setPeerLink(ExternalUpdatePeerLink peerLink) {
        this.peerLink = peerLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePeerLinkResponse that = (UpdatePeerLinkResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.peerLink, that.peerLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, peerLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePeerLinkResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    peerLink: ").append(toIndentedString(peerLink)).append("\n");
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
