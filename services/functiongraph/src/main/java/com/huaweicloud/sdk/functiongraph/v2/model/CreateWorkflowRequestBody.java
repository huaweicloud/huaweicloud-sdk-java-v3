package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 函数流创建body体 */
public class CreateWorkflowRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<Trigger> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functions")

    private List<Function> functions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<OperationState> states = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constants")

    private Object constants;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retries")

    private List<Retry> retries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreateWorkflowRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 流程定义名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWorkflowRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 流程定义描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWorkflowRequestBody withTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public CreateWorkflowRequestBody addTriggersItem(Trigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public CreateWorkflowRequestBody withTriggers(Consumer<List<Trigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /** 触发器列表
     * 
     * @return triggers */
    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public CreateWorkflowRequestBody withStart(String start) {
        this.start = start;
        return this;
    }

    /** 流程开始节点ID
     * 
     * @return start */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public CreateWorkflowRequestBody withFunctions(List<Function> functions) {
        this.functions = functions;
        return this;
    }

    public CreateWorkflowRequestBody addFunctionsItem(Function functionsItem) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(functionsItem);
        return this;
    }

    public CreateWorkflowRequestBody withFunctions(Consumer<List<Function>> functionsSetter) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        functionsSetter.accept(this.functions);
        return this;
    }

    /** 函数清单
     * 
     * @return functions */
    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public CreateWorkflowRequestBody withStates(List<OperationState> states) {
        this.states = states;
        return this;
    }

    public CreateWorkflowRequestBody addStatesItem(OperationState statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public CreateWorkflowRequestBody withStates(Consumer<List<OperationState>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /** 工作流节点清单，定义参考SleepState和OperationState
     * 
     * @return states */
    public List<OperationState> getStates() {
        return states;
    }

    public void setStates(List<OperationState> states) {
        this.states = states;
    }

    public CreateWorkflowRequestBody withConstants(Object constants) {
        this.constants = constants;
        return this;
    }

    /** 工作流中的常量
     * 
     * @return constants */
    public Object getConstants() {
        return constants;
    }

    public void setConstants(Object constants) {
        this.constants = constants;
    }

    public CreateWorkflowRequestBody withRetries(List<Retry> retries) {
        this.retries = retries;
        return this;
    }

    public CreateWorkflowRequestBody addRetriesItem(Retry retriesItem) {
        if (this.retries == null) {
            this.retries = new ArrayList<>();
        }
        this.retries.add(retriesItem);
        return this;
    }

    public CreateWorkflowRequestBody withRetries(Consumer<List<Retry>> retriesSetter) {
        if (this.retries == null) {
            this.retries = new ArrayList<>();
        }
        retriesSetter.accept(this.retries);
        return this;
    }

    /** 重试策略清单
     * 
     * @return retries */
    public List<Retry> getRetries() {
        return retries;
    }

    public void setRetries(List<Retry> retries) {
        this.retries = retries;
    }

    public CreateWorkflowRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID，在企业用户创建函数时必填。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWorkflowRequestBody createWorkflowRequestBody = (CreateWorkflowRequestBody) o;
        return Objects.equals(this.name, createWorkflowRequestBody.name)
            && Objects.equals(this.description, createWorkflowRequestBody.description)
            && Objects.equals(this.triggers, createWorkflowRequestBody.triggers)
            && Objects.equals(this.start, createWorkflowRequestBody.start)
            && Objects.equals(this.functions, createWorkflowRequestBody.functions)
            && Objects.equals(this.states, createWorkflowRequestBody.states)
            && Objects.equals(this.constants, createWorkflowRequestBody.constants)
            && Objects.equals(this.retries, createWorkflowRequestBody.retries)
            && Objects.equals(this.enterpriseProjectId, createWorkflowRequestBody.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, triggers, start, functions, states, constants, retries, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    constants: ").append(toIndentedString(constants)).append("\n");
        sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
