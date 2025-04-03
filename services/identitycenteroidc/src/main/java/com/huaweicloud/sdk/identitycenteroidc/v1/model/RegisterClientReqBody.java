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
 * RegisterClientReqBody
 */
public class RegisterClientReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_name")

    private String clientName;

    /**
     * 客户端的类型。该服务仅支持public作为客户端类型
     */
    public static final class ClientTypeEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final ClientTypeEnum PUBLIC = new ClientTypeEnum("public");

        private static final Map<String, ClientTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClientTypeEnum> createStaticFields() {
            Map<String, ClientTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClientTypeEnum(String value) {
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
        public static ClientTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClientTypeEnum(value));
        }

        public static ClientTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClientTypeEnum) {
                return this.value.equals(((ClientTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_type")

    private ClientTypeEnum clientType;

    /**
     * 向令牌端点发送请求时所需的身份验证方法
     */
    public static final class TokenEndpointAuthMethodEnum {

        /**
         * Enum CLIENT_SECRET_POST for value: "client_secret_post"
         */
        public static final TokenEndpointAuthMethodEnum CLIENT_SECRET_POST =
            new TokenEndpointAuthMethodEnum("client_secret_post");

        private static final Map<String, TokenEndpointAuthMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TokenEndpointAuthMethodEnum> createStaticFields() {
            Map<String, TokenEndpointAuthMethodEnum> map = new HashMap<>();
            map.put("client_secret_post", CLIENT_SECRET_POST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TokenEndpointAuthMethodEnum(String value) {
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
        public static TokenEndpointAuthMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new TokenEndpointAuthMethodEnum(value));
        }

        public static TokenEndpointAuthMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TokenEndpointAuthMethodEnum) {
                return this.value.equals(((TokenEndpointAuthMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_endpoint_auth_method")

    private TokenEndpointAuthMethodEnum tokenEndpointAuthMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scopes")

    private List<String> scopes = null;

    /**
     * Gets or Sets grantTypes
     */
    public static final class GrantTypesEnum {

        /**
         * Enum URN_IETF_PARAMS_OAUTH_GRANT_TYPE_DEVICE_CODE for value: "urn:ietf:params:oauth:grant-type:device_code"
         */
        public static final GrantTypesEnum URN_IETF_PARAMS_OAUTH_GRANT_TYPE_DEVICE_CODE =
            new GrantTypesEnum("urn:ietf:params:oauth:grant-type:device_code");

        /**
         * Enum AUTHORIZATION_CODE for value: "authorization_code"
         */
        public static final GrantTypesEnum AUTHORIZATION_CODE = new GrantTypesEnum("authorization_code");

        private static final Map<String, GrantTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GrantTypesEnum> createStaticFields() {
            Map<String, GrantTypesEnum> map = new HashMap<>();
            map.put("urn:ietf:params:oauth:grant-type:device_code", URN_IETF_PARAMS_OAUTH_GRANT_TYPE_DEVICE_CODE);
            map.put("authorization_code", AUTHORIZATION_CODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GrantTypesEnum(String value) {
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
        public static GrantTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GrantTypesEnum(value));
        }

        public static GrantTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GrantTypesEnum) {
                return this.value.equals(((GrantTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_types")

    private List<GrantTypesEnum> grantTypes = null;

    /**
     * Gets or Sets responseTypes
     */
    public static final class ResponseTypesEnum {

        /**
         * Enum CODE for value: "code"
         */
        public static final ResponseTypesEnum CODE = new ResponseTypesEnum("code");

        private static final Map<String, ResponseTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResponseTypesEnum> createStaticFields() {
            Map<String, ResponseTypesEnum> map = new HashMap<>();
            map.put("code", CODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResponseTypesEnum(String value) {
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
        public static ResponseTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResponseTypesEnum(value));
        }

        public static ResponseTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResponseTypesEnum) {
                return this.value.equals(((ResponseTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_types")

    private List<ResponseTypesEnum> responseTypes = null;

    public RegisterClientReqBody withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * 客户端名称
     * @return clientName
     */
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public RegisterClientReqBody withClientType(ClientTypeEnum clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * 客户端的类型。该服务仅支持public作为客户端类型
     * @return clientType
     */
    public ClientTypeEnum getClientType() {
        return clientType;
    }

    public void setClientType(ClientTypeEnum clientType) {
        this.clientType = clientType;
    }

    public RegisterClientReqBody withTokenEndpointAuthMethod(TokenEndpointAuthMethodEnum tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
        return this;
    }

    /**
     * 向令牌端点发送请求时所需的身份验证方法
     * @return tokenEndpointAuthMethod
     */
    public TokenEndpointAuthMethodEnum getTokenEndpointAuthMethod() {
        return tokenEndpointAuthMethod;
    }

    public void setTokenEndpointAuthMethod(TokenEndpointAuthMethodEnum tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    }

    public RegisterClientReqBody withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public RegisterClientReqBody addScopesItem(String scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public RegisterClientReqBody withScopes(Consumer<List<String>> scopesSetter) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        scopesSetter.accept(this.scopes);
        return this;
    }

    /**
     * 客户端定义的作用域列表。授权后，此列表用于在授予访问令牌时限制权限
     * @return scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public RegisterClientReqBody withGrantTypes(List<GrantTypesEnum> grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    public RegisterClientReqBody addGrantTypesItem(GrantTypesEnum grantTypesItem) {
        if (this.grantTypes == null) {
            this.grantTypes = new ArrayList<>();
        }
        this.grantTypes.add(grantTypesItem);
        return this;
    }

    public RegisterClientReqBody withGrantTypes(Consumer<List<GrantTypesEnum>> grantTypesSetter) {
        if (this.grantTypes == null) {
            this.grantTypes = new ArrayList<>();
        }
        grantTypesSetter.accept(this.grantTypes);
        return this;
    }

    /**
     * 客户端可以在令牌端点使用的OAuth2.0授权类型数组
     * @return grantTypes
     */
    public List<GrantTypesEnum> getGrantTypes() {
        return grantTypes;
    }

    public void setGrantTypes(List<GrantTypesEnum> grantTypes) {
        this.grantTypes = grantTypes;
    }

    public RegisterClientReqBody withResponseTypes(List<ResponseTypesEnum> responseTypes) {
        this.responseTypes = responseTypes;
        return this;
    }

    public RegisterClientReqBody addResponseTypesItem(ResponseTypesEnum responseTypesItem) {
        if (this.responseTypes == null) {
            this.responseTypes = new ArrayList<>();
        }
        this.responseTypes.add(responseTypesItem);
        return this;
    }

    public RegisterClientReqBody withResponseTypes(Consumer<List<ResponseTypesEnum>> responseTypesSetter) {
        if (this.responseTypes == null) {
            this.responseTypes = new ArrayList<>();
        }
        responseTypesSetter.accept(this.responseTypes);
        return this;
    }

    /**
     * 客户端可以在授权端点使用的OAuth2.0授权类型数组
     * @return responseTypes
     */
    public List<ResponseTypesEnum> getResponseTypes() {
        return responseTypes;
    }

    public void setResponseTypes(List<ResponseTypesEnum> responseTypes) {
        this.responseTypes = responseTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterClientReqBody that = (RegisterClientReqBody) obj;
        return Objects.equals(this.clientName, that.clientName) && Objects.equals(this.clientType, that.clientType)
            && Objects.equals(this.tokenEndpointAuthMethod, that.tokenEndpointAuthMethod)
            && Objects.equals(this.scopes, that.scopes) && Objects.equals(this.grantTypes, that.grantTypes)
            && Objects.equals(this.responseTypes, that.responseTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientType, tokenEndpointAuthMethod, scopes, grantTypes, responseTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterClientReqBody {\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
        sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
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
