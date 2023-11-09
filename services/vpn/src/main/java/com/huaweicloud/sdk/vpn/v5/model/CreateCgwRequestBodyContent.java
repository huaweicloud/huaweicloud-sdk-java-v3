package com.huaweicloud.sdk.vpn.v5.model;

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
 * CreateCgwRequestBodyContent
 */
public class CreateCgwRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 网关路由模式
     */
    public static final class RouteModeEnum {

        /**
         * Enum STATIC for value: "static"
         */
        public static final RouteModeEnum STATIC = new RouteModeEnum("static");

        /**
         * Enum BGP for value: "bgp"
         */
        public static final RouteModeEnum BGP = new RouteModeEnum("bgp");

        private static final Map<String, RouteModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RouteModeEnum> createStaticFields() {
            Map<String, RouteModeEnum> map = new HashMap<>();
            map.put("static", STATIC);
            map.put("bgp", BGP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RouteModeEnum(String value) {
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
        public static RouteModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RouteModeEnum(value));
        }

        public static RouteModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RouteModeEnum) {
                return this.value.equals(((RouteModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private RouteModeEnum routeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_certificate")

    private CaCertificateRequest caCertificate;

    public CreateCgwRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网关名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCgwRequestBodyContent withRouteMode(RouteModeEnum routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 网关路由模式
     * @return routeMode
     */
    public RouteModeEnum getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(RouteModeEnum routeMode) {
        this.routeMode = routeMode;
    }

    public CreateCgwRequestBodyContent withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * 网关的bgp asn号，仅当route_mode为bgp时需要，默认值为65000
     * minimum: 1
     * maximum: 4294967295
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateCgwRequestBodyContent withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 网关ip地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public CreateCgwRequestBodyContent withCaCertificate(CaCertificateRequest caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    public CreateCgwRequestBodyContent withCaCertificate(Consumer<CaCertificateRequest> caCertificateSetter) {
        if (this.caCertificate == null) {
            this.caCertificate = new CaCertificateRequest();
            caCertificateSetter.accept(this.caCertificate);
        }

        return this;
    }

    /**
     * Get caCertificate
     * @return caCertificate
     */
    public CaCertificateRequest getCaCertificate() {
        return caCertificate;
    }

    public void setCaCertificate(CaCertificateRequest caCertificate) {
        this.caCertificate = caCertificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCgwRequestBodyContent that = (CreateCgwRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.routeMode, that.routeMode)
            && Objects.equals(this.bgpAsn, that.bgpAsn) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.caCertificate, that.caCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, routeMode, bgpAsn, ip, caCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCgwRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
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
