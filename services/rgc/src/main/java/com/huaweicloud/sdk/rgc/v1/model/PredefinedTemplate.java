package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 预置模板信息。
 */
public class PredefinedTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    private String templateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_category")

    private String templateCategory;

    public PredefinedTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public PredefinedTemplate withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * 模板描述。
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public PredefinedTemplate withTemplateCategory(String templateCategory) {
        this.templateCategory = templateCategory;
        return this;
    }

    /**
     * 模板类别
     * @return templateCategory
     */
    public String getTemplateCategory() {
        return templateCategory;
    }

    public void setTemplateCategory(String templateCategory) {
        this.templateCategory = templateCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PredefinedTemplate that = (PredefinedTemplate) obj;
        return Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateDescription, that.templateDescription)
            && Objects.equals(this.templateCategory, that.templateCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateDescription, templateCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PredefinedTemplate {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    templateCategory: ").append(toIndentedString(templateCategory)).append("\n");
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
