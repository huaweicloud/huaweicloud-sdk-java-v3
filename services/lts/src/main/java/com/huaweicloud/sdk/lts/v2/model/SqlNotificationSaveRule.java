package com.huaweicloud.sdk.lts.v2.model;

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
 * SqlNotificationSaveRule
 */
public class SqlNotificationSaveRule {

    /**
     * 首选项对应的语言
     */
    public static final class LanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final LanguageEnum ZH_CN = new LanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final LanguageEnum EN_US = new LanguageEnum("en-us");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageEnum(value));
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<Topics> topics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    public SqlNotificationSaveRule withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 首选项对应的语言
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public SqlNotificationSaveRule withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 首选项对应的时区信息
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public SqlNotificationSaveRule withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SqlNotificationSaveRule withTopics(List<Topics> topics) {
        this.topics = topics;
        return this;
    }

    public SqlNotificationSaveRule addTopicsItem(Topics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public SqlNotificationSaveRule withTopics(Consumer<List<Topics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 主题信息
     * @return topics
     */
    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    public SqlNotificationSaveRule withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 消息模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlNotificationSaveRule that = (SqlNotificationSaveRule) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.topics, that.topics)
            && Objects.equals(this.templateName, that.templateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, timezone, userName, topics, templateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlNotificationSaveRule {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
