package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** RulesetItem */
public class RulesetItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_create_time")

    private String templateCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_used")

    private String isUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private String ruleIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private String isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_devcloud_project_default")

    private String isDevcloudProjectDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_template")

    private String isDefaultTemplate;

    public RulesetItem withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /** 规则集id
     * 
     * @return templateId */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public RulesetItem withLanguage(String language) {
        this.language = language;
        return this;
    }

    /** 规则集语言
     * 
     * @return language */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public RulesetItem withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /** 规则集名称
     * 
     * @return templateName */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public RulesetItem withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /** 创建人ID
     * 
     * @return creatorId */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public RulesetItem withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /** 创建人名称
     * 
     * @return creatorName */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public RulesetItem withTemplateCreateTime(String templateCreateTime) {
        this.templateCreateTime = templateCreateTime;
        return this;
    }

    /** 创建人时间
     * 
     * @return templateCreateTime */
    public String getTemplateCreateTime() {
        return templateCreateTime;
    }

    public void setTemplateCreateTime(String templateCreateTime) {
        this.templateCreateTime = templateCreateTime;
    }

    public RulesetItem withIsUsed(String isUsed) {
        this.isUsed = isUsed;
        return this;
    }

    /** 使用状态1使用中，0空闲中
     * 
     * @return isUsed */
    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public RulesetItem withRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    /** 规则集包含的规则id
     * 
     * @return ruleIds */
    public String getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
    }

    public RulesetItem withIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /** 是否默认规则集，0不是，1是
     * 
     * @return isDefault */
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public RulesetItem withIsDevcloudProjectDefault(String isDevcloudProjectDefault) {
        this.isDevcloudProjectDefault = isDevcloudProjectDefault;
        return this;
    }

    /** 是否是项目下语言默认规则集，0不是，1是
     * 
     * @return isDevcloudProjectDefault */
    public String getIsDevcloudProjectDefault() {
        return isDevcloudProjectDefault;
    }

    public void setIsDevcloudProjectDefault(String isDevcloudProjectDefault) {
        this.isDevcloudProjectDefault = isDevcloudProjectDefault;
    }

    public RulesetItem withIsDefaultTemplate(String isDefaultTemplate) {
        this.isDefaultTemplate = isDefaultTemplate;
        return this;
    }

    /** 是否该语言默认规则集，0不是，1是
     * 
     * @return isDefaultTemplate */
    public String getIsDefaultTemplate() {
        return isDefaultTemplate;
    }

    public void setIsDefaultTemplate(String isDefaultTemplate) {
        this.isDefaultTemplate = isDefaultTemplate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RulesetItem rulesetItem = (RulesetItem) o;
        return Objects.equals(this.templateId, rulesetItem.templateId)
            && Objects.equals(this.language, rulesetItem.language)
            && Objects.equals(this.templateName, rulesetItem.templateName)
            && Objects.equals(this.creatorId, rulesetItem.creatorId)
            && Objects.equals(this.creatorName, rulesetItem.creatorName)
            && Objects.equals(this.templateCreateTime, rulesetItem.templateCreateTime)
            && Objects.equals(this.isUsed, rulesetItem.isUsed) && Objects.equals(this.ruleIds, rulesetItem.ruleIds)
            && Objects.equals(this.isDefault, rulesetItem.isDefault)
            && Objects.equals(this.isDevcloudProjectDefault, rulesetItem.isDevcloudProjectDefault)
            && Objects.equals(this.isDefaultTemplate, rulesetItem.isDefaultTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            language,
            templateName,
            creatorId,
            creatorName,
            templateCreateTime,
            isUsed,
            ruleIds,
            isDefault,
            isDevcloudProjectDefault,
            isDefaultTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RulesetItem {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    templateCreateTime: ").append(toIndentedString(templateCreateTime)).append("\n");
        sb.append("    isUsed: ").append(toIndentedString(isUsed)).append("\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    isDevcloudProjectDefault: ").append(toIndentedString(isDevcloudProjectDefault)).append("\n");
        sb.append("    isDefaultTemplate: ").append(toIndentedString(isDefaultTemplate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
