package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 容器类型告警取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoContainerForensic {

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
    @JsonProperty(value = "priviledged")

    private Boolean priviledged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid_mode")

    private String pidMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipc_mode")

    private String ipcMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_mode")

    private String networkMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_allports")

    private Boolean publishAllports;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capabilities")

    private String capabilities;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_opts")

    private String securityOpts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private String ports;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mounts")

    private String mounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_call")

    private String sysCall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    public EventForensicInfoContainerForensic withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**： 容器ID **取值范围**： 不涉及
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public EventForensicInfoContainerForensic withContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
        return this;
    }

    /**
     * **参数解释**： 容器状态 **取值范围**： 不涉及
     * @return containerStatus
     */
    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public EventForensicInfoContainerForensic withPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }

    /**
     * **参数解释**： pod uid **取值范围**： 不涉及
     * @return podUid
     */
    public String getPodUid() {
        return podUid;
    }

    public void setPodUid(String podUid) {
        this.podUid = podUid;
    }

    public EventForensicInfoContainerForensic withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释**： pod name **取值范围**： 不涉及
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public EventForensicInfoContainerForensic withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 命名空间 **取值范围**： 不涉及
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public EventForensicInfoContainerForensic withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群id **取值范围**： 不涉及
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public EventForensicInfoContainerForensic withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称 **取值范围**： 不涉及
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public EventForensicInfoContainerForensic withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**： 镜像ID **取值范围**： 不涉及
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public EventForensicInfoContainerForensic withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**： 镜像名称 **取值范围**： 不涉及
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public EventForensicInfoContainerForensic withPriviledged(Boolean priviledged) {
        this.priviledged = priviledged;
        return this;
    }

    /**
     * **参数解释**： 容器特权开放 **取值范围**： 不涉及
     * @return priviledged
     */
    public Boolean getPriviledged() {
        return priviledged;
    }

    public void setPriviledged(Boolean priviledged) {
        this.priviledged = priviledged;
    }

    public EventForensicInfoContainerForensic withPidMode(String pidMode) {
        this.pidMode = pidMode;
        return this;
    }

    /**
     * **参数解释**： 容器pid命名空间模式 **取值范围**： 不涉及
     * @return pidMode
     */
    public String getPidMode() {
        return pidMode;
    }

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    public EventForensicInfoContainerForensic withIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
        return this;
    }

    /**
     * **参数解释**： 容器ipc命名空间模式 **取值范围**： 不涉及
     * @return ipcMode
     */
    public String getIpcMode() {
        return ipcMode;
    }

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    public EventForensicInfoContainerForensic withNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * **参数解释**： 容器网络命名空间模式 **取值范围**： 不涉及
     * @return networkMode
     */
    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public EventForensicInfoContainerForensic withPublishAllports(Boolean publishAllports) {
        this.publishAllports = publishAllports;
        return this;
    }

    /**
     * **参数解释**： 容器开放所有端口 **取值范围**： 不涉及
     * @return publishAllports
     */
    public Boolean getPublishAllports() {
        return publishAllports;
    }

    public void setPublishAllports(Boolean publishAllports) {
        this.publishAllports = publishAllports;
    }

    public EventForensicInfoContainerForensic withCapabilities(String capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * **参数解释**： 容器权限 **取值范围**： 不涉及
     * @return capabilities
     */
    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    public EventForensicInfoContainerForensic withSecurityOpts(String securityOpts) {
        this.securityOpts = securityOpts;
        return this;
    }

    /**
     * **参数解释**： 容器安全选项 **取值范围**： 不涉及
     * @return securityOpts
     */
    public String getSecurityOpts() {
        return securityOpts;
    }

    public void setSecurityOpts(String securityOpts) {
        this.securityOpts = securityOpts;
    }

    public EventForensicInfoContainerForensic withPorts(String ports) {
        this.ports = ports;
        return this;
    }

    /**
     * **参数解释**： 容器开放端口 **取值范围**： 不涉及
     * @return ports
     */
    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public EventForensicInfoContainerForensic withMounts(String mounts) {
        this.mounts = mounts;
        return this;
    }

    /**
     * **参数解释**： 容器挂载目录 **取值范围**： 不涉及
     * @return mounts
     */
    public String getMounts() {
        return mounts;
    }

    public void setMounts(String mounts) {
        this.mounts = mounts;
    }

    public EventForensicInfoContainerForensic withSysCall(String sysCall) {
        this.sysCall = sysCall;
        return this;
    }

    /**
     * **参数解释**： 系统调用 **取值范围**： 不涉及
     * @return sysCall
     */
    public String getSysCall() {
        return sysCall;
    }

    public void setSysCall(String sysCall) {
        this.sysCall = sysCall;
    }

    public EventForensicInfoContainerForensic withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器名称 **取值范围**： 不涉及
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoContainerForensic that = (EventForensicInfoContainerForensic) obj;
        return Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerStatus, that.containerStatus) && Objects.equals(this.podUid, that.podUid)
            && Objects.equals(this.podName, that.podName) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.priviledged, that.priviledged) && Objects.equals(this.pidMode, that.pidMode)
            && Objects.equals(this.ipcMode, that.ipcMode) && Objects.equals(this.networkMode, that.networkMode)
            && Objects.equals(this.publishAllports, that.publishAllports)
            && Objects.equals(this.capabilities, that.capabilities)
            && Objects.equals(this.securityOpts, that.securityOpts) && Objects.equals(this.ports, that.ports)
            && Objects.equals(this.mounts, that.mounts) && Objects.equals(this.sysCall, that.sysCall)
            && Objects.equals(this.containerName, that.containerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId,
            containerStatus,
            podUid,
            podName,
            namespace,
            clusterId,
            clusterName,
            imageId,
            imageName,
            priviledged,
            pidMode,
            ipcMode,
            networkMode,
            publishAllports,
            capabilities,
            securityOpts,
            ports,
            mounts,
            sysCall,
            containerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoContainerForensic {\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerStatus: ").append(toIndentedString(containerStatus)).append("\n");
        sb.append("    podUid: ").append(toIndentedString(podUid)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    priviledged: ").append(toIndentedString(priviledged)).append("\n");
        sb.append("    pidMode: ").append(toIndentedString(pidMode)).append("\n");
        sb.append("    ipcMode: ").append(toIndentedString(ipcMode)).append("\n");
        sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
        sb.append("    publishAllports: ").append(toIndentedString(publishAllports)).append("\n");
        sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
        sb.append("    securityOpts: ").append(toIndentedString(securityOpts)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
        sb.append("    sysCall: ").append(toIndentedString(sysCall)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
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
