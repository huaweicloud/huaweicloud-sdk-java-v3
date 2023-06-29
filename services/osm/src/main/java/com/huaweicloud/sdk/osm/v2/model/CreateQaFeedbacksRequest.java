package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateQaFeedbacksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")

    private String xServiceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")

    private String xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")

    private String xLanguage;

    /**
     * - LIKE:  - CANCEL_LIKE:  - DISLIKE:  - ALL:  
     */
    public static final class FeedbackTypeEnum {

        /**
         * Enum LIKE for value: "LIKE"
         */
        public static final FeedbackTypeEnum LIKE = new FeedbackTypeEnum("LIKE");

        /**
         * Enum CANCEL_LIKE for value: "CANCEL_LIKE"
         */
        public static final FeedbackTypeEnum CANCEL_LIKE = new FeedbackTypeEnum("CANCEL_LIKE");

        /**
         * Enum DISLIKE for value: "DISLIKE"
         */
        public static final FeedbackTypeEnum DISLIKE = new FeedbackTypeEnum("DISLIKE");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final FeedbackTypeEnum ALL = new FeedbackTypeEnum("ALL");

        private static final Map<String, FeedbackTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeedbackTypeEnum> createStaticFields() {
            Map<String, FeedbackTypeEnum> map = new HashMap<>();
            map.put("LIKE", LIKE);
            map.put("CANCEL_LIKE", CANCEL_LIKE);
            map.put("DISLIKE", DISLIKE);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FeedbackTypeEnum(String value) {
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
        public static FeedbackTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeedbackTypeEnum(value));
        }

        public static FeedbackTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FeedbackTypeEnum) {
                return this.value.equals(((FeedbackTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_type")

    private FeedbackTypeEnum feedbackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private QaFeedbackReq body;

    public CreateQaFeedbacksRequest withXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
        return this;
    }

    /**
     * 调用智能客服服务标志。
     * @return xServiceKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")
    public String getXServiceKey() {
        return xServiceKey;
    }

    public void setXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
    }

    public CreateQaFeedbacksRequest withXSite(String xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 站点标记，0-中国站  1-国际站
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")
    public String getXSite() {
        return xSite;
    }

    public void setXSite(String xSite) {
        this.xSite = xSite;
    }

    public CreateQaFeedbacksRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 区域语言简写，en-us  zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CreateQaFeedbacksRequest withFeedbackType(FeedbackTypeEnum feedbackType) {
        this.feedbackType = feedbackType;
        return this;
    }

    /**
     * - LIKE:  - CANCEL_LIKE:  - DISLIKE:  - ALL:  
     * @return feedbackType
     */
    public FeedbackTypeEnum getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(FeedbackTypeEnum feedbackType) {
        this.feedbackType = feedbackType;
    }

    public CreateQaFeedbacksRequest withBody(QaFeedbackReq body) {
        this.body = body;
        return this;
    }

    public CreateQaFeedbacksRequest withBody(Consumer<QaFeedbackReq> bodySetter) {
        if (this.body == null) {
            this.body = new QaFeedbackReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public QaFeedbackReq getBody() {
        return body;
    }

    public void setBody(QaFeedbackReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateQaFeedbacksRequest that = (CreateQaFeedbacksRequest) obj;
        return Objects.equals(this.xServiceKey, that.xServiceKey) && Objects.equals(this.xSite, that.xSite)
            && Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.feedbackType, that.feedbackType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xServiceKey, xSite, xLanguage, feedbackType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQaFeedbacksRequest {\n");
        sb.append("    xServiceKey: ").append(toIndentedString(xServiceKey)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    feedbackType: ").append(toIndentedString(feedbackType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
