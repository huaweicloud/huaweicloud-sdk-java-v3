package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 路由明细
 */
public class CommonRoutetable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop")

    private String nexthop;

    /**
     * 路由类型: - customized: 默认路由 - specific: 自定义路由 - bgp: 动态路由
     */
    public static final class ObtainModeEnum {

        /**
         * Enum CUSTOMIZED for value: "customized"
         */
        public static final ObtainModeEnum CUSTOMIZED = new ObtainModeEnum("customized");

        /**
         * Enum SPECIFIC for value: "specific"
         */
        public static final ObtainModeEnum SPECIFIC = new ObtainModeEnum("specific");

        /**
         * Enum BGP for value: "bgp"
         */
        public static final ObtainModeEnum BGP = new ObtainModeEnum("bgp");

        private static final Map<String, ObtainModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObtainModeEnum> createStaticFields() {
            Map<String, ObtainModeEnum> map = new HashMap<>();
            map.put("customized", CUSTOMIZED);
            map.put("specific", SPECIFIC);
            map.put("bgp", BGP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObtainModeEnum(String value) {
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
        public static ObtainModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObtainModeEnum(value));
        }

        public static ObtainModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObtainModeEnum) {
                return this.value.equals(((ObtainModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obtain_mode")

    private ObtainModeEnum obtainMode;

    /**
     * 路由状态: - ACTIVE: 下发正常 - ERROR: 下发失败 - PENDING_CREATE: 待下发
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("ERROR", ERROR);
            map.put("PENDING_CREATE", PENDING_CREATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_family")

    private AddressFamily addressFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 下一跳类型: - vif_peer: 虚拟接口对等体 - gdgw: 全域接入网关
     */
    public static final class TypeEnum {

        /**
         * Enum VIF_PEER for value: "vif_peer"
         */
        public static final TypeEnum VIF_PEER = new TypeEnum("vif_peer");

        /**
         * Enum GDGW for value: "gdgw"
         */
        public static final TypeEnum GDGW = new TypeEnum("gdgw");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("vif_peer", VIF_PEER);
            map.put("gdgw", GDGW);
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

    public CommonRoutetable withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 路由id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CommonRoutetable withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CommonRoutetable withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 网关id
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public CommonRoutetable withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 路由子网
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public CommonRoutetable withNexthop(String nexthop) {
        this.nexthop = nexthop;
        return this;
    }

    /**
     * 下一跳id
     * @return nexthop
     */
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }

    public CommonRoutetable withObtainMode(ObtainModeEnum obtainMode) {
        this.obtainMode = obtainMode;
        return this;
    }

    /**
     * 路由类型: - customized: 默认路由 - specific: 自定义路由 - bgp: 动态路由
     * @return obtainMode
     */
    public ObtainModeEnum getObtainMode() {
        return obtainMode;
    }

    public void setObtainMode(ObtainModeEnum obtainMode) {
        this.obtainMode = obtainMode;
    }

    public CommonRoutetable withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 路由状态: - ACTIVE: 下发正常 - ERROR: 下发失败 - PENDING_CREATE: 待下发
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CommonRoutetable withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * Get addressFamily
     * @return addressFamily
     */
    public AddressFamily getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily;
    }

    public CommonRoutetable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 路由描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommonRoutetable withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 下一跳类型: - vif_peer: 虚拟接口对等体 - gdgw: 全域接入网关
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonRoutetable that = (CommonRoutetable) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.nexthop, that.nexthop) && Objects.equals(this.obtainMode, that.obtainMode)
            && Objects.equals(this.status, that.status) && Objects.equals(this.addressFamily, that.addressFamily)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, tenantId, gatewayId, destination, nexthop, obtainMode, status, addressFamily, description, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonRoutetable {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
        sb.append("    obtainMode: ").append(toIndentedString(obtainMode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
