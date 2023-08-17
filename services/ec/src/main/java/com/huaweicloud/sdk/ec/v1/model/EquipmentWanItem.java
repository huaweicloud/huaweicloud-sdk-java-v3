package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EquipmentWanItem
 */
public class EquipmentWanItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    /**
     * IP类型
     */
    public static final class IpTypeEnum {

        /**
         * Enum STATIC for value: "static"
         */
        public static final IpTypeEnum STATIC = new IpTypeEnum("static");

        /**
         * Enum DHCP for value: "DHCP"
         */
        public static final IpTypeEnum DHCP = new IpTypeEnum("DHCP");

        private static final Map<String, IpTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpTypeEnum> createStaticFields() {
            Map<String, IpTypeEnum> map = new HashMap<>();
            map.put("static", STATIC);
            map.put("DHCP", DHCP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpTypeEnum(String value) {
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
        public static IpTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpTypeEnum(value));
        }

        public static IpTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpTypeEnum) {
                return this.value.equals(((IpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private IpTypeEnum ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip_address")

    private String gatewayIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uplink_bandwidth_size")

    private Integer uplinkBandwidthSize;

    /**
     * 优先级
     */
    public static final class PriorityEnum {

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final PriorityEnum ACTIVE = new PriorityEnum("Active");

        /**
         * Enum STANDBY for value: "Standby"
         */
        public static final PriorityEnum STANDBY = new PriorityEnum("Standby");

        private static final Map<String, PriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PriorityEnum> createStaticFields() {
            Map<String, PriorityEnum> map = new HashMap<>();
            map.put("Active", ACTIVE);
            map.put("Standby", STANDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PriorityEnum(String value) {
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
        public static PriorityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PriorityEnum(value));
        }

        public static PriorityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PriorityEnum) {
                return this.value.equals(((PriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private PriorityEnum priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_outbound")

    private Boolean natOutbound;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_bandwidth_size")

    private Integer tunnelBandwidthSize;

    public EquipmentWanItem withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * 接口名字
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public EquipmentWanItem withIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * IP类型
     * @return ipType
     */
    public IpTypeEnum getIpType() {
        return ipType;
    }

    public void setIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
    }

    public EquipmentWanItem withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IPv4地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public EquipmentWanItem withGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
        return this;
    }

    /**
     * 网关IP
     * @return gatewayIpAddress
     */
    public String getGatewayIpAddress() {
        return gatewayIpAddress;
    }

    public void setGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
    }

    public EquipmentWanItem withUplinkBandwidthSize(Integer uplinkBandwidthSize) {
        this.uplinkBandwidthSize = uplinkBandwidthSize;
        return this;
    }

    /**
     * 最大上行带宽
     * minimum: 1
     * maximum: 100000
     * @return uplinkBandwidthSize
     */
    public Integer getUplinkBandwidthSize() {
        return uplinkBandwidthSize;
    }

    public void setUplinkBandwidthSize(Integer uplinkBandwidthSize) {
        this.uplinkBandwidthSize = uplinkBandwidthSize;
    }

    public EquipmentWanItem withPriority(PriorityEnum priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级
     * @return priority
     */
    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    public EquipmentWanItem withNatOutbound(Boolean natOutbound) {
        this.natOutbound = natOutbound;
        return this;
    }

    /**
     * 是否使能本地上网
     * @return natOutbound
     */
    public Boolean getNatOutbound() {
        return natOutbound;
    }

    public void setNatOutbound(Boolean natOutbound) {
        this.natOutbound = natOutbound;
    }

    public EquipmentWanItem withTunnelBandwidthSize(Integer tunnelBandwidthSize) {
        this.tunnelBandwidthSize = tunnelBandwidthSize;
        return this;
    }

    /**
     * 最大上云带宽
     * minimum: 1
     * maximum: 100000
     * @return tunnelBandwidthSize
     */
    public Integer getTunnelBandwidthSize() {
        return tunnelBandwidthSize;
    }

    public void setTunnelBandwidthSize(Integer tunnelBandwidthSize) {
        this.tunnelBandwidthSize = tunnelBandwidthSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EquipmentWanItem that = (EquipmentWanItem) obj;
        return Objects.equals(this.interfaceName, that.interfaceName) && Objects.equals(this.ipType, that.ipType)
            && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.gatewayIpAddress, that.gatewayIpAddress)
            && Objects.equals(this.uplinkBandwidthSize, that.uplinkBandwidthSize)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.natOutbound, that.natOutbound)
            && Objects.equals(this.tunnelBandwidthSize, that.tunnelBandwidthSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interfaceName,
            ipType,
            ipAddress,
            gatewayIpAddress,
            uplinkBandwidthSize,
            priority,
            natOutbound,
            tunnelBandwidthSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EquipmentWanItem {\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    gatewayIpAddress: ").append(toIndentedString(gatewayIpAddress)).append("\n");
        sb.append("    uplinkBandwidthSize: ").append(toIndentedString(uplinkBandwidthSize)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    natOutbound: ").append(toIndentedString(natOutbound)).append("\n");
        sb.append("    tunnelBandwidthSize: ").append(toIndentedString(tunnelBandwidthSize)).append("\n");
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
