package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecretInfo
 */
public class SecretInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authMode")

    private String authMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private Object secret;

    public SecretInfo withAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    /**
     * 使用的认证模式
     * @return authMode
     */
    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public SecretInfo withSecret(Object secret) {
        this.secret = secret;
        return this;
    }

    /**
     * 存储了实际认证凭据的Secret
     * @return secret
     */
    public Object getSecret() {
        return secret;
    }

    public void setSecret(Object secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecretInfo that = (SecretInfo) obj;
        return Objects.equals(this.authMode, that.authMode) && Objects.equals(this.secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authMode, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretInfo {\n");
        sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
