package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 防护配置关联的容器信息 **取值范围**: 不涉及 
 */
public class WebTamperProtectionContainerResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_ip")

    private String podIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_directory_nums")

    private Integer allDirectoryNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_directory_nums")

    private Integer protectedDirectoryNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info")

    private WebTamperEventHostInfo hostInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info")

    private WebTamperEventClusterInfo clusterInfo;

    public WebTamperProtectionContainerResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * description: |   **参数解释**:   防护状态   **取值范围**:   - protected：防护中   - partial_protected：部分防护   - protect_failed：防护失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebTamperProtectionContainerResponseInfo withContainerId(String containerId) {
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

    public WebTamperProtectionContainerResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器名称 **取值范围**： 字符长度1-256位 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public WebTamperProtectionContainerResponseInfo withImageName(String imageName) {
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

    public WebTamperProtectionContainerResponseInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**： 镜像版本 **取值范围**： 字符长度1-256位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public WebTamperProtectionContainerResponseInfo withPodName(String podName) {
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

    public WebTamperProtectionContainerResponseInfo withPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }

    /**
     * **参数解释**： pod ip **取值范围**： 字符长度1-256位 
     * @return podIp
     */
    public String getPodIp() {
        return podIp;
    }

    public void setPodIp(String podIp) {
        this.podIp = podIp;
    }

    public WebTamperProtectionContainerResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 命名空间 **取值范围**： 字符长度1-256位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public WebTamperProtectionContainerResponseInfo withAllDirectoryNums(Integer allDirectoryNums) {
        this.allDirectoryNums = allDirectoryNums;
        return this;
    }

    /**
     * **参数解释**: 防护总目录数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483547
     * @return allDirectoryNums
     */
    public Integer getAllDirectoryNums() {
        return allDirectoryNums;
    }

    public void setAllDirectoryNums(Integer allDirectoryNums) {
        this.allDirectoryNums = allDirectoryNums;
    }

    public WebTamperProtectionContainerResponseInfo withProtectedDirectoryNums(Integer protectedDirectoryNums) {
        this.protectedDirectoryNums = protectedDirectoryNums;
        return this;
    }

    /**
     * **参数解释**: 防护成功数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483547
     * @return protectedDirectoryNums
     */
    public Integer getProtectedDirectoryNums() {
        return protectedDirectoryNums;
    }

    public void setProtectedDirectoryNums(Integer protectedDirectoryNums) {
        this.protectedDirectoryNums = protectedDirectoryNums;
    }

    public WebTamperProtectionContainerResponseInfo withHostInfo(WebTamperEventHostInfo hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public WebTamperProtectionContainerResponseInfo withHostInfo(Consumer<WebTamperEventHostInfo> hostInfoSetter) {
        if (this.hostInfo == null) {
            this.hostInfo = new WebTamperEventHostInfo();
            hostInfoSetter.accept(this.hostInfo);
        }

        return this;
    }

    /**
     * Get hostInfo
     * @return hostInfo
     */
    public WebTamperEventHostInfo getHostInfo() {
        return hostInfo;
    }

    public void setHostInfo(WebTamperEventHostInfo hostInfo) {
        this.hostInfo = hostInfo;
    }

    public WebTamperProtectionContainerResponseInfo withClusterInfo(WebTamperEventClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public WebTamperProtectionContainerResponseInfo withClusterInfo(
        Consumer<WebTamperEventClusterInfo> clusterInfoSetter) {
        if (this.clusterInfo == null) {
            this.clusterInfo = new WebTamperEventClusterInfo();
            clusterInfoSetter.accept(this.clusterInfo);
        }

        return this;
    }

    /**
     * Get clusterInfo
     * @return clusterInfo
     */
    public WebTamperEventClusterInfo getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(WebTamperEventClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperProtectionContainerResponseInfo that = (WebTamperProtectionContainerResponseInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.podIp, that.podIp) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.allDirectoryNums, that.allDirectoryNums)
            && Objects.equals(this.protectedDirectoryNums, that.protectedDirectoryNums)
            && Objects.equals(this.hostInfo, that.hostInfo) && Objects.equals(this.clusterInfo, that.clusterInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            containerId,
            containerName,
            imageName,
            imageVersion,
            podName,
            podIp,
            namespace,
            allDirectoryNums,
            protectedDirectoryNums,
            hostInfo,
            clusterInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperProtectionContainerResponseInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    podIp: ").append(toIndentedString(podIp)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    allDirectoryNums: ").append(toIndentedString(allDirectoryNums)).append("\n");
        sb.append("    protectedDirectoryNums: ").append(toIndentedString(protectedDirectoryNums)).append("\n");
        sb.append("    hostInfo: ").append(toIndentedString(hostInfo)).append("\n");
        sb.append("    clusterInfo: ").append(toIndentedString(clusterInfo)).append("\n");
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
