package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CollectorNode
 */
public class CollectorNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_instance_refer_count")

    private Long channelInstanceReferCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_label")

    private String customLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_type")

    private String deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor")

    private Monitor monitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_expansion")

    private IsapNodeExpansion nodeExpansion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_address")

    private String vpcEndpointAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_id")

    private String vpcEndpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public CollectorNode withChannelInstanceReferCount(Long channelInstanceReferCount) {
        this.channelInstanceReferCount = channelInstanceReferCount;
        return this;
    }

    /**
     * 数值
     * minimum: 1
     * maximum: 1024
     * @return channelInstanceReferCount
     */
    public Long getChannelInstanceReferCount() {
        return channelInstanceReferCount;
    }

    public void setChannelInstanceReferCount(Long channelInstanceReferCount) {
        this.channelInstanceReferCount = channelInstanceReferCount;
    }

    public CollectorNode withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * Iam用户ID
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public CollectorNode withCustomLabel(String customLabel) {
        this.customLabel = customLabel;
        return this;
    }

    /**
     * 自定义标签
     * @return customLabel
     */
    public String getCustomLabel() {
        return customLabel;
    }

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    public CollectorNode withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CollectorNode withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 设备类型
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public CollectorNode withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public CollectorNode withMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public CollectorNode withMonitor(Consumer<Monitor> monitorSetter) {
        if (this.monitor == null) {
            this.monitor = new Monitor();
            monitorSetter.accept(this.monitor);
        }

        return this;
    }

    /**
     * Get monitor
     * @return monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CollectorNode withNodeExpansion(IsapNodeExpansion nodeExpansion) {
        this.nodeExpansion = nodeExpansion;
        return this;
    }

    public CollectorNode withNodeExpansion(Consumer<IsapNodeExpansion> nodeExpansionSetter) {
        if (this.nodeExpansion == null) {
            this.nodeExpansion = new IsapNodeExpansion();
            nodeExpansionSetter.accept(this.nodeExpansion);
        }

        return this;
    }

    /**
     * Get nodeExpansion
     * @return nodeExpansion
     */
    public IsapNodeExpansion getNodeExpansion() {
        return nodeExpansion;
    }

    public void setNodeExpansion(IsapNodeExpansion nodeExpansion) {
        this.nodeExpansion = nodeExpansion;
    }

    public CollectorNode withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * UUID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CollectorNode withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 所属租户名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public CollectorNode withOsType(String osType) {
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

    public CollectorNode withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * IP地址
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public CollectorNode withProjectId(String projectId) {
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

    public CollectorNode withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CollectorNode withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 规格
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public CollectorNode withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 9223372036854775800
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CollectorNode withVpcEndpointAddress(String vpcEndpointAddress) {
        this.vpcEndpointAddress = vpcEndpointAddress;
        return this;
    }

    /**
     * Vpc 端点地址
     * @return vpcEndpointAddress
     */
    public String getVpcEndpointAddress() {
        return vpcEndpointAddress;
    }

    public void setVpcEndpointAddress(String vpcEndpointAddress) {
        this.vpcEndpointAddress = vpcEndpointAddress;
    }

    public CollectorNode withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * Vpc 端点ID
     * @return vpcEndpointId
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    public CollectorNode withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * UUID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CollectorNode withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectorNode that = (CollectorNode) obj;
        return Objects.equals(this.channelInstanceReferCount, that.channelInstanceReferCount)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.customLabel, that.customLabel)
            && Objects.equals(this.description, that.description) && Objects.equals(this.deviceType, that.deviceType)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.monitor, that.monitor)
            && Objects.equals(this.nodeExpansion, that.nodeExpansion) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.vpcEndpointAddress, that.vpcEndpointAddress)
            && Objects.equals(this.vpcEndpointId, that.vpcEndpointId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelInstanceReferCount,
            createBy,
            customLabel,
            description,
            deviceType,
            ipAddress,
            monitor,
            nodeExpansion,
            nodeId,
            nodeName,
            osType,
            privateIpAddress,
            projectId,
            region,
            specification,
            updateTime,
            vpcEndpointAddress,
            vpcEndpointId,
            vpcId,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectorNode {\n");
        sb.append("    channelInstanceReferCount: ").append(toIndentedString(channelInstanceReferCount)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    customLabel: ").append(toIndentedString(customLabel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
        sb.append("    nodeExpansion: ").append(toIndentedString(nodeExpansion)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    vpcEndpointAddress: ").append(toIndentedString(vpcEndpointAddress)).append("\n");
        sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
