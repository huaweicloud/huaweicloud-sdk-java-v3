package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TagOpsTraceLabelRequestBody
 */
public class TagOpsTraceLabelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_type")

    private String traceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_id")

    private String spanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private Map<String, String> label = null;

    public TagOpsTraceLabelRequestBody withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话id
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public TagOpsTraceLabelRequestBody withTraceType(String traceType) {
        this.traceType = traceType;
        return this;
    }

    /**
     * trace类型
     * @return traceType
     */
    public String getTraceType() {
        return traceType;
    }

    public void setTraceType(String traceType) {
        this.traceType = traceType;
    }

    public TagOpsTraceLabelRequestBody withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * span的id
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public TagOpsTraceLabelRequestBody withLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public TagOpsTraceLabelRequestBody putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    public TagOpsTraceLabelRequestBody withLabel(Consumer<Map<String, String>> labelSetter) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        labelSetter.accept(this.label);
        return this;
    }

    /**
     * 标注的过滤条件
     * @return label
     */
    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagOpsTraceLabelRequestBody that = (TagOpsTraceLabelRequestBody) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.traceType, that.traceType)
            && Objects.equals(this.spanId, that.spanId) && Objects.equals(this.label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, traceType, spanId, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagOpsTraceLabelRequestBody {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    traceType: ").append(toIndentedString(traceType)).append("\n");
        sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
