package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private TemplateEntity template;

    public ShowTemplateResponse withTemplate(TemplateEntity template) {
        this.template = template;
        return this;
    }

    public ShowTemplateResponse withTemplate(Consumer<TemplateEntity> templateSetter) {
        if (this.template == null) {
            this.template = new TemplateEntity();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public TemplateEntity getTemplate() {
        return template;
    }

    public void setTemplate(TemplateEntity template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTemplateResponse that = (ShowTemplateResponse) obj;
        return Objects.equals(this.template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplateResponse {\n");
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
