package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.QualityEnhanceTemplate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateQualityEnhanceTemplateReq
 */
public class UpdateQualityEnhanceTemplateReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private Integer templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template")
    
    private QualityEnhanceTemplate template;

    public UpdateQualityEnhanceTemplateReq withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 模板ID。 
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

    

    public UpdateQualityEnhanceTemplateReq withTemplate(QualityEnhanceTemplate template) {
        this.template = template;
        return this;
    }

    public UpdateQualityEnhanceTemplateReq withTemplate(Consumer<QualityEnhanceTemplate> templateSetter) {
        if(this.template == null ){
            this.template = new QualityEnhanceTemplate();
            templateSetter.accept(this.template);
        }
        
        return this;
    }


    /**
     * Get template
     * @return template
     */
    public QualityEnhanceTemplate getTemplate() {
        return template;
    }

    public void setTemplate(QualityEnhanceTemplate template) {
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
        UpdateQualityEnhanceTemplateReq updateQualityEnhanceTemplateReq = (UpdateQualityEnhanceTemplateReq) o;
        return Objects.equals(this.templateId, updateQualityEnhanceTemplateReq.templateId) &&
            Objects.equals(this.template, updateQualityEnhanceTemplateReq.template);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, template);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateQualityEnhanceTemplateReq {\n");
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

