package com.huaweicloud.sdk.dcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DedicatedCluster
 */
public class DedicatedCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_total")

    private Integer hostTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_properties")

    private HostProperties hostProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus_used")

    private Integer vcpusUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus_total")

    private Integer vcpusTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_mb_used")

    private Integer memoryMbUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_mb_total")

    private Integer memoryMbTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<String> flavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_total")

    private Integer instanceTotal;

    public DedicatedCluster withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DedicatedCluster withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public DedicatedCluster withHostTotal(Integer hostTotal) {
        this.hostTotal = hostTotal;
        return this;
    }

    /**
     * 主机数量
     * @return hostTotal
     */
    public Integer getHostTotal() {
        return hostTotal;
    }

    public void setHostTotal(Integer hostTotal) {
        this.hostTotal = hostTotal;
    }

    public DedicatedCluster withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 主机规格编码。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public DedicatedCluster withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 集群服务类型。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public DedicatedCluster withHostProperties(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
        return this;
    }

    public DedicatedCluster withHostProperties(Consumer<HostProperties> hostPropertiesSetter) {
        if (this.hostProperties == null) {
            this.hostProperties = new HostProperties();
            hostPropertiesSetter.accept(this.hostProperties);
        }

        return this;
    }

    /**
     * Get hostProperties
     * @return hostProperties
     */
    public HostProperties getHostProperties() {
        return hostProperties;
    }

    public void setHostProperties(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
    }

    public DedicatedCluster withVcpusUsed(Integer vcpusUsed) {
        this.vcpusUsed = vcpusUsed;
        return this;
    }

    /**
     * 已用vcpu个数。
     * @return vcpusUsed
     */
    public Integer getVcpusUsed() {
        return vcpusUsed;
    }

    public void setVcpusUsed(Integer vcpusUsed) {
        this.vcpusUsed = vcpusUsed;
    }

    public DedicatedCluster withVcpusTotal(Integer vcpusTotal) {
        this.vcpusTotal = vcpusTotal;
        return this;
    }

    /**
     * 总的vcpu个数。。
     * @return vcpusTotal
     */
    public Integer getVcpusTotal() {
        return vcpusTotal;
    }

    public void setVcpusTotal(Integer vcpusTotal) {
        this.vcpusTotal = vcpusTotal;
    }

    public DedicatedCluster withMemoryMbUsed(Integer memoryMbUsed) {
        this.memoryMbUsed = memoryMbUsed;
        return this;
    }

    /**
     * 已用内存。
     * @return memoryMbUsed
     */
    public Integer getMemoryMbUsed() {
        return memoryMbUsed;
    }

    public void setMemoryMbUsed(Integer memoryMbUsed) {
        this.memoryMbUsed = memoryMbUsed;
    }

    public DedicatedCluster withMemoryMbTotal(Integer memoryMbTotal) {
        this.memoryMbTotal = memoryMbTotal;
        return this;
    }

    /**
     * 总内存。
     * @return memoryMbTotal
     */
    public Integer getMemoryMbTotal() {
        return memoryMbTotal;
    }

    public void setMemoryMbTotal(Integer memoryMbTotal) {
        this.memoryMbTotal = memoryMbTotal;
    }

    public DedicatedCluster withFlavors(List<String> flavors) {
        this.flavors = flavors;
        return this;
    }

    public DedicatedCluster addFlavorsItem(String flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public DedicatedCluster withFlavors(Consumer<List<String>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 支持flavor列表
     * @return flavors
     */
    public List<String> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<String> flavors) {
        this.flavors = flavors;
    }

    public DedicatedCluster withInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
        return this;
    }

    /**
     * 运行的计算实例总数。
     * @return instanceTotal
     */
    public Integer getInstanceTotal() {
        return instanceTotal;
    }

    public void setInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DedicatedCluster that = (DedicatedCluster) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.hostTotal, that.hostTotal) && Objects.equals(this.hostType, that.hostType)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.hostProperties, that.hostProperties)
            && Objects.equals(this.vcpusUsed, that.vcpusUsed) && Objects.equals(this.vcpusTotal, that.vcpusTotal)
            && Objects.equals(this.memoryMbUsed, that.memoryMbUsed)
            && Objects.equals(this.memoryMbTotal, that.memoryMbTotal) && Objects.equals(this.flavors, that.flavors)
            && Objects.equals(this.instanceTotal, that.instanceTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            availabilityZone,
            hostTotal,
            hostType,
            serviceType,
            hostProperties,
            vcpusUsed,
            vcpusTotal,
            memoryMbUsed,
            memoryMbTotal,
            flavors,
            instanceTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DedicatedCluster {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    hostTotal: ").append(toIndentedString(hostTotal)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    hostProperties: ").append(toIndentedString(hostProperties)).append("\n");
        sb.append("    vcpusUsed: ").append(toIndentedString(vcpusUsed)).append("\n");
        sb.append("    vcpusTotal: ").append(toIndentedString(vcpusTotal)).append("\n");
        sb.append("    memoryMbUsed: ").append(toIndentedString(memoryMbUsed)).append("\n");
        sb.append("    memoryMbTotal: ").append(toIndentedString(memoryMbTotal)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    instanceTotal: ").append(toIndentedString(instanceTotal)).append("\n");
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
