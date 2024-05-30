package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网桥鉴权信息
 */
public class BridgeAuthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    public BridgeAuthInfo withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 鉴权类型。当前支持密钥认证接入(SECRET)。使用密钥认证接入方式(SECRET)填写secret字段，不填写auth_type默认为密钥认证接入方式(SECRET)。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public BridgeAuthInfo withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * 网桥密钥，认证类型使用密钥认证接入(SECRET)可填写该字段。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
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
        BridgeAuthInfo that = (BridgeAuthInfo) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BridgeAuthInfo {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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
