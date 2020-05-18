package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 *  
 */
public class NovaNetwork  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addr")
    
    private String addr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private Integer version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-IPS-MAC:mac_addr")
    
    private String osEXTIPSMACMacAddr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-IPS:type")
    
    private String osEXTIPSType;

    public NovaNetwork withAddr(String addr) {
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

    public NovaNetwork withVersion(Integer version) {
        this.version = version;
        return this;
    }

    


    /**
     * IP地址类型，值为4或6。  4：IP地址类型是IPv4 6：IP地址类型是IPv6
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public NovaNetwork withOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
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

    public NovaNetwork withOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
        return this;
    }

    


    /**
     * 扩展属性，分配IP地址方式。
     * @return osEXTIPSType
     */
    public String getOsEXTIPSType() {
        return osEXTIPSType;
    }

    public void setOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaNetwork novaNetwork = (NovaNetwork) o;
        return Objects.equals(this.addr, novaNetwork.addr) &&
            Objects.equals(this.version, novaNetwork.version) &&
            Objects.equals(this.osEXTIPSMACMacAddr, novaNetwork.osEXTIPSMACMacAddr) &&
            Objects.equals(this.osEXTIPSType, novaNetwork.osEXTIPSType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addr, version, osEXTIPSMACMacAddr, osEXTIPSType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaNetwork {\n");
            sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

