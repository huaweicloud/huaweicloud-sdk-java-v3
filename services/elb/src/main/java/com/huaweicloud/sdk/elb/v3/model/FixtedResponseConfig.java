package com.huaweicloud.sdk.elb.v3.model;

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
 * **参数解释**：固定返回页面的配置。  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt)
 */
public class FixtedResponseConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    /**
     * **参数解释**：返回body的格式。  **取值范围**： - text/plain - text/css - text/html - application/javascript - application/json
     */
    public static final class ContentTypeEnum {

        /**
         * Enum TEXT_PLAIN for value: "text/plain"
         */
        public static final ContentTypeEnum TEXT_PLAIN = new ContentTypeEnum("text/plain");

        /**
         * Enum TEXT_CSS for value: "text/css"
         */
        public static final ContentTypeEnum TEXT_CSS = new ContentTypeEnum("text/css");

        /**
         * Enum TEXT_HTML for value: "text/html"
         */
        public static final ContentTypeEnum TEXT_HTML = new ContentTypeEnum("text/html");

        /**
         * Enum APPLICATION_JAVASCRIPT for value: "application/javascript"
         */
        public static final ContentTypeEnum APPLICATION_JAVASCRIPT = new ContentTypeEnum("application/javascript");

        /**
         * Enum APPLICATION_JSON for value: "application/json"
         */
        public static final ContentTypeEnum APPLICATION_JSON = new ContentTypeEnum("application/json");

        private static final Map<String, ContentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentTypeEnum> createStaticFields() {
            Map<String, ContentTypeEnum> map = new HashMap<>();
            map.put("text/plain", TEXT_PLAIN);
            map.put("text/css", TEXT_CSS);
            map.put("text/html", TEXT_HTML);
            map.put("application/javascript", APPLICATION_JAVASCRIPT);
            map.put("application/json", APPLICATION_JSON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ContentTypeEnum(String value) {
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
        public static ContentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ContentTypeEnum(value));
        }

        public static ContentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ContentTypeEnum) {
                return this.value.equals(((ContentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private ContentTypeEnum contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_body")

    private String messageBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_headers_config")

    private InsertHeadersConfig insertHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_headers_config")

    private RemoveHeadersConfig removeHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limit_config")

    private TrafficLimitConfig trafficLimitConfig;

    public FixtedResponseConfig withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * **参数解释**：返回码。  **取值范围**：200~299、400~499和500~599。
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public FixtedResponseConfig withContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * **参数解释**：返回body的格式。  **取值范围**： - text/plain - text/css - text/html - application/javascript - application/json
     * @return contentType
     */
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public FixtedResponseConfig withMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /**
     * **参数解释**：返回消息内容。  **取值范围**：不涉及
     * @return messageBody
     */
    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public FixtedResponseConfig withInsertHeadersConfig(InsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
        return this;
    }

    public FixtedResponseConfig withInsertHeadersConfig(Consumer<InsertHeadersConfig> insertHeadersConfigSetter) {
        if (this.insertHeadersConfig == null) {
            this.insertHeadersConfig = new InsertHeadersConfig();
            insertHeadersConfigSetter.accept(this.insertHeadersConfig);
        }

        return this;
    }

    /**
     * Get insertHeadersConfig
     * @return insertHeadersConfig
     */
    public InsertHeadersConfig getInsertHeadersConfig() {
        return insertHeadersConfig;
    }

    public void setInsertHeadersConfig(InsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
    }

    public FixtedResponseConfig withRemoveHeadersConfig(RemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
        return this;
    }

    public FixtedResponseConfig withRemoveHeadersConfig(Consumer<RemoveHeadersConfig> removeHeadersConfigSetter) {
        if (this.removeHeadersConfig == null) {
            this.removeHeadersConfig = new RemoveHeadersConfig();
            removeHeadersConfigSetter.accept(this.removeHeadersConfig);
        }

        return this;
    }

    /**
     * Get removeHeadersConfig
     * @return removeHeadersConfig
     */
    public RemoveHeadersConfig getRemoveHeadersConfig() {
        return removeHeadersConfig;
    }

    public void setRemoveHeadersConfig(RemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
    }

    public FixtedResponseConfig withTrafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
        return this;
    }

    public FixtedResponseConfig withTrafficLimitConfig(Consumer<TrafficLimitConfig> trafficLimitConfigSetter) {
        if (this.trafficLimitConfig == null) {
            this.trafficLimitConfig = new TrafficLimitConfig();
            trafficLimitConfigSetter.accept(this.trafficLimitConfig);
        }

        return this;
    }

    /**
     * Get trafficLimitConfig
     * @return trafficLimitConfig
     */
    public TrafficLimitConfig getTrafficLimitConfig() {
        return trafficLimitConfig;
    }

    public void setTrafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FixtedResponseConfig that = (FixtedResponseConfig) obj;
        return Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.contentType, that.contentType)
            && Objects.equals(this.messageBody, that.messageBody)
            && Objects.equals(this.insertHeadersConfig, that.insertHeadersConfig)
            && Objects.equals(this.removeHeadersConfig, that.removeHeadersConfig)
            && Objects.equals(this.trafficLimitConfig, that.trafficLimitConfig);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(statusCode, contentType, messageBody, insertHeadersConfig, removeHeadersConfig, trafficLimitConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FixtedResponseConfig {\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    messageBody: ").append(toIndentedString(messageBody)).append("\n");
        sb.append("    insertHeadersConfig: ").append(toIndentedString(insertHeadersConfig)).append("\n");
        sb.append("    removeHeadersConfig: ").append(toIndentedString(removeHeadersConfig)).append("\n");
        sb.append("    trafficLimitConfig: ").append(toIndentedString(trafficLimitConfig)).append("\n");
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
