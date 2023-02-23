package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateURIPrimitiveTypeHolder
 */
public class TemplateURIPrimitiveTypeHolder  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_uri")
    

    private String templateUri;

    public TemplateURIPrimitiveTypeHolder withTemplateUri(String templateUri) {
        this.templateUri = templateUri;
        return this;
    }

    


    /**
     * HCL模板的OBS地址，该模板描述了资源的目标状态  OBS地址必须为同region的OBS地址，暂不支持跨region访问  对应的文件应该是纯tf文件或zip压缩包  纯tf文件需要以`.tf`或者`.tfjson`结尾，并遵守hcl语法  压缩包目前只支持zip格式，文件需要以\".zip\"结尾。解压后的文件不得包含\".tfvars\"文件  template_body和template_uri 必须有且只有一个存在 
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
        TemplateURIPrimitiveTypeHolder templateURIPrimitiveTypeHolder = (TemplateURIPrimitiveTypeHolder) o;
        return Objects.equals(this.templateUri, templateURIPrimitiveTypeHolder.templateUri);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateUri);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateURIPrimitiveTypeHolder {\n");
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

