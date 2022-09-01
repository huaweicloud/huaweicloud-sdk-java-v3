package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateKeywordsAlarmRuleRequestBody
 */
public class CreateKeywordsAlarmRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_name")

    @JacksonXmlProperty(localName = "keywords_alarm_rule_name")

    private String keywordsAlarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_description")

    @JacksonXmlProperty(localName = "keywords_alarm_rule_description")

    private String keywordsAlarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_requests")

    @JacksonXmlProperty(localName = "keywords_requests")

    private List<KeywordsRequest> keywordsRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    @JacksonXmlProperty(localName = "frequency")

    private Frequency frequency;

    /**
     * 告警级别
     */
    public static final class KeywordsAlarmLevelEnum {

        /**
         * Enum INFO for value: "Info"
         */
        public static final KeywordsAlarmLevelEnum INFO = new KeywordsAlarmLevelEnum("Info");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final KeywordsAlarmLevelEnum MINOR = new KeywordsAlarmLevelEnum("Minor");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final KeywordsAlarmLevelEnum MAJOR = new KeywordsAlarmLevelEnum("Major");

        /**
         * Enum CRITICAL for value: "CRITICAL"
         */
        public static final KeywordsAlarmLevelEnum CRITICAL = new KeywordsAlarmLevelEnum("CRITICAL");

        private static final Map<String, KeywordsAlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeywordsAlarmLevelEnum> createStaticFields() {
            Map<String, KeywordsAlarmLevelEnum> map = new HashMap<>();
            map.put("Info", INFO);
            map.put("Minor", MINOR);
            map.put("Major", MAJOR);
            map.put("CRITICAL", CRITICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeywordsAlarmLevelEnum(String value) {
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
        public static KeywordsAlarmLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KeywordsAlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeywordsAlarmLevelEnum(value);
            }
            return result;
        }

        public static KeywordsAlarmLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KeywordsAlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeywordsAlarmLevelEnum) {
                return this.value.equals(((KeywordsAlarmLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_level")

    @JacksonXmlProperty(localName = "keywords_alarm_level")

    private KeywordsAlarmLevelEnum keywordsAlarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_send")

    @JacksonXmlProperty(localName = "keywords_alarm_send")

    private Boolean keywordsAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_save_rule")

    @JacksonXmlProperty(localName = "notification_save_rule")

    private NotificationSaveRule notificationSaveRule;

    public CreateKeywordsAlarmRuleRequestBody withKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
        return this;
    }

    /**
     * 关键词告警名称
     * @return keywordsAlarmRuleName
     */
    public String getKeywordsAlarmRuleName() {
        return keywordsAlarmRuleName;
    }

    public void setKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
    }

    public CreateKeywordsAlarmRuleRequestBody withKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
        return this;
    }

    /**
     * 关键词告警信息描述
     * @return keywordsAlarmRuleDescription
     */
    public String getKeywordsAlarmRuleDescription() {
        return keywordsAlarmRuleDescription;
    }

    public void setKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
    }

    public CreateKeywordsAlarmRuleRequestBody withKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
        return this;
    }

    public CreateKeywordsAlarmRuleRequestBody addKeywordsRequestsItem(KeywordsRequest keywordsRequestsItem) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        this.keywordsRequests.add(keywordsRequestsItem);
        return this;
    }

    public CreateKeywordsAlarmRuleRequestBody withKeywordsRequests(
        Consumer<List<KeywordsRequest>> keywordsRequestsSetter) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        keywordsRequestsSetter.accept(this.keywordsRequests);
        return this;
    }

    /**
     * 关键词详细信息
     * @return keywordsRequests
     */
    public List<KeywordsRequest> getKeywordsRequests() {
        return keywordsRequests;
    }

    public void setKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
    }

    public CreateKeywordsAlarmRuleRequestBody withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public CreateKeywordsAlarmRuleRequestBody withFrequency(Consumer<Frequency> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new Frequency();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /**
     * Get frequency
     * @return frequency
     */
    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CreateKeywordsAlarmRuleRequestBody withKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return keywordsAlarmLevel
     */
    public KeywordsAlarmLevelEnum getKeywordsAlarmLevel() {
        return keywordsAlarmLevel;
    }

    public void setKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
    }

    public CreateKeywordsAlarmRuleRequestBody withKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
        return this;
    }

    /**
     * 是否发送
     * @return keywordsAlarmSend
     */
    public Boolean getKeywordsAlarmSend() {
        return keywordsAlarmSend;
    }

    public void setKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
    }

    public CreateKeywordsAlarmRuleRequestBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateKeywordsAlarmRuleRequestBody withNotificationSaveRule(NotificationSaveRule notificationSaveRule) {
        this.notificationSaveRule = notificationSaveRule;
        return this;
    }

    public CreateKeywordsAlarmRuleRequestBody withNotificationSaveRule(
        Consumer<NotificationSaveRule> notificationSaveRuleSetter) {
        if (this.notificationSaveRule == null) {
            this.notificationSaveRule = new NotificationSaveRule();
            notificationSaveRuleSetter.accept(this.notificationSaveRule);
        }

        return this;
    }

    /**
     * 通知主题
     * @return notificationSaveRule
     */
    public NotificationSaveRule getNotificationSaveRule() {
        return notificationSaveRule;
    }

    public void setNotificationSaveRule(NotificationSaveRule notificationSaveRule) {
        this.notificationSaveRule = notificationSaveRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateKeywordsAlarmRuleRequestBody createKeywordsAlarmRuleRequestBody = (CreateKeywordsAlarmRuleRequestBody) o;
        return Objects.equals(this.keywordsAlarmRuleName, createKeywordsAlarmRuleRequestBody.keywordsAlarmRuleName)
            && Objects.equals(this.keywordsAlarmRuleDescription,
                createKeywordsAlarmRuleRequestBody.keywordsAlarmRuleDescription)
            && Objects.equals(this.keywordsRequests, createKeywordsAlarmRuleRequestBody.keywordsRequests)
            && Objects.equals(this.frequency, createKeywordsAlarmRuleRequestBody.frequency)
            && Objects.equals(this.keywordsAlarmLevel, createKeywordsAlarmRuleRequestBody.keywordsAlarmLevel)
            && Objects.equals(this.keywordsAlarmSend, createKeywordsAlarmRuleRequestBody.keywordsAlarmSend)
            && Objects.equals(this.domainId, createKeywordsAlarmRuleRequestBody.domainId)
            && Objects.equals(this.notificationSaveRule, createKeywordsAlarmRuleRequestBody.notificationSaveRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordsAlarmRuleName,
            keywordsAlarmRuleDescription,
            keywordsRequests,
            frequency,
            keywordsAlarmLevel,
            keywordsAlarmSend,
            domainId,
            notificationSaveRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeywordsAlarmRuleRequestBody {\n");
        sb.append("    keywordsAlarmRuleName: ").append(toIndentedString(keywordsAlarmRuleName)).append("\n");
        sb.append("    keywordsAlarmRuleDescription: ")
            .append(toIndentedString(keywordsAlarmRuleDescription))
            .append("\n");
        sb.append("    keywordsRequests: ").append(toIndentedString(keywordsRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    keywordsAlarmLevel: ").append(toIndentedString(keywordsAlarmLevel)).append("\n");
        sb.append("    keywordsAlarmSend: ").append(toIndentedString(keywordsAlarmSend)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    notificationSaveRule: ").append(toIndentedString(notificationSaveRule)).append("\n");
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
