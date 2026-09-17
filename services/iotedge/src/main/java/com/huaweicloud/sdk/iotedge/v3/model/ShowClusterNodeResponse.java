package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ip")

    private String internalIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocatable")

    private NodeResourceDTO allocatable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private NodeResourceDTO capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated_resources")

    private NodeAllocatedResourceDTO allocatedResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_version")

    private String kernelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_image")

    private String osImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_runtime_version")

    private String containerRuntimeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetes_version")

    private String kubernetesVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public ShowClusterNodeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowClusterNodeResponse withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    /**
     * 节点ip
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    public ShowClusterNodeResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 主机名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ShowClusterNodeResponse withAllocatable(NodeResourceDTO allocatable) {
        this.allocatable = allocatable;
        return this;
    }

    public ShowClusterNodeResponse withAllocatable(Consumer<NodeResourceDTO> allocatableSetter) {
        if (this.allocatable == null) {
            this.allocatable = new NodeResourceDTO();
            allocatableSetter.accept(this.allocatable);
        }

        return this;
    }

    /**
     * Get allocatable
     * @return allocatable
     */
    public NodeResourceDTO getAllocatable() {
        return allocatable;
    }

    public void setAllocatable(NodeResourceDTO allocatable) {
        this.allocatable = allocatable;
    }

    public ShowClusterNodeResponse withCapacity(NodeResourceDTO capacity) {
        this.capacity = capacity;
        return this;
    }

    public ShowClusterNodeResponse withCapacity(Consumer<NodeResourceDTO> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new NodeResourceDTO();
            capacitySetter.accept(this.capacity);
        }

        return this;
    }

    /**
     * Get capacity
     * @return capacity
     */
    public NodeResourceDTO getCapacity() {
        return capacity;
    }

    public void setCapacity(NodeResourceDTO capacity) {
        this.capacity = capacity;
    }

    public ShowClusterNodeResponse withAllocatedResources(NodeAllocatedResourceDTO allocatedResources) {
        this.allocatedResources = allocatedResources;
        return this;
    }

    public ShowClusterNodeResponse withAllocatedResources(Consumer<NodeAllocatedResourceDTO> allocatedResourcesSetter) {
        if (this.allocatedResources == null) {
            this.allocatedResources = new NodeAllocatedResourceDTO();
            allocatedResourcesSetter.accept(this.allocatedResources);
        }

        return this;
    }

    /**
     * Get allocatedResources
     * @return allocatedResources
     */
    public NodeAllocatedResourceDTO getAllocatedResources() {
        return allocatedResources;
    }

    public void setAllocatedResources(NodeAllocatedResourceDTO allocatedResources) {
        this.allocatedResources = allocatedResources;
    }

    public ShowClusterNodeResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，Ready or NotReady
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowClusterNodeResponse withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 架构，amd64 or arm64
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ShowClusterNodeResponse withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowClusterNodeResponse putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public ShowClusterNodeResponse withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * map类型，key为string,value为string
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public ShowClusterNodeResponse withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ShowClusterNodeResponse withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * 内核版本
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public ShowClusterNodeResponse withOsImage(String osImage) {
        this.osImage = osImage;
        return this;
    }

    /**
     * 操作系统版本
     * @return osImage
     */
    public String getOsImage() {
        return osImage;
    }

    public void setOsImage(String osImage) {
        this.osImage = osImage;
    }

    public ShowClusterNodeResponse withContainerRuntimeVersion(String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
        return this;
    }

    /**
     * 容器运行时版本
     * @return containerRuntimeVersion
     */
    public String getContainerRuntimeVersion() {
        return containerRuntimeVersion;
    }

    public void setContainerRuntimeVersion(String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
    }

    public ShowClusterNodeResponse withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * k8s版本
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }

    public ShowClusterNodeResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterNodeResponse that = (ShowClusterNodeResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.internalIp, that.internalIp)
            && Objects.equals(this.hostname, that.hostname) && Objects.equals(this.allocatable, that.allocatable)
            && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.allocatedResources, that.allocatedResources)
            && Objects.equals(this.status, that.status) && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.kernelVersion, that.kernelVersion) && Objects.equals(this.osImage, that.osImage)
            && Objects.equals(this.containerRuntimeVersion, that.containerRuntimeVersion)
            && Objects.equals(this.kubernetesVersion, that.kubernetesVersion)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            internalIp,
            hostname,
            allocatable,
            capacity,
            allocatedResources,
            status,
            architecture,
            labels,
            nodeType,
            kernelVersion,
            osImage,
            containerRuntimeVersion,
            kubernetesVersion,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterNodeResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    allocatedResources: ").append(toIndentedString(allocatedResources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
        sb.append("    containerRuntimeVersion: ").append(toIndentedString(containerRuntimeVersion)).append("\n");
        sb.append("    kubernetesVersion: ").append(toIndentedString(kubernetesVersion)).append("\n");
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
