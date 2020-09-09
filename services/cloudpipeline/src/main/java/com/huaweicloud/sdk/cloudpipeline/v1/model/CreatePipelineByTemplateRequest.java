package com.huaweicloud.sdk.cloudpipeline.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v1.model.TemplateCddl;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreatePipelineByTemplateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private TemplateCddl body = null;

    public CreatePipelineByTemplateRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CreatePipelineByTemplateRequest withBody(TemplateCddl body) {
        this.body = body;
        return this;
    }

    public CreatePipelineByTemplateRequest withBody(Consumer<TemplateCddl> bodySetter) {
        if(this.body == null ){
            this.body = new TemplateCddl();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public TemplateCddl getBody() {
        return body;
    }

    public void setBody(TemplateCddl body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePipelineByTemplateRequest createPipelineByTemplateRequest = (CreatePipelineByTemplateRequest) o;
        return Objects.equals(this.xLanguage, createPipelineByTemplateRequest.xLanguage) &&
            Objects.equals(this.body, createPipelineByTemplateRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePipelineByTemplateRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

