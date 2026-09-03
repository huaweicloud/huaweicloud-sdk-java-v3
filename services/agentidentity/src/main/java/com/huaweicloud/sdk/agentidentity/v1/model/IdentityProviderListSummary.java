package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IdentityProviderListSummary
 */
public class IdentityProviderListSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    private String identityProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth2_discovery")

    private Oauth2Discovery oauth2Discovery;

    public IdentityProviderListSummary withIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    /**
     * Identity provider code.
     * @return identityProvider
     */
    public String getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    public IdentityProviderListSummary withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the identity provider.
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public IdentityProviderListSummary withOauth2Discovery(Oauth2Discovery oauth2Discovery) {
        this.oauth2Discovery = oauth2Discovery;
        return this;
    }

    public IdentityProviderListSummary withOauth2Discovery(Consumer<Oauth2Discovery> oauth2DiscoverySetter) {
        if (this.oauth2Discovery == null) {
            this.oauth2Discovery = new Oauth2Discovery();
            oauth2DiscoverySetter.accept(this.oauth2Discovery);
        }

        return this;
    }

    /**
     * Get oauth2Discovery
     * @return oauth2Discovery
     */
    public Oauth2Discovery getOauth2Discovery() {
        return oauth2Discovery;
    }

    public void setOauth2Discovery(Oauth2Discovery oauth2Discovery) {
        this.oauth2Discovery = oauth2Discovery;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentityProviderListSummary that = (IdentityProviderListSummary) obj;
        return Objects.equals(this.identityProvider, that.identityProvider)
            && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.oauth2Discovery, that.oauth2Discovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProvider, displayName, oauth2Discovery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityProviderListSummary {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    oauth2Discovery: ").append(toIndentedString(oauth2Discovery)).append("\n");
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
