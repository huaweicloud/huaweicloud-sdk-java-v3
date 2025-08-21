package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检视意见模板返回体
 */
public class DiscussionTemplateDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_id")

    private Integer assigneeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private String categories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories_en")

    private String categoriesEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories_cn")

    private String categoriesCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<String> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_severity")

    private String reviewSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Integer creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private UserBasicDto creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserBasicDto assignee;

    public DiscussionTemplateDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 检视意见模板主键id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DiscussionTemplateDto withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数解释：** 模板名称。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public DiscussionTemplateDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DiscussionTemplateDto withAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * **参数解释：** 默认指派人。
     * minimum: 1
     * maximum: 2147483647
     * @return assigneeId
     */
    public Integer getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    public DiscussionTemplateDto withCategories(String categories) {
        this.categories = categories;
        return this;
    }

    /**
     * **参数解释：** 意见分类key。
     * @return categories
     */
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public DiscussionTemplateDto withCategoriesEn(String categoriesEn) {
        this.categoriesEn = categoriesEn;
        return this;
    }

    /**
     * **参数解释：** 意见分类英文。
     * @return categoriesEn
     */
    public String getCategoriesEn() {
        return categoriesEn;
    }

    public void setCategoriesEn(String categoriesEn) {
        this.categoriesEn = categoriesEn;
    }

    public DiscussionTemplateDto withCategoriesCn(String categoriesCn) {
        this.categoriesCn = categoriesCn;
        return this;
    }

    /**
     * **参数解释：** 意见分类中文。
     * @return categoriesCn
     */
    public String getCategoriesCn() {
        return categoriesCn;
    }

    public void setCategoriesCn(String categoriesCn) {
        this.categoriesCn = categoriesCn;
    }

    public DiscussionTemplateDto withModules(List<String> modules) {
        this.modules = modules;
        return this;
    }

    public DiscussionTemplateDto addModulesItem(String modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public DiscussionTemplateDto withModules(Consumer<List<String>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * **参数解释：** 检视意见模块。
     * @return modules
     */
    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public DiscussionTemplateDto withReviewSeverity(String reviewSeverity) {
        this.reviewSeverity = reviewSeverity;
        return this;
    }

    /**
     * **参数解释：** 严重程度key。
     * @return reviewSeverity
     */
    public String getReviewSeverity() {
        return reviewSeverity;
    }

    public void setReviewSeverity(String reviewSeverity) {
        this.reviewSeverity = reviewSeverity;
    }

    public DiscussionTemplateDto withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释：** 是否设置为默认模板。
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public DiscussionTemplateDto withCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释：** 模板作者id。
     * minimum: 1
     * maximum: 2147483647
     * @return creatorId
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public DiscussionTemplateDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DiscussionTemplateDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DiscussionTemplateDto withCreator(UserBasicDto creator) {
        this.creator = creator;
        return this;
    }

    public DiscussionTemplateDto withCreator(Consumer<UserBasicDto> creatorSetter) {
        if (this.creator == null) {
            this.creator = new UserBasicDto();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public UserBasicDto getCreator() {
        return creator;
    }

    public void setCreator(UserBasicDto creator) {
        this.creator = creator;
    }

    public DiscussionTemplateDto withAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
        return this;
    }

    public DiscussionTemplateDto withAssignee(Consumer<UserBasicDto> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new UserBasicDto();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public UserBasicDto getAssignee() {
        return assignee;
    }

    public void setAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiscussionTemplateDto that = (DiscussionTemplateDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.assigneeId, that.assigneeId)
            && Objects.equals(this.categories, that.categories) && Objects.equals(this.categoriesEn, that.categoriesEn)
            && Objects.equals(this.categoriesCn, that.categoriesCn) && Objects.equals(this.modules, that.modules)
            && Objects.equals(this.reviewSeverity, that.reviewSeverity)
            && Objects.equals(this.isDefault, that.isDefault) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            templateName,
            description,
            assigneeId,
            categories,
            categoriesEn,
            categoriesCn,
            modules,
            reviewSeverity,
            isDefault,
            creatorId,
            createdAt,
            updatedAt,
            creator,
            assignee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscussionTemplateDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    categoriesEn: ").append(toIndentedString(categoriesEn)).append("\n");
        sb.append("    categoriesCn: ").append(toIndentedString(categoriesCn)).append("\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
        sb.append("    reviewSeverity: ").append(toIndentedString(reviewSeverity)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
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
