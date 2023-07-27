package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReviewSettingDto
 */
public class ReviewSettingDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories_and_modules_enabled")

    private Boolean categoriesAndModulesEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_category_enabled")

    private Boolean secondaryCategoryEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_add_to_issue")

    private Boolean forbiddenAddToIssue;

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
    @JsonProperty(value = "source_id")

    private Integer sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_path")

    private String sourcePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_category_type")

    private String secondaryCategoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_categories")

    private List<CategoryDto> secondaryCategories = null;

    public ReviewSettingDto withCategoriesAndModulesEnabled(Boolean categoriesAndModulesEnabled) {
        this.categoriesAndModulesEnabled = categoriesAndModulesEnabled;
        return this;
    }

    /**
     * 是否开启检视意见分类和模块
     * @return categoriesAndModulesEnabled
     */
    public Boolean getCategoriesAndModulesEnabled() {
        return categoriesAndModulesEnabled;
    }

    public void setCategoriesAndModulesEnabled(Boolean categoriesAndModulesEnabled) {
        this.categoriesAndModulesEnabled = categoriesAndModulesEnabled;
    }

    public ReviewSettingDto withSecondaryCategoryEnabled(Boolean secondaryCategoryEnabled) {
        this.secondaryCategoryEnabled = secondaryCategoryEnabled;
        return this;
    }

    /**
     * 是否开启二级分类
     * @return secondaryCategoryEnabled
     */
    public Boolean getSecondaryCategoryEnabled() {
        return secondaryCategoryEnabled;
    }

    public void setSecondaryCategoryEnabled(Boolean secondaryCategoryEnabled) {
        this.secondaryCategoryEnabled = secondaryCategoryEnabled;
    }

    public ReviewSettingDto withForbiddenAddToIssue(Boolean forbiddenAddToIssue) {
        this.forbiddenAddToIssue = forbiddenAddToIssue;
        return this;
    }

    /**
     * 是否禁止关联issue
     * @return forbiddenAddToIssue
     */
    public Boolean getForbiddenAddToIssue() {
        return forbiddenAddToIssue;
    }

    public void setForbiddenAddToIssue(Boolean forbiddenAddToIssue) {
        this.forbiddenAddToIssue = forbiddenAddToIssue;
    }

    public ReviewSettingDto withPrimaryCategories(List<CategoryDto> primaryCategories) {
        this.primaryCategories = primaryCategories;
        return this;
    }

    public ReviewSettingDto addPrimaryCategoriesItem(CategoryDto primaryCategoriesItem) {
        if (this.primaryCategories == null) {
            this.primaryCategories = new ArrayList<>();
        }
        this.primaryCategories.add(primaryCategoriesItem);
        return this;
    }

    public ReviewSettingDto withPrimaryCategories(Consumer<List<CategoryDto>> primaryCategoriesSetter) {
        if (this.primaryCategories == null) {
            this.primaryCategories = new ArrayList<>();
        }
        primaryCategoriesSetter.accept(this.primaryCategories);
        return this;
    }

    /**
     * 一级分类
     * @return primaryCategories
     */
    public List<CategoryDto> getPrimaryCategories() {
        return primaryCategories;
    }

    public void setPrimaryCategories(List<CategoryDto> primaryCategories) {
        this.primaryCategories = primaryCategories;
    }

    public ReviewSettingDto withReviewDefaultCategories(List<String> reviewDefaultCategories) {
        this.reviewDefaultCategories = reviewDefaultCategories;
        return this;
    }

    public ReviewSettingDto addReviewDefaultCategoriesItem(String reviewDefaultCategoriesItem) {
        if (this.reviewDefaultCategories == null) {
            this.reviewDefaultCategories = new ArrayList<>();
        }
        this.reviewDefaultCategories.add(reviewDefaultCategoriesItem);
        return this;
    }

    public ReviewSettingDto withReviewDefaultCategories(Consumer<List<String>> reviewDefaultCategoriesSetter) {
        if (this.reviewDefaultCategories == null) {
            this.reviewDefaultCategories = new ArrayList<>();
        }
        reviewDefaultCategoriesSetter.accept(this.reviewDefaultCategories);
        return this;
    }

    /**
     * 默认分类
     * @return reviewDefaultCategories
     */
    public List<String> getReviewDefaultCategories() {
        return reviewDefaultCategories;
    }

    public void setReviewDefaultCategories(List<String> reviewDefaultCategories) {
        this.reviewDefaultCategories = reviewDefaultCategories;
    }

    public ReviewSettingDto withReviewCustomizedCategories(List<String> reviewCustomizedCategories) {
        this.reviewCustomizedCategories = reviewCustomizedCategories;
        return this;
    }

    public ReviewSettingDto addReviewCustomizedCategoriesItem(String reviewCustomizedCategoriesItem) {
        if (this.reviewCustomizedCategories == null) {
            this.reviewCustomizedCategories = new ArrayList<>();
        }
        this.reviewCustomizedCategories.add(reviewCustomizedCategoriesItem);
        return this;
    }

    public ReviewSettingDto withReviewCustomizedCategories(Consumer<List<String>> reviewCustomizedCategoriesSetter) {
        if (this.reviewCustomizedCategories == null) {
            this.reviewCustomizedCategories = new ArrayList<>();
        }
        reviewCustomizedCategoriesSetter.accept(this.reviewCustomizedCategories);
        return this;
    }

    /**
     * 自定义分类
     * @return reviewCustomizedCategories
     */
    public List<String> getReviewCustomizedCategories() {
        return reviewCustomizedCategories;
    }

    public void setReviewCustomizedCategories(List<String> reviewCustomizedCategories) {
        this.reviewCustomizedCategories = reviewCustomizedCategories;
    }

    public ReviewSettingDto withReviewModules(List<String> reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    public ReviewSettingDto addReviewModulesItem(String reviewModulesItem) {
        if (this.reviewModules == null) {
            this.reviewModules = new ArrayList<>();
        }
        this.reviewModules.add(reviewModulesItem);
        return this;
    }

    public ReviewSettingDto withReviewModules(Consumer<List<String>> reviewModulesSetter) {
        if (this.reviewModules == null) {
            this.reviewModules = new ArrayList<>();
        }
        reviewModulesSetter.accept(this.reviewModules);
        return this;
    }

    /**
     * 检视意见模块
     * @return reviewModules
     */
    public List<String> getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(List<String> reviewModules) {
        this.reviewModules = reviewModules;
    }

    public ReviewSettingDto withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 目标id
     * minimum: 1
     * maximum: 2147483647
     * @return sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public ReviewSettingDto withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 目标类型
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public ReviewSettingDto withSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    /**
     * 目标路径
     * @return sourcePath
     */
    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public ReviewSettingDto withSecondaryCategoryType(String secondaryCategoryType) {
        this.secondaryCategoryType = secondaryCategoryType;
        return this;
    }

    /**
     * 二级分类类型
     * @return secondaryCategoryType
     */
    public String getSecondaryCategoryType() {
        return secondaryCategoryType;
    }

    public void setSecondaryCategoryType(String secondaryCategoryType) {
        this.secondaryCategoryType = secondaryCategoryType;
    }

    public ReviewSettingDto withSecondaryCategories(List<CategoryDto> secondaryCategories) {
        this.secondaryCategories = secondaryCategories;
        return this;
    }

    public ReviewSettingDto addSecondaryCategoriesItem(CategoryDto secondaryCategoriesItem) {
        if (this.secondaryCategories == null) {
            this.secondaryCategories = new ArrayList<>();
        }
        this.secondaryCategories.add(secondaryCategoriesItem);
        return this;
    }

    public ReviewSettingDto withSecondaryCategories(Consumer<List<CategoryDto>> secondaryCategoriesSetter) {
        if (this.secondaryCategories == null) {
            this.secondaryCategories = new ArrayList<>();
        }
        secondaryCategoriesSetter.accept(this.secondaryCategories);
        return this;
    }

    /**
     * 二级分类
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
        ReviewSettingDto that = (ReviewSettingDto) obj;
        return Objects.equals(this.categoriesAndModulesEnabled, that.categoriesAndModulesEnabled)
            && Objects.equals(this.secondaryCategoryEnabled, that.secondaryCategoryEnabled)
            && Objects.equals(this.forbiddenAddToIssue, that.forbiddenAddToIssue)
            && Objects.equals(this.primaryCategories, that.primaryCategories)
            && Objects.equals(this.reviewDefaultCategories, that.reviewDefaultCategories)
            && Objects.equals(this.reviewCustomizedCategories, that.reviewCustomizedCategories)
            && Objects.equals(this.reviewModules, that.reviewModules) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourcePath, that.sourcePath)
            && Objects.equals(this.secondaryCategoryType, that.secondaryCategoryType)
            && Objects.equals(this.secondaryCategories, that.secondaryCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriesAndModulesEnabled,
            secondaryCategoryEnabled,
            forbiddenAddToIssue,
            primaryCategories,
            reviewDefaultCategories,
            reviewCustomizedCategories,
            reviewModules,
            sourceId,
            sourceType,
            sourcePath,
            secondaryCategoryType,
            secondaryCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewSettingDto {\n");
        sb.append("    categoriesAndModulesEnabled: ")
            .append(toIndentedString(categoriesAndModulesEnabled))
            .append("\n");
        sb.append("    secondaryCategoryEnabled: ").append(toIndentedString(secondaryCategoryEnabled)).append("\n");
        sb.append("    forbiddenAddToIssue: ").append(toIndentedString(forbiddenAddToIssue)).append("\n");
        sb.append("    primaryCategories: ").append(toIndentedString(primaryCategories)).append("\n");
        sb.append("    reviewDefaultCategories: ").append(toIndentedString(reviewDefaultCategories)).append("\n");
        sb.append("    reviewCustomizedCategories: ").append(toIndentedString(reviewCustomizedCategories)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourcePath: ").append(toIndentedString(sourcePath)).append("\n");
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
