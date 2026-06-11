package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkflowExecution
 */
public class WorkflowExecution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    private String workflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_id")

    private String sceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_name")

    private String sceneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps_execution")

    private List<StepExecution> stepsExecution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_graphs")

    private List<WorkflowSubgraph> subGraphs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<String> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_requirements")

    private List<DataRequirement> dataRequirements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<WorkflowParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private WorkflowDagPolicies policies;

    public WorkflowExecution withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WorkflowExecution withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 执行记录名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowExecution withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 工作流执行ID。
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public WorkflowExecution withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 执行记录描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkflowExecution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行记录状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WorkflowExecution withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public WorkflowExecution withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * Workflow工作流ID。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public WorkflowExecution withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * 工作流名称。填写1-64位，仅包含英文、数字、下划线（_）和中划线（-），并且以英文开头的名称。
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public WorkflowExecution withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * 自定义场景ID。
     * @return sceneId
     */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public WorkflowExecution withSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    /**
     * 自定义场景名称。
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public WorkflowExecution withStepsExecution(List<StepExecution> stepsExecution) {
        this.stepsExecution = stepsExecution;
        return this;
    }

    public WorkflowExecution addStepsExecutionItem(StepExecution stepsExecutionItem) {
        if (this.stepsExecution == null) {
            this.stepsExecution = new ArrayList<>();
        }
        this.stepsExecution.add(stepsExecutionItem);
        return this;
    }

    public WorkflowExecution withStepsExecution(Consumer<List<StepExecution>> stepsExecutionSetter) {
        if (this.stepsExecution == null) {
            this.stepsExecution = new ArrayList<>();
        }
        stepsExecutionSetter.accept(this.stepsExecution);
        return this;
    }

    /**
     * 执行记录的step。
     * @return stepsExecution
     */
    public List<StepExecution> getStepsExecution() {
        return stepsExecution;
    }

    public void setStepsExecution(List<StepExecution> stepsExecution) {
        this.stepsExecution = stepsExecution;
    }

    public WorkflowExecution withSubGraphs(List<WorkflowSubgraph> subGraphs) {
        this.subGraphs = subGraphs;
        return this;
    }

    public WorkflowExecution addSubGraphsItem(WorkflowSubgraph subGraphsItem) {
        if (this.subGraphs == null) {
            this.subGraphs = new ArrayList<>();
        }
        this.subGraphs.add(subGraphsItem);
        return this;
    }

    public WorkflowExecution withSubGraphs(Consumer<List<WorkflowSubgraph>> subGraphsSetter) {
        if (this.subGraphs == null) {
            this.subGraphs = new ArrayList<>();
        }
        subGraphsSetter.accept(this.subGraphs);
        return this;
    }

    /**
     * 子图。
     * @return subGraphs
     */
    public List<WorkflowSubgraph> getSubGraphs() {
        return subGraphs;
    }

    public void setSubGraphs(List<WorkflowSubgraph> subGraphs) {
        this.subGraphs = subGraphs;
    }

    public WorkflowExecution withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 执行的时长。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public WorkflowExecution withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public WorkflowExecution addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public WorkflowExecution withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 执行的事件。
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public WorkflowExecution withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public WorkflowExecution addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public WorkflowExecution withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 为执行记录设置的标签。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public WorkflowExecution withDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
        return this;
    }

    public WorkflowExecution addDataRequirementsItem(DataRequirement dataRequirementsItem) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        this.dataRequirements.add(dataRequirementsItem);
        return this;
    }

    public WorkflowExecution withDataRequirements(Consumer<List<DataRequirement>> dataRequirementsSetter) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        dataRequirementsSetter.accept(this.dataRequirements);
        return this;
    }

    /**
     * 节点steps使用到的数据。
     * @return dataRequirements
     */
    public List<DataRequirement> getDataRequirements() {
        return dataRequirements;
    }

    public void setDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
    }

    public WorkflowExecution withParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public WorkflowExecution addParametersItem(WorkflowParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public WorkflowExecution withParameters(Consumer<List<WorkflowParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 节点steps使用到的参数。
     * @return parameters
     */
    public List<WorkflowParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
    }

    public WorkflowExecution withPolicies(WorkflowDagPolicies policies) {
        this.policies = policies;
        return this;
    }

    public WorkflowExecution withPolicies(Consumer<WorkflowDagPolicies> policiesSetter) {
        if (this.policies == null) {
            this.policies = new WorkflowDagPolicies();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public WorkflowDagPolicies getPolicies() {
        return policies;
    }

    public void setPolicies(WorkflowDagPolicies policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowExecution that = (WorkflowExecution) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.name, that.name)
            && Objects.equals(this.executionId, that.executionId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.workflowName, that.workflowName)
            && Objects.equals(this.sceneId, that.sceneId) && Objects.equals(this.sceneName, that.sceneName)
            && Objects.equals(this.stepsExecution, that.stepsExecution)
            && Objects.equals(this.subGraphs, that.subGraphs) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.events, that.events) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.dataRequirements, that.dataRequirements)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt,
            name,
            executionId,
            description,
            status,
            workspaceId,
            workflowId,
            workflowName,
            sceneId,
            sceneName,
            stepsExecution,
            subGraphs,
            duration,
            events,
            labels,
            dataRequirements,
            parameters,
            policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowExecution {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
        sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
        sb.append("    stepsExecution: ").append(toIndentedString(stepsExecution)).append("\n");
        sb.append("    subGraphs: ").append(toIndentedString(subGraphs)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    dataRequirements: ").append(toIndentedString(dataRequirements)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
