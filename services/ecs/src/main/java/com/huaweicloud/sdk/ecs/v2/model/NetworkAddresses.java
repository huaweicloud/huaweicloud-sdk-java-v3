package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NetworkAddresses
 */
public class NetworkAddresses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    /**
     * IP地址类型，值为4或6。  4：IP地址类型是IPv4 6：IP地址类型是IPv6
     */
    public static final class VersionEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final VersionEnum NUMBER_4 = new VersionEnum(4);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final VersionEnum NUMBER_6 = new VersionEnum(6);

        private static final Map<Integer, VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, VersionEnum> createStaticFields() {
            Map<Integer, VersionEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        VersionEnum(Integer value) {
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
        public static VersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionEnum(value));
        }

        public static VersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionEnum) {
                return this.value.equals(((VersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private VersionEnum version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS:port_id")

    private String osEXTIPSPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS-MAC:mac_addr")

    private String osEXTIPSMACMacAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS:type")

    private String osEXTIPSType;

    public NetworkAddresses withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * IP地址。
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public NetworkAddresses withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    /**
     * IP地址类型，值为4或6。  4：IP地址类型是IPv4 6：IP地址类型是IPv6
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public NetworkAddresses withOsEXTIPSPortId(String osEXTIPSPortId) {
        this.osEXTIPSPortId = osEXTIPSPortId;
        return this;
    }

    /**
     * IP地址对应的端口ID。
     * @return osEXTIPSPortId
     */
    public String getOsEXTIPSPortId() {
        return osEXTIPSPortId;
    }

    public void setOsEXTIPSPortId(String osEXTIPSPortId) {
        this.osEXTIPSPortId = osEXTIPSPortId;
    }

    public NetworkAddresses withOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
        this.osEXTIPSMACMacAddr = osEXTIPSMACMacAddr;
        return this;
    }

    /**
     * 扩展属性，MAC地址。
     * @return osEXTIPSMACMacAddr
     */
    public String getOsEXTIPSMACMacAddr() {
        return osEXTIPSMACMacAddr;
    }

    public void setOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
        this.osEXTIPSMACMacAddr = osEXTIPSMACMacAddr;
    }

    public NetworkAddresses withOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
        return this;
    }

    /**
     * 扩展属性，分配IP地址方式。  fixed：代表私有IP地址。 floating：代表浮动IP地址。
     * @return osEXTIPSType
     */
    public String getOsEXTIPSType() {
        return osEXTIPSType;
    }

    public void setOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkAddresses that = (NetworkAddresses) obj;
        return Objects.equals(this.addr, that.addr) && Objects.equals(this.version, that.version)
            && Objects.equals(this.osEXTIPSPortId, that.osEXTIPSPortId)
            && Objects.equals(this.osEXTIPSMACMacAddr, that.osEXTIPSMACMacAddr)
            && Objects.equals(this.osEXTIPSType, that.osEXTIPSType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr, version, osEXTIPSPortId, osEXTIPSMACMacAddr, osEXTIPSType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkAddresses {\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    osEXTIPSPortId: ").append(toIndentedString(osEXTIPSPortId)).append("\n");
        sb.append("    osEXTIPSMACMacAddr: ").append(toIndentedString(osEXTIPSMACMacAddr)).append("\n");
        sb.append("    osEXTIPSType: ").append(toIndentedString(osEXTIPSType)).append("\n");
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
