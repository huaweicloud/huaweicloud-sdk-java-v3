package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.ExecutorPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackIdPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.TemplateBodyPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.TemplateURIPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.VarsBodyPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.VarsStructure;
import com.huaweicloud.sdk.aos.v1.model.VarsStructurePrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.VarsURIPrimitiveTypeHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DeployStackRequestBody
 */
public class DeployStackRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_body")
    
    
    private String templateBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_uri")
    
    
    private String templateUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_structure")
    
    
    private List<VarsStructure> varsStructure = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_body")
    
    
    private String varsBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_uri")
    
    
    private String varsUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;

    public DeployStackRequestBody withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    


    /**
     * HCL模板，描述了资源的目标状态。资源编排服务将比较此模板与当前远程资源的状态之间的区别。  template_body和template_uri 必须有且只有一个存在 
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    

    public DeployStackRequestBody withTemplateUri(String templateUri) {
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

    

    public DeployStackRequestBody withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    
    public DeployStackRequestBody addVarsStructureItem(VarsStructure varsStructureItem) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public DeployStackRequestBody withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果。  * var_structure可以允许客户提交最简单的字符串类型的参数  * 资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * vars_structure中的值只支持简单的字符串类型，如果需要使用其他类型，需要用户自己在HCL引用时转换， 或者用户可以使用vars_uri、vars_body，vars_uri和vars_body中支持HCL支持的各种类型以及复杂结构  * 如果vars_structure过大，可以使用vars_uri  * 注意：vars_structure中默认不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars。如为敏感信息，建议设置encryption字段开启加密 
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    

    public DeployStackRequestBody withVarsBody(String varsBody) {
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

    

    public DeployStackRequestBody withVarsUri(String varsUri) {
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

    

    public DeployStackRequestBody withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 资源栈（stack）的唯一Id。  此Id由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给与的stack_id和当前资源栈的ID不一致，则返回400 
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployStackRequestBody deployStackRequestBody = (DeployStackRequestBody) o;
        return Objects.equals(this.templateBody, deployStackRequestBody.templateBody) &&
            Objects.equals(this.templateUri, deployStackRequestBody.templateUri) &&
            Objects.equals(this.varsStructure, deployStackRequestBody.varsStructure) &&
            Objects.equals(this.varsBody, deployStackRequestBody.varsBody) &&
            Objects.equals(this.varsUri, deployStackRequestBody.varsUri) &&
            Objects.equals(this.stackId, deployStackRequestBody.stackId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateBody, templateUri, varsStructure, varsBody, varsUri, stackId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStackRequestBody {\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    varsUri: ").append(toIndentedString(varsUri)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
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

