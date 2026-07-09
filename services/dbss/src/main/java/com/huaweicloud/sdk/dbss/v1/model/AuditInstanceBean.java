package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 审计实例bean
 */
public class AuditInstanceBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_model")

    private String chargeModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_num")

    private Integer configNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_ip")

    private String connectIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_ipv6")

    private String connectIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_limit")

    private Integer databaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private Integer effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired")

    private String expired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private String keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_version")

    private String newVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_days")

    private String remainDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

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
    @JsonProperty(value = "task")

    private String task;

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
    @JsonProperty(value = "supported_feature")

    private List<String> supportedFeature = null;

    public AuditInstanceBean withChargeModel(String chargeModel) {
        this.chargeModel = chargeModel;
        return this;
    }

    /**
     * 付费模式  - Period：包周期 - Demand：按需。
     * @return chargeModel
     */
    public String getChargeModel() {
        return chargeModel;
    }

    public void setChargeModel(String chargeModel) {
        this.chargeModel = chargeModel;
    }

    public AuditInstanceBean withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注信息。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public AuditInstanceBean withConfigNum(Integer configNum) {
        this.configNum = configNum;
        return this;
    }

    /**
     * 配置的数据库总数。
     * @return configNum
     */
    public Integer getConfigNum() {
        return configNum;
    }

    public void setConfigNum(Integer configNum) {
        this.configNum = configNum;
    }

    public AuditInstanceBean withConnectIp(String connectIp) {
        this.connectIp = connectIp;
        return this;
    }

    /**
     * 连接地址。
     * @return connectIp
     */
    public String getConnectIp() {
        return connectIp;
    }

    public void setConnectIp(String connectIp) {
        this.connectIp = connectIp;
    }

    public AuditInstanceBean withConnectIpv6(String connectIpv6) {
        this.connectIpv6 = connectIpv6;
        return this;
    }

    /**
     * ipv6连接地址。
     * @return connectIpv6
     */
    public String getConnectIpv6() {
        return connectIpv6;
    }

    public void setConnectIpv6(String connectIpv6) {
        this.connectIpv6 = connectIpv6;
    }

    public AuditInstanceBean withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU个数
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public AuditInstanceBean withCreated(String created) {
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

    public AuditInstanceBean withDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
        return this;
    }

    /**
     * 支持的数据库总数
     * @return databaseLimit
     */
    public Integer getDatabaseLimit() {
        return databaseLimit;
    }

    public void setDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
    }

    public AuditInstanceBean withEffect(Integer effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 实例结果状态 - 1：冻结可释放  - 2：冻结不可释放 - 3：冻结后不可续费
     * @return effect
     */
    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }

    public AuditInstanceBean withExpired(String expired) {
        this.expired = expired;
        return this;
    }

    /**
     * 过期时间
     * @return expired
     */
    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public AuditInstanceBean withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuditInstanceBean withKeepDays(String keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 剩余天数
     * @return keepDays
     */
    public String getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(String keepDays) {
        this.keepDays = keepDays;
    }

    public AuditInstanceBean withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例别名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuditInstanceBean withNewVersion(String newVersion) {
        this.newVersion = newVersion;
        return this;
    }

    /**
     * 如果有返回，则需要升级，如果没有，则为null。
     * @return newVersion
     */
    public String getNewVersion() {
        return newVersion;
    }

    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    public AuditInstanceBean withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 绑定弹性IP的port ID
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public AuditInstanceBean withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public AuditInstanceBean withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 实例所在region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AuditInstanceBean withRemainDays(String remainDays) {
        this.remainDays = remainDays;
        return this;
    }

    /**
     * 到期天数
     * @return remainDays
     */
    public String getRemainDays() {
        return remainDays;
    }

    public void setRemainDays(String remainDays) {
        this.remainDays = remainDays;
    }

    public AuditInstanceBean withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AuditInstanceBean withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 实例的规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public AuditInstanceBean withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 场景
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public AuditInstanceBean withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public AuditInstanceBean withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 实例规格
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public AuditInstanceBean withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态  - SHUTOFF：已关闭  - ACTIVE：运行中，允许任何操作   - DELETING：删除中，不允许任何操作  - BUILD：创建中，不允许任何操作  - DELETED：已删除，不需要展示  - ERROR：故障，只允许删除  - HAWAIT：等待备机创建成功，不允许任何操作  - FROZEN：已冻结，只允许续费、绑定/解绑  - UPGRADING：升级中，不允许升级操作
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AuditInstanceBean withSubnetId(String subnetId) {
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

    public AuditInstanceBean withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * 任务状态  - powering-on：正在开启，实例可以绑定、解绑  - powering-off：正在关闭，实例可以绑定、解绑  - rebooting：正在重启，实例可以绑定、解绑  - delete_wait：等待删除，集群与实例不允许任何操作  - NO_TASK：不展示
     * @return task
     */
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public AuditInstanceBean withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 实例的当前版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AuditInstanceBean withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public AuditInstanceBean withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 可用区
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public AuditInstanceBean withSupportedFeature(List<String> supportedFeature) {
        this.supportedFeature = supportedFeature;
        return this;
    }

    public AuditInstanceBean addSupportedFeatureItem(String supportedFeatureItem) {
        if (this.supportedFeature == null) {
            this.supportedFeature = new ArrayList<>();
        }
        this.supportedFeature.add(supportedFeatureItem);
        return this;
    }

    public AuditInstanceBean withSupportedFeature(Consumer<List<String>> supportedFeatureSetter) {
        if (this.supportedFeature == null) {
            this.supportedFeature = new ArrayList<>();
        }
        supportedFeatureSetter.accept(this.supportedFeature);
        return this;
    }

    /**
     * 功能特性列表
     * @return supportedFeature
     */
    public List<String> getSupportedFeature() {
        return supportedFeature;
    }

    public void setSupportedFeature(List<String> supportedFeature) {
        this.supportedFeature = supportedFeature;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditInstanceBean that = (AuditInstanceBean) obj;
        return Objects.equals(this.chargeModel, that.chargeModel) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.configNum, that.configNum) && Objects.equals(this.connectIp, that.connectIp)
            && Objects.equals(this.connectIpv6, that.connectIpv6) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.created, that.created) && Objects.equals(this.databaseLimit, that.databaseLimit)
            && Objects.equals(this.effect, that.effect) && Objects.equals(this.expired, that.expired)
            && Objects.equals(this.id, that.id) && Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.name, that.name) && Objects.equals(this.newVersion, that.newVersion)
            && Objects.equals(this.portId, that.portId) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.region, that.region) && Objects.equals(this.remainDays, that.remainDays)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode) && Objects.equals(this.scene, that.scene)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.status, that.status)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.task, that.task)
            && Objects.equals(this.version, that.version) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.zone, that.zone) && Objects.equals(this.supportedFeature, that.supportedFeature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeModel,
            comment,
            configNum,
            connectIp,
            connectIpv6,
            cpu,
            created,
            databaseLimit,
            effect,
            expired,
            id,
            keepDays,
            name,
            newVersion,
            portId,
            ram,
            region,
            remainDays,
            resourceId,
            resourceSpecCode,
            scene,
            securityGroupId,
            specification,
            status,
            subnetId,
            task,
            version,
            vpcId,
            zone,
            supportedFeature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditInstanceBean {\n");
        sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    configNum: ").append(toIndentedString(configNum)).append("\n");
        sb.append("    connectIp: ").append(toIndentedString(connectIp)).append("\n");
        sb.append("    connectIpv6: ").append(toIndentedString(connectIpv6)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    databaseLimit: ").append(toIndentedString(databaseLimit)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    remainDays: ").append(toIndentedString(remainDays)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    supportedFeature: ").append(toIndentedString(supportedFeature)).append("\n");
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
