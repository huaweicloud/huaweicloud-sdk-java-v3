package com.huaweicloud.sdk.identitycenteroidc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClientInfoDto
 */
public class ClientInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_endpoint")

    private String authorizationEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id_issued_at")

    private Long clientIdIssuedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret_expires_at")

    private Long clientSecretExpiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_endpoint")

    private String tokenEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scopes")

    private List<String> scopes = null;

    public ClientInfoDto withAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * 客户端可以请求授权的端点
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    public ClientInfoDto withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端应用唯一标识
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ClientInfoDto withClientIdIssuedAt(Long clientIdIssuedAt) {
        this.clientIdIssuedAt = clientIdIssuedAt;
        return this;
    }

    /**
     * 客户端标识符和客户端密钥的注册时间
     * @return clientIdIssuedAt
     */
    public Long getClientIdIssuedAt() {
        return clientIdIssuedAt;
    }

    public void setClientIdIssuedAt(Long clientIdIssuedAt) {
        this.clientIdIssuedAt = clientIdIssuedAt;
    }

    public ClientInfoDto withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * 为客户端生成的秘密字符串。客户端将使用此字符串在后续调用中获得服务的身份验证
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public ClientInfoDto withClientSecretExpiresAt(Long clientSecretExpiresAt) {
        this.clientSecretExpiresAt = clientSecretExpiresAt;
        return this;
    }

    /**
     * 客户端标识符和客户端密钥失效的时间
     * @return clientSecretExpiresAt
     */
    public Long getClientSecretExpiresAt() {
        return clientSecretExpiresAt;
    }

    public void setClientSecretExpiresAt(Long clientSecretExpiresAt) {
        this.clientSecretExpiresAt = clientSecretExpiresAt;
    }

    public ClientInfoDto withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * 客户端可以在其中获取访问令牌的端点
     * @return tokenEndpoint
     */
    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public ClientInfoDto withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public ClientInfoDto addScopesItem(String scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public ClientInfoDto withScopes(Consumer<List<String>> scopesSetter) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        scopesSetter.accept(this.scopes);
        return this;
    }

    /**
     * 服务器为客户端注册的作用域列表。后续授权访问令牌时，权限都应该限制在此作用域列表的子集范围内
     * @return scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientInfoDto that = (ClientInfoDto) obj;
        return Objects.equals(this.authorizationEndpoint, that.authorizationEndpoint)
            && Objects.equals(this.clientId, that.clientId)
            && Objects.equals(this.clientIdIssuedAt, that.clientIdIssuedAt)
            && Objects.equals(this.clientSecret, that.clientSecret)
            && Objects.equals(this.clientSecretExpiresAt, that.clientSecretExpiresAt)
            && Objects.equals(this.tokenEndpoint, that.tokenEndpoint) && Objects.equals(this.scopes, that.scopes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationEndpoint,
            clientId,
            clientIdIssuedAt,
            clientSecret,
            clientSecretExpiresAt,
            tokenEndpoint,
            scopes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientInfoDto {\n");
        sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientIdIssuedAt: ").append(toIndentedString(clientIdIssuedAt)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    clientSecretExpiresAt: ").append(toIndentedString(clientSecretExpiresAt)).append("\n");
        sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
