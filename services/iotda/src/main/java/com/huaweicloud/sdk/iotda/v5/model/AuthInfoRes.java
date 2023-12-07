package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备接入类型。
 */
public class AuthInfoRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_secret")

    private String secondarySecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_fingerprint")

    private String secondaryFingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_access")

    private Boolean secureAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    public AuthInfoRes withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数说明**：鉴权类型。注意：不填写auth_type默认为密钥认证接入方式(SECRET)。 **取值范围**： - SECRET:使用密钥认证接入方式。 - CERTIFICATES:使用证书认证接入方式。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public AuthInfoRes withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * **参数说明**：设备密钥，认证类型使用密钥认证接入(SECRET)可填写该字段。注意：NB设备密钥由于协议特殊性，只支持十六进制密钥接入；查询设备列表接口不返回该参数。 **取值范围**：长度不低于8不超过32，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public AuthInfoRes withSecondarySecret(String secondarySecret) {
        this.secondarySecret = secondarySecret;
        return this;
    }

    /**
     * **参数说明**：设备备用密钥，认证类型使用密钥认证接入(SECRET)该字段有效，当主密钥校验不通过时，会启用辅密钥校验，辅密钥与主密钥有相同的效力；辅密钥对coap协议接入的设备不生效。注意：NB设备密钥由于协议特殊性，只支持十六进制密钥接入；查询设备列表接口不返回该参数。 **取值范围**：长度不低于8不超过32，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return secondarySecret
     */
    public String getSecondarySecret() {
        return secondarySecret;
    }

    public void setSecondarySecret(String secondarySecret) {
        this.secondarySecret = secondarySecret;
    }

    public AuthInfoRes withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * **参数说明**：证书指纹，认证类型使用证书认证接入(CERTIFICATES)该字段有效，注册设备时不填写该字段则取第一次设备接入时的证书指纹。 **取值范围**：长度为40的十六进制字符串或者长度为64的十六进制字符串。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public AuthInfoRes withSecondaryFingerprint(String secondaryFingerprint) {
        this.secondaryFingerprint = secondaryFingerprint;
        return this;
    }

    /**
     * **参数说明**：证书备用指纹，认证类型使用证书认证接入(CERTIFICATES)该字段有效，当主指纹校验不通过时，会启用辅指纹校验，辅指纹与主指纹有相同的效力。 **取值范围**：长度为40的十六进制字符串或者长度为64的十六进制字符串。
     * @return secondaryFingerprint
     */
    public String getSecondaryFingerprint() {
        return secondaryFingerprint;
    }

    public void setSecondaryFingerprint(String secondaryFingerprint) {
        this.secondaryFingerprint = secondaryFingerprint;
    }

    public AuthInfoRes withSecureAccess(Boolean secureAccess) {
        this.secureAccess = secureAccess;
        return this;
    }

    /**
     * **参数说明**：指设备是否通过安全协议方式接入。 **取值范围**： - true：通过安全协议方式接入。 - false：通过非安全协议方式接入。非安全接入的设备存在被仿冒等安全风险，请谨慎使用。
     * @return secureAccess
     */
    public Boolean getSecureAccess() {
        return secureAccess;
    }

    public void setSecureAccess(Boolean secureAccess) {
        this.secureAccess = secureAccess;
    }

    public AuthInfoRes withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * **参数说明**：设备接入的有效时间，单位：秒，默认值：0 若设备在有效时间内未接入物联网平台并激活，则平台会删除该设备的注册信息。若设置为“0”，则表示平台不会删除该设备的注册信息（建议填写为“0”）。 注意：该参数只对直连设备生效。
     * minimum: 0
     * maximum: 2147483647
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthInfoRes that = (AuthInfoRes) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.secret, that.secret)
            && Objects.equals(this.secondarySecret, that.secondarySecret)
            && Objects.equals(this.fingerprint, that.fingerprint)
            && Objects.equals(this.secondaryFingerprint, that.secondaryFingerprint)
            && Objects.equals(this.secureAccess, that.secureAccess) && Objects.equals(this.timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(authType, secret, secondarySecret, fingerprint, secondaryFingerprint, secureAccess, timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthInfoRes {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    secondarySecret: ").append(toIndentedString(secondarySecret)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    secondaryFingerprint: ").append(toIndentedString(secondaryFingerprint)).append("\n");
        sb.append("    secureAccess: ").append(toIndentedString(secureAccess)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
