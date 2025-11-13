package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 子模版数据结构
 */
public class SubTemplate {

    /**
     * 模板子类型，只支持以下5种类型：sms,dingding,wechat,webhook,email
     */
    public static final class SubTypeEnum {

        /**
         * Enum SMS for value: "sms"
         */
        public static final SubTypeEnum SMS = new SubTypeEnum("sms");

        /**
         * Enum DINGDING for value: "dingding"
         */
        public static final SubTypeEnum DINGDING = new SubTypeEnum("dingding");

        /**
         * Enum WECHAT for value: "wechat"
         */
        public static final SubTypeEnum WECHAT = new SubTypeEnum("wechat");

        /**
         * Enum WEBHOOK for value: "webhook"
         */
        public static final SubTypeEnum WEBHOOK = new SubTypeEnum("webhook");

        /**
         * Enum EMAIL for value: "email"
         */
        public static final SubTypeEnum EMAIL = new SubTypeEnum("email");

        private static final Map<String, SubTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubTypeEnum> createStaticFields() {
            Map<String, SubTypeEnum> map = new HashMap<>();
            map.put("sms", SMS);
            map.put("dingding", DINGDING);
            map.put("wechat", WECHAT);
            map.put("webhook", WEBHOOK);
            map.put("email", EMAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubTypeEnum(String value) {
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
        public static SubTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubTypeEnum(value));
        }

        public static SubTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubTypeEnum) {
                return this.value.equals(((SubTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_type")

    private SubTypeEnum subType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    public SubTemplate withSubType(SubTypeEnum subType) {
        this.subType = subType;
        return this;
    }

    /**
     * 模板子类型，只支持以下5种类型：sms,dingding,wechat,webhook,email
     * @return subType
     */
    public SubTypeEnum getSubType() {
        return subType;
    }

    public void setSubType(SubTypeEnum subType) {
        this.subType = subType;
    }

    public SubTemplate withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 子模版正文，$符号后所跟变量仅支持以下变量，根据不同告警类型（关键词告警和sql告警），所支持的变量亦不相同。 目前两种告警类型有共同变量如下：告警级别：${event_severity};发生时间：${starts_at};告警源：$event.metadata.resource_provider;资源类型：$event.metadata.resource_type;资源标识：${resources};统计类型：关键词统计;表达式：$event.annotations.condition_expression;当前值: $event.annotations.current_value;统计周期：$event.annotations.frequency; 关键词告警特有变量：查询时间：$event.annotations.results[0].time;查询日志：$event.annotations.results[0].raw_results; sql告警特有变量：日志组/流名称：$event.annotations.results[0].resource_id;查询语句：$event.annotations.results[0].sql;查询时间：$event.annotations.results[0].time;查询URL：$event.annotations.results[0].url;查询日志：$event.annotations.results[0].raw_results; 变量后面的分号\";\"为英文符号，必须添加，否则模板会出现替换失败的情况
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public SubTemplate withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 邮件主题,只有sub_type=email时生效
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTemplate that = (SubTemplate) obj;
        return Objects.equals(this.subType, that.subType) && Objects.equals(this.content, that.content)
            && Objects.equals(this.topic, that.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subType, content, topic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTemplate {\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
