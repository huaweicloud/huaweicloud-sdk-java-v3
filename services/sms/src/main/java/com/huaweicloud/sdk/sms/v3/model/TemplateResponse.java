package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模板响应
 */
public class TemplateResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    @JacksonXmlProperty(localName = "template")

    private TemplateResponseBody template;

    public TemplateResponse withTemplate(TemplateResponseBody template) {
        this.template = template;
        return this;
    }

    public TemplateResponse withTemplate(Consumer<TemplateResponseBody> templateSetter) {
        if (this.template == null) {
            this.template = new TemplateResponseBody();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public TemplateResponseBody getTemplate() {
        return template;
    }

    public void setTemplate(TemplateResponseBody template) {
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
        TemplateResponse templateResponse = (TemplateResponse) o;
        return Objects.equals(this.template, templateResponse.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateResponse {\n");
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
