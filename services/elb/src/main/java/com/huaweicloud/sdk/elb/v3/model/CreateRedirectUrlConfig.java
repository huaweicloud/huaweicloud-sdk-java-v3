package com.huaweicloud.sdk.elb.v3.model;

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
 * 参数解释：转发到的url配置。  约束限制： - 当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。 - 当转发策略的action为REDIRECT_TO_URL时生效，且为必选字段，其他action不可指定，否则报错。 [- 共享型负载均衡器下的转发策略不支持该字段，传入会报错。](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt)  取值范围：格式：protocol://host:port/path?query  protocol、host、port、path不允许同时不传或同时传${xxx} （${xxx}表示原值，如${host}表示被转发的请求URL的host部分）。 protocol和port传入的值不能与l7policy关联的监听器一致且host、path同时不传或同时传${xxx}。  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt)
 */
public class CreateRedirectUrlConfig {

    /**
     * 参数解释：重定向的协议。  取值范围： - HTTP - HTTPS - ${protocol}，表示继承原值（即与被转发请求保持一致）。  默认取值：${protocol}
     */
    public static final class ProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");

        /**
         * Enum _PROTOCOL_ for value: "${protocol}"
         */
        public static final ProtocolEnum _PROTOCOL_ = new ProtocolEnum("${protocol}");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            map.put("${protocol}", _PROTOCOL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    /**
     * 参数解释：重定向后的返回码。  取值范围： - 301 - 302 - 303 - 307 - 308
     */
    public static final class StatusCodeEnum {

        /**
         * Enum _301 for value: "301"
         */
        public static final StatusCodeEnum _301 = new StatusCodeEnum("301");

        /**
         * Enum _302 for value: "302"
         */
        public static final StatusCodeEnum _302 = new StatusCodeEnum("302");

        /**
         * Enum _303 for value: "303"
         */
        public static final StatusCodeEnum _303 = new StatusCodeEnum("303");

        /**
         * Enum _307 for value: "307"
         */
        public static final StatusCodeEnum _307 = new StatusCodeEnum("307");

        /**
         * Enum _308 for value: "308"
         */
        public static final StatusCodeEnum _308 = new StatusCodeEnum("308");

        private static final Map<String, StatusCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusCodeEnum> createStaticFields() {
            Map<String, StatusCodeEnum> map = new HashMap<>();
            map.put("301", _301);
            map.put("302", _302);
            map.put("303", _303);
            map.put("307", _307);
            map.put("308", _308);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusCodeEnum(String value) {
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
        public static StatusCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusCodeEnum(value));
        }

        public static StatusCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusCodeEnum) {
                return this.value.equals(((StatusCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private StatusCodeEnum statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_headers_config")

    private CreateInsertHeadersConfig insertHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_headers_config")

    private CreateRemoveHeadersConfig removeHeadersConfig;

    public CreateRedirectUrlConfig withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 参数解释：重定向的协议。  取值范围： - HTTP - HTTPS - ${protocol}，表示继承原值（即与被转发请求保持一致）。  默认取值：${protocol}
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public CreateRedirectUrlConfig withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 参数解释：重定向的主机名。  取值范围：字符串只能包含英文字母、数字、“-”、“.”，必须以字母、数字开头。  默认取值：${host}，表示继承原值（即与被转发请求保持一致）。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public CreateRedirectUrlConfig withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 参数解释：重定向到的端口。  默认取值：${port}，表示继承原值（即与被转发请求保持一致）。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public CreateRedirectUrlConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 参数解释：重定向的路径。  取值范围：只能包含英文字母、数字、_~';@^-%#&$.\\*+?,=!:|\\/()\\[\\]{}，且必须以\"/\"开头。其中$1，$2会匹配请求url通配符星号（\\*）  默认取值：${path}，表示继承原值（即与被转发请求保持一致）。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CreateRedirectUrlConfig withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 参数解释：重定向的查询字符串。举例如下：  将query设置为：${query}&name=my_name，则在转发符合条件的URL （如https://www.example.com:8080/elb?type=loadbalancer）时，将会重定向到 https://www.example.com:8080/elb?type=loadbalancer&name=my_name。在例子中${query}表示type=loadbalancer。  取值范围：只能包含英文字母、数字和特殊字符：!$&'()\\*+,-./:;=?@^_`。字母区分大小写。其中$1，$2会匹配请求url通配符星号（\\*）  默认取值：${query}表示继承原值（即与被转发请求保持一致）
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public CreateRedirectUrlConfig withStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 参数解释：重定向后的返回码。  取值范围： - 301 - 302 - 303 - 307 - 308
     * @return statusCode
     */
    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    public CreateRedirectUrlConfig withInsertHeadersConfig(CreateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
        return this;
    }

    public CreateRedirectUrlConfig withInsertHeadersConfig(
        Consumer<CreateInsertHeadersConfig> insertHeadersConfigSetter) {
        if (this.insertHeadersConfig == null) {
            this.insertHeadersConfig = new CreateInsertHeadersConfig();
            insertHeadersConfigSetter.accept(this.insertHeadersConfig);
        }

        return this;
    }

    /**
     * Get insertHeadersConfig
     * @return insertHeadersConfig
     */
    public CreateInsertHeadersConfig getInsertHeadersConfig() {
        return insertHeadersConfig;
    }

    public void setInsertHeadersConfig(CreateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
    }

    public CreateRedirectUrlConfig withRemoveHeadersConfig(CreateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
        return this;
    }

    public CreateRedirectUrlConfig withRemoveHeadersConfig(
        Consumer<CreateRemoveHeadersConfig> removeHeadersConfigSetter) {
        if (this.removeHeadersConfig == null) {
            this.removeHeadersConfig = new CreateRemoveHeadersConfig();
            removeHeadersConfigSetter.accept(this.removeHeadersConfig);
        }

        return this;
    }

    /**
     * Get removeHeadersConfig
     * @return removeHeadersConfig
     */
    public CreateRemoveHeadersConfig getRemoveHeadersConfig() {
        return removeHeadersConfig;
    }

    public void setRemoveHeadersConfig(CreateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRedirectUrlConfig that = (CreateRedirectUrlConfig) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.host, that.host)
            && Objects.equals(this.port, that.port) && Objects.equals(this.path, that.path)
            && Objects.equals(this.query, that.query) && Objects.equals(this.statusCode, that.statusCode)
            && Objects.equals(this.insertHeadersConfig, that.insertHeadersConfig)
            && Objects.equals(this.removeHeadersConfig, that.removeHeadersConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, host, port, path, query, statusCode, insertHeadersConfig, removeHeadersConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRedirectUrlConfig {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    insertHeadersConfig: ").append(toIndentedString(insertHeadersConfig)).append("\n");
        sb.append("    removeHeadersConfig: ").append(toIndentedString(removeHeadersConfig)).append("\n");
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
