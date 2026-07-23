package com.huaweicloud.sdk.agentarts.v1.model;

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
 * **参数解释：** OAuth凭证提供者配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayOAuthCredentialProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    /**
     * **参数解释：** OAuth 授权类型。 **约束限制：** 不涉及。 **取值范围：** - `client_credentials`: 适用于服务器到服务器通信 - `authorization_code`: 适用于需要用户授权的应用 **默认取值：** 不涉及。 
     */
    public static final class GrantTypeEnum {

        /**
         * Enum CLIENT_CREDENTIALS for value: "client_credentials"
         */
        public static final GrantTypeEnum CLIENT_CREDENTIALS = new GrantTypeEnum("client_credentials");

        /**
         * Enum AUTHORIZATION_CODE for value: "authorization_code"
         */
        public static final GrantTypeEnum AUTHORIZATION_CODE = new GrantTypeEnum("authorization_code");

        private static final Map<String, GrantTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GrantTypeEnum> createStaticFields() {
            Map<String, GrantTypeEnum> map = new HashMap<>();
            map.put("client_credentials", CLIENT_CREDENTIALS);
            map.put("authorization_code", AUTHORIZATION_CODE);
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
    @JsonProperty(value = "scopes")

    private List<String> scopes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_return_url")

    private String defaultReturnUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_parameters")

    private Map<String, String> customParameters = null;

    public CoreGatewayOAuthCredentialProvider withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * **参数解释：** 凭证提供者名称。 **约束限制：** 不涉及。 **取值范围：** 长度为 1-56 个字符，由字母、数字、下划线或短横线组成的、长度为1到56个字符的字符串，符合正则条件^[a-zA-Z0-9_-]{1,56}$。 **默认取值：** 不涉及。 
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public CoreGatewayOAuthCredentialProvider withGrantType(GrantTypeEnum grantType) {
        this.grantType = grantType;
        return this;
    }

    /**
     * **参数解释：** OAuth 授权类型。 **约束限制：** 不涉及。 **取值范围：** - `client_credentials`: 适用于服务器到服务器通信 - `authorization_code`: 适用于需要用户授权的应用 **默认取值：** 不涉及。 
     * @return grantType
     */
    public GrantTypeEnum getGrantType() {
        return grantType;
    }

    public void setGrantType(GrantTypeEnum grantType) {
        this.grantType = grantType;
    }

    public CoreGatewayOAuthCredentialProvider withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public CoreGatewayOAuthCredentialProvider addScopesItem(String scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public CoreGatewayOAuthCredentialProvider withScopes(Consumer<List<String>> scopesSetter) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        scopesSetter.accept(this.scopes);
        return this;
    }

    /**
     * **参数解释：** OAuth 作用域列表。 **约束限制：** 不涉及。 **取值范围：** 数组长度为 0-100。 **默认取值：** 不涉及。 
     * @return scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public CoreGatewayOAuthCredentialProvider withDefaultReturnUrl(String defaultReturnUrl) {
        this.defaultReturnUrl = defaultReturnUrl;
        return this;
    }

    /**
     * **参数解释：** 默认返回 URL。 **约束限制：** 不涉及。 **取值范围：** 长度为 0-2048，匹配由单词字符组成的协议名、冒号、零到两个斜杠，以及后续非空白字符序列的字符串，符合正则条件\\w+:(/?/?)[^\\s]+。 **默认取值：** 不涉及。 
     * @return defaultReturnUrl
     */
    public String getDefaultReturnUrl() {
        return defaultReturnUrl;
    }

    public void setDefaultReturnUrl(String defaultReturnUrl) {
        this.defaultReturnUrl = defaultReturnUrl;
    }

    public CoreGatewayOAuthCredentialProvider withCustomParameters(Map<String, String> customParameters) {
        this.customParameters = customParameters;
        return this;
    }

    public CoreGatewayOAuthCredentialProvider putCustomParametersItem(String key, String customParametersItem) {
        if (this.customParameters == null) {
            this.customParameters = new HashMap<>();
        }
        this.customParameters.put(key, customParametersItem);
        return this;
    }

    public CoreGatewayOAuthCredentialProvider withCustomParameters(
        Consumer<Map<String, String>> customParametersSetter) {
        if (this.customParameters == null) {
            this.customParameters = new HashMap<>();
        }
        customParametersSetter.accept(this.customParameters);
        return this;
    }

    /**
     * **参数解释：** 自定义参数，键值对形式。 **约束限制：** 不涉及。 **取值范围：** - 键：遵循 RFC 3986 URL 查询参数规范，最大长度 64，不允许为空 - 值：支持任意可打印 ASCII 字符，最大长度 255，可以为空 **默认取值：** 不涉及。 
     * @return customParameters
     */
    public Map<String, String> getCustomParameters() {
        return customParameters;
    }

    public void setCustomParameters(Map<String, String> customParameters) {
        this.customParameters = customParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayOAuthCredentialProvider that = (CoreGatewayOAuthCredentialProvider) obj;
        return Objects.equals(this.providerName, that.providerName) && Objects.equals(this.grantType, that.grantType)
            && Objects.equals(this.scopes, that.scopes) && Objects.equals(this.defaultReturnUrl, that.defaultReturnUrl)
            && Objects.equals(this.customParameters, that.customParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerName, grantType, scopes, defaultReturnUrl, customParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayOAuthCredentialProvider {\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    defaultReturnUrl: ").append(toIndentedString(defaultReturnUrl)).append("\n");
        sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
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
