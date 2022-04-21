package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 类型
 */
public class RouteServerBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_protocol")

    private String backProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public RouteServerBody withBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
        return this;
    }

    /**
     * 后端协议
     * @return backProtocol
     */
    public String getBackProtocol() {
        return backProtocol;
    }

    public void setBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
    }

    public RouteServerBody withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 后端ip地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RouteServerBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口信息
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
        RouteServerBody routeServerBody = (RouteServerBody) o;
        return Objects.equals(this.backProtocol, routeServerBody.backProtocol)
            && Objects.equals(this.address, routeServerBody.address) && Objects.equals(this.port, routeServerBody.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backProtocol, address, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteServerBody {\n");
        sb.append("    backProtocol: ").append(toIndentedString(backProtocol)).append("\n");
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
