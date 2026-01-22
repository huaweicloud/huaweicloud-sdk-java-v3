package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BlackWhiteInfo
 */
public class BlackWhiteInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private Integer direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    /**
     * **参数解释**： 协议类型 **约束限制**： 不涉及  **取值范围**： -1：ANY 1：ICMP 6：TCP 17：UDP 58：ICMPV6 132：SCTP 手动类型不为空，自动类型为空 **默认取值**： 不涉及
     */
    public static final class ProtocolEnum {

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final ProtocolEnum NUMBER_6 = new ProtocolEnum(6);

        /**
         * Enum NUMBER_17 for value: 17
         */
        public static final ProtocolEnum NUMBER_17 = new ProtocolEnum(17);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProtocolEnum NUMBER_1 = new ProtocolEnum(1);

        /**
         * Enum NUMBER_58 for value: 58
         */
        public static final ProtocolEnum NUMBER_58 = new ProtocolEnum(58);

        /**
         * Enum NUMBER_MINUS_1 for value: -1
         */
        public static final ProtocolEnum NUMBER_MINUS_1 = new ProtocolEnum(-1);

        /**
         * Enum NUMBER_132 for value: 132
         */
        public static final ProtocolEnum NUMBER_132 = new ProtocolEnum(132);

        private static final Map<Integer, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProtocolEnum> createStaticFields() {
            Map<Integer, ProtocolEnum> map = new HashMap<>();
            map.put(6, NUMBER_6);
            map.put(17, NUMBER_17);
            map.put(1, NUMBER_1);
            map.put(58, NUMBER_58);
            map.put(-1, NUMBER_MINUS_1);
            map.put(132, NUMBER_132);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProtocolEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(Integer value) {
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

    public BlackWhiteInfo withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释**： IP地址 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BlackWhiteInfo withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * **参数解释**： IP地址类型 **约束限制**： 不涉及  **取值范围**：  0：IPV4  1：IPV6 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 1
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public BlackWhiteInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BlackWhiteInfo withDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释**： 地址方向 **约束限制**： 不涉及  **取值范围**： 0：源地址 1：目的地址 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 1
     * @return direction
     */
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public BlackWhiteInfo withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 端口 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public BlackWhiteInfo withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议类型 **约束限制**： 不涉及  **取值范围**： -1：ANY 1：ICMP 6：TCP 17：UDP 58：ICMPV6 132：SCTP 手动类型不为空，自动类型为空 **默认取值**： 不涉及
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlackWhiteInfo that = (BlackWhiteInfo) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.addressType, that.addressType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.port, that.port) && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, addressType, description, direction, port, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlackWhiteInfo {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
