package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 函数vpc配置。需同时为函数配置具有vpc权限的委托。
 */
public class FuncVpc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway")

    private String gateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_safety")

    private Boolean isSafety;

    public FuncVpc withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public FuncVpc withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 租户的project id。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public FuncVpc withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * 虚拟私有云名称。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public FuncVpc withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云唯一标识。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public FuncVpc withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 子网名称。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public FuncVpc withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网编号。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public FuncVpc withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 子网掩码。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public FuncVpc withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * 网关。
     * @return gateway
     */
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public FuncVpc withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public FuncVpc addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public FuncVpc withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public FuncVpc withIsSafety(Boolean isSafety) {
        this.isSafety = isSafety;
        return this;
    }

    /**
     * 是否开启安全访问。开启时，需要您自行配置VPCEP网络但可以提供更安全的VPC连接访问并打通内网域名。注意：开启后无法关闭。
     * @return isSafety
     */
    public Boolean getIsSafety() {
        return isSafety;
    }

    public void setIsSafety(Boolean isSafety) {
        this.isSafety = isSafety;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FuncVpc that = (FuncVpc) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.vpcName, that.vpcName) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetName, that.subnetName) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.gateway, that.gateway)
            && Objects.equals(this.securityGroups, that.securityGroups) && Objects.equals(this.isSafety, that.isSafety);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainId, namespace, vpcName, vpcId, subnetName, subnetId, cidr, gateway, securityGroups, isSafety);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuncVpc {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    isSafety: ").append(toIndentedString(isSafety)).append("\n");
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
