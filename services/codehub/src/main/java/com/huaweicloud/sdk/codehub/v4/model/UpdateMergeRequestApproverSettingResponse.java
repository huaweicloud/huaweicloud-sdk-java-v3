package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateMergeRequestApproverSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    /**
     * 设置类型，当前仅开放branch类型
     */
    public static final class TargetTypeEnum {

        /**
         * Enum BRANCH for value: "branch"
         */
        public static final TargetTypeEnum BRANCH = new TargetTypeEnum("branch");

        /**
         * Enum FILE for value: "file"
         */
        public static final TargetTypeEnum FILE = new TargetTypeEnum("file");

        /**
         * Enum BINARY for value: "binary"
         */
        public static final TargetTypeEnum BINARY = new TargetTypeEnum("binary");

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("branch", BRANCH);
            map.put("file", FILE);
            map.put("binary", BINARY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetTypeEnum(value));
        }

        public static TargetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetTypeEnum) {
                return this.value.equals(((TargetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private TargetTypeEnum targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_use_approval")

    private Boolean isUseApproval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_required_reviewers")

    private Integer approvalRequiredReviewers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_required_approvers")

    private Integer approvalRequiredApprovers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_approvals_on_push")

    private Boolean resetApprovalsOnPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_reviewers_on_push")

    private Boolean resetReviewersOnPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers_from_project")

    private Boolean approversFromProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "append_reviewer_ids")

    private List<Integer> appendReviewerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "append_reviewers")

    private List<UserBasicDto> appendReviewers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "append_approver_ids")

    private List<Integer> appendApproverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "append_approvers")

    private List<UserBasicDto> appendApprovers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_merge_when_pipeline_pass")

    private Boolean onlyMergeWhenPipelinePass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_ids")

    private List<Integer> assigneeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignees")

    private List<UserBasicDto> assignees = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_ids")

    private List<Integer> approverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<UserBasicDto> approvers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_ids")

    private List<Integer> reviewerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewers")

    private List<UserBasicDto> reviewers = null;

    public UpdateMergeRequestApproverSettingResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  设置主键id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateMergeRequestApproverSettingResponse withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * **参数解释：**  分支，可使用*作为通配符使用，如：dev* 指以dev开头的所有分支
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public UpdateMergeRequestApproverSettingResponse withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 设置类型，当前仅开放branch类型
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public UpdateMergeRequestApproverSettingResponse withIsUseApproval(Boolean isUseApproval) {
        this.isUseApproval = isUseApproval;
        return this;
    }

    /**
     * 是否为审核模式，审核模式：true 评分模式：false
     * @return isUseApproval
     */
    public Boolean getIsUseApproval() {
        return isUseApproval;
    }

    public void setIsUseApproval(Boolean isUseApproval) {
        this.isUseApproval = isUseApproval;
    }

    public UpdateMergeRequestApproverSettingResponse withApprovalRequiredReviewers(Integer approvalRequiredReviewers) {
        this.approvalRequiredReviewers = approvalRequiredReviewers;
        return this;
    }

    /**
     * 最小检视人数
     * @return approvalRequiredReviewers
     */
    public Integer getApprovalRequiredReviewers() {
        return approvalRequiredReviewers;
    }

    public void setApprovalRequiredReviewers(Integer approvalRequiredReviewers) {
        this.approvalRequiredReviewers = approvalRequiredReviewers;
    }

    public UpdateMergeRequestApproverSettingResponse withApprovalRequiredApprovers(Integer approvalRequiredApprovers) {
        this.approvalRequiredApprovers = approvalRequiredApprovers;
        return this;
    }

    /**
     * 最小审核人数
     * @return approvalRequiredApprovers
     */
    public Integer getApprovalRequiredApprovers() {
        return approvalRequiredApprovers;
    }

    public void setApprovalRequiredApprovers(Integer approvalRequiredApprovers) {
        this.approvalRequiredApprovers = approvalRequiredApprovers;
    }

    public UpdateMergeRequestApproverSettingResponse withResetApprovalsOnPush(Boolean resetApprovalsOnPush) {
        this.resetApprovalsOnPush = resetApprovalsOnPush;
        return this;
    }

    /**
     * 推送时是否重置审核门禁状态
     * @return resetApprovalsOnPush
     */
    public Boolean getResetApprovalsOnPush() {
        return resetApprovalsOnPush;
    }

    public void setResetApprovalsOnPush(Boolean resetApprovalsOnPush) {
        this.resetApprovalsOnPush = resetApprovalsOnPush;
    }

    public UpdateMergeRequestApproverSettingResponse withResetReviewersOnPush(Boolean resetReviewersOnPush) {
        this.resetReviewersOnPush = resetReviewersOnPush;
        return this;
    }

    /**
     * 推送时是否重置检视门禁状态
     * @return resetReviewersOnPush
     */
    public Boolean getResetReviewersOnPush() {
        return resetReviewersOnPush;
    }

    public void setResetReviewersOnPush(Boolean resetReviewersOnPush) {
        this.resetReviewersOnPush = resetReviewersOnPush;
    }

    public UpdateMergeRequestApproverSettingResponse withApproversFromProject(Boolean approversFromProject) {
        this.approversFromProject = approversFromProject;
        return this;
    }

    /**
     * 是否开启仅能从以下审核/检视人中追加审核人/检视人
     * @return approversFromProject
     */
    public Boolean getApproversFromProject() {
        return approversFromProject;
    }

    public void setApproversFromProject(Boolean approversFromProject) {
        this.approversFromProject = approversFromProject;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendReviewerIds(List<Integer> appendReviewerIds) {
        this.appendReviewerIds = appendReviewerIds;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addAppendReviewerIdsItem(Integer appendReviewerIdsItem) {
        if (this.appendReviewerIds == null) {
            this.appendReviewerIds = new ArrayList<>();
        }
        this.appendReviewerIds.add(appendReviewerIdsItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendReviewerIds(
        Consumer<List<Integer>> appendReviewerIdsSetter) {
        if (this.appendReviewerIds == null) {
            this.appendReviewerIds = new ArrayList<>();
        }
        appendReviewerIdsSetter.accept(this.appendReviewerIds);
        return this;
    }

    /**
     * 追加检视人id列表
     * @return appendReviewerIds
     */
    public List<Integer> getAppendReviewerIds() {
        return appendReviewerIds;
    }

    public void setAppendReviewerIds(List<Integer> appendReviewerIds) {
        this.appendReviewerIds = appendReviewerIds;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendReviewers(List<UserBasicDto> appendReviewers) {
        this.appendReviewers = appendReviewers;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addAppendReviewersItem(UserBasicDto appendReviewersItem) {
        if (this.appendReviewers == null) {
            this.appendReviewers = new ArrayList<>();
        }
        this.appendReviewers.add(appendReviewersItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendReviewers(
        Consumer<List<UserBasicDto>> appendReviewersSetter) {
        if (this.appendReviewers == null) {
            this.appendReviewers = new ArrayList<>();
        }
        appendReviewersSetter.accept(this.appendReviewers);
        return this;
    }

    /**
     * 追加检视人实体列表
     * @return appendReviewers
     */
    public List<UserBasicDto> getAppendReviewers() {
        return appendReviewers;
    }

    public void setAppendReviewers(List<UserBasicDto> appendReviewers) {
        this.appendReviewers = appendReviewers;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendApproverIds(List<Integer> appendApproverIds) {
        this.appendApproverIds = appendApproverIds;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addAppendApproverIdsItem(Integer appendApproverIdsItem) {
        if (this.appendApproverIds == null) {
            this.appendApproverIds = new ArrayList<>();
        }
        this.appendApproverIds.add(appendApproverIdsItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendApproverIds(
        Consumer<List<Integer>> appendApproverIdsSetter) {
        if (this.appendApproverIds == null) {
            this.appendApproverIds = new ArrayList<>();
        }
        appendApproverIdsSetter.accept(this.appendApproverIds);
        return this;
    }

    /**
     * 追加审核人id列表
     * @return appendApproverIds
     */
    public List<Integer> getAppendApproverIds() {
        return appendApproverIds;
    }

    public void setAppendApproverIds(List<Integer> appendApproverIds) {
        this.appendApproverIds = appendApproverIds;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendApprovers(List<UserBasicDto> appendApprovers) {
        this.appendApprovers = appendApprovers;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addAppendApproversItem(UserBasicDto appendApproversItem) {
        if (this.appendApprovers == null) {
            this.appendApprovers = new ArrayList<>();
        }
        this.appendApprovers.add(appendApproversItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withAppendApprovers(
        Consumer<List<UserBasicDto>> appendApproversSetter) {
        if (this.appendApprovers == null) {
            this.appendApprovers = new ArrayList<>();
        }
        appendApproversSetter.accept(this.appendApprovers);
        return this;
    }

    /**
     * 追加审核人实体列表
     * @return appendApprovers
     */
    public List<UserBasicDto> getAppendApprovers() {
        return appendApprovers;
    }

    public void setAppendApprovers(List<UserBasicDto> appendApprovers) {
        this.appendApprovers = appendApprovers;
    }

    public UpdateMergeRequestApproverSettingResponse withOnlyMergeWhenPipelinePass(Boolean onlyMergeWhenPipelinePass) {
        this.onlyMergeWhenPipelinePass = onlyMergeWhenPipelinePass;
        return this;
    }

    /**
     * 是否开启流水线门禁
     * @return onlyMergeWhenPipelinePass
     */
    public Boolean getOnlyMergeWhenPipelinePass() {
        return onlyMergeWhenPipelinePass;
    }

    public void setOnlyMergeWhenPipelinePass(Boolean onlyMergeWhenPipelinePass) {
        this.onlyMergeWhenPipelinePass = onlyMergeWhenPipelinePass;
    }

    public UpdateMergeRequestApproverSettingResponse withAssigneeIds(List<Integer> assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addAssigneeIdsItem(Integer assigneeIdsItem) {
        if (this.assigneeIds == null) {
            this.assigneeIds = new ArrayList<>();
        }
        this.assigneeIds.add(assigneeIdsItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withAssigneeIds(Consumer<List<Integer>> assigneeIdsSetter) {
        if (this.assigneeIds == null) {
            this.assigneeIds = new ArrayList<>();
        }
        assigneeIdsSetter.accept(this.assigneeIds);
        return this;
    }

    /**
     * 合并人id列表
     * @return assigneeIds
     */
    public List<Integer> getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(List<Integer> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public UpdateMergeRequestApproverSettingResponse withAssignees(List<UserBasicDto> assignees) {
        this.assignees = assignees;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addAssigneesItem(UserBasicDto assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withAssignees(Consumer<List<UserBasicDto>> assigneesSetter) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        assigneesSetter.accept(this.assignees);
        return this;
    }

    /**
     * 合并人实体列表
     * @return assignees
     */
    public List<UserBasicDto> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<UserBasicDto> assignees) {
        this.assignees = assignees;
    }

    public UpdateMergeRequestApproverSettingResponse withApproverIds(List<Integer> approverIds) {
        this.approverIds = approverIds;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addApproverIdsItem(Integer approverIdsItem) {
        if (this.approverIds == null) {
            this.approverIds = new ArrayList<>();
        }
        this.approverIds.add(approverIdsItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withApproverIds(Consumer<List<Integer>> approverIdsSetter) {
        if (this.approverIds == null) {
            this.approverIds = new ArrayList<>();
        }
        approverIdsSetter.accept(this.approverIds);
        return this;
    }

    /**
     * 审核人id列表
     * @return approverIds
     */
    public List<Integer> getApproverIds() {
        return approverIds;
    }

    public void setApproverIds(List<Integer> approverIds) {
        this.approverIds = approverIds;
    }

    public UpdateMergeRequestApproverSettingResponse withApprovers(List<UserBasicDto> approvers) {
        this.approvers = approvers;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addApproversItem(UserBasicDto approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withApprovers(Consumer<List<UserBasicDto>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 审核人实体列表
     * @return approvers
     */
    public List<UserBasicDto> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<UserBasicDto> approvers) {
        this.approvers = approvers;
    }

    public UpdateMergeRequestApproverSettingResponse withReviewerIds(List<Integer> reviewerIds) {
        this.reviewerIds = reviewerIds;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addReviewerIdsItem(Integer reviewerIdsItem) {
        if (this.reviewerIds == null) {
            this.reviewerIds = new ArrayList<>();
        }
        this.reviewerIds.add(reviewerIdsItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withReviewerIds(Consumer<List<Integer>> reviewerIdsSetter) {
        if (this.reviewerIds == null) {
            this.reviewerIds = new ArrayList<>();
        }
        reviewerIdsSetter.accept(this.reviewerIds);
        return this;
    }

    /**
     * 检视人id列表
     * @return reviewerIds
     */
    public List<Integer> getReviewerIds() {
        return reviewerIds;
    }

    public void setReviewerIds(List<Integer> reviewerIds) {
        this.reviewerIds = reviewerIds;
    }

    public UpdateMergeRequestApproverSettingResponse withReviewers(List<UserBasicDto> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse addReviewersItem(UserBasicDto reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    public UpdateMergeRequestApproverSettingResponse withReviewers(Consumer<List<UserBasicDto>> reviewersSetter) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        reviewersSetter.accept(this.reviewers);
        return this;
    }

    /**
     * 检视人实体列表
     * @return reviewers
     */
    public List<UserBasicDto> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<UserBasicDto> reviewers) {
        this.reviewers = reviewers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateMergeRequestApproverSettingResponse that = (UpdateMergeRequestApproverSettingResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.target, that.target)
            && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.isUseApproval, that.isUseApproval)
            && Objects.equals(this.approvalRequiredReviewers, that.approvalRequiredReviewers)
            && Objects.equals(this.approvalRequiredApprovers, that.approvalRequiredApprovers)
            && Objects.equals(this.resetApprovalsOnPush, that.resetApprovalsOnPush)
            && Objects.equals(this.resetReviewersOnPush, that.resetReviewersOnPush)
            && Objects.equals(this.approversFromProject, that.approversFromProject)
            && Objects.equals(this.appendReviewerIds, that.appendReviewerIds)
            && Objects.equals(this.appendReviewers, that.appendReviewers)
            && Objects.equals(this.appendApproverIds, that.appendApproverIds)
            && Objects.equals(this.appendApprovers, that.appendApprovers)
            && Objects.equals(this.onlyMergeWhenPipelinePass, that.onlyMergeWhenPipelinePass)
            && Objects.equals(this.assigneeIds, that.assigneeIds) && Objects.equals(this.assignees, that.assignees)
            && Objects.equals(this.approverIds, that.approverIds) && Objects.equals(this.approvers, that.approvers)
            && Objects.equals(this.reviewerIds, that.reviewerIds) && Objects.equals(this.reviewers, that.reviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            target,
            targetType,
            isUseApproval,
            approvalRequiredReviewers,
            approvalRequiredApprovers,
            resetApprovalsOnPush,
            resetReviewersOnPush,
            approversFromProject,
            appendReviewerIds,
            appendReviewers,
            appendApproverIds,
            appendApprovers,
            onlyMergeWhenPipelinePass,
            assigneeIds,
            assignees,
            approverIds,
            approvers,
            reviewerIds,
            reviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMergeRequestApproverSettingResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    isUseApproval: ").append(toIndentedString(isUseApproval)).append("\n");
        sb.append("    approvalRequiredReviewers: ").append(toIndentedString(approvalRequiredReviewers)).append("\n");
        sb.append("    approvalRequiredApprovers: ").append(toIndentedString(approvalRequiredApprovers)).append("\n");
        sb.append("    resetApprovalsOnPush: ").append(toIndentedString(resetApprovalsOnPush)).append("\n");
        sb.append("    resetReviewersOnPush: ").append(toIndentedString(resetReviewersOnPush)).append("\n");
        sb.append("    approversFromProject: ").append(toIndentedString(approversFromProject)).append("\n");
        sb.append("    appendReviewerIds: ").append(toIndentedString(appendReviewerIds)).append("\n");
        sb.append("    appendReviewers: ").append(toIndentedString(appendReviewers)).append("\n");
        sb.append("    appendApproverIds: ").append(toIndentedString(appendApproverIds)).append("\n");
        sb.append("    appendApprovers: ").append(toIndentedString(appendApprovers)).append("\n");
        sb.append("    onlyMergeWhenPipelinePass: ").append(toIndentedString(onlyMergeWhenPipelinePass)).append("\n");
        sb.append("    assigneeIds: ").append(toIndentedString(assigneeIds)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    approverIds: ").append(toIndentedString(approverIds)).append("\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
        sb.append("    reviewerIds: ").append(toIndentedString(reviewerIds)).append("\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
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
