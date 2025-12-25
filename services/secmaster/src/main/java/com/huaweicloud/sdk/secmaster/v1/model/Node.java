package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Node
 */
public class Node {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private IsapErrorRsp description;

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
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

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
    @JsonProperty(value = "vpcep_service_ip")

    private String vpcepServiceIp;

    public Node withCreateBy(String createBy) {
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

    public Node withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 9223372036854775800
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Node withDescription(IsapErrorRsp description) {
        this.description = description;
        return this;
    }

    public Node withDescription(Consumer<IsapErrorRsp> descriptionSetter) {
        if (this.description == null) {
            this.description = new IsapErrorRsp();
            descriptionSetter.accept(this.description);
        }

        return this;
    }

    /**
     * Get description
     * @return description
     */
    public IsapErrorRsp getDescription() {
        return description;
    }

    public void setDescription(IsapErrorRsp description) {
        this.description = description;
    }

    public Node withDeviceType(String deviceType) {
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

    public Node withIpAddress(String ipAddress) {
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

    public Node withMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public Node withMonitor(Consumer<Monitor> monitorSetter) {
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

    public Node withNodeExpansion(IsapNodeExpansion nodeExpansion) {
        this.nodeExpansion = nodeExpansion;
        return this;
    }

    public Node withNodeExpansion(Consumer<IsapNodeExpansion> nodeExpansionSetter) {
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

    public Node withNodeId(String nodeId) {
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

    public Node withNodeName(String nodeName) {
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

    public Node withOsType(String osType) {
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

    public Node withPrivateIpAddress(String privateIpAddress) {
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

    public Node withRegion(String region) {
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

    public Node withSpecification(String specification) {
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

    public Node withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Node withUpdateTime(Long updateTime) {
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

    public Node withVpcEndpointAddress(String vpcEndpointAddress) {
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

    public Node withVpcEndpointId(String vpcEndpointId) {
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

    public Node withVpcId(String vpcId) {
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

    public Node withVpcepServiceIp(String vpcepServiceIp) {
        this.vpcepServiceIp = vpcepServiceIp;
        return this;
    }

    /**
     * IP地址
     * @return vpcepServiceIp
     */
    public String getVpcepServiceIp() {
        return vpcepServiceIp;
    }

    public void setVpcepServiceIp(String vpcepServiceIp) {
        this.vpcepServiceIp = vpcepServiceIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node that = (Node) obj;
        return Objects.equals(this.createBy, that.createBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.deviceType, that.deviceType)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.monitor, that.monitor)
            && Objects.equals(this.nodeExpansion, that.nodeExpansion) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress) && Objects.equals(this.region, that.region)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.vpcEndpointAddress, that.vpcEndpointAddress)
            && Objects.equals(this.vpcEndpointId, that.vpcEndpointId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.vpcepServiceIp, that.vpcepServiceIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createBy,
            createTime,
            description,
            deviceType,
            ipAddress,
            monitor,
            nodeExpansion,
            nodeId,
            nodeName,
            osType,
            privateIpAddress,
            region,
            specification,
            subnetId,
            updateTime,
            vpcEndpointAddress,
            vpcEndpointId,
            vpcId,
            vpcepServiceIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Node {\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
        sb.append("    nodeExpansion: ").append(toIndentedString(nodeExpansion)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    vpcEndpointAddress: ").append(toIndentedString(vpcEndpointAddress)).append("\n");
        sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcepServiceIp: ").append(toIndentedString(vpcepServiceIp)).append("\n");
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
