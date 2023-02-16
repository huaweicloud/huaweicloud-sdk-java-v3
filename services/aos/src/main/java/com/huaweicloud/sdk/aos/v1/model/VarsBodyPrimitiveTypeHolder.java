package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VarsBodyPrimitiveTypeHolder
 */
public class VarsBodyPrimitiveTypeHolder  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_body")
    
    
    private String varsBody;

    public VarsBodyPrimitiveTypeHolder withVarsBody(String varsBody) {
        this.varsBody = varsBody;
        return this;
    }

    


    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果  * vars_body使用HCL的tfvars格式，用户可以将“.tfvars”中的内容提交到vars_body中。具体tfvars格式见：https://www.terraform.io/language/values/variables#variable-definitions-tfvars-files  * 资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * 如果vars_body过大，可以使用vars_uri  * 如果vars中都是简单的字符串格式，可以使用var_structure  * 注意：vars_body中不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars。如为敏感信息，建议通过vars_structure并设置encryption字段传递 
     * @return varsBody
     */
    public String getVarsBody() {
        return varsBody;
    }

    public void setVarsBody(String varsBody) {
        this.varsBody = varsBody;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VarsBodyPrimitiveTypeHolder varsBodyPrimitiveTypeHolder = (VarsBodyPrimitiveTypeHolder) o;
        return Objects.equals(this.varsBody, varsBodyPrimitiveTypeHolder.varsBody);
    }
    @Override
    public int hashCode() {
        return Objects.hash(varsBody);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VarsBodyPrimitiveTypeHolder {\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
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

