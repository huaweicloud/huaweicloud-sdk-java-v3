package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 弹性云服务器的网络属性。
 */
public class ServerAddress  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private Integer version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addr")
    
    private String addr;
    /**
     * IP地址类型。  - fixed：代表私有IP地址。 - floating：代表浮动IP地址。
     */
    public static class OsEXTIPSTypeEnum {

        
        /**
         * Enum FIXED for value: "fixed"
         */
        public static final OsEXTIPSTypeEnum FIXED = new OsEXTIPSTypeEnum("fixed");

        
        /**
         * Enum FLOATING for value: "floating"
         */
        public static final OsEXTIPSTypeEnum FLOATING = new OsEXTIPSTypeEnum("floating");

        

        public static Map<String, OsEXTIPSTypeEnum> staticFields =
                new HashMap<String, OsEXTIPSTypeEnum>() {
                    { 
                        put("fixed", FIXED);
                        put("floating", FLOATING);
                    }
                };

        private String value;

        OsEXTIPSTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsEXTIPSTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsEXTIPSTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsEXTIPSTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsEXTIPSTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsEXTIPSTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsEXTIPSTypeEnum) {
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
    @JsonProperty(value="OS-EXT-IPS:type")
    
    private OsEXTIPSTypeEnum osEXTIPSType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-IPS-MAC:mac_addr")
    
    private String osEXTIPSMACMacAddr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-IPS:port_id")
    
    private String osEXTIPSPortId;

    public ServerAddress withVersion(Integer version) {
        this.version = version;
        return this;
    }

    


    /**
     * IP地址版本。  - “4”：代表IPv4。 - “6”：代表IPv6。
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ServerAddress withAddr(String addr) {
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

    public ServerAddress withOsEXTIPSType(OsEXTIPSTypeEnum osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
        return this;
    }

    


    /**
     * IP地址类型。  - fixed：代表私有IP地址。 - floating：代表浮动IP地址。
     * @return osEXTIPSType
     */
    public OsEXTIPSTypeEnum getOsEXTIPSType() {
        return osEXTIPSType;
    }

    public void setOsEXTIPSType(OsEXTIPSTypeEnum osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
    }

    public ServerAddress withOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
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

    public ServerAddress withOsEXTIPSPortId(String osEXTIPSPortId) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerAddress serverAddress = (ServerAddress) o;
        return Objects.equals(this.version, serverAddress.version) &&
            Objects.equals(this.addr, serverAddress.addr) &&
            Objects.equals(this.osEXTIPSType, serverAddress.osEXTIPSType) &&
            Objects.equals(this.osEXTIPSMACMacAddr, serverAddress.osEXTIPSMACMacAddr) &&
            Objects.equals(this.osEXTIPSPortId, serverAddress.osEXTIPSPortId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version, addr, osEXTIPSType, osEXTIPSMACMacAddr, osEXTIPSPortId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerAddress {\n");
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

