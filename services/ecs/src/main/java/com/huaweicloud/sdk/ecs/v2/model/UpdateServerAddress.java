package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 弹性云服务器的网络属性。
 */
public class UpdateServerAddress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    @JacksonXmlProperty(localName = "addr")

    private String addr;

    public UpdateServerAddress withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * IP地址版本。  - 4：代表IPv4。 - 6：代表IPv6。
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UpdateServerAddress withAddr(String addr) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateServerAddress updateServerAddress = (UpdateServerAddress) o;
        return Objects.equals(this.version, updateServerAddress.version)
            && Objects.equals(this.addr, updateServerAddress.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, addr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerAddress {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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
