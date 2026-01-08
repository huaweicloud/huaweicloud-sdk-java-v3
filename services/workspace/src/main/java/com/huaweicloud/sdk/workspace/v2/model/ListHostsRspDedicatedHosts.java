package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListHostsRspDedicatedHosts
 */
public class ListHostsRspDedicatedHosts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_placement")

    private String autoPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_properties")

    private ListHostsRspHostProperties hostProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_vcpus")

    private Integer availableVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_memory")

    private Integer availableMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_total")

    private Integer instanceTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated_at")

    private String allocatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "released_at")

    private String releasedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_uuids")

    private List<String> instanceUuids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ListHostsRspDedicatedHosts withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 云办公主机ID。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public ListHostsRspDedicatedHosts withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云办公主机的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListHostsRspDedicatedHosts withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * 在创建云服务器时（未指定专属主机ID），是否允许云服务器自动分配在一台可用的云办公主机上。取值范围：“on”或“off”。
     * @return autoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }

    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    public ListHostsRspDedicatedHosts withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 云办公主机的区域。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListHostsRspDedicatedHosts withHostProperties(ListHostsRspHostProperties hostProperties) {
        this.hostProperties = hostProperties;
        return this;
    }

    public ListHostsRspDedicatedHosts withHostProperties(Consumer<ListHostsRspHostProperties> hostPropertiesSetter) {
        if (this.hostProperties == null) {
            this.hostProperties = new ListHostsRspHostProperties();
            hostPropertiesSetter.accept(this.hostProperties);
        }

        return this;
    }

    /**
     * Get hostProperties
     * @return hostProperties
     */
    public ListHostsRspHostProperties getHostProperties() {
        return hostProperties;
    }

    public void setHostProperties(ListHostsRspHostProperties hostProperties) {
        this.hostProperties = hostProperties;
    }

    public ListHostsRspDedicatedHosts withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 云办公主机的产品id。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListHostsRspDedicatedHosts withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 云办公主机的订单id。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListHostsRspDedicatedHosts withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 云服务资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListHostsRspDedicatedHosts withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 云办公主机状态，该参数取值可以为：“available”、“fault”或“released”。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListHostsRspDedicatedHosts withAvailableVcpus(Integer availableVcpus) {
        this.availableVcpus = availableVcpus;
        return this;
    }

    /**
     * 云办公主机可用的vCPU核数。
     * @return availableVcpus
     */
    public Integer getAvailableVcpus() {
        return availableVcpus;
    }

    public void setAvailableVcpus(Integer availableVcpus) {
        this.availableVcpus = availableVcpus;
    }

    public ListHostsRspDedicatedHosts withAvailableMemory(Integer availableMemory) {
        this.availableMemory = availableMemory;
        return this;
    }

    /**
     * 云办公主机可用的内存大小。
     * @return availableMemory
     */
    public Integer getAvailableMemory() {
        return availableMemory;
    }

    public void setAvailableMemory(Integer availableMemory) {
        this.availableMemory = availableMemory;
    }

    public ListHostsRspDedicatedHosts withInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
        return this;
    }

    /**
     * 云办公主机上的实例总数。
     * @return instanceTotal
     */
    public Integer getInstanceTotal() {
        return instanceTotal;
    }

    public void setInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
    }

    public ListHostsRspDedicatedHosts withAllocatedAt(String allocatedAt) {
        this.allocatedAt = allocatedAt;
        return this;
    }

    /**
     * 云办公主机的分配时间。
     * @return allocatedAt
     */
    public String getAllocatedAt() {
        return allocatedAt;
    }

    public void setAllocatedAt(String allocatedAt) {
        this.allocatedAt = allocatedAt;
    }

    public ListHostsRspDedicatedHosts withReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
        return this;
    }

    /**
     * 云办公主机的释放时间。
     * @return releasedAt
     */
    public String getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

    public ListHostsRspDedicatedHosts withInstanceUuids(List<String> instanceUuids) {
        this.instanceUuids = instanceUuids;
        return this;
    }

    public ListHostsRspDedicatedHosts addInstanceUuidsItem(String instanceUuidsItem) {
        if (this.instanceUuids == null) {
            this.instanceUuids = new ArrayList<>();
        }
        this.instanceUuids.add(instanceUuidsItem);
        return this;
    }

    public ListHostsRspDedicatedHosts withInstanceUuids(Consumer<List<String>> instanceUuidsSetter) {
        if (this.instanceUuids == null) {
            this.instanceUuids = new ArrayList<>();
        }
        instanceUuidsSetter.accept(this.instanceUuids);
        return this;
    }

    /**
     * 专属主机上的实例UUID。
     * @return instanceUuids
     */
    public List<String> getInstanceUuids() {
        return instanceUuids;
    }

    public void setInstanceUuids(List<String> instanceUuids) {
        this.instanceUuids = instanceUuids;
    }

    public ListHostsRspDedicatedHosts withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListHostsRspDedicatedHosts withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHostsRspDedicatedHosts that = (ListHostsRspDedicatedHosts) obj;
        return Objects.equals(this.dedicatedHostId, that.dedicatedHostId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.autoPlacement, that.autoPlacement)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.hostProperties, that.hostProperties)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.state, that.state)
            && Objects.equals(this.availableVcpus, that.availableVcpus)
            && Objects.equals(this.availableMemory, that.availableMemory)
            && Objects.equals(this.instanceTotal, that.instanceTotal)
            && Objects.equals(this.allocatedAt, that.allocatedAt) && Objects.equals(this.releasedAt, that.releasedAt)
            && Objects.equals(this.instanceUuids, that.instanceUuids)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostId,
            name,
            autoPlacement,
            availabilityZone,
            hostProperties,
            productId,
            orderId,
            resourceType,
            state,
            availableVcpus,
            availableMemory,
            instanceTotal,
            allocatedAt,
            releasedAt,
            instanceUuids,
            enterpriseProjectId,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsRspDedicatedHosts {\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    hostProperties: ").append(toIndentedString(hostProperties)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    availableVcpus: ").append(toIndentedString(availableVcpus)).append("\n");
        sb.append("    availableMemory: ").append(toIndentedString(availableMemory)).append("\n");
        sb.append("    instanceTotal: ").append(toIndentedString(instanceTotal)).append("\n");
        sb.append("    allocatedAt: ").append(toIndentedString(allocatedAt)).append("\n");
        sb.append("    releasedAt: ").append(toIndentedString(releasedAt)).append("\n");
        sb.append("    instanceUuids: ").append(toIndentedString(instanceUuids)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
