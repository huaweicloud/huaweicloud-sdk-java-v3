package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResponseServer
 */
public class ResponseServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_ip")

    private String connectIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private Integer effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_active")

    private Integer isActive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_status")

    private String updateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    public ResponseServer withConnectIp(String connectIp) {
        this.connectIp = connectIp;
        return this;
    }

    /**
     * 连接IP
     * @return connectIp
     */
    public String getConnectIp() {
        return connectIp;
    }

    public void setConnectIp(String connectIp) {
        this.connectIp = connectIp;
    }

    public ResponseServer withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU数
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ResponseServer withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ResponseServer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ResponseServer withEffect(Integer effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 实例冻结状态  - 1：冻结可释放 （默认）  - 2：冻结不可释放  - 3：冻结后不可续费
     * @return effect
     */
    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }

    public ResponseServer withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ResponseServer withIsActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * 双机实例HA中用来标注实例为主机还是备机, - 0：主机  - 1：备机
     * @return isActive
     */
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public ResponseServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResponseServer withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public ResponseServer withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 所属REGION
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ResponseServer withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 实例所属规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ResponseServer withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 冻结场景  - POLICE：公安冻结  - ILLEGAL：违规冻结  - VERIFY：未实名认证冻结  - PARTNER：合作伙伴冻结 - ARREAR：普通冻结（普通）
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public ResponseServer withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ResponseServer withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 资源规格类型编码
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ResponseServer withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResponseServer withSubnetId(String subnetId) {
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

    public ResponseServer withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 实例处理中状态
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ResponseServer withUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    /**
     * 升级状态  - SUCCESS：成功  - FAILED：失败  - UPGRADING：升级中
     * @return updateStatus
     */
    public String getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    public ResponseServer withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ResponseServer withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ResponseServer withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 所属区域
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public ResponseServer withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseServer that = (ResponseServer) obj;
        return Objects.equals(this.connectIp, that.connectIp) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.created, that.created) && Objects.equals(this.description, that.description)
            && Objects.equals(this.effect, that.effect) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.isActive, that.isActive) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.region, that.region)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode) && Objects.equals(this.scene, that.scene)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.status, that.status)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.updateStatus, that.updateStatus) && Objects.equals(this.version, that.version)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.zone, that.zone)
            && Objects.equals(this.serverId, that.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectIp,
            cpu,
            created,
            description,
            effect,
            instanceId,
            isActive,
            name,
            ram,
            region,
            resourceSpecCode,
            scene,
            securityGroupId,
            specification,
            status,
            subnetId,
            taskStatus,
            updateStatus,
            version,
            vpcId,
            zone,
            serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseServer {\n");
        sb.append("    connectIp: ").append(toIndentedString(connectIp)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
