package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 输入数据来源映射定义，scenario&#x3D;agent时必填。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsFineGrainedEvaluationObjectConfigInputsMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_input")

    private OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput workflowInput;

    public OpsFineGrainedEvaluationObjectConfigInputsMapping withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * **参数解释：** 智能体执行时的输入参数来源字段。 **约束限制：** 字符长度1到100。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public OpsFineGrainedEvaluationObjectConfigInputsMapping withWorkflowInput(
        OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput workflowInput) {
        this.workflowInput = workflowInput;
        return this;
    }

    public OpsFineGrainedEvaluationObjectConfigInputsMapping withWorkflowInput(
        Consumer<OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput> workflowInputSetter) {
        if (this.workflowInput == null) {
            this.workflowInput = new OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput();
            workflowInputSetter.accept(this.workflowInput);
        }

        return this;
    }

    /**
     * Get workflowInput
     * @return workflowInput
     */
    public OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput getWorkflowInput() {
        return workflowInput;
    }

    public void setWorkflowInput(OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput workflowInput) {
        this.workflowInput = workflowInput;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFineGrainedEvaluationObjectConfigInputsMapping that =
            (OpsFineGrainedEvaluationObjectConfigInputsMapping) obj;
        return Objects.equals(this.input, that.input) && Objects.equals(this.workflowInput, that.workflowInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, workflowInput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFineGrainedEvaluationObjectConfigInputsMapping {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    workflowInput: ").append(toIndentedString(workflowInput)).append("\n");
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
