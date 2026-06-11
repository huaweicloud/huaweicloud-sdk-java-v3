package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流节点。
 */
public class WorkflowStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<JobInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<JobOutput> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, Object> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_steps")

    private List<String> dependSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<StepCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_then_steps")

    private List<String> ifThenSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "else_then_steps")

    private List<String> elseThenSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private WorkflowStepPolicy policy;

    public WorkflowStep withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Workflow工作流节点的名称，在一个DAG中唯一，1到64位只包含中英文，数字，空格，下划线（_）和中划线（-），并且以中英文开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowStep withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 节点的类型，枚举值如下: - job 训练 - labeling 标注 - release_dataset 数据集发布 - model 模型发布 - service 服务部署 - mrs_job MRS作业 - dataset_import 数据集导入 - create_dataset 创建数据集
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WorkflowStep withInputs(List<JobInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public WorkflowStep addInputsItem(JobInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public WorkflowStep withInputs(Consumer<List<JobInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 节点的输入项。
     * @return inputs
     */
    public List<JobInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<JobInput> inputs) {
        this.inputs = inputs;
    }

    public WorkflowStep withOutputs(List<JobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    public WorkflowStep addOutputsItem(JobOutput outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public WorkflowStep withOutputs(Consumer<List<JobOutput>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 节点的输出项。
     * @return outputs
     */
    public List<JobOutput> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<JobOutput> outputs) {
        this.outputs = outputs;
    }

    public WorkflowStep withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 节点的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WorkflowStep withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 工作流节点标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WorkflowStep withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 节点的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkflowStep withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public WorkflowStep putPropertiesItem(String key, Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public WorkflowStep withProperties(Consumer<Map<String, Object>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 节点属性。
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public WorkflowStep withDependSteps(List<String> dependSteps) {
        this.dependSteps = dependSteps;
        return this;
    }

    public WorkflowStep addDependStepsItem(String dependStepsItem) {
        if (this.dependSteps == null) {
            this.dependSteps = new ArrayList<>();
        }
        this.dependSteps.add(dependStepsItem);
        return this;
    }

    public WorkflowStep withDependSteps(Consumer<List<String>> dependStepsSetter) {
        if (this.dependSteps == null) {
            this.dependSteps = new ArrayList<>();
        }
        dependStepsSetter.accept(this.dependSteps);
        return this;
    }

    /**
     * 运行依赖的前置节点。
     * @return dependSteps
     */
    public List<String> getDependSteps() {
        return dependSteps;
    }

    public void setDependSteps(List<String> dependSteps) {
        this.dependSteps = dependSteps;
    }

    public WorkflowStep withConditions(List<StepCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public WorkflowStep addConditionsItem(StepCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public WorkflowStep withConditions(Consumer<List<StepCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 节点执行条件。
     * @return conditions
     */
    public List<StepCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<StepCondition> conditions) {
        this.conditions = conditions;
    }

    public WorkflowStep withIfThenSteps(List<String> ifThenSteps) {
        this.ifThenSteps = ifThenSteps;
        return this;
    }

    public WorkflowStep addIfThenStepsItem(String ifThenStepsItem) {
        if (this.ifThenSteps == null) {
            this.ifThenSteps = new ArrayList<>();
        }
        this.ifThenSteps.add(ifThenStepsItem);
        return this;
    }

    public WorkflowStep withIfThenSteps(Consumer<List<String>> ifThenStepsSetter) {
        if (this.ifThenSteps == null) {
            this.ifThenSteps = new ArrayList<>();
        }
        ifThenStepsSetter.accept(this.ifThenSteps);
        return this;
    }

    /**
     * 条件节点分支。
     * @return ifThenSteps
     */
    public List<String> getIfThenSteps() {
        return ifThenSteps;
    }

    public void setIfThenSteps(List<String> ifThenSteps) {
        this.ifThenSteps = ifThenSteps;
    }

    public WorkflowStep withElseThenSteps(List<String> elseThenSteps) {
        this.elseThenSteps = elseThenSteps;
        return this;
    }

    public WorkflowStep addElseThenStepsItem(String elseThenStepsItem) {
        if (this.elseThenSteps == null) {
            this.elseThenSteps = new ArrayList<>();
        }
        this.elseThenSteps.add(elseThenStepsItem);
        return this;
    }

    public WorkflowStep withElseThenSteps(Consumer<List<String>> elseThenStepsSetter) {
        if (this.elseThenSteps == null) {
            this.elseThenSteps = new ArrayList<>();
        }
        elseThenStepsSetter.accept(this.elseThenSteps);
        return this;
    }

    /**
     * 条件节点另一分支。
     * @return elseThenSteps
     */
    public List<String> getElseThenSteps() {
        return elseThenSteps;
    }

    public void setElseThenSteps(List<String> elseThenSteps) {
        this.elseThenSteps = elseThenSteps;
    }

    public WorkflowStep withPolicy(WorkflowStepPolicy policy) {
        this.policy = policy;
        return this;
    }

    public WorkflowStep withPolicy(Consumer<WorkflowStepPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new WorkflowStepPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public WorkflowStepPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(WorkflowStepPolicy policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowStep that = (WorkflowStep) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.dependSteps, that.dependSteps) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.ifThenSteps, that.ifThenSteps)
            && Objects.equals(this.elseThenSteps, that.elseThenSteps) && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            inputs,
            outputs,
            createdAt,
            title,
            description,
            properties,
            dependSteps,
            conditions,
            ifThenSteps,
            elseThenSteps,
            policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStep {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    dependSteps: ").append(toIndentedString(dependSteps)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    ifThenSteps: ").append(toIndentedString(ifThenSteps)).append("\n");
        sb.append("    elseThenSteps: ").append(toIndentedString(elseThenSteps)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
