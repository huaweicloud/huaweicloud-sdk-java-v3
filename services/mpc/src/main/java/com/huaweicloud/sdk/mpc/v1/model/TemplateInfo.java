package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.QueryTransTemplate;
import com.huaweicloud.sdk.mpc.v1.model.XCodeError;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateInfo
 */
public class TemplateInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private Integer templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template")
    
    private QueryTransTemplate template = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private XCodeError error = null;

    public TemplateInfo withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 转码模板ID。 
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
        if(this.template == null ){
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

    public TemplateInfo withError(XCodeError error) {
        this.error = error;
        return this;
    }

    public TemplateInfo withError(Consumer<XCodeError> errorSetter) {
        if(this.error == null ){
            this.error = new XCodeError();
            errorSetter.accept(this.error);
        }
        
        return this;
    }


    /**
     * Get error
     * @return error
     */
    public XCodeError getError() {
        return error;
    }

    public void setError(XCodeError error) {
        this.error = error;
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
        return Objects.equals(this.templateId, templateInfo.templateId) &&
            Objects.equals(this.template, templateInfo.template) &&
            Objects.equals(this.error, templateInfo.error);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, template, error);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateInfo {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

