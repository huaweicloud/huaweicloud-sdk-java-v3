package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Represents inbound authorization configuration options used to authenticate incoming requests.
 */
public class AuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_jwt")

    private CustomJWTAuthorizerConfiguration customJwt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_auth")

    private KeyAuthAuthorizerConfiguration keyAuth;

    public AuthorizerConfiguration withCustomJwt(CustomJWTAuthorizerConfiguration customJwt) {
        this.customJwt = customJwt;
        return this;
    }

    public AuthorizerConfiguration withCustomJwt(Consumer<CustomJWTAuthorizerConfiguration> customJwtSetter) {
        if (this.customJwt == null) {
            this.customJwt = new CustomJWTAuthorizerConfiguration();
            customJwtSetter.accept(this.customJwt);
        }

        return this;
    }

    /**
     * Get customJwt
     * @return customJwt
     */
    public CustomJWTAuthorizerConfiguration getCustomJwt() {
        return customJwt;
    }

    public void setCustomJwt(CustomJWTAuthorizerConfiguration customJwt) {
        this.customJwt = customJwt;
    }

    public AuthorizerConfiguration withKeyAuth(KeyAuthAuthorizerConfiguration keyAuth) {
        this.keyAuth = keyAuth;
        return this;
    }

    public AuthorizerConfiguration withKeyAuth(Consumer<KeyAuthAuthorizerConfiguration> keyAuthSetter) {
        if (this.keyAuth == null) {
            this.keyAuth = new KeyAuthAuthorizerConfiguration();
            keyAuthSetter.accept(this.keyAuth);
        }

        return this;
    }

    /**
     * Get keyAuth
     * @return keyAuth
     */
    public KeyAuthAuthorizerConfiguration getKeyAuth() {
        return keyAuth;
    }

    public void setKeyAuth(KeyAuthAuthorizerConfiguration keyAuth) {
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
        AuthorizerConfiguration that = (AuthorizerConfiguration) obj;
        return Objects.equals(this.customJwt, that.customJwt) && Objects.equals(this.keyAuth, that.keyAuth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customJwt, keyAuth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizerConfiguration {\n");
        sb.append("    customJwt: ").append(toIndentedString(customJwt)).append("\n");
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
