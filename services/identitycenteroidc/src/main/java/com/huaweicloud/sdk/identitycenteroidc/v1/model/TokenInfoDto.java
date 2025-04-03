package com.huaweicloud.sdk.identitycenteroidc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TokenInfoDto
 */
public class TokenInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_in")

    private Integer expiresIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_token")

    private String idToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_token")

    private String refreshToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_type")

    private String tokenType;

    public TokenInfoDto withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * 用于访问分配给用户的IAM身份中心资源的不透明令牌
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public TokenInfoDto withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * 访问令牌的过期时间（以秒为单位）
     * @return expiresIn
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public TokenInfoDto withIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }

    /**
     * 用于表明用户身份的不透明令牌
     * @return idToken
     */
    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public TokenInfoDto withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * 刷新令牌，此令牌可在访问令牌过期后获取新的访问令牌
     * @return refreshToken
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public TokenInfoDto withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * 用于通知客户端返回的令牌是访问令牌，目前为BearerToken
     * @return tokenType
     */
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TokenInfoDto that = (TokenInfoDto) obj;
        return Objects.equals(this.accessToken, that.accessToken) && Objects.equals(this.expiresIn, that.expiresIn)
            && Objects.equals(this.idToken, that.idToken) && Objects.equals(this.refreshToken, that.refreshToken)
            && Objects.equals(this.tokenType, that.tokenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, expiresIn, idToken, refreshToken, tokenType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenInfoDto {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
