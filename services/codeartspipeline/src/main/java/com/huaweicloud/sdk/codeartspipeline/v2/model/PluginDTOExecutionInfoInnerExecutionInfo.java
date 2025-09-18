package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 插件执行信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
 */
public class PluginDTOExecutionInfoInnerExecutionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_type")

    private String executionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<PluginDTOExecutionInfoInnerExecutionInfoSteps> steps = null;

    public PluginDTOExecutionInfoInnerExecutionInfo withExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }

    /**
     * **参数解释**： 插件类型。 **约束限制**： 不涉及。 **取值范围**： CONTAINER, ZIP, SHELL, COMPOSITE。 **默认取值**： 不涉及。 
     * @return executionType
     */
    public String getExecutionType() {
        return executionType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public PluginDTOExecutionInfoInnerExecutionInfo withSteps(
        List<PluginDTOExecutionInfoInnerExecutionInfoSteps> steps) {
        this.steps = steps;
        return this;
    }

    public PluginDTOExecutionInfoInnerExecutionInfo addStepsItem(
        PluginDTOExecutionInfoInnerExecutionInfoSteps stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public PluginDTOExecutionInfoInnerExecutionInfo withSteps(
        Consumer<List<PluginDTOExecutionInfoInnerExecutionInfoSteps>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * Get steps
     * @return steps
     */
    public List<PluginDTOExecutionInfoInnerExecutionInfoSteps> getSteps() {
        return steps;
    }

    public void setSteps(List<PluginDTOExecutionInfoInnerExecutionInfoSteps> steps) {
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
        PluginDTOExecutionInfoInnerExecutionInfo that = (PluginDTOExecutionInfoInnerExecutionInfo) obj;
        return Objects.equals(this.executionType, that.executionType) && Objects.equals(this.steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionType, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginDTOExecutionInfoInnerExecutionInfo {\n");
        sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
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
