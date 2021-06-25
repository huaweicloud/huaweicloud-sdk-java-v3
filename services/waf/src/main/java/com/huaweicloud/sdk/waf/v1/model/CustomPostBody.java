package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CustomAction;
import com.huaweicloud.sdk.waf.v1.model.CustomConditions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建精准防护规则body
 */
public class CustomPostBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_mode")
    
    private Boolean actionMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private Boolean time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    
    private Integer start;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="terminal")
    
    private Integer terminal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conditions")
    
    private List<CustomConditions> conditions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private CustomAction action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    private Integer priority;

    public CustomPostBody withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CustomPostBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    


    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    

    public CustomPostBody withActionMode(Boolean actionMode) {
        this.actionMode = actionMode;
        return this;
    }

    


    /**
     * 攻击惩罚
     * @return actionMode
     */
    public Boolean getActionMode() {
        return actionMode;
    }

    public void setActionMode(Boolean actionMode) {
        this.actionMode = actionMode;
    }

    

    public CustomPostBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 自定义规则的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CustomPostBody withTime(Boolean time) {
        this.time = time;
        return this;
    }

    


    /**
     * 精准防护规则生效时间
     * @return time
     */
    public Boolean getTime() {
        return time;
    }

    public void setTime(Boolean time) {
        this.time = time;
    }

    

    public CustomPostBody withStart(Integer start) {
        this.start = start;
        return this;
    }

    


    /**
     * 精准防护规则生效的起始时间
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    

    public CustomPostBody withTerminal(Integer terminal) {
        this.terminal = terminal;
        return this;
    }

    


    /**
     * 精准防护规则生效的终止时间
     * @return terminal
     */
    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    

    public CustomPostBody withConditions(List<CustomConditions> conditions) {
        this.conditions = conditions;
        return this;
    }

    
    public CustomPostBody addConditionsItem(CustomConditions conditionsItem) {
        if(this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CustomPostBody withConditions(Consumer<List<CustomConditions>> conditionsSetter) {
        if(this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 匹配条件列表
     * @return conditions
     */
    public List<CustomConditions> getConditions() {
        return conditions;
    }

    public void setConditions(List<CustomConditions> conditions) {
        this.conditions = conditions;
    }

    

    public CustomPostBody withAction(CustomAction action) {
        this.action = action;
        return this;
    }

    public CustomPostBody withAction(Consumer<CustomAction> actionSetter) {
        if(this.action == null ){
            this.action = new CustomAction();
            actionSetter.accept(this.action);
        }
        
        return this;
    }


    /**
     * Get action
     * @return action
     */
    public CustomAction getAction() {
        return action;
    }

    public void setAction(CustomAction action) {
        this.action = action;
    }

    

    public CustomPostBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    


    /**
     * 优先级（0-1000的整数）
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomPostBody customPostBody = (CustomPostBody) o;
        return Objects.equals(this.id, customPostBody.id) &&
            Objects.equals(this.policyid, customPostBody.policyid) &&
            Objects.equals(this.actionMode, customPostBody.actionMode) &&
            Objects.equals(this.name, customPostBody.name) &&
            Objects.equals(this.time, customPostBody.time) &&
            Objects.equals(this.start, customPostBody.start) &&
            Objects.equals(this.terminal, customPostBody.terminal) &&
            Objects.equals(this.conditions, customPostBody.conditions) &&
            Objects.equals(this.action, customPostBody.action) &&
            Objects.equals(this.priority, customPostBody.priority);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, actionMode, name, time, start, terminal, conditions, action, priority);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomPostBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    actionMode: ").append(toIndentedString(actionMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

