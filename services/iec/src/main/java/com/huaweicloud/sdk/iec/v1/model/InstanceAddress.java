package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 边缘实例地址
 */
public class InstanceAddress  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-IPS-MAC:mac_addr")
    
    private String osEXTIPSMACMacAddr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-IPS:port_id")
    
    private String osEXTIPSPortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-IPS:type")
    
    private String osEXTIPSType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addr")
    
    private String addr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public InstanceAddress withOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
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

    

    public InstanceAddress withOsEXTIPSPortId(String osEXTIPSPortId) {
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

    

    public InstanceAddress withOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
        return this;
    }

    


    /**
     * IP地址类型。  - fixed：代表私有IP地址。 - floating：代表浮动IP地址。
     * @return osEXTIPSType
     */
    public String getOsEXTIPSType() {
        return osEXTIPSType;
    }

    public void setOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
    }

    

    public InstanceAddress withAddr(String addr) {
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

    

    public InstanceAddress withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * IP地址版本。  - “4”：代表IPv4。 [- “6”：代表IPv6。](tag:hide)
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceAddress instanceAddress = (InstanceAddress) o;
        return Objects.equals(this.osEXTIPSMACMacAddr, instanceAddress.osEXTIPSMACMacAddr) &&
            Objects.equals(this.osEXTIPSPortId, instanceAddress.osEXTIPSPortId) &&
            Objects.equals(this.osEXTIPSType, instanceAddress.osEXTIPSType) &&
            Objects.equals(this.addr, instanceAddress.addr) &&
            Objects.equals(this.version, instanceAddress.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(osEXTIPSMACMacAddr, osEXTIPSPortId, osEXTIPSType, addr, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceAddress {\n");
        sb.append("    osEXTIPSMACMacAddr: ").append(toIndentedString(osEXTIPSMACMacAddr)).append("\n");
        sb.append("    osEXTIPSPortId: ").append(toIndentedString(osEXTIPSPortId)).append("\n");
        sb.append("    osEXTIPSType: ").append(toIndentedString(osEXTIPSType)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

