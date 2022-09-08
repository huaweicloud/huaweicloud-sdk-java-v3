package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * api鉴权字段
 */
public class ApiAuthDetail {

    /**
     * 访问API服务的认证方式 - none - basicauth - oauth2.0 - hmac - secret - md5 - apiGateway - keyTop - hikVision - huaweiNetworkManagement - liHe
     */
    public static final class AuthMethodEnum {

        /**
         * Enum NONE for value: "none"
         */
        public static final AuthMethodEnum NONE = new AuthMethodEnum("none");

        /**
         * Enum BASICAUTH for value: "basicauth"
         */
        public static final AuthMethodEnum BASICAUTH = new AuthMethodEnum("basicauth");

        /**
         * Enum OAUTH2_0 for value: "oauth2.0"
         */
        public static final AuthMethodEnum OAUTH2_0 = new AuthMethodEnum("oauth2.0");

        /**
         * Enum HMAC for value: "hmac"
         */
        public static final AuthMethodEnum HMAC = new AuthMethodEnum("hmac");

        /**
         * Enum SECRET for value: "secret"
         */
        public static final AuthMethodEnum SECRET = new AuthMethodEnum("secret");

        /**
         * Enum MD5 for value: "md5"
         */
        public static final AuthMethodEnum MD5 = new AuthMethodEnum("md5");

        /**
         * Enum APIGATEWAY for value: "apiGateway"
         */
        public static final AuthMethodEnum APIGATEWAY = new AuthMethodEnum("apiGateway");

        /**
         * Enum KEYTOP for value: "keyTop"
         */
        public static final AuthMethodEnum KEYTOP = new AuthMethodEnum("keyTop");

        /**
         * Enum HIKVISION for value: "hikVision"
         */
        public static final AuthMethodEnum HIKVISION = new AuthMethodEnum("hikVision");

        /**
         * Enum HUAWEINETWORKMANAGEMENT for value: "huaweiNetworkManagement"
         */
        public static final AuthMethodEnum HUAWEINETWORKMANAGEMENT = new AuthMethodEnum("huaweiNetworkManagement");

        /**
         * Enum LIHE for value: "liHe"
         */
        public static final AuthMethodEnum LIHE = new AuthMethodEnum("liHe");

        private static final Map<String, AuthMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthMethodEnum> createStaticFields() {
            Map<String, AuthMethodEnum> map = new HashMap<>();
            map.put("none", NONE);
            map.put("basicauth", BASICAUTH);
            map.put("oauth2.0", OAUTH2_0);
            map.put("hmac", HMAC);
            map.put("secret", SECRET);
            map.put("md5", MD5);
            map.put("apiGateway", APIGATEWAY);
            map.put("keyTop", KEYTOP);
            map.put("hikVision", HIKVISION);
            map.put("huaweiNetworkManagement", HUAWEINETWORKMANAGEMENT);
            map.put("liHe", LIHE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthMethodEnum(String value) {
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
        public static AuthMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AuthMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthMethodEnum(value);
            }
            return result;
        }

        public static AuthMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthMethodEnum) {
                return this.value.equals(((AuthMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_method")

    private AuthMethodEnum authMethod;

    /**
     * 访问API服务的APP认证方式，认证方式为（apiGateway）时填写 - default - secret - jwt
     */
    public static final class AppAuthTypeEnum {

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final AppAuthTypeEnum DEFAULT = new AppAuthTypeEnum("default");

        /**
         * Enum SECRET for value: "secret"
         */
        public static final AppAuthTypeEnum SECRET = new AppAuthTypeEnum("secret");

        /**
         * Enum JWT for value: "jwt"
         */
        public static final AppAuthTypeEnum JWT = new AppAuthTypeEnum("jwt");

        private static final Map<String, AppAuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppAuthTypeEnum> createStaticFields() {
            Map<String, AppAuthTypeEnum> map = new HashMap<>();
            map.put("default", DEFAULT);
            map.put("secret", SECRET);
            map.put("jwt", JWT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppAuthTypeEnum(String value) {
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
        public static AppAuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AppAuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AppAuthTypeEnum(value);
            }
            return result;
        }

        public static AppAuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AppAuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppAuthTypeEnum) {
                return this.value.equals(((AppAuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_auth_type")

    private AppAuthTypeEnum appAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_secret")

    private String appSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alt_ip")

    private String altIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token_url")

    private String accessTokenUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_type")

    private String grantType;

    public ApiAuthDetail withAuthMethod(AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }

    /**
     * 访问API服务的认证方式 - none - basicauth - oauth2.0 - hmac - secret - md5 - apiGateway - keyTop - hikVision - huaweiNetworkManagement - liHe
     * @return authMethod
     */
    public AuthMethodEnum getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
    }

    public ApiAuthDetail withAppAuthType(AppAuthTypeEnum appAuthType) {
        this.appAuthType = appAuthType;
        return this;
    }

    /**
     * 访问API服务的APP认证方式，认证方式为（apiGateway）时填写 - default - secret - jwt
     * @return appAuthType
     */
    public AppAuthTypeEnum getAppAuthType() {
        return appAuthType;
    }

    public void setAppAuthType(AppAuthTypeEnum appAuthType) {
        this.appAuthType = appAuthType;
    }

    public ApiAuthDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 访问API服务的用户名 - 认证方式为（lihe、huaweiNetworkManagement、basicauth）时填写
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ApiAuthDetail withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 访问API服务的密码 - 认证方式为（lihe、huaweiNetworkManagement、basicauth、secret、md5、hmac）时填写
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ApiAuthDetail withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * 访问API服务的AppKey - 认证方式为（apiGateway、oauth2.0）时填写
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public ApiAuthDetail withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    /**
     * 访问API服务的AppSecret - 认证方式为（apiGateway、oauth2.0）时填写
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public ApiAuthDetail withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * 访问API服务的Secret - 认证方式为（KeyTop、HikVision、Secret、HMAC、MD5）时填写
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public ApiAuthDetail withAltIp(String altIp) {
        this.altIp = altIp;
        return this;
    }

    /**
     * 访问API服务的备用IP - 认证方式为（HuaweiNetworkManagement）时填写
     * @return altIp
     */
    public String getAltIp() {
        return altIp;
    }

    public void setAltIp(String altIp) {
        this.altIp = altIp;
    }

    public ApiAuthDetail withAccessTokenUrl(String accessTokenUrl) {
        this.accessTokenUrl = accessTokenUrl;
        return this;
    }

    /**
     * 访问API服务的AccessTokenUrl - 认证方式为（liHe、oauth2.0 huaweiNetworkManagement）时填写
     * @return accessTokenUrl
     */
    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    public void setAccessTokenUrl(String accessTokenUrl) {
        this.accessTokenUrl = accessTokenUrl;
    }

    public ApiAuthDetail withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 访问API服务的客户端标识 - 认证方式为Oauth2时填写
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ApiAuthDetail withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * 访问API服务的客户端密钥 - 认证方式为Oauth2时填写
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public ApiAuthDetail withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 访问API服务的Scope - 认证方式为（LiHe、Oauth2）时填写
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ApiAuthDetail withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 访问API服务的Authorization - 认证方式为（LiHe）时填写
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ApiAuthDetail withGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }

    /**
     * 访问API服务的授权类型 - 认证方式为（LiHe、Oauth2）时填写 - client_credentials （oauth2.0使用）
     * @return grantType
     */
    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAuthDetail apiAuthDetail = (ApiAuthDetail) o;
        return Objects.equals(this.authMethod, apiAuthDetail.authMethod)
            && Objects.equals(this.appAuthType, apiAuthDetail.appAuthType)
            && Objects.equals(this.userName, apiAuthDetail.userName)
            && Objects.equals(this.password, apiAuthDetail.password)
            && Objects.equals(this.appKey, apiAuthDetail.appKey)
            && Objects.equals(this.appSecret, apiAuthDetail.appSecret)
            && Objects.equals(this.secret, apiAuthDetail.secret) && Objects.equals(this.altIp, apiAuthDetail.altIp)
            && Objects.equals(this.accessTokenUrl, apiAuthDetail.accessTokenUrl)
            && Objects.equals(this.clientId, apiAuthDetail.clientId)
            && Objects.equals(this.clientSecret, apiAuthDetail.clientSecret)
            && Objects.equals(this.scope, apiAuthDetail.scope)
            && Objects.equals(this.authorization, apiAuthDetail.authorization)
            && Objects.equals(this.grantType, apiAuthDetail.grantType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authMethod,
            appAuthType,
            userName,
            password,
            appKey,
            appSecret,
            secret,
            altIp,
            accessTokenUrl,
            clientId,
            clientSecret,
            scope,
            authorization,
            grantType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAuthDetail {\n");
        sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
        sb.append("    appAuthType: ").append(toIndentedString(appAuthType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    altIp: ").append(toIndentedString(altIp)).append("\n");
        sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
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
