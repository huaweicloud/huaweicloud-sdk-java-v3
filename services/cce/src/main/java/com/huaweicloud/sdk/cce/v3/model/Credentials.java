package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 委托凭据信息
 */
public class Credentials {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessKeyId")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretAccessKey")

    private String secretAccessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityToken")

    private String securityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration")

    private String expiration;

    public Credentials withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * **参数解释**： 临时安全凭证的AK **约束限制**： 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public Credentials withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * **参数解释：** 临时安全凭证的SK **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return secretAccessKey
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public Credentials withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * **参数解释**： 临时安全凭证的security_token **约束限制**： 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public Credentials withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * **参数解释：** 临时安全凭证的失效时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return expiration
     */
    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Credentials that = (Credentials) obj;
        return Objects.equals(this.accessKeyId, that.accessKeyId)
            && Objects.equals(this.secretAccessKey, that.secretAccessKey)
            && Objects.equals(this.securityToken, that.securityToken)
            && Objects.equals(this.expiration, that.expiration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyId, secretAccessKey, securityToken, expiration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Credentials {\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
