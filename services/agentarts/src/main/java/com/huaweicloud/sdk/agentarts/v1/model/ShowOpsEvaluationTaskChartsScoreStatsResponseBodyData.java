package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器得分统计对象。 **约束限制：** 不涉及。 
 */
public class ShowOpsEvaluationTaskChartsScoreStatsResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluators")

    private List<OpsChartsEvaluatorScoreItem> evaluators = null;

    public ShowOpsEvaluationTaskChartsScoreStatsResponseBodyData withEvaluators(
        List<OpsChartsEvaluatorScoreItem> evaluators) {
        this.evaluators = evaluators;
        return this;
    }

    public ShowOpsEvaluationTaskChartsScoreStatsResponseBodyData addEvaluatorsItem(
        OpsChartsEvaluatorScoreItem evaluatorsItem) {
        if (this.evaluators == null) {
            this.evaluators = new ArrayList<>();
        }
        this.evaluators.add(evaluatorsItem);
        return this;
    }

    public ShowOpsEvaluationTaskChartsScoreStatsResponseBodyData withEvaluators(
        Consumer<List<OpsChartsEvaluatorScoreItem>> evaluatorsSetter) {
        if (this.evaluators == null) {
            this.evaluators = new ArrayList<>();
        }
        evaluatorsSetter.accept(this.evaluators);
        return this;
    }

    /**
     * 评估器得分统计列表。
     * @return evaluators
     */
    public List<OpsChartsEvaluatorScoreItem> getEvaluators() {
        return evaluators;
    }

    public void setEvaluators(List<OpsChartsEvaluatorScoreItem> evaluators) {
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
        ShowOpsEvaluationTaskChartsScoreStatsResponseBodyData that =
            (ShowOpsEvaluationTaskChartsScoreStatsResponseBodyData) obj;
        return Objects.equals(this.evaluators, that.evaluators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTaskChartsScoreStatsResponseBodyData {\n");
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
