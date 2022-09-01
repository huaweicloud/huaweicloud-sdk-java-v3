package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateInfo
 */
public class TemplateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private Integer templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    @JacksonXmlProperty(localName = "template")

    private QueryTransTemplate template;

    public TemplateInfo withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 转码模板ID。 
     * minimum: 0
     * maximum: 2147483647
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public TemplateInfo withTemplate(QueryTransTemplate template) {
        this.template = template;
        return this;
    }

    public TemplateInfo withTemplate(Consumer<QueryTransTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new QueryTransTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public QueryTransTemplate getTemplate() {
        return template;
    }

    public void setTemplate(QueryTransTemplate template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) o;
        return Objects.equals(this.templateId, templateInfo.templateId)
            && Objects.equals(this.template, templateInfo.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateInfo {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
