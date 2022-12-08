package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CBH实例详情
 */
public class InstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_time")

    private String expTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_time")

    private String releaseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

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
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update")

    private String update;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createinstance_status")

    private String createinstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_key")

    private String instanceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private String periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bastion_type")

    private String bastionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alter_permit")

    private String alterPermit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_id")

    private String publicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bastion_version")

    private String bastionVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_bastion_version")

    private String newBastionVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_description")

    private String instanceDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    public InstanceDetail withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性ip
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public InstanceDetail withExpTime(String expTime) {
        this.expTime = expTime;
        return this;
    }

    /**
     * 过期时间，要求用UTC时间表示
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
     * 开始时间，要求用UTC时间表示
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
     * 结束时间，要求用UTC时间表示
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
     * 释放时间，要求用UTC时间表示
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
     * 实例名称
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
     * 实例的server id
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
     * 实例私有ip
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
     * 实例当前的任务状态
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
     * 实例状态
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
     * 实例创建时间，要求用UTC时间表示
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
     * 实例所在region
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
     * 实例所在可用区id
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
     * 实例所在可用区名称
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
     * 实例所在vpc的id
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
     * 实例所在子网的id
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
     * 实例所属的安全组的id
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
     * 实例规格
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
     * 实例镜像是否可以升级
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
     * 在创建实例过程中的过程状态信息
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
     * 创建实例失败原因
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
     * 实例ID
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
     * 订单id
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
     * 租户购买的时长
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
     * 实例的资源id
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
     * 堡垒机类型
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
     * 前端是否显示扩容按钮
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
     * 实例绑定的弹性IP的id
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
     * 实例镜像当前版本号
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
     * 实例镜像最新版本号
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
     * 实例状态
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
     * 实例描述
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return instanceDescription;
    }

    public void setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
    }

    public InstanceDetail withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否支持续费
     * minimum: 0
     * maximum: 100
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
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
        return Objects.equals(this.publicIp, instanceDetail.publicIp)
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
            && Objects.equals(this.isAutoRenew, instanceDetail.isAutoRenew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicIp,
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
            isAutoRenew);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetail {\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
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
