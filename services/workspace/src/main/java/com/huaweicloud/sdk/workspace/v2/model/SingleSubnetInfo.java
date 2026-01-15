package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SingleSubnetInfo
 */
public class SingleSubnetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused")

    private Boolean unused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked")

    private Boolean checked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip")

    private String gatewayIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dhcp_enable")

    private Boolean dhcpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_dns")

    private String primaryDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_dns")

    private String secondaryDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "neutron_subnet_id")

    private String neutronSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "neutron_ipv6_subnet_id")

    private String neutronIpv6SubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public SingleSubnetInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 子网ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SingleSubnetInfo withUnused(Boolean unused) {
        this.unused = unused;
        return this;
    }

    /**
     * 是否未被workspace真正使用。如果未使用，则表示可以从workspace中删除。
     * @return unused
     */
    public Boolean getUnused() {
        return unused;
    }

    public void setUnused(Boolean unused) {
        this.unused = unused;
    }

    public SingleSubnetInfo withChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    /**
     * 是否已被workspace选择使用。
     * @return checked
     */
    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public SingleSubnetInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public SingleSubnetInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子网名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingleSubnetInfo withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 子网网段。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public SingleSubnetInfo withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * 子网网关。
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public SingleSubnetInfo withDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
        return this;
    }

    /**
     * 是否支持DHCP。
     * @return dhcpEnable
     */
    public Boolean getDhcpEnable() {
        return dhcpEnable;
    }

    public void setDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
    }

    public SingleSubnetInfo withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否支持IPV6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public SingleSubnetInfo withPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }

    /**
     * 主DNS。
     * @return primaryDns
     */
    public String getPrimaryDns() {
        return primaryDns;
    }

    public void setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
    }

    public SingleSubnetInfo withSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
        return this;
    }

    /**
     * 备DNS。
     * @return secondaryDns
     */
    public String getSecondaryDns() {
        return secondaryDns;
    }

    public void setSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
    }

    public SingleSubnetInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 子网状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SingleSubnetInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public SingleSubnetInfo withNeutronSubnetId(String neutronSubnetId) {
        this.neutronSubnetId = neutronSubnetId;
        return this;
    }

    /**
     * 网络id。
     * @return neutronSubnetId
     */
    public String getNeutronSubnetId() {
        return neutronSubnetId;
    }

    public void setNeutronSubnetId(String neutronSubnetId) {
        this.neutronSubnetId = neutronSubnetId;
    }

    public SingleSubnetInfo withNeutronIpv6SubnetId(String neutronIpv6SubnetId) {
        this.neutronIpv6SubnetId = neutronIpv6SubnetId;
        return this;
    }

    /**
     * ipv6网络id。
     * @return neutronIpv6SubnetId
     */
    public String getNeutronIpv6SubnetId() {
        return neutronIpv6SubnetId;
    }

    public void setNeutronIpv6SubnetId(String neutronIpv6SubnetId) {
        this.neutronIpv6SubnetId = neutronIpv6SubnetId;
    }

    public SingleSubnetInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SingleSubnetInfo that = (SingleSubnetInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.unused, that.unused)
            && Objects.equals(this.checked, that.checked) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.gatewayIp, that.gatewayIp) && Objects.equals(this.dhcpEnable, that.dhcpEnable)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable) && Objects.equals(this.primaryDns, that.primaryDns)
            && Objects.equals(this.secondaryDns, that.secondaryDns) && Objects.equals(this.status, that.status)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.neutronSubnetId, that.neutronSubnetId)
            && Objects.equals(this.neutronIpv6SubnetId, that.neutronIpv6SubnetId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            unused,
            checked,
            vpcId,
            name,
            cidr,
            gatewayIp,
            dhcpEnable,
            ipv6Enable,
            primaryDns,
            secondaryDns,
            status,
            availabilityZone,
            neutronSubnetId,
            neutronIpv6SubnetId,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SingleSubnetInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    unused: ").append(toIndentedString(unused)).append("\n");
        sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    dhcpEnable: ").append(toIndentedString(dhcpEnable)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
        sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    neutronSubnetId: ").append(toIndentedString(neutronSubnetId)).append("\n");
        sb.append("    neutronIpv6SubnetId: ").append(toIndentedString(neutronIpv6SubnetId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
