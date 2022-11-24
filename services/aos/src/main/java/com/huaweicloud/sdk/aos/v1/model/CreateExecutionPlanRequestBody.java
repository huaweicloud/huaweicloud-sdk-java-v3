package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.VarsStructure;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * create-execution-plan request parameters
 */
public class CreateExecutionPlanRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_body")
    
    
    private String templateBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_uri")
    
    
    private String templateUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_name")
    
    
    private String executionPlanName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executor")
    
    
    private String executor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_structure")
    
    
    private List<VarsStructure> varsStructure = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_body")
    
    
    private String varsBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_uri")
    
    
    private String varsUri;

    public CreateExecutionPlanRequestBody withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 用户希望生成执行计划的栈（stack）的Id。此Id由IAC在生成栈的时候生成，为UUID。
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public CreateExecutionPlanRequestBody withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    


    /**
     * HCL模板，描述了资源的目标状态。IAC将比较此模板与当前远程资源的状态之间的区别 template_body 和 template_uri 有且仅有一个存在
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    

    public CreateExecutionPlanRequestBody withTemplateUri(String templateUri) {
        this.templateUri = templateUri;
        return this;
    }

    


    /**
     * HCL模板的OBS地址，描述了资源的目标状态。IAC将比较此模板与当前远程资源的状态之间的区别。目前接受纯tf文件或zip压缩包。 纯tf文件需要以“.tf”结尾，并遵守tf模板格式。压缩包目前只支持zip格式，文件需要以\".zip\"结尾，压缩包解压后应该只包含文件，且文件均以“.tf”结尾，不支持nested结构 template_body 和 template_uri 有且仅有一个存在
     * @return templateUri
     */
    public String getTemplateUri() {
        return templateUri;
    }

    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

    

    public CreateExecutionPlanRequestBody withExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
        return this;
    }

    


    /**
     * 执行计划的名字，在domain_id+region+project_id+stack_id下应唯一。
     * @return executionPlanName
     */
    public String getExecutionPlanName() {
        return executionPlanName;
    }

    public void setExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
    }

    

    public CreateExecutionPlanRequestBody withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    


    /**
     * 执行操作者的名字
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    

    public CreateExecutionPlanRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 执行计划的描述。可用于客户识别自己的执行计划
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateExecutionPlanRequestBody withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    
    public CreateExecutionPlanRequestBody addVarsStructureItem(VarsStructure varsStructureItem) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public CreateExecutionPlanRequestBody withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * terraform支持参数，即，同一个模板可以给予不同的参数而达到不同的效果。var是一系列terraform所需要的参数。 注：IaC支持vars、vars_body和vars_uri，如果vars、vars_body和vars_uri中声名了同一个变量，将报错400。 注：vars中的值只支持简单的字符串类型，如果其他类型，需要用户自己在HCL引用时转换，或者用户可以使用vars_body或vars_uri， vars_body和vars_uri中支持HCL支持的各种类型以及复杂结构。
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    

    public CreateExecutionPlanRequestBody withVarsBody(String varsBody) {
        this.varsBody = varsBody;
        return this;
    }

    


    /**
     * terraform支持参数，即，同一个模板可以给予不同的参数而达到不同的效果。vars_body用于接收用户直接提交的tfvars文件内容
     * @return varsBody
     */
    public String getVarsBody() {
        return varsBody;
    }

    public void setVarsBody(String varsBody) {
        this.varsBody = varsBody;
    }

    

    public CreateExecutionPlanRequestBody withVarsUri(String varsUri) {
        this.varsUri = varsUri;
        return this;
    }

    


    /**
     * 参数文件的OBS地址，如果客户偏向使用文件维护参数，可以将参数上传OBS，并将OBS地址提交。 注：如果用户同时使用了vars_body、vars_uri和vars，且他们的内容中定义了同一个参数，IAC将报错并返回400。 vars_uri和vars_body中的vars按照HCL的语义，可以支持各种类型、复杂结构等
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
        CreateExecutionPlanRequestBody createExecutionPlanRequestBody = (CreateExecutionPlanRequestBody) o;
        return Objects.equals(this.stackId, createExecutionPlanRequestBody.stackId) &&
            Objects.equals(this.templateBody, createExecutionPlanRequestBody.templateBody) &&
            Objects.equals(this.templateUri, createExecutionPlanRequestBody.templateUri) &&
            Objects.equals(this.executionPlanName, createExecutionPlanRequestBody.executionPlanName) &&
            Objects.equals(this.executor, createExecutionPlanRequestBody.executor) &&
            Objects.equals(this.description, createExecutionPlanRequestBody.description) &&
            Objects.equals(this.varsStructure, createExecutionPlanRequestBody.varsStructure) &&
            Objects.equals(this.varsBody, createExecutionPlanRequestBody.varsBody) &&
            Objects.equals(this.varsUri, createExecutionPlanRequestBody.varsUri);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackId, templateBody, templateUri, executionPlanName, executor, description, varsStructure, varsBody, varsUri);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExecutionPlanRequestBody {\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
        sb.append("    executionPlanName: ").append(toIndentedString(executionPlanName)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
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

