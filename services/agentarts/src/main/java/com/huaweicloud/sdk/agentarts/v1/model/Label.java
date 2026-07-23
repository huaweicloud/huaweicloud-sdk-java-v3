package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Label
 */
public class Label {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_id")

    private String spanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_name")

    private String labelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "string_value")

    private String stringValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "float_value")

    private String floatValue;

    public Label withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * 调用链id
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Label withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * span id
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public Label withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 起始时间
     * minimum: 0
     * maximum: 4110338427000
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Label withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 4110338427000
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Label withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * 标签名称
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Label withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * 标签值
     * @return stringValue
     */
    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Label withFloatValue(String floatValue) {
        this.floatValue = floatValue;
        return this;
    }

    /**
     * 标签值
     * @return floatValue
     */
    public String getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(String floatValue) {
        this.floatValue = floatValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Label that = (Label) obj;
        return Objects.equals(this.traceId, that.traceId) && Objects.equals(this.spanId, that.spanId)
            && Objects.equals(this.start, that.start) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.labelName, that.labelName) && Objects.equals(this.stringValue, that.stringValue)
            && Objects.equals(this.floatValue, that.floatValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, spanId, start, lastUpdateTime, labelName, stringValue, floatValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Label {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
        sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
        sb.append("    floatValue: ").append(toIndentedString(floatValue)).append("\n");
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
