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
 * 健康检查配置中HTTP请求检查信息。
 */
public class HealthCheckConfigurationHttpGet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    /**
     * 协议。
     */
    public static final class SchemeEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final SchemeEnum HTTP = new SchemeEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final SchemeEnum HTTPS = new SchemeEnum("HTTPS");

        private static final Map<String, SchemeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchemeEnum> createStaticFields() {
            Map<String, SchemeEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchemeEnum(String value) {
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
        public static SchemeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SchemeEnum(value));
        }

        public static SchemeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchemeEnum) {
                return this.value.equals(((SchemeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheme")

    private SchemeEnum scheme;

    public HealthCheckConfigurationHttpGet withPath(String path) {
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

    public HealthCheckConfigurationHttpGet withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HealthCheckConfigurationHttpGet withScheme(SchemeEnum scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * 协议。
     * @return scheme
     */
    public SchemeEnum getScheme() {
        return scheme;
    }

    public void setScheme(SchemeEnum scheme) {
        this.scheme = scheme;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthCheckConfigurationHttpGet that = (HealthCheckConfigurationHttpGet) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.port, that.port)
            && Objects.equals(this.scheme, that.scheme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, port, scheme);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCheckConfigurationHttpGet {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
