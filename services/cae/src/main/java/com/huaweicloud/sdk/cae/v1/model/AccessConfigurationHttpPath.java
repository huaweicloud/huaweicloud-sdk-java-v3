package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 匹配路径和域名信息。
 */
public class AccessConfigurationHttpPath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    /**
     * URL路径匹配模式，支持前缀匹配、正则匹配、精准匹配。
     */
    public static final class UrlMatchModeEnum {

        /**
         * Enum STARTS_WITH for value: "STARTS_WITH"
         */
        public static final UrlMatchModeEnum STARTS_WITH = new UrlMatchModeEnum("STARTS_WITH");

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final UrlMatchModeEnum REGEX = new UrlMatchModeEnum("REGEX");

        /**
         * Enum EQUAL_TO for value: "EQUAL_TO"
         */
        public static final UrlMatchModeEnum EQUAL_TO = new UrlMatchModeEnum("EQUAL_TO");

        private static final Map<String, UrlMatchModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UrlMatchModeEnum> createStaticFields() {
            Map<String, UrlMatchModeEnum> map = new HashMap<>();
            map.put("STARTS_WITH", STARTS_WITH);
            map.put("REGEX", REGEX);
            map.put("EQUAL_TO", EQUAL_TO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UrlMatchModeEnum(String value) {
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
        public static UrlMatchModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UrlMatchModeEnum(value));
        }

        public static UrlMatchModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UrlMatchModeEnum) {
                return this.value.equals(((UrlMatchModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_match_mode")

    private UrlMatchModeEnum urlMatchMode;

    public AccessConfigurationHttpPath withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 域名/不填，不填时表示使用IP。
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public AccessConfigurationHttpPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * URL路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public AccessConfigurationHttpPath withUrlMatchMode(UrlMatchModeEnum urlMatchMode) {
        this.urlMatchMode = urlMatchMode;
        return this;
    }

    /**
     * URL路径匹配模式，支持前缀匹配、正则匹配、精准匹配。
     * @return urlMatchMode
     */
    public UrlMatchModeEnum getUrlMatchMode() {
        return urlMatchMode;
    }

    public void setUrlMatchMode(UrlMatchModeEnum urlMatchMode) {
        this.urlMatchMode = urlMatchMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfigurationHttpPath that = (AccessConfigurationHttpPath) obj;
        return Objects.equals(this.hostname, that.hostname) && Objects.equals(this.path, that.path)
            && Objects.equals(this.urlMatchMode, that.urlMatchMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, path, urlMatchMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigurationHttpPath {\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    urlMatchMode: ").append(toIndentedString(urlMatchMode)).append("\n");
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
