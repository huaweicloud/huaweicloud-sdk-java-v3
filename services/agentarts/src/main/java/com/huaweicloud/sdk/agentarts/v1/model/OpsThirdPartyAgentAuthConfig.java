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
 * **参数解释：** 三方托管智能体的鉴权配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsThirdPartyAgentAuthConfig {

    /**
     * **参数解释：** 鉴权类型。 **约束限制：** 必须为枚举值之一。 **取值范围：** - API_KEY：API Key鉴权 - NONE：无需鉴权 **默认取值：** NONE。
     */
    public static final class TypeEnum {

        /**
         * Enum API_KEY for value: "API_KEY"
         */
        public static final TypeEnum API_KEY = new TypeEnum("API_KEY");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final TypeEnum NONE = new TypeEnum("NONE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("API_KEY", API_KEY);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key")

    private String apiKey;

    /**
     * **参数解释：** API Key传递位置，当type为API_KEY时必填。 **约束限制：** 必须为枚举值之一。 **取值范围：** - HEADER：放在HTTP请求Header中 - QUERY：放在HTTP请求Query参数中 **默认取值：** HEADER。
     */
    public static final class ApiKeyPositionEnum {

        /**
         * Enum HEADER for value: "HEADER"
         */
        public static final ApiKeyPositionEnum HEADER = new ApiKeyPositionEnum("HEADER");

        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final ApiKeyPositionEnum QUERY = new ApiKeyPositionEnum("QUERY");

        private static final Map<String, ApiKeyPositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiKeyPositionEnum> createStaticFields() {
            Map<String, ApiKeyPositionEnum> map = new HashMap<>();
            map.put("HEADER", HEADER);
            map.put("QUERY", QUERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiKeyPositionEnum(String value) {
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
        public static ApiKeyPositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiKeyPositionEnum(value));
        }

        public static ApiKeyPositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiKeyPositionEnum) {
                return this.value.equals(((ApiKeyPositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key_position")

    private ApiKeyPositionEnum apiKeyPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key_name")

    private String apiKeyName;

    public OpsThirdPartyAgentAuthConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 鉴权类型。 **约束限制：** 必须为枚举值之一。 **取值范围：** - API_KEY：API Key鉴权 - NONE：无需鉴权 **默认取值：** NONE。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OpsThirdPartyAgentAuthConfig withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * **参数解释：** API Key值，当type为API_KEY时必填。 **约束限制：** 字符串类型，最大长度500。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public OpsThirdPartyAgentAuthConfig withApiKeyPosition(ApiKeyPositionEnum apiKeyPosition) {
        this.apiKeyPosition = apiKeyPosition;
        return this;
    }

    /**
     * **参数解释：** API Key传递位置，当type为API_KEY时必填。 **约束限制：** 必须为枚举值之一。 **取值范围：** - HEADER：放在HTTP请求Header中 - QUERY：放在HTTP请求Query参数中 **默认取值：** HEADER。
     * @return apiKeyPosition
     */
    public ApiKeyPositionEnum getApiKeyPosition() {
        return apiKeyPosition;
    }

    public void setApiKeyPosition(ApiKeyPositionEnum apiKeyPosition) {
        this.apiKeyPosition = apiKeyPosition;
    }

    public OpsThirdPartyAgentAuthConfig withApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }

    /**
     * **参数解释：** API Key参数名，当type为API_KEY时必填。 **约束限制：** 不涉及。 **取值范围：** 由英文字母、数字、点(.)、连字符(-)及下划线(_)组成的字符串，长度为1~100个字符。 **默认取值：** 不涉及。
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return apiKeyName;
    }

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsThirdPartyAgentAuthConfig that = (OpsThirdPartyAgentAuthConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.apiKey, that.apiKey)
            && Objects.equals(this.apiKeyPosition, that.apiKeyPosition)
            && Objects.equals(this.apiKeyName, that.apiKeyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, apiKey, apiKeyPosition, apiKeyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsThirdPartyAgentAuthConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    apiKeyPosition: ").append(toIndentedString(apiKeyPosition)).append("\n");
        sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
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
