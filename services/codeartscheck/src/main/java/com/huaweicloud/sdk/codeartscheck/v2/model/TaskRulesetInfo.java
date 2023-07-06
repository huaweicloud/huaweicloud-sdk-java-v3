package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskRulesetInfo
 */
public class TaskRulesetInfo {

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public TaskRulesetInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 规则集id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TaskRulesetInfo withLanguage(String language) {
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

    public TaskRulesetInfo withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 规则集名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public TaskRulesetInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 规则集状态optional：可选，selected：已选
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskRulesetInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 规则集属性0 是默认用户规则集,1 是系统默认规则集
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskRulesetInfo that = (TaskRulesetInfo) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.language, that.language)
            && Objects.equals(this.templateName, that.templateName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, language, templateName, type, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskRulesetInfo {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
