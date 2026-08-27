package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EvaluatorParameter
 */
public class EvaluatorParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_models")

    private List<String> llmModels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_max_workers")

    private Integer evaluatorMaxWorkers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_max_workers")

    private Integer searchMaxWorkers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_iterations")

    private Integer searchIterations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smaller_better")

    private Boolean smallerBetter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_population_size")

    private Integer searchPopulationSize;

    public EvaluatorParameter withLlmModels(List<String> llmModels) {
        this.llmModels = llmModels;
        return this;
    }

    public EvaluatorParameter addLlmModelsItem(String llmModelsItem) {
        if (this.llmModels == null) {
            this.llmModels = new ArrayList<>();
        }
        this.llmModels.add(llmModelsItem);
        return this;
    }

    public EvaluatorParameter withLlmModels(Consumer<List<String>> llmModelsSetter) {
        if (this.llmModels == null) {
            this.llmModels = new ArrayList<>();
        }
        llmModelsSetter.accept(this.llmModels);
        return this;
    }

    /**
     * **参数解释**： 使用的llm模型列表。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,30]。 **默认取值**： 不涉及 
     * @return llmModels
     */
    public List<String> getLlmModels() {
        return llmModels;
    }

    public void setLlmModels(List<String> llmModels) {
        this.llmModels = llmModels;
    }

    public EvaluatorParameter withEvaluatorMaxWorkers(Integer evaluatorMaxWorkers) {
        this.evaluatorMaxWorkers = evaluatorMaxWorkers;
        return this;
    }

    /**
     * **参数解释**： 最大评估数量。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,32]。 **默认取值**： 不涉及 
     * minimum: 1
     * maximum: 32
     * @return evaluatorMaxWorkers
     */
    public Integer getEvaluatorMaxWorkers() {
        return evaluatorMaxWorkers;
    }

    public void setEvaluatorMaxWorkers(Integer evaluatorMaxWorkers) {
        this.evaluatorMaxWorkers = evaluatorMaxWorkers;
    }

    public EvaluatorParameter withSearchMaxWorkers(Integer searchMaxWorkers) {
        this.searchMaxWorkers = searchMaxWorkers;
        return this;
    }

    /**
     * **参数解释**： 最大生成数量。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,32]。 **默认取值**： 不涉及 
     * minimum: 1
     * maximum: 32
     * @return searchMaxWorkers
     */
    public Integer getSearchMaxWorkers() {
        return searchMaxWorkers;
    }

    public void setSearchMaxWorkers(Integer searchMaxWorkers) {
        this.searchMaxWorkers = searchMaxWorkers;
    }

    public EvaluatorParameter withSearchIterations(Integer searchIterations) {
        this.searchIterations = searchIterations;
        return this;
    }

    /**
     * **参数解释**： 最大演化轮次。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,100]。 **默认取值**： 不涉及 
     * minimum: 1
     * maximum: 100
     * @return searchIterations
     */
    public Integer getSearchIterations() {
        return searchIterations;
    }

    public void setSearchIterations(Integer searchIterations) {
        this.searchIterations = searchIterations;
    }

    public EvaluatorParameter withSmallerBetter(Boolean smallerBetter) {
        this.smallerBetter = smallerBetter;
        return this;
    }

    /**
     * **参数解释**： 评估器返回值是越大越好还是越小越好。 **约束限制**： 不涉及 **取值范围**： 取值范围true，false。 **默认取值**： true 
     * @return smallerBetter
     */
    public Boolean getSmallerBetter() {
        return smallerBetter;
    }

    public void setSmallerBetter(Boolean smallerBetter) {
        this.smallerBetter = smallerBetter;
    }

    public EvaluatorParameter withSearchPopulationSize(Integer searchPopulationSize) {
        this.searchPopulationSize = searchPopulationSize;
        return this;
    }

    /**
     * **参数解释**： 种群数量。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,32]。 **默认取值**： 不涉及 
     * minimum: 1
     * maximum: 32
     * @return searchPopulationSize
     */
    public Integer getSearchPopulationSize() {
        return searchPopulationSize;
    }

    public void setSearchPopulationSize(Integer searchPopulationSize) {
        this.searchPopulationSize = searchPopulationSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluatorParameter that = (EvaluatorParameter) obj;
        return Objects.equals(this.llmModels, that.llmModels)
            && Objects.equals(this.evaluatorMaxWorkers, that.evaluatorMaxWorkers)
            && Objects.equals(this.searchMaxWorkers, that.searchMaxWorkers)
            && Objects.equals(this.searchIterations, that.searchIterations)
            && Objects.equals(this.smallerBetter, that.smallerBetter)
            && Objects.equals(this.searchPopulationSize, that.searchPopulationSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llmModels,
            evaluatorMaxWorkers,
            searchMaxWorkers,
            searchIterations,
            smallerBetter,
            searchPopulationSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluatorParameter {\n");
        sb.append("    llmModels: ").append(toIndentedString(llmModels)).append("\n");
        sb.append("    evaluatorMaxWorkers: ").append(toIndentedString(evaluatorMaxWorkers)).append("\n");
        sb.append("    searchMaxWorkers: ").append(toIndentedString(searchMaxWorkers)).append("\n");
        sb.append("    searchIterations: ").append(toIndentedString(searchIterations)).append("\n");
        sb.append("    smallerBetter: ").append(toIndentedString(smallerBetter)).append("\n");
        sb.append("    searchPopulationSize: ").append(toIndentedString(searchPopulationSize)).append("\n");
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
