package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateGroupReviewSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories_and_modules_enabled")

    private Boolean categoriesAndModulesEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_category_enabled")

    private Boolean secondaryCategoryEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_categories")

    private List<CategoryDto> primaryCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_default_categories")

    private List<String> reviewDefaultCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_customized_categories")

    private List<String> reviewCustomizedCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_modules")

    private List<String> reviewModules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_category_type")

    private String secondaryCategoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_categories")

    private List<CategoryDto> secondaryCategories = null;

    public UpdateGroupReviewSettingsResponse withCategoriesAndModulesEnabled(Boolean categoriesAndModulesEnabled) {
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

    public UpdateGroupReviewSettingsResponse withSecondaryCategoryEnabled(Boolean secondaryCategoryEnabled) {
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

    public UpdateGroupReviewSettingsResponse withPrimaryCategories(List<CategoryDto> primaryCategories) {
        this.primaryCategories = primaryCategories;
        return this;
    }

    public UpdateGroupReviewSettingsResponse addPrimaryCategoriesItem(CategoryDto primaryCategoriesItem) {
        if (this.primaryCategories == null) {
            this.primaryCategories = new ArrayList<>();
        }
        this.primaryCategories.add(primaryCategoriesItem);
        return this;
    }

    public UpdateGroupReviewSettingsResponse withPrimaryCategories(
        Consumer<List<CategoryDto>> primaryCategoriesSetter) {
        if (this.primaryCategories == null) {
            this.primaryCategories = new ArrayList<>();
        }
        primaryCategoriesSetter.accept(this.primaryCategories);
        return this;
    }

    /**
     * **参数解释：** 检视意见分类(已勾选)。
     * @return primaryCategories
     */
    public List<CategoryDto> getPrimaryCategories() {
        return primaryCategories;
    }

    public void setPrimaryCategories(List<CategoryDto> primaryCategories) {
        this.primaryCategories = primaryCategories;
    }

    public UpdateGroupReviewSettingsResponse withReviewDefaultCategories(List<String> reviewDefaultCategories) {
        this.reviewDefaultCategories = reviewDefaultCategories;
        return this;
    }

    public UpdateGroupReviewSettingsResponse addReviewDefaultCategoriesItem(String reviewDefaultCategoriesItem) {
        if (this.reviewDefaultCategories == null) {
            this.reviewDefaultCategories = new ArrayList<>();
        }
        this.reviewDefaultCategories.add(reviewDefaultCategoriesItem);
        return this;
    }

    public UpdateGroupReviewSettingsResponse withReviewDefaultCategories(
        Consumer<List<String>> reviewDefaultCategoriesSetter) {
        if (this.reviewDefaultCategories == null) {
            this.reviewDefaultCategories = new ArrayList<>();
        }
        reviewDefaultCategoriesSetter.accept(this.reviewDefaultCategories);
        return this;
    }

    /**
     * **参数解释：** 检视意见分类的key(已勾选)。
     * @return reviewDefaultCategories
     */
    public List<String> getReviewDefaultCategories() {
        return reviewDefaultCategories;
    }

    public void setReviewDefaultCategories(List<String> reviewDefaultCategories) {
        this.reviewDefaultCategories = reviewDefaultCategories;
    }

    public UpdateGroupReviewSettingsResponse withReviewCustomizedCategories(List<String> reviewCustomizedCategories) {
        this.reviewCustomizedCategories = reviewCustomizedCategories;
        return this;
    }

    public UpdateGroupReviewSettingsResponse addReviewCustomizedCategoriesItem(String reviewCustomizedCategoriesItem) {
        if (this.reviewCustomizedCategories == null) {
            this.reviewCustomizedCategories = new ArrayList<>();
        }
        this.reviewCustomizedCategories.add(reviewCustomizedCategoriesItem);
        return this;
    }

    public UpdateGroupReviewSettingsResponse withReviewCustomizedCategories(
        Consumer<List<String>> reviewCustomizedCategoriesSetter) {
        if (this.reviewCustomizedCategories == null) {
            this.reviewCustomizedCategories = new ArrayList<>();
        }
        reviewCustomizedCategoriesSetter.accept(this.reviewCustomizedCategories);
        return this;
    }

    /**
     * **参数解释：** 自定义分类。
     * @return reviewCustomizedCategories
     */
    public List<String> getReviewCustomizedCategories() {
        return reviewCustomizedCategories;
    }

    public void setReviewCustomizedCategories(List<String> reviewCustomizedCategories) {
        this.reviewCustomizedCategories = reviewCustomizedCategories;
    }

    public UpdateGroupReviewSettingsResponse withReviewModules(List<String> reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    public UpdateGroupReviewSettingsResponse addReviewModulesItem(String reviewModulesItem) {
        if (this.reviewModules == null) {
            this.reviewModules = new ArrayList<>();
        }
        this.reviewModules.add(reviewModulesItem);
        return this;
    }

    public UpdateGroupReviewSettingsResponse withReviewModules(Consumer<List<String>> reviewModulesSetter) {
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

    public UpdateGroupReviewSettingsResponse withSecondaryCategoryType(String secondaryCategoryType) {
        this.secondaryCategoryType = secondaryCategoryType;
        return this;
    }

    /**
     * **参数解释：** 系统预置检视意见分类类型(启用系统预置检视意见分类时返回，默认'HiCode')。
     * @return secondaryCategoryType
     */
    public String getSecondaryCategoryType() {
        return secondaryCategoryType;
    }

    public void setSecondaryCategoryType(String secondaryCategoryType) {
        this.secondaryCategoryType = secondaryCategoryType;
    }

    public UpdateGroupReviewSettingsResponse withSecondaryCategories(List<CategoryDto> secondaryCategories) {
        this.secondaryCategories = secondaryCategories;
        return this;
    }

    public UpdateGroupReviewSettingsResponse addSecondaryCategoriesItem(CategoryDto secondaryCategoriesItem) {
        if (this.secondaryCategories == null) {
            this.secondaryCategories = new ArrayList<>();
        }
        this.secondaryCategories.add(secondaryCategoriesItem);
        return this;
    }

    public UpdateGroupReviewSettingsResponse withSecondaryCategories(
        Consumer<List<CategoryDto>> secondaryCategoriesSetter) {
        if (this.secondaryCategories == null) {
            this.secondaryCategories = new ArrayList<>();
        }
        secondaryCategoriesSetter.accept(this.secondaryCategories);
        return this;
    }

    /**
     * **参数解释：** 系统预置检视意见分类详情(启用系统预置检视意见分类时返回)。
     * @return secondaryCategories
     */
    public List<CategoryDto> getSecondaryCategories() {
        return secondaryCategories;
    }

    public void setSecondaryCategories(List<CategoryDto> secondaryCategories) {
        this.secondaryCategories = secondaryCategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupReviewSettingsResponse that = (UpdateGroupReviewSettingsResponse) obj;
        return Objects.equals(this.categoriesAndModulesEnabled, that.categoriesAndModulesEnabled)
            && Objects.equals(this.secondaryCategoryEnabled, that.secondaryCategoryEnabled)
            && Objects.equals(this.primaryCategories, that.primaryCategories)
            && Objects.equals(this.reviewDefaultCategories, that.reviewDefaultCategories)
            && Objects.equals(this.reviewCustomizedCategories, that.reviewCustomizedCategories)
            && Objects.equals(this.reviewModules, that.reviewModules)
            && Objects.equals(this.secondaryCategoryType, that.secondaryCategoryType)
            && Objects.equals(this.secondaryCategories, that.secondaryCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriesAndModulesEnabled,
            secondaryCategoryEnabled,
            primaryCategories,
            reviewDefaultCategories,
            reviewCustomizedCategories,
            reviewModules,
            secondaryCategoryType,
            secondaryCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupReviewSettingsResponse {\n");
        sb.append("    categoriesAndModulesEnabled: ")
            .append(toIndentedString(categoriesAndModulesEnabled))
            .append("\n");
        sb.append("    secondaryCategoryEnabled: ").append(toIndentedString(secondaryCategoryEnabled)).append("\n");
        sb.append("    primaryCategories: ").append(toIndentedString(primaryCategories)).append("\n");
        sb.append("    reviewDefaultCategories: ").append(toIndentedString(reviewDefaultCategories)).append("\n");
        sb.append("    reviewCustomizedCategories: ").append(toIndentedString(reviewCustomizedCategories)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    secondaryCategoryType: ").append(toIndentedString(secondaryCategoryType)).append("\n");
        sb.append("    secondaryCategories: ").append(toIndentedString(secondaryCategories)).append("\n");
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
