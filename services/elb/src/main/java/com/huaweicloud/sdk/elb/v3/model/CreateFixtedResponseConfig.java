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
 * 参数解释：固定返回页面的配置。  约束限制： - 当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。 - 当action为FIXED_RESPONSE时生效，且为必选字段。其他action不可指定，否则报错。 [- 共享型负载均衡器下的转发策略不支持该字段，传入会报错。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt)
 */
public class CreateFixtedResponseConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    /**
     * 参数解释：返回body的格式。  取值范围： - text/plain - text/css - text/html - application/javascript - application/json  默认取值：text/plain
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

    private CreateInsertHeadersConfig insertHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_headers_config")

    private CreateRemoveHeadersConfig removeHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limit_config")

    private CreateTrafficLimitConfig trafficLimitConfig;

    public CreateFixtedResponseConfig withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 参数解释：返回码。  取值范围：200-299，400-499，500-599。
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public CreateFixtedResponseConfig withContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 参数解释：返回body的格式。  取值范围： - text/plain - text/css - text/html - application/javascript - application/json  默认取值：text/plain
     * @return contentType
     */
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public CreateFixtedResponseConfig withMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /**
     * 参数解释：返回消息内容。
     * @return messageBody
     */
    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public CreateFixtedResponseConfig withInsertHeadersConfig(CreateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
        return this;
    }

    public CreateFixtedResponseConfig withInsertHeadersConfig(
        Consumer<CreateInsertHeadersConfig> insertHeadersConfigSetter) {
        if (this.insertHeadersConfig == null) {
            this.insertHeadersConfig = new CreateInsertHeadersConfig();
            insertHeadersConfigSetter.accept(this.insertHeadersConfig);
        }

        return this;
    }

    /**
     * Get insertHeadersConfig
     * @return insertHeadersConfig
     */
    public CreateInsertHeadersConfig getInsertHeadersConfig() {
        return insertHeadersConfig;
    }

    public void setInsertHeadersConfig(CreateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
    }

    public CreateFixtedResponseConfig withRemoveHeadersConfig(CreateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
        return this;
    }

    public CreateFixtedResponseConfig withRemoveHeadersConfig(
        Consumer<CreateRemoveHeadersConfig> removeHeadersConfigSetter) {
        if (this.removeHeadersConfig == null) {
            this.removeHeadersConfig = new CreateRemoveHeadersConfig();
            removeHeadersConfigSetter.accept(this.removeHeadersConfig);
        }

        return this;
    }

    /**
     * Get removeHeadersConfig
     * @return removeHeadersConfig
     */
    public CreateRemoveHeadersConfig getRemoveHeadersConfig() {
        return removeHeadersConfig;
    }

    public void setRemoveHeadersConfig(CreateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
    }

    public CreateFixtedResponseConfig withTrafficLimitConfig(CreateTrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
        return this;
    }

    public CreateFixtedResponseConfig withTrafficLimitConfig(
        Consumer<CreateTrafficLimitConfig> trafficLimitConfigSetter) {
        if (this.trafficLimitConfig == null) {
            this.trafficLimitConfig = new CreateTrafficLimitConfig();
            trafficLimitConfigSetter.accept(this.trafficLimitConfig);
        }

        return this;
    }

    /**
     * Get trafficLimitConfig
     * @return trafficLimitConfig
     */
    public CreateTrafficLimitConfig getTrafficLimitConfig() {
        return trafficLimitConfig;
    }

    public void setTrafficLimitConfig(CreateTrafficLimitConfig trafficLimitConfig) {
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
        CreateFixtedResponseConfig that = (CreateFixtedResponseConfig) obj;
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
        sb.append("class CreateFixtedResponseConfig {\n");
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
