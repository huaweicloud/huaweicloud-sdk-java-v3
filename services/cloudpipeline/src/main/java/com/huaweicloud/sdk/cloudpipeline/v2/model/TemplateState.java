package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 子任务参数 */
public class TemplateState {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_or_template_id")

    private String moduleOrTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_or_template_name")

    private String moduleOrTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsl_method")

    private String dslMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, Object> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_manual_execution")

    private Boolean isManualExecution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_parameter_validate")

    private Boolean jobParameterValidate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show_codehub_url")

    private Boolean isShowCodehubUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_execute")

    private Boolean isExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_mode")

    private String executionMode;

    public TemplateState withType(String type) {
        this.type = type;
        return this;
    }

    /** 任务类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TemplateState withName(String name) {
        this.name = name;
        return this;
    }

    /** 任务名字
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateState withModuleOrTemplateId(String moduleOrTemplateId) {
        this.moduleOrTemplateId = moduleOrTemplateId;
        return this;
    }

    /** 模板任务ID
     * 
     * @return moduleOrTemplateId */
    public String getModuleOrTemplateId() {
        return moduleOrTemplateId;
    }

    public void setModuleOrTemplateId(String moduleOrTemplateId) {
        this.moduleOrTemplateId = moduleOrTemplateId;
    }

    public TemplateState withModuleOrTemplateName(String moduleOrTemplateName) {
        this.moduleOrTemplateName = moduleOrTemplateName;
        return this;
    }

    /** 模板任务名字
     * 
     * @return moduleOrTemplateName */
    public String getModuleOrTemplateName() {
        return moduleOrTemplateName;
    }

    public void setModuleOrTemplateName(String moduleOrTemplateName) {
        this.moduleOrTemplateName = moduleOrTemplateName;
    }

    public TemplateState withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** 任务在流水线页面展示名字
     * 
     * @return displayName */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TemplateState withDslMethod(String dslMethod) {
        this.dslMethod = dslMethod;
        return this;
    }

    /** 流水线可挂载任务类型
     * 
     * @return dslMethod */
    public String getDslMethod() {
        return dslMethod;
    }

    public void setDslMethod(String dslMethod) {
        this.dslMethod = dslMethod;
    }

    public TemplateState withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    public TemplateState putParametersItem(String key, Object parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public TemplateState withParameters(Consumer<Map<String, Object>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /** 任务参数,map类型数据
     * 
     * @return parameters */
    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public TemplateState withIsManualExecution(Boolean isManualExecution) {
        this.isManualExecution = isManualExecution;
        return this;
    }

    /** 是否手动执行
     * 
     * @return isManualExecution */
    public Boolean getIsManualExecution() {
        return isManualExecution;
    }

    public void setIsManualExecution(Boolean isManualExecution) {
        this.isManualExecution = isManualExecution;
    }

    public TemplateState withJobParameterValidate(Boolean jobParameterValidate) {
        this.jobParameterValidate = jobParameterValidate;
        return this;
    }

    /** 任务参数是否校验
     * 
     * @return jobParameterValidate */
    public Boolean getJobParameterValidate() {
        return jobParameterValidate;
    }

    public void setJobParameterValidate(Boolean jobParameterValidate) {
        this.jobParameterValidate = jobParameterValidate;
    }

    public TemplateState withIsShowCodehubUrl(Boolean isShowCodehubUrl) {
        this.isShowCodehubUrl = isShowCodehubUrl;
        return this;
    }

    /** 是否显示代码仓URL
     * 
     * @return isShowCodehubUrl */
    public Boolean getIsShowCodehubUrl() {
        return isShowCodehubUrl;
    }

    public void setIsShowCodehubUrl(Boolean isShowCodehubUrl) {
        this.isShowCodehubUrl = isShowCodehubUrl;
    }

    public TemplateState withIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
        return this;
    }

    /** 是否执行
     * 
     * @return isExecute */
    public Boolean getIsExecute() {
        return isExecute;
    }

    public void setIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
    }

    public TemplateState withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 执行任务ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public TemplateState withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 执行任务名字
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public TemplateState withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 任务所属项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TemplateState withExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /** 控制阶段下任务的串并行（type是task的execution_mode值为null，type是stage的execution_mode可选parallel（并行）或者serial（串行））
     * 
     * @return executionMode */
    public String getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateState templateState = (TemplateState) o;
        return Objects.equals(this.type, templateState.type) && Objects.equals(this.name, templateState.name)
            && Objects.equals(this.moduleOrTemplateId, templateState.moduleOrTemplateId)
            && Objects.equals(this.moduleOrTemplateName, templateState.moduleOrTemplateName)
            && Objects.equals(this.displayName, templateState.displayName)
            && Objects.equals(this.dslMethod, templateState.dslMethod)
            && Objects.equals(this.parameters, templateState.parameters)
            && Objects.equals(this.isManualExecution, templateState.isManualExecution)
            && Objects.equals(this.jobParameterValidate, templateState.jobParameterValidate)
            && Objects.equals(this.isShowCodehubUrl, templateState.isShowCodehubUrl)
            && Objects.equals(this.isExecute, templateState.isExecute)
            && Objects.equals(this.jobId, templateState.jobId) && Objects.equals(this.jobName, templateState.jobName)
            && Objects.equals(this.projectId, templateState.projectId)
            && Objects.equals(this.executionMode, templateState.executionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            name,
            moduleOrTemplateId,
            moduleOrTemplateName,
            displayName,
            dslMethod,
            parameters,
            isManualExecution,
            jobParameterValidate,
            isShowCodehubUrl,
            isExecute,
            jobId,
            jobName,
            projectId,
            executionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateState {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    moduleOrTemplateId: ").append(toIndentedString(moduleOrTemplateId)).append("\n");
        sb.append("    moduleOrTemplateName: ").append(toIndentedString(moduleOrTemplateName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    dslMethod: ").append(toIndentedString(dslMethod)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    isManualExecution: ").append(toIndentedString(isManualExecution)).append("\n");
        sb.append("    jobParameterValidate: ").append(toIndentedString(jobParameterValidate)).append("\n");
        sb.append("    isShowCodehubUrl: ").append(toIndentedString(isShowCodehubUrl)).append("\n");
        sb.append("    isExecute: ").append(toIndentedString(isExecute)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
