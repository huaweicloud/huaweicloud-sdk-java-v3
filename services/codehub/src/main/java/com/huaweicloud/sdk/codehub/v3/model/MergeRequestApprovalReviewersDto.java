package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeRequestApprovalReviewersDto
 */
public class MergeRequestApprovalReviewersDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_merge_request_reviewers")

    private List<ApprovalUserDto> approvalMergeRequestReviewers = null;

    public MergeRequestApprovalReviewersDto withApprovalMergeRequestReviewers(
        List<ApprovalUserDto> approvalMergeRequestReviewers) {
        this.approvalMergeRequestReviewers = approvalMergeRequestReviewers;
        return this;
    }

    public MergeRequestApprovalReviewersDto addApprovalMergeRequestReviewersItem(
        ApprovalUserDto approvalMergeRequestReviewersItem) {
        if (this.approvalMergeRequestReviewers == null) {
            this.approvalMergeRequestReviewers = new ArrayList<>();
        }
        this.approvalMergeRequestReviewers.add(approvalMergeRequestReviewersItem);
        return this;
    }

    public MergeRequestApprovalReviewersDto withApprovalMergeRequestReviewers(
        Consumer<List<ApprovalUserDto>> approvalMergeRequestReviewersSetter) {
        if (this.approvalMergeRequestReviewers == null) {
            this.approvalMergeRequestReviewers = new ArrayList<>();
        }
        approvalMergeRequestReviewersSetter.accept(this.approvalMergeRequestReviewers);
        return this;
    }

    /**
     * Get approvalMergeRequestReviewers
     * @return approvalMergeRequestReviewers
     */
    public List<ApprovalUserDto> getApprovalMergeRequestReviewers() {
        return approvalMergeRequestReviewers;
    }

    public void setApprovalMergeRequestReviewers(List<ApprovalUserDto> approvalMergeRequestReviewers) {
        this.approvalMergeRequestReviewers = approvalMergeRequestReviewers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestApprovalReviewersDto that = (MergeRequestApprovalReviewersDto) obj;
        return Objects.equals(this.approvalMergeRequestReviewers, that.approvalMergeRequestReviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalMergeRequestReviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestApprovalReviewersDto {\n");
        sb.append("    approvalMergeRequestReviewers: ")
            .append(toIndentedString(approvalMergeRequestReviewers))
            .append("\n");
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
