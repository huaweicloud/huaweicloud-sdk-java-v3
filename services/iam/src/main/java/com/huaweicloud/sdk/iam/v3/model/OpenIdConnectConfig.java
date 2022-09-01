package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * oidc配置详细信息
 */
public class OpenIdConnectConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    @JacksonXmlProperty(localName = "access_mode")

    private String accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_url")

    @JacksonXmlProperty(localName = "idp_url")

    private String idpUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    @JacksonXmlProperty(localName = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_endpoint")

    @JacksonXmlProperty(localName = "authorization_endpoint")

    private String authorizationEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    @JacksonXmlProperty(localName = "scope")

    private String scope;

    /**
     * 授权请求返回的类型；id_token ；编程访问和管理控制台访问方式值不为空，编程访问方式值可为空 
     */
    public static final class ResponseTypeEnum {

        /**
         * Enum ID_TOKEN for value: "id_token"
         */
        public static final ResponseTypeEnum ID_TOKEN = new ResponseTypeEnum("id_token");

        private static final Map<String, ResponseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResponseTypeEnum> createStaticFields() {
            Map<String, ResponseTypeEnum> map = new HashMap<>();
            map.put("id_token", ID_TOKEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResponseTypeEnum(String value) {
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
        public static ResponseTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResponseTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResponseTypeEnum(value);
            }
            return result;
        }

        public static ResponseTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResponseTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResponseTypeEnum) {
                return this.value.equals(((ResponseTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_type")

    @JacksonXmlProperty(localName = "response_type")

    private ResponseTypeEnum responseType;

    /**
     * 授权请求返回方式， form_post 或 fragment ；编程访问和管理控制台访问方式值不为空，编程访问方式值可为空
     */
    public static final class ResponseModeEnum {

        /**
         * Enum FRAGMENT for value: "fragment"
         */
        public static final ResponseModeEnum FRAGMENT = new ResponseModeEnum("fragment");

        /**
         * Enum FORM_POST for value: "form_post"
         */
        public static final ResponseModeEnum FORM_POST = new ResponseModeEnum("form_post");

        private static final Map<String, ResponseModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResponseModeEnum> createStaticFields() {
            Map<String, ResponseModeEnum> map = new HashMap<>();
            map.put("fragment", FRAGMENT);
            map.put("form_post", FORM_POST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResponseModeEnum(String value) {
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
        public static ResponseModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResponseModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResponseModeEnum(value);
            }
            return result;
        }

        public static ResponseModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResponseModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResponseModeEnum) {
                return this.value.equals(((ResponseModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_mode")

    @JacksonXmlProperty(localName = "response_mode")

    private ResponseModeEnum responseMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signing_key")

    @JacksonXmlProperty(localName = "signing_key")

    private String signingKey;

    public OpenIdConnectConfig withAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 访问方式: program_console: 支持编程访问和管理控制台访问方式; program: 支持编程访问方式
     * @return accessMode
     */
    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public OpenIdConnectConfig withIdpUrl(String idpUrl) {
        this.idpUrl = idpUrl;
        return this;
    }

    /**
     * OpenID Connect身份提供商标识, 对应ID token 中 iss
     * @return idpUrl
     */
    public String getIdpUrl() {
        return idpUrl;
    }

    public void setIdpUrl(String idpUrl) {
        this.idpUrl = idpUrl;
    }

    public OpenIdConnectConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 在OpenID Connect身份提供商注册的客户端ID
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public OpenIdConnectConfig withAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * OpenID Connect身份提供商授权地址; 编程访问和管理控制台访问方式值不为空，编程访问方式值可为空
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    public OpenIdConnectConfig withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 授权请求信息范围，编程访问和管理控制台访问方式必选，编程访问方式不可选，可选值：openid 、email、profile，IDP自定义scope，字符集a-zA-Z_0-9 ，1-10个可选值组合空格分割，至少包括openid，顺序无关，总长度最长255字符，例如：\"openid\"、\"openid email\"、\"openid profile\" 、\"openid email profile\"
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public OpenIdConnectConfig withResponseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * 授权请求返回的类型；id_token ；编程访问和管理控制台访问方式值不为空，编程访问方式值可为空 
     * @return responseType
     */
    public ResponseTypeEnum getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
    }

    public OpenIdConnectConfig withResponseMode(ResponseModeEnum responseMode) {
        this.responseMode = responseMode;
        return this;
    }

    /**
     * 授权请求返回方式， form_post 或 fragment ；编程访问和管理控制台访问方式值不为空，编程访问方式值可为空
     * @return responseMode
     */
    public ResponseModeEnum getResponseMode() {
        return responseMode;
    }

    public void setResponseMode(ResponseModeEnum responseMode) {
        this.responseMode = responseMode;
    }

    public OpenIdConnectConfig withSigningKey(String signingKey) {
        this.signingKey = signingKey;
        return this;
    }

    /**
     * OpenID Connect身份提供商ID Token签名的公钥
     * @return signingKey
     */
    public String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenIdConnectConfig openIdConnectConfig = (OpenIdConnectConfig) o;
        return Objects.equals(this.accessMode, openIdConnectConfig.accessMode)
            && Objects.equals(this.idpUrl, openIdConnectConfig.idpUrl)
            && Objects.equals(this.clientId, openIdConnectConfig.clientId)
            && Objects.equals(this.authorizationEndpoint, openIdConnectConfig.authorizationEndpoint)
            && Objects.equals(this.scope, openIdConnectConfig.scope)
            && Objects.equals(this.responseType, openIdConnectConfig.responseType)
            && Objects.equals(this.responseMode, openIdConnectConfig.responseMode)
            && Objects.equals(this.signingKey, openIdConnectConfig.signingKey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(accessMode, idpUrl, clientId, authorizationEndpoint, scope, responseType, responseMode, signingKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenIdConnectConfig {\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    idpUrl: ").append(toIndentedString(idpUrl)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
        sb.append("    responseMode: ").append(toIndentedString(responseMode)).append("\n");
        sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
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
