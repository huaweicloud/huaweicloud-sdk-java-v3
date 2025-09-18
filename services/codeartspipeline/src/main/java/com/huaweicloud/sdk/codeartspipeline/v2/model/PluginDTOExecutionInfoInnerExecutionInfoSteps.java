package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PluginDTOExecutionInfoInnerExecutionInfoSteps
 */
public class PluginDTOExecutionInfoInnerExecutionInfoSteps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private String task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private Map<String, Object> variables = null;

    public PluginDTOExecutionInfoInnerExecutionInfoSteps withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 任务名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginDTOExecutionInfoInnerExecutionInfoSteps withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * **参数解释**： 任务类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return task
     */
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public PluginDTOExecutionInfoInnerExecutionInfoSteps withVariables(Map<String, Object> variables) {
        this.variables = variables;
        return this;
    }

    public PluginDTOExecutionInfoInnerExecutionInfoSteps putVariablesItem(String key, Object variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variablesItem);
        return this;
    }

    public PluginDTOExecutionInfoInnerExecutionInfoSteps withVariables(Consumer<Map<String, Object>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * **参数解释**： 参数信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return variables
     */
    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginDTOExecutionInfoInnerExecutionInfoSteps that = (PluginDTOExecutionInfoInnerExecutionInfoSteps) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.task, that.task)
            && Objects.equals(this.variables, that.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, task, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginDTOExecutionInfoInnerExecutionInfoSteps {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
