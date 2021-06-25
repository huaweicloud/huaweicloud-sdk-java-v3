package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.IdHostnameEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 独享引擎信息
 */
public class PremiumWafInstance  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instancename")
    
    private String instancename;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serverId")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zone")
    
    private String zone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    private String arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu_flavor")
    
    private String cpuFlavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_ip")
    
    private String serviceIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_ipv6")
    
    private String serviceIpv6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatIp")
    
    private String floatIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="securityGroupId")
    
    private List<String> securityGroupId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mgrSecurityGroupId")
    
    private String mgrSecurityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="run_status")
    
    private Integer runStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_status")
    
    private Integer accessStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="upgradable")
    
    private Integer upgradable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloudServiceType")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceType")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceSpecCode")
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specification")
    
    private String specification;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosts")
    
    private List<IdHostnameEntry> hosts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private String volumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_id")
    
    private String poolId;

    public PremiumWafInstance withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 独享引擎ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public PremiumWafInstance withInstancename(String instancename) {
        this.instancename = instancename;
        return this;
    }

    


    /**
     * 独享引擎名称
     * @return instancename
     */
    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename;
    }

    

    public PremiumWafInstance withServerId(String serverId) {
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

    

    public PremiumWafInstance withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * Region代码
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public PremiumWafInstance withZone(String zone) {
        this.zone = zone;
        return this;
    }

    


    /**
     * 可用区代码
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    

    public PremiumWafInstance withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * CPU架构代码
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    public PremiumWafInstance withCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
        return this;
    }

    


    /**
     * ECS规格代码
     * @return cpuFlavor
     */
    public String getCpuFlavor() {
        return cpuFlavor;
    }

    public void setCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
    }

    

    public PremiumWafInstance withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 独享引擎所在VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public PremiumWafInstance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 独享引擎所在VPC的子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public PremiumWafInstance withServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }

    


    /**
     * 独享引擎的业务面IP
     * @return serviceIp
     */
    public String getServiceIp() {
        return serviceIp;
    }

    public void setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
    }

    

    public PremiumWafInstance withServiceIpv6(String serviceIpv6) {
        this.serviceIpv6 = serviceIpv6;
        return this;
    }

    


    /**
     * 独享引擎的业务面IPV6地址
     * @return serviceIpv6
     */
    public String getServiceIpv6() {
        return serviceIpv6;
    }

    public void setServiceIpv6(String serviceIpv6) {
        this.serviceIpv6 = serviceIpv6;
    }

    

    public PremiumWafInstance withFloatIp(String floatIp) {
        this.floatIp = floatIp;
        return this;
    }

    


    /**
     * 独享引擎的管理面IP
     * @return floatIp
     */
    public String getFloatIp() {
        return floatIp;
    }

    public void setFloatIp(String floatIp) {
        this.floatIp = floatIp;
    }

    

    public PremiumWafInstance withSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    
    public PremiumWafInstance addSecurityGroupIdItem(String securityGroupIdItem) {
        if(this.securityGroupId == null) {
            this.securityGroupId = new ArrayList<>();
        }
        this.securityGroupId.add(securityGroupIdItem);
        return this;
    }

    public PremiumWafInstance withSecurityGroupId(Consumer<List<String>> securityGroupIdSetter) {
        if(this.securityGroupId == null) {
            this.securityGroupId = new ArrayList<>();
        }
        securityGroupIdSetter.accept(this.securityGroupId);
        return this;
    }

    /**
     * 独享引擎ECS绑定的安全组
     * @return securityGroupId
     */
    public List<String> getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public PremiumWafInstance withMgrSecurityGroupId(String mgrSecurityGroupId) {
        this.mgrSecurityGroupId = mgrSecurityGroupId;
        return this;
    }

    


    /**
     * 独享引擎ECS绑定的用于WAF服务的安全组
     * @return mgrSecurityGroupId
     */
    public String getMgrSecurityGroupId() {
        return mgrSecurityGroupId;
    }

    public void setMgrSecurityGroupId(String mgrSecurityGroupId) {
        this.mgrSecurityGroupId = mgrSecurityGroupId;
    }

    

    public PremiumWafInstance withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 独享引擎计费状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public PremiumWafInstance withRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    


    /**
     * 独享引擎允许状态
     * @return runStatus
     */
    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    

    public PremiumWafInstance withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    


    /**
     * 独享引擎接入状态
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    

    public PremiumWafInstance withUpgradable(Integer upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    


    /**
     * 独享引擎是否可升级
     * @return upgradable
     */
    public Integer getUpgradable() {
        return upgradable;
    }

    public void setUpgradable(Integer upgradable) {
        this.upgradable = upgradable;
    }

    

    public PremiumWafInstance withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * 云服务代码
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    

    public PremiumWafInstance withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 云服务资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public PremiumWafInstance withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * 云服务资源代码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    

    public PremiumWafInstance withSpecification(String specification) {
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

    

    public PremiumWafInstance withHosts(List<IdHostnameEntry> hosts) {
        this.hosts = hosts;
        return this;
    }

    
    public PremiumWafInstance addHostsItem(IdHostnameEntry hostsItem) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public PremiumWafInstance withHosts(Consumer<List<IdHostnameEntry>> hostsSetter) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 独享引擎防护的域名
     * @return hosts
     */
    public List<IdHostnameEntry> getHosts() {
        return hosts;
    }

    public void setHosts(List<IdHostnameEntry> hosts) {
        this.hosts = hosts;
    }

    

    public PremiumWafInstance withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 存储类型（可选）
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    

    public PremiumWafInstance withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 存储资源池ID（可选）
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public PremiumWafInstance withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    


    /**
     * 独享引擎所在WAF组的ID（仅适用特殊独享模式）
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PremiumWafInstance premiumWafInstance = (PremiumWafInstance) o;
        return Objects.equals(this.id, premiumWafInstance.id) &&
            Objects.equals(this.instancename, premiumWafInstance.instancename) &&
            Objects.equals(this.serverId, premiumWafInstance.serverId) &&
            Objects.equals(this.region, premiumWafInstance.region) &&
            Objects.equals(this.zone, premiumWafInstance.zone) &&
            Objects.equals(this.arch, premiumWafInstance.arch) &&
            Objects.equals(this.cpuFlavor, premiumWafInstance.cpuFlavor) &&
            Objects.equals(this.vpcId, premiumWafInstance.vpcId) &&
            Objects.equals(this.subnetId, premiumWafInstance.subnetId) &&
            Objects.equals(this.serviceIp, premiumWafInstance.serviceIp) &&
            Objects.equals(this.serviceIpv6, premiumWafInstance.serviceIpv6) &&
            Objects.equals(this.floatIp, premiumWafInstance.floatIp) &&
            Objects.equals(this.securityGroupId, premiumWafInstance.securityGroupId) &&
            Objects.equals(this.mgrSecurityGroupId, premiumWafInstance.mgrSecurityGroupId) &&
            Objects.equals(this.status, premiumWafInstance.status) &&
            Objects.equals(this.runStatus, premiumWafInstance.runStatus) &&
            Objects.equals(this.accessStatus, premiumWafInstance.accessStatus) &&
            Objects.equals(this.upgradable, premiumWafInstance.upgradable) &&
            Objects.equals(this.cloudServiceType, premiumWafInstance.cloudServiceType) &&
            Objects.equals(this.resourceType, premiumWafInstance.resourceType) &&
            Objects.equals(this.resourceSpecCode, premiumWafInstance.resourceSpecCode) &&
            Objects.equals(this.specification, premiumWafInstance.specification) &&
            Objects.equals(this.hosts, premiumWafInstance.hosts) &&
            Objects.equals(this.volumeType, premiumWafInstance.volumeType) &&
            Objects.equals(this.clusterId, premiumWafInstance.clusterId) &&
            Objects.equals(this.poolId, premiumWafInstance.poolId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, instancename, serverId, region, zone, arch, cpuFlavor, vpcId, subnetId, serviceIp, serviceIpv6, floatIp, securityGroupId, mgrSecurityGroupId, status, runStatus, accessStatus, upgradable, cloudServiceType, resourceType, resourceSpecCode, specification, hosts, volumeType, clusterId, poolId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instancename: ").append(toIndentedString(instancename)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    cpuFlavor: ").append(toIndentedString(cpuFlavor)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    serviceIp: ").append(toIndentedString(serviceIp)).append("\n");
        sb.append("    serviceIpv6: ").append(toIndentedString(serviceIpv6)).append("\n");
        sb.append("    floatIp: ").append(toIndentedString(floatIp)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    mgrSecurityGroupId: ").append(toIndentedString(mgrSecurityGroupId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    upgradable: ").append(toIndentedString(upgradable)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
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

