package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 授权器配置。
 */
public class CoreGatewayAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_jwt_authorizer")

    private CoreGatewayCustomJWTAuthorizerConfiguration customJwtAuthorizer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_auth")

    private CoreGatewayKeyAuthAuthorizerConfiguration keyAuth;

    public CoreGatewayAuthorizerConfiguration withCustomJwtAuthorizer(
        CoreGatewayCustomJWTAuthorizerConfiguration customJwtAuthorizer) {
        this.customJwtAuthorizer = customJwtAuthorizer;
        return this;
    }

    public CoreGatewayAuthorizerConfiguration withCustomJwtAuthorizer(
        Consumer<CoreGatewayCustomJWTAuthorizerConfiguration> customJwtAuthorizerSetter) {
        if (this.customJwtAuthorizer == null) {
            this.customJwtAuthorizer = new CoreGatewayCustomJWTAuthorizerConfiguration();
            customJwtAuthorizerSetter.accept(this.customJwtAuthorizer);
        }

        return this;
    }

    /**
     * Get customJwtAuthorizer
     * @return customJwtAuthorizer
     */
    public CoreGatewayCustomJWTAuthorizerConfiguration getCustomJwtAuthorizer() {
        return customJwtAuthorizer;
    }

    public void setCustomJwtAuthorizer(CoreGatewayCustomJWTAuthorizerConfiguration customJwtAuthorizer) {
        this.customJwtAuthorizer = customJwtAuthorizer;
    }

    public CoreGatewayAuthorizerConfiguration withKeyAuth(CoreGatewayKeyAuthAuthorizerConfiguration keyAuth) {
        this.keyAuth = keyAuth;
        return this;
    }

    public CoreGatewayAuthorizerConfiguration withKeyAuth(
        Consumer<CoreGatewayKeyAuthAuthorizerConfiguration> keyAuthSetter) {
        if (this.keyAuth == null) {
            this.keyAuth = new CoreGatewayKeyAuthAuthorizerConfiguration();
            keyAuthSetter.accept(this.keyAuth);
        }

        return this;
    }

    /**
     * Get keyAuth
     * @return keyAuth
     */
    public CoreGatewayKeyAuthAuthorizerConfiguration getKeyAuth() {
        return keyAuth;
    }

    public void setKeyAuth(CoreGatewayKeyAuthAuthorizerConfiguration keyAuth) {
        this.keyAuth = keyAuth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayAuthorizerConfiguration that = (CoreGatewayAuthorizerConfiguration) obj;
        return Objects.equals(this.customJwtAuthorizer, that.customJwtAuthorizer)
            && Objects.equals(this.keyAuth, that.keyAuth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customJwtAuthorizer, keyAuth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayAuthorizerConfiguration {\n");
        sb.append("    customJwtAuthorizer: ").append(toIndentedString(customJwtAuthorizer)).append("\n");
        sb.append("    keyAuth: ").append(toIndentedString(keyAuth)).append("\n");
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
