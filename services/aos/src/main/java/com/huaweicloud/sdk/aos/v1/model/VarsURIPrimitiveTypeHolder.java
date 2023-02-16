package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VarsURIPrimitiveTypeHolder
 */
public class VarsURIPrimitiveTypeHolder  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_uri")
    
    
    private String varsUri;

    public VarsURIPrimitiveTypeHolder withVarsUri(String varsUri) {
        this.varsUri = varsUri;
        return this;
    }

    


    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果  * vars_uri需要指向一个OBS的pre-signed URL地址，其他地址暂不支持  * 资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * vars_uri中的内容使用HCL的tfvars格式，用户可以将”.tfvars”中的内容保存到文件并上传到OBS中，并将OBS pre-signed URL传递给vars_uri。具体tfvars格式见：https://www.terraform.io/language/values/variables#variable-definitions-tfvars-files  * 注意：vars_uri的内容不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars。如为敏感信息，建议通过vars_structure并设置encryption字段传递 
     * @return varsUri
     */
    public String getVarsUri() {
        return varsUri;
    }

    public void setVarsUri(String varsUri) {
        this.varsUri = varsUri;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VarsURIPrimitiveTypeHolder varsURIPrimitiveTypeHolder = (VarsURIPrimitiveTypeHolder) o;
        return Objects.equals(this.varsUri, varsURIPrimitiveTypeHolder.varsUri);
    }
    @Override
    public int hashCode() {
        return Objects.hash(varsUri);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VarsURIPrimitiveTypeHolder {\n");
        sb.append("    varsUri: ").append(toIndentedString(varsUri)).append("\n");
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

