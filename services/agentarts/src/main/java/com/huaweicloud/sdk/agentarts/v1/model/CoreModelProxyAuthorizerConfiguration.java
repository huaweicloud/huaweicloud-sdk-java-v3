package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 授权器配置。 **约束限制：** - 当authorizer_type的值为API_KEY时，须配置key_auth。 - 当authorizer_type的值为IAM时，此字段为空。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreModelProxyAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_auth")

    private CoreGatewayKeyAuthAuthorizerConfiguration keyAuth;

    public CoreModelProxyAuthorizerConfiguration withKeyAuth(CoreGatewayKeyAuthAuthorizerConfiguration keyAuth) {
        this.keyAuth = keyAuth;
        return this;
    }

    public CoreModelProxyAuthorizerConfiguration withKeyAuth(
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
        CoreModelProxyAuthorizerConfiguration that = (CoreModelProxyAuthorizerConfiguration) obj;
        return Objects.equals(this.keyAuth, that.keyAuth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyAuth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreModelProxyAuthorizerConfiguration {\n");
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
