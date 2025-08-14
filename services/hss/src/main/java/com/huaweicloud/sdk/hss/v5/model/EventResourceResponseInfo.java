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
    @JsonProperty(value = "container_status")

    private String containerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_uid")

    private String podUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

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
     * **参数解释**： 租户账号ID **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 项目ID **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 企业项目ID **取值范围**： 字符长度1-256位 
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
     * **参数解释**： Region名称 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： VPC ID **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 云主机ID **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 虚拟机名称 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 虚拟机UUID，即主机ID **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 容器ID **取值范围**： 字符长度1-256位 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public EventResourceResponseInfo withContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
        return this;
    }

    /**
     * **参数解释**： 容器状态 **取值范围**： 字符长度1-256位 
     * @return containerStatus
     */
    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public EventResourceResponseInfo withPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }

    /**
     * **参数解释**： pod uid **取值范围**： 字符长度1-256位 
     * @return podUid
     */
    public String getPodUid() {
        return podUid;
    }

    public void setPodUid(String podUid) {
        this.podUid = podUid;
    }

    public EventResourceResponseInfo withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释**： pod name **取值范围**： 字符长度1-256位 
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public EventResourceResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： namespace **取值范围**： 字符长度1-256位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public EventResourceResponseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID **取值范围**： 字符长度1-256位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public EventResourceResponseInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称 **取值范围**： 字符长度1-256位 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public EventResourceResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**： 镜像ID **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 镜像名称 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 主机属性 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 业务服务 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 微服务 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 系统CPU架构 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 操作系统位数 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 操作系统类型 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 操作系统名称 **取值范围**： 字符长度1-256位 
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
     * **参数解释**： 操作系统版本 **取值范围**： 字符长度1-256位 
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventResourceResponseInfo that = (EventResourceResponseInfo) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.regionName, that.regionName) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.cloudId, that.cloudId) && Objects.equals(this.vmName, that.vmName)
            && Objects.equals(this.vmUuid, that.vmUuid) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerStatus, that.containerStatus) && Objects.equals(this.podUid, that.podUid)
            && Objects.equals(this.podName, that.podName) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.hostAttr, that.hostAttr) && Objects.equals(this.service, that.service)
            && Objects.equals(this.microService, that.microService) && Objects.equals(this.sysArch, that.sysArch)
            && Objects.equals(this.osBit, that.osBit) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.osName, that.osName) && Objects.equals(this.osVersion, that.osVersion);
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
            containerStatus,
            podUid,
            podName,
            namespace,
            clusterId,
            clusterName,
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
        sb.append("    containerStatus: ").append(toIndentedString(containerStatus)).append("\n");
        sb.append("    podUid: ").append(toIndentedString(podUid)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
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
