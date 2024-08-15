package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 审批人信息
 */
public class ReviewerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_name")

    private String reviewerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_id")

    private String reviewerId;

    public ReviewerInfo withReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
        return this;
    }

    /**
     * 审批人名称（IAM用户名）
     * @return reviewerName
     */
    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public ReviewerInfo withReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }

    /**
     * 审批人ID（IAM用户Id）
     * @return reviewerId
     */
    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewerInfo that = (ReviewerInfo) obj;
        return Objects.equals(this.reviewerName, that.reviewerName) && Objects.equals(this.reviewerId, that.reviewerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewerName, reviewerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewerInfo {\n");
        sb.append("    reviewerName: ").append(toIndentedString(reviewerName)).append("\n");
        sb.append("    reviewerId: ").append(toIndentedString(reviewerId)).append("\n");
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
