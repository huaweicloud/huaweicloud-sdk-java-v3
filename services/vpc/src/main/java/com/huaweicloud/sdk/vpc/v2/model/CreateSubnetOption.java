package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.ExtraDhcpOption;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreateSubnetOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_ip")
    
    private String gatewayIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_enable")
    
    private Boolean ipv6Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dhcp_enable")
    
    private Boolean dhcpEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="primary_dns")
    
    private String primaryDns;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secondary_dns")
    
    private String secondaryDns;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnsList")
    
    private List<String> dnsList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_dhcp_opts")
    
    private List<ExtraDhcpOption> extraDhcpOpts = null;
    
    public CreateSubnetOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：子网名称 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSubnetOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能说明：子网描述 取值范围：0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSubnetOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 功能说明：子网的网段 取值范围：必须在vpc对应cidr范围内 约束：必须是cidr格式。掩码长度不能大于28
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateSubnetOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 子网所在VPC标识
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateSubnetOption withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    


    /**
     * 功能说明：子网的网关 取值范围：子网网段中的IP地址 约束：必须是ip格式
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public CreateSubnetOption withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    


    /**
     * 功能说明：是否创建cidr_v6 取值范围：true（开启），false（关闭） 约束：不填时默认为false > 说明 该参数目前仅在“华北-北京四”区域开放，且申请IPv6公测后才可设置。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public CreateSubnetOption withDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
        return this;
    }

    


    /**
     * 功能说明：子网是否开启dhcp功能 取值范围：true（开启），false（关闭） 约束：不填时默认为true。当设置为false时，会导致新创建的ECS无法获取IP地址，cloudinit无法注入账号密码，请谨慎操作。
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
     * 功能说明：子网dns服务器地址1 约束：ip格式，不支持IPv6地址
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
     * 功能说明：子网dns服务器地址2 约束：ip格式，不支持IPv6地址
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
        if(this.dnsList == null ){
            this.dnsList = new ArrayList<>();
        }
        dnsListSetter.accept(this.dnsList);
        return this;
    }

    /**
     * 功能说明：子网dns服务器地址的集合；如果想使用两个以上dns服务器，请使用该字段 约束：是子网dns服务器地址1跟子网dns服务器地址2的合集的父集，不支持IPv6地址。
     * @return dnsList
     */
    public List<String> getDnsList() {
        return dnsList;
    }

    public void setDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
    }

    public CreateSubnetOption withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 功能说明：子网所在的可用分区标识 约束：系统存在的可用分区标识
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateSubnetOption withExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    
    public CreateSubnetOption addExtraDhcpOptsItem(ExtraDhcpOption extraDhcpOptsItem) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public CreateSubnetOption withExtraDhcpOpts(Consumer<List<ExtraDhcpOption>> extraDhcpOptsSetter) {
        if(this.extraDhcpOpts == null ){
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    /**
     * 子网配置的NTP地址
     * @return extraDhcpOpts
     */
    public List<ExtraDhcpOption> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSubnetOption createSubnetOption = (CreateSubnetOption) o;
        return Objects.equals(this.name, createSubnetOption.name) &&
            Objects.equals(this.description, createSubnetOption.description) &&
            Objects.equals(this.cidr, createSubnetOption.cidr) &&
            Objects.equals(this.vpcId, createSubnetOption.vpcId) &&
            Objects.equals(this.gatewayIp, createSubnetOption.gatewayIp) &&
            Objects.equals(this.ipv6Enable, createSubnetOption.ipv6Enable) &&
            Objects.equals(this.dhcpEnable, createSubnetOption.dhcpEnable) &&
            Objects.equals(this.primaryDns, createSubnetOption.primaryDns) &&
            Objects.equals(this.secondaryDns, createSubnetOption.secondaryDns) &&
            Objects.equals(this.dnsList, createSubnetOption.dnsList) &&
            Objects.equals(this.availabilityZone, createSubnetOption.availabilityZone) &&
            Objects.equals(this.extraDhcpOpts, createSubnetOption.extraDhcpOpts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, cidr, vpcId, gatewayIp, ipv6Enable, dhcpEnable, primaryDns, secondaryDns, dnsList, availabilityZone, extraDhcpOpts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubnetOption {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
            sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
            sb.append("    dhcpEnable: ").append(toIndentedString(dhcpEnable)).append("\n");
            sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
            sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
            sb.append("    dnsList: ").append(toIndentedString(dnsList)).append("\n");
            sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
            sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
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

