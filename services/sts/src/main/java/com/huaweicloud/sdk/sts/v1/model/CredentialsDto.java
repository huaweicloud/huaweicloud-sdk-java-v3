package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 临时安全凭证。
 */
public class CredentialsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration")

    private OffsetDateTime expiration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_access_key")

    private String secretAccessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_token")

    private String securityToken;

    public CredentialsDto withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * 临时安全凭证的AK。
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public CredentialsDto withExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * 临时安全凭证的失效时间。
     * @return expiration
     */
    public OffsetDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
    }

    public CredentialsDto withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * 临时安全凭证的SK。
     * @return secretAccessKey
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public CredentialsDto withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * 临时安全凭证的security_token。
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CredentialsDto that = (CredentialsDto) obj;
        return Objects.equals(this.accessKeyId, that.accessKeyId) && Objects.equals(this.expiration, that.expiration)
            && Objects.equals(this.secretAccessKey, that.secretAccessKey)
            && Objects.equals(this.securityToken, that.securityToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyId, expiration, secretAccessKey, securityToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialsDto {\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
