package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EvolveTaskCreateReq
 */
public class EvolveTaskCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_path")

    private String outputPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_id")

    private String algorithmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_file")

    private String algorithmFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_func_name")

    private String algorithmFuncName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_file")

    private String evaluatorFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_func_name")

    private String evaluatorFuncName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_baseline")

    private String evaluatorBaseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_baseline_func_name")

    private String evaluatorBaselineFuncName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_parameter")

    private EvaluatorParameter evaluatorParameter;

    public EvolveTaskCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 优化任务名称。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,64]。 **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EvolveTaskCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 优化任务描述。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,65536]。 **默认取值**： 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EvolveTaskCreateReq withOutputPath(String outputPath) {
        this.outputPath = outputPath;
        return this;
    }

    /**
     * **参数解释**： 优化结果存储路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,256]。 **默认取值**： 不涉及 
     * @return outputPath
     */
    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public EvolveTaskCreateReq withAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }

    /**
     * **参数解释**： 关联的算法设计项目。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,128]。 **默认取值**： 不涉及 
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
    }

    public EvolveTaskCreateReq withAlgorithmFile(String algorithmFile) {
        this.algorithmFile = algorithmFile;
        return this;
    }

    /**
     * **参数解释**： 关联的算法文件路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,256]。 **默认取值**： 不涉及 
     * @return algorithmFile
     */
    public String getAlgorithmFile() {
        return algorithmFile;
    }

    public void setAlgorithmFile(String algorithmFile) {
        this.algorithmFile = algorithmFile;
    }

    public EvolveTaskCreateReq withAlgorithmFuncName(String algorithmFuncName) {
        this.algorithmFuncName = algorithmFuncName;
        return this;
    }

    /**
     * **参数解释**： 算法函数名。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,256]。 **默认取值**： 不涉及 
     * @return algorithmFuncName
     */
    public String getAlgorithmFuncName() {
        return algorithmFuncName;
    }

    public void setAlgorithmFuncName(String algorithmFuncName) {
        this.algorithmFuncName = algorithmFuncName;
    }

    public EvolveTaskCreateReq withEvaluatorFile(String evaluatorFile) {
        this.evaluatorFile = evaluatorFile;
        return this;
    }

    /**
     * **参数解释**： 评估器文件路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,65536]。 **默认取值**： 不涉及 
     * @return evaluatorFile
     */
    public String getEvaluatorFile() {
        return evaluatorFile;
    }

    public void setEvaluatorFile(String evaluatorFile) {
        this.evaluatorFile = evaluatorFile;
    }

    public EvolveTaskCreateReq withEvaluatorFuncName(String evaluatorFuncName) {
        this.evaluatorFuncName = evaluatorFuncName;
        return this;
    }

    /**
     * **参数解释**： 评估器算法函数名。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,256]。 **默认取值**： 不涉及 
     * @return evaluatorFuncName
     */
    public String getEvaluatorFuncName() {
        return evaluatorFuncName;
    }

    public void setEvaluatorFuncName(String evaluatorFuncName) {
        this.evaluatorFuncName = evaluatorFuncName;
    }

    public EvolveTaskCreateReq withEvaluatorBaseline(String evaluatorBaseline) {
        this.evaluatorBaseline = evaluatorBaseline;
        return this;
    }

    /**
     * **参数解释**： 评估基线文件路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,65536]。 **默认取值**： 不涉及 
     * @return evaluatorBaseline
     */
    public String getEvaluatorBaseline() {
        return evaluatorBaseline;
    }

    public void setEvaluatorBaseline(String evaluatorBaseline) {
        this.evaluatorBaseline = evaluatorBaseline;
    }

    public EvolveTaskCreateReq withEvaluatorBaselineFuncName(String evaluatorBaselineFuncName) {
        this.evaluatorBaselineFuncName = evaluatorBaselineFuncName;
        return this;
    }

    /**
     * **参数解释**： 评估基线算法函数名。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,256]。 **默认取值**： 不涉及 
     * @return evaluatorBaselineFuncName
     */
    public String getEvaluatorBaselineFuncName() {
        return evaluatorBaselineFuncName;
    }

    public void setEvaluatorBaselineFuncName(String evaluatorBaselineFuncName) {
        this.evaluatorBaselineFuncName = evaluatorBaselineFuncName;
    }

    public EvolveTaskCreateReq withEvaluatorParameter(EvaluatorParameter evaluatorParameter) {
        this.evaluatorParameter = evaluatorParameter;
        return this;
    }

    public EvolveTaskCreateReq withEvaluatorParameter(Consumer<EvaluatorParameter> evaluatorParameterSetter) {
        if (this.evaluatorParameter == null) {
            this.evaluatorParameter = new EvaluatorParameter();
            evaluatorParameterSetter.accept(this.evaluatorParameter);
        }

        return this;
    }

    /**
     * Get evaluatorParameter
     * @return evaluatorParameter
     */
    public EvaluatorParameter getEvaluatorParameter() {
        return evaluatorParameter;
    }

    public void setEvaluatorParameter(EvaluatorParameter evaluatorParameter) {
        this.evaluatorParameter = evaluatorParameter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvolveTaskCreateReq that = (EvolveTaskCreateReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.outputPath, that.outputPath) && Objects.equals(this.algorithmId, that.algorithmId)
            && Objects.equals(this.algorithmFile, that.algorithmFile)
            && Objects.equals(this.algorithmFuncName, that.algorithmFuncName)
            && Objects.equals(this.evaluatorFile, that.evaluatorFile)
            && Objects.equals(this.evaluatorFuncName, that.evaluatorFuncName)
            && Objects.equals(this.evaluatorBaseline, that.evaluatorBaseline)
            && Objects.equals(this.evaluatorBaselineFuncName, that.evaluatorBaselineFuncName)
            && Objects.equals(this.evaluatorParameter, that.evaluatorParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            outputPath,
            algorithmId,
            algorithmFile,
            algorithmFuncName,
            evaluatorFile,
            evaluatorFuncName,
            evaluatorBaseline,
            evaluatorBaselineFuncName,
            evaluatorParameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolveTaskCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
        sb.append("    algorithmId: ").append(toIndentedString(algorithmId)).append("\n");
        sb.append("    algorithmFile: ").append(toIndentedString(algorithmFile)).append("\n");
        sb.append("    algorithmFuncName: ").append(toIndentedString(algorithmFuncName)).append("\n");
        sb.append("    evaluatorFile: ").append(toIndentedString(evaluatorFile)).append("\n");
        sb.append("    evaluatorFuncName: ").append(toIndentedString(evaluatorFuncName)).append("\n");
        sb.append("    evaluatorBaseline: ").append(toIndentedString(evaluatorBaseline)).append("\n");
        sb.append("    evaluatorBaselineFuncName: ").append(toIndentedString(evaluatorBaselineFuncName)).append("\n");
        sb.append("    evaluatorParameter: ").append(toIndentedString(evaluatorParameter)).append("\n");
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
