package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 防护域名源站服务器信息
 */
public class RouteServerBody {

    /**
     * **参数解释：** WAF转发客户端请求到防护域名源站服务器的协议 **约束限制：** 不涉及 **取值范围：**  - HTTP: HTTP协议  - HTTPS: HTTPS协议  **默认取值：** 不涉及
     */
    public static final class BackProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final BackProtocolEnum HTTP = new BackProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final BackProtocolEnum HTTPS = new BackProtocolEnum("HTTPS");

        private static final Map<String, BackProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackProtocolEnum> createStaticFields() {
            Map<String, BackProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackProtocolEnum(String value) {
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
        public static BackProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BackProtocolEnum(value));
        }

        public static BackProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackProtocolEnum) {
                return this.value.equals(((BackProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_protocol")

    private BackProtocolEnum backProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public RouteServerBody withBackProtocol(BackProtocolEnum backProtocol) {
        this.backProtocol = backProtocol;
        return this;
    }

    /**
     * **参数解释：** WAF转发客户端请求到防护域名源站服务器的协议 **约束限制：** 不涉及 **取值范围：**  - HTTP: HTTP协议  - HTTPS: HTTPS协议  **默认取值：** 不涉及
     * @return backProtocol
     */
    public BackProtocolEnum getBackProtocol() {
        return backProtocol;
    }

    public void setBackProtocol(BackProtocolEnum backProtocol) {
        this.backProtocol = backProtocol;
    }

    public RouteServerBody withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 客户端访问的源站服务器的IP地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RouteServerBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * WAF转发客户端请求到源站服务的业务端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteServerBody that = (RouteServerBody) obj;
        return Objects.equals(this.backProtocol, that.backProtocol) && Objects.equals(this.address, that.address)
            && Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backProtocol, address, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteServerBody {\n");
        sb.append("    backProtocol: ").append(toIndentedString(backProtocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
