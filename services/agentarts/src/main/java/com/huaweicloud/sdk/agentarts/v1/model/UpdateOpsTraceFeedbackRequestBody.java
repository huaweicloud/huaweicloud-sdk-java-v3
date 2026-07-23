package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateOpsTraceFeedbackRequestBody
 */
public class UpdateOpsTraceFeedbackRequestBody {

    /**
     * like点赞或unlike点踩或cancel取消点赞点踩
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
    @JsonProperty(value = "span_id")

    private String spanId;

    public UpdateOpsTraceFeedbackRequestBody withFeedbackOperation(FeedbackOperationEnum feedbackOperation) {
        this.feedbackOperation = feedbackOperation;
        return this;
    }

    /**
     * like点赞或unlike点踩或cancel取消点赞点踩
     * @return feedbackOperation
     */
    public FeedbackOperationEnum getFeedbackOperation() {
        return feedbackOperation;
    }

    public void setFeedbackOperation(FeedbackOperationEnum feedbackOperation) {
        this.feedbackOperation = feedbackOperation;
    }

    public UpdateOpsTraceFeedbackRequestBody withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * span ID
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOpsTraceFeedbackRequestBody that = (UpdateOpsTraceFeedbackRequestBody) obj;
        return Objects.equals(this.feedbackOperation, that.feedbackOperation)
            && Objects.equals(this.spanId, that.spanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackOperation, spanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsTraceFeedbackRequestBody {\n");
        sb.append("    feedbackOperation: ").append(toIndentedString(feedbackOperation)).append("\n");
        sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
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
