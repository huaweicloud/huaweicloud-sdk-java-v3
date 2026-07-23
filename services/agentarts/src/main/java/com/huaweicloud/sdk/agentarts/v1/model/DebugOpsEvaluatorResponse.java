package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DebugOpsEvaluatorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_token_usage")

    private Integer inputTokenUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_token_usage")

    private Integer outputTokenUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private Integer latency;

    public DebugOpsEvaluatorResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * **参数解释：** 调试执行的状态码。 **取值范围：** 遵循 HTTP 状态码或自定义业务状态码。 
     * minimum: 0
     * maximum: 2147483647
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public DebugOpsEvaluatorResponse withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * **参数解释：** 调试过程中产生的错误详细信息。 **取值范围：** 描述性错误字符串。 
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public DebugOpsEvaluatorResponse withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 评估器根据当前输入调试出的评分结果。 **取值范围：** 按评估逻辑定义的评分区间返回。 
     * minimum: 0
     * maximum: 2147483647
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public DebugOpsEvaluatorResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释：** 评估结果的详细理由或推导过程。 **取值范围：** 详细的描述性文本。 
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public DebugOpsEvaluatorResponse withInputTokenUsage(Integer inputTokenUsage) {
        this.inputTokenUsage = inputTokenUsage;
        return this;
    }

    /**
     * **参数解释：** 调试请求中输入内容消耗的Token数量。 **取值范围：** 0到2,147,483,647之间的整数。 
     * minimum: 0
     * maximum: 2147483647
     * @return inputTokenUsage
     */
    public Integer getInputTokenUsage() {
        return inputTokenUsage;
    }

    public void setInputTokenUsage(Integer inputTokenUsage) {
        this.inputTokenUsage = inputTokenUsage;
    }

    public DebugOpsEvaluatorResponse withOutputTokenUsage(Integer outputTokenUsage) {
        this.outputTokenUsage = outputTokenUsage;
        return this;
    }

    /**
     * **参数解释：** 调试请求中输出内容消耗的Token数量。 **取值范围：** 0到2,147,483,647之间的整数。 
     * minimum: 0
     * maximum: 2147483647
     * @return outputTokenUsage
     */
    public Integer getOutputTokenUsage() {
        return outputTokenUsage;
    }

    public void setOutputTokenUsage(Integer outputTokenUsage) {
        this.outputTokenUsage = outputTokenUsage;
    }

    public DebugOpsEvaluatorResponse withLatency(Integer latency) {
        this.latency = latency;
        return this;
    }

    /**
     * **参数解释：** 本次调试操作的耗时。 **取值范围：** 0 - 2,147,483,647 之间的整数。 
     * minimum: 0
     * maximum: 2147483647
     * @return latency
     */
    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugOpsEvaluatorResponse that = (DebugOpsEvaluatorResponse) obj;
        return Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.error, that.error)
            && Objects.equals(this.score, that.score) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.inputTokenUsage, that.inputTokenUsage)
            && Objects.equals(this.outputTokenUsage, that.outputTokenUsage)
            && Objects.equals(this.latency, that.latency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, error, score, reason, inputTokenUsage, outputTokenUsage, latency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugOpsEvaluatorResponse {\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    inputTokenUsage: ").append(toIndentedString(inputTokenUsage)).append("\n");
        sb.append("    outputTokenUsage: ").append(toIndentedString(outputTokenUsage)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
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
