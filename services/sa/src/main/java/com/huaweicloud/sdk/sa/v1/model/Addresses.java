package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Addresses */
public class Addresses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private String ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_addr")

    private String macAddr;

    public Addresses withVersion(String version) {
        this.version = version;
        return this;
    }

    /** IP地址版本。“4”：代表IPv4。“6”：代表IPv6。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Addresses withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /** IP地址。
     * 
     * @return addr */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Addresses withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /** IP地址类型 fixed：代表私有IP地址。floating：代表浮动IP地址。
     * 
     * @return ipType */
    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public Addresses withMacAddr(String macAddr) {
        this.macAddr = macAddr;
        return this;
    }

    /** MAC地址。
     * 
     * @return macAddr */
    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Addresses addresses = (Addresses) o;
        return Objects.equals(this.version, addresses.version) && Objects.equals(this.addr, addresses.addr)
            && Objects.equals(this.ipType, addresses.ipType) && Objects.equals(this.macAddr, addresses.macAddr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, addr, ipType, macAddr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Addresses {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
