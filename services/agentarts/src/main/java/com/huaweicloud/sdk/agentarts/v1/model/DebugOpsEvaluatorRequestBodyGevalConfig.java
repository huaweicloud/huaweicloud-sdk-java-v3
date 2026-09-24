package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** G-Eval 评估器配置（criteria/evaluation_steps/rubric/model_config）。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class DebugOpsEvaluatorRequestBodyGevalConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criteria")

    private String criteria;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_steps")

    private List<String> evaluationSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rubric")

    private List<DebugOpsEvaluatorRequestBodyGevalConfigRubric> rubric = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private EvaluationOpsLLMConfig modelConfig;

    public DebugOpsEvaluatorRequestBodyGevalConfig withCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * **参数解释：** 评估标准，描述大模型对输出进行评分的依据。 **约束限制：** 必填；去除首尾空格后长度不能超过20000字符；必须至少包含一个 {{variable}} 格式的模板变量，模板变量会在评估时被 test_case 中的值替换。 **取值范围：** 1~20000字符，且必须包含至少一个 {{变量名}} 占位符。 **默认取值：** 不涉及。 
     * @return criteria
     */
    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig withEvaluationSteps(List<String> evaluationSteps) {
        this.evaluationSteps = evaluationSteps;
        return this;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig addEvaluationStepsItem(String evaluationStepsItem) {
        if (this.evaluationSteps == null) {
            this.evaluationSteps = new ArrayList<>();
        }
        this.evaluationSteps.add(evaluationStepsItem);
        return this;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig withEvaluationSteps(Consumer<List<String>> evaluationStepsSetter) {
        if (this.evaluationSteps == null) {
            this.evaluationSteps = new ArrayList<>();
        }
        evaluationStepsSetter.accept(this.evaluationSteps);
        return this;
    }

    /**
     * **参数解释：** 评估步骤，指导大模型按步骤进行评估打分，可省略。 **约束限制：** 可选；数量不能超过10个；每个步骤去除首尾空格后长度需在1~200字符之间，不能为空。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluationSteps
     */
    public List<String> getEvaluationSteps() {
        return evaluationSteps;
    }

    public void setEvaluationSteps(List<String> evaluationSteps) {
        this.evaluationSteps = evaluationSteps;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig withRubric(
        List<DebugOpsEvaluatorRequestBodyGevalConfigRubric> rubric) {
        this.rubric = rubric;
        return this;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig addRubricItem(
        DebugOpsEvaluatorRequestBodyGevalConfigRubric rubricItem) {
        if (this.rubric == null) {
            this.rubric = new ArrayList<>();
        }
        this.rubric.add(rubricItem);
        return this;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig withRubric(
        Consumer<List<DebugOpsEvaluatorRequestBodyGevalConfigRubric>> rubricSetter) {
        if (this.rubric == null) {
            this.rubric = new ArrayList<>();
        }
        rubricSetter.accept(this.rubric);
        return this;
    }

    /**
     * **参数解释：** 评分细则，定义各分数档位对应的参考输出描述，供大模型打分时作为锚点，可省略。 **约束限制：** 可选；数量不能超过10个；score必须在0~1之间且不能重复；reference_outcome去除首尾空格后长度需在1~200字符之间，不能为空。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return rubric
     */
    public List<DebugOpsEvaluatorRequestBodyGevalConfigRubric> getRubric() {
        return rubric;
    }

    public void setRubric(List<DebugOpsEvaluatorRequestBodyGevalConfigRubric> rubric) {
        this.rubric = rubric;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig withModelConfig(EvaluationOpsLLMConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfig withModelConfig(Consumer<EvaluationOpsLLMConfig> modelConfigSetter) {
        if (this.modelConfig == null) {
            this.modelConfig = new EvaluationOpsLLMConfig();
            modelConfigSetter.accept(this.modelConfig);
        }

        return this;
    }

    /**
     * Get modelConfig
     * @return modelConfig
     */
    public EvaluationOpsLLMConfig getModelConfig() {
        return modelConfig;
    }

    public void setModelConfig(EvaluationOpsLLMConfig modelConfig) {
        this.modelConfig = modelConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugOpsEvaluatorRequestBodyGevalConfig that = (DebugOpsEvaluatorRequestBodyGevalConfig) obj;
        return Objects.equals(this.criteria, that.criteria)
            && Objects.equals(this.evaluationSteps, that.evaluationSteps) && Objects.equals(this.rubric, that.rubric)
            && Objects.equals(this.modelConfig, that.modelConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteria, evaluationSteps, rubric, modelConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugOpsEvaluatorRequestBodyGevalConfig {\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
        sb.append("    evaluationSteps: ").append(toIndentedString(evaluationSteps)).append("\n");
        sb.append("    rubric: ").append(toIndentedString(rubric)).append("\n");
        sb.append("    modelConfig: ").append(toIndentedString(modelConfig)).append("\n");
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
