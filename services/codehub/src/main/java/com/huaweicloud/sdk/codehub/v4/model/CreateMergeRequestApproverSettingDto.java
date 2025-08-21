package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 审核策配置
 */
public class CreateMergeRequestApproverSettingDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_use_approval")

    private Boolean isUseApproval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_required_approvers")

    private Integer approvalRequiredApprovers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_required_reviewers")

    private Integer approvalRequiredReviewers;

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
    @JsonProperty(value = "append_approver_ids")

    private List<Integer> appendApproverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_merge_when_pipeline_pass")

    private Boolean onlyMergeWhenPipelinePass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_ids")

    private List<Integer> assigneeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_ids")

    private List<Integer> approverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_ids")

    private List<Integer> reviewerIds = null;

    public CreateMergeRequestApproverSettingDto withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 配置分支，可使用*作为通配符使用，如：dev* 指以dev开头的所有分支
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public CreateMergeRequestApproverSettingDto withIsUseApproval(Boolean isUseApproval) {
        this.isUseApproval = isUseApproval;
        return this;
    }

    /**
     * 为false时，“最小检视人数”，“最小审核人数”，“重新推送代码时重置审核人”，“重新推送代码时重置检视人”，“仅能从以下审核人/检视人中追加审核人/检视人”置为默认
     * @return isUseApproval
     */
    public Boolean getIsUseApproval() {
        return isUseApproval;
    }

    public void setIsUseApproval(Boolean isUseApproval) {
        this.isUseApproval = isUseApproval;
    }

    public CreateMergeRequestApproverSettingDto withApprovalRequiredApprovers(Integer approvalRequiredApprovers) {
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

    public CreateMergeRequestApproverSettingDto withApprovalRequiredReviewers(Integer approvalRequiredReviewers) {
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

    public CreateMergeRequestApproverSettingDto withResetApprovalsOnPush(Boolean resetApprovalsOnPush) {
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

    public CreateMergeRequestApproverSettingDto withResetReviewersOnPush(Boolean resetReviewersOnPush) {
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

    public CreateMergeRequestApproverSettingDto withApproversFromProject(Boolean approversFromProject) {
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

    public CreateMergeRequestApproverSettingDto withAppendReviewerIds(List<Integer> appendReviewerIds) {
        this.appendReviewerIds = appendReviewerIds;
        return this;
    }

    public CreateMergeRequestApproverSettingDto addAppendReviewerIdsItem(Integer appendReviewerIdsItem) {
        if (this.appendReviewerIds == null) {
            this.appendReviewerIds = new ArrayList<>();
        }
        this.appendReviewerIds.add(appendReviewerIdsItem);
        return this;
    }

    public CreateMergeRequestApproverSettingDto withAppendReviewerIds(Consumer<List<Integer>> appendReviewerIdsSetter) {
        if (this.appendReviewerIds == null) {
            this.appendReviewerIds = new ArrayList<>();
        }
        appendReviewerIdsSetter.accept(this.appendReviewerIds);
        return this;
    }

    /**
     * 追加检视人人用户id列表
     * @return appendReviewerIds
     */
    public List<Integer> getAppendReviewerIds() {
        return appendReviewerIds;
    }

    public void setAppendReviewerIds(List<Integer> appendReviewerIds) {
        this.appendReviewerIds = appendReviewerIds;
    }

    public CreateMergeRequestApproverSettingDto withAppendApproverIds(List<Integer> appendApproverIds) {
        this.appendApproverIds = appendApproverIds;
        return this;
    }

    public CreateMergeRequestApproverSettingDto addAppendApproverIdsItem(Integer appendApproverIdsItem) {
        if (this.appendApproverIds == null) {
            this.appendApproverIds = new ArrayList<>();
        }
        this.appendApproverIds.add(appendApproverIdsItem);
        return this;
    }

    public CreateMergeRequestApproverSettingDto withAppendApproverIds(Consumer<List<Integer>> appendApproverIdsSetter) {
        if (this.appendApproverIds == null) {
            this.appendApproverIds = new ArrayList<>();
        }
        appendApproverIdsSetter.accept(this.appendApproverIds);
        return this;
    }

    /**
     * 追加审核人用户id列表
     * @return appendApproverIds
     */
    public List<Integer> getAppendApproverIds() {
        return appendApproverIds;
    }

    public void setAppendApproverIds(List<Integer> appendApproverIds) {
        this.appendApproverIds = appendApproverIds;
    }

    public CreateMergeRequestApproverSettingDto withOnlyMergeWhenPipelinePass(Boolean onlyMergeWhenPipelinePass) {
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

    public CreateMergeRequestApproverSettingDto withAssigneeIds(List<Integer> assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }

    public CreateMergeRequestApproverSettingDto addAssigneeIdsItem(Integer assigneeIdsItem) {
        if (this.assigneeIds == null) {
            this.assigneeIds = new ArrayList<>();
        }
        this.assigneeIds.add(assigneeIdsItem);
        return this;
    }

    public CreateMergeRequestApproverSettingDto withAssigneeIds(Consumer<List<Integer>> assigneeIdsSetter) {
        if (this.assigneeIds == null) {
            this.assigneeIds = new ArrayList<>();
        }
        assigneeIdsSetter.accept(this.assigneeIds);
        return this;
    }

    /**
     * 合并人用户id列表
     * @return assigneeIds
     */
    public List<Integer> getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(List<Integer> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public CreateMergeRequestApproverSettingDto withApproverIds(List<Integer> approverIds) {
        this.approverIds = approverIds;
        return this;
    }

    public CreateMergeRequestApproverSettingDto addApproverIdsItem(Integer approverIdsItem) {
        if (this.approverIds == null) {
            this.approverIds = new ArrayList<>();
        }
        this.approverIds.add(approverIdsItem);
        return this;
    }

    public CreateMergeRequestApproverSettingDto withApproverIds(Consumer<List<Integer>> approverIdsSetter) {
        if (this.approverIds == null) {
            this.approverIds = new ArrayList<>();
        }
        approverIdsSetter.accept(this.approverIds);
        return this;
    }

    /**
     * 审核人用户id列表
     * @return approverIds
     */
    public List<Integer> getApproverIds() {
        return approverIds;
    }

    public void setApproverIds(List<Integer> approverIds) {
        this.approverIds = approverIds;
    }

    public CreateMergeRequestApproverSettingDto withReviewerIds(List<Integer> reviewerIds) {
        this.reviewerIds = reviewerIds;
        return this;
    }

    public CreateMergeRequestApproverSettingDto addReviewerIdsItem(Integer reviewerIdsItem) {
        if (this.reviewerIds == null) {
            this.reviewerIds = new ArrayList<>();
        }
        this.reviewerIds.add(reviewerIdsItem);
        return this;
    }

    public CreateMergeRequestApproverSettingDto withReviewerIds(Consumer<List<Integer>> reviewerIdsSetter) {
        if (this.reviewerIds == null) {
            this.reviewerIds = new ArrayList<>();
        }
        reviewerIdsSetter.accept(this.reviewerIds);
        return this;
    }

    /**
     * 检视人用户id列表
     * @return reviewerIds
     */
    public List<Integer> getReviewerIds() {
        return reviewerIds;
    }

    public void setReviewerIds(List<Integer> reviewerIds) {
        this.reviewerIds = reviewerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMergeRequestApproverSettingDto that = (CreateMergeRequestApproverSettingDto) obj;
        return Objects.equals(this.target, that.target) && Objects.equals(this.isUseApproval, that.isUseApproval)
            && Objects.equals(this.approvalRequiredApprovers, that.approvalRequiredApprovers)
            && Objects.equals(this.approvalRequiredReviewers, that.approvalRequiredReviewers)
            && Objects.equals(this.resetApprovalsOnPush, that.resetApprovalsOnPush)
            && Objects.equals(this.resetReviewersOnPush, that.resetReviewersOnPush)
            && Objects.equals(this.approversFromProject, that.approversFromProject)
            && Objects.equals(this.appendReviewerIds, that.appendReviewerIds)
            && Objects.equals(this.appendApproverIds, that.appendApproverIds)
            && Objects.equals(this.onlyMergeWhenPipelinePass, that.onlyMergeWhenPipelinePass)
            && Objects.equals(this.assigneeIds, that.assigneeIds) && Objects.equals(this.approverIds, that.approverIds)
            && Objects.equals(this.reviewerIds, that.reviewerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target,
            isUseApproval,
            approvalRequiredApprovers,
            approvalRequiredReviewers,
            resetApprovalsOnPush,
            resetReviewersOnPush,
            approversFromProject,
            appendReviewerIds,
            appendApproverIds,
            onlyMergeWhenPipelinePass,
            assigneeIds,
            approverIds,
            reviewerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMergeRequestApproverSettingDto {\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    isUseApproval: ").append(toIndentedString(isUseApproval)).append("\n");
        sb.append("    approvalRequiredApprovers: ").append(toIndentedString(approvalRequiredApprovers)).append("\n");
        sb.append("    approvalRequiredReviewers: ").append(toIndentedString(approvalRequiredReviewers)).append("\n");
        sb.append("    resetApprovalsOnPush: ").append(toIndentedString(resetApprovalsOnPush)).append("\n");
        sb.append("    resetReviewersOnPush: ").append(toIndentedString(resetReviewersOnPush)).append("\n");
        sb.append("    approversFromProject: ").append(toIndentedString(approversFromProject)).append("\n");
        sb.append("    appendReviewerIds: ").append(toIndentedString(appendReviewerIds)).append("\n");
        sb.append("    appendApproverIds: ").append(toIndentedString(appendApproverIds)).append("\n");
        sb.append("    onlyMergeWhenPipelinePass: ").append(toIndentedString(onlyMergeWhenPipelinePass)).append("\n");
        sb.append("    assigneeIds: ").append(toIndentedString(assigneeIds)).append("\n");
        sb.append("    approverIds: ").append(toIndentedString(approverIds)).append("\n");
        sb.append("    reviewerIds: ").append(toIndentedString(reviewerIds)).append("\n");
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
