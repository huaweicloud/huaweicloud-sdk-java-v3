package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PostMergeRequestParamsDtoForOpenApi
 */
public class PostMergeRequestParamsDtoForOpenApi {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_repository_id")

    private Integer targetRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_ids")

    private String reviewerIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_ids")

    private String assigneeIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_reviewer_ids")

    private String approvalReviewerIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_approvers_ids")

    private String approvalApproversIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "milestone_id")

    private Integer milestoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Object labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_remove_source_branch")

    private Boolean forceRemoveSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash")

    private Boolean squash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash_commit_message")

    private String squashCommitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_ids")

    private List<String> workItemIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_use_temp_branch")

    private Boolean isUseTempBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_assignee_can_merge")

    private Boolean onlyAssigneeCanMerge;

    public PostMergeRequestParamsDtoForOpenApi withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 合并请求标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PostMergeRequestParamsDtoForOpenApi withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * 源分支
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public PostMergeRequestParamsDtoForOpenApi withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * 目标分支
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public PostMergeRequestParamsDtoForOpenApi withTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
        return this;
    }

    /**
     * 目标仓库id
     * @return targetRepositoryId
     */
    public Integer getTargetRepositoryId() {
        return targetRepositoryId;
    }

    public void setTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
    }

    public PostMergeRequestParamsDtoForOpenApi withReviewerIds(String reviewerIds) {
        this.reviewerIds = reviewerIds;
        return this;
    }

    /**
     * 打分模式评审人ids，使用逗号分隔
     * @return reviewerIds
     */
    public String getReviewerIds() {
        return reviewerIds;
    }

    public void setReviewerIds(String reviewerIds) {
        this.reviewerIds = reviewerIds;
    }

    public PostMergeRequestParamsDtoForOpenApi withAssigneeIds(String assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }

    /**
     * 合并人ids，使用逗号分隔
     * @return assigneeIds
     */
    public String getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(String assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public PostMergeRequestParamsDtoForOpenApi withApprovalReviewerIds(String approvalReviewerIds) {
        this.approvalReviewerIds = approvalReviewerIds;
        return this;
    }

    /**
     * 审核模式检视人ids，使用逗号分隔
     * @return approvalReviewerIds
     */
    public String getApprovalReviewerIds() {
        return approvalReviewerIds;
    }

    public void setApprovalReviewerIds(String approvalReviewerIds) {
        this.approvalReviewerIds = approvalReviewerIds;
    }

    public PostMergeRequestParamsDtoForOpenApi withApprovalApproversIds(String approvalApproversIds) {
        this.approvalApproversIds = approvalApproversIds;
        return this;
    }

    /**
     * 审核人ids，使用逗号分隔
     * @return approvalApproversIds
     */
    public String getApprovalApproversIds() {
        return approvalApproversIds;
    }

    public void setApprovalApproversIds(String approvalApproversIds) {
        this.approvalApproversIds = approvalApproversIds;
    }

    public PostMergeRequestParamsDtoForOpenApi withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 合并请求描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PostMergeRequestParamsDtoForOpenApi withMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
        return this;
    }

    /**
     * 里程碑id
     * @return milestoneId
     */
    public Integer getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public PostMergeRequestParamsDtoForOpenApi withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签名称，使用逗号分隔
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public PostMergeRequestParamsDtoForOpenApi withForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
        return this;
    }

    /**
     * 合入后自动删除源分支
     * @return forceRemoveSourceBranch
     */
    public Boolean getForceRemoveSourceBranch() {
        return forceRemoveSourceBranch;
    }

    public void setForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
    }

    public PostMergeRequestParamsDtoForOpenApi withSquash(Boolean squash) {
        this.squash = squash;
        return this;
    }

    /**
     * 压缩合并
     * @return squash
     */
    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public PostMergeRequestParamsDtoForOpenApi withSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
        return this;
    }

    /**
     * 压缩合并信息
     * @return squashCommitMessage
     */
    public String getSquashCommitMessage() {
        return squashCommitMessage;
    }

    public void setSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
    }

    public PostMergeRequestParamsDtoForOpenApi withWorkItemIds(List<String> workItemIds) {
        this.workItemIds = workItemIds;
        return this;
    }

    public PostMergeRequestParamsDtoForOpenApi addWorkItemIdsItem(String workItemIdsItem) {
        if (this.workItemIds == null) {
            this.workItemIds = new ArrayList<>();
        }
        this.workItemIds.add(workItemIdsItem);
        return this;
    }

    public PostMergeRequestParamsDtoForOpenApi withWorkItemIds(Consumer<List<String>> workItemIdsSetter) {
        if (this.workItemIds == null) {
            this.workItemIds = new ArrayList<>();
        }
        workItemIdsSetter.accept(this.workItemIds);
        return this;
    }

    /**
     * e2e单号
     * @return workItemIds
     */
    public List<String> getWorkItemIds() {
        return workItemIds;
    }

    public void setWorkItemIds(List<String> workItemIds) {
        this.workItemIds = workItemIds;
    }

    public PostMergeRequestParamsDtoForOpenApi withIsUseTempBranch(Boolean isUseTempBranch) {
        this.isUseTempBranch = isUseTempBranch;
        return this;
    }

    /**
     * 使用临时分支创建合并请求
     * @return isUseTempBranch
     */
    public Boolean getIsUseTempBranch() {
        return isUseTempBranch;
    }

    public void setIsUseTempBranch(Boolean isUseTempBranch) {
        this.isUseTempBranch = isUseTempBranch;
    }

    public PostMergeRequestParamsDtoForOpenApi withOnlyAssigneeCanMerge(Boolean onlyAssigneeCanMerge) {
        this.onlyAssigneeCanMerge = onlyAssigneeCanMerge;
        return this;
    }

    /**
     * 只有合并人允许合入
     * @return onlyAssigneeCanMerge
     */
    public Boolean getOnlyAssigneeCanMerge() {
        return onlyAssigneeCanMerge;
    }

    public void setOnlyAssigneeCanMerge(Boolean onlyAssigneeCanMerge) {
        this.onlyAssigneeCanMerge = onlyAssigneeCanMerge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostMergeRequestParamsDtoForOpenApi that = (PostMergeRequestParamsDtoForOpenApi) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.targetRepositoryId, that.targetRepositoryId)
            && Objects.equals(this.reviewerIds, that.reviewerIds) && Objects.equals(this.assigneeIds, that.assigneeIds)
            && Objects.equals(this.approvalReviewerIds, that.approvalReviewerIds)
            && Objects.equals(this.approvalApproversIds, that.approvalApproversIds)
            && Objects.equals(this.description, that.description) && Objects.equals(this.milestoneId, that.milestoneId)
            && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.forceRemoveSourceBranch, that.forceRemoveSourceBranch)
            && Objects.equals(this.squash, that.squash)
            && Objects.equals(this.squashCommitMessage, that.squashCommitMessage)
            && Objects.equals(this.workItemIds, that.workItemIds)
            && Objects.equals(this.isUseTempBranch, that.isUseTempBranch)
            && Objects.equals(this.onlyAssigneeCanMerge, that.onlyAssigneeCanMerge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            sourceBranch,
            targetBranch,
            targetRepositoryId,
            reviewerIds,
            assigneeIds,
            approvalReviewerIds,
            approvalApproversIds,
            description,
            milestoneId,
            labels,
            forceRemoveSourceBranch,
            squash,
            squashCommitMessage,
            workItemIds,
            isUseTempBranch,
            onlyAssigneeCanMerge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostMergeRequestParamsDtoForOpenApi {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    targetRepositoryId: ").append(toIndentedString(targetRepositoryId)).append("\n");
        sb.append("    reviewerIds: ").append(toIndentedString(reviewerIds)).append("\n");
        sb.append("    assigneeIds: ").append(toIndentedString(assigneeIds)).append("\n");
        sb.append("    approvalReviewerIds: ").append(toIndentedString(approvalReviewerIds)).append("\n");
        sb.append("    approvalApproversIds: ").append(toIndentedString(approvalApproversIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    forceRemoveSourceBranch: ").append(toIndentedString(forceRemoveSourceBranch)).append("\n");
        sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
        sb.append("    squashCommitMessage: ").append(toIndentedString(squashCommitMessage)).append("\n");
        sb.append("    workItemIds: ").append(toIndentedString(workItemIds)).append("\n");
        sb.append("    isUseTempBranch: ").append(toIndentedString(isUseTempBranch)).append("\n");
        sb.append("    onlyAssigneeCanMerge: ").append(toIndentedString(onlyAssigneeCanMerge)).append("\n");
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
