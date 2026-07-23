package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** API KEY凭证提供者配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayApiKeyCredentialProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    /**
     * **参数解释：** 凭证传递位置。 **约束限制：** 不涉及。 **取值范围：** - `header`: 通过 HTTP 请求头传递 API 密钥 - `query`: 通过 URL 查询参数传递 API 密钥 **默认取值：** 不涉及。 
     */
    public static final class CredentialLocationEnum {

        /**
         * Enum HEADER for value: "header"
         */
        public static final CredentialLocationEnum HEADER = new CredentialLocationEnum("header");

        /**
         * Enum QUERY for value: "query"
         */
        public static final CredentialLocationEnum QUERY = new CredentialLocationEnum("query");

        private static final Map<String, CredentialLocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CredentialLocationEnum> createStaticFields() {
            Map<String, CredentialLocationEnum> map = new HashMap<>();
            map.put("header", HEADER);
            map.put("query", QUERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CredentialLocationEnum(String value) {
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
        public static CredentialLocationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CredentialLocationEnum(value));
        }

        public static CredentialLocationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CredentialLocationEnum) {
                return this.value.equals(((CredentialLocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_location")

    private CredentialLocationEnum credentialLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_parameter_name")

    private String credentialParameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_prefix")

    private String credentialPrefix;

    public CoreGatewayApiKeyCredentialProvider withProviderName(String providerName) {
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

    public CoreGatewayApiKeyCredentialProvider withCredentialLocation(CredentialLocationEnum credentialLocation) {
        this.credentialLocation = credentialLocation;
        return this;
    }

    /**
     * **参数解释：** 凭证传递位置。 **约束限制：** 不涉及。 **取值范围：** - `header`: 通过 HTTP 请求头传递 API 密钥 - `query`: 通过 URL 查询参数传递 API 密钥 **默认取值：** 不涉及。 
     * @return credentialLocation
     */
    public CredentialLocationEnum getCredentialLocation() {
        return credentialLocation;
    }

    public void setCredentialLocation(CredentialLocationEnum credentialLocation) {
        this.credentialLocation = credentialLocation;
    }

    public CoreGatewayApiKeyCredentialProvider withCredentialParameterName(String credentialParameterName) {
        this.credentialParameterName = credentialParameterName;
        return this;
    }

    /**
     * **参数解释：** 凭证参数名称。 **约束限制：** 不涉及。 **取值范围：** 长度为 0-64 个字符。 **默认取值：** Authorization。 
     * @return credentialParameterName
     */
    public String getCredentialParameterName() {
        return credentialParameterName;
    }

    public void setCredentialParameterName(String credentialParameterName) {
        this.credentialParameterName = credentialParameterName;
    }

    public CoreGatewayApiKeyCredentialProvider withCredentialPrefix(String credentialPrefix) {
        this.credentialPrefix = credentialPrefix;
        return this;
    }

    /**
     * **参数解释：** 凭证前缀（如 \"Bearer \"）。 **约束限制：** 不涉及。 **取值范围：** 长度为 0-64 个字符。 **默认取值：** 不涉及。 
     * @return credentialPrefix
     */
    public String getCredentialPrefix() {
        return credentialPrefix;
    }

    public void setCredentialPrefix(String credentialPrefix) {
        this.credentialPrefix = credentialPrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayApiKeyCredentialProvider that = (CoreGatewayApiKeyCredentialProvider) obj;
        return Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.credentialLocation, that.credentialLocation)
            && Objects.equals(this.credentialParameterName, that.credentialParameterName)
            && Objects.equals(this.credentialPrefix, that.credentialPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerName, credentialLocation, credentialParameterName, credentialPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayApiKeyCredentialProvider {\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    credentialLocation: ").append(toIndentedString(credentialLocation)).append("\n");
        sb.append("    credentialParameterName: ").append(toIndentedString(credentialParameterName)).append("\n");
        sb.append("    credentialPrefix: ").append(toIndentedString(credentialPrefix)).append("\n");
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
