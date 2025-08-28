package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceBatchQueryRspDataResult
 */
public class InstanceBatchQueryRspDataResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_sku")

    private String instanceSku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_status")

    private Integer frozenStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_status")

    private Integer runningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_status")

    private Integer loginStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_status")

    private Integer assignStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_user")

    private String assignUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private String billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_name")

    private String memberName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name_en")

    private String regionNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_status")

    private Integer backupStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_time")

    private String backupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_status")

    private Integer restoreStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private String restoreTime;

    public InstanceBatchQueryRspDataResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceBatchQueryRspDataResult withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceBatchQueryRspDataResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域，cn-north-4
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceBatchQueryRspDataResult withInstanceSku(String instanceSku) {
        this.instanceSku = instanceSku;
        return this;
    }

    /**
     * 实例规格，如专业版 | 8 核 | 16GB | 10GB 存储 | 最高分辨率 720p
     * @return instanceSku
     */
    public String getInstanceSku() {
        return instanceSku;
    }

    public void setInstanceSku(String instanceSku) {
        this.instanceSku = instanceSku;
    }

    public InstanceBatchQueryRspDataResult withFrozenStatus(Integer frozenStatus) {
        this.frozenStatus = frozenStatus;
        return this;
    }

    /**
     * 冻结状态
     * @return frozenStatus
     */
    public Integer getFrozenStatus() {
        return frozenStatus;
    }

    public void setFrozenStatus(Integer frozenStatus) {
        this.frozenStatus = frozenStatus;
    }

    public InstanceBatchQueryRspDataResult withRunningStatus(Integer runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }

    /**
     * 运行状态
     * @return runningStatus
     */
    public Integer getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(Integer runningStatus) {
        this.runningStatus = runningStatus;
    }

    public InstanceBatchQueryRspDataResult withLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
        return this;
    }

    /**
     * Get loginStatus
     * @return loginStatus
     */
    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public InstanceBatchQueryRspDataResult withAssignStatus(Integer assignStatus) {
        this.assignStatus = assignStatus;
        return this;
    }

    /**
     * Get assignStatus
     * @return assignStatus
     */
    public Integer getAssignStatus() {
        return assignStatus;
    }

    public void setAssignStatus(Integer assignStatus) {
        this.assignStatus = assignStatus;
    }

    public InstanceBatchQueryRspDataResult withAssignUser(String assignUser) {
        this.assignUser = assignUser;
        return this;
    }

    /**
     * Get assignUser
     * @return assignUser
     */
    public String getAssignUser() {
        return assignUser;
    }

    public void setAssignUser(String assignUser) {
        this.assignUser = assignUser;
    }

    public InstanceBatchQueryRspDataResult withBillingMode(String billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * Get billingMode
     * @return billingMode
     */
    public String getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    public InstanceBatchQueryRspDataResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public InstanceBatchQueryRspDataResult withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get projectName
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public InstanceBatchQueryRspDataResult withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * Get phoneId
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public InstanceBatchQueryRspDataResult withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get memberName
     * @return memberName
     */
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public InstanceBatchQueryRspDataResult withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get accountName
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public InstanceBatchQueryRspDataResult withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Get regionName
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public InstanceBatchQueryRspDataResult withRegionNameEn(String regionNameEn) {
        this.regionNameEn = regionNameEn;
        return this;
    }

    /**
     * Get regionNameEn
     * @return regionNameEn
     */
    public String getRegionNameEn() {
        return regionNameEn;
    }

    public void setRegionNameEn(String regionNameEn) {
        this.regionNameEn = regionNameEn;
    }

    public InstanceBatchQueryRspDataResult withBackupStatus(Integer backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    /**
     * 备份状态（0:准备中；1:执行中；2:成功；3:失败；4:其他）
     * @return backupStatus
     */
    public Integer getBackupStatus() {
        return backupStatus;
    }

    public void setBackupStatus(Integer backupStatus) {
        this.backupStatus = backupStatus;
    }

    public InstanceBatchQueryRspDataResult withBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    /**
     * 备份状态 发生时间
     * @return backupTime
     */
    public String getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(String backupTime) {
        this.backupTime = backupTime;
    }

    public InstanceBatchQueryRspDataResult withRestoreStatus(Integer restoreStatus) {
        this.restoreStatus = restoreStatus;
        return this;
    }

    /**
     * 还原状态（0:准备中; 1:执行中；2:成功；3:失败;  4:其他）
     * @return restoreStatus
     */
    public Integer getRestoreStatus() {
        return restoreStatus;
    }

    public void setRestoreStatus(Integer restoreStatus) {
        this.restoreStatus = restoreStatus;
    }

    public InstanceBatchQueryRspDataResult withRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 还原状态 发生时间
     * @return restoreTime
     */
    public String getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceBatchQueryRspDataResult that = (InstanceBatchQueryRspDataResult) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.region, that.region) && Objects.equals(this.instanceSku, that.instanceSku)
            && Objects.equals(this.frozenStatus, that.frozenStatus)
            && Objects.equals(this.runningStatus, that.runningStatus)
            && Objects.equals(this.loginStatus, that.loginStatus)
            && Objects.equals(this.assignStatus, that.assignStatus) && Objects.equals(this.assignUser, that.assignUser)
            && Objects.equals(this.billingMode, that.billingMode) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.phoneId, that.phoneId)
            && Objects.equals(this.memberName, that.memberName) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.regionName, that.regionName) && Objects.equals(this.regionNameEn, that.regionNameEn)
            && Objects.equals(this.backupStatus, that.backupStatus) && Objects.equals(this.backupTime, that.backupTime)
            && Objects.equals(this.restoreStatus, that.restoreStatus)
            && Objects.equals(this.restoreTime, that.restoreTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            instanceName,
            region,
            instanceSku,
            frozenStatus,
            runningStatus,
            loginStatus,
            assignStatus,
            assignUser,
            billingMode,
            projectId,
            projectName,
            phoneId,
            memberName,
            accountName,
            regionName,
            regionNameEn,
            backupStatus,
            backupTime,
            restoreStatus,
            restoreTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBatchQueryRspDataResult {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    instanceSku: ").append(toIndentedString(instanceSku)).append("\n");
        sb.append("    frozenStatus: ").append(toIndentedString(frozenStatus)).append("\n");
        sb.append("    runningStatus: ").append(toIndentedString(runningStatus)).append("\n");
        sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
        sb.append("    assignStatus: ").append(toIndentedString(assignStatus)).append("\n");
        sb.append("    assignUser: ").append(toIndentedString(assignUser)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    memberName: ").append(toIndentedString(memberName)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    regionNameEn: ").append(toIndentedString(regionNameEn)).append("\n");
        sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
        sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
        sb.append("    restoreStatus: ").append(toIndentedString(restoreStatus)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
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
