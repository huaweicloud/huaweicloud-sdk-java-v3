package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子网信息
 */
public class Subnet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_v6")

    private String cidrV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip")

    private String gatewayIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip_v6")

    private String gatewayIpV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public Subnet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 子网ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Subnet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子网名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subnet withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否是IPV6子网
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public Subnet withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 子网的CIDR信息
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public Subnet withCidrV6(String cidrV6) {
        this.cidrV6 = cidrV6;
        return this;
    }

    /**
     * IPV6子网的CIDR信息
     * @return cidrV6
     */
    public String getCidrV6() {
        return cidrV6;
    }

    public void setCidrV6(String cidrV6) {
        this.cidrV6 = cidrV6;
    }

    public Subnet withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * 子网的网关
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public Subnet withGatewayIpV6(String gatewayIpV6) {
        this.gatewayIpV6 = gatewayIpV6;
        return this;
    }

    /**
     * IPV6子网的网关
     * @return gatewayIpV6
     */
    public String getGatewayIpV6() {
        return gatewayIpV6;
    }

    public void setGatewayIpV6(String gatewayIpV6) {
        this.gatewayIpV6 = gatewayIpV6;
    }

    public Subnet withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 子网的可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Subnet that = (Subnet) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.cidrV6, that.cidrV6) && Objects.equals(this.gatewayIp, that.gatewayIp)
            && Objects.equals(this.gatewayIpV6, that.gatewayIpV6)
            && Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ipv6Enable, cidr, cidrV6, gatewayIp, gatewayIpV6, availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subnet {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    cidrV6: ").append(toIndentedString(cidrV6)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    gatewayIpV6: ").append(toIndentedString(gatewayIpV6)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
