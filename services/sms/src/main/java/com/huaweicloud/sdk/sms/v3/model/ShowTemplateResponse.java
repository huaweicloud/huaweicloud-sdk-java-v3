package com.huaweicloud.sdk.sms.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.Template;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTemplateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template")
    
    private Template template = null;

    public ShowTemplateResponse withTemplate(Template template) {
        this.template = template;
        return this;
    }

    public ShowTemplateResponse withTemplate(Consumer<Template> templateSetter) {
        if(this.template == null ){
            this.template = new Template();
            templateSetter.accept(this.template);
        }
        
        return this;
    }


    /**
     * Get template
     * @return template
     */
    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
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
        ShowTemplateResponse showTemplateResponse = (ShowTemplateResponse) o;
        return Objects.equals(this.template, showTemplateResponse.template);
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

