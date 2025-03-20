package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 定时运维基本信息
 */
public class ScheduledTaskBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private String scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_type")

    private String associatedTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_name")

    private String createdUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private String reviewer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_user_name")

    private String reviewerUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_status")

    private Object approveStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_time")

    private Long lastExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_status")

    private String lastExecutionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_count")

    private Integer executionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private Long modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name")

    private String associatedTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name_en")

    private String associatedTaskNameEn;

    public ScheduledTaskBasicInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduledTaskBasicInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ScheduledTaskBasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScheduledTaskBasicInfo withScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 定时类型
     * @return scheduledType
     */
    public String getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
    }

    public ScheduledTaskBasicInfo withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 引用任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ScheduledTaskBasicInfo withAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
        return this;
    }

    /**
     * 关联的任务类型
     * @return associatedTaskType
     */
    public String getAssociatedTaskType() {
        return associatedTaskType;
    }

    public void setAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
    }

    public ScheduledTaskBasicInfo withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ScheduledTaskBasicInfo withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ScheduledTaskBasicInfo withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 修改人
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public ScheduledTaskBasicInfo withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    /**
     * 创建人昵称
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public ScheduledTaskBasicInfo withReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 审批人
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public ScheduledTaskBasicInfo withReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
        return this;
    }

    /**
     * 审批人昵称
     * @return reviewerUserName
     */
    public String getReviewerUserName() {
        return reviewerUserName;
    }

    public void setReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
    }

    public ScheduledTaskBasicInfo withApproveStatus(Object approveStatus) {
        this.approveStatus = approveStatus;
        return this;
    }

    /**
     * 审批状态
     * @return approveStatus
     */
    public Object getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Object approveStatus) {
        this.approveStatus = approveStatus;
    }

    public ScheduledTaskBasicInfo withLastExecutionTime(Long lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
        return this;
    }

    /**
     * 最近执行时间时间戳
     * @return lastExecutionTime
     */
    public Long getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(Long lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public ScheduledTaskBasicInfo withLastExecutionStatus(String lastExecutionStatus) {
        this.lastExecutionStatus = lastExecutionStatus;
        return this;
    }

    /**
     * 最近执行状态
     * @return lastExecutionStatus
     */
    public String getLastExecutionStatus() {
        return lastExecutionStatus;
    }

    public void setLastExecutionStatus(String lastExecutionStatus) {
        this.lastExecutionStatus = lastExecutionStatus;
    }

    public ScheduledTaskBasicInfo withExecutionCount(Integer executionCount) {
        this.executionCount = executionCount;
        return this;
    }

    /**
     * 执行次数
     * @return executionCount
     */
    public Integer getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(Integer executionCount) {
        this.executionCount = executionCount;
    }

    public ScheduledTaskBasicInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ScheduledTaskBasicInfo withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public ScheduledTaskBasicInfo withModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 更新时间
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public ScheduledTaskBasicInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ScheduledTaskBasicInfo withAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
        return this;
    }

    /**
     * 脚本/作业名称
     * @return associatedTaskName
     */
    public String getAssociatedTaskName() {
        return associatedTaskName;
    }

    public void setAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
    }

    public ScheduledTaskBasicInfo withAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
        return this;
    }

    /**
     * 脚本/作业名称(英文)
     * @return associatedTaskNameEn
     */
    public String getAssociatedTaskNameEn() {
        return associatedTaskNameEn;
    }

    public void setAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTaskBasicInfo that = (ScheduledTaskBasicInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.associatedTaskType, that.associatedTaskType)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.createdUserName, that.createdUserName)
            && Objects.equals(this.reviewer, that.reviewer)
            && Objects.equals(this.reviewerUserName, that.reviewerUserName)
            && Objects.equals(this.approveStatus, that.approveStatus)
            && Objects.equals(this.lastExecutionTime, that.lastExecutionTime)
            && Objects.equals(this.lastExecutionStatus, that.lastExecutionStatus)
            && Objects.equals(this.executionCount, that.executionCount) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.associatedTaskName, that.associatedTaskName)
            && Objects.equals(this.associatedTaskNameEn, that.associatedTaskNameEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            enterpriseProjectId,
            name,
            scheduledType,
            taskType,
            associatedTaskType,
            riskLevel,
            createdBy,
            updateBy,
            createdUserName,
            reviewer,
            reviewerUserName,
            approveStatus,
            lastExecutionTime,
            lastExecutionStatus,
            executionCount,
            enabled,
            createdTime,
            modifiedTime,
            regionId,
            associatedTaskName,
            associatedTaskNameEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTaskBasicInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    associatedTaskType: ").append(toIndentedString(associatedTaskType)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    reviewerUserName: ").append(toIndentedString(reviewerUserName)).append("\n");
        sb.append("    approveStatus: ").append(toIndentedString(approveStatus)).append("\n");
        sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
        sb.append("    lastExecutionStatus: ").append(toIndentedString(lastExecutionStatus)).append("\n");
        sb.append("    executionCount: ").append(toIndentedString(executionCount)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    associatedTaskName: ").append(toIndentedString(associatedTaskName)).append("\n");
        sb.append("    associatedTaskNameEn: ").append(toIndentedString(associatedTaskNameEn)).append("\n");
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
