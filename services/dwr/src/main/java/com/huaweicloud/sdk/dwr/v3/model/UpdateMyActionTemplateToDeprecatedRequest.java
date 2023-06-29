package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdateMyActionTemplateToDeprecatedRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    public UpdateMyActionTemplateToDeprecatedRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 申请禁用的三方算子名称。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateMyActionTemplateToDeprecatedRequest that = (UpdateMyActionTemplateToDeprecatedRequest) obj;
        return Objects.equals(this.templateName, that.templateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMyActionTemplateToDeprecatedRequest {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
