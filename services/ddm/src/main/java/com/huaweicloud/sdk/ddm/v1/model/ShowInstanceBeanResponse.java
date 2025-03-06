package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DDM实例的信息。
 */
public class ShowInstanceBeanResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private String availableZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_count")

    private Integer nodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_ip")

    private String accessIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_port")

    private String accessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_count")

    private String coreCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram_capacity")

    private String ramCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_status")

    private String nodeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    public ShowInstanceBeanResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * DDM实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInstanceBeanResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * DDM实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceBeanResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建的实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceBeanResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为yyyy-mm-dd Thh:mm:ssZ。  其中，T指定某个时间的开始；Z指示 UTC 时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowInstanceBeanResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式与“created”完全相同。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowInstanceBeanResponse withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    /**
     * 可用区名称
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public ShowInstanceBeanResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowInstanceBeanResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowInstanceBeanResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowInstanceBeanResponse withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * 节点数量。
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public ShowInstanceBeanResponse withAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }

    /**
     * DDM实例访问地址。
     * @return accessIp
     */
    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public ShowInstanceBeanResponse withAccessPort(String accessPort) {
        this.accessPort = accessPort;
        return this;
    }

    /**
     * DDM实例访问端口。
     * @return accessPort
     */
    public String getAccessPort() {
        return accessPort;
    }

    public void setAccessPort(String accessPort) {
        this.accessPort = accessPort;
    }

    public ShowInstanceBeanResponse withCoreCount(String coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * cpu个数。
     * @return coreCount
     */
    public String getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(String coreCount) {
        this.coreCount = coreCount;
    }

    public ShowInstanceBeanResponse withRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
        return this;
    }

    /**
     * 内存大小，单位为G。
     * @return ramCapacity
     */
    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public ShowInstanceBeanResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 响应信息，若无异常信息则不返回该参数 
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowInstanceBeanResponse withNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * 节点状态。
     * @return nodeStatus
     */
    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public ShowInstanceBeanResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowInstanceBeanResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户在某一region下的project ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowInstanceBeanResponse withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本号（Core实例版本号）。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ShowInstanceBeanResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期的实例，有订单id。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowInstanceBeanResponse withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * 是否开启SSL。
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public ShowInstanceBeanResponse withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格码。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceBeanResponse that = (ShowInstanceBeanResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.name, that.name) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.availableZone, that.availableZone)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.nodeCount, that.nodeCount) && Objects.equals(this.accessIp, that.accessIp)
            && Objects.equals(this.accessPort, that.accessPort) && Objects.equals(this.coreCount, that.coreCount)
            && Objects.equals(this.ramCapacity, that.ramCapacity) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.nodeStatus, that.nodeStatus)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.enableSsl, that.enableSsl)
            && Objects.equals(this.flavorRef, that.flavorRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            name,
            created,
            updated,
            availableZone,
            vpcId,
            subnetId,
            securityGroupId,
            nodeCount,
            accessIp,
            accessPort,
            coreCount,
            ramCapacity,
            errorMsg,
            nodeStatus,
            enterpriseProjectId,
            projectId,
            engineVersion,
            orderId,
            enableSsl,
            flavorRef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceBeanResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
        sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
        sb.append("    accessPort: ").append(toIndentedString(accessPort)).append("\n");
        sb.append("    coreCount: ").append(toIndentedString(coreCount)).append("\n");
        sb.append("    ramCapacity: ").append(toIndentedString(ramCapacity)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
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
