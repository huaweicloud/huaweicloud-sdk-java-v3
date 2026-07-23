package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GenerateOpsEvaluatorEvaluationStepsRequestBody
 */
public class GenerateOpsEvaluatorEvaluationStepsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criteria")

    private String criteria;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig modelConfig;

    public GenerateOpsEvaluatorEvaluationStepsRequestBody withCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * **参数解释：** 评估标准描述，用于告知模型需要评估的维度和判断依据。  **约束限制：** - 长度必须在1到20000字符之间。 - 必须包含至少一个用双大括号{{}}包裹的变量。  **取值范围：** 符合自然语言规范的文本，支持中英文。  **示例取值：** \"评估{{actual_output}}是否准确回答了{{input}}，并与{{reference_output}}进行对比\" 
     * @return criteria
     */
    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public GenerateOpsEvaluatorEvaluationStepsRequestBody withModelConfig(
        GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public GenerateOpsEvaluatorEvaluationStepsRequestBody withModelConfig(
        Consumer<GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig> modelConfigSetter) {
        if (this.modelConfig == null) {
            this.modelConfig = new GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig();
            modelConfigSetter.accept(this.modelConfig);
        }

        return this;
    }

    /**
     * Get modelConfig
     * @return modelConfig
     */
    public GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig getModelConfig() {
        return modelConfig;
    }

    public void setModelConfig(GenerateOpsEvaluatorEvaluationStepsRequestBodyModelConfig modelConfig) {
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
        GenerateOpsEvaluatorEvaluationStepsRequestBody that = (GenerateOpsEvaluatorEvaluationStepsRequestBody) obj;
        return Objects.equals(this.criteria, that.criteria) && Objects.equals(this.modelConfig, that.modelConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteria, modelConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateOpsEvaluatorEvaluationStepsRequestBody {\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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
