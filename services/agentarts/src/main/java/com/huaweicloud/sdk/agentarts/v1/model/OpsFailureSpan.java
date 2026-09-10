package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsFailureSpan
 */
public class OpsFailureSpan {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_id")

    private String spanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_sub_category_name")

    private String errorSubCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evidence")

    private String evidence;

    public OpsFailureSpan withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * **参数解释：** 故障的trace ID。  **取值范围：** 长度1-64个字符。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public OpsFailureSpan withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * **参数解释：** 故障的span ID。  **取值范围：** 长度1-64个字符。
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public OpsFailureSpan withErrorSubCategoryName(String errorSubCategoryName) {
        this.errorSubCategoryName = errorSubCategoryName;
        return this;
    }

    /**
     * **参数解释：** 故障类型。  **取值范围：** 长度1-128个字符。
     * @return errorSubCategoryName
     */
    public String getErrorSubCategoryName() {
        return errorSubCategoryName;
    }

    public void setErrorSubCategoryName(String errorSubCategoryName) {
        this.errorSubCategoryName = errorSubCategoryName;
    }

    public OpsFailureSpan withEvidence(String evidence) {
        this.evidence = evidence;
        return this;
    }

    /**
     * **参数解释：** 故障检测的证据。  **取值范围：** 不涉及。
     * @return evidence
     */
    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFailureSpan that = (OpsFailureSpan) obj;
        return Objects.equals(this.traceId, that.traceId) && Objects.equals(this.spanId, that.spanId)
            && Objects.equals(this.errorSubCategoryName, that.errorSubCategoryName)
            && Objects.equals(this.evidence, that.evidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, spanId, errorSubCategoryName, evidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFailureSpan {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
        sb.append("    errorSubCategoryName: ").append(toIndentedString(errorSubCategoryName)).append("\n");
        sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
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
