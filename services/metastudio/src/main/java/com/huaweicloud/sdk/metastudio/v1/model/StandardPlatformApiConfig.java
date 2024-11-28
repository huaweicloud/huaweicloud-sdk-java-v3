package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 自定义直播平台回调配置
 */
public class StandardPlatformApiConfig {

    /**
     * API类型
     */
    public static final class ApiTypeEnum {

        /**
         * Enum PRODUCT_QUERY for value: "PRODUCT_QUERY"
         */
        public static final ApiTypeEnum PRODUCT_QUERY = new ApiTypeEnum("PRODUCT_QUERY");

        /**
         * Enum LIVE_EVENT_CALLBACK for value: "LIVE_EVENT_CALLBACK"
         */
        public static final ApiTypeEnum LIVE_EVENT_CALLBACK = new ApiTypeEnum("LIVE_EVENT_CALLBACK");

        private static final Map<String, ApiTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiTypeEnum> createStaticFields() {
            Map<String, ApiTypeEnum> map = new HashMap<>();
            map.put("PRODUCT_QUERY", PRODUCT_QUERY);
            map.put("LIVE_EVENT_CALLBACK", LIVE_EVENT_CALLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiTypeEnum(String value) {
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
        public static ApiTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiTypeEnum(value));
        }

        public static ApiTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiTypeEnum) {
                return this.value.equals(((ApiTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiTypeEnum apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public StandardPlatformApiConfig withApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * API类型
     * @return apiType
     */
    public ApiTypeEnum getApiType() {
        return apiType;
    }

    public void setApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
    }

    public StandardPlatformApiConfig withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL。仅支持HTTPS形式URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StandardPlatformApiConfig that = (StandardPlatformApiConfig) obj;
        return Objects.equals(this.apiType, that.apiType) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiType, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardPlatformApiConfig {\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
