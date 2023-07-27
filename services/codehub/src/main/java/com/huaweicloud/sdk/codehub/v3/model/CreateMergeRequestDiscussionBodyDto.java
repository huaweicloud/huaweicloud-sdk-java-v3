package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateMergeRequestDiscussionBodyDto
 */
public class CreateMergeRequestDiscussionBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_id")

    private String assigneeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_categories")

    private String reviewCategories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_modules")

    private String reviewModules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer_id")

    private String proposerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private PositionDto position;

    public CreateMergeRequestDiscussionBodyDto withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 检视意见内容
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public CreateMergeRequestDiscussionBodyDto withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 严重程度
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public CreateMergeRequestDiscussionBodyDto withAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * 指派人id
     * @return assigneeId
     */
    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public CreateMergeRequestDiscussionBodyDto withReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
        return this;
    }

    /**
     * 检视意见分类
     * @return reviewCategories
     */
    public String getReviewCategories() {
        return reviewCategories;
    }

    public void setReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
    }

    public CreateMergeRequestDiscussionBodyDto withReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    /**
     * 检视意见模块
     * @return reviewModules
     */
    public String getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
    }

    public CreateMergeRequestDiscussionBodyDto withProposerId(String proposerId) {
        this.proposerId = proposerId;
        return this;
    }

    /**
     * 提出人id
     * @return proposerId
     */
    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId;
    }

    public CreateMergeRequestDiscussionBodyDto withPosition(PositionDto position) {
        this.position = position;
        return this;
    }

    public CreateMergeRequestDiscussionBodyDto withPosition(Consumer<PositionDto> positionSetter) {
        if (this.position == null) {
            this.position = new PositionDto();
            positionSetter.accept(this.position);
        }

        return this;
    }

    /**
     * Get position
     * @return position
     */
    public PositionDto getPosition() {
        return position;
    }

    public void setPosition(PositionDto position) {
        this.position = position;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMergeRequestDiscussionBodyDto that = (CreateMergeRequestDiscussionBodyDto) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.assigneeId, that.assigneeId)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewModules, that.reviewModules)
            && Objects.equals(this.proposerId, that.proposerId) && Objects.equals(this.position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, severity, assigneeId, reviewCategories, reviewModules, proposerId, position);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMergeRequestDiscussionBodyDto {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    reviewCategories: ").append(toIndentedString(reviewCategories)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    proposerId: ").append(toIndentedString(proposerId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
