package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建堡垒机实例请求参数。
 */
public class CBHInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_availability_zone")

    private String slaveAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hx_password")

    private String hxPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bastion_type")

    private String bastionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    public CBHInstances withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 待创建云堡垒机规格ID，例如： - cbh.basic.50 - cbh.enhance.50 已上线的规格请参见《云堡垒机产品介绍》的“服务版本差异(https://support.huaweicloud.com/productdesc-cbh/cbh_01_0010.html)”章节。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CBHInstances withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 云堡垒机实例名称，取值范围： - 只能由中文字符、英文字母、数字及“_”、“-”组成，且长度为[1-64]个字符。 例如：CBH-6b8e
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public CBHInstances withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 待创建云服务器所属虚拟私有云（简称VPC），需要指定已创建VPC的ID，UUID格式。 VPC的ID可以从控制台或者参考《虚拟私有云接口参考》的“查询VPC”章节获取。 例如：03211ecf-697e-4306-a7a0-6e939bf948de
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CBHInstances withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    public CBHInstances addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CBHInstances withNics(Consumer<List<Nics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * Get nics
     * @return nics
     */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public CBHInstances withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public CBHInstances withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public CBHInstances withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CBHInstances addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CBHInstances withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * Get securityGroups
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CBHInstances withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 创建云堡垒机所在的可用区，需要指定可用区名称。 可参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CBHInstances withSlaveAvailabilityZone(String slaveAvailabilityZone) {
        this.slaveAvailabilityZone = slaveAvailabilityZone;
        return this;
    }

    /**
     * 创建云堡垒机所在的备机可用区，需要指定备机可用区名称。 可参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取
     * @return slaveAvailabilityZone
     */
    public String getSlaveAvailabilityZone() {
        return slaveAvailabilityZone;
    }

    public void setSlaveAvailabilityZone(String slaveAvailabilityZone) {
        this.slaveAvailabilityZone = slaveAvailabilityZone;
    }

    public CBHInstances withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 云堡垒机实例描述信息。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CBHInstances withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 云服务所在局点ID。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CBHInstances withHxPassword(String hxPassword) {
        this.hxPassword = hxPassword;
        return this;
    }

    /**
     * 堡垒机实例前端登录密码。密码规则：8-32位,不能包含amdin或nidma及其大写形式,必须包含大小写数字特殊字符四种类型中的三种。
     * @return hxPassword
     */
    public String getHxPassword() {
        return hxPassword;
    }

    public void setHxPassword(String hxPassword) {
        this.hxPassword = hxPassword;
    }

    public CBHInstances withBastionType(String bastionType) {
        this.bastionType = bastionType;
        return this;
    }

    /**
     * 堡垒机实例类型，填写“OEM”即可。
     * @return bastionType
     */
    public String getBastionType() {
        return bastionType;
    }

    public void setBastionType(String bastionType) {
        this.bastionType = bastionType;
    }

    public CBHInstances withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否支持IPV6，不填默认为false。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CBHInstances cbHInstances = (CBHInstances) o;
        return Objects.equals(this.flavorRef, cbHInstances.flavorRef)
            && Objects.equals(this.instanceName, cbHInstances.instanceName)
            && Objects.equals(this.vpcId, cbHInstances.vpcId) && Objects.equals(this.nics, cbHInstances.nics)
            && Objects.equals(this.publicIp, cbHInstances.publicIp)
            && Objects.equals(this.securityGroups, cbHInstances.securityGroups)
            && Objects.equals(this.availabilityZone, cbHInstances.availabilityZone)
            && Objects.equals(this.slaveAvailabilityZone, cbHInstances.slaveAvailabilityZone)
            && Objects.equals(this.comment, cbHInstances.comment) && Objects.equals(this.region, cbHInstances.region)
            && Objects.equals(this.hxPassword, cbHInstances.hxPassword)
            && Objects.equals(this.bastionType, cbHInstances.bastionType)
            && Objects.equals(this.ipv6Enable, cbHInstances.ipv6Enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef,
            instanceName,
            vpcId,
            nics,
            publicIp,
            securityGroups,
            availabilityZone,
            slaveAvailabilityZone,
            comment,
            region,
            hxPassword,
            bastionType,
            ipv6Enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CBHInstances {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    slaveAvailabilityZone: ").append(toIndentedString(slaveAvailabilityZone)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    hxPassword: ").append(toIndentedString(hxPassword)).append("\n");
        sb.append("    bastionType: ").append(toIndentedString(bastionType)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
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
