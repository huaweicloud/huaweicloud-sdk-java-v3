package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建参数请求体
 */
public class CreateExternalPeerLinkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_link")

    private CreateExternalPeerLinkRequestBodyPeerLink peerLink;

    public CreateExternalPeerLinkRequestBody withPeerLink(CreateExternalPeerLinkRequestBodyPeerLink peerLink) {
        this.peerLink = peerLink;
        return this;
    }

    public CreateExternalPeerLinkRequestBody withPeerLink(
        Consumer<CreateExternalPeerLinkRequestBodyPeerLink> peerLinkSetter) {
        if (this.peerLink == null) {
            this.peerLink = new CreateExternalPeerLinkRequestBodyPeerLink();
            peerLinkSetter.accept(this.peerLink);
        }

        return this;
    }

    /**
     * Get peerLink
     * @return peerLink
     */
    public CreateExternalPeerLinkRequestBodyPeerLink getPeerLink() {
        return peerLink;
    }

    public void setPeerLink(CreateExternalPeerLinkRequestBodyPeerLink peerLink) {
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
        CreateExternalPeerLinkRequestBody that = (CreateExternalPeerLinkRequestBody) obj;
        return Objects.equals(this.peerLink, that.peerLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalPeerLinkRequestBody {\n");
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
