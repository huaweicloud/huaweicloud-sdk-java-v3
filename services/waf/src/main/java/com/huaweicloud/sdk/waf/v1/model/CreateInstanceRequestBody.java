package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateInstanceRequestBody
 */
public class CreateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargemode")

    private Integer chargemode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private String availableZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instancename")

    private String instancename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_flavor")

    private String cpuFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private List<String> securityGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_tenant")

    private Boolean resTenant;

    public CreateInstanceRequestBody withChargemode(Integer chargemode) {
        this.chargemode = chargemode;
        return this;
    }

    /**
     * 收费模式，当前仅支持按需收费（30）
     * @return chargemode
     */
    public Integer getChargemode() {
        return chargemode;
    }

    public void setChargemode(Integer chargemode) {
        this.chargemode = chargemode;
    }

    public CreateInstanceRequestBody withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 需要创建独享引擎的局点，例如：北京四（cn-north-4）
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateInstanceRequestBody withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    /**
     * 需要创建独享引擎的可用区，例如：北京四可用区1（cn-north-4a）
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public CreateInstanceRequestBody withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 独享引擎CPU架构，例如：x86与arm
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public CreateInstanceRequestBody withInstancename(String instancename) {
        this.instancename = instancename;
        return this;
    }

    /**
     * 独享引擎名称前缀
     * @return instancename
     */
    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename;
    }

    public CreateInstanceRequestBody withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 独享引擎版本规格，枚举值（企业版：waf.instance.enterprise，专业版：waf.instance.professional）
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public CreateInstanceRequestBody withCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
        return this;
    }

    /**
     * 独享引擎ECS规格，实例规格企业版对应8U16G的ecs规格，专业版对应2U4G的ecs规格（通过调用ECS的ListFlavors接口获取应8U16G的ecs和2U4G的ecs对应规格id）
     * @return cpuFlavor
     */
    public String getCpuFlavor() {
        return cpuFlavor;
    }

    public void setCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
    }

    public CreateInstanceRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 独享引擎所在VPC的ID（通过调用虚拟私有云ListVpcs接口获取所有的VPC列表查询VPC的ID，如果需要关联企业项目，则调用虚拟私有云的接口也需要关联企业项目ID）
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 独享引擎所在VPC内的子网ID（通过调用虚拟私有云ListSubnets接口获取所有的子网列表查询子网的ID，如果需要关联企业项目，则调用虚拟私有云的接口也需要关联企业项目ID）
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateInstanceRequestBody withSecurityGroup(List<String> securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public CreateInstanceRequestBody addSecurityGroupItem(String securityGroupItem) {
        if (this.securityGroup == null) {
            this.securityGroup = new ArrayList<>();
        }
        this.securityGroup.add(securityGroupItem);
        return this;
    }

    public CreateInstanceRequestBody withSecurityGroup(Consumer<List<String>> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new ArrayList<>();
        }
        securityGroupSetter.accept(this.securityGroup);
        return this;
    }

    /**
     * 独享引擎需要绑定的安全组ID（通过调用虚拟私有云ListSecurityGroups接口获取所有的安全组列表查询安全组的ID，如果需要关联企业项目，则调用虚拟私有云的接口也需要关联企业项目ID）
     * @return securityGroup
     */
    public List<String> getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(List<String> securityGroup) {
        this.securityGroup = securityGroup;
    }

    public CreateInstanceRequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 申请的独享引擎数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateInstanceRequestBody withResTenant(Boolean resTenant) {
        this.resTenant = resTenant;
        return this;
    }

    /**
     * 是否为资源租户类   - true: 资源租户类   -false: 普通租户类
     * @return resTenant
     */
    public Boolean getResTenant() {
        return resTenant;
    }

    public void setResTenant(Boolean resTenant) {
        this.resTenant = resTenant;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceRequestBody createInstanceRequestBody = (CreateInstanceRequestBody) o;
        return Objects.equals(this.chargemode, createInstanceRequestBody.chargemode)
            && Objects.equals(this.region, createInstanceRequestBody.region)
            && Objects.equals(this.availableZone, createInstanceRequestBody.availableZone)
            && Objects.equals(this.arch, createInstanceRequestBody.arch)
            && Objects.equals(this.instancename, createInstanceRequestBody.instancename)
            && Objects.equals(this.specification, createInstanceRequestBody.specification)
            && Objects.equals(this.cpuFlavor, createInstanceRequestBody.cpuFlavor)
            && Objects.equals(this.vpcId, createInstanceRequestBody.vpcId)
            && Objects.equals(this.subnetId, createInstanceRequestBody.subnetId)
            && Objects.equals(this.securityGroup, createInstanceRequestBody.securityGroup)
            && Objects.equals(this.count, createInstanceRequestBody.count)
            && Objects.equals(this.resTenant, createInstanceRequestBody.resTenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargemode,
            region,
            availableZone,
            arch,
            instancename,
            specification,
            cpuFlavor,
            vpcId,
            subnetId,
            securityGroup,
            count,
            resTenant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRequestBody {\n");
        sb.append("    chargemode: ").append(toIndentedString(chargemode)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    instancename: ").append(toIndentedString(instancename)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    cpuFlavor: ").append(toIndentedString(cpuFlavor)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    resTenant: ").append(toIndentedString(resTenant)).append("\n");
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
