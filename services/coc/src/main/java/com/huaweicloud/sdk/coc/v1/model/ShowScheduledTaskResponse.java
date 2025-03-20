package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowScheduledTaskResponse extends SdkResponse {

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
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private TriggerTime triggerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_no")

    private String versionNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private Object taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_id")

    private String associatedTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name")

    private String associatedTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name_en")

    private String associatedTaskNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_type")

    private String associatedTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runbook_instance_mode")

    private String runbookInstanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_param")

    private String inputParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_approve")

    private Boolean enableApprove;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_notification")

    private MessageNotification reviewerNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_name")

    private String createdUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_user_name")

    private String reviewerUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_status")

    private Object approveStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_comments")

    private String approveComments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instances")

    private String targetInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_message_notification")

    private Boolean enableMessageNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_notification")

    private MessageNotification messageNotification;

    public ShowScheduledTaskResponse withId(String id) {
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

    public ShowScheduledTaskResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowScheduledTaskResponse withName(String name) {
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

    public ShowScheduledTaskResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ShowScheduledTaskResponse withTriggerTime(TriggerTime triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    public ShowScheduledTaskResponse withTriggerTime(Consumer<TriggerTime> triggerTimeSetter) {
        if (this.triggerTime == null) {
            this.triggerTime = new TriggerTime();
            triggerTimeSetter.accept(this.triggerTime);
        }

        return this;
    }

    /**
     * Get triggerTime
     * @return triggerTime
     */
    public TriggerTime getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(TriggerTime triggerTime) {
        this.triggerTime = triggerTime;
    }

    public ShowScheduledTaskResponse withVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }

    /**
     * 版本号
     * @return versionNo
     */
    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public ShowScheduledTaskResponse withTaskType(Object taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型
     * @return taskType
     */
    public Object getTaskType() {
        return taskType;
    }

    public void setTaskType(Object taskType) {
        this.taskType = taskType;
    }

    public ShowScheduledTaskResponse withAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
        return this;
    }

    /**
     * 关联任务ID（脚本ID/作业ID）
     * @return associatedTaskId
     */
    public String getAssociatedTaskId() {
        return associatedTaskId;
    }

    public void setAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
    }

    public ShowScheduledTaskResponse withAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
        return this;
    }

    /**
     * 关联任务名称（脚本名称/作业名称）
     * @return associatedTaskName
     */
    public String getAssociatedTaskName() {
        return associatedTaskName;
    }

    public void setAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
    }

    public ShowScheduledTaskResponse withAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
        return this;
    }

    /**
     * 关联任务名称(英文)（脚本名称/作业名称）
     * @return associatedTaskNameEn
     */
    public String getAssociatedTaskNameEn() {
        return associatedTaskNameEn;
    }

    public void setAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
    }

    public ShowScheduledTaskResponse withAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
        return this;
    }

    /**
     * 关联任务的类型
     * @return associatedTaskType
     */
    public String getAssociatedTaskType() {
        return associatedTaskType;
    }

    public void setAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
    }

    public ShowScheduledTaskResponse withRunbookInstanceMode(String runbookInstanceMode) {
        this.runbookInstanceMode = runbookInstanceMode;
        return this;
    }

    /**
     * 作业实例模式
     * @return runbookInstanceMode
     */
    public String getRunbookInstanceMode() {
        return runbookInstanceMode;
    }

    public void setRunbookInstanceMode(String runbookInstanceMode) {
        this.runbookInstanceMode = runbookInstanceMode;
    }

    public ShowScheduledTaskResponse withRiskLevel(String riskLevel) {
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

    public ShowScheduledTaskResponse withInputParam(String inputParam) {
        this.inputParam = inputParam;
        return this;
    }

    /**
     * 执行参数，值为json串
     * @return inputParam
     */
    public String getInputParam() {
        return inputParam;
    }

    public void setInputParam(String inputParam) {
        this.inputParam = inputParam;
    }

    public ShowScheduledTaskResponse withEnableApprove(Boolean enableApprove) {
        this.enableApprove = enableApprove;
        return this;
    }

    /**
     * 是否开启入库人工审核
     * @return enableApprove
     */
    public Boolean getEnableApprove() {
        return enableApprove;
    }

    public void setEnableApprove(Boolean enableApprove) {
        this.enableApprove = enableApprove;
    }

    public ShowScheduledTaskResponse withReviewerNotification(MessageNotification reviewerNotification) {
        this.reviewerNotification = reviewerNotification;
        return this;
    }

    public ShowScheduledTaskResponse withReviewerNotification(
        Consumer<MessageNotification> reviewerNotificationSetter) {
        if (this.reviewerNotification == null) {
            this.reviewerNotification = new MessageNotification();
            reviewerNotificationSetter.accept(this.reviewerNotification);
        }

        return this;
    }

    /**
     * Get reviewerNotification
     * @return reviewerNotification
     */
    public MessageNotification getReviewerNotification() {
        return reviewerNotification;
    }

    public void setReviewerNotification(MessageNotification reviewerNotification) {
        this.reviewerNotification = reviewerNotification;
    }

    public ShowScheduledTaskResponse withCreatedUserName(String createdUserName) {
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

    public ShowScheduledTaskResponse withReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
        return this;
    }

    /**
     * 审核人昵称
     * @return reviewerUserName
     */
    public String getReviewerUserName() {
        return reviewerUserName;
    }

    public void setReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
    }

    public ShowScheduledTaskResponse withApproveStatus(Object approveStatus) {
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

    public ShowScheduledTaskResponse withApproveComments(String approveComments) {
        this.approveComments = approveComments;
        return this;
    }

    /**
     * 审批意见
     * @return approveComments
     */
    public String getApproveComments() {
        return approveComments;
    }

    public void setApproveComments(String approveComments) {
        this.approveComments = approveComments;
    }

    public ShowScheduledTaskResponse withTargetInstances(String targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    /**
     * 目标节点json串
     * @return targetInstances
     */
    public String getTargetInstances() {
        return targetInstances;
    }

    public void setTargetInstances(String targetInstances) {
        this.targetInstances = targetInstances;
    }

    public ShowScheduledTaskResponse withEnableMessageNotification(Boolean enableMessageNotification) {
        this.enableMessageNotification = enableMessageNotification;
        return this;
    }

    /**
     * 是否启用消息通知
     * @return enableMessageNotification
     */
    public Boolean getEnableMessageNotification() {
        return enableMessageNotification;
    }

    public void setEnableMessageNotification(Boolean enableMessageNotification) {
        this.enableMessageNotification = enableMessageNotification;
    }

    public ShowScheduledTaskResponse withMessageNotification(MessageNotification messageNotification) {
        this.messageNotification = messageNotification;
        return this;
    }

    public ShowScheduledTaskResponse withMessageNotification(Consumer<MessageNotification> messageNotificationSetter) {
        if (this.messageNotification == null) {
            this.messageNotification = new MessageNotification();
            messageNotificationSetter.accept(this.messageNotification);
        }

        return this;
    }

    /**
     * Get messageNotification
     * @return messageNotification
     */
    public MessageNotification getMessageNotification() {
        return messageNotification;
    }

    public void setMessageNotification(MessageNotification messageNotification) {
        this.messageNotification = messageNotification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScheduledTaskResponse that = (ShowScheduledTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.triggerTime, that.triggerTime) && Objects.equals(this.versionNo, that.versionNo)
            && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.associatedTaskId, that.associatedTaskId)
            && Objects.equals(this.associatedTaskName, that.associatedTaskName)
            && Objects.equals(this.associatedTaskNameEn, that.associatedTaskNameEn)
            && Objects.equals(this.associatedTaskType, that.associatedTaskType)
            && Objects.equals(this.runbookInstanceMode, that.runbookInstanceMode)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.inputParam, that.inputParam)
            && Objects.equals(this.enableApprove, that.enableApprove)
            && Objects.equals(this.reviewerNotification, that.reviewerNotification)
            && Objects.equals(this.createdUserName, that.createdUserName)
            && Objects.equals(this.reviewerUserName, that.reviewerUserName)
            && Objects.equals(this.approveStatus, that.approveStatus)
            && Objects.equals(this.approveComments, that.approveComments)
            && Objects.equals(this.targetInstances, that.targetInstances)
            && Objects.equals(this.enableMessageNotification, that.enableMessageNotification)
            && Objects.equals(this.messageNotification, that.messageNotification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            enterpriseProjectId,
            name,
            agencyName,
            triggerTime,
            versionNo,
            taskType,
            associatedTaskId,
            associatedTaskName,
            associatedTaskNameEn,
            associatedTaskType,
            runbookInstanceMode,
            riskLevel,
            inputParam,
            enableApprove,
            reviewerNotification,
            createdUserName,
            reviewerUserName,
            approveStatus,
            approveComments,
            targetInstances,
            enableMessageNotification,
            messageNotification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScheduledTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
        sb.append("    versionNo: ").append(toIndentedString(versionNo)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    associatedTaskId: ").append(toIndentedString(associatedTaskId)).append("\n");
        sb.append("    associatedTaskName: ").append(toIndentedString(associatedTaskName)).append("\n");
        sb.append("    associatedTaskNameEn: ").append(toIndentedString(associatedTaskNameEn)).append("\n");
        sb.append("    associatedTaskType: ").append(toIndentedString(associatedTaskType)).append("\n");
        sb.append("    runbookInstanceMode: ").append(toIndentedString(runbookInstanceMode)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    inputParam: ").append(toIndentedString(inputParam)).append("\n");
        sb.append("    enableApprove: ").append(toIndentedString(enableApprove)).append("\n");
        sb.append("    reviewerNotification: ").append(toIndentedString(reviewerNotification)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    reviewerUserName: ").append(toIndentedString(reviewerUserName)).append("\n");
        sb.append("    approveStatus: ").append(toIndentedString(approveStatus)).append("\n");
        sb.append("    approveComments: ").append(toIndentedString(approveComments)).append("\n");
        sb.append("    targetInstances: ").append(toIndentedString(targetInstances)).append("\n");
        sb.append("    enableMessageNotification: ").append(toIndentedString(enableMessageNotification)).append("\n");
        sb.append("    messageNotification: ").append(toIndentedString(messageNotification)).append("\n");
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
