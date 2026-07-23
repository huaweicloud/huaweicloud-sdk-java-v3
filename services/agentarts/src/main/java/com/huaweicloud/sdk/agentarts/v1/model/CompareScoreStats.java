package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 按评估器维度的统计信息容器。
 */
public class CompareScoreStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluators")

    private List<CompareEvaluatorStat> evaluators = null;

    public CompareScoreStats withEvaluators(List<CompareEvaluatorStat> evaluators) {
        this.evaluators = evaluators;
        return this;
    }

    public CompareScoreStats addEvaluatorsItem(CompareEvaluatorStat evaluatorsItem) {
        if (this.evaluators == null) {
            this.evaluators = new ArrayList<>();
        }
        this.evaluators.add(evaluatorsItem);
        return this;
    }

    public CompareScoreStats withEvaluators(Consumer<List<CompareEvaluatorStat>> evaluatorsSetter) {
        if (this.evaluators == null) {
            this.evaluators = new ArrayList<>();
        }
        evaluatorsSetter.accept(this.evaluators);
        return this;
    }

    /**
     * 各个评估器的详细统计列表。
     * @return evaluators
     */
    public List<CompareEvaluatorStat> getEvaluators() {
        return evaluators;
    }

    public void setEvaluators(List<CompareEvaluatorStat> evaluators) {
        this.evaluators = evaluators;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareScoreStats that = (CompareScoreStats) obj;
        return Objects.equals(this.evaluators, that.evaluators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareScoreStats {\n");
        sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
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
