package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 运行时入站认证配置。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
 */
public class CoreRunAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_jwt")

    private CoreRunCustomJWTAuthorizerConfiguration customJwt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_auth")

    private CoreRunKeyAuthAuthorizerConfiguration keyAuth;

    public CoreRunAuthorizerConfiguration withCustomJwt(CoreRunCustomJWTAuthorizerConfiguration customJwt) {
        this.customJwt = customJwt;
        return this;
    }

    public CoreRunAuthorizerConfiguration withCustomJwt(
        Consumer<CoreRunCustomJWTAuthorizerConfiguration> customJwtSetter) {
        if (this.customJwt == null) {
            this.customJwt = new CoreRunCustomJWTAuthorizerConfiguration();
            customJwtSetter.accept(this.customJwt);
        }

        return this;
    }

    /**
     * Get customJwt
     * @return customJwt
     */
    public CoreRunCustomJWTAuthorizerConfiguration getCustomJwt() {
        return customJwt;
    }

    public void setCustomJwt(CoreRunCustomJWTAuthorizerConfiguration customJwt) {
        this.customJwt = customJwt;
    }

    public CoreRunAuthorizerConfiguration withKeyAuth(CoreRunKeyAuthAuthorizerConfiguration keyAuth) {
        this.keyAuth = keyAuth;
        return this;
    }

    public CoreRunAuthorizerConfiguration withKeyAuth(Consumer<CoreRunKeyAuthAuthorizerConfiguration> keyAuthSetter) {
        if (this.keyAuth == null) {
            this.keyAuth = new CoreRunKeyAuthAuthorizerConfiguration();
            keyAuthSetter.accept(this.keyAuth);
        }

        return this;
    }

    /**
     * Get keyAuth
     * @return keyAuth
     */
    public CoreRunKeyAuthAuthorizerConfiguration getKeyAuth() {
        return keyAuth;
    }

    public void setKeyAuth(CoreRunKeyAuthAuthorizerConfiguration keyAuth) {
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
        CoreRunAuthorizerConfiguration that = (CoreRunAuthorizerConfiguration) obj;
        return Objects.equals(this.customJwt, that.customJwt) && Objects.equals(this.keyAuth, that.keyAuth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customJwt, keyAuth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunAuthorizerConfiguration {\n");
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
