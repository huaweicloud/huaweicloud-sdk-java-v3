package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 仓库合并请求模板返回体
 */
public class GroupMergeRequestTemplateDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_title")

    private String mergeRequestTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_wip")

    private Boolean isWip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_extract_mr_title")

    private Integer autoExtractMrTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private UserBasicDto creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    public GroupMergeRequestTemplateDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 合并请求模板主键id
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

    public GroupMergeRequestTemplateDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库id
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

    public GroupMergeRequestTemplateDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GroupMergeRequestTemplateDto withCreatedAt(String createdAt) {
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

    public GroupMergeRequestTemplateDto withUpdatedAt(String updatedAt) {
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

    public GroupMergeRequestTemplateDto withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数解释：** 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public GroupMergeRequestTemplateDto withMergeRequestTitle(String mergeRequestTitle) {
        this.mergeRequestTitle = mergeRequestTitle;
        return this;
    }

    /**
     * **参数解释：** 合并请求标题（不自动提取合并请求标题时生效）
     * @return mergeRequestTitle
     */
    public String getMergeRequestTitle() {
        return mergeRequestTitle;
    }

    public void setMergeRequestTitle(String mergeRequestTitle) {
        this.mergeRequestTitle = mergeRequestTitle;
    }

    public GroupMergeRequestTemplateDto withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释：** 是否设置为默认模板
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public GroupMergeRequestTemplateDto withIsWip(Boolean isWip) {
        this.isWip = isWip;
        return this;
    }

    /**
     * **参数解释：** 是否在标题中添加[WIP]
     * @return isWip
     */
    public Boolean getIsWip() {
        return isWip;
    }

    public void setIsWip(Boolean isWip) {
        this.isWip = isWip;
    }

    public GroupMergeRequestTemplateDto withAutoExtractMrTitle(Integer autoExtractMrTitle) {
        this.autoExtractMrTitle = autoExtractMrTitle;
        return this;
    }

    /**
     * **参数解释：** 自动提取合并请求标题 0：不提取 1：提取提交信息 2：提取e2e单标题
     * minimum: 0
     * maximum: 2
     * @return autoExtractMrTitle
     */
    public Integer getAutoExtractMrTitle() {
        return autoExtractMrTitle;
    }

    public void setAutoExtractMrTitle(Integer autoExtractMrTitle) {
        this.autoExtractMrTitle = autoExtractMrTitle;
    }

    public GroupMergeRequestTemplateDto withCreator(UserBasicDto creator) {
        this.creator = creator;
        return this;
    }

    public GroupMergeRequestTemplateDto withCreator(Consumer<UserBasicDto> creatorSetter) {
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

    public GroupMergeRequestTemplateDto withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id。
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupMergeRequestTemplateDto that = (GroupMergeRequestTemplateDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.mergeRequestTitle, that.mergeRequestTitle)
            && Objects.equals(this.isDefault, that.isDefault) && Objects.equals(this.isWip, that.isWip)
            && Objects.equals(this.autoExtractMrTitle, that.autoExtractMrTitle)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            repositoryId,
            description,
            createdAt,
            updatedAt,
            templateName,
            mergeRequestTitle,
            isDefault,
            isWip,
            autoExtractMrTitle,
            creator,
            groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupMergeRequestTemplateDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    mergeRequestTitle: ").append(toIndentedString(mergeRequestTitle)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    isWip: ").append(toIndentedString(isWip)).append("\n");
        sb.append("    autoExtractMrTitle: ").append(toIndentedString(autoExtractMrTitle)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
