package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Aura Job V2 算子监控响应结构。
 */
public class AuraStatementOperatorMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_metrics")

    private List<OperatorMetric> operatorMetrics = null;

    public AuraStatementOperatorMetrics withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：会话id。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public AuraStatementOperatorMetrics withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：语句id。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public AuraStatementOperatorMetrics withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：端点id。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public AuraStatementOperatorMetrics withOperatorMetrics(List<OperatorMetric> operatorMetrics) {
        this.operatorMetrics = operatorMetrics;
        return this;
    }

    public AuraStatementOperatorMetrics addOperatorMetricsItem(OperatorMetric operatorMetricsItem) {
        if (this.operatorMetrics == null) {
            this.operatorMetrics = new ArrayList<>();
        }
        this.operatorMetrics.add(operatorMetricsItem);
        return this;
    }

    public AuraStatementOperatorMetrics withOperatorMetrics(Consumer<List<OperatorMetric>> operatorMetricsSetter) {
        if (this.operatorMetrics == null) {
            this.operatorMetrics = new ArrayList<>();
        }
        operatorMetricsSetter.accept(this.operatorMetrics);
        return this;
    }

    /**
     * **参数解释**：算子监控信息。 **取值范围**：不涉及。
     * @return operatorMetrics
     */
    public List<OperatorMetric> getOperatorMetrics() {
        return operatorMetrics;
    }

    public void setOperatorMetrics(List<OperatorMetric> operatorMetrics) {
        this.operatorMetrics = operatorMetrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuraStatementOperatorMetrics that = (AuraStatementOperatorMetrics) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.statementId, that.statementId)
            && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.operatorMetrics, that.operatorMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, statementId, endpointId, operatorMetrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuraStatementOperatorMetrics {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    operatorMetrics: ").append(toIndentedString(operatorMetrics)).append("\n");
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
