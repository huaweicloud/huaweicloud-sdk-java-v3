package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CBH实例详情
 */
public class InstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private String publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expTime")

    private String expTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseTime")

    private String releaseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceId")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateIp")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskStatus")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_display")

    private String availabilityZoneDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcId")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetId")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityGroupId")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update")

    private String update;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createinstanceStatus")

    private String createinstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failReason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceKey")

    private String instanceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderId")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private String periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bastion_type")

    private String bastionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alterPermit")

    private String alterPermit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicId")

    private String publicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bastionVersion")

    private String bastionVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newBastionVersion")

    private String newBastionVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceStatus")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceDescription")

    private String instanceDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slaveZone")

    private String slaveZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceType")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "haId")

    private String haId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slaveZoneDisplay")

    private String slaveZoneDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webPort")

    private String webPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip")

    private String vip;

    public InstanceDetail withPublicip(String publicip) {
        this.publicip = publicip;
        return this;
    }

    /**
     * 云堡垒机实例弹性公网IP，返回默认值null
     * @return publicip
     */
    public String getPublicip() {
        return publicip;
    }

    public void setPublicip(String publicip) {
        this.publicip = publicip;
    }

    public InstanceDetail withExpTime(String expTime) {
        this.expTime = expTime;
        return this;
    }

    /**
     * 云堡垒机实例过期时间。
     * @return expTime
     */
    public String getExpTime() {
        return expTime;
    }

    public void setExpTime(String expTime) {
        this.expTime = expTime;
    }

    public InstanceDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 云堡垒机实例开始时间，使用时间戳格式表示。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public InstanceDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 云堡垒机实例结束时间，使用时间戳格式表示。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public InstanceDetail withReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    /**
     * 云堡垒机释放时间，使用时间戳格式表示。
     * @return releaseTime
     */
    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public InstanceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云堡垒机实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceDetail withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 云堡垒机实例ID，UUID格式。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceDetail withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 云堡垒机实例私有ip。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public InstanceDetail withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 云堡垒机实例当前的任务状态。 - powering-on 开启 - powering-off 关闭 - rebooting 重启 - delete_wait 删除 - frozen 冻结 - NO_TASK 运行 - unfrozen 解冻 - alter 变更 - updating 升级中 - configuring-ha 配置HA
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public InstanceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 云堡垒机实例状态。 - SHUTOFF 已关闭 - ACTIVE 运行中 - DELETING 删除中 - BUILD 创建中 - DELETED 已删除 - ERROR 故障 - HAWAIT 等待备机创建成功 - FROZEN 已冻结 - UPGRADING 升级中 - UNPAID 待支付 - RESIZE 规格变更中 - DILATATION 扩容中 - HA 配置HA中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 云堡垒机实例创建时间，使用UTC时间表示。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public InstanceDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 云堡垒机实例所在局点。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceDetail withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 云堡垒机实例所在可用区。
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public InstanceDetail withAvailabilityZoneDisplay(String availabilityZoneDisplay) {
        this.availabilityZoneDisplay = availabilityZoneDisplay;
        return this;
    }

    /**
     * 云堡垒机实例所在可用区中文名称。
     * @return availabilityZoneDisplay
     */
    public String getAvailabilityZoneDisplay() {
        return availabilityZoneDisplay;
    }

    public void setAvailabilityZoneDisplay(String availabilityZoneDisplay) {
        this.availabilityZoneDisplay = availabilityZoneDisplay;
    }

    public InstanceDetail withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 云堡垒机实例所在虚拟私有云的VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceDetail withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 云堡垒机实例所在子网的ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceDetail withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 云堡垒机实例所属的安全组的ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public InstanceDetail withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 云堡垒机实例规格。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public InstanceDetail withUpdate(String update) {
        this.update = update;
        return this;
    }

    /**
     * 云堡垒机实例是否可以升级。 - NEW，可以升级 - OLD，不能升级
     * @return update
     */
    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public InstanceDetail withCreateinstanceStatus(String createinstanceStatus) {
        this.createinstanceStatus = createinstanceStatus;
        return this;
    }

    /**
     * 云堡垒机实例在创建实例过程中的过程状态信息。 - Waiting for payment，等待支付 - creating-network，创建网络 - creating-server，创建服务 - tranfering-horizontal-network，网络打通 - adding-policy-route，添加路由策略 - configing-dns，配置DNS - starting-cbs-service，服务运行中 - setting-init-conf，初始化 - buying-EIP，购买弹性公网IP
     * @return createinstanceStatus
     */
    public String getCreateinstanceStatus() {
        return createinstanceStatus;
    }

    public void setCreateinstanceStatus(String createinstanceStatus) {
        this.createinstanceStatus = createinstanceStatus;
    }

    public InstanceDetail withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 云堡垒机实例创建实例失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public InstanceDetail withInstanceKey(String instanceKey) {
        this.instanceKey = instanceKey;
        return this;
    }

    /**
     * 云堡垒机实例key。
     * @return instanceKey
     */
    public String getInstanceKey() {
        return instanceKey;
    }

    public void setInstanceKey(String instanceKey) {
        this.instanceKey = instanceKey;
    }

    public InstanceDetail withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public InstanceDetail withPeriodNum(String periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 云堡垒机实例订购周期数。
     * @return periodNum
     */
    public String getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(String periodNum) {
        this.periodNum = periodNum;
    }

    public InstanceDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 云堡垒机实例的资源id,UUID格式显示。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public InstanceDetail withBastionType(String bastionType) {
        this.bastionType = bastionType;
        return this;
    }

    /**
     * 云堡垒机实例堡垒机类型。 - OEM
     * @return bastionType
     */
    public String getBastionType() {
        return bastionType;
    }

    public void setBastionType(String bastionType) {
        this.bastionType = bastionType;
    }

    public InstanceDetail withAlterPermit(String alterPermit) {
        this.alterPermit = alterPermit;
        return this;
    }

    /**
     * 云堡垒机实例是否可以扩容。 - 1 开启扩容 - 0 关闭扩容
     * @return alterPermit
     */
    public String getAlterPermit() {
        return alterPermit;
    }

    public void setAlterPermit(String alterPermit) {
        this.alterPermit = alterPermit;
    }

    public InstanceDetail withPublicId(String publicId) {
        this.publicId = publicId;
        return this;
    }

    /**
     * 云堡垒机实例绑定公网的弹性IP的ID，UUID格式表示。
     * @return publicId
     */
    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public InstanceDetail withBastionVersion(String bastionVersion) {
        this.bastionVersion = bastionVersion;
        return this;
    }

    /**
     * 云堡垒机实例当前版本。
     * @return bastionVersion
     */
    public String getBastionVersion() {
        return bastionVersion;
    }

    public void setBastionVersion(String bastionVersion) {
        this.bastionVersion = bastionVersion;
    }

    public InstanceDetail withNewBastionVersion(String newBastionVersion) {
        this.newBastionVersion = newBastionVersion;
        return this;
    }

    /**
     * 云堡垒机实例可以升级的版本。
     * @return newBastionVersion
     */
    public String getNewBastionVersion() {
        return newBastionVersion;
    }

    public void setNewBastionVersion(String newBastionVersion) {
        this.newBastionVersion = newBastionVersion;
    }

    public InstanceDetail withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 云堡垒机实例状态。 - building  创建中 - deleting  删除中 - deleted 删除了 - unpaid  未支付 - upgrading 升级中 - resizing  扩容中 - abnormal  异常 - error 故障 - ok  正常
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public InstanceDetail withInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }

    /**
     * 云堡垒机实例状态描述。
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return instanceDescription;
    }

    public void setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
    }

    public InstanceDetail withSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
        return this;
    }

    /**
     * 备可用分区，默认返回null。
     * @return slaveZone
     */
    public String getSlaveZone() {
        return slaveZone;
    }

    public void setSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
    }

    public InstanceDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 云堡垒机实例所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceDetail withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 云堡垒机实例类型。 - null  单机默认返回null - master  HA时返回主机 - slave HA时返回备机
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceDetail withHaId(String haId) {
        this.haId = haId;
        return this;
    }

    /**
     * 云堡垒机实例主备ID。 - 单机堡垒机实例默认返回null - HA堡垒机实例返回主机HAID
     * @return haId
     */
    public String getHaId() {
        return haId;
    }

    public void setHaId(String haId) {
        this.haId = haId;
    }

    public InstanceDetail withSlaveZoneDisplay(String slaveZoneDisplay) {
        this.slaveZoneDisplay = slaveZoneDisplay;
        return this;
    }

    /**
     * 云堡垒机实例备机可用分区名称。 单机堡垒机实例和备机堡垒机实例返回null，HA堡垒机实例主机返回备机所在可用区名称。
     * @return slaveZoneDisplay
     */
    public String getSlaveZoneDisplay() {
        return slaveZoneDisplay;
    }

    public void setSlaveZoneDisplay(String slaveZoneDisplay) {
        this.slaveZoneDisplay = slaveZoneDisplay;
    }

    public InstanceDetail withWebPort(String webPort) {
        this.webPort = webPort;
        return this;
    }

    /**
     * 云堡垒机实例WEB界面访问的端口号。
     * @return webPort
     */
    public String getWebPort() {
        return webPort;
    }

    public void setWebPort(String webPort) {
        this.webPort = webPort;
    }

    public InstanceDetail withVip(String vip) {
        this.vip = vip;
        return this;
    }

    /**
     * 云堡垒机实例浮动ip。返回默认值null
     * @return vip
     */
    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceDetail instanceDetail = (InstanceDetail) o;
        return Objects.equals(this.publicip, instanceDetail.publicip)
            && Objects.equals(this.expTime, instanceDetail.expTime)
            && Objects.equals(this.startTime, instanceDetail.startTime)
            && Objects.equals(this.endTime, instanceDetail.endTime)
            && Objects.equals(this.releaseTime, instanceDetail.releaseTime)
            && Objects.equals(this.name, instanceDetail.name)
            && Objects.equals(this.instanceId, instanceDetail.instanceId)
            && Objects.equals(this.privateIp, instanceDetail.privateIp)
            && Objects.equals(this.taskStatus, instanceDetail.taskStatus)
            && Objects.equals(this.status, instanceDetail.status)
            && Objects.equals(this.created, instanceDetail.created)
            && Objects.equals(this.region, instanceDetail.region) && Objects.equals(this.zone, instanceDetail.zone)
            && Objects.equals(this.availabilityZoneDisplay, instanceDetail.availabilityZoneDisplay)
            && Objects.equals(this.vpcId, instanceDetail.vpcId)
            && Objects.equals(this.subnetId, instanceDetail.subnetId)
            && Objects.equals(this.securityGroupId, instanceDetail.securityGroupId)
            && Objects.equals(this.specification, instanceDetail.specification)
            && Objects.equals(this.update, instanceDetail.update)
            && Objects.equals(this.createinstanceStatus, instanceDetail.createinstanceStatus)
            && Objects.equals(this.failReason, instanceDetail.failReason)
            && Objects.equals(this.instanceKey, instanceDetail.instanceKey)
            && Objects.equals(this.orderId, instanceDetail.orderId)
            && Objects.equals(this.periodNum, instanceDetail.periodNum)
            && Objects.equals(this.resourceId, instanceDetail.resourceId)
            && Objects.equals(this.bastionType, instanceDetail.bastionType)
            && Objects.equals(this.alterPermit, instanceDetail.alterPermit)
            && Objects.equals(this.publicId, instanceDetail.publicId)
            && Objects.equals(this.bastionVersion, instanceDetail.bastionVersion)
            && Objects.equals(this.newBastionVersion, instanceDetail.newBastionVersion)
            && Objects.equals(this.instanceStatus, instanceDetail.instanceStatus)
            && Objects.equals(this.instanceDescription, instanceDetail.instanceDescription)
            && Objects.equals(this.slaveZone, instanceDetail.slaveZone)
            && Objects.equals(this.enterpriseProjectId, instanceDetail.enterpriseProjectId)
            && Objects.equals(this.instanceType, instanceDetail.instanceType)
            && Objects.equals(this.haId, instanceDetail.haId)
            && Objects.equals(this.slaveZoneDisplay, instanceDetail.slaveZoneDisplay)
            && Objects.equals(this.webPort, instanceDetail.webPort) && Objects.equals(this.vip, instanceDetail.vip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip,
            expTime,
            startTime,
            endTime,
            releaseTime,
            name,
            instanceId,
            privateIp,
            taskStatus,
            status,
            created,
            region,
            zone,
            availabilityZoneDisplay,
            vpcId,
            subnetId,
            securityGroupId,
            specification,
            update,
            createinstanceStatus,
            failReason,
            instanceKey,
            orderId,
            periodNum,
            resourceId,
            bastionType,
            alterPermit,
            publicId,
            bastionVersion,
            newBastionVersion,
            instanceStatus,
            instanceDescription,
            slaveZone,
            enterpriseProjectId,
            instanceType,
            haId,
            slaveZoneDisplay,
            webPort,
            vip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetail {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    expTime: ").append(toIndentedString(expTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    availabilityZoneDisplay: ").append(toIndentedString(availabilityZoneDisplay)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    update: ").append(toIndentedString(update)).append("\n");
        sb.append("    createinstanceStatus: ").append(toIndentedString(createinstanceStatus)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    instanceKey: ").append(toIndentedString(instanceKey)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    bastionType: ").append(toIndentedString(bastionType)).append("\n");
        sb.append("    alterPermit: ").append(toIndentedString(alterPermit)).append("\n");
        sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
        sb.append("    bastionVersion: ").append(toIndentedString(bastionVersion)).append("\n");
        sb.append("    newBastionVersion: ").append(toIndentedString(newBastionVersion)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    instanceDescription: ").append(toIndentedString(instanceDescription)).append("\n");
        sb.append("    slaveZone: ").append(toIndentedString(slaveZone)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    haId: ").append(toIndentedString(haId)).append("\n");
        sb.append("    slaveZoneDisplay: ").append(toIndentedString(slaveZoneDisplay)).append("\n");
        sb.append("    webPort: ").append(toIndentedString(webPort)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
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
