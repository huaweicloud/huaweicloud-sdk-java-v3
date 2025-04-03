package com.huaweicloud.sdk.identitycenteroidc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTokenReqBody
 */
public class CreateTokenReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_code")

    private String deviceCode;

    /**
     * 请求的授权类型。支持授权码、设备代码、客户端凭证和刷新令牌等授权类型
     */
    public static final class GrantTypeEnum {

        /**
         * Enum AUTHORIZATION_CODE for value: "authorization_code"
         */
        public static final GrantTypeEnum AUTHORIZATION_CODE = new GrantTypeEnum("authorization_code");

        /**
         * Enum URN_IETF_PARAMS_OAUTH_GRANT_TYPE_DEVICE_CODE for value: "urn:ietf:params:oauth:grant-type:device_code"
         */
        public static final GrantTypeEnum URN_IETF_PARAMS_OAUTH_GRANT_TYPE_DEVICE_CODE =
            new GrantTypeEnum("urn:ietf:params:oauth:grant-type:device_code");

        private static final Map<String, GrantTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GrantTypeEnum> createStaticFields() {
            Map<String, GrantTypeEnum> map = new HashMap<>();
            map.put("authorization_code", AUTHORIZATION_CODE);
            map.put("urn:ietf:params:oauth:grant-type:device_code", URN_IETF_PARAMS_OAUTH_GRANT_TYPE_DEVICE_CODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GrantTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GrantTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GrantTypeEnum(value));
        }

        public static GrantTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GrantTypeEnum) {
                return this.value.equals(((GrantTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_type")

    private GrantTypeEnum grantType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_uri")

    private String redirectUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_token")

    private String refreshToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scopes")

    private List<String> scopes = null;

    public CreateTokenReqBody withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端的唯一标识
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public CreateTokenReqBody withClientSecret(String clientSecret) {
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

    public CreateTokenReqBody withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 从授权服务接收的授权代码。执行授权授予请求以获取对令牌的访问权限时需要此参数
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CreateTokenReqBody withDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }

    /**
     * 仅在为设备代码授权类型调用此API时使用
     * @return deviceCode
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public CreateTokenReqBody withGrantType(GrantTypeEnum grantType) {
        this.grantType = grantType;
        return this;
    }

    /**
     * 请求的授权类型。支持授权码、设备代码、客户端凭证和刷新令牌等授权类型
     * @return grantType
     */
    public GrantTypeEnum getGrantType() {
        return grantType;
    }

    public void setGrantType(GrantTypeEnum grantType) {
        this.grantType = grantType;
    }

    public CreateTokenReqBody withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * 将接收授权代码的应用程序的位置。用户授权服务将请求发送到此位置
     * @return redirectUri
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public CreateTokenReqBody withRefreshToken(String refreshToken) {
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

    public CreateTokenReqBody withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public CreateTokenReqBody addScopesItem(String scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public CreateTokenReqBody withScopes(Consumer<List<String>> scopesSetter) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        scopesSetter.accept(this.scopes);
        return this;
    }

    /**
     * 客户端定义的作用域列表，表示客户端想要获取的权限。授权后，此列表用于在授予访问令牌时限制权限
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
        CreateTokenReqBody that = (CreateTokenReqBody) obj;
        return Objects.equals(this.clientId, that.clientId) && Objects.equals(this.clientSecret, that.clientSecret)
            && Objects.equals(this.code, that.code) && Objects.equals(this.deviceCode, that.deviceCode)
            && Objects.equals(this.grantType, that.grantType) && Objects.equals(this.redirectUri, that.redirectUri)
            && Objects.equals(this.refreshToken, that.refreshToken) && Objects.equals(this.scopes, that.scopes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSecret, code, deviceCode, grantType, redirectUri, refreshToken, scopes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTokenReqBody {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    deviceCode: ").append(toIndentedString(deviceCode)).append("\n");
        sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
        sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
