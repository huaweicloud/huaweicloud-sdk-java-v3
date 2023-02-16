package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * QaFeedbackReq
 */
public class QaFeedbackReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_id")

    private String feedbackId;

    /**
     * - IROBOT_QA:  - RECOMMEND_WORD_QA:  
     */
    public static final class QaPairSourceEnum {

        /**
         * Enum IROBOT_QA for value: "IROBOT_QA"
         */
        public static final QaPairSourceEnum IROBOT_QA = new QaPairSourceEnum("IROBOT_QA");

        /**
         * Enum RECOMMEND_WORD_QA for value: "RECOMMEND_WORD_QA"
         */
        public static final QaPairSourceEnum RECOMMEND_WORD_QA = new QaPairSourceEnum("RECOMMEND_WORD_QA");

        private static final Map<String, QaPairSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QaPairSourceEnum> createStaticFields() {
            Map<String, QaPairSourceEnum> map = new HashMap<>();
            map.put("IROBOT_QA", IROBOT_QA);
            map.put("RECOMMEND_WORD_QA", RECOMMEND_WORD_QA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QaPairSourceEnum(String value) {
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
        public static QaPairSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QaPairSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QaPairSourceEnum(value);
            }
            return result;
        }

        public static QaPairSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QaPairSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QaPairSourceEnum) {
                return this.value.equals(((QaPairSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_pair_source")

    private QaPairSourceEnum qaPairSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_option_id")

    private String feedbackOptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_description")

    private String feedbackDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_pair_id")

    private String qaPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    /**
     * - FAQ:  - FLOW:  
     */
    public static final class FeedbackSourceEnum {

        /**
         * Enum FAQ for value: "FAQ"
         */
        public static final FeedbackSourceEnum FAQ = new FeedbackSourceEnum("FAQ");

        /**
         * Enum FLOW for value: "FLOW"
         */
        public static final FeedbackSourceEnum FLOW = new FeedbackSourceEnum("FLOW");

        private static final Map<String, FeedbackSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeedbackSourceEnum> createStaticFields() {
            Map<String, FeedbackSourceEnum> map = new HashMap<>();
            map.put("FAQ", FAQ);
            map.put("FLOW", FLOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FeedbackSourceEnum(String value) {
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
        public static FeedbackSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FeedbackSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FeedbackSourceEnum(value);
            }
            return result;
        }

        public static FeedbackSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FeedbackSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FeedbackSourceEnum) {
                return this.value.equals(((FeedbackSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_source")

    private FeedbackSourceEnum feedbackSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_node_id")

    private String flowNodeId;

    public QaFeedbackReq withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * 用户问题
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QaFeedbackReq withFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
        return this;
    }

    /**
     * 反馈记录Id
     * @return feedbackId
     */
    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public QaFeedbackReq withQaPairSource(QaPairSourceEnum qaPairSource) {
        this.qaPairSource = qaPairSource;
        return this;
    }

    /**
     * - IROBOT_QA:  - RECOMMEND_WORD_QA:  
     * @return qaPairSource
     */
    public QaPairSourceEnum getQaPairSource() {
        return qaPairSource;
    }

    public void setQaPairSource(QaPairSourceEnum qaPairSource) {
        this.qaPairSource = qaPairSource;
    }

    public QaFeedbackReq withFeedbackOptionId(String feedbackOptionId) {
        this.feedbackOptionId = feedbackOptionId;
        return this;
    }

    /**
     * 反馈选项id
     * @return feedbackOptionId
     */
    public String getFeedbackOptionId() {
        return feedbackOptionId;
    }

    public void setFeedbackOptionId(String feedbackOptionId) {
        this.feedbackOptionId = feedbackOptionId;
    }

    public QaFeedbackReq withFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
        return this;
    }

    /**
     * 反馈描述
     * @return feedbackDescription
     */
    public String getFeedbackDescription() {
        return feedbackDescription;
    }

    public void setFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }

    public QaFeedbackReq withQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
        return this;
    }

    /**
     * 语料id
     * @return qaPairId
     */
    public String getQaPairId() {
        return qaPairId;
    }

    public void setQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
    }

    public QaFeedbackReq withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public QaFeedbackReq withFeedbackSource(FeedbackSourceEnum feedbackSource) {
        this.feedbackSource = feedbackSource;
        return this;
    }

    /**
     * - FAQ:  - FLOW:  
     * @return feedbackSource
     */
    public FeedbackSourceEnum getFeedbackSource() {
        return feedbackSource;
    }

    public void setFeedbackSource(FeedbackSourceEnum feedbackSource) {
        this.feedbackSource = feedbackSource;
    }

    public QaFeedbackReq withFlowNodeId(String flowNodeId) {
        this.flowNodeId = flowNodeId;
        return this;
    }

    /**
     * 流程节点Id
     * @return flowNodeId
     */
    public String getFlowNodeId() {
        return flowNodeId;
    }

    public void setFlowNodeId(String flowNodeId) {
        this.flowNodeId = flowNodeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QaFeedbackReq qaFeedbackReq = (QaFeedbackReq) o;
        return Objects.equals(this.question, qaFeedbackReq.question)
            && Objects.equals(this.feedbackId, qaFeedbackReq.feedbackId)
            && Objects.equals(this.qaPairSource, qaFeedbackReq.qaPairSource)
            && Objects.equals(this.feedbackOptionId, qaFeedbackReq.feedbackOptionId)
            && Objects.equals(this.feedbackDescription, qaFeedbackReq.feedbackDescription)
            && Objects.equals(this.qaPairId, qaFeedbackReq.qaPairId)
            && Objects.equals(this.requestId, qaFeedbackReq.requestId)
            && Objects.equals(this.feedbackSource, qaFeedbackReq.feedbackSource)
            && Objects.equals(this.flowNodeId, qaFeedbackReq.flowNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question,
            feedbackId,
            qaPairSource,
            feedbackOptionId,
            feedbackDescription,
            qaPairId,
            requestId,
            feedbackSource,
            flowNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaFeedbackReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
        sb.append("    qaPairSource: ").append(toIndentedString(qaPairSource)).append("\n");
        sb.append("    feedbackOptionId: ").append(toIndentedString(feedbackOptionId)).append("\n");
        sb.append("    feedbackDescription: ").append(toIndentedString(feedbackDescription)).append("\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    feedbackSource: ").append(toIndentedString(feedbackSource)).append("\n");
        sb.append("    flowNodeId: ").append(toIndentedString(flowNodeId)).append("\n");
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
