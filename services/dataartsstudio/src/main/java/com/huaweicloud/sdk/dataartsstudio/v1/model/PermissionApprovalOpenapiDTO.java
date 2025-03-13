package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PermissionApprovalOpenapiDTO
 */
public class PermissionApprovalOpenapiDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_dispatch_error_msg")

    private String approvalDispatchErrorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_dispatch_status")

    private String approvalDispatchStatus;

    /**
     * 申请类型, DATA_PERMISSION
     */
    public static final class ApprovalTypeEnum {

        /**
         * Enum DATA_PERMISSION for value: "DATA_PERMISSION"
         */
        public static final ApprovalTypeEnum DATA_PERMISSION = new ApprovalTypeEnum("DATA_PERMISSION");

        private static final Map<String, ApprovalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApprovalTypeEnum> createStaticFields() {
            Map<String, ApprovalTypeEnum> map = new HashMap<>();
            map.put("DATA_PERMISSION", DATA_PERMISSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApprovalTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ApprovalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApprovalTypeEnum(value));
        }

        public static ApprovalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApprovalTypeEnum) {
                return this.value.equals(((ApprovalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_type")

    private ApprovalTypeEnum approvalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_reason")

    private String approveReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_node_id")

    private String currentNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_node_name")

    private String currentNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_node_type")

    private String currentNodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private PermissionApprovalDetailDTO detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer_id")

    private String proposerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer_name")

    private String proposerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer_workspace_id")

    private String proposerWorkspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    /**
     * 工单状态, WAITING_APPROVE,APPROVED,REJECT,REVOKE
     */
    public static final class StatusEnum {

        /**
         * Enum WAITING_APPROVE for value: "WAITING_APPROVE"
         */
        public static final StatusEnum WAITING_APPROVE = new StatusEnum("WAITING_APPROVE");

        /**
         * Enum APPROVED for value: "APPROVED"
         */
        public static final StatusEnum APPROVED = new StatusEnum("APPROVED");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final StatusEnum REJECT = new StatusEnum("REJECT");

        /**
         * Enum REVOKE for value: "REVOKE"
         */
        public static final StatusEnum REVOKE = new StatusEnum("REVOKE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("WAITING_APPROVE", WAITING_APPROVE);
            map.put("APPROVED", APPROVED);
            map.put("REJECT", REJECT);
            map.put("REVOKE", REVOKE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    public PermissionApprovalOpenapiDTO withApprovalDispatchErrorMsg(String approvalDispatchErrorMsg) {
        this.approvalDispatchErrorMsg = approvalDispatchErrorMsg;
        return this;
    }

    /**
     * 审批外发失败消息
     * @return approvalDispatchErrorMsg
     */
    public String getApprovalDispatchErrorMsg() {
        return approvalDispatchErrorMsg;
    }

    public void setApprovalDispatchErrorMsg(String approvalDispatchErrorMsg) {
        this.approvalDispatchErrorMsg = approvalDispatchErrorMsg;
    }

    public PermissionApprovalOpenapiDTO withApprovalDispatchStatus(String approvalDispatchStatus) {
        this.approvalDispatchStatus = approvalDispatchStatus;
        return this;
    }

    /**
     * 审批外发状态，0表示成功，1表示失败，null表示非SMN节点
     * @return approvalDispatchStatus
     */
    public String getApprovalDispatchStatus() {
        return approvalDispatchStatus;
    }

    public void setApprovalDispatchStatus(String approvalDispatchStatus) {
        this.approvalDispatchStatus = approvalDispatchStatus;
    }

    public PermissionApprovalOpenapiDTO withApprovalType(ApprovalTypeEnum approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    /**
     * 申请类型, DATA_PERMISSION
     * @return approvalType
     */
    public ApprovalTypeEnum getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(ApprovalTypeEnum approvalType) {
        this.approvalType = approvalType;
    }

    public PermissionApprovalOpenapiDTO withApproveReason(String approveReason) {
        this.approveReason = approveReason;
        return this;
    }

    /**
     * 申请原因
     * @return approveReason
     */
    public String getApproveReason() {
        return approveReason;
    }

    public void setApproveReason(String approveReason) {
        this.approveReason = approveReason;
    }

    public PermissionApprovalOpenapiDTO withCurrentNodeId(String currentNodeId) {
        this.currentNodeId = currentNodeId;
        return this;
    }

    /**
     * 当前审批节点id
     * @return currentNodeId
     */
    public String getCurrentNodeId() {
        return currentNodeId;
    }

    public void setCurrentNodeId(String currentNodeId) {
        this.currentNodeId = currentNodeId;
    }

    public PermissionApprovalOpenapiDTO withCurrentNodeName(String currentNodeName) {
        this.currentNodeName = currentNodeName;
        return this;
    }

    /**
     * 当前审批节点审批人
     * @return currentNodeName
     */
    public String getCurrentNodeName() {
        return currentNodeName;
    }

    public void setCurrentNodeName(String currentNodeName) {
        this.currentNodeName = currentNodeName;
    }

    public PermissionApprovalOpenapiDTO withCurrentNodeType(String currentNodeType) {
        this.currentNodeType = currentNodeType;
        return this;
    }

    /**
     * 当前审批节点审批人类型
     * @return currentNodeType
     */
    public String getCurrentNodeType() {
        return currentNodeType;
    }

    public void setCurrentNodeType(String currentNodeType) {
        this.currentNodeType = currentNodeType;
    }

    public PermissionApprovalOpenapiDTO withDetail(PermissionApprovalDetailDTO detail) {
        this.detail = detail;
        return this;
    }

    public PermissionApprovalOpenapiDTO withDetail(Consumer<PermissionApprovalDetailDTO> detailSetter) {
        if (this.detail == null) {
            this.detail = new PermissionApprovalDetailDTO();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public PermissionApprovalDetailDTO getDetail() {
        return detail;
    }

    public void setDetail(PermissionApprovalDetailDTO detail) {
        this.detail = detail;
    }

    public PermissionApprovalOpenapiDTO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 工单结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public PermissionApprovalOpenapiDTO withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public PermissionApprovalOpenapiDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工单id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PermissionApprovalOpenapiDTO withInstanceId(String instanceId) {
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

    public PermissionApprovalOpenapiDTO withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 审批人所在权限集id
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public PermissionApprovalOpenapiDTO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PermissionApprovalOpenapiDTO withProposerId(String proposerId) {
        this.proposerId = proposerId;
        return this;
    }

    /**
     * 申请人id
     * @return proposerId
     */
    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId;
    }

    public PermissionApprovalOpenapiDTO withProposerName(String proposerName) {
        this.proposerName = proposerName;
        return this;
    }

    /**
     * 申请人名称
     * @return proposerName
     */
    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public PermissionApprovalOpenapiDTO withProposerWorkspaceId(String proposerWorkspaceId) {
        this.proposerWorkspaceId = proposerWorkspaceId;
        return this;
    }

    /**
     * 用户申请权限时所在工作空间id
     * @return proposerWorkspaceId
     */
    public String getProposerWorkspaceId() {
        return proposerWorkspaceId;
    }

    public void setProposerWorkspaceId(String proposerWorkspaceId) {
        this.proposerWorkspaceId = proposerWorkspaceId;
    }

    public PermissionApprovalOpenapiDTO withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 拒绝理由
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public PermissionApprovalOpenapiDTO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 工单开始时间
     * minimum: 1
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public PermissionApprovalOpenapiDTO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 工单状态, WAITING_APPROVE,APPROVED,REJECT,REVOKE
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PermissionApprovalOpenapiDTO withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public PermissionApprovalOpenapiDTO withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作空间名称
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionApprovalOpenapiDTO that = (PermissionApprovalOpenapiDTO) obj;
        return Objects.equals(this.approvalDispatchErrorMsg, that.approvalDispatchErrorMsg)
            && Objects.equals(this.approvalDispatchStatus, that.approvalDispatchStatus)
            && Objects.equals(this.approvalType, that.approvalType)
            && Objects.equals(this.approveReason, that.approveReason)
            && Objects.equals(this.currentNodeId, that.currentNodeId)
            && Objects.equals(this.currentNodeName, that.currentNodeName)
            && Objects.equals(this.currentNodeType, that.currentNodeType) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.proposerId, that.proposerId)
            && Objects.equals(this.proposerName, that.proposerName)
            && Objects.equals(this.proposerWorkspaceId, that.proposerWorkspaceId)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.workspaceName, that.workspaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalDispatchErrorMsg,
            approvalDispatchStatus,
            approvalType,
            approveReason,
            currentNodeId,
            currentNodeName,
            currentNodeType,
            detail,
            endTime,
            expireTime,
            id,
            instanceId,
            permissionSetId,
            projectId,
            proposerId,
            proposerName,
            proposerWorkspaceId,
            reason,
            startTime,
            status,
            workspaceId,
            workspaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionApprovalOpenapiDTO {\n");
        sb.append("    approvalDispatchErrorMsg: ").append(toIndentedString(approvalDispatchErrorMsg)).append("\n");
        sb.append("    approvalDispatchStatus: ").append(toIndentedString(approvalDispatchStatus)).append("\n");
        sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
        sb.append("    approveReason: ").append(toIndentedString(approveReason)).append("\n");
        sb.append("    currentNodeId: ").append(toIndentedString(currentNodeId)).append("\n");
        sb.append("    currentNodeName: ").append(toIndentedString(currentNodeName)).append("\n");
        sb.append("    currentNodeType: ").append(toIndentedString(currentNodeType)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    proposerId: ").append(toIndentedString(proposerId)).append("\n");
        sb.append("    proposerName: ").append(toIndentedString(proposerName)).append("\n");
        sb.append("    proposerWorkspaceId: ").append(toIndentedString(proposerWorkspaceId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
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
