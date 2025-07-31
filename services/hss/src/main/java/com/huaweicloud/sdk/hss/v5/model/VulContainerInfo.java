package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 软件漏洞列表
 */
public class VulContainerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

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
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_org")

    private String imageOrg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    public VulContainerInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 受漏洞影响的容器id
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public VulContainerInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 受影响容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public VulContainerInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * 危险程度   - Critical : 漏洞cvss评分大于等于9；对应控制台页面的高危   - High : 漏洞cvss评分大于等于7，小于9；对应控制台页面的中危   - Medium : 漏洞cvss评分大于等于4，小于7；对应控制台页面的中危   - Low : 漏洞cvss评分小于4；对应控制台页面的低危
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public VulContainerInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 受漏洞影响的容器所处集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VulContainerInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 受影响容器所处集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public VulContainerInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 受漏洞影响的容器对应镜像id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public VulContainerInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 受影响容器对应镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public VulContainerInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 镜像版本
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public VulContainerInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public VulContainerInfo withImageOrg(String imageOrg) {
        this.imageOrg = imageOrg;
        return this;
    }

    /**
     * 所属组织
     * @return imageOrg
     */
    public String getImageOrg() {
        return imageOrg;
    }

    public void setImageOrg(String imageOrg) {
        this.imageOrg = imageOrg;
    }

    public VulContainerInfo withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * 仓库类型
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public VulContainerInfo withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * 仓库名称
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public VulContainerInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 受影响容器对应主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public VulContainerInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 漏洞状态   - vul_status_unfix : 未处理   - vul_status_ignored : 已忽略   - vul_status_verified : 验证中   - vul_status_fixing : 修复中   - vul_status_fixed : 修复成功   - vul_status_reboot : 修复成功待重启   - vul_status_failed : 修复失败   - vul_status_fix_after_reboot : 请重启主机再次修复
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulContainerInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 服务器公网ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public VulContainerInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器私网ip
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public VulContainerInfo withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 处置操作的描述信息
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public VulContainerInfo withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * 首次扫描时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public VulContainerInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * 扫描时间，时间戳单位：毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulContainerInfo that = (VulContainerInfo) obj;
        return Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.severityLevel, that.severityLevel) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.imageOrg, that.imageOrg)
            && Objects.equals(this.registryType, that.registryType)
            && Objects.equals(this.registryName, that.registryName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.firstScanTime, that.firstScanTime) && Objects.equals(this.scanTime, that.scanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId,
            containerName,
            severityLevel,
            clusterId,
            clusterName,
            imageId,
            imageName,
            imageVersion,
            imageType,
            imageOrg,
            registryType,
            registryName,
            hostName,
            status,
            hostIp,
            privateIp,
            remark,
            firstScanTime,
            scanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulContainerInfo {\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageOrg: ").append(toIndentedString(imageOrg)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
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
