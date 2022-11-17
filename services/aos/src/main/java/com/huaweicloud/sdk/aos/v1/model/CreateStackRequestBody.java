package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.AgenciesPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.Agency;
import com.huaweicloud.sdk.aos.v1.model.EnableAutoRollbackPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.EnableDeletionProtectionPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.ExecutorPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackDescriptionPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackNamePrimitiveTypeHolder;
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
 * CreateStackRequestBody
 */
public class CreateStackRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    
    
    private String stackName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executor")
    
    
    private String executor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agencies")
    
    
    private List<Agency> agencies = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_deletion_protection")
    
    
    private Boolean enableDeletionProtection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_rollback")
    
    
    private Boolean enableAutoRollback;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_body")
    
    
    private String templateBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_uri")
    
    
    private String templateUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_body")
    
    
    private String varsBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_structure")
    
    
    private List<VarsStructure> varsStructure = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_uri")
    
    
    private String varsUri;

    public CreateStackRequestBody withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 用户希望生成的资源栈的名字。此名字在domain_id+区域+project_id下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public CreateStackRequestBody withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    


    /**
     * 执行操作者的名字，将用做未来的审计工作
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    

    public CreateStackRequestBody withAgencies(List<Agency> agencies) {
        this.agencies = agencies;
        return this;
    }

    
    public CreateStackRequestBody addAgenciesItem(Agency agenciesItem) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        this.agencies.add(agenciesItem);
        return this;
    }

    public CreateStackRequestBody withAgencies(Consumer<List<Agency>> agenciesSetter) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        agenciesSetter.accept(this.agencies);
        return this;
    }

    /**
     * 委托授权的信息。
     * @return agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    

    public CreateStackRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 资源栈的描述。可用于客户识别自己的资源栈。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateStackRequestBody withEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
        return this;
    }

    


    /**
     * 删除保护的标识位，如果不传默认为false，即默认不开启资源栈删除保护（删除保护开启后资源栈不允许被删除）
     * @return enableDeletionProtection
     */
    public Boolean getEnableDeletionProtection() {
        return enableDeletionProtection;
    }

    public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
    }

    

    public CreateStackRequestBody withEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
        return this;
    }

    


    /**
     * 自动回滚的标识位，如果不传默认为false，即默认不开启资源栈自动回滚（自动回滚开启后，如果部署失败，则会自动回滚，并返回上一个稳定状态）
     * @return enableAutoRollback
     */
    public Boolean getEnableAutoRollback() {
        return enableAutoRollback;
    }

    public void setEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
    }

    

    public CreateStackRequestBody withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    


    /**
     * HCL模板，描述了资源的目标状态。RF将比较此模板与当前远程资源的状态之间的区别。  template_body和template_uri 必须有且只有一个存在 
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    

    public CreateStackRequestBody withTemplateUri(String templateUri) {
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

    

    public CreateStackRequestBody withVarsBody(String varsBody) {
        this.varsBody = varsBody;
        return this;
    }

    


    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果  * vars_body使用HCL的tfvars格式，用户可以将“.tfvars”中的内容提交到vars_body中。具体tfvars格式见：https://www.terraform.io/language/values/variables#variable-definitions-tfvars-files  * RF支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * 如果vars_body过大，可以使用vars_uri  * 如果vars中都是简单的字符串格式，可以使用var_structure  * 注意：vars中不应该传递任何敏感信息，RF会直接明文使用、log、展示、存储对应的vars 
     * @return varsBody
     */
    public String getVarsBody() {
        return varsBody;
    }

    public void setVarsBody(String varsBody) {
        this.varsBody = varsBody;
    }

    

    public CreateStackRequestBody withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    
    public CreateStackRequestBody addVarsStructureItem(VarsStructure varsStructureItem) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public CreateStackRequestBody withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果。  * var_structure可以允许客户提交最简单的字符串类型的参数  * RF支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * vars_structure中的值只支持简单的字符串类型，如果需要使用其他类型，需要用户自己在HCL引用时转换， 或者用户可以使用vars_uri、vars_body，vars_uri和vars_body中支持HCL支持的各种类型以及复杂结构  * 如果vars_structure过大，可以使用vars_uri  * 注意：vars中不应该传递任何敏感信息，RF会直接明文使用、log、展示、存储对应的vars 
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    

    public CreateStackRequestBody withVarsUri(String varsUri) {
        this.varsUri = varsUri;
        return this;
    }

    


    /**
     * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果  * vars_body使用HCL的tfvars格式，用户可以将“.tfvars”中的内容提交到vars_body中。具体tfvars格式见：https://www.terraform.io/language/values/variables#variable-definitions-tfvars-files  * RF支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * 如果vars_body过大，可以使用vars_uri  * 如果vars中都是简单的字符串格式，可以使用var_structure  * 注意：vars中不应该传递任何敏感信息，RF会直接明文使用、log、展示、存储对应的vars 
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
        CreateStackRequestBody createStackRequestBody = (CreateStackRequestBody) o;
        return Objects.equals(this.stackName, createStackRequestBody.stackName) &&
            Objects.equals(this.executor, createStackRequestBody.executor) &&
            Objects.equals(this.agencies, createStackRequestBody.agencies) &&
            Objects.equals(this.description, createStackRequestBody.description) &&
            Objects.equals(this.enableDeletionProtection, createStackRequestBody.enableDeletionProtection) &&
            Objects.equals(this.enableAutoRollback, createStackRequestBody.enableAutoRollback) &&
            Objects.equals(this.templateBody, createStackRequestBody.templateBody) &&
            Objects.equals(this.templateUri, createStackRequestBody.templateUri) &&
            Objects.equals(this.varsBody, createStackRequestBody.varsBody) &&
            Objects.equals(this.varsStructure, createStackRequestBody.varsStructure) &&
            Objects.equals(this.varsUri, createStackRequestBody.varsUri);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackName, executor, agencies, description, enableDeletionProtection, enableAutoRollback, templateBody, templateUri, varsBody, varsStructure, varsUri);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStackRequestBody {\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
        sb.append("    enableAutoRollback: ").append(toIndentedString(enableAutoRollback)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
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

