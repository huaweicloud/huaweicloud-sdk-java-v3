package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 单个评估器的执行结果，包含评分、状态、耗时及token用量等指标。
 */
public class CompareEvaluation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_version")

    private String evaluatorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency_s")

    private Integer latencyS;

    /**
     * 评估执行状态：SUCCESS表示成功，FAILED表示失败（如超时、网络错误等）。
     */
    public static final class StatusCodeEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusCodeEnum SUCCESS = new StatusCodeEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusCodeEnum FAILED = new StatusCodeEnum("FAILED");

        private static final Map<String, StatusCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusCodeEnum> createStaticFields() {
            Map<String, StatusCodeEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusCodeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusCodeEnum(value));
        }

        public static StatusCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusCodeEnum) {
                return this.value.equals(((StatusCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private StatusCodeEnum statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_token_usage")

    private Integer inputTokenUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_token_usage")

    private Integer outputTokenUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "correction")

    private Object correction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_count")

    private Integer retryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_name")

    private String evaluatorName;

    public CompareEvaluation withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * 评估器的唯一标识符，如TaskCompletion、TurnRelevancy等。
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public CompareEvaluation withEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }

    /**
     * 评估器的版本号，如“1.0.0”。
     * @return evaluatorVersion
     */
    public String getEvaluatorVersion() {
        return evaluatorVersion;
    }

    public void setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
    }

    public CompareEvaluation withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * 评估得分，通常在0到1之间；若评估失败，该值可能为0。
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public CompareEvaluation withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 评估得分的详细理由文本，失败时可为空字符串。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public CompareEvaluation withLatencyS(Integer latencyS) {
        this.latencyS = latencyS;
        return this;
    }

    /**
     * 评估器执行的耗时，单位为秒。
     * minimum: 0
     * maximum: 10000
     * @return latencyS
     */
    public Integer getLatencyS() {
        return latencyS;
    }

    public void setLatencyS(Integer latencyS) {
        this.latencyS = latencyS;
    }

    public CompareEvaluation withStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 评估执行状态：SUCCESS表示成功，FAILED表示失败（如超时、网络错误等）。
     * @return statusCode
     */
    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    public CompareEvaluation withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * 失败时的详细错误信息；成功时为空字符串。
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public CompareEvaluation withInputTokenUsage(Integer inputTokenUsage) {
        this.inputTokenUsage = inputTokenUsage;
        return this;
    }

    /**
     * 评估器处理输入时消耗的 token 数量。
     * minimum: 0
     * maximum: 10000
     * @return inputTokenUsage
     */
    public Integer getInputTokenUsage() {
        return inputTokenUsage;
    }

    public void setInputTokenUsage(Integer inputTokenUsage) {
        this.inputTokenUsage = inputTokenUsage;
    }

    public CompareEvaluation withOutputTokenUsage(Integer outputTokenUsage) {
        this.outputTokenUsage = outputTokenUsage;
        return this;
    }

    /**
     * 评估器生成输出时消耗的 token 数量。
     * minimum: 0
     * maximum: 10000
     * @return outputTokenUsage
     */
    public Integer getOutputTokenUsage() {
        return outputTokenUsage;
    }

    public void setOutputTokenUsage(Integer outputTokenUsage) {
        this.outputTokenUsage = outputTokenUsage;
    }

    public CompareEvaluation withCorrection(Object correction) {
        this.correction = correction;
        return this;
    }

    /**
     * 纠正信息字段，通常为null；预留用于自动纠错或人工校正结果。
     * @return correction
     */
    public Object getCorrection() {
        return correction;
    }

    public void setCorrection(Object correction) {
        this.correction = correction;
    }

    public CompareEvaluation withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * 评估器失败后重试的次数。
     * minimum: 0
     * maximum: 10000
     * @return retryCount
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public CompareEvaluation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 评估记录创建时间，ISO 8601格式（UTC）。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CompareEvaluation withEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
        return this;
    }

    /**
     * 评估器的人类可读名称，如“任务完成度”、“相关性”。
     * @return evaluatorName
     */
    public String getEvaluatorName() {
        return evaluatorName;
    }

    public void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareEvaluation that = (CompareEvaluation) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId)
            && Objects.equals(this.evaluatorVersion, that.evaluatorVersion) && Objects.equals(this.score, that.score)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.latencyS, that.latencyS)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.error, that.error)
            && Objects.equals(this.inputTokenUsage, that.inputTokenUsage)
            && Objects.equals(this.outputTokenUsage, that.outputTokenUsage)
            && Objects.equals(this.correction, that.correction) && Objects.equals(this.retryCount, that.retryCount)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.evaluatorName, that.evaluatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId,
            evaluatorVersion,
            score,
            reason,
            latencyS,
            statusCode,
            error,
            inputTokenUsage,
            outputTokenUsage,
            correction,
            retryCount,
            createdAt,
            evaluatorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareEvaluation {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    evaluatorVersion: ").append(toIndentedString(evaluatorVersion)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    latencyS: ").append(toIndentedString(latencyS)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    inputTokenUsage: ").append(toIndentedString(inputTokenUsage)).append("\n");
        sb.append("    outputTokenUsage: ").append(toIndentedString(outputTokenUsage)).append("\n");
        sb.append("    correction: ").append(toIndentedString(correction)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    evaluatorName: ").append(toIndentedString(evaluatorName)).append("\n");
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
