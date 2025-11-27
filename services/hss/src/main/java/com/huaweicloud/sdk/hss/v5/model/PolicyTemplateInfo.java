package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PolicyTemplateInfo
 */
public class PolicyTemplateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_kind")

    private String targetKind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraint_template")

    private String constraintTemplate;

    public PolicyTemplateInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 模板ID **取值范围**: 字符长度0-128 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PolicyTemplateInfo withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数解释**: 模板名称 **取值范围**: 字符长度1-255 
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public PolicyTemplateInfo withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * **参数解释**: 模板类型 **取值范围**: 字符长度1-16 
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public PolicyTemplateInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 描述 **取值范围**: 字符长度0-2048 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyTemplateInfo withTargetKind(String targetKind) {
        this.targetKind = targetKind;
        return this;
    }

    /**
     * **参数解释**: 策略模板应用资源类型，多个资源类型通过分号份隔连接 **取值范围**: 字符长度1-255 
     * @return targetKind
     */
    public String getTargetKind() {
        return targetKind;
    }

    public void setTargetKind(String targetKind) {
        this.targetKind = targetKind;
    }

    public PolicyTemplateInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**: 标签 **取值范围**: 字符长度0-2048 
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public PolicyTemplateInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**: 推荐级别 **取值范围**: 字符长度1-5 
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public PolicyTemplateInfo withConstraintTemplate(String constraintTemplate) {
        this.constraintTemplate = constraintTemplate;
        return this;
    }

    /**
     * **参数解释**: 策略模板内容 **取值范围**: 字符长度1-65535 
     * @return constraintTemplate
     */
    public String getConstraintTemplate() {
        return constraintTemplate;
    }

    public void setConstraintTemplate(String constraintTemplate) {
        this.constraintTemplate = constraintTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyTemplateInfo that = (PolicyTemplateInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.targetKind, that.targetKind)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.level, that.level)
            && Objects.equals(this.constraintTemplate, that.constraintTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, templateName, templateType, description, targetKind, tag, level, constraintTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTemplateInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targetKind: ").append(toIndentedString(targetKind)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    constraintTemplate: ").append(toIndentedString(constraintTemplate)).append("\n");
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
