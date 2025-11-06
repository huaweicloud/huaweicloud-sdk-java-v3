package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检视意见设置请求体
 */
public class PostNoteRequiredAttributeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_assignee_id_required")

    private Boolean isAssigneeIdRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_review_categories_required")

    private Boolean isReviewCategoriesRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_review_modules_required")

    private Boolean isReviewModulesRequired;

    public PostNoteRequiredAttributeDto withIsAssigneeIdRequired(Boolean isAssigneeIdRequired) {
        this.isAssigneeIdRequired = isAssigneeIdRequired;
        return this;
    }

    /**
     * **参数解释：** 是否勾选指派给。
     * @return isAssigneeIdRequired
     */
    public Boolean getIsAssigneeIdRequired() {
        return isAssigneeIdRequired;
    }

    public void setIsAssigneeIdRequired(Boolean isAssigneeIdRequired) {
        this.isAssigneeIdRequired = isAssigneeIdRequired;
    }

    public PostNoteRequiredAttributeDto withIsReviewCategoriesRequired(Boolean isReviewCategoriesRequired) {
        this.isReviewCategoriesRequired = isReviewCategoriesRequired;
        return this;
    }

    /**
     * **参数解释：** 是否勾选意见分类。
     * @return isReviewCategoriesRequired
     */
    public Boolean getIsReviewCategoriesRequired() {
        return isReviewCategoriesRequired;
    }

    public void setIsReviewCategoriesRequired(Boolean isReviewCategoriesRequired) {
        this.isReviewCategoriesRequired = isReviewCategoriesRequired;
    }

    public PostNoteRequiredAttributeDto withIsReviewModulesRequired(Boolean isReviewModulesRequired) {
        this.isReviewModulesRequired = isReviewModulesRequired;
        return this;
    }

    /**
     * **参数解释：** 是否勾选意见模块。
     * @return isReviewModulesRequired
     */
    public Boolean getIsReviewModulesRequired() {
        return isReviewModulesRequired;
    }

    public void setIsReviewModulesRequired(Boolean isReviewModulesRequired) {
        this.isReviewModulesRequired = isReviewModulesRequired;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostNoteRequiredAttributeDto that = (PostNoteRequiredAttributeDto) obj;
        return Objects.equals(this.isAssigneeIdRequired, that.isAssigneeIdRequired)
            && Objects.equals(this.isReviewCategoriesRequired, that.isReviewCategoriesRequired)
            && Objects.equals(this.isReviewModulesRequired, that.isReviewModulesRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAssigneeIdRequired, isReviewCategoriesRequired, isReviewModulesRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostNoteRequiredAttributeDto {\n");
        sb.append("    isAssigneeIdRequired: ").append(toIndentedString(isAssigneeIdRequired)).append("\n");
        sb.append("    isReviewCategoriesRequired: ").append(toIndentedString(isReviewCategoriesRequired)).append("\n");
        sb.append("    isReviewModulesRequired: ").append(toIndentedString(isReviewModulesRequired)).append("\n");
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
