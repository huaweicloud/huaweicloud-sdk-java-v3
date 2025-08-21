package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMergeableStateOuterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Boolean state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_passed")

    private Boolean conflictPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_ff_passed")

    private Boolean nonFfPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_by_user_passed")

    private Boolean mergedByUserPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_in_progress_passed")

    private Boolean workInProgressPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_discussion_passed")

    private Boolean resolveDiscussionPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ci_state_passed")

    private Boolean ciStatePassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_by_self_passed")

    private Boolean mergeBySelfPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_force_merge")

    private Boolean canForceMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vote_passed")

    private Boolean votePassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "e2e_check_passed")

    private Boolean e2eCheckPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_issues_passed")

    private Boolean allIssuesPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_one_issue_passed")

    private Boolean onlyOneIssuePassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_reviewers_required_passed")

    private Boolean approvalReviewersRequiredPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_approvers_required_passed")

    private Boolean approvalApproversRequiredPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_passed")

    private Boolean evaluationPassed;

    public ShowMergeableStateOuterResponse withMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * **参数解释：** 合并请求id。
     * minimum: 0
     * maximum: 2147483647
     * @return mergeRequestId
     */
    public Integer getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public ShowMergeableStateOuterResponse withState(Boolean state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 合并请求的可合入状态。 **约束限制：** - true，可合入。 - false，不可合入。
     * @return state
     */
    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public ShowMergeableStateOuterResponse withConflictPassed(Boolean conflictPassed) {
        this.conflictPassed = conflictPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求冲突门禁是否通过。 **约束限制：** - true，不存在冲突。 - false，存在冲突。
     * @return conflictPassed
     */
    public Boolean getConflictPassed() {
        return conflictPassed;
    }

    public void setConflictPassed(Boolean conflictPassed) {
        this.conflictPassed = conflictPassed;
    }

    public ShowMergeableStateOuterResponse withNonFfPassed(Boolean nonFfPassed) {
        this.nonFfPassed = nonFfPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求是否需要变基。 **约束限制：** - true，不需变基。 - false，需要变基。
     * @return nonFfPassed
     */
    public Boolean getNonFfPassed() {
        return nonFfPassed;
    }

    public void setNonFfPassed(Boolean nonFfPassed) {
        this.nonFfPassed = nonFfPassed;
    }

    public ShowMergeableStateOuterResponse withMergedByUserPassed(Boolean mergedByUserPassed) {
        this.mergedByUserPassed = mergedByUserPassed;
        return this;
    }

    /**
     * **参数解释：** 对当前用户是否有合入当前合并请求的权限判断。 **约束限制：** - true，有权限合入。 - false，无权限合入。
     * @return mergedByUserPassed
     */
    public Boolean getMergedByUserPassed() {
        return mergedByUserPassed;
    }

    public void setMergedByUserPassed(Boolean mergedByUserPassed) {
        this.mergedByUserPassed = mergedByUserPassed;
    }

    public ShowMergeableStateOuterResponse withWorkInProgressPassed(Boolean workInProgressPassed) {
        this.workInProgressPassed = workInProgressPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求WIP门禁是否通过。 **约束限制：** - true，非WIP状态。 - false，WIP状态。
     * @return workInProgressPassed
     */
    public Boolean getWorkInProgressPassed() {
        return workInProgressPassed;
    }

    public void setWorkInProgressPassed(Boolean workInProgressPassed) {
        this.workInProgressPassed = workInProgressPassed;
    }

    public ShowMergeableStateOuterResponse withResolveDiscussionPassed(Boolean resolveDiscussionPassed) {
        this.resolveDiscussionPassed = resolveDiscussionPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求检视意见门禁是否通过。 **约束限制：** - true，检视意见门禁通过。 - false，检视意见门禁不通过。
     * @return resolveDiscussionPassed
     */
    public Boolean getResolveDiscussionPassed() {
        return resolveDiscussionPassed;
    }

    public void setResolveDiscussionPassed(Boolean resolveDiscussionPassed) {
        this.resolveDiscussionPassed = resolveDiscussionPassed;
    }

    public ShowMergeableStateOuterResponse withCiStatePassed(Boolean ciStatePassed) {
        this.ciStatePassed = ciStatePassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求流水线门禁是否通过。 **约束限制：** - true，合并请求流水线门禁通过。 - false，合并请求流水线门禁不通过。
     * @return ciStatePassed
     */
    public Boolean getCiStatePassed() {
        return ciStatePassed;
    }

    public void setCiStatePassed(Boolean ciStatePassed) {
        this.ciStatePassed = ciStatePassed;
    }

    public ShowMergeableStateOuterResponse withMergeBySelfPassed(Boolean mergeBySelfPassed) {
        this.mergeBySelfPassed = mergeBySelfPassed;
        return this;
    }

    /**
     * **参数解释：** 对当前用户是否有合入自己创建的合并请求的判断。 **约束限制：** - true，非自己创建的mr可以合入。 - false，自己创建的mr不能合入。
     * @return mergeBySelfPassed
     */
    public Boolean getMergeBySelfPassed() {
        return mergeBySelfPassed;
    }

    public void setMergeBySelfPassed(Boolean mergeBySelfPassed) {
        this.mergeBySelfPassed = mergeBySelfPassed;
    }

    public ShowMergeableStateOuterResponse withCanForceMerge(Boolean canForceMerge) {
        this.canForceMerge = canForceMerge;
        return this;
    }

    /**
     * **参数解释：** 当前用户是否可以强制合入当前合并请求。 **约束限制：** - true，可以强制合入。 - false，不能强制合入。
     * @return canForceMerge
     */
    public Boolean getCanForceMerge() {
        return canForceMerge;
    }

    public void setCanForceMerge(Boolean canForceMerge) {
        this.canForceMerge = canForceMerge;
    }

    public ShowMergeableStateOuterResponse withVotePassed(Boolean votePassed) {
        this.votePassed = votePassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求评分门禁是否通过。 **约束限制：** - true，评分门禁通过。 - false，评分门禁不通过。
     * @return votePassed
     */
    public Boolean getVotePassed() {
        return votePassed;
    }

    public void setVotePassed(Boolean votePassed) {
        this.votePassed = votePassed;
    }

    public ShowMergeableStateOuterResponse withE2eCheckPassed(Boolean e2eCheckPassed) {
        this.e2eCheckPassed = e2eCheckPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求必须与CodeArts Req关联门禁是否通过。 **约束限制：** - true，合并请求必须与CodeArts Req关联门禁通过。 - false，合并请求必须与CodeArts Req关联门禁不通过。
     * @return e2eCheckPassed
     */
    public Boolean getE2eCheckPassed() {
        return e2eCheckPassed;
    }

    public void setE2eCheckPassed(Boolean e2eCheckPassed) {
        this.e2eCheckPassed = e2eCheckPassed;
    }

    public ShowMergeableStateOuterResponse withAllIssuesPassed(Boolean allIssuesPassed) {
        this.allIssuesPassed = allIssuesPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求所有E2E单号校验必须通过门禁是否通过。 **约束限制：** - true，合并请求所有E2E单号校验必须通过门禁通过。 - false，合并请求所有E2E单号校验必须通过门禁不通过。
     * @return allIssuesPassed
     */
    public Boolean getAllIssuesPassed() {
        return allIssuesPassed;
    }

    public void setAllIssuesPassed(Boolean allIssuesPassed) {
        this.allIssuesPassed = allIssuesPassed;
    }

    public ShowMergeableStateOuterResponse withOnlyOneIssuePassed(Boolean onlyOneIssuePassed) {
        this.onlyOneIssuePassed = onlyOneIssuePassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求只能关联一个单号门禁是否通过。 **约束限制：** - true，合并请求只能关联一个单号门禁通过。 - false，合并请求只能关联一个单号门禁不通过。
     * @return onlyOneIssuePassed
     */
    public Boolean getOnlyOneIssuePassed() {
        return onlyOneIssuePassed;
    }

    public void setOnlyOneIssuePassed(Boolean onlyOneIssuePassed) {
        this.onlyOneIssuePassed = onlyOneIssuePassed;
    }

    public ShowMergeableStateOuterResponse withApprovalReviewersRequiredPassed(
        Boolean approvalReviewersRequiredPassed) {
        this.approvalReviewersRequiredPassed = approvalReviewersRequiredPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求检视门禁是否通过。 **约束限制：** - true，合并请求检视门禁通过。 - false，合并请求检视门禁不通过。
     * @return approvalReviewersRequiredPassed
     */
    public Boolean getApprovalReviewersRequiredPassed() {
        return approvalReviewersRequiredPassed;
    }

    public void setApprovalReviewersRequiredPassed(Boolean approvalReviewersRequiredPassed) {
        this.approvalReviewersRequiredPassed = approvalReviewersRequiredPassed;
    }

    public ShowMergeableStateOuterResponse withApprovalApproversRequiredPassed(
        Boolean approvalApproversRequiredPassed) {
        this.approvalApproversRequiredPassed = approvalApproversRequiredPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求审核门禁是否通过。 **约束限制：** - true，合并请求审核门禁通过。 - false，合并请求审核门禁不通过。
     * @return approvalApproversRequiredPassed
     */
    public Boolean getApprovalApproversRequiredPassed() {
        return approvalApproversRequiredPassed;
    }

    public void setApprovalApproversRequiredPassed(Boolean approvalApproversRequiredPassed) {
        this.approvalApproversRequiredPassed = approvalApproversRequiredPassed;
    }

    public ShowMergeableStateOuterResponse withEvaluationPassed(Boolean evaluationPassed) {
        this.evaluationPassed = evaluationPassed;
        return this;
    }

    /**
     * **参数解释：** 合并请求星级评价门禁是否通过。 **约束限制：** - true，合并请求星级评价门禁通过。 - false，合并请求星级评价门禁不通过。
     * @return evaluationPassed
     */
    public Boolean getEvaluationPassed() {
        return evaluationPassed;
    }

    public void setEvaluationPassed(Boolean evaluationPassed) {
        this.evaluationPassed = evaluationPassed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMergeableStateOuterResponse that = (ShowMergeableStateOuterResponse) obj;
        return Objects.equals(this.mergeRequestId, that.mergeRequestId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.conflictPassed, that.conflictPassed)
            && Objects.equals(this.nonFfPassed, that.nonFfPassed)
            && Objects.equals(this.mergedByUserPassed, that.mergedByUserPassed)
            && Objects.equals(this.workInProgressPassed, that.workInProgressPassed)
            && Objects.equals(this.resolveDiscussionPassed, that.resolveDiscussionPassed)
            && Objects.equals(this.ciStatePassed, that.ciStatePassed)
            && Objects.equals(this.mergeBySelfPassed, that.mergeBySelfPassed)
            && Objects.equals(this.canForceMerge, that.canForceMerge)
            && Objects.equals(this.votePassed, that.votePassed)
            && Objects.equals(this.e2eCheckPassed, that.e2eCheckPassed)
            && Objects.equals(this.allIssuesPassed, that.allIssuesPassed)
            && Objects.equals(this.onlyOneIssuePassed, that.onlyOneIssuePassed)
            && Objects.equals(this.approvalReviewersRequiredPassed, that.approvalReviewersRequiredPassed)
            && Objects.equals(this.approvalApproversRequiredPassed, that.approvalApproversRequiredPassed)
            && Objects.equals(this.evaluationPassed, that.evaluationPassed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mergeRequestId,
            state,
            conflictPassed,
            nonFfPassed,
            mergedByUserPassed,
            workInProgressPassed,
            resolveDiscussionPassed,
            ciStatePassed,
            mergeBySelfPassed,
            canForceMerge,
            votePassed,
            e2eCheckPassed,
            allIssuesPassed,
            onlyOneIssuePassed,
            approvalReviewersRequiredPassed,
            approvalApproversRequiredPassed,
            evaluationPassed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMergeableStateOuterResponse {\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    conflictPassed: ").append(toIndentedString(conflictPassed)).append("\n");
        sb.append("    nonFfPassed: ").append(toIndentedString(nonFfPassed)).append("\n");
        sb.append("    mergedByUserPassed: ").append(toIndentedString(mergedByUserPassed)).append("\n");
        sb.append("    workInProgressPassed: ").append(toIndentedString(workInProgressPassed)).append("\n");
        sb.append("    resolveDiscussionPassed: ").append(toIndentedString(resolveDiscussionPassed)).append("\n");
        sb.append("    ciStatePassed: ").append(toIndentedString(ciStatePassed)).append("\n");
        sb.append("    mergeBySelfPassed: ").append(toIndentedString(mergeBySelfPassed)).append("\n");
        sb.append("    canForceMerge: ").append(toIndentedString(canForceMerge)).append("\n");
        sb.append("    votePassed: ").append(toIndentedString(votePassed)).append("\n");
        sb.append("    e2eCheckPassed: ").append(toIndentedString(e2eCheckPassed)).append("\n");
        sb.append("    allIssuesPassed: ").append(toIndentedString(allIssuesPassed)).append("\n");
        sb.append("    onlyOneIssuePassed: ").append(toIndentedString(onlyOneIssuePassed)).append("\n");
        sb.append("    approvalReviewersRequiredPassed: ")
            .append(toIndentedString(approvalReviewersRequiredPassed))
            .append("\n");
        sb.append("    approvalApproversRequiredPassed: ")
            .append(toIndentedString(approvalApproversRequiredPassed))
            .append("\n");
        sb.append("    evaluationPassed: ").append(toIndentedString(evaluationPassed)).append("\n");
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
