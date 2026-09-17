package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * **参数解释：** 单个评估器的评估结果对象。 **约束限制：** 不涉及。 
 */
public class OpsEvaluationItemEvaluation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_version")

    private String evaluatorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_name")

    private String evaluatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency_s")

    private Integer latencyS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_count")

    private Integer retryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "correction")

    private Object correction;

    public OpsEvaluationItemEvaluation withEvaluatorId(String evaluatorId) {
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

    public OpsEvaluationItemEvaluation withEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }

    /**
     * 评估器版本。
     * @return evaluatorVersion
     */
    public String getEvaluatorVersion() {
        return evaluatorVersion;
    }

    public void setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
    }

    public OpsEvaluationItemEvaluation withEvaluatorName(String evaluatorName) {
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

    public OpsEvaluationItemEvaluation withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 评估得分。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public OpsEvaluationItemEvaluation withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 评估理由。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public OpsEvaluationItemEvaluation withLatencyS(Integer latencyS) {
        this.latencyS = latencyS;
        return this;
    }

    /**
     * 评估耗时（秒）。
     * @return latencyS
     */
    public Integer getLatencyS() {
        return latencyS;
    }

    public void setLatencyS(Integer latencyS) {
        this.latencyS = latencyS;
    }

    public OpsEvaluationItemEvaluation withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 评估状态码。
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public OpsEvaluationItemEvaluation withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * 错误信息。
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public OpsEvaluationItemEvaluation withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * 重试次数。
     * @return retryCount
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public OpsEvaluationItemEvaluation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 评估时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OpsEvaluationItemEvaluation withCorrection(Object correction) {
        this.correction = correction;
        return this;
    }

    /**
     * 人工校正信息。
     * @return correction
     */
    public Object getCorrection() {
        return correction;
    }

    public void setCorrection(Object correction) {
        this.correction = correction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsEvaluationItemEvaluation that = (OpsEvaluationItemEvaluation) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId)
            && Objects.equals(this.evaluatorVersion, that.evaluatorVersion)
            && Objects.equals(this.evaluatorName, that.evaluatorName) && Objects.equals(this.score, that.score)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.latencyS, that.latencyS)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.error, that.error)
            && Objects.equals(this.retryCount, that.retryCount) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.correction, that.correction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId,
            evaluatorVersion,
            evaluatorName,
            score,
            reason,
            latencyS,
            statusCode,
            error,
            retryCount,
            createdAt,
            correction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsEvaluationItemEvaluation {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    evaluatorVersion: ").append(toIndentedString(evaluatorVersion)).append("\n");
        sb.append("    evaluatorName: ").append(toIndentedString(evaluatorName)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    latencyS: ").append(toIndentedString(latencyS)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    correction: ").append(toIndentedString(correction)).append("\n");
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
