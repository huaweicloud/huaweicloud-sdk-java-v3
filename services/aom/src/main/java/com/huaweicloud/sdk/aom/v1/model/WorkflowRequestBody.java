package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 自动化运维工作流工作流元数据。
 */
public class WorkflowRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    

    private Object tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_name")
    

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private Map<String, Object> input = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quote")
    
    private List<String> quote = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_scenario")
    

    private String serviceScenario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_name")
    

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_type")
    

    private String taskType;

    public WorkflowRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 工作流名称，需要满足中文、英文大小写、数字、中划线和下划线{1,64}。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public WorkflowRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 工作流类型，可以为cron、manual
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public WorkflowRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 工作流描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public WorkflowRequestBody withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 标签键和值列表，标签键值对数量范围是0至20。
     * @return tags
     */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    

    public WorkflowRequestBody withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    


    /**
     * 模板名称，示例：CMS::ECS::BulkyRunScript  CMS::ECS::BulkyStartECSInstances CMS::ECS::BulkyCleanDisks
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    

    public WorkflowRequestBody withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 模板id。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    

    public WorkflowRequestBody withInput(Map<String, Object> input) {
        this.input = input;
        return this;
    }

    

    public WorkflowRequestBody putInputItem(String key, Object inputItem) {
        if(this.input == null) {
            this.input = new HashMap<>();
        }
        this.input.put(key, inputItem);
        return this;
    }

    public WorkflowRequestBody withInput(Consumer<Map<String, Object>> inputSetter) {
        if(this.input == null) {
            this.input = new HashMap<>();
        }
        inputSetter.accept(this.input);
        return this;
    }
    /**
     * 任务执行时需要的参数列表。
     * @return input
     */
    public Map<String, Object> getInput() {
        return input;
    }

    public void setInput(Map<String, Object> input) {
        this.input = input;
    }

    

    public WorkflowRequestBody withQuote(List<String> quote) {
        this.quote = quote;
        return this;
    }

    
    public WorkflowRequestBody addQuoteItem(String quoteItem) {
        if(this.quote == null) {
            this.quote = new ArrayList<>();
        }
        this.quote.add(quoteItem);
        return this;
    }

    public WorkflowRequestBody withQuote(Consumer<List<String>> quoteSetter) {
        if(this.quote == null) {
            this.quote = new ArrayList<>();
        }
        quoteSetter.accept(this.quote);
        return this;
    }

    /**
     * 引用，参数引用。
     * @return quote
     */
    public List<String> getQuote() {
        return quote;
    }

    public void setQuote(List<String> quote) {
        this.quote = quote;
    }

    

    public WorkflowRequestBody withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public WorkflowRequestBody withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public WorkflowRequestBody withServiceScenario(String serviceScenario) {
        this.serviceScenario = serviceScenario;
        return this;
    }

    


    /**
     * 服务场景分类。
     * @return serviceScenario
     */
    public String getServiceScenario() {
        return serviceScenario;
    }

    public void setServiceScenario(String serviceScenario) {
        this.serviceScenario = serviceScenario;
    }

    

    public WorkflowRequestBody withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 服务名称。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    

    public WorkflowRequestBody withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 任务类型。package,script,job,cloud,standard,customize
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowRequestBody workflowRequestBody = (WorkflowRequestBody) o;
        return Objects.equals(this.name, workflowRequestBody.name) &&
            Objects.equals(this.type, workflowRequestBody.type) &&
            Objects.equals(this.description, workflowRequestBody.description) &&
            Objects.equals(this.tags, workflowRequestBody.tags) &&
            Objects.equals(this.templateName, workflowRequestBody.templateName) &&
            Objects.equals(this.templateId, workflowRequestBody.templateId) &&
            Objects.equals(this.input, workflowRequestBody.input) &&
            Objects.equals(this.quote, workflowRequestBody.quote) &&
            Objects.equals(this.jobName, workflowRequestBody.jobName) &&
            Objects.equals(this.jobId, workflowRequestBody.jobId) &&
            Objects.equals(this.serviceScenario, workflowRequestBody.serviceScenario) &&
            Objects.equals(this.serviceName, workflowRequestBody.serviceName) &&
            Objects.equals(this.taskType, workflowRequestBody.taskType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, tags, templateName, templateId, input, quote, jobName, jobId, serviceScenario, serviceName, taskType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    serviceScenario: ").append(toIndentedString(serviceScenario)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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

