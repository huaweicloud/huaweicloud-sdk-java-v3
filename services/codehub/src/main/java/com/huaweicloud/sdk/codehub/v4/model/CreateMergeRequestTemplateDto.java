package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateMergeRequestTemplateDto
 */
public class CreateMergeRequestTemplateDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_title")

    private String mergeRequestTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_extract_mr_title")

    private Integer autoExtractMrTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_wip")

    private Boolean isWip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public CreateMergeRequestTemplateDto withTemplateName(String templateName) {
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

    public CreateMergeRequestTemplateDto withMergeRequestTitle(String mergeRequestTitle) {
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

    public CreateMergeRequestTemplateDto withDescription(String description) {
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

    public CreateMergeRequestTemplateDto withAutoExtractMrTitle(Integer autoExtractMrTitle) {
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

    public CreateMergeRequestTemplateDto withIsWip(Boolean isWip) {
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

    public CreateMergeRequestTemplateDto withIsDefault(Boolean isDefault) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMergeRequestTemplateDto that = (CreateMergeRequestTemplateDto) obj;
        return Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.mergeRequestTitle, that.mergeRequestTitle)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.autoExtractMrTitle, that.autoExtractMrTitle)
            && Objects.equals(this.isWip, that.isWip) && Objects.equals(this.isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, mergeRequestTitle, description, autoExtractMrTitle, isWip, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMergeRequestTemplateDto {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    mergeRequestTitle: ").append(toIndentedString(mergeRequestTitle)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    autoExtractMrTitle: ").append(toIndentedString(autoExtractMrTitle)).append("\n");
        sb.append("    isWip: ").append(toIndentedString(isWip)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
