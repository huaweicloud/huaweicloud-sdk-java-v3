package com.huaweicloud.sdk.identitycenterportalapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分配给用户的指定委托或信任委托的凭证
 */
public class AgencyCredentials {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration")

    private Long expiration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_access_key")

    private String secretAccessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_token")

    private String sessionToken;

    public AgencyCredentials withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * 用于临时安全凭证的标识符
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public AgencyCredentials withExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * 临时安全凭证到期的日期
     * @return expiration
     */
    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    public AgencyCredentials withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * 用于对请求进行签名的密钥
     * @return secretAccessKey
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public AgencyCredentials withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    /**
     * 用于临时凭证的令牌
     * @return sessionToken
     */
    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyCredentials that = (AgencyCredentials) obj;
        return Objects.equals(this.accessKeyId, that.accessKeyId) && Objects.equals(this.expiration, that.expiration)
            && Objects.equals(this.secretAccessKey, that.secretAccessKey)
            && Objects.equals(this.sessionToken, that.sessionToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyId, expiration, secretAccessKey, sessionToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyCredentials {\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
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
