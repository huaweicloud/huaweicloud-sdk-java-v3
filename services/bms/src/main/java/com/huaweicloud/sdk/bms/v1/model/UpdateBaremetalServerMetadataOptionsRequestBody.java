package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 裸金属服务器元数据配置请求体。
 */
public class UpdateBaremetalServerMetadataOptionsRequestBody {

    /**
     * 是否禁用IMDS服务。
     */
    public static final class HttpEndpointEnum {

        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final HttpEndpointEnum ENABLED = new HttpEndpointEnum("enabled");

        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final HttpEndpointEnum DISABLED = new HttpEndpointEnum("disabled");

        private static final Map<String, HttpEndpointEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HttpEndpointEnum> createStaticFields() {
            Map<String, HttpEndpointEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HttpEndpointEnum(String value) {
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
        public static HttpEndpointEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HttpEndpointEnum(value));
        }

        public static HttpEndpointEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HttpEndpointEnum) {
                return this.value.equals(((HttpEndpointEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_endpoint")

    private HttpEndpointEnum httpEndpoint;

    /**
     * 是否要求携带token。
     */
    public static final class HttpTokensEnum {

        /**
         * Enum OPTIONAL for value: "optional"
         */
        public static final HttpTokensEnum OPTIONAL = new HttpTokensEnum("optional");

        /**
         * Enum REQUIRED for value: "required"
         */
        public static final HttpTokensEnum REQUIRED = new HttpTokensEnum("required");

        private static final Map<String, HttpTokensEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HttpTokensEnum> createStaticFields() {
            Map<String, HttpTokensEnum> map = new HashMap<>();
            map.put("optional", OPTIONAL);
            map.put("required", REQUIRED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HttpTokensEnum(String value) {
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
        public static HttpTokensEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HttpTokensEnum(value));
        }

        public static HttpTokensEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HttpTokensEnum) {
                return this.value.equals(((HttpTokensEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_tokens")

    private HttpTokensEnum httpTokens;

    public UpdateBaremetalServerMetadataOptionsRequestBody withHttpEndpoint(HttpEndpointEnum httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }

    /**
     * 是否禁用IMDS服务。
     * @return httpEndpoint
     */
    public HttpEndpointEnum getHttpEndpoint() {
        return httpEndpoint;
    }

    public void setHttpEndpoint(HttpEndpointEnum httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    public UpdateBaremetalServerMetadataOptionsRequestBody withHttpTokens(HttpTokensEnum httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }

    /**
     * 是否要求携带token。
     * @return httpTokens
     */
    public HttpTokensEnum getHttpTokens() {
        return httpTokens;
    }

    public void setHttpTokens(HttpTokensEnum httpTokens) {
        this.httpTokens = httpTokens;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBaremetalServerMetadataOptionsRequestBody that = (UpdateBaremetalServerMetadataOptionsRequestBody) obj;
        return Objects.equals(this.httpEndpoint, that.httpEndpoint) && Objects.equals(this.httpTokens, that.httpTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpEndpoint, httpTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBaremetalServerMetadataOptionsRequestBody {\n");
        sb.append("    httpEndpoint: ").append(toIndentedString(httpEndpoint)).append("\n");
        sb.append("    httpTokens: ").append(toIndentedString(httpTokens)).append("\n");
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
