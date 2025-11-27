package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新DNAT规则的请求体。
 */
public class UpdatePrivateDnatOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_id")

    private String transitIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_address")

    private String transitIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interface_id")

    private String networkInterfaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    /**
     * 协议类型。 目前支持TCP/tcp、UDP/udp、ANY/any。 对应协议号6、17、0。
     */
    public static final class ProtocolEnum {

        /**
         * Enum TCP for value: "tcp"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("tcp");

        /**
         * Enum UDP for value: "udp"
         */
        public static final ProtocolEnum UDP = new ProtocolEnum("udp");

        /**
         * Enum ANY for value: "any"
         */
        public static final ProtocolEnum ANY = new ProtocolEnum("any");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("tcp", TCP);
            map.put("udp", UDP);
            map.put("any", ANY);
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
    @JsonProperty(value = "internal_service_port")

    private String internalServicePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_service_port")

    private String transitServicePort;

    public UpdatePrivateDnatOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * DNAT规则的描述。长度范围小于等于255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePrivateDnatOption withTransitIpId(String transitIpId) {
        this.transitIpId = transitIpId;
        return this;
    }

    /**
     * 中转IP的ID。
     * @return transitIpId
     */
    public String getTransitIpId() {
        return transitIpId;
    }

    public void setTransitIpId(String transitIpId) {
        this.transitIpId = transitIpId;
    }

    public UpdatePrivateDnatOption withTransitIpAddress(String transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
        return this;
    }

    /**
     * 中转IP的地址。
     * @return transitIpAddress
     */
    public String getTransitIpAddress() {
        return transitIpAddress;
    }

    public void setTransitIpAddress(String transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
    }

    public UpdatePrivateDnatOption withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * 网络接口ID，支持计算、ELB、VIP等实例的网络接口。
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public UpdatePrivateDnatOption withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * 后端实例的私网IP地址。
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public UpdatePrivateDnatOption withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型。 目前支持TCP/tcp、UDP/udp、ANY/any。 对应协议号6、17、0。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public UpdatePrivateDnatOption withInternalServicePort(String internalServicePort) {
        this.internalServicePort = internalServicePort;
        return this;
    }

    /**
     * 后端实例的端口号。
     * @return internalServicePort
     */
    public String getInternalServicePort() {
        return internalServicePort;
    }

    public void setInternalServicePort(String internalServicePort) {
        this.internalServicePort = internalServicePort;
    }

    public UpdatePrivateDnatOption withTransitServicePort(String transitServicePort) {
        this.transitServicePort = transitServicePort;
        return this;
    }

    /**
     * 中转IP的端口号。
     * @return transitServicePort
     */
    public String getTransitServicePort() {
        return transitServicePort;
    }

    public void setTransitServicePort(String transitServicePort) {
        this.transitServicePort = transitServicePort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePrivateDnatOption that = (UpdatePrivateDnatOption) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.transitIpId, that.transitIpId)
            && Objects.equals(this.transitIpAddress, that.transitIpAddress)
            && Objects.equals(this.networkInterfaceId, that.networkInterfaceId)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.internalServicePort, that.internalServicePort)
            && Objects.equals(this.transitServicePort, that.transitServicePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            transitIpId,
            transitIpAddress,
            networkInterfaceId,
            privateIpAddress,
            protocol,
            internalServicePort,
            transitServicePort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateDnatOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    transitIpId: ").append(toIndentedString(transitIpId)).append("\n");
        sb.append("    transitIpAddress: ").append(toIndentedString(transitIpAddress)).append("\n");
        sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    internalServicePort: ").append(toIndentedString(internalServicePort)).append("\n");
        sb.append("    transitServicePort: ").append(toIndentedString(transitServicePort)).append("\n");
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
