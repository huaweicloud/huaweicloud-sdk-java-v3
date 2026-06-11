package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流更新信息。
 */
public class WorkflowUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_requirements")

    private List<DataRequirement> dataRequirements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<WorkflowParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages")

    private List<WorkflowStorage> storages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_switch")

    private String smnSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<WorkflowStep> steps = null;

    public WorkflowUpdate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作流名称。填写1-64位，仅包含英文、数字、下划线（_）和中划线（-），并且以英文开头的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowUpdate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作流描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkflowUpdate withDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
        return this;
    }

    public WorkflowUpdate addDataRequirementsItem(DataRequirement dataRequirementsItem) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        this.dataRequirements.add(dataRequirementsItem);
        return this;
    }

    public WorkflowUpdate withDataRequirements(Consumer<List<DataRequirement>> dataRequirementsSetter) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        dataRequirementsSetter.accept(this.dataRequirements);
        return this;
    }

    /**
     * Workflow包含的数据输入项定义。
     * @return dataRequirements
     */
    public List<DataRequirement> getDataRequirements() {
        return dataRequirements;
    }

    public void setDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
    }

    public WorkflowUpdate withParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public WorkflowUpdate addParametersItem(WorkflowParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public WorkflowUpdate withParameters(Consumer<List<WorkflowParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 工作流参数。
     * @return parameters
     */
    public List<WorkflowParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
    }

    public WorkflowUpdate withStorages(List<WorkflowStorage> storages) {
        this.storages = storages;
        return this;
    }

    public WorkflowUpdate addStoragesItem(WorkflowStorage storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public WorkflowUpdate withStorages(Consumer<List<WorkflowStorage>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * 工作流存储信息。
     * @return storages
     */
    public List<WorkflowStorage> getStorages() {
        return storages;
    }

    public void setStorages(List<WorkflowStorage> storages) {
        this.storages = storages;
    }

    public WorkflowUpdate withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public WorkflowUpdate addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public WorkflowUpdate withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 工作流标签。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public WorkflowUpdate withSmnSwitch(String smnSwitch) {
        this.smnSwitch = smnSwitch;
        return this;
    }

    /**
     * SMN消息订阅开关。
     * @return smnSwitch
     */
    public String getSmnSwitch() {
        return smnSwitch;
    }

    public void setSmnSwitch(String smnSwitch) {
        this.smnSwitch = smnSwitch;
    }

    public WorkflowUpdate withSteps(List<WorkflowStep> steps) {
        this.steps = steps;
        return this;
    }

    public WorkflowUpdate addStepsItem(WorkflowStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public WorkflowUpdate withSteps(Consumer<List<WorkflowStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 工作流节点。
     * @return steps
     */
    public List<WorkflowStep> getSteps() {
        return steps;
    }

    public void setSteps(List<WorkflowStep> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowUpdate that = (WorkflowUpdate) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.dataRequirements, that.dataRequirements)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.storages, that.storages)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.smnSwitch, that.smnSwitch)
            && Objects.equals(this.steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dataRequirements, parameters, storages, labels, smnSwitch, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowUpdate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataRequirements: ").append(toIndentedString(dataRequirements)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    smnSwitch: ").append(toIndentedString(smnSwitch)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
