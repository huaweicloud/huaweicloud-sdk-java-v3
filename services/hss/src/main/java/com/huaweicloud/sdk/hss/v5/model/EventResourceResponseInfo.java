package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源信息
 */
public class EventResourceResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_id")

    private String cloudId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_name")

    private String vmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_uuid")

    private String vmUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_attr")

    private String hostAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "micro_service")

    private String microService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_arch")

    private String sysArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private String osBit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    public EventResourceResponseInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public EventResourceResponseInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EventResourceResponseInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EventResourceResponseInfo withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Region名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public EventResourceResponseInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EventResourceResponseInfo withCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * 云主机ID
     * @return cloudId
     */
    public String getCloudId() {
        return cloudId;
    }

    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }

    public EventResourceResponseInfo withVmName(String vmName) {
        this.vmName = vmName;
        return this;
    }

    /**
     * 虚拟机名称
     * @return vmName
     */
    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public EventResourceResponseInfo withVmUuid(String vmUuid) {
        this.vmUuid = vmUuid;
        return this;
    }

    /**
     * 虚拟机UUID
     * @return vmUuid
     */
    public String getVmUuid() {
        return vmUuid;
    }

    public void setVmUuid(String vmUuid) {
        this.vmUuid = vmUuid;
    }

    public EventResourceResponseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 容器ID
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public EventResourceResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public EventResourceResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public EventResourceResponseInfo withHostAttr(String hostAttr) {
        this.hostAttr = hostAttr;
        return this;
    }

    /**
     * 主机属性
     * @return hostAttr
     */
    public String getHostAttr() {
        return hostAttr;
    }

    public void setHostAttr(String hostAttr) {
        this.hostAttr = hostAttr;
    }

    public EventResourceResponseInfo withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 业务服务
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public EventResourceResponseInfo withMicroService(String microService) {
        this.microService = microService;
        return this;
    }

    /**
     * 微服务
     * @return microService
     */
    public String getMicroService() {
        return microService;
    }

    public void setMicroService(String microService) {
        this.microService = microService;
    }

    public EventResourceResponseInfo withSysArch(String sysArch) {
        this.sysArch = sysArch;
        return this;
    }

    /**
     * 系统CPU架构
     * @return sysArch
     */
    public String getSysArch() {
        return sysArch;
    }

    public void setSysArch(String sysArch) {
        this.sysArch = sysArch;
    }

    public EventResourceResponseInfo withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    /**
     * 操作系统位数
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public EventResourceResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public EventResourceResponseInfo withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 操作系统名称
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public EventResourceResponseInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventResourceResponseInfo eventResourceResponseInfo = (EventResourceResponseInfo) o;
        return Objects.equals(this.domainId, eventResourceResponseInfo.domainId)
            && Objects.equals(this.projectId, eventResourceResponseInfo.projectId)
            && Objects.equals(this.enterpriseProjectId, eventResourceResponseInfo.enterpriseProjectId)
            && Objects.equals(this.regionName, eventResourceResponseInfo.regionName)
            && Objects.equals(this.vpcId, eventResourceResponseInfo.vpcId)
            && Objects.equals(this.cloudId, eventResourceResponseInfo.cloudId)
            && Objects.equals(this.vmName, eventResourceResponseInfo.vmName)
            && Objects.equals(this.vmUuid, eventResourceResponseInfo.vmUuid)
            && Objects.equals(this.containerId, eventResourceResponseInfo.containerId)
            && Objects.equals(this.imageId, eventResourceResponseInfo.imageId)
            && Objects.equals(this.imageName, eventResourceResponseInfo.imageName)
            && Objects.equals(this.hostAttr, eventResourceResponseInfo.hostAttr)
            && Objects.equals(this.service, eventResourceResponseInfo.service)
            && Objects.equals(this.microService, eventResourceResponseInfo.microService)
            && Objects.equals(this.sysArch, eventResourceResponseInfo.sysArch)
            && Objects.equals(this.osBit, eventResourceResponseInfo.osBit)
            && Objects.equals(this.osType, eventResourceResponseInfo.osType)
            && Objects.equals(this.osName, eventResourceResponseInfo.osName)
            && Objects.equals(this.osVersion, eventResourceResponseInfo.osVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            projectId,
            enterpriseProjectId,
            regionName,
            vpcId,
            cloudId,
            vmName,
            vmUuid,
            containerId,
            imageId,
            imageName,
            hostAttr,
            service,
            microService,
            sysArch,
            osBit,
            osType,
            osName,
            osVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventResourceResponseInfo {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
        sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
        sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    hostAttr: ").append(toIndentedString(hostAttr)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    microService: ").append(toIndentedString(microService)).append("\n");
        sb.append("    sysArch: ").append(toIndentedString(sysArch)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
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
