package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 单个评估器的得分统计对象。 **约束限制：** 不涉及。 
 */
public class OpsChartsEvaluatorScoreItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_name")

    private String evaluatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_score")

    private Double sumScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_score")

    private Double minScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_score")

    private Double maxScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_score")

    private Double avgScore;

    public OpsChartsEvaluatorScoreItem withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * 评估器ID。
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public OpsChartsEvaluatorScoreItem withEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
        return this;
    }

    /**
     * 评估器名称。
     * @return evaluatorName
     */
    public String getEvaluatorName() {
        return evaluatorName;
    }

    public void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
    }

    public OpsChartsEvaluatorScoreItem withSumScore(Double sumScore) {
        this.sumScore = sumScore;
        return this;
    }

    /**
     * 总分。
     * @return sumScore
     */
    public Double getSumScore() {
        return sumScore;
    }

    public void setSumScore(Double sumScore) {
        this.sumScore = sumScore;
    }

    public OpsChartsEvaluatorScoreItem withMinScore(Double minScore) {
        this.minScore = minScore;
        return this;
    }

    /**
     * 最低分。
     * @return minScore
     */
    public Double getMinScore() {
        return minScore;
    }

    public void setMinScore(Double minScore) {
        this.minScore = minScore;
    }

    public OpsChartsEvaluatorScoreItem withMaxScore(Double maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    /**
     * 最高分。
     * @return maxScore
     */
    public Double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }

    public OpsChartsEvaluatorScoreItem withAvgScore(Double avgScore) {
        this.avgScore = avgScore;
        return this;
    }

    /**
     * 平均分。
     * @return avgScore
     */
    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsChartsEvaluatorScoreItem that = (OpsChartsEvaluatorScoreItem) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId)
            && Objects.equals(this.evaluatorName, that.evaluatorName) && Objects.equals(this.sumScore, that.sumScore)
            && Objects.equals(this.minScore, that.minScore) && Objects.equals(this.maxScore, that.maxScore)
            && Objects.equals(this.avgScore, that.avgScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId, evaluatorName, sumScore, minScore, maxScore, avgScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsChartsEvaluatorScoreItem {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    evaluatorName: ").append(toIndentedString(evaluatorName)).append("\n");
        sb.append("    sumScore: ").append(toIndentedString(sumScore)).append("\n");
        sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
        sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
        sb.append("    avgScore: ").append(toIndentedString(avgScore)).append("\n");
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
