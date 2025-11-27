package com.huaweicloud.sdk.hss.v5.model;

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
public class ListServerlessAssetDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_status")

    private String containerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_id")

    private String workloadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_name")

    private String workloadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private String workloadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_ip")

    private String podIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private String cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_limit")

    private String memoryLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private String args;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_info")

    private List<ContainerPortInfo> portInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_list")

    private List<ContainerMountInfo> mountList = null;

    public ListServerlessAssetDetailResponse withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器ID **取值范围**: 字符长度0-255位 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ListServerlessAssetDetailResponse withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**: 容器名称 **取值范围**: 字符长度0-255位 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListServerlessAssetDetailResponse withContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
        return this;
    }

    /**
     * **参数解释**: 容器状态 **取值范围**: - Running：运行中。 - Terminated：终止。 - Waiting：等待。 
     * @return containerStatus
     */
    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public ListServerlessAssetDetailResponse withWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }

    /**
     * **参数解释**: 负载id **取值范围**: 字符长度0-255位 
     * @return workloadId
     */
    public String getWorkloadId() {
        return workloadId;
    }

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    public ListServerlessAssetDetailResponse withWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }

    /**
     * **参数解释**: 负载名称 **取值范围**: 字符长度0-255位 
     * @return workloadName
     */
    public String getWorkloadName() {
        return workloadName;
    }

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    public ListServerlessAssetDetailResponse withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * **参数解释**: 负载类型 **取值范围**: 字符长度0-255位 
     * @return workloadType
     */
    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    public ListServerlessAssetDetailResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群id **取值范围**: 字符长度0-64位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListServerlessAssetDetailResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**: 所属集群 **取值范围**: 字符长度0-64位 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListServerlessAssetDetailResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 命名空间 **取值范围**: 字符长度0-64位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListServerlessAssetDetailResponse withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * **参数解释**: pod id **取值范围**: 字符长度0-64位 
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public ListServerlessAssetDetailResponse withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释**: 实例名称 **取值范围**: 字符长度0-255位 
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ListServerlessAssetDetailResponse withPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }

    /**
     * **参数解释**: 实例ip **取值范围**: 字符长度0-255位 
     * @return podIp
     */
    public String getPodIp() {
        return podIp;
    }

    public void setPodIp(String podIp) {
        this.podIp = podIp;
    }

    public ListServerlessAssetDetailResponse withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **取值范围**: 字符长度0-255位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ListServerlessAssetDetailResponse withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-255位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListServerlessAssetDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间 **取值范围**: 取值0-4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListServerlessAssetDetailResponse withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * **参数解释**: 标签列表 **取值范围**: 字符长度0-255位 
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ListServerlessAssetDetailResponse withCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * **参数解释**: cpu限制 **取值范围**: 字符长度0-64位 
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public ListServerlessAssetDetailResponse withMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }

    /**
     * **参数解释**: 内存限制 **取值范围**: 字符长度0-64位 
     * @return memoryLimit
     */
    public String getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public ListServerlessAssetDetailResponse withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * **参数解释**: 启动命令 **取值范围**: 字符长度0-65535位 
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ListServerlessAssetDetailResponse withArgs(String args) {
        this.args = args;
        return this;
    }

    /**
     * **参数解释**: 启动命令参数 **取值范围**: 字符长度0-65535位 
     * @return args
     */
    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public ListServerlessAssetDetailResponse withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * **参数解释**: 工作目录 **取值范围**: 字符长度0-65535位 
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public ListServerlessAssetDetailResponse withPortInfo(List<ContainerPortInfo> portInfo) {
        this.portInfo = portInfo;
        return this;
    }

    public ListServerlessAssetDetailResponse addPortInfoItem(ContainerPortInfo portInfoItem) {
        if (this.portInfo == null) {
            this.portInfo = new ArrayList<>();
        }
        this.portInfo.add(portInfoItem);
        return this;
    }

    public ListServerlessAssetDetailResponse withPortInfo(Consumer<List<ContainerPortInfo>> portInfoSetter) {
        if (this.portInfo == null) {
            this.portInfo = new ArrayList<>();
        }
        portInfoSetter.accept(this.portInfo);
        return this;
    }

    /**
     * **参数解释**: 端口列表 **取值范围**: 取值0-65535个端口对象 
     * @return portInfo
     */
    public List<ContainerPortInfo> getPortInfo() {
        return portInfo;
    }

    public void setPortInfo(List<ContainerPortInfo> portInfo) {
        this.portInfo = portInfo;
    }

    public ListServerlessAssetDetailResponse withMountList(List<ContainerMountInfo> mountList) {
        this.mountList = mountList;
        return this;
    }

    public ListServerlessAssetDetailResponse addMountListItem(ContainerMountInfo mountListItem) {
        if (this.mountList == null) {
            this.mountList = new ArrayList<>();
        }
        this.mountList.add(mountListItem);
        return this;
    }

    public ListServerlessAssetDetailResponse withMountList(Consumer<List<ContainerMountInfo>> mountListSetter) {
        if (this.mountList == null) {
            this.mountList = new ArrayList<>();
        }
        mountListSetter.accept(this.mountList);
        return this;
    }

    /**
     * **参数解释**: 存储卷配置 **取值范围**: 取值0-65535个配置对象 
     * @return mountList
     */
    public List<ContainerMountInfo> getMountList() {
        return mountList;
    }

    public void setMountList(List<ContainerMountInfo> mountList) {
        this.mountList = mountList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerlessAssetDetailResponse that = (ListServerlessAssetDetailResponse) obj;
        return Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.containerStatus, that.containerStatus)
            && Objects.equals(this.workloadId, that.workloadId) && Objects.equals(this.workloadName, that.workloadName)
            && Objects.equals(this.workloadType, that.workloadType) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.podId, that.podId) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.podIp, that.podIp) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.cpuLimit, that.cpuLimit)
            && Objects.equals(this.memoryLimit, that.memoryLimit) && Objects.equals(this.command, that.command)
            && Objects.equals(this.args, that.args) && Objects.equals(this.workingDir, that.workingDir)
            && Objects.equals(this.portInfo, that.portInfo) && Objects.equals(this.mountList, that.mountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId,
            containerName,
            containerStatus,
            workloadId,
            workloadName,
            workloadType,
            clusterId,
            clusterName,
            namespace,
            podId,
            podName,
            podIp,
            imageId,
            imageName,
            createTime,
            labels,
            cpuLimit,
            memoryLimit,
            command,
            args,
            workingDir,
            portInfo,
            mountList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerlessAssetDetailResponse {\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    containerStatus: ").append(toIndentedString(containerStatus)).append("\n");
        sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
        sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    podIp: ").append(toIndentedString(podIp)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    portInfo: ").append(toIndentedString(portInfo)).append("\n");
        sb.append("    mountList: ").append(toIndentedString(mountList)).append("\n");
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
