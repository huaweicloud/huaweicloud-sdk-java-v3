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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_affinity")

    private Boolean antiAffinity;

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
     * 独享引擎版本规格   - waf.instance.enterprise：企业版，对应控制台WI-100规格   - waf.instance.professional：专业版，对应控制台WI-500规格
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
     * 独享引擎ECS规格，实例规格。创建资源租户类独享引擎可不填该参数，创建普通资源租户独享引擎必填该参数。普通租户类独享引擎具体支持的规格以waf控制台上支持的规格为准，企业版对应8U16G的ecs规格，专业版对应2U4G的ecs规格。
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
     * 是否为资源租户类，默认值为false。   - true: 资源租户类   - false: 普通租户类
     * @return resTenant
     */
    public Boolean getResTenant() {
        return resTenant;
    }

    public void setResTenant(Boolean resTenant) {
        this.resTenant = resTenant;
    }

    public CreateInstanceRequestBody withAntiAffinity(Boolean antiAffinity) {
        this.antiAffinity = antiAffinity;
        return this;
    }

    /**
     * 是否开启反亲和。仅资源租户独享实例支持该特性。
     * @return antiAffinity
     */
    public Boolean getAntiAffinity() {
        return antiAffinity;
    }

    public void setAntiAffinity(Boolean antiAffinity) {
        this.antiAffinity = antiAffinity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceRequestBody that = (CreateInstanceRequestBody) obj;
        return Objects.equals(this.chargemode, that.chargemode) && Objects.equals(this.region, that.region)
            && Objects.equals(this.availableZone, that.availableZone) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.instancename, that.instancename)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.cpuFlavor, that.cpuFlavor)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroup, that.securityGroup) && Objects.equals(this.count, that.count)
            && Objects.equals(this.resTenant, that.resTenant) && Objects.equals(this.antiAffinity, that.antiAffinity);
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
            resTenant,
            antiAffinity);
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
        sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
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
