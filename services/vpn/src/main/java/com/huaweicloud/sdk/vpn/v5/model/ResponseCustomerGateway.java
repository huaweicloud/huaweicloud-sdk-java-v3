package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponseCustomerGateway
 */
public class ResponseCustomerGateway {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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

    private CaCertificate caCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ResponseCustomerGateway withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网关的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseCustomerGateway withName(String name) {
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

    public ResponseCustomerGateway withRouteMode(RouteModeEnum routeMode) {
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

    public ResponseCustomerGateway withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * 网关的bgp asn号
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public ResponseCustomerGateway withIp(String ip) {
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

    public ResponseCustomerGateway withCaCertificate(CaCertificate caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    public ResponseCustomerGateway withCaCertificate(Consumer<CaCertificate> caCertificateSetter) {
        if (this.caCertificate == null) {
            this.caCertificate = new CaCertificate();
            caCertificateSetter.accept(this.caCertificate);
        }

        return this;
    }

    /**
     * Get caCertificate
     * @return caCertificate
     */
    public CaCertificate getCaCertificate() {
        return caCertificate;
    }

    public void setCaCertificate(CaCertificate caCertificate) {
        this.caCertificate = caCertificate;
    }

    public ResponseCustomerGateway withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ResponseCustomerGateway withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseCustomerGateway that = (ResponseCustomerGateway) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.routeMode, that.routeMode) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.caCertificate, that.caCertificate)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, routeMode, bgpAsn, ip, caCertificate, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseCustomerGateway {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
