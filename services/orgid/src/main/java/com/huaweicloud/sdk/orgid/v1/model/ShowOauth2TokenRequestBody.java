package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ShowOauth2TokenRequestBody
 */
public class ShowOauth2TokenRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_type")

    private String grantType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_uri")

    private String redirectUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private String accessType;

    public ShowOauth2TokenRequestBody withGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }

    /**
     * 固定值authorization_code
     * @return grantType
     */
    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public ShowOauth2TokenRequestBody withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 授权码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowOauth2TokenRequestBody withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端应用注册ID
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ShowOauth2TokenRequestBody withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * 客户端应用注册密钥
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public ShowOauth2TokenRequestBody withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * 重定向地址，与授权码重定向地址一直，与应用注册是配置的回调地址校验需要一致
     * @return redirectUri
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public ShowOauth2TokenRequestBody withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * 接入模式，默认在线模式，可不填，值为离线模式时，设置为offline会返回refresh_token
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("grant_type", new FormDataPart<>(grantType));
                put("code", new FormDataPart<>(code));
                put("client_id", new FormDataPart<>(clientId));
                put("client_secret", new FormDataPart<>(clientSecret));
                put("redirect_uri", new FormDataPart<>(redirectUri));
                if (accessType != null) {
                    put("access_type", new FormDataPart<>(accessType));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOauth2TokenRequestBody that = (ShowOauth2TokenRequestBody) obj;
        return Objects.equals(this.grantType, that.grantType) && Objects.equals(this.code, that.code)
            && Objects.equals(this.clientId, that.clientId) && Objects.equals(this.clientSecret, that.clientSecret)
            && Objects.equals(this.redirectUri, that.redirectUri) && Objects.equals(this.accessType, that.accessType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantType, code, clientId, clientSecret, redirectUri, accessType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOauth2TokenRequestBody {\n");
        sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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
