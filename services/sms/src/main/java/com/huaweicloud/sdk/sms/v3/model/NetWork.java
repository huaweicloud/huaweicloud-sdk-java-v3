package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网卡实体类
 */
public class NetWork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "netmask")

    private String netmask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway")

    private String gateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtu")

    private Integer mtu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac")

    private String mac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public NetWork withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网卡的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetWork withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 该网卡绑定的IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public NetWork withNetmask(String netmask) {
        this.netmask = netmask;
        return this;
    }

    /**
     * 掩码
     * @return netmask
     */
    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public NetWork withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * 网关
     * @return gateway
     */
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public NetWork withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /**
     * Linux必选，网卡的MTU
     * minimum: 0
     * maximum: 2147483647
     * @return mtu
     */
    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public NetWork withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * Mac地址
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public NetWork withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetWork netWork = (NetWork) o;
        return Objects.equals(this.name, netWork.name) && Objects.equals(this.ip, netWork.ip)
            && Objects.equals(this.netmask, netWork.netmask) && Objects.equals(this.gateway, netWork.gateway)
            && Objects.equals(this.mtu, netWork.mtu) && Objects.equals(this.mac, netWork.mac)
            && Objects.equals(this.id, netWork.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ip, netmask, gateway, mtu, mac, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetWork {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
