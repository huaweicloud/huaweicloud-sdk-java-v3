package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GenerateOpsEvaluatorEvaluationStepsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_steps")

    private List<String> evaluationSteps = null;

    public GenerateOpsEvaluatorEvaluationStepsResponse withEvaluationSteps(List<String> evaluationSteps) {
        this.evaluationSteps = evaluationSteps;
        return this;
    }

    public GenerateOpsEvaluatorEvaluationStepsResponse addEvaluationStepsItem(String evaluationStepsItem) {
        if (this.evaluationSteps == null) {
            this.evaluationSteps = new ArrayList<>();
        }
        this.evaluationSteps.add(evaluationStepsItem);
        return this;
    }

    public GenerateOpsEvaluatorEvaluationStepsResponse withEvaluationSteps(
        Consumer<List<String>> evaluationStepsSetter) {
        if (this.evaluationSteps == null) {
            this.evaluationSteps = new ArrayList<>();
        }
        evaluationStepsSetter.accept(this.evaluationSteps);
        return this;
    }

    /**
     * **参数解释：** 生成的评估步骤列表，每个元素是一个独立的评估步骤描述。  **约束限制：** 列表不为空，最多返回10条评估步骤；每个步骤长度为1到200个字符。  **取值范围：** 符合评估任务要求的自然语言步骤。  **默认取值：** 不涉及。 
     * @return evaluationSteps
     */
    public List<String> getEvaluationSteps() {
        return evaluationSteps;
    }

    public void setEvaluationSteps(List<String> evaluationSteps) {
        this.evaluationSteps = evaluationSteps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateOpsEvaluatorEvaluationStepsResponse that = (GenerateOpsEvaluatorEvaluationStepsResponse) obj;
        return Objects.equals(this.evaluationSteps, that.evaluationSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationSteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateOpsEvaluatorEvaluationStepsResponse {\n");
        sb.append("    evaluationSteps: ").append(toIndentedString(evaluationSteps)).append("\n");
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
