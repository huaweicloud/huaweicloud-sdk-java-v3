package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行定义
 */
public class ExtensionExecution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<ExtensionExecutionStep> steps = null;

    public ExtensionExecution withSteps(List<ExtensionExecutionStep> steps) {
        this.steps = steps;
        return this;
    }

    public ExtensionExecution addStepsItem(ExtensionExecutionStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public ExtensionExecution withSteps(Consumer<List<ExtensionExecutionStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 执行步骤列表。
     * @return steps
     */
    public List<ExtensionExecutionStep> getSteps() {
        return steps;
    }

    public void setSteps(List<ExtensionExecutionStep> steps) {
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
        ExtensionExecution that = (ExtensionExecution) obj;
        return Objects.equals(this.steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionExecution {\n");
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
