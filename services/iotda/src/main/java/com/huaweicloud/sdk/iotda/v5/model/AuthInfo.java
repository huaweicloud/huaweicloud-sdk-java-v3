package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 设备接入类型。
 */
public class AuthInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret")
    
    private String secret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fingerprint")
    
    private String fingerprint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secure_access")
    
    private Boolean secureAccess = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout = 0;

    public AuthInfo withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    


    /**
     * 鉴权类型。支持密钥认证接入(SECRET)和证书认证接入(CERTIFICATES)两种方式。使用密钥认证接入方式(SECRET)填写secret字段，使用证书认证接入方式(CERTIFICATES)填写fingerprint字段，不填写auth_type默认为密钥认证接入方式(SECRET)
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public AuthInfo withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    


    /**
     * 设备密钥，认证类型使用密钥认证接入(SECRET)可填写该字段。注意：NB设备密钥由于协议特殊性，只支持十六进制密钥接入；查询设备列表接口不返回该参数。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public AuthInfo withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    


    /**
     * 证书指纹，认证类型使用证书认证接入(CERTIFICATES)可填写该字段，注册设备时不填写该字段则取第一次设备接入时的证书指纹。注意：指纹只能为40位十六进制字符串或者64位十六进制字符串。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public AuthInfo withSecureAccess(Boolean secureAccess) {
        this.secureAccess = secureAccess;
        return this;
    }

    


    /**
     * 指设备是否通过安全协议方式接入，默认值为true。 - true：通过安全协议方式接入。 - false：通过非安全协议方式接入。非安全接入的设备存在被仿冒等安全风险，请谨慎使用。 
     * @return secureAccess
     */
    public Boolean getSecureAccess() {
        return secureAccess;
    }

    public void setSecureAccess(Boolean secureAccess) {
        this.secureAccess = secureAccess;
    }

    public AuthInfo withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * 设备接入的有效时间，单位：秒，默认值：0 若设备在有效时间内未接入物联网平台并激活，则平台会删除该设备的注册信息。若设置为“0”，则表示平台不会删除该设备的注册信息（建议填写为“0”）。 注意：只有注册设备接口或者修改设备接口修改timeout时返回该参数。 
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthInfo authInfo = (AuthInfo) o;
        return Objects.equals(this.authType, authInfo.authType) &&
            Objects.equals(this.secret, authInfo.secret) &&
            Objects.equals(this.fingerprint, authInfo.fingerprint) &&
            Objects.equals(this.secureAccess, authInfo.secureAccess) &&
            Objects.equals(this.timeout, authInfo.timeout);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authType, secret, fingerprint, secureAccess, timeout);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthInfo {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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

