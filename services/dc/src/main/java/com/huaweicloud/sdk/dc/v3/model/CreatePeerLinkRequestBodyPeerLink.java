package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePeerLinkRequestBodyPeerLink
 */
public class CreatePeerLinkRequestBodyPeerLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_site")

    private CreatePeerLinkRequestBodyPeerLinkPeerSite peerSite;

    public CreatePeerLinkRequestBodyPeerLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePeerLinkRequestBodyPeerLink withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePeerLinkRequestBodyPeerLink withPeerSite(CreatePeerLinkRequestBodyPeerLinkPeerSite peerSite) {
        this.peerSite = peerSite;
        return this;
    }

    public CreatePeerLinkRequestBodyPeerLink withPeerSite(
        Consumer<CreatePeerLinkRequestBodyPeerLinkPeerSite> peerSiteSetter) {
        if (this.peerSite == null) {
            this.peerSite = new CreatePeerLinkRequestBodyPeerLinkPeerSite();
            peerSiteSetter.accept(this.peerSite);
        }

        return this;
    }

    /**
     * Get peerSite
     * @return peerSite
     */
    public CreatePeerLinkRequestBodyPeerLinkPeerSite getPeerSite() {
        return peerSite;
    }

    public void setPeerSite(CreatePeerLinkRequestBodyPeerLinkPeerSite peerSite) {
        this.peerSite = peerSite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePeerLinkRequestBodyPeerLink that = (CreatePeerLinkRequestBodyPeerLink) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.peerSite, that.peerSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, peerSite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePeerLinkRequestBodyPeerLink {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    peerSite: ").append(toIndentedString(peerSite)).append("\n");
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
