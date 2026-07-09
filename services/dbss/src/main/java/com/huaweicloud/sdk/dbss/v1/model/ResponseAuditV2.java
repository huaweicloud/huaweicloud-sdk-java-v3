package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponseAuditV2
 */
public class ResponseAuditV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_db_type")

    private String bindingDbType;

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
    @JsonProperty(value = "connectIpv6")

    private String connectIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_ip")

    private String connectIp;

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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired")

    private String expired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

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
    @JsonProperty(value = "supported_feature")

    private List<String> supportedFeature = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private String task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_log")

    private String upgradeLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    public ResponseAuditV2 withBindingDbType(String bindingDbType) {
        this.bindingDbType = bindingDbType;
        return this;
    }

    /**
     * 绑定数据库类型
     * @return bindingDbType
     */
    public String getBindingDbType() {
        return bindingDbType;
    }

    public void setBindingDbType(String bindingDbType) {
        this.bindingDbType = bindingDbType;
    }

    public ResponseAuditV2 withChargeModel(String chargeModel) {
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

    public ResponseAuditV2 withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ResponseAuditV2 withConfigNum(Integer configNum) {
        this.configNum = configNum;
        return this;
    }

    /**
     * 已配置数据库数量
     * @return configNum
     */
    public Integer getConfigNum() {
        return configNum;
    }

    public void setConfigNum(Integer configNum) {
        this.configNum = configNum;
    }

    public ResponseAuditV2 withConnectIpv6(String connectIpv6) {
        this.connectIpv6 = connectIpv6;
        return this;
    }

    /**
     * IPV6
     * @return connectIpv6
     */
    public String getConnectIpv6() {
        return connectIpv6;
    }

    public void setConnectIpv6(String connectIpv6) {
        this.connectIpv6 = connectIpv6;
    }

    public ResponseAuditV2 withConnectIp(String connectIp) {
        this.connectIp = connectIp;
        return this;
    }

    /**
     * IPV4
     * @return connectIp
     */
    public String getConnectIp() {
        return connectIp;
    }

    public void setConnectIp(String connectIp) {
        this.connectIp = connectIp;
    }

    public ResponseAuditV2 withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU数量
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ResponseAuditV2 withCreated(String created) {
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

    public ResponseAuditV2 withDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
        return this;
    }

    /**
     * 数据库数量限额
     * @return databaseLimit
     */
    public Integer getDatabaseLimit() {
        return databaseLimit;
    }

    public void setDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
    }

    public ResponseAuditV2 withEffect(Integer effect) {
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

    public ResponseAuditV2 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ResponseAuditV2 withExpired(String expired) {
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

    public ResponseAuditV2 withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ResponseAuditV2 withInstanceId(String instanceId) {
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

    public ResponseAuditV2 withKeepDays(String keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 在线天数
     * @return keepDays
     */
    public String getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(String keepDays) {
        this.keepDays = keepDays;
    }

    public ResponseAuditV2 withName(String name) {
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

    public ResponseAuditV2 withNewVersion(String newVersion) {
        this.newVersion = newVersion;
        return this;
    }

    /**
     * 最新版本
     * @return newVersion
     */
    public String getNewVersion() {
        return newVersion;
    }

    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    public ResponseAuditV2 withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 端口ID
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public ResponseAuditV2 withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public ResponseAuditV2 withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 所属区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ResponseAuditV2 withRemainDays(String remainDays) {
        this.remainDays = remainDays;
        return this;
    }

    /**
     * 剩余天数
     * @return remainDays
     */
    public String getRemainDays() {
        return remainDays;
    }

    public void setRemainDays(String remainDays) {
        this.remainDays = remainDays;
    }

    public ResponseAuditV2 withResourceId(String resourceId) {
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

    public ResponseAuditV2 withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ResponseAuditV2 withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 冻结场景  - POLICE: 公安冻结  - ILLEGAL: 违规冻结  - VERIFY: 未实名认证冻结  - PARTNER: 合作伙伴冻结 - ARREARS: 普通冻结（普通）
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public ResponseAuditV2 withSecurityGroupId(String securityGroupId) {
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

    public ResponseAuditV2 withSpecification(String specification) {
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

    public ResponseAuditV2 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态  - SHUTOFF: 已关闭  - ACTIVE: 运行中，允许任何操作   - DELETING: 删除中，不允许任何操作  - BUILD: 创建中，不允许任何操作  - DELETED: 已删除，不需要展示  - ERROR: 故障，只允许删除  - HAWAIT: 等待备机创建成功，不允许任何操作  - FROZEN: 已冻结，只允许续费、绑定/解绑  - UPGRADING: 升级中，不允许升级操作
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResponseAuditV2 withSubnetId(String subnetId) {
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

    public ResponseAuditV2 withSupportedFeature(List<String> supportedFeature) {
        this.supportedFeature = supportedFeature;
        return this;
    }

    public ResponseAuditV2 addSupportedFeatureItem(String supportedFeatureItem) {
        if (this.supportedFeature == null) {
            this.supportedFeature = new ArrayList<>();
        }
        this.supportedFeature.add(supportedFeatureItem);
        return this;
    }

    public ResponseAuditV2 withSupportedFeature(Consumer<List<String>> supportedFeatureSetter) {
        if (this.supportedFeature == null) {
            this.supportedFeature = new ArrayList<>();
        }
        supportedFeatureSetter.accept(this.supportedFeature);
        return this;
    }

    /**
     * 功能列表
     * @return supportedFeature
     */
    public List<String> getSupportedFeature() {
        return supportedFeature;
    }

    public void setSupportedFeature(List<String> supportedFeature) {
        this.supportedFeature = supportedFeature;
    }

    public ResponseAuditV2 withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * 任务状态  - powering-on: 正在开启，实例可以绑定、解绑  - powering-off: 正在关闭，实例可以绑定、解绑  - rebooting: 正在重启，实例可以绑定、解绑  - delete_wait: 等待删除，集群与实例不允许任何操作  - NO_TASK: 不展示
     * @return task
     */
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public ResponseAuditV2 withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 时区
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ResponseAuditV2 withUpgradeLog(String upgradeLog) {
        this.upgradeLog = upgradeLog;
        return this;
    }

    /**
     * 升级日志
     * @return upgradeLog
     */
    public String getUpgradeLog() {
        return upgradeLog;
    }

    public void setUpgradeLog(String upgradeLog) {
        this.upgradeLog = upgradeLog;
    }

    public ResponseAuditV2 withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 实例版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ResponseAuditV2 withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ResponseAuditV2 withZone(String zone) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseAuditV2 that = (ResponseAuditV2) obj;
        return Objects.equals(this.bindingDbType, that.bindingDbType)
            && Objects.equals(this.chargeModel, that.chargeModel) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.configNum, that.configNum) && Objects.equals(this.connectIpv6, that.connectIpv6)
            && Objects.equals(this.connectIp, that.connectIp) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.created, that.created) && Objects.equals(this.databaseLimit, that.databaseLimit)
            && Objects.equals(this.effect, that.effect)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.expired, that.expired) && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.name, that.name) && Objects.equals(this.newVersion, that.newVersion)
            && Objects.equals(this.portId, that.portId) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.region, that.region) && Objects.equals(this.remainDays, that.remainDays)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode) && Objects.equals(this.scene, that.scene)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.status, that.status)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.supportedFeature, that.supportedFeature) && Objects.equals(this.task, that.task)
            && Objects.equals(this.timezone, that.timezone) && Objects.equals(this.upgradeLog, that.upgradeLog)
            && Objects.equals(this.version, that.version) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.zone, that.zone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindingDbType,
            chargeModel,
            comment,
            configNum,
            connectIpv6,
            connectIp,
            cpu,
            created,
            databaseLimit,
            effect,
            enterpriseProjectId,
            expired,
            failedReason,
            instanceId,
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
            supportedFeature,
            task,
            timezone,
            upgradeLog,
            version,
            vpcId,
            zone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseAuditV2 {\n");
        sb.append("    bindingDbType: ").append(toIndentedString(bindingDbType)).append("\n");
        sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    configNum: ").append(toIndentedString(configNum)).append("\n");
        sb.append("    connectIpv6: ").append(toIndentedString(connectIpv6)).append("\n");
        sb.append("    connectIp: ").append(toIndentedString(connectIp)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    databaseLimit: ").append(toIndentedString(databaseLimit)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
        sb.append("    supportedFeature: ").append(toIndentedString(supportedFeature)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    upgradeLog: ").append(toIndentedString(upgradeLog)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
