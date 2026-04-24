package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Output configuration for a Microsoft OAuth2 provider.
 */
public class MicrosoftOauth2ProviderConfigOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth2_discovery")

    private Oauth2Discovery oauth2Discovery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    public MicrosoftOauth2ProviderConfigOutput withOauth2Discovery(Oauth2Discovery oauth2Discovery) {
        this.oauth2Discovery = oauth2Discovery;
        return this;
    }

    public MicrosoftOauth2ProviderConfigOutput withOauth2Discovery(Consumer<Oauth2Discovery> oauth2DiscoverySetter) {
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

    public MicrosoftOauth2ProviderConfigOutput withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client ID for OAuth2 application.
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MicrosoftOauth2ProviderConfigOutput that = (MicrosoftOauth2ProviderConfigOutput) obj;
        return Objects.equals(this.oauth2Discovery, that.oauth2Discovery)
            && Objects.equals(this.clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oauth2Discovery, clientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicrosoftOauth2ProviderConfigOutput {\n");
        sb.append("    oauth2Discovery: ").append(toIndentedString(oauth2Discovery)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
