package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 转发到的url配置。  共享型负载均衡器下的转发策略不支持该字段，传入会报错。  当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。  [当action为REDIRECT_TO_URL时生效，且为必选字段，其他action不可指定，否则报错。](tag:hws,hws_hk,ocb,tlf,ctc,hcs,sbc,g42,tm,cmcc,hk_g42,mix,hk_sbc,hws_ocb,fcs,dt,dt_test)  格式：protocol://host:port/path?query  protocol、host、port、path不允许同时不传或同时传${xxx}（${xxx}表示原值，如${host}表示被转发的请求URL的host部分）。protocol和port传入的值不能与l7policy关联的监听器一致且host、path同时不传或同时传${xxx}。  [不支持该字段，请勿使用。](tag:hcso_dt)
 */
public class UpdateRedirectUrlConfig {

    /**
     * 重定向的协议。默认值${protocol}表示继承原值（即与被转发请求保持一致）。  取值范围： - HTTP - HTTPS - ${protocol}
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
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 重定向后的返回码。  取值范围： - 301 - 302 - 303 - 307 - 308
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
            StatusCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusCodeEnum(value);
            }
            return result;
        }

        public static StatusCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public UpdateRedirectUrlConfig withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 重定向的协议。默认值${protocol}表示继承原值（即与被转发请求保持一致）。  取值范围： - HTTP - HTTPS - ${protocol}
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public UpdateRedirectUrlConfig withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 重定向的主机名。字符串只能包含英文字母、数字、“-”、“.”，必须以字母、数字开头。默认值${host}表示继承原值（即与被转发请求保持一致）。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public UpdateRedirectUrlConfig withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 重定向到的端口。默认值${port}表示继承原值（即与被转发请求保持一致）。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public UpdateRedirectUrlConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 重定向的路径。默认值${path}表示继承原值（即与被转发请求保持一致）。  只能包含英文字母、数字、_~';@^-%#&$.*+?,=!:|\\/()\\[\\]{}，且必须以\"/\"开头
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public UpdateRedirectUrlConfig withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 重定向的查询字符串。默认${query}表示继承原值（即与被转发请求保持一致）。   只能包含英文字母、数字和特殊字符：!$&'()*+,-./:;=?@^_`。字母区分大小写。   举例如下：   若该字段被设置为：${query}&name=my_name，则在转发符合条件的URL（如https://www.xxx.com:8080/elb?type=loadbalancer，此时${query}表示type=loadbalancer）时，将会重定向到https://www.xxx.com:8080/elb?type=loadbalancer&name=my_name。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public UpdateRedirectUrlConfig withStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 重定向后的返回码。  取值范围： - 301 - 302 - 303 - 307 - 308
     * @return statusCode
     */
    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRedirectUrlConfig updateRedirectUrlConfig = (UpdateRedirectUrlConfig) o;
        return Objects.equals(this.protocol, updateRedirectUrlConfig.protocol)
            && Objects.equals(this.host, updateRedirectUrlConfig.host)
            && Objects.equals(this.port, updateRedirectUrlConfig.port)
            && Objects.equals(this.path, updateRedirectUrlConfig.path)
            && Objects.equals(this.query, updateRedirectUrlConfig.query)
            && Objects.equals(this.statusCode, updateRedirectUrlConfig.statusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, host, port, path, query, statusCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRedirectUrlConfig {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
