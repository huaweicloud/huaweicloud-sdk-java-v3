package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApprovalReviewerInfoDto
 */
public class ApprovalReviewerInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_ids")

    private String reviewerIds;

    public ApprovalReviewerInfoDto withReviewerIds(String reviewerIds) {
        this.reviewerIds = reviewerIds;
        return this;
    }

    /**
     * **参数解释：** 需要更新的检视人ID列表 数字以英文逗号分隔 111,222 **取值范围：** 不涉及。
     * @return reviewerIds
     */
    public String getReviewerIds() {
        return reviewerIds;
    }

    public void setReviewerIds(String reviewerIds) {
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
        ApprovalReviewerInfoDto that = (ApprovalReviewerInfoDto) obj;
        return Objects.equals(this.reviewerIds, that.reviewerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalReviewerInfoDto {\n");
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
