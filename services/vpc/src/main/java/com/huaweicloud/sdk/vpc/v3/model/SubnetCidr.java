package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubnetCidr
 */
public class SubnetCidr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private String ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip")

    private String gatewayIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dhcp")

    private Boolean enableDhcp;

    public SubnetCidr withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： OpenStack Neutron子网的资源ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubnetCidr withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释**： OpenStack Neutron子网的IP版本。 **取值范围**： - 4：IPv4子网。 - 6：IPv6子网。
     * @return ipVersion
     */
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public SubnetCidr withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * **参数解释**： OpenStack Neutron子网的IP网段。 **取值范围**： CIDR格式，如IPv4网段：192.168.23.0/24，IPv6网段：2420:2023:410:d5d::/64。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public SubnetCidr withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * **参数解释**： OpenStack Neutron子网的网关IP地址。 **取值范围**： 不涉及。
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public SubnetCidr withEnableDhcp(Boolean enableDhcp) {
        this.enableDhcp = enableDhcp;
        return this;
    }

    /**
     * **参数解释**： OpenStack Neutron子网是否开启DHCP功能。 **取值范围**： - true：开启DHCP功能。 - false：未开启DHCP功能。
     * @return enableDhcp
     */
    public Boolean getEnableDhcp() {
        return enableDhcp;
    }

    public void setEnableDhcp(Boolean enableDhcp) {
        this.enableDhcp = enableDhcp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubnetCidr that = (SubnetCidr) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.gatewayIp, that.gatewayIp)
            && Objects.equals(this.enableDhcp, that.enableDhcp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ipVersion, cidr, gatewayIp, enableDhcp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubnetCidr {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    enableDhcp: ").append(toIndentedString(enableDhcp)).append("\n");
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
