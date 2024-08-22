package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NoticeRuleNotification
 */
public class NoticeRuleNotification {

    /**
     * 通知的协议类型，包括短信，邮件，企业微信群消息等。
     */
    public static final class ProtocolEnum {

        /**
         * Enum EMAIL for value: "email"
         */
        public static final ProtocolEnum EMAIL = new ProtocolEnum("email");

        /**
         * Enum SMS for value: "sms"
         */
        public static final ProtocolEnum SMS = new ProtocolEnum("sms");

        /**
         * Enum WECHAT for value: "wechat"
         */
        public static final ProtocolEnum WECHAT = new ProtocolEnum("wechat");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("email", EMAIL);
            map.put("sms", SMS);
            map.put("wechat", WECHAT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    /**
     * 通知的模板语言。 ZH，中文。 EN，英文。
     */
    public static final class TemplateEnum {

        /**
         * Enum ZH for value: "ZH"
         */
        public static final TemplateEnum ZH = new TemplateEnum("ZH");

        /**
         * Enum EN for value: "EN"
         */
        public static final TemplateEnum EN = new TemplateEnum("EN");

        private static final Map<String, TemplateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateEnum> createStaticFields() {
            Map<String, TemplateEnum> map = new HashMap<>();
            map.put("ZH", ZH);
            map.put("EN", EN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TemplateEnum(String value) {
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
        public static TemplateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TemplateEnum(value));
        }

        public static TemplateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TemplateEnum) {
                return this.value.equals(((TemplateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private TemplateEnum template;

    public NoticeRuleNotification withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 通知的协议类型，包括短信，邮件，企业微信群消息等。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public NoticeRuleNotification withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 通知的终端地址。 email协议，接入点必须是邮件地址。 sms协议，接入点必须是一个电话号码。 wechat协议，参考https://support.huaweicloud.com/smn_faq/smn_faq_0027.html获取订阅终端， 企业微信群消息为SMN服务公测功能，需提交工单申请开通。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public NoticeRuleNotification withTemplate(TemplateEnum template) {
        this.template = template;
        return this;
    }

    /**
     * 通知的模板语言。 ZH，中文。 EN，英文。
     * @return template
     */
    public TemplateEnum getTemplate() {
        return template;
    }

    public void setTemplate(TemplateEnum template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoticeRuleNotification that = (NoticeRuleNotification) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, endpoint, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoticeRuleNotification {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
