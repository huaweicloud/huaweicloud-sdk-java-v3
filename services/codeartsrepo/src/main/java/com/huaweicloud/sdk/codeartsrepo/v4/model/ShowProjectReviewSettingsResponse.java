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
public class ShowProjectReviewSettingsResponse extends SdkResponse {

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
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_required_attributes")

    private List<RequiredAttributeDto> noteRequiredAttributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_default_categories")

    private List<CategoryDto> codehubDefaultCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hicode_default_categories")

    private List<CategoryDto> hicodeDefaultCategories = null;

    public ShowProjectReviewSettingsResponse withCategoriesAndModulesEnabled(Boolean categoriesAndModulesEnabled) {
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

    public ShowProjectReviewSettingsResponse withSecondaryCategoryEnabled(Boolean secondaryCategoryEnabled) {
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

    public ShowProjectReviewSettingsResponse withPrimaryCategories(List<CategoryDto> primaryCategories) {
        this.primaryCategories = primaryCategories;
        return this;
    }

    public ShowProjectReviewSettingsResponse addPrimaryCategoriesItem(CategoryDto primaryCategoriesItem) {
        if (this.primaryCategories == null) {
            this.primaryCategories = new ArrayList<>();
        }
        this.primaryCategories.add(primaryCategoriesItem);
        return this;
    }

    public ShowProjectReviewSettingsResponse withPrimaryCategories(
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

    public ShowProjectReviewSettingsResponse withReviewDefaultCategories(List<String> reviewDefaultCategories) {
        this.reviewDefaultCategories = reviewDefaultCategories;
        return this;
    }

    public ShowProjectReviewSettingsResponse addReviewDefaultCategoriesItem(String reviewDefaultCategoriesItem) {
        if (this.reviewDefaultCategories == null) {
            this.reviewDefaultCategories = new ArrayList<>();
        }
        this.reviewDefaultCategories.add(reviewDefaultCategoriesItem);
        return this;
    }

    public ShowProjectReviewSettingsResponse withReviewDefaultCategories(
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

    public ShowProjectReviewSettingsResponse withReviewCustomizedCategories(List<String> reviewCustomizedCategories) {
        this.reviewCustomizedCategories = reviewCustomizedCategories;
        return this;
    }

    public ShowProjectReviewSettingsResponse addReviewCustomizedCategoriesItem(String reviewCustomizedCategoriesItem) {
        if (this.reviewCustomizedCategories == null) {
            this.reviewCustomizedCategories = new ArrayList<>();
        }
        this.reviewCustomizedCategories.add(reviewCustomizedCategoriesItem);
        return this;
    }

    public ShowProjectReviewSettingsResponse withReviewCustomizedCategories(
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

    public ShowProjectReviewSettingsResponse withReviewModules(List<String> reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    public ShowProjectReviewSettingsResponse addReviewModulesItem(String reviewModulesItem) {
        if (this.reviewModules == null) {
            this.reviewModules = new ArrayList<>();
        }
        this.reviewModules.add(reviewModulesItem);
        return this;
    }

    public ShowProjectReviewSettingsResponse withReviewModules(Consumer<List<String>> reviewModulesSetter) {
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

    public ShowProjectReviewSettingsResponse withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库id。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowProjectReviewSettingsResponse withNoteRequiredAttributes(
        List<RequiredAttributeDto> noteRequiredAttributes) {
        this.noteRequiredAttributes = noteRequiredAttributes;
        return this;
    }

    public ShowProjectReviewSettingsResponse addNoteRequiredAttributesItem(
        RequiredAttributeDto noteRequiredAttributesItem) {
        if (this.noteRequiredAttributes == null) {
            this.noteRequiredAttributes = new ArrayList<>();
        }
        this.noteRequiredAttributes.add(noteRequiredAttributesItem);
        return this;
    }

    public ShowProjectReviewSettingsResponse withNoteRequiredAttributes(
        Consumer<List<RequiredAttributeDto>> noteRequiredAttributesSetter) {
        if (this.noteRequiredAttributes == null) {
            this.noteRequiredAttributes = new ArrayList<>();
        }
        noteRequiredAttributesSetter.accept(this.noteRequiredAttributes);
        return this;
    }

    /**
     * **参数解释：** 检视意见必填项。
     * @return noteRequiredAttributes
     */
    public List<RequiredAttributeDto> getNoteRequiredAttributes() {
        return noteRequiredAttributes;
    }

    public void setNoteRequiredAttributes(List<RequiredAttributeDto> noteRequiredAttributes) {
        this.noteRequiredAttributes = noteRequiredAttributes;
    }

    public ShowProjectReviewSettingsResponse withCodehubDefaultCategories(List<CategoryDto> codehubDefaultCategories) {
        this.codehubDefaultCategories = codehubDefaultCategories;
        return this;
    }

    public ShowProjectReviewSettingsResponse addCodehubDefaultCategoriesItem(CategoryDto codehubDefaultCategoriesItem) {
        if (this.codehubDefaultCategories == null) {
            this.codehubDefaultCategories = new ArrayList<>();
        }
        this.codehubDefaultCategories.add(codehubDefaultCategoriesItem);
        return this;
    }

    public ShowProjectReviewSettingsResponse withCodehubDefaultCategories(
        Consumer<List<CategoryDto>> codehubDefaultCategoriesSetter) {
        if (this.codehubDefaultCategories == null) {
            this.codehubDefaultCategories = new ArrayList<>();
        }
        codehubDefaultCategoriesSetter.accept(this.codehubDefaultCategories);
        return this;
    }

    /**
     * **参数解释：** 检视意见分类(所有可勾选的，需传参with_default_review_categories: true才返回)。
     * @return codehubDefaultCategories
     */
    public List<CategoryDto> getCodehubDefaultCategories() {
        return codehubDefaultCategories;
    }

    public void setCodehubDefaultCategories(List<CategoryDto> codehubDefaultCategories) {
        this.codehubDefaultCategories = codehubDefaultCategories;
    }

    public ShowProjectReviewSettingsResponse withHicodeDefaultCategories(List<CategoryDto> hicodeDefaultCategories) {
        this.hicodeDefaultCategories = hicodeDefaultCategories;
        return this;
    }

    public ShowProjectReviewSettingsResponse addHicodeDefaultCategoriesItem(CategoryDto hicodeDefaultCategoriesItem) {
        if (this.hicodeDefaultCategories == null) {
            this.hicodeDefaultCategories = new ArrayList<>();
        }
        this.hicodeDefaultCategories.add(hicodeDefaultCategoriesItem);
        return this;
    }

    public ShowProjectReviewSettingsResponse withHicodeDefaultCategories(
        Consumer<List<CategoryDto>> hicodeDefaultCategoriesSetter) {
        if (this.hicodeDefaultCategories == null) {
            this.hicodeDefaultCategories = new ArrayList<>();
        }
        hicodeDefaultCategoriesSetter.accept(this.hicodeDefaultCategories);
        return this;
    }

    /**
     * **参数解释：** 系统预置检视意见分类(需传参with_default_review_categories: true才返回)。
     * @return hicodeDefaultCategories
     */
    public List<CategoryDto> getHicodeDefaultCategories() {
        return hicodeDefaultCategories;
    }

    public void setHicodeDefaultCategories(List<CategoryDto> hicodeDefaultCategories) {
        this.hicodeDefaultCategories = hicodeDefaultCategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectReviewSettingsResponse that = (ShowProjectReviewSettingsResponse) obj;
        return Objects.equals(this.categoriesAndModulesEnabled, that.categoriesAndModulesEnabled)
            && Objects.equals(this.secondaryCategoryEnabled, that.secondaryCategoryEnabled)
            && Objects.equals(this.primaryCategories, that.primaryCategories)
            && Objects.equals(this.reviewDefaultCategories, that.reviewDefaultCategories)
            && Objects.equals(this.reviewCustomizedCategories, that.reviewCustomizedCategories)
            && Objects.equals(this.reviewModules, that.reviewModules)
            && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.noteRequiredAttributes, that.noteRequiredAttributes)
            && Objects.equals(this.codehubDefaultCategories, that.codehubDefaultCategories)
            && Objects.equals(this.hicodeDefaultCategories, that.hicodeDefaultCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriesAndModulesEnabled,
            secondaryCategoryEnabled,
            primaryCategories,
            reviewDefaultCategories,
            reviewCustomizedCategories,
            reviewModules,
            repositoryId,
            noteRequiredAttributes,
            codehubDefaultCategories,
            hicodeDefaultCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectReviewSettingsResponse {\n");
        sb.append("    categoriesAndModulesEnabled: ")
            .append(toIndentedString(categoriesAndModulesEnabled))
            .append("\n");
        sb.append("    secondaryCategoryEnabled: ").append(toIndentedString(secondaryCategoryEnabled)).append("\n");
        sb.append("    primaryCategories: ").append(toIndentedString(primaryCategories)).append("\n");
        sb.append("    reviewDefaultCategories: ").append(toIndentedString(reviewDefaultCategories)).append("\n");
        sb.append("    reviewCustomizedCategories: ").append(toIndentedString(reviewCustomizedCategories)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    noteRequiredAttributes: ").append(toIndentedString(noteRequiredAttributes)).append("\n");
        sb.append("    codehubDefaultCategories: ").append(toIndentedString(codehubDefaultCategories)).append("\n");
        sb.append("    hicodeDefaultCategories: ").append(toIndentedString(hicodeDefaultCategories)).append("\n");
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
