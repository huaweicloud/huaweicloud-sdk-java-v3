package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * address数据结构说明
 */
public class AddressInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    /**
     * IP地址类型。fixed：代表私有IP地址。floating：代表浮动IP地址。
     */
    public static final class OsEXTIPSTypeEnum {

        /**
         * Enum FIXED for value: "fixed"
         */
        public static final OsEXTIPSTypeEnum FIXED = new OsEXTIPSTypeEnum("fixed");

        /**
         * Enum FLOATING for value: "floating"
         */
        public static final OsEXTIPSTypeEnum FLOATING = new OsEXTIPSTypeEnum("floating");

        private static final Map<String, OsEXTIPSTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEXTIPSTypeEnum> createStaticFields() {
            Map<String, OsEXTIPSTypeEnum> map = new HashMap<>();
            map.put("fixed", FIXED);
            map.put("floating", FLOATING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsEXTIPSTypeEnum(String value) {
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
        public static OsEXTIPSTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsEXTIPSTypeEnum(value));
        }

        public static OsEXTIPSTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEXTIPSTypeEnum) {
                return this.value.equals(((OsEXTIPSTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS:type")

    private OsEXTIPSTypeEnum osEXTIPSType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS-MAC:mac_addr")

    private String osEXTIPSMACMacAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS:port_id")

    private String osEXTIPSPortId;

    public AddressInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * IP地址版本。4：代表IPv4。6：代表IPv6。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AddressInfo withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * IP地址
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public AddressInfo withOsEXTIPSType(OsEXTIPSTypeEnum osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
        return this;
    }

    /**
     * IP地址类型。fixed：代表私有IP地址。floating：代表浮动IP地址。
     * @return osEXTIPSType
     */
    public OsEXTIPSTypeEnum getOsEXTIPSType() {
        return osEXTIPSType;
    }

    public void setOsEXTIPSType(OsEXTIPSTypeEnum osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
    }

    public AddressInfo withOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
        this.osEXTIPSMACMacAddr = osEXTIPSMACMacAddr;
        return this;
    }

    /**
     * MAC地址。
     * @return osEXTIPSMACMacAddr
     */
    public String getOsEXTIPSMACMacAddr() {
        return osEXTIPSMACMacAddr;
    }

    public void setOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
        this.osEXTIPSMACMacAddr = osEXTIPSMACMacAddr;
    }

    public AddressInfo withOsEXTIPSPortId(String osEXTIPSPortId) {
        this.osEXTIPSPortId = osEXTIPSPortId;
        return this;
    }

    /**
     * IP地址对应的端口ID
     * @return osEXTIPSPortId
     */
    public String getOsEXTIPSPortId() {
        return osEXTIPSPortId;
    }

    public void setOsEXTIPSPortId(String osEXTIPSPortId) {
        this.osEXTIPSPortId = osEXTIPSPortId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddressInfo that = (AddressInfo) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.osEXTIPSType, that.osEXTIPSType)
            && Objects.equals(this.osEXTIPSMACMacAddr, that.osEXTIPSMACMacAddr)
            && Objects.equals(this.osEXTIPSPortId, that.osEXTIPSPortId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, addr, osEXTIPSType, osEXTIPSMACMacAddr, osEXTIPSPortId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    osEXTIPSType: ").append(toIndentedString(osEXTIPSType)).append("\n");
        sb.append("    osEXTIPSMACMacAddr: ").append(toIndentedString(osEXTIPSMACMacAddr)).append("\n");
        sb.append("    osEXTIPSPortId: ").append(toIndentedString(osEXTIPSPortId)).append("\n");
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
