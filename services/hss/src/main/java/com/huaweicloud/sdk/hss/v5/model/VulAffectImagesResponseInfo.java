package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 受漏洞影响的镜像列表 **取值范围**: 不涉及 
 */
public class VulAffectImagesResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_necessity")

    private String repairNecessity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_num")

    private Integer containerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_digest")

    private String imageDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private String firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private String latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private String imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_arch")

    private String isMultiArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    public VulAffectImagesResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **取值范围**: 字符长度0-256位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public VulAffectImagesResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-512位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public VulAffectImagesResponseInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞id **取值范围**: 字符长度0-256位 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public VulAffectImagesResponseInfo withRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    /**
     * **参数解释**: 危险程度 **取值范围**: - Low：低危 - Medium：中危 - High：高危 - Critical：严重 
     * @return repairNecessity
     */
    public String getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    public VulAffectImagesResponseInfo withContainerNum(Integer containerNum) {
        this.containerNum = containerNum;
        return this;
    }

    /**
     * **参数解释**: 关联容器数 **取值范围**: 取值0-2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return containerNum
     */
    public Integer getContainerNum() {
        return containerNum;
    }

    public void setContainerNum(Integer containerNum) {
        this.containerNum = containerNum;
    }

    public VulAffectImagesResponseInfo withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * **参数解释**: 镜像标识 **取值范围**: 字符长度0-256位 
     * @return imageDigest
     */
    public String getImageDigest() {
        return imageDigest;
    }

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    public VulAffectImagesResponseInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本 **取值范围**: 字符长度0-64位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public VulAffectImagesResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: Agent ID **取值范围**: 字符长度0-128位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public VulAffectImagesResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 漏洞当前状态 **取值范围**: - vul_status_unfix：未处理 - vul_status_ignored：已忽略 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulAffectImagesResponseInfo withFirstScanTime(String firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * **参数解释**: 首次扫描时间（时间戳，单位为毫秒） **取值范围**: 字符长度0-32位 
     * @return firstScanTime
     */
    public String getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(String firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public VulAffectImagesResponseInfo withLatestScanTime(String latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间（时间戳，单位为毫秒） **取值范围**: 字符长度0-32位 
     * @return latestScanTime
     */
    public String getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(String latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public VulAffectImagesResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型 **取值范围**: - local_image：本地镜像 - registry：仓库镜像 - cicd：CI/CD镜像 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public VulAffectImagesResponseInfo withImageSize(String imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释**: 镜像大小 **取值范围**: 字符长度0-128位 
     * @return imageSize
     */
    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public VulAffectImagesResponseInfo withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * **参数解释**: 所属组织 **取值范围**: 字符长度0-256位 
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public VulAffectImagesResponseInfo withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**: 镜像仓类型 **取值范围**: - Harbor：harbor - Jfrog：jfrog - SwrPrivate：swr私有 - SwrShared：swr共享 - SwrEnterprise：swr企业 - Other：其他仓库 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public VulAffectImagesResponseInfo withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**: 仓库名称 **取值范围**: 字符长度0-256位 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public VulAffectImagesResponseInfo withIsMultiArch(String isMultiArch) {
        this.isMultiArch = isMultiArch;
        return this;
    }

    /**
     * **参数解释**: 是否为多架构 **取值范围**: - true：是多架构 - false：不是多架构 
     * @return isMultiArch
     */
    public String getIsMultiArch() {
        return isMultiArch;
    }

    public void setIsMultiArch(String isMultiArch) {
        this.isMultiArch = isMultiArch;
    }

    public VulAffectImagesResponseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群ID **取值范围**: 字符长度0-128位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VulAffectImagesResponseInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**: 集群名称 **取值范围**: 字符长度0-256位 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulAffectImagesResponseInfo that = (VulAffectImagesResponseInfo) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.vulId, that.vulId) && Objects.equals(this.repairNecessity, that.repairNecessity)
            && Objects.equals(this.containerNum, that.containerNum)
            && Objects.equals(this.imageDigest, that.imageDigest)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.firstScanTime, that.firstScanTime)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.organization, that.organization)
            && Objects.equals(this.registryType, that.registryType)
            && Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.isMultiArch, that.isMultiArch) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId,
            imageName,
            vulId,
            repairNecessity,
            containerNum,
            imageDigest,
            imageVersion,
            agentId,
            status,
            firstScanTime,
            latestScanTime,
            imageType,
            imageSize,
            organization,
            registryType,
            registryName,
            isMultiArch,
            clusterId,
            clusterName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulAffectImagesResponseInfo {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    containerNum: ").append(toIndentedString(containerNum)).append("\n");
        sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    isMultiArch: ").append(toIndentedString(isMultiArch)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
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
