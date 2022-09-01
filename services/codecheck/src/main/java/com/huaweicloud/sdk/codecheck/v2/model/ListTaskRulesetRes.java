package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ListTaskRulesetRes
 */
public class ListTaskRulesetRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    @JacksonXmlProperty(localName = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    public ListTaskRulesetRes withTemplateId(String templateId) {
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

    public ListTaskRulesetRes withLanguage(String language) {
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

    public ListTaskRulesetRes withTemplateName(String templateName) {
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

    public ListTaskRulesetRes withType(String type) {
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

    public ListTaskRulesetRes withStatus(String status) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTaskRulesetRes listTaskRulesetRes = (ListTaskRulesetRes) o;
        return Objects.equals(this.templateId, listTaskRulesetRes.templateId)
            && Objects.equals(this.language, listTaskRulesetRes.language)
            && Objects.equals(this.templateName, listTaskRulesetRes.templateName)
            && Objects.equals(this.type, listTaskRulesetRes.type)
            && Objects.equals(this.status, listTaskRulesetRes.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, language, templateName, type, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskRulesetRes {\n");
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
