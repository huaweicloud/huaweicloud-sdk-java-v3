package com.huaweicloud.sdk.cloudpipeline.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v2.model.FlowItem;
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
    
    private FlowItem flow;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="states")
    
    private Map<String, TemplateState> states = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow")
    
    private Workflow workflow;

    public TemplateCddl withFlow(FlowItem flow) {
        this.flow = flow;
        return this;
    }

    public TemplateCddl withFlow(Consumer<FlowItem> flowSetter) {
        if(this.flow == null ){
            this.flow = new FlowItem();
            flowSetter.accept(this.flow);
        }
        
        return this;
    }


    /**
     * Get flow
     * @return flow
     */
    public FlowItem getFlow() {
        return flow;
    }

    public void setFlow(FlowItem flow) {
        this.flow = flow;
    }

    

    public TemplateCddl withStates(Map<String, TemplateState> states) {
        this.states = states;
        return this;
    }

    

    public TemplateCddl putStatesItem(String key, TemplateState statesItem) {
        this.states.put(key, statesItem);
        return this;
    }

    public TemplateCddl withStates(Consumer<Map<String, TemplateState>> statesSetter) {
        if(this.states == null ){
            this.states = new HashMap<>();
        }
        statesSetter.accept(this.states);
        return this;
    }
    /**
     * 子任务states，map类型数据
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

