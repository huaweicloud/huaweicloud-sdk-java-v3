package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateWorkflowExecutionResponse extends SdkResponse {

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

    private List<StepExecutionResp> stepsExecution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_graphs")

    private List<WorkflowSubgraphResp> subGraphs = null;

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

    private List<DataRequirementResp> dataRequirements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<WorkflowParameterResp> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private WorkflowDagPoliciesResp policies;

    public UpdateWorkflowExecutionResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **取值范围**：不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateWorkflowExecutionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：执行记录名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateWorkflowExecutionResponse withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * **参数解释**：工作流执行ID。[获取方法请参见[获取Execution列表](ListWorkflowExecutions.xml)。](tag:hc)。 **取值范围**：不涉及。
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public UpdateWorkflowExecutionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：执行记录描述。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateWorkflowExecutionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：执行记录状态。 **取值范围**：枚举值如下： - init：初始化 - running：运行中 - completed：运行成功 - stopped：已停止 - abnormal：异常
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateWorkflowExecutionResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。获取方法请参见[查询工作空间列表](ListWorkspace.xml)。 **取值范围**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateWorkflowExecutionResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * **参数解释**：Workflow工作流ID。 **取值范围**：不涉及。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public UpdateWorkflowExecutionResponse withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * **参数解释**：工作流名称。 **取值范围**：不涉及。
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public UpdateWorkflowExecutionResponse withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * **参数解释**：自定义场景ID，[获取方法请参见[查询工作流执行记录列表](CreateWorkflow.xml)](tag:hc)。 **取值范围**：不涉及。
     * @return sceneId
     */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public UpdateWorkflowExecutionResponse withSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    /**
     * **参数解释**：自定义场景名称。 **取值范围**：不涉及。
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public UpdateWorkflowExecutionResponse withStepsExecution(List<StepExecutionResp> stepsExecution) {
        this.stepsExecution = stepsExecution;
        return this;
    }

    public UpdateWorkflowExecutionResponse addStepsExecutionItem(StepExecutionResp stepsExecutionItem) {
        if (this.stepsExecution == null) {
            this.stepsExecution = new ArrayList<>();
        }
        this.stepsExecution.add(stepsExecutionItem);
        return this;
    }

    public UpdateWorkflowExecutionResponse withStepsExecution(Consumer<List<StepExecutionResp>> stepsExecutionSetter) {
        if (this.stepsExecution == null) {
            this.stepsExecution = new ArrayList<>();
        }
        stepsExecutionSetter.accept(this.stepsExecution);
        return this;
    }

    /**
     * **参数解释**：执行记录的step。 **约束限制**：不涉及。
     * @return stepsExecution
     */
    public List<StepExecutionResp> getStepsExecution() {
        return stepsExecution;
    }

    public void setStepsExecution(List<StepExecutionResp> stepsExecution) {
        this.stepsExecution = stepsExecution;
    }

    public UpdateWorkflowExecutionResponse withSubGraphs(List<WorkflowSubgraphResp> subGraphs) {
        this.subGraphs = subGraphs;
        return this;
    }

    public UpdateWorkflowExecutionResponse addSubGraphsItem(WorkflowSubgraphResp subGraphsItem) {
        if (this.subGraphs == null) {
            this.subGraphs = new ArrayList<>();
        }
        this.subGraphs.add(subGraphsItem);
        return this;
    }

    public UpdateWorkflowExecutionResponse withSubGraphs(Consumer<List<WorkflowSubgraphResp>> subGraphsSetter) {
        if (this.subGraphs == null) {
            this.subGraphs = new ArrayList<>();
        }
        subGraphsSetter.accept(this.subGraphs);
        return this;
    }

    /**
     * **参数解释**：子图。
     * @return subGraphs
     */
    public List<WorkflowSubgraphResp> getSubGraphs() {
        return subGraphs;
    }

    public void setSubGraphs(List<WorkflowSubgraphResp> subGraphs) {
        this.subGraphs = subGraphs;
    }

    public UpdateWorkflowExecutionResponse withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：执行的时长。 **取值范围**：不涉及。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public UpdateWorkflowExecutionResponse withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public UpdateWorkflowExecutionResponse addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public UpdateWorkflowExecutionResponse withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * **参数解释**：执行的事件。
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public UpdateWorkflowExecutionResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public UpdateWorkflowExecutionResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public UpdateWorkflowExecutionResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：为执行记录设置的标签。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public UpdateWorkflowExecutionResponse withDataRequirements(List<DataRequirementResp> dataRequirements) {
        this.dataRequirements = dataRequirements;
        return this;
    }

    public UpdateWorkflowExecutionResponse addDataRequirementsItem(DataRequirementResp dataRequirementsItem) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        this.dataRequirements.add(dataRequirementsItem);
        return this;
    }

    public UpdateWorkflowExecutionResponse withDataRequirements(
        Consumer<List<DataRequirementResp>> dataRequirementsSetter) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        dataRequirementsSetter.accept(this.dataRequirements);
        return this;
    }

    /**
     * **参数解释**：节点steps使用到的数据。
     * @return dataRequirements
     */
    public List<DataRequirementResp> getDataRequirements() {
        return dataRequirements;
    }

    public void setDataRequirements(List<DataRequirementResp> dataRequirements) {
        this.dataRequirements = dataRequirements;
    }

    public UpdateWorkflowExecutionResponse withParameters(List<WorkflowParameterResp> parameters) {
        this.parameters = parameters;
        return this;
    }

    public UpdateWorkflowExecutionResponse addParametersItem(WorkflowParameterResp parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public UpdateWorkflowExecutionResponse withParameters(Consumer<List<WorkflowParameterResp>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * **参数解释**：节点steps使用到的参数。
     * @return parameters
     */
    public List<WorkflowParameterResp> getParameters() {
        return parameters;
    }

    public void setParameters(List<WorkflowParameterResp> parameters) {
        this.parameters = parameters;
    }

    public UpdateWorkflowExecutionResponse withPolicies(WorkflowDagPoliciesResp policies) {
        this.policies = policies;
        return this;
    }

    public UpdateWorkflowExecutionResponse withPolicies(Consumer<WorkflowDagPoliciesResp> policiesSetter) {
        if (this.policies == null) {
            this.policies = new WorkflowDagPoliciesResp();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public WorkflowDagPoliciesResp getPolicies() {
        return policies;
    }

    public void setPolicies(WorkflowDagPoliciesResp policies) {
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
        UpdateWorkflowExecutionResponse that = (UpdateWorkflowExecutionResponse) obj;
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
        sb.append("class UpdateWorkflowExecutionResponse {\n");
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
