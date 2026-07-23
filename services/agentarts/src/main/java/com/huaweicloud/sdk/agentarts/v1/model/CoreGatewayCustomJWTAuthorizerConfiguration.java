package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义JWT认证配置。
 */
public class CoreGatewayCustomJWTAuthorizerConfiguration {

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

    private List<CoreGatewayCustomClaimValidation> customClaims = null;

    public CoreGatewayCustomJWTAuthorizerConfiguration withDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    /**
     * JWT 发现 URL。
     * @return discoveryUrl
     */
    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    public void setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withAllowedAudience(List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration addAllowedAudienceItem(String allowedAudienceItem) {
        if (this.allowedAudience == null) {
            this.allowedAudience = new ArrayList<>();
        }
        this.allowedAudience.add(allowedAudienceItem);
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withAllowedAudience(
        Consumer<List<String>> allowedAudienceSetter) {
        if (this.allowedAudience == null) {
            this.allowedAudience = new ArrayList<>();
        }
        allowedAudienceSetter.accept(this.allowedAudience);
        return this;
    }

    /**
     * 允许的 JWT 受众列表。
     * @return allowedAudience
     */
    public List<String> getAllowedAudience() {
        return allowedAudience;
    }

    public void setAllowedAudience(List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withAllowedClients(List<String> allowedClients) {
        this.allowedClients = allowedClients;
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration addAllowedClientsItem(String allowedClientsItem) {
        if (this.allowedClients == null) {
            this.allowedClients = new ArrayList<>();
        }
        this.allowedClients.add(allowedClientsItem);
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withAllowedClients(Consumer<List<String>> allowedClientsSetter) {
        if (this.allowedClients == null) {
            this.allowedClients = new ArrayList<>();
        }
        allowedClientsSetter.accept(this.allowedClients);
        return this;
    }

    /**
     * 允许的客户端 ID 列表。
     * @return allowedClients
     */
    public List<String> getAllowedClients() {
        return allowedClients;
    }

    public void setAllowedClients(List<String> allowedClients) {
        this.allowedClients = allowedClients;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withAllowedScopes(List<String> allowedScopes) {
        this.allowedScopes = allowedScopes;
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration addAllowedScopesItem(String allowedScopesItem) {
        if (this.allowedScopes == null) {
            this.allowedScopes = new ArrayList<>();
        }
        this.allowedScopes.add(allowedScopesItem);
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withAllowedScopes(Consumer<List<String>> allowedScopesSetter) {
        if (this.allowedScopes == null) {
            this.allowedScopes = new ArrayList<>();
        }
        allowedScopesSetter.accept(this.allowedScopes);
        return this;
    }

    /**
     * 允许的 JWT 作用域列表。
     * @return allowedScopes
     */
    public List<String> getAllowedScopes() {
        return allowedScopes;
    }

    public void setAllowedScopes(List<String> allowedScopes) {
        this.allowedScopes = allowedScopes;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withCustomClaims(
        List<CoreGatewayCustomClaimValidation> customClaims) {
        this.customClaims = customClaims;
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration addCustomClaimsItem(
        CoreGatewayCustomClaimValidation customClaimsItem) {
        if (this.customClaims == null) {
            this.customClaims = new ArrayList<>();
        }
        this.customClaims.add(customClaimsItem);
        return this;
    }

    public CoreGatewayCustomJWTAuthorizerConfiguration withCustomClaims(
        Consumer<List<CoreGatewayCustomClaimValidation>> customClaimsSetter) {
        if (this.customClaims == null) {
            this.customClaims = new ArrayList<>();
        }
        customClaimsSetter.accept(this.customClaims);
        return this;
    }

    /**
     * 自定义声明验证规则列表。
     * @return customClaims
     */
    public List<CoreGatewayCustomClaimValidation> getCustomClaims() {
        return customClaims;
    }

    public void setCustomClaims(List<CoreGatewayCustomClaimValidation> customClaims) {
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
        CoreGatewayCustomJWTAuthorizerConfiguration that = (CoreGatewayCustomJWTAuthorizerConfiguration) obj;
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
        sb.append("class CoreGatewayCustomJWTAuthorizerConfiguration {\n");
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
