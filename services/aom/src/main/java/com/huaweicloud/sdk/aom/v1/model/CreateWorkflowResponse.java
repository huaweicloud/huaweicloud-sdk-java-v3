package com.huaweicloud.sdk.aom.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.Node;
import com.huaweicloud.sdk.aom.v1.model.Parameter;
import com.huaweicloud.sdk.aom.v1.model.Step;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateWorkflowResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


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
    
    
    private Map<String, String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_by")
    
    
    private String createBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private Long updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_by")
    
    
    private String updateBy;


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
    @JsonProperty(value="last_execution_id")
    
    
    private String lastExecutionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="citation_urns")
    
    
    private List<String> citationUrns = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_execution_end_time")
    
    
    private Long lastExecutionEndTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_execution_start_time")
    
    
    private Long lastExecutionStartTime;


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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_id")
    
    
    private String workflowId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_status")
    
    
    private String taskStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    
    private List<Node> nodes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edit_time")
    
    
    private Long editTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_action_rules")
    
    
    private List<String> executionActionRules = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_permission")
    
    
    private List<String> executionPermission = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="global_parameters")
    
    
    private List<Parameter> globalParameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_delete")
    
    
    private Boolean isDelete;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="steps")
    
    
    private List<Step> steps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    
    private String output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_id")
    
    
    private String triggerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_status")
    
    
    private String triggerStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="approve_id")
    
    
    private String approveId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_i18n")
    
    
    private Map<String, Map<String, Object>> templateI18n = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_execute_by")
    
    
    private String lastExecuteBy;

    public CreateWorkflowResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 工作流id，唯一标识，根据project_id和workflow_name生成。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CreateWorkflowResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 工作流名称，满足：[^\\\\>+<^;#\"\\s&?%='$￥@*_/\\]\\[【】{}|:,.，。：‘’“、—！!~`·？《》…]{1,64}。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateWorkflowResponse withType(String type) {
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

    

    public CreateWorkflowResponse withDescription(String description) {
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

    

    public CreateWorkflowResponse withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    

    public CreateWorkflowResponse putTagsItem(String key, String tagsItem) {
        if(this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public CreateWorkflowResponse withTags(Consumer<Map<String, String>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }
    /**
     * 标签键和值列表，标签键值对数量范围是0至20。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    

    public CreateWorkflowResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 工作流创建时间，为utc时间毫秒数。
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public CreateWorkflowResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 工作流创人，从接口调用传入的token中获取。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public CreateWorkflowResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 工作流更新时间，为utc时间毫秒数。
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    

    public CreateWorkflowResponse withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    


    /**
     * 工作流更新人，从接口调用传入的token中获取。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    

    public CreateWorkflowResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    


    /**
     * 模板名称，需要满足：[^\\\\>+<^;#\"\\s&?%='$￥@*_/\\]\\[【】{}|:,.，。：‘’“、—！!~`·？《》…]{1,64}。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    

    public CreateWorkflowResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    

    public CreateWorkflowResponse withInput(Map<String, Object> input) {
        this.input = input;
        return this;
    }

    

    public CreateWorkflowResponse putInputItem(String key, Object inputItem) {
        if(this.input == null) {
            this.input = new HashMap<>();
        }
        this.input.put(key, inputItem);
        return this;
    }

    public CreateWorkflowResponse withInput(Consumer<Map<String, Object>> inputSetter) {
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

    

    public CreateWorkflowResponse withLastExecutionId(String lastExecutionId) {
        this.lastExecutionId = lastExecutionId;
        return this;
    }

    


    /**
     * 最近一次执行id，也是工作流id
     * @return lastExecutionId
     */
    public String getLastExecutionId() {
        return lastExecutionId;
    }

    public void setLastExecutionId(String lastExecutionId) {
        this.lastExecutionId = lastExecutionId;
    }

    

    public CreateWorkflowResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态，包含success，fail,executing
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public CreateWorkflowResponse withCitationUrns(List<String> citationUrns) {
        this.citationUrns = citationUrns;
        return this;
    }

    
    public CreateWorkflowResponse addCitationUrnsItem(String citationUrnsItem) {
        if(this.citationUrns == null) {
            this.citationUrns = new ArrayList<>();
        }
        this.citationUrns.add(citationUrnsItem);
        return this;
    }

    public CreateWorkflowResponse withCitationUrns(Consumer<List<String>> citationUrnsSetter) {
        if(this.citationUrns == null) {
            this.citationUrns = new ArrayList<>();
        }
        citationUrnsSetter.accept(this.citationUrns);
        return this;
    }

    /**
     * 引用链接,workflow引用的工作链接
     * @return citationUrns
     */
    public List<String> getCitationUrns() {
        return citationUrns;
    }

    public void setCitationUrns(List<String> citationUrns) {
        this.citationUrns = citationUrns;
    }

    

    public CreateWorkflowResponse withLastExecutionEndTime(Long lastExecutionEndTime) {
        this.lastExecutionEndTime = lastExecutionEndTime;
        return this;
    }

    


    /**
     * 最近一次执行结束时间，为utc时间毫秒数
     * minimum: 0
     * maximum: 9999999999999
     * @return lastExecutionEndTime
     */
    public Long getLastExecutionEndTime() {
        return lastExecutionEndTime;
    }

    public void setLastExecutionEndTime(Long lastExecutionEndTime) {
        this.lastExecutionEndTime = lastExecutionEndTime;
    }

    

    public CreateWorkflowResponse withLastExecutionStartTime(Long lastExecutionStartTime) {
        this.lastExecutionStartTime = lastExecutionStartTime;
        return this;
    }

    


    /**
     * 最近一次执行开始时间，为utc时间毫秒数
     * minimum: 0
     * maximum: 9999999999999
     * @return lastExecutionStartTime
     */
    public Long getLastExecutionStartTime() {
        return lastExecutionStartTime;
    }

    public void setLastExecutionStartTime(Long lastExecutionStartTime) {
        this.lastExecutionStartTime = lastExecutionStartTime;
    }

    

    public CreateWorkflowResponse withQuote(List<String> quote) {
        this.quote = quote;
        return this;
    }

    
    public CreateWorkflowResponse addQuoteItem(String quoteItem) {
        if(this.quote == null) {
            this.quote = new ArrayList<>();
        }
        this.quote.add(quoteItem);
        return this;
    }

    public CreateWorkflowResponse withQuote(Consumer<List<String>> quoteSetter) {
        if(this.quote == null) {
            this.quote = new ArrayList<>();
        }
        quoteSetter.accept(this.quote);
        return this;
    }

    /**
     * 引用，参数引用
     * @return quote
     */
    public List<String> getQuote() {
        return quote;
    }

    public void setQuote(List<String> quote) {
        this.quote = quote;
    }

    

    public CreateWorkflowResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public CreateWorkflowResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public CreateWorkflowResponse withServiceScenario(String serviceScenario) {
        this.serviceScenario = serviceScenario;
        return this;
    }

    


    /**
     * 服务场景分类
     * @return serviceScenario
     */
    public String getServiceScenario() {
        return serviceScenario;
    }

    public void setServiceScenario(String serviceScenario) {
        this.serviceScenario = serviceScenario;
    }

    

    public CreateWorkflowResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    

    public CreateWorkflowResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    

    public CreateWorkflowResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * functiongraph返回的PROJECT_ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public CreateWorkflowResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    


    /**
     * functiongraph返回的WORKFLOW_ID
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    

    public CreateWorkflowResponse withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    


    /**
     * 任务状态
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    

    public CreateWorkflowResponse withNodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public CreateWorkflowResponse addNodesItem(Node nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public CreateWorkflowResponse withNodes(Consumer<List<Node>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 任务节点
     * @return nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    

    public CreateWorkflowResponse withEditTime(Long editTime) {
        this.editTime = editTime;
        return this;
    }

    


    /**
     * 编辑时间
     * minimum: 0
     * maximum: 9999999999999
     * @return editTime
     */
    public Long getEditTime() {
        return editTime;
    }

    public void setEditTime(Long editTime) {
        this.editTime = editTime;
    }

    

    public CreateWorkflowResponse withExecutionActionRules(List<String> executionActionRules) {
        this.executionActionRules = executionActionRules;
        return this;
    }

    
    public CreateWorkflowResponse addExecutionActionRulesItem(String executionActionRulesItem) {
        if(this.executionActionRules == null) {
            this.executionActionRules = new ArrayList<>();
        }
        this.executionActionRules.add(executionActionRulesItem);
        return this;
    }

    public CreateWorkflowResponse withExecutionActionRules(Consumer<List<String>> executionActionRulesSetter) {
        if(this.executionActionRules == null) {
            this.executionActionRules = new ArrayList<>();
        }
        executionActionRulesSetter.accept(this.executionActionRules);
        return this;
    }

    /**
     * 执行动作细粒度权限
     * @return executionActionRules
     */
    public List<String> getExecutionActionRules() {
        return executionActionRules;
    }

    public void setExecutionActionRules(List<String> executionActionRules) {
        this.executionActionRules = executionActionRules;
    }

    

    public CreateWorkflowResponse withExecutionPermission(List<String> executionPermission) {
        this.executionPermission = executionPermission;
        return this;
    }

    
    public CreateWorkflowResponse addExecutionPermissionItem(String executionPermissionItem) {
        if(this.executionPermission == null) {
            this.executionPermission = new ArrayList<>();
        }
        this.executionPermission.add(executionPermissionItem);
        return this;
    }

    public CreateWorkflowResponse withExecutionPermission(Consumer<List<String>> executionPermissionSetter) {
        if(this.executionPermission == null) {
            this.executionPermission = new ArrayList<>();
        }
        executionPermissionSetter.accept(this.executionPermission);
        return this;
    }

    /**
     * 云服务权限
     * @return executionPermission
     */
    public List<String> getExecutionPermission() {
        return executionPermission;
    }

    public void setExecutionPermission(List<String> executionPermission) {
        this.executionPermission = executionPermission;
    }

    

    public CreateWorkflowResponse withGlobalParameters(List<Parameter> globalParameters) {
        this.globalParameters = globalParameters;
        return this;
    }

    
    public CreateWorkflowResponse addGlobalParametersItem(Parameter globalParametersItem) {
        if(this.globalParameters == null) {
            this.globalParameters = new ArrayList<>();
        }
        this.globalParameters.add(globalParametersItem);
        return this;
    }

    public CreateWorkflowResponse withGlobalParameters(Consumer<List<Parameter>> globalParametersSetter) {
        if(this.globalParameters == null) {
            this.globalParameters = new ArrayList<>();
        }
        globalParametersSetter.accept(this.globalParameters);
        return this;
    }

    /**
     * 全局参数
     * @return globalParameters
     */
    public List<Parameter> getGlobalParameters() {
        return globalParameters;
    }

    public void setGlobalParameters(List<Parameter> globalParameters) {
        this.globalParameters = globalParameters;
    }

    

    public CreateWorkflowResponse withIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    


    /**
     * 逻辑删除
     * @return isDelete
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    

    public CreateWorkflowResponse withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    
    public CreateWorkflowResponse addStepsItem(Step stepsItem) {
        if(this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public CreateWorkflowResponse withSteps(Consumer<List<Step>> stepsSetter) {
        if(this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 任务步骤
     * @return steps
     */
    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    

    public CreateWorkflowResponse withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 任务输出
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

    public CreateWorkflowResponse withTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }

    


    /**
     * 触发器id
     * @return triggerId
     */
    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    

    public CreateWorkflowResponse withTriggerStatus(String triggerStatus) {
        this.triggerStatus = triggerStatus;
        return this;
    }

    


    /**
     * 触发器状态
     * @return triggerStatus
     */
    public String getTriggerStatus() {
        return triggerStatus;
    }

    public void setTriggerStatus(String triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    

    public CreateWorkflowResponse withApproveId(String approveId) {
        this.approveId = approveId;
        return this;
    }

    


    /**
     * 审批id
     * @return approveId
     */
    public String getApproveId() {
        return approveId;
    }

    public void setApproveId(String approveId) {
        this.approveId = approveId;
    }

    

    public CreateWorkflowResponse withTemplateI18n(Map<String, Map<String, Object>> templateI18n) {
        this.templateI18n = templateI18n;
        return this;
    }

    

    public CreateWorkflowResponse putTemplateI18nItem(String key, Map<String, Object> templateI18nItem) {
        if(this.templateI18n == null) {
            this.templateI18n = new HashMap<>();
        }
        this.templateI18n.put(key, templateI18nItem);
        return this;
    }

    public CreateWorkflowResponse withTemplateI18n(Consumer<Map<String, Map<String, Object>>> templateI18nSetter) {
        if(this.templateI18n == null) {
            this.templateI18n = new HashMap<>();
        }
        templateI18nSetter.accept(this.templateI18n);
        return this;
    }
    /**
     * 任务国际化字段，包含中英文描述
     * @return templateI18n
     */
    public Map<String, Map<String, Object>> getTemplateI18n() {
        return templateI18n;
    }

    public void setTemplateI18n(Map<String, Map<String, Object>> templateI18n) {
        this.templateI18n = templateI18n;
    }

    

    public CreateWorkflowResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 任务所属的企业项目
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public CreateWorkflowResponse withLastExecuteBy(String lastExecuteBy) {
        this.lastExecuteBy = lastExecuteBy;
        return this;
    }

    


    /**
     * 任务最后一次执行人
     * @return lastExecuteBy
     */
    public String getLastExecuteBy() {
        return lastExecuteBy;
    }

    public void setLastExecuteBy(String lastExecuteBy) {
        this.lastExecuteBy = lastExecuteBy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWorkflowResponse createWorkflowResponse = (CreateWorkflowResponse) o;
        return Objects.equals(this.id, createWorkflowResponse.id) &&
            Objects.equals(this.name, createWorkflowResponse.name) &&
            Objects.equals(this.type, createWorkflowResponse.type) &&
            Objects.equals(this.description, createWorkflowResponse.description) &&
            Objects.equals(this.tags, createWorkflowResponse.tags) &&
            Objects.equals(this.createTime, createWorkflowResponse.createTime) &&
            Objects.equals(this.createBy, createWorkflowResponse.createBy) &&
            Objects.equals(this.updateTime, createWorkflowResponse.updateTime) &&
            Objects.equals(this.updateBy, createWorkflowResponse.updateBy) &&
            Objects.equals(this.templateName, createWorkflowResponse.templateName) &&
            Objects.equals(this.templateId, createWorkflowResponse.templateId) &&
            Objects.equals(this.input, createWorkflowResponse.input) &&
            Objects.equals(this.lastExecutionId, createWorkflowResponse.lastExecutionId) &&
            Objects.equals(this.status, createWorkflowResponse.status) &&
            Objects.equals(this.citationUrns, createWorkflowResponse.citationUrns) &&
            Objects.equals(this.lastExecutionEndTime, createWorkflowResponse.lastExecutionEndTime) &&
            Objects.equals(this.lastExecutionStartTime, createWorkflowResponse.lastExecutionStartTime) &&
            Objects.equals(this.quote, createWorkflowResponse.quote) &&
            Objects.equals(this.jobName, createWorkflowResponse.jobName) &&
            Objects.equals(this.jobId, createWorkflowResponse.jobId) &&
            Objects.equals(this.serviceScenario, createWorkflowResponse.serviceScenario) &&
            Objects.equals(this.serviceName, createWorkflowResponse.serviceName) &&
            Objects.equals(this.taskType, createWorkflowResponse.taskType) &&
            Objects.equals(this.projectId, createWorkflowResponse.projectId) &&
            Objects.equals(this.workflowId, createWorkflowResponse.workflowId) &&
            Objects.equals(this.taskStatus, createWorkflowResponse.taskStatus) &&
            Objects.equals(this.nodes, createWorkflowResponse.nodes) &&
            Objects.equals(this.editTime, createWorkflowResponse.editTime) &&
            Objects.equals(this.executionActionRules, createWorkflowResponse.executionActionRules) &&
            Objects.equals(this.executionPermission, createWorkflowResponse.executionPermission) &&
            Objects.equals(this.globalParameters, createWorkflowResponse.globalParameters) &&
            Objects.equals(this.isDelete, createWorkflowResponse.isDelete) &&
            Objects.equals(this.steps, createWorkflowResponse.steps) &&
            Objects.equals(this.output, createWorkflowResponse.output) &&
            Objects.equals(this.triggerId, createWorkflowResponse.triggerId) &&
            Objects.equals(this.triggerStatus, createWorkflowResponse.triggerStatus) &&
            Objects.equals(this.approveId, createWorkflowResponse.approveId) &&
            Objects.equals(this.templateI18n, createWorkflowResponse.templateI18n) &&
            Objects.equals(this.enterpriseProjectId, createWorkflowResponse.enterpriseProjectId) &&
            Objects.equals(this.lastExecuteBy, createWorkflowResponse.lastExecuteBy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description, tags, createTime, createBy, updateTime, updateBy, templateName, templateId, input, lastExecutionId, status, citationUrns, lastExecutionEndTime, lastExecutionStartTime, quote, jobName, jobId, serviceScenario, serviceName, taskType, projectId, workflowId, taskStatus, nodes, editTime, executionActionRules, executionPermission, globalParameters, isDelete, steps, output, triggerId, triggerStatus, approveId, templateI18n, enterpriseProjectId, lastExecuteBy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    lastExecutionId: ").append(toIndentedString(lastExecutionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    citationUrns: ").append(toIndentedString(citationUrns)).append("\n");
        sb.append("    lastExecutionEndTime: ").append(toIndentedString(lastExecutionEndTime)).append("\n");
        sb.append("    lastExecutionStartTime: ").append(toIndentedString(lastExecutionStartTime)).append("\n");
        sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    serviceScenario: ").append(toIndentedString(serviceScenario)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    editTime: ").append(toIndentedString(editTime)).append("\n");
        sb.append("    executionActionRules: ").append(toIndentedString(executionActionRules)).append("\n");
        sb.append("    executionPermission: ").append(toIndentedString(executionPermission)).append("\n");
        sb.append("    globalParameters: ").append(toIndentedString(globalParameters)).append("\n");
        sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
        sb.append("    triggerStatus: ").append(toIndentedString(triggerStatus)).append("\n");
        sb.append("    approveId: ").append(toIndentedString(approveId)).append("\n");
        sb.append("    templateI18n: ").append(toIndentedString(templateI18n)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    lastExecuteBy: ").append(toIndentedString(lastExecuteBy)).append("\n");
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

