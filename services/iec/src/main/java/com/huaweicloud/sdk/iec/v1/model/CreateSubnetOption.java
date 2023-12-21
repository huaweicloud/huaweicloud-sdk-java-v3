package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建子网对象数据。
 */
public class CreateSubnetOption {

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
    @JsonProperty(value = "primary_dns")

    private String primaryDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_dns")

    private String secondaryDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnsList")

    private List<String> dnsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    public CreateSubnetOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子网名称  约束：由中文字符、字母、数字、中划线和下划线和点组成，长度为1~64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSubnetOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 子网的网段  取值范围：必须在vpc对应cidr范围内  约束：必须是cidr格式。掩码长度不能大于28
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateSubnetOption withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * 子网的网关  取值范围：子网网段中的IP地址  约束：必须是ip格式
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public CreateSubnetOption withDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
        return this;
    }

    /**
     * 子网是否开启dhcp功能  取值范围：true（开启），false（关闭）  约束：不填时默认为true。当设置为false时，会导致新创建的ECS无法获取IP地址，cloudinit无法注入账号密码，请谨慎操作。
     * @return dhcpEnable
     */
    public Boolean getDhcpEnable() {
        return dhcpEnable;
    }

    public void setDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
    }

    public CreateSubnetOption withPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }

    /**
     * 子网dns服务器地址1  约束：ip格式，不支持IPv6地址
     * @return primaryDns
     */
    public String getPrimaryDns() {
        return primaryDns;
    }

    public void setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
    }

    public CreateSubnetOption withSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
        return this;
    }

    /**
     * 子网dns服务器地址2  约束：ip格式，不支持IPv6地址
     * @return secondaryDns
     */
    public String getSecondaryDns() {
        return secondaryDns;
    }

    public void setSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
    }

    public CreateSubnetOption withDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
        return this;
    }

    public CreateSubnetOption addDnsListItem(String dnsListItem) {
        if (this.dnsList == null) {
            this.dnsList = new ArrayList<>();
        }
        this.dnsList.add(dnsListItem);
        return this;
    }

    public CreateSubnetOption withDnsList(Consumer<List<String>> dnsListSetter) {
        if (this.dnsList == null) {
            this.dnsList = new ArrayList<>();
        }
        dnsListSetter.accept(this.dnsList);
        return this;
    }

    /**
     * 子网dns服务器地址的集合；如果想使用两个以上dns服务器，请使用该字段  约束：是子网dns服务器地址1跟子网dns服务器地址2的合集的父集，不支持IPv6地址。
     * @return dnsList
     */
    public List<String> getDnsList() {
        return dnsList;
    }

    public void setDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
    }

    public CreateSubnetOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 子网所在VPC的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateSubnetOption withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 子网归属的站点ID,从站点信息列表中获取。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubnetOption that = (CreateSubnetOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.gatewayIp, that.gatewayIp) && Objects.equals(this.dhcpEnable, that.dhcpEnable)
            && Objects.equals(this.primaryDns, that.primaryDns) && Objects.equals(this.secondaryDns, that.secondaryDns)
            && Objects.equals(this.dnsList, that.dnsList) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.siteId, that.siteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cidr, gatewayIp, dhcpEnable, primaryDns, secondaryDns, dnsList, vpcId, siteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubnetOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    dhcpEnable: ").append(toIndentedString(dhcpEnable)).append("\n");
        sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
        sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
        sb.append("    dnsList: ").append(toIndentedString(dnsList)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
