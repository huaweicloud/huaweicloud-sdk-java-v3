package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * AddressAndPorts
 */
public class AddressAndPorts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    @JacksonXmlProperty(localName = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    @JacksonXmlProperty(localName = "port")

    private Integer port;

    public AddressAndPorts withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * IP地址或域名。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AddressAndPorts withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressAndPorts addressAndPorts = (AddressAndPorts) o;
        return Objects.equals(this.address, addressAndPorts.address) && Objects.equals(this.port, addressAndPorts.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressAndPorts {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
