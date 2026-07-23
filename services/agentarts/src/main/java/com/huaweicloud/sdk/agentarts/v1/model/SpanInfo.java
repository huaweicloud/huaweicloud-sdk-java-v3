package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * span信息
 */
public class SpanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_span_id")

    private String parentSpanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_id")

    private String spanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_type")

    private String spanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_name")

    private String spanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_message")

    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tokens")

    private Integer tokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_tokens")

    private Integer inputTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_tokens")

    private Integer outputTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_type")

    private String callType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private String metadata;

    /**
     * 点赞点睬, cancel为未点赞，like为点赞，unlike为点睬
     */
    public static final class FeedbackOperationEnum {

        /**
         * Enum LIKE for value: "like"
         */
        public static final FeedbackOperationEnum LIKE = new FeedbackOperationEnum("like");

        /**
         * Enum UNLIKE for value: "unlike"
         */
        public static final FeedbackOperationEnum UNLIKE = new FeedbackOperationEnum("unlike");

        /**
         * Enum CANCEL for value: "cancel"
         */
        public static final FeedbackOperationEnum CANCEL = new FeedbackOperationEnum("cancel");

        private static final Map<String, FeedbackOperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeedbackOperationEnum> createStaticFields() {
            Map<String, FeedbackOperationEnum> map = new HashMap<>();
            map.put("like", LIKE);
            map.put("unlike", UNLIKE);
            map.put("cancel", CANCEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FeedbackOperationEnum(String value) {
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
        public static FeedbackOperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeedbackOperationEnum(value));
        }

        public static FeedbackOperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FeedbackOperationEnum) {
                return this.value.equals(((FeedbackOperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_operation")

    private FeedbackOperationEnum feedbackOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private List<Label> label = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_error")

    private Boolean isError;

    public SpanInfo withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * trace id
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public SpanInfo withParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
        return this;
    }

    /**
     * 父span id
     * @return parentSpanId
     */
    public String getParentSpanId() {
        return parentSpanId;
    }

    public void setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
    }

    public SpanInfo withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * spn id
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public SpanInfo withSpanType(String spanType) {
        this.spanType = spanType;
        return this;
    }

    /**
     * span 类型
     * @return spanType
     */
    public String getSpanType() {
        return spanType;
    }

    public void setSpanType(String spanType) {
        this.spanType = spanType;
    }

    public SpanInfo withSpanName(String spanName) {
        this.spanName = spanName;
        return this;
    }

    /**
     * span名称
     * @return spanName
     */
    public String getSpanName() {
        return spanName;
    }

    public void setSpanName(String spanName) {
        this.spanName = spanName;
    }

    public SpanInfo withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态码
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public SpanInfo withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * 状态信息
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public SpanInfo withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * 输入
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public SpanInfo withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * 输出
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public SpanInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 时延
     * minimum: 0
     * maximum: 4110338427000
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public SpanInfo withSessionId(String sessionId) {
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

    public SpanInfo withTokens(Integer tokens) {
        this.tokens = tokens;
        return this;
    }

    /**
     * tokens消耗
     * minimum: 0
     * maximum: 4110338427000
     * @return tokens
     */
    public Integer getTokens() {
        return tokens;
    }

    public void setTokens(Integer tokens) {
        this.tokens = tokens;
    }

    public SpanInfo withInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    /**
     * 输入tokens
     * minimum: 0
     * maximum: 4110338427000
     * @return inputTokens
     */
    public Integer getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
    }

    public SpanInfo withOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    /**
     * 输出tokens
     * minimum: 0
     * maximum: 4110338427000
     * @return outputTokens
     */
    public Integer getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
    }

    public SpanInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * minimum: 0
     * maximum: 4110338427000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SpanInfo withCallType(String callType) {
        this.callType = callType;
        return this;
    }

    /**
     * 触发类型
     * @return callType
     */
    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public SpanInfo withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 元数据
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public SpanInfo withFeedbackOperation(FeedbackOperationEnum feedbackOperation) {
        this.feedbackOperation = feedbackOperation;
        return this;
    }

    /**
     * 点赞点睬, cancel为未点赞，like为点赞，unlike为点睬
     * @return feedbackOperation
     */
    public FeedbackOperationEnum getFeedbackOperation() {
        return feedbackOperation;
    }

    public void setFeedbackOperation(FeedbackOperationEnum feedbackOperation) {
        this.feedbackOperation = feedbackOperation;
    }

    public SpanInfo withLabel(List<Label> label) {
        this.label = label;
        return this;
    }

    public SpanInfo addLabelItem(Label labelItem) {
        if (this.label == null) {
            this.label = new ArrayList<>();
        }
        this.label.add(labelItem);
        return this;
    }

    public SpanInfo withLabel(Consumer<List<Label>> labelSetter) {
        if (this.label == null) {
            this.label = new ArrayList<>();
        }
        labelSetter.accept(this.label);
        return this;
    }

    /**
     * label标签组
     * @return label
     */
    public List<Label> getLabel() {
        return label;
    }

    public void setLabel(List<Label> label) {
        this.label = label;
    }

    public SpanInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 应用id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SpanInfo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 应用名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public SpanInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 应用类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public SpanInfo withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * 模型名称
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public SpanInfo withIsError(Boolean isError) {
        this.isError = isError;
        return this;
    }

    /**
     * 是否失败
     * @return isError
     */
    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpanInfo that = (SpanInfo) obj;
        return Objects.equals(this.traceId, that.traceId) && Objects.equals(this.parentSpanId, that.parentSpanId)
            && Objects.equals(this.spanId, that.spanId) && Objects.equals(this.spanType, that.spanType)
            && Objects.equals(this.spanName, that.spanName) && Objects.equals(this.statusCode, that.statusCode)
            && Objects.equals(this.statusMessage, that.statusMessage) && Objects.equals(this.input, that.input)
            && Objects.equals(this.output, that.output) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.tokens, that.tokens)
            && Objects.equals(this.inputTokens, that.inputTokens)
            && Objects.equals(this.outputTokens, that.outputTokens) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.callType, that.callType) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.feedbackOperation, that.feedbackOperation) && Objects.equals(this.label, that.label)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.isError, that.isError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId,
            parentSpanId,
            spanId,
            spanType,
            spanName,
            statusCode,
            statusMessage,
            input,
            output,
            duration,
            sessionId,
            tokens,
            inputTokens,
            outputTokens,
            startTime,
            callType,
            metadata,
            feedbackOperation,
            label,
            resourceId,
            resourceName,
            resourceType,
            modelName,
            isError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpanInfo {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    parentSpanId: ").append(toIndentedString(parentSpanId)).append("\n");
        sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
        sb.append("    spanType: ").append(toIndentedString(spanType)).append("\n");
        sb.append("    spanName: ").append(toIndentedString(spanName)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
        sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
        sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    feedbackOperation: ").append(toIndentedString(feedbackOperation)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    isError: ").append(toIndentedString(isError)).append("\n");
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
