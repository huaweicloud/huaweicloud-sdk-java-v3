package com.huaweicloud.sdk.cloudpipeline.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v2.model.TemplateState;
import com.huaweicloud.sdk.cloudpipeline.v2.model.Workflow;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建流水线接口入参
 */
public class TemplateCddl  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flow")
    
    private Map<String, Map<String, String>> flow = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="states")
    
    private Map<String, TemplateState> states = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow")
    
    private Workflow workflow;

    public TemplateCddl withFlow(Map<String, Map<String, String>> flow) {
        this.flow = flow;
        return this;
    }

    

    public TemplateCddl putFlowItem(String key, Map<String, String> flowItem) {
        if(this.flow == null) {
            this.flow = new HashMap<>();
        }
        this.flow.put(key, flowItem);
        return this;
    }

    public TemplateCddl withFlow(Consumer<Map<String, Map<String, String>>> flowSetter) {
        if(this.flow == null) {
            this.flow = new HashMap<>();
        }
        flowSetter.accept(this.flow);
        return this;
    }
    /**
     * 编排flow详情，描述流水线内各阶段任务的串并行关系。map类型数据，key为阶段名字，默认第一阶段initial，最后阶段为final，其余名字以'state_数字'标识。value为该阶段内任务(以'Task_数字'标识)以及后续阶段的标识。本字段为描述流水线基础编排数据之一，建议可通过流水线真实界面基于模板创建接口中获取
     * @return flow
     */
    public Map<String, Map<String, String>> getFlow() {
        return flow;
    }

    public void setFlow(Map<String, Map<String, String>> flow) {
        this.flow = flow;
    }

    

    public TemplateCddl withStates(Map<String, TemplateState> states) {
        this.states = states;
        return this;
    }

    

    public TemplateCddl putStatesItem(String key, TemplateState statesItem) {
        if(this.states == null) {
            this.states = new HashMap<>();
        }
        this.states.put(key, statesItem);
        return this;
    }

    public TemplateCddl withStates(Consumer<Map<String, TemplateState>> statesSetter) {
        if(this.states == null) {
            this.states = new HashMap<>();
        }
        statesSetter.accept(this.states);
        return this;
    }
    /**
     * 编排State详情，map类型数据。本字段为描述流水线基础编排数据之一，建议可通过流水线真实界面基于模板创建接口中获取
     * @return states
     */
    public Map<String, TemplateState> getStates() {
        return states;
    }

    public void setStates(Map<String, TemplateState> states) {
        this.states = states;
    }

    

    public TemplateCddl withWorkflow(Workflow workflow) {
        this.workflow = workflow;
        return this;
    }

    public TemplateCddl withWorkflow(Consumer<Workflow> workflowSetter) {
        if(this.workflow == null ){
            this.workflow = new Workflow();
            workflowSetter.accept(this.workflow);
        }
        
        return this;
    }


    /**
     * Get workflow
     * @return workflow
     */
    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateCddl templateCddl = (TemplateCddl) o;
        return Objects.equals(this.flow, templateCddl.flow) &&
            Objects.equals(this.states, templateCddl.states) &&
            Objects.equals(this.workflow, templateCddl.workflow);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flow, states, workflow);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateCddl {\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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

