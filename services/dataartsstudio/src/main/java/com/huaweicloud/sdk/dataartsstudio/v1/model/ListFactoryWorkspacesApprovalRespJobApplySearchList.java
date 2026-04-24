package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListFactoryWorkspacesApprovalRespJobApplySearchList
 */
public class ListFactoryWorkspacesApprovalRespJobApplySearchList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_approver")

    private String actualApprover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_id")

    private String applyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_msg")

    private String approvalMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private Integer approvalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_name")

    private String approverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private String changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_time")

    private Long submitTime;

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withActualApprover(String actualApprover) {
        this.actualApprover = actualApprover;
        return this;
    }

    /**
     * 当前审批人。
     * @return actualApprover
     */
    public String getActualApprover() {
        return actualApprover;
    }

    public void setActualApprover(String actualApprover) {
        this.actualApprover = actualApprover;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }

    /**
     * 审批单ID。
     * @return applyId
     */
    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withApprovalMsg(String approvalMsg) {
        this.approvalMsg = approvalMsg;
        return this;
    }

    /**
     * 审核信息。
     * @return approvalMsg
     */
    public String getApprovalMsg() {
        return approvalMsg;
    }

    public void setApprovalMsg(String approvalMsg) {
        this.approvalMsg = approvalMsg;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withApprovalTime(Integer approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 审批时间。
     * @return approvalTime
     */
    public Integer getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Integer approvalTime) {
        this.approvalTime = approvalTime;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }

    /**
     * 审批人。
     * @return approverName
     */
    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 作业或脚本变更类型：修改或者删除。
     * @return changeType
     */
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 申请人。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 审批对象ID。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 作业或者脚本名称。
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 审批对象类型：作业或者脚本。
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 审批状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListFactoryWorkspacesApprovalRespJobApplySearchList withSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * 审批提交时间。
     * @return submitTime
     */
    public Long getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryWorkspacesApprovalRespJobApplySearchList that =
            (ListFactoryWorkspacesApprovalRespJobApplySearchList) obj;
        return Objects.equals(this.actualApprover, that.actualApprover) && Objects.equals(this.applyId, that.applyId)
            && Objects.equals(this.approvalMsg, that.approvalMsg)
            && Objects.equals(this.approvalTime, that.approvalTime)
            && Objects.equals(this.approverName, that.approverName) && Objects.equals(this.changeType, that.changeType)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.objectName, that.objectName) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.submitTime, that.submitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualApprover,
            applyId,
            approvalMsg,
            approvalTime,
            approverName,
            changeType,
            createUser,
            objectId,
            objectName,
            objectType,
            status,
            submitTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryWorkspacesApprovalRespJobApplySearchList {\n");
        sb.append("    actualApprover: ").append(toIndentedString(actualApprover)).append("\n");
        sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
        sb.append("    approvalMsg: ").append(toIndentedString(approvalMsg)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    approverName: ").append(toIndentedString(approverName)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
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
