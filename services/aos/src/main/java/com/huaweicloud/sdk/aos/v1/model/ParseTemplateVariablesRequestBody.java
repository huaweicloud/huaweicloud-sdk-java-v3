package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * parse-template-variables request parameters
 */
public class ParseTemplateVariablesRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_body")
    
    
    private String templateBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_uri")
    
    
    private String templateUri;

    public ParseTemplateVariablesRequestBody withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    


    /**
     * HCL模板，描述了资源的目标状态 template_body 和 template_uri 有且仅有一个存在
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    

    public ParseTemplateVariablesRequestBody withTemplateUri(String templateUri) {
        this.templateUri = templateUri;
        return this;
    }

    


    /**
     * HCL模板文件的uri，代码需从该uri下载HCL模板获取模板内容。其描述了资源的目标状态 template_body 和 template_uri 有且仅有一个存在
     * @return templateUri
     */
    public String getTemplateUri() {
        return templateUri;
    }

    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParseTemplateVariablesRequestBody parseTemplateVariablesRequestBody = (ParseTemplateVariablesRequestBody) o;
        return Objects.equals(this.templateBody, parseTemplateVariablesRequestBody.templateBody) &&
            Objects.equals(this.templateUri, parseTemplateVariablesRequestBody.templateUri);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateBody, templateUri);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseTemplateVariablesRequestBody {\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
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

