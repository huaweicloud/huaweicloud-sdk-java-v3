package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instancename")

    private String instancename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

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
    @JsonProperty(value = "service_ip")

    private String serviceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_ids")

    private List<String> securityGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private Integer runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradable")

    private Integer upgradable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceType")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceType")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSpecCode")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverId")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public DeleteInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 独享引擎实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteInstanceResponse withInstancename(String instancename) {
        this.instancename = instancename;
        return this;
    }

    /**
     * 独享引擎实例名称
     * @return instancename
     */
    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename;
    }

    public DeleteInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 独享引擎实例Region ID
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DeleteInstanceResponse withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 可用区ID
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public DeleteInstanceResponse withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * CPU架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public DeleteInstanceResponse withCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
        return this;
    }

    /**
     * ECS规格
     * @return cpuFlavor
     */
    public String getCpuFlavor() {
        return cpuFlavor;
    }

    public void setCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
    }

    public DeleteInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 独享引擎实例所在VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public DeleteInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 独享引擎实例所在VPC的子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public DeleteInstanceResponse withServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }

    /**
     * 独享引擎实例的业务面IP
     * @return serviceIp
     */
    public String getServiceIp() {
        return serviceIp;
    }

    public void setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
    }

    public DeleteInstanceResponse withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public DeleteInstanceResponse addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    public DeleteInstanceResponse withSecurityGroupIds(Consumer<List<String>> securityGroupIdsSetter) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        securityGroupIdsSetter.accept(this.securityGroupIds);
        return this;
    }

    /**
     * 独享引擎绑定的安全组
     * @return securityGroupIds
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public DeleteInstanceResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 独享引擎计费状态 \\n - 0：正常计费 \\n - 1：冻结,资源和数据会保留，但租户无法再正常使用云服务 \\n - 2：终止，资源和数据将清除
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DeleteInstanceResponse withRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * 独享引擎运行状态 \\ n - 0：创建中 \\n - 1：运行中 \\n - 2：删除中 \\n - 3：已删除 \\n - 4：创建失败 \\n - 5：已冻结 \\n - 6：异常 \\n - 7：更新中 \\n - 8：更新失败
     * @return runStatus
     */
    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public DeleteInstanceResponse withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 独享引擎接入状态（0：未接入，1：已接入）
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public DeleteInstanceResponse withUpgradable(Integer upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    /**
     * 独享引擎是否可升级（0：不可升级，1：可升级）
     * @return upgradable
     */
    public Integer getUpgradable() {
        return upgradable;
    }

    public void setUpgradable(Integer upgradable) {
        this.upgradable = upgradable;
    }

    public DeleteInstanceResponse withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务代码。 仅作为标记，用户可忽略。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public DeleteInstanceResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 云服务资源类型，仅作为标记，用户可忽略。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public DeleteInstanceResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 云服务资源代码。仅作为标记，用户可忽略。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public DeleteInstanceResponse withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 独享引擎ECS规格，如\"8vCPUs | 16GB\"
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public DeleteInstanceResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 独享引擎ECS ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public DeleteInstanceResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 引擎实例创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteInstanceResponse deleteInstanceResponse = (DeleteInstanceResponse) o;
        return Objects.equals(this.id, deleteInstanceResponse.id)
            && Objects.equals(this.instancename, deleteInstanceResponse.instancename)
            && Objects.equals(this.region, deleteInstanceResponse.region)
            && Objects.equals(this.zone, deleteInstanceResponse.zone)
            && Objects.equals(this.arch, deleteInstanceResponse.arch)
            && Objects.equals(this.cpuFlavor, deleteInstanceResponse.cpuFlavor)
            && Objects.equals(this.vpcId, deleteInstanceResponse.vpcId)
            && Objects.equals(this.subnetId, deleteInstanceResponse.subnetId)
            && Objects.equals(this.serviceIp, deleteInstanceResponse.serviceIp)
            && Objects.equals(this.securityGroupIds, deleteInstanceResponse.securityGroupIds)
            && Objects.equals(this.status, deleteInstanceResponse.status)
            && Objects.equals(this.runStatus, deleteInstanceResponse.runStatus)
            && Objects.equals(this.accessStatus, deleteInstanceResponse.accessStatus)
            && Objects.equals(this.upgradable, deleteInstanceResponse.upgradable)
            && Objects.equals(this.cloudServiceType, deleteInstanceResponse.cloudServiceType)
            && Objects.equals(this.resourceType, deleteInstanceResponse.resourceType)
            && Objects.equals(this.resourceSpecCode, deleteInstanceResponse.resourceSpecCode)
            && Objects.equals(this.specification, deleteInstanceResponse.specification)
            && Objects.equals(this.serverId, deleteInstanceResponse.serverId)
            && Objects.equals(this.createTime, deleteInstanceResponse.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instancename,
            region,
            zone,
            arch,
            cpuFlavor,
            vpcId,
            subnetId,
            serviceIp,
            securityGroupIds,
            status,
            runStatus,
            accessStatus,
            upgradable,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            specification,
            serverId,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instancename: ").append(toIndentedString(instancename)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    cpuFlavor: ").append(toIndentedString(cpuFlavor)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    serviceIp: ").append(toIndentedString(serviceIp)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    upgradable: ").append(toIndentedString(upgradable)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
