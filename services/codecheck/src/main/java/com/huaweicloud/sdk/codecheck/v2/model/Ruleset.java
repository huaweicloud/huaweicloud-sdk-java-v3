package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建规则集信息
 */
public class Ruleset {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private String isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private String ruleIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uncheck_ids")

    private String uncheckIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_attributes")

    private List<CustomAttributes> customAttributes = null;

    public Ruleset withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Ruleset withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 新规则集名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Ruleset withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 规则集语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Ruleset withIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 如果有基于的规则集则是1，没有基于的规则集则是0
     * @return isDefault
     */
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Ruleset withRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    /**
     * 新启用规则ids
     * @return ruleIds
     */
    public String getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
    }

    public Ruleset withUncheckIds(String uncheckIds) {
        this.uncheckIds = uncheckIds;
        return this;
    }

    /**
     * 新关闭规则id
     * @return uncheckIds
     */
    public String getUncheckIds() {
        return uncheckIds;
    }

    public void setUncheckIds(String uncheckIds) {
        this.uncheckIds = uncheckIds;
    }

    public Ruleset withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 规则集ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Ruleset withCustomAttributes(List<CustomAttributes> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    public Ruleset addCustomAttributesItem(CustomAttributes customAttributesItem) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        this.customAttributes.add(customAttributesItem);
        return this;
    }

    public Ruleset withCustomAttributes(Consumer<List<CustomAttributes>> customAttributesSetter) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        customAttributesSetter.accept(this.customAttributes);
        return this;
    }

    /**
     * 自定义规则参数项，支持修改规则阈值
     * @return customAttributes
     */
    public List<CustomAttributes> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<CustomAttributes> customAttributes) {
        this.customAttributes = customAttributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ruleset ruleset = (Ruleset) o;
        return Objects.equals(this.projectId, ruleset.projectId)
            && Objects.equals(this.templateName, ruleset.templateName)
            && Objects.equals(this.language, ruleset.language) && Objects.equals(this.isDefault, ruleset.isDefault)
            && Objects.equals(this.ruleIds, ruleset.ruleIds) && Objects.equals(this.uncheckIds, ruleset.uncheckIds)
            && Objects.equals(this.templateId, ruleset.templateId)
            && Objects.equals(this.customAttributes, ruleset.customAttributes);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(projectId, templateName, language, isDefault, ruleIds, uncheckIds, templateId, customAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ruleset {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    uncheckIds: ").append(toIndentedString(uncheckIds)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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
