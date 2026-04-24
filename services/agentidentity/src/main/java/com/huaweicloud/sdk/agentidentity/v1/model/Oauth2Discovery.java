package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Discovery information for an OAuth2 provider (UNION). Only one member can be specified.
 */
public class Oauth2Discovery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discovery_url")

    private String discoveryUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_server_metadata")

    private Oauth2AuthorizationServerMetadata authorizationServerMetadata;

    public Oauth2Discovery withDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    /**
     * This URL is used to fetch OpenID Connect configuration.
     * @return discoveryUrl
     */
    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    public void setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
    }

    public Oauth2Discovery withAuthorizationServerMetadata(
        Oauth2AuthorizationServerMetadata authorizationServerMetadata) {
        this.authorizationServerMetadata = authorizationServerMetadata;
        return this;
    }

    public Oauth2Discovery withAuthorizationServerMetadata(
        Consumer<Oauth2AuthorizationServerMetadata> authorizationServerMetadataSetter) {
        if (this.authorizationServerMetadata == null) {
            this.authorizationServerMetadata = new Oauth2AuthorizationServerMetadata();
            authorizationServerMetadataSetter.accept(this.authorizationServerMetadata);
        }

        return this;
    }

    /**
     * Get authorizationServerMetadata
     * @return authorizationServerMetadata
     */
    public Oauth2AuthorizationServerMetadata getAuthorizationServerMetadata() {
        return authorizationServerMetadata;
    }

    public void setAuthorizationServerMetadata(Oauth2AuthorizationServerMetadata authorizationServerMetadata) {
        this.authorizationServerMetadata = authorizationServerMetadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Oauth2Discovery that = (Oauth2Discovery) obj;
        return Objects.equals(this.discoveryUrl, that.discoveryUrl)
            && Objects.equals(this.authorizationServerMetadata, that.authorizationServerMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discoveryUrl, authorizationServerMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Oauth2Discovery {\n");
        sb.append("    discoveryUrl: ").append(toIndentedString(discoveryUrl)).append("\n");
        sb.append("    authorizationServerMetadata: ")
            .append(toIndentedString(authorizationServerMetadata))
            .append("\n");
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
