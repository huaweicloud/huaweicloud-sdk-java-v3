package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpsFailureSession
 */
public class OpsFailureSession {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "explanation")

    private String explanation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_spans")

    private List<OpsFailureSpan> failureSpans = null;

    public OpsFailureSession withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释：** 故障的session ID。  **取值范围：** 长度1-64个字符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public OpsFailureSession withExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * **参数解释：** session故障的描述信息。  **取值范围：** 长度1-1024个字符。
     * @return explanation
     */
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public OpsFailureSession withFailureSpans(List<OpsFailureSpan> failureSpans) {
        this.failureSpans = failureSpans;
        return this;
    }

    public OpsFailureSession addFailureSpansItem(OpsFailureSpan failureSpansItem) {
        if (this.failureSpans == null) {
            this.failureSpans = new ArrayList<>();
        }
        this.failureSpans.add(failureSpansItem);
        return this;
    }

    public OpsFailureSession withFailureSpans(Consumer<List<OpsFailureSpan>> failureSpansSetter) {
        if (this.failureSpans == null) {
            this.failureSpans = new ArrayList<>();
        }
        failureSpansSetter.accept(this.failureSpans);
        return this;
    }

    /**
     * **参数解释：** 故障的span列表。  **取值范围：** 长度0-100的数组。
     * @return failureSpans
     */
    public List<OpsFailureSpan> getFailureSpans() {
        return failureSpans;
    }

    public void setFailureSpans(List<OpsFailureSpan> failureSpans) {
        this.failureSpans = failureSpans;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFailureSession that = (OpsFailureSession) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.explanation, that.explanation)
            && Objects.equals(this.failureSpans, that.failureSpans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, explanation, failureSpans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFailureSession {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
        sb.append("    failureSpans: ").append(toIndentedString(failureSpans)).append("\n");
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
