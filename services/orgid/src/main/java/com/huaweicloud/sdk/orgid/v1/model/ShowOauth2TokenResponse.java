package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOauth2TokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_token")

    private String refreshToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_type")

    private String tokenType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_in")

    private Long expiresIn;

    public ShowOauth2TokenResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * 用户级接入token
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public ShowOauth2TokenResponse withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * 用户级刷新token，离线模式适用，用于服务端主动刷新用户token
     * @return refreshToken
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public ShowOauth2TokenResponse withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 授权信息范围
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ShowOauth2TokenResponse withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * token类型，固定值“Bearer”，消息头传入token时前缀填入方式
     * @return tokenType
     */
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public ShowOauth2TokenResponse withExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * token失效时长
     * @return expiresIn
     */
    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOauth2TokenResponse that = (ShowOauth2TokenResponse) obj;
        return Objects.equals(this.accessToken, that.accessToken)
            && Objects.equals(this.refreshToken, that.refreshToken) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.tokenType, that.tokenType) && Objects.equals(this.expiresIn, that.expiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, refreshToken, scope, tokenType, expiresIn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOauth2TokenResponse {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
