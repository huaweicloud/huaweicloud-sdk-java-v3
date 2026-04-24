package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Authorization server metadata for an OAuth2 provider.
 */
public class Oauth2AuthorizationServerMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_endpoint")

    private String authorizationEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_endpoint")

    private String tokenEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_types")

    private List<String> responseTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_endpoint_auth_methods")

    private List<String> tokenEndpointAuthMethods = null;

    public Oauth2AuthorizationServerMetadata withAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * Authorization endpoint of the authorization server.
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    public Oauth2AuthorizationServerMetadata withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Issuer identifier of the authorization server.
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Oauth2AuthorizationServerMetadata withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Token endpoint of the authorization server.
     * @return tokenEndpoint
     */
    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public Oauth2AuthorizationServerMetadata withResponseTypes(List<String> responseTypes) {
        this.responseTypes = responseTypes;
        return this;
    }

    public Oauth2AuthorizationServerMetadata addResponseTypesItem(String responseTypesItem) {
        if (this.responseTypes == null) {
            this.responseTypes = new ArrayList<>();
        }
        this.responseTypes.add(responseTypesItem);
        return this;
    }

    public Oauth2AuthorizationServerMetadata withResponseTypes(Consumer<List<String>> responseTypesSetter) {
        if (this.responseTypes == null) {
            this.responseTypes = new ArrayList<>();
        }
        responseTypesSetter.accept(this.responseTypes);
        return this;
    }

    /**
     * Supported response types.
     * @return responseTypes
     */
    public List<String> getResponseTypes() {
        return responseTypes;
    }

    public void setResponseTypes(List<String> responseTypes) {
        this.responseTypes = responseTypes;
    }

    public Oauth2AuthorizationServerMetadata withTokenEndpointAuthMethods(List<String> tokenEndpointAuthMethods) {
        this.tokenEndpointAuthMethods = tokenEndpointAuthMethods;
        return this;
    }

    public Oauth2AuthorizationServerMetadata addTokenEndpointAuthMethodsItem(String tokenEndpointAuthMethodsItem) {
        if (this.tokenEndpointAuthMethods == null) {
            this.tokenEndpointAuthMethods = new ArrayList<>();
        }
        this.tokenEndpointAuthMethods.add(tokenEndpointAuthMethodsItem);
        return this;
    }

    public Oauth2AuthorizationServerMetadata withTokenEndpointAuthMethods(
        Consumer<List<String>> tokenEndpointAuthMethodsSetter) {
        if (this.tokenEndpointAuthMethods == null) {
            this.tokenEndpointAuthMethods = new ArrayList<>();
        }
        tokenEndpointAuthMethodsSetter.accept(this.tokenEndpointAuthMethods);
        return this;
    }

    /**
     * Client authentication methods supported by the token endpoint.
     * @return tokenEndpointAuthMethods
     */
    public List<String> getTokenEndpointAuthMethods() {
        return tokenEndpointAuthMethods;
    }

    public void setTokenEndpointAuthMethods(List<String> tokenEndpointAuthMethods) {
        this.tokenEndpointAuthMethods = tokenEndpointAuthMethods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Oauth2AuthorizationServerMetadata that = (Oauth2AuthorizationServerMetadata) obj;
        return Objects.equals(this.authorizationEndpoint, that.authorizationEndpoint)
            && Objects.equals(this.issuer, that.issuer) && Objects.equals(this.tokenEndpoint, that.tokenEndpoint)
            && Objects.equals(this.responseTypes, that.responseTypes)
            && Objects.equals(this.tokenEndpointAuthMethods, that.tokenEndpointAuthMethods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationEndpoint, issuer, tokenEndpoint, responseTypes, tokenEndpointAuthMethods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Oauth2AuthorizationServerMetadata {\n");
        sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
        sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
        sb.append("    tokenEndpointAuthMethods: ").append(toIndentedString(tokenEndpointAuthMethods)).append("\n");
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
