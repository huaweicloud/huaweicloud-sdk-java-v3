package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomJWTAuthorizerConfiguration
 */
public class CustomJWTAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discovery_url")

    private String discoveryUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_audience")

    private List<String> allowedAudience = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_clients")

    private List<String> allowedClients = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_scopes")

    private List<String> allowedScopes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_claims")

    private List<CustomClaimValidation> customClaims = null;

    public CustomJWTAuthorizerConfiguration withDiscoveryUrl(String discoveryUrl) {
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

    public CustomJWTAuthorizerConfiguration withAllowedAudience(List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
        return this;
    }

    public CustomJWTAuthorizerConfiguration addAllowedAudienceItem(String allowedAudienceItem) {
        if (this.allowedAudience == null) {
            this.allowedAudience = new ArrayList<>();
        }
        this.allowedAudience.add(allowedAudienceItem);
        return this;
    }

    public CustomJWTAuthorizerConfiguration withAllowedAudience(Consumer<List<String>> allowedAudienceSetter) {
        if (this.allowedAudience == null) {
            this.allowedAudience = new ArrayList<>();
        }
        allowedAudienceSetter.accept(this.allowedAudience);
        return this;
    }

    /**
     * Get allowedAudience
     * @return allowedAudience
     */
    public List<String> getAllowedAudience() {
        return allowedAudience;
    }

    public void setAllowedAudience(List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
    }

    public CustomJWTAuthorizerConfiguration withAllowedClients(List<String> allowedClients) {
        this.allowedClients = allowedClients;
        return this;
    }

    public CustomJWTAuthorizerConfiguration addAllowedClientsItem(String allowedClientsItem) {
        if (this.allowedClients == null) {
            this.allowedClients = new ArrayList<>();
        }
        this.allowedClients.add(allowedClientsItem);
        return this;
    }

    public CustomJWTAuthorizerConfiguration withAllowedClients(Consumer<List<String>> allowedClientsSetter) {
        if (this.allowedClients == null) {
            this.allowedClients = new ArrayList<>();
        }
        allowedClientsSetter.accept(this.allowedClients);
        return this;
    }

    /**
     * Get allowedClients
     * @return allowedClients
     */
    public List<String> getAllowedClients() {
        return allowedClients;
    }

    public void setAllowedClients(List<String> allowedClients) {
        this.allowedClients = allowedClients;
    }

    public CustomJWTAuthorizerConfiguration withAllowedScopes(List<String> allowedScopes) {
        this.allowedScopes = allowedScopes;
        return this;
    }

    public CustomJWTAuthorizerConfiguration addAllowedScopesItem(String allowedScopesItem) {
        if (this.allowedScopes == null) {
            this.allowedScopes = new ArrayList<>();
        }
        this.allowedScopes.add(allowedScopesItem);
        return this;
    }

    public CustomJWTAuthorizerConfiguration withAllowedScopes(Consumer<List<String>> allowedScopesSetter) {
        if (this.allowedScopes == null) {
            this.allowedScopes = new ArrayList<>();
        }
        allowedScopesSetter.accept(this.allowedScopes);
        return this;
    }

    /**
     * Get allowedScopes
     * @return allowedScopes
     */
    public List<String> getAllowedScopes() {
        return allowedScopes;
    }

    public void setAllowedScopes(List<String> allowedScopes) {
        this.allowedScopes = allowedScopes;
    }

    public CustomJWTAuthorizerConfiguration withCustomClaims(List<CustomClaimValidation> customClaims) {
        this.customClaims = customClaims;
        return this;
    }

    public CustomJWTAuthorizerConfiguration addCustomClaimsItem(CustomClaimValidation customClaimsItem) {
        if (this.customClaims == null) {
            this.customClaims = new ArrayList<>();
        }
        this.customClaims.add(customClaimsItem);
        return this;
    }

    public CustomJWTAuthorizerConfiguration withCustomClaims(Consumer<List<CustomClaimValidation>> customClaimsSetter) {
        if (this.customClaims == null) {
            this.customClaims = new ArrayList<>();
        }
        customClaimsSetter.accept(this.customClaims);
        return this;
    }

    /**
     * Custom claim validation rules applied to inbound JWTs.
     * @return customClaims
     */
    public List<CustomClaimValidation> getCustomClaims() {
        return customClaims;
    }

    public void setCustomClaims(List<CustomClaimValidation> customClaims) {
        this.customClaims = customClaims;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomJWTAuthorizerConfiguration that = (CustomJWTAuthorizerConfiguration) obj;
        return Objects.equals(this.discoveryUrl, that.discoveryUrl)
            && Objects.equals(this.allowedAudience, that.allowedAudience)
            && Objects.equals(this.allowedClients, that.allowedClients)
            && Objects.equals(this.allowedScopes, that.allowedScopes)
            && Objects.equals(this.customClaims, that.customClaims);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discoveryUrl, allowedAudience, allowedClients, allowedScopes, customClaims);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomJWTAuthorizerConfiguration {\n");
        sb.append("    discoveryUrl: ").append(toIndentedString(discoveryUrl)).append("\n");
        sb.append("    allowedAudience: ").append(toIndentedString(allowedAudience)).append("\n");
        sb.append("    allowedClients: ").append(toIndentedString(allowedClients)).append("\n");
        sb.append("    allowedScopes: ").append(toIndentedString(allowedScopes)).append("\n");
        sb.append("    customClaims: ").append(toIndentedString(customClaims)).append("\n");
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
