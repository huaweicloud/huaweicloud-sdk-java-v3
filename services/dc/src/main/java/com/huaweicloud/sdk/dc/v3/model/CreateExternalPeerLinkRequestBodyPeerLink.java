package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建关联连接请求Body体
 */
public class CreateExternalPeerLinkRequestBodyPeerLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_site")

    private CreateExternalPeerLinkRequestBodyPeerLinkPeerSite peerSite;

    public CreateExternalPeerLinkRequestBodyPeerLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 关联连接的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateExternalPeerLinkRequestBodyPeerLink withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateExternalPeerLinkRequestBodyPeerLink withPeerSite(
        CreateExternalPeerLinkRequestBodyPeerLinkPeerSite peerSite) {
        this.peerSite = peerSite;
        return this;
    }

    public CreateExternalPeerLinkRequestBodyPeerLink withPeerSite(
        Consumer<CreateExternalPeerLinkRequestBodyPeerLinkPeerSite> peerSiteSetter) {
        if (this.peerSite == null) {
            this.peerSite = new CreateExternalPeerLinkRequestBodyPeerLinkPeerSite();
            peerSiteSetter.accept(this.peerSite);
        }

        return this;
    }

    /**
     * Get peerSite
     * @return peerSite
     */
    public CreateExternalPeerLinkRequestBodyPeerLinkPeerSite getPeerSite() {
        return peerSite;
    }

    public void setPeerSite(CreateExternalPeerLinkRequestBodyPeerLinkPeerSite peerSite) {
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
        CreateExternalPeerLinkRequestBodyPeerLink that = (CreateExternalPeerLinkRequestBodyPeerLink) obj;
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
        sb.append("class CreateExternalPeerLinkRequestBodyPeerLink {\n");
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
