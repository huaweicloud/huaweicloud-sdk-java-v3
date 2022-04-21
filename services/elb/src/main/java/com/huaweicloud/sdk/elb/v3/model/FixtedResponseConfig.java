package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 固定返回页面的配置。当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。[共享型负载均衡器下的转发策略不支持该字段，传入会报错。](tag:dt,dt_test)  [当action为FIXED_RESPONSE时生效，且为必选字段，其他action不可指定。](tag:hws,ocb,tlf,ctc,hcso,sbc,g42,tm,cmcc,hk-g42)  [不支持该字段，请勿使用。](tag:dt,dt_test)
 */
public class FixtedResponseConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    /**
     * 返回body的格式。  取值范围： - text/plain - text/css - text/html - application/javascript - application/json
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
            ContentTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ContentTypeEnum(value);
            }
            return result;
        }

        public static ContentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ContentTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public FixtedResponseConfig withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 返回码。支持200~299,400~499,500~599。
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
     * 返回body的格式。  取值范围： - text/plain - text/css - text/html - application/javascript - application/json
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
     * 返回消息内容。
     * @return messageBody
     */
    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FixtedResponseConfig fixtedResponseConfig = (FixtedResponseConfig) o;
        return Objects.equals(this.statusCode, fixtedResponseConfig.statusCode)
            && Objects.equals(this.contentType, fixtedResponseConfig.contentType)
            && Objects.equals(this.messageBody, fixtedResponseConfig.messageBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, contentType, messageBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FixtedResponseConfig {\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    messageBody: ").append(toIndentedString(messageBody)).append("\n");
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
