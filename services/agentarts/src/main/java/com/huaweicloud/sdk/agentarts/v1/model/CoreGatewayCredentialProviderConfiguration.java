package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 凭证提供者配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayCredentialProviderConfiguration {

    /**
     * **参数解释：** 凭证提供者类型。 **约束限制：** 不涉及。 **取值范围：** - `iam`: 使用网关 IAM 角色（目前暂不支持） - `oauth`: 使用 OAuth 2.0 - `api_key`: 使用 API 密钥 - `none`: 无认证 **默认取值：** 不涉及。 
     */
    public static final class CredentialProviderTypeEnum {

        /**
         * Enum IAM for value: "iam"
         */
        public static final CredentialProviderTypeEnum IAM = new CredentialProviderTypeEnum("iam");

        /**
         * Enum OAUTH for value: "oauth"
         */
        public static final CredentialProviderTypeEnum OAUTH = new CredentialProviderTypeEnum("oauth");

        /**
         * Enum API_KEY for value: "api_key"
         */
        public static final CredentialProviderTypeEnum API_KEY = new CredentialProviderTypeEnum("api_key");

        private static final Map<String, CredentialProviderTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CredentialProviderTypeEnum> createStaticFields() {
            Map<String, CredentialProviderTypeEnum> map = new HashMap<>();
            map.put("iam", IAM);
            map.put("oauth", OAUTH);
            map.put("api_key", API_KEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CredentialProviderTypeEnum(String value) {
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
        public static CredentialProviderTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new CredentialProviderTypeEnum(value));
        }

        public static CredentialProviderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CredentialProviderTypeEnum) {
                return this.value.equals(((CredentialProviderTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider_type")

    private CredentialProviderTypeEnum credentialProviderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider")

    private CoreGatewayCredentialProvider credentialProvider;

    public CoreGatewayCredentialProviderConfiguration withCredentialProviderType(
        CredentialProviderTypeEnum credentialProviderType) {
        this.credentialProviderType = credentialProviderType;
        return this;
    }

    /**
     * **参数解释：** 凭证提供者类型。 **约束限制：** 不涉及。 **取值范围：** - `iam`: 使用网关 IAM 角色（目前暂不支持） - `oauth`: 使用 OAuth 2.0 - `api_key`: 使用 API 密钥 - `none`: 无认证 **默认取值：** 不涉及。 
     * @return credentialProviderType
     */
    public CredentialProviderTypeEnum getCredentialProviderType() {
        return credentialProviderType;
    }

    public void setCredentialProviderType(CredentialProviderTypeEnum credentialProviderType) {
        this.credentialProviderType = credentialProviderType;
    }

    public CoreGatewayCredentialProviderConfiguration withCredentialProvider(
        CoreGatewayCredentialProvider credentialProvider) {
        this.credentialProvider = credentialProvider;
        return this;
    }

    public CoreGatewayCredentialProviderConfiguration withCredentialProvider(
        Consumer<CoreGatewayCredentialProvider> credentialProviderSetter) {
        if (this.credentialProvider == null) {
            this.credentialProvider = new CoreGatewayCredentialProvider();
            credentialProviderSetter.accept(this.credentialProvider);
        }

        return this;
    }

    /**
     * Get credentialProvider
     * @return credentialProvider
     */
    public CoreGatewayCredentialProvider getCredentialProvider() {
        return credentialProvider;
    }

    public void setCredentialProvider(CoreGatewayCredentialProvider credentialProvider) {
        this.credentialProvider = credentialProvider;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayCredentialProviderConfiguration that = (CoreGatewayCredentialProviderConfiguration) obj;
        return Objects.equals(this.credentialProviderType, that.credentialProviderType)
            && Objects.equals(this.credentialProvider, that.credentialProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialProviderType, credentialProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayCredentialProviderConfiguration {\n");
        sb.append("    credentialProviderType: ").append(toIndentedString(credentialProviderType)).append("\n");
        sb.append("    credentialProvider: ").append(toIndentedString(credentialProvider)).append("\n");
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
