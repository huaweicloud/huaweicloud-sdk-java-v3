package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsEvaluatorTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private ShowOpsEvaluatorTemplateResponseBodyTemplate template;

    public ShowOpsEvaluatorTemplateResponse withTemplate(ShowOpsEvaluatorTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponse withTemplate(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new ShowOpsEvaluatorTemplateResponseBodyTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplate getTemplate() {
        return template;
    }

    public void setTemplate(ShowOpsEvaluatorTemplateResponseBodyTemplate template) {
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
        ShowOpsEvaluatorTemplateResponse that = (ShowOpsEvaluatorTemplateResponse) obj;
        return Objects.equals(this.template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponse {\n");
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
