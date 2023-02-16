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
 * Request Object
 */
public class ListFeedbackOptionRequest {

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
     * - UNPUBLISHED:  - PUBLISH:  
     */
    public static final class StatusEnum {

        /**
         * Enum UNPUBLISHED for value: "UNPUBLISHED"
         */
        public static final StatusEnum UNPUBLISHED = new StatusEnum("UNPUBLISHED");

        /**
         * Enum PUBLISH for value: "PUBLISH"
         */
        public static final StatusEnum PUBLISH = new StatusEnum("PUBLISH");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("UNPUBLISHED", UNPUBLISHED);
            map.put("PUBLISH", PUBLISH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

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

    public ListFeedbackOptionRequest withXServiceKey(String xServiceKey) {
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

    public ListFeedbackOptionRequest withXSite(String xSite) {
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

    public ListFeedbackOptionRequest withXLanguage(String xLanguage) {
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

    public ListFeedbackOptionRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * - UNPUBLISHED:  - PUBLISH:  
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListFeedbackOptionRequest withFeedbackSource(FeedbackSourceEnum feedbackSource) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFeedbackOptionRequest listFeedbackOptionRequest = (ListFeedbackOptionRequest) o;
        return Objects.equals(this.xServiceKey, listFeedbackOptionRequest.xServiceKey)
            && Objects.equals(this.xSite, listFeedbackOptionRequest.xSite)
            && Objects.equals(this.xLanguage, listFeedbackOptionRequest.xLanguage)
            && Objects.equals(this.status, listFeedbackOptionRequest.status)
            && Objects.equals(this.feedbackSource, listFeedbackOptionRequest.feedbackSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xServiceKey, xSite, xLanguage, status, feedbackSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFeedbackOptionRequest {\n");
        sb.append("    xServiceKey: ").append(toIndentedString(xServiceKey)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    feedbackSource: ").append(toIndentedString(feedbackSource)).append("\n");
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
