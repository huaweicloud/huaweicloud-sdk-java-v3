package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器的vpc信息。
 */
public class RespAddr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS:type")

    private String osEXTIPSType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS-MAC:mac_addr")

    private String osEXTIPSMACMacAddr;

    public RespAddr withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 云服务器的vpc ip。
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public RespAddr withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 云服务器的vpc版本。
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public RespAddr withOsEXTIPSType(String osEXTIPSType) {
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

    public RespAddr withOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespAddr respAddr = (RespAddr) o;
        return Objects.equals(this.addr, respAddr.addr) && Objects.equals(this.version, respAddr.version)
            && Objects.equals(this.osEXTIPSType, respAddr.osEXTIPSType)
            && Objects.equals(this.osEXTIPSMACMacAddr, respAddr.osEXTIPSMACMacAddr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr, version, osEXTIPSType, osEXTIPSMACMacAddr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespAddr {\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    osEXTIPSType: ").append(toIndentedString(osEXTIPSType)).append("\n");
        sb.append("    osEXTIPSMACMacAddr: ").append(toIndentedString(osEXTIPSMACMacAddr)).append("\n");
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
