package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单个任务的聚合指标统计，包含整体均值和分评估器统计。
 */
public class CompareTaskMetricsStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ave_score")

    private Float aveScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ave_latency_s")

    private Integer aveLatencyS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ave_input_token")

    private Integer aveInputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ave_output_token")

    private Integer aveOutputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ave_total_token")

    private Integer aveTotalToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_score")

    private Float maxScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_latency_s")

    private Integer maxLatencyS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_input_token")

    private Integer maxInputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_output_token")

    private Integer maxOutputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_total_token")

    private Integer maxTotalToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_score")

    private Float minScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_latency_s")

    private Integer minLatencyS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_input_token")

    private Integer minInputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_output_token")

    private Integer minOutputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_total_token")

    private Integer minTotalToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_score")

    private Float sumScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_latency_s")

    private Integer sumLatencyS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_input_token")

    private Integer sumInputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_output_token")

    private Integer sumOutputToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_total_token")

    private Integer sumTotalToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_stats")

    private CompareScoreStats scoreStats;

    public CompareTaskMetricsStat withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务的唯一标识符（UUID格式）。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CompareTaskMetricsStat withAveScore(Float aveScore) {
        this.aveScore = aveScore;
        return this;
    }

    /**
     * 所有评估器得分的平均值（跨评估器、跨样本）。
     * minimum: 0
     * maximum: 1E+2
     * @return aveScore
     */
    public Float getAveScore() {
        return aveScore;
    }

    public void setAveScore(Float aveScore) {
        this.aveScore = aveScore;
    }

    public CompareTaskMetricsStat withAveLatencyS(Integer aveLatencyS) {
        this.aveLatencyS = aveLatencyS;
        return this;
    }

    /**
     * 所有评估的平均延迟（秒）。
     * minimum: 0
     * maximum: 10000
     * @return aveLatencyS
     */
    public Integer getAveLatencyS() {
        return aveLatencyS;
    }

    public void setAveLatencyS(Integer aveLatencyS) {
        this.aveLatencyS = aveLatencyS;
    }

    public CompareTaskMetricsStat withAveInputToken(Integer aveInputToken) {
        this.aveInputToken = aveInputToken;
        return this;
    }

    /**
     * 所有评估的平均输入token数。
     * minimum: 0
     * maximum: 10000
     * @return aveInputToken
     */
    public Integer getAveInputToken() {
        return aveInputToken;
    }

    public void setAveInputToken(Integer aveInputToken) {
        this.aveInputToken = aveInputToken;
    }

    public CompareTaskMetricsStat withAveOutputToken(Integer aveOutputToken) {
        this.aveOutputToken = aveOutputToken;
        return this;
    }

    /**
     * 所有评估的平均输出token数。
     * minimum: 0
     * maximum: 10000
     * @return aveOutputToken
     */
    public Integer getAveOutputToken() {
        return aveOutputToken;
    }

    public void setAveOutputToken(Integer aveOutputToken) {
        this.aveOutputToken = aveOutputToken;
    }

    public CompareTaskMetricsStat withAveTotalToken(Integer aveTotalToken) {
        this.aveTotalToken = aveTotalToken;
        return this;
    }

    /**
     * 所有评估的平均总token数（输入+输出）。
     * minimum: 0
     * maximum: 10000
     * @return aveTotalToken
     */
    public Integer getAveTotalToken() {
        return aveTotalToken;
    }

    public void setAveTotalToken(Integer aveTotalToken) {
        this.aveTotalToken = aveTotalToken;
    }

    public CompareTaskMetricsStat withMaxScore(Float maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    /**
     * 所有评估的最大得分。
     * minimum: 0
     * maximum: 1E+2
     * @return maxScore
     */
    public Float getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Float maxScore) {
        this.maxScore = maxScore;
    }

    public CompareTaskMetricsStat withMaxLatencyS(Integer maxLatencyS) {
        this.maxLatencyS = maxLatencyS;
        return this;
    }

    /**
     * 所有评估的最大延迟（秒）。
     * minimum: 0
     * maximum: 10000
     * @return maxLatencyS
     */
    public Integer getMaxLatencyS() {
        return maxLatencyS;
    }

    public void setMaxLatencyS(Integer maxLatencyS) {
        this.maxLatencyS = maxLatencyS;
    }

    public CompareTaskMetricsStat withMaxInputToken(Integer maxInputToken) {
        this.maxInputToken = maxInputToken;
        return this;
    }

    /**
     * 所有评估的最大输入token数。
     * minimum: 0
     * maximum: 10000
     * @return maxInputToken
     */
    public Integer getMaxInputToken() {
        return maxInputToken;
    }

    public void setMaxInputToken(Integer maxInputToken) {
        this.maxInputToken = maxInputToken;
    }

    public CompareTaskMetricsStat withMaxOutputToken(Integer maxOutputToken) {
        this.maxOutputToken = maxOutputToken;
        return this;
    }

    /**
     * 所有评估的最大输出token数。
     * minimum: 0
     * maximum: 10000
     * @return maxOutputToken
     */
    public Integer getMaxOutputToken() {
        return maxOutputToken;
    }

    public void setMaxOutputToken(Integer maxOutputToken) {
        this.maxOutputToken = maxOutputToken;
    }

    public CompareTaskMetricsStat withMaxTotalToken(Integer maxTotalToken) {
        this.maxTotalToken = maxTotalToken;
        return this;
    }

    /**
     * 所有评估的最大总token数。
     * minimum: 0
     * maximum: 10000
     * @return maxTotalToken
     */
    public Integer getMaxTotalToken() {
        return maxTotalToken;
    }

    public void setMaxTotalToken(Integer maxTotalToken) {
        this.maxTotalToken = maxTotalToken;
    }

    public CompareTaskMetricsStat withMinScore(Float minScore) {
        this.minScore = minScore;
        return this;
    }

    /**
     * 所有评估的最小得分。
     * minimum: 0
     * maximum: 1E+2
     * @return minScore
     */
    public Float getMinScore() {
        return minScore;
    }

    public void setMinScore(Float minScore) {
        this.minScore = minScore;
    }

    public CompareTaskMetricsStat withMinLatencyS(Integer minLatencyS) {
        this.minLatencyS = minLatencyS;
        return this;
    }

    /**
     * 所有评估的最小延迟（秒）。
     * minimum: 0
     * maximum: 10000
     * @return minLatencyS
     */
    public Integer getMinLatencyS() {
        return minLatencyS;
    }

    public void setMinLatencyS(Integer minLatencyS) {
        this.minLatencyS = minLatencyS;
    }

    public CompareTaskMetricsStat withMinInputToken(Integer minInputToken) {
        this.minInputToken = minInputToken;
        return this;
    }

    /**
     * 所有评估的最小输入token数。
     * minimum: 0
     * maximum: 10000
     * @return minInputToken
     */
    public Integer getMinInputToken() {
        return minInputToken;
    }

    public void setMinInputToken(Integer minInputToken) {
        this.minInputToken = minInputToken;
    }

    public CompareTaskMetricsStat withMinOutputToken(Integer minOutputToken) {
        this.minOutputToken = minOutputToken;
        return this;
    }

    /**
     * 所有评估的最小输出token数。
     * minimum: 0
     * maximum: 10000
     * @return minOutputToken
     */
    public Integer getMinOutputToken() {
        return minOutputToken;
    }

    public void setMinOutputToken(Integer minOutputToken) {
        this.minOutputToken = minOutputToken;
    }

    public CompareTaskMetricsStat withMinTotalToken(Integer minTotalToken) {
        this.minTotalToken = minTotalToken;
        return this;
    }

    /**
     * 所有评估的最小总token数。
     * minimum: 0
     * maximum: 10000
     * @return minTotalToken
     */
    public Integer getMinTotalToken() {
        return minTotalToken;
    }

    public void setMinTotalToken(Integer minTotalToken) {
        this.minTotalToken = minTotalToken;
    }

    public CompareTaskMetricsStat withSumScore(Float sumScore) {
        this.sumScore = sumScore;
        return this;
    }

    /**
     * 所有评估的得分总和。
     * minimum: 0
     * maximum: 1E+4
     * @return sumScore
     */
    public Float getSumScore() {
        return sumScore;
    }

    public void setSumScore(Float sumScore) {
        this.sumScore = sumScore;
    }

    public CompareTaskMetricsStat withSumLatencyS(Integer sumLatencyS) {
        this.sumLatencyS = sumLatencyS;
        return this;
    }

    /**
     * 所有评估的延迟总和（秒）。
     * minimum: 0
     * maximum: 10000
     * @return sumLatencyS
     */
    public Integer getSumLatencyS() {
        return sumLatencyS;
    }

    public void setSumLatencyS(Integer sumLatencyS) {
        this.sumLatencyS = sumLatencyS;
    }

    public CompareTaskMetricsStat withSumInputToken(Integer sumInputToken) {
        this.sumInputToken = sumInputToken;
        return this;
    }

    /**
     * 所有评估的输入token总和。
     * minimum: 0
     * maximum: 10000
     * @return sumInputToken
     */
    public Integer getSumInputToken() {
        return sumInputToken;
    }

    public void setSumInputToken(Integer sumInputToken) {
        this.sumInputToken = sumInputToken;
    }

    public CompareTaskMetricsStat withSumOutputToken(Integer sumOutputToken) {
        this.sumOutputToken = sumOutputToken;
        return this;
    }

    /**
     * 所有评估的输出token总和。
     * minimum: 0
     * maximum: 10000
     * @return sumOutputToken
     */
    public Integer getSumOutputToken() {
        return sumOutputToken;
    }

    public void setSumOutputToken(Integer sumOutputToken) {
        this.sumOutputToken = sumOutputToken;
    }

    public CompareTaskMetricsStat withSumTotalToken(Integer sumTotalToken) {
        this.sumTotalToken = sumTotalToken;
        return this;
    }

    /**
     * 所有评估的总token总和。
     * minimum: 0
     * maximum: 10000
     * @return sumTotalToken
     */
    public Integer getSumTotalToken() {
        return sumTotalToken;
    }

    public void setSumTotalToken(Integer sumTotalToken) {
        this.sumTotalToken = sumTotalToken;
    }

    public CompareTaskMetricsStat withScoreStats(CompareScoreStats scoreStats) {
        this.scoreStats = scoreStats;
        return this;
    }

    public CompareTaskMetricsStat withScoreStats(Consumer<CompareScoreStats> scoreStatsSetter) {
        if (this.scoreStats == null) {
            this.scoreStats = new CompareScoreStats();
            scoreStatsSetter.accept(this.scoreStats);
        }

        return this;
    }

    /**
     * Get scoreStats
     * @return scoreStats
     */
    public CompareScoreStats getScoreStats() {
        return scoreStats;
    }

    public void setScoreStats(CompareScoreStats scoreStats) {
        this.scoreStats = scoreStats;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareTaskMetricsStat that = (CompareTaskMetricsStat) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.aveScore, that.aveScore)
            && Objects.equals(this.aveLatencyS, that.aveLatencyS)
            && Objects.equals(this.aveInputToken, that.aveInputToken)
            && Objects.equals(this.aveOutputToken, that.aveOutputToken)
            && Objects.equals(this.aveTotalToken, that.aveTotalToken) && Objects.equals(this.maxScore, that.maxScore)
            && Objects.equals(this.maxLatencyS, that.maxLatencyS)
            && Objects.equals(this.maxInputToken, that.maxInputToken)
            && Objects.equals(this.maxOutputToken, that.maxOutputToken)
            && Objects.equals(this.maxTotalToken, that.maxTotalToken) && Objects.equals(this.minScore, that.minScore)
            && Objects.equals(this.minLatencyS, that.minLatencyS)
            && Objects.equals(this.minInputToken, that.minInputToken)
            && Objects.equals(this.minOutputToken, that.minOutputToken)
            && Objects.equals(this.minTotalToken, that.minTotalToken) && Objects.equals(this.sumScore, that.sumScore)
            && Objects.equals(this.sumLatencyS, that.sumLatencyS)
            && Objects.equals(this.sumInputToken, that.sumInputToken)
            && Objects.equals(this.sumOutputToken, that.sumOutputToken)
            && Objects.equals(this.sumTotalToken, that.sumTotalToken)
            && Objects.equals(this.scoreStats, that.scoreStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            aveScore,
            aveLatencyS,
            aveInputToken,
            aveOutputToken,
            aveTotalToken,
            maxScore,
            maxLatencyS,
            maxInputToken,
            maxOutputToken,
            maxTotalToken,
            minScore,
            minLatencyS,
            minInputToken,
            minOutputToken,
            minTotalToken,
            sumScore,
            sumLatencyS,
            sumInputToken,
            sumOutputToken,
            sumTotalToken,
            scoreStats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareTaskMetricsStat {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    aveScore: ").append(toIndentedString(aveScore)).append("\n");
        sb.append("    aveLatencyS: ").append(toIndentedString(aveLatencyS)).append("\n");
        sb.append("    aveInputToken: ").append(toIndentedString(aveInputToken)).append("\n");
        sb.append("    aveOutputToken: ").append(toIndentedString(aveOutputToken)).append("\n");
        sb.append("    aveTotalToken: ").append(toIndentedString(aveTotalToken)).append("\n");
        sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
        sb.append("    maxLatencyS: ").append(toIndentedString(maxLatencyS)).append("\n");
        sb.append("    maxInputToken: ").append(toIndentedString(maxInputToken)).append("\n");
        sb.append("    maxOutputToken: ").append(toIndentedString(maxOutputToken)).append("\n");
        sb.append("    maxTotalToken: ").append(toIndentedString(maxTotalToken)).append("\n");
        sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
        sb.append("    minLatencyS: ").append(toIndentedString(minLatencyS)).append("\n");
        sb.append("    minInputToken: ").append(toIndentedString(minInputToken)).append("\n");
        sb.append("    minOutputToken: ").append(toIndentedString(minOutputToken)).append("\n");
        sb.append("    minTotalToken: ").append(toIndentedString(minTotalToken)).append("\n");
        sb.append("    sumScore: ").append(toIndentedString(sumScore)).append("\n");
        sb.append("    sumLatencyS: ").append(toIndentedString(sumLatencyS)).append("\n");
        sb.append("    sumInputToken: ").append(toIndentedString(sumInputToken)).append("\n");
        sb.append("    sumOutputToken: ").append(toIndentedString(sumOutputToken)).append("\n");
        sb.append("    sumTotalToken: ").append(toIndentedString(sumTotalToken)).append("\n");
        sb.append("    scoreStats: ").append(toIndentedString(scoreStats)).append("\n");
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
