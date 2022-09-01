package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * TemplateViewHistory
 */
public class TemplateViewHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_title")

    @JacksonXmlProperty(localName = "template_title")

    private String templateTitle;

    public TemplateViewHistory withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板的id。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TemplateViewHistory withTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
        return this;
    }

    /**
     * 模板的名称。
     * @return templateTitle
     */
    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateViewHistory templateViewHistory = (TemplateViewHistory) o;
        return Objects.equals(this.templateId, templateViewHistory.templateId)
            && Objects.equals(this.templateTitle, templateViewHistory.templateTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateViewHistory {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateTitle: ").append(toIndentedString(templateTitle)).append("\n");
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
