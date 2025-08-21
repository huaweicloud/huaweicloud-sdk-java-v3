package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检视意见设置请求体
 */
public class ReviewSettingParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories_and_modules_enabled")

    private Boolean categoriesAndModulesEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_modules")

    private List<String> reviewModules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_category_enabled")

    private Boolean secondaryCategoryEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_default_categories")

    private List<String> reviewDefaultCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_customized_categories")

    private List<String> reviewCustomizedCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_assignee_id_required")

    private Boolean isAssigneeIdRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_review_categories_required")

    private Boolean isReviewCategoriesRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_review_modules_required")

    private Boolean isReviewModulesRequired;

    public ReviewSettingParamDto withCategoriesAndModulesEnabled(Boolean categoriesAndModulesEnabled) {
        this.categoriesAndModulesEnabled = categoriesAndModulesEnabled;
        return this;
    }

    /**
     * **参数解释：** 是否启用启用检视意见分类与模块。
     * @return categoriesAndModulesEnabled
     */
    public Boolean getCategoriesAndModulesEnabled() {
        return categoriesAndModulesEnabled;
    }

    public void setCategoriesAndModulesEnabled(Boolean categoriesAndModulesEnabled) {
        this.categoriesAndModulesEnabled = categoriesAndModulesEnabled;
    }

    public ReviewSettingParamDto withReviewModules(List<String> reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    public ReviewSettingParamDto addReviewModulesItem(String reviewModulesItem) {
        if (this.reviewModules == null) {
            this.reviewModules = new ArrayList<>();
        }
        this.reviewModules.add(reviewModulesItem);
        return this;
    }

    public ReviewSettingParamDto withReviewModules(Consumer<List<String>> reviewModulesSetter) {
        if (this.reviewModules == null) {
            this.reviewModules = new ArrayList<>();
        }
        reviewModulesSetter.accept(this.reviewModules);
        return this;
    }

    /**
     * **参数解释：** 检视意见模块。
     * @return reviewModules
     */
    public List<String> getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(List<String> reviewModules) {
        this.reviewModules = reviewModules;
    }

    public ReviewSettingParamDto withSecondaryCategoryEnabled(Boolean secondaryCategoryEnabled) {
        this.secondaryCategoryEnabled = secondaryCategoryEnabled;
        return this;
    }

    /**
     * **参数解释：** 是否启用系统预置检视意见分类。
     * @return secondaryCategoryEnabled
     */
    public Boolean getSecondaryCategoryEnabled() {
        return secondaryCategoryEnabled;
    }

    public void setSecondaryCategoryEnabled(Boolean secondaryCategoryEnabled) {
        this.secondaryCategoryEnabled = secondaryCategoryEnabled;
    }

    public ReviewSettingParamDto withReviewDefaultCategories(List<String> reviewDefaultCategories) {
        this.reviewDefaultCategories = reviewDefaultCategories;
        return this;
    }

    public ReviewSettingParamDto addReviewDefaultCategoriesItem(String reviewDefaultCategoriesItem) {
        if (this.reviewDefaultCategories == null) {
            this.reviewDefaultCategories = new ArrayList<>();
        }
        this.reviewDefaultCategories.add(reviewDefaultCategoriesItem);
        return this;
    }

    public ReviewSettingParamDto withReviewDefaultCategories(Consumer<List<String>> reviewDefaultCategoriesSetter) {
        if (this.reviewDefaultCategories == null) {
            this.reviewDefaultCategories = new ArrayList<>();
        }
        reviewDefaultCategoriesSetter.accept(this.reviewDefaultCategories);
        return this;
    }

    /**
     * **参数解释：** 检视意见分类(已勾选的分类的key列表)。
     * @return reviewDefaultCategories
     */
    public List<String> getReviewDefaultCategories() {
        return reviewDefaultCategories;
    }

    public void setReviewDefaultCategories(List<String> reviewDefaultCategories) {
        this.reviewDefaultCategories = reviewDefaultCategories;
    }

    public ReviewSettingParamDto withReviewCustomizedCategories(List<String> reviewCustomizedCategories) {
        this.reviewCustomizedCategories = reviewCustomizedCategories;
        return this;
    }

    public ReviewSettingParamDto addReviewCustomizedCategoriesItem(String reviewCustomizedCategoriesItem) {
        if (this.reviewCustomizedCategories == null) {
            this.reviewCustomizedCategories = new ArrayList<>();
        }
        this.reviewCustomizedCategories.add(reviewCustomizedCategoriesItem);
        return this;
    }

    public ReviewSettingParamDto withReviewCustomizedCategories(
        Consumer<List<String>> reviewCustomizedCategoriesSetter) {
        if (this.reviewCustomizedCategories == null) {
            this.reviewCustomizedCategories = new ArrayList<>();
        }
        reviewCustomizedCategoriesSetter.accept(this.reviewCustomizedCategories);
        return this;
    }

    /**
     * **参数解释：** 自定义分类列表。
     * @return reviewCustomizedCategories
     */
    public List<String> getReviewCustomizedCategories() {
        return reviewCustomizedCategories;
    }

    public void setReviewCustomizedCategories(List<String> reviewCustomizedCategories) {
        this.reviewCustomizedCategories = reviewCustomizedCategories;
    }

    public ReviewSettingParamDto withIsAssigneeIdRequired(Boolean isAssigneeIdRequired) {
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

    public ReviewSettingParamDto withIsReviewCategoriesRequired(Boolean isReviewCategoriesRequired) {
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

    public ReviewSettingParamDto withIsReviewModulesRequired(Boolean isReviewModulesRequired) {
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
        ReviewSettingParamDto that = (ReviewSettingParamDto) obj;
        return Objects.equals(this.categoriesAndModulesEnabled, that.categoriesAndModulesEnabled)
            && Objects.equals(this.reviewModules, that.reviewModules)
            && Objects.equals(this.secondaryCategoryEnabled, that.secondaryCategoryEnabled)
            && Objects.equals(this.reviewDefaultCategories, that.reviewDefaultCategories)
            && Objects.equals(this.reviewCustomizedCategories, that.reviewCustomizedCategories)
            && Objects.equals(this.isAssigneeIdRequired, that.isAssigneeIdRequired)
            && Objects.equals(this.isReviewCategoriesRequired, that.isReviewCategoriesRequired)
            && Objects.equals(this.isReviewModulesRequired, that.isReviewModulesRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriesAndModulesEnabled,
            reviewModules,
            secondaryCategoryEnabled,
            reviewDefaultCategories,
            reviewCustomizedCategories,
            isAssigneeIdRequired,
            isReviewCategoriesRequired,
            isReviewModulesRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewSettingParamDto {\n");
        sb.append("    categoriesAndModulesEnabled: ")
            .append(toIndentedString(categoriesAndModulesEnabled))
            .append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    secondaryCategoryEnabled: ").append(toIndentedString(secondaryCategoryEnabled)).append("\n");
        sb.append("    reviewDefaultCategories: ").append(toIndentedString(reviewDefaultCategories)).append("\n");
        sb.append("    reviewCustomizedCategories: ").append(toIndentedString(reviewCustomizedCategories)).append("\n");
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
