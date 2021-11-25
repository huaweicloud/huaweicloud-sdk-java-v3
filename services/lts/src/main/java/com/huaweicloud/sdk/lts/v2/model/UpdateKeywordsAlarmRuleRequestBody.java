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

/** UpdateKeywordsAlarmRuleRequestBody */
public class UpdateKeywordsAlarmRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_id")

    private String keywordsAlarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_name")

    private String keywordsAlarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_description")

    private String keywordsAlarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_requests")

    private List<KeywordsRequest> keywordsRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private Frequency frequency;

    /** 告警级别 */
    public static final class KeywordsAlarmLevelEnum {

        /** Enum INFO for value: "Info" */
        public static final KeywordsAlarmLevelEnum INFO = new KeywordsAlarmLevelEnum("Info");

        /** Enum MINOR for value: "Minor" */
        public static final KeywordsAlarmLevelEnum MINOR = new KeywordsAlarmLevelEnum("Minor");

        /** Enum MAJOR for value: "Major" */
        public static final KeywordsAlarmLevelEnum MAJOR = new KeywordsAlarmLevelEnum("Major");

        /** Enum CRITICAL for value: "Critical" */
        public static final KeywordsAlarmLevelEnum CRITICAL = new KeywordsAlarmLevelEnum("Critical");

        private static final Map<String, KeywordsAlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeywordsAlarmLevelEnum> createStaticFields() {
            Map<String, KeywordsAlarmLevelEnum> map = new HashMap<>();
            map.put("Info", INFO);
            map.put("Minor", MINOR);
            map.put("Major", MAJOR);
            map.put("Critical", CRITICAL);
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

    private KeywordsAlarmLevelEnum keywordsAlarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_send")

    private Boolean keywordsAlarmSend;

    /** 发送主题 0:不变 1:新增 2:修改 3:删除 */
    public static final class KeywordsAlarmSendCodeEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final KeywordsAlarmSendCodeEnum NUMBER_0 = new KeywordsAlarmSendCodeEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final KeywordsAlarmSendCodeEnum NUMBER_1 = new KeywordsAlarmSendCodeEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final KeywordsAlarmSendCodeEnum NUMBER_2 = new KeywordsAlarmSendCodeEnum(2);

        /** Enum NUMBER_3 for value: 3 */
        public static final KeywordsAlarmSendCodeEnum NUMBER_3 = new KeywordsAlarmSendCodeEnum(3);

        private static final Map<Integer, KeywordsAlarmSendCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, KeywordsAlarmSendCodeEnum> createStaticFields() {
            Map<Integer, KeywordsAlarmSendCodeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        KeywordsAlarmSendCodeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static KeywordsAlarmSendCodeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            KeywordsAlarmSendCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeywordsAlarmSendCodeEnum(value);
            }
            return result;
        }

        public static KeywordsAlarmSendCodeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            KeywordsAlarmSendCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeywordsAlarmSendCodeEnum) {
                return this.value.equals(((KeywordsAlarmSendCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_send_code")

    private KeywordsAlarmSendCodeEnum keywordsAlarmSendCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_save_rule")

    private NotificationSaveRule notificationSaveRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_english")

    private Boolean whetherEnglish;

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
        return this;
    }

    /** 关键词告警规则id
     * 
     * @return keywordsAlarmRuleId */
    public String getKeywordsAlarmRuleId() {
        return keywordsAlarmRuleId;
    }

    public void setKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
    }

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
        return this;
    }

    /** 关键词告警名称
     * 
     * @return keywordsAlarmRuleName */
    public String getKeywordsAlarmRuleName() {
        return keywordsAlarmRuleName;
    }

    public void setKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
    }

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
        return this;
    }

    /** 关键词告警信息描述
     * 
     * @return keywordsAlarmRuleDescription */
    public String getKeywordsAlarmRuleDescription() {
        return keywordsAlarmRuleDescription;
    }

    public void setKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
    }

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
        return this;
    }

    public UpdateKeywordsAlarmRuleRequestBody addKeywordsRequestsItem(KeywordsRequest keywordsRequestsItem) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        this.keywordsRequests.add(keywordsRequestsItem);
        return this;
    }

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsRequests(
        Consumer<List<KeywordsRequest>> keywordsRequestsSetter) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        keywordsRequestsSetter.accept(this.keywordsRequests);
        return this;
    }

    /** 关键词详细信息
     * 
     * @return keywordsRequests */
    public List<KeywordsRequest> getKeywordsRequests() {
        return keywordsRequests;
    }

    public void setKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
    }

    public UpdateKeywordsAlarmRuleRequestBody withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public UpdateKeywordsAlarmRuleRequestBody withFrequency(Consumer<Frequency> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new Frequency();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /** 告警统计周期
     * 
     * @return frequency */
    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
        return this;
    }

    /** 告警级别
     * 
     * @return keywordsAlarmLevel */
    public KeywordsAlarmLevelEnum getKeywordsAlarmLevel() {
        return keywordsAlarmLevel;
    }

    public void setKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
    }

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
        return this;
    }

    /** 是否发送
     * 
     * @return keywordsAlarmSend */
    public Boolean getKeywordsAlarmSend() {
        return keywordsAlarmSend;
    }

    public void setKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
    }

    public UpdateKeywordsAlarmRuleRequestBody withKeywordsAlarmSendCode(
        KeywordsAlarmSendCodeEnum keywordsAlarmSendCode) {
        this.keywordsAlarmSendCode = keywordsAlarmSendCode;
        return this;
    }

    /** 发送主题 0:不变 1:新增 2:修改 3:删除 minimum: 0 maximum: 3
     * 
     * @return keywordsAlarmSendCode */
    public KeywordsAlarmSendCodeEnum getKeywordsAlarmSendCode() {
        return keywordsAlarmSendCode;
    }

    public void setKeywordsAlarmSendCode(KeywordsAlarmSendCodeEnum keywordsAlarmSendCode) {
        this.keywordsAlarmSendCode = keywordsAlarmSendCode;
    }

    public UpdateKeywordsAlarmRuleRequestBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** domainId
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateKeywordsAlarmRuleRequestBody withNotificationSaveRule(NotificationSaveRule notificationSaveRule) {
        this.notificationSaveRule = notificationSaveRule;
        return this;
    }

    public UpdateKeywordsAlarmRuleRequestBody withNotificationSaveRule(
        Consumer<NotificationSaveRule> notificationSaveRuleSetter) {
        if (this.notificationSaveRule == null) {
            this.notificationSaveRule = new NotificationSaveRule();
            notificationSaveRuleSetter.accept(this.notificationSaveRule);
        }

        return this;
    }

    /** 通知主题
     * 
     * @return notificationSaveRule */
    public NotificationSaveRule getNotificationSaveRule() {
        return notificationSaveRule;
    }

    public void setNotificationSaveRule(NotificationSaveRule notificationSaveRule) {
        this.notificationSaveRule = notificationSaveRule;
    }

    public UpdateKeywordsAlarmRuleRequestBody withWhetherEnglish(Boolean whetherEnglish) {
        this.whetherEnglish = whetherEnglish;
        return this;
    }

    /** 邮件附加信息是否英文
     * 
     * @return whetherEnglish */
    public Boolean getWhetherEnglish() {
        return whetherEnglish;
    }

    public void setWhetherEnglish(Boolean whetherEnglish) {
        this.whetherEnglish = whetherEnglish;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateKeywordsAlarmRuleRequestBody updateKeywordsAlarmRuleRequestBody = (UpdateKeywordsAlarmRuleRequestBody) o;
        return Objects.equals(this.keywordsAlarmRuleId, updateKeywordsAlarmRuleRequestBody.keywordsAlarmRuleId)
            && Objects.equals(this.keywordsAlarmRuleName, updateKeywordsAlarmRuleRequestBody.keywordsAlarmRuleName)
            && Objects.equals(this.keywordsAlarmRuleDescription,
                updateKeywordsAlarmRuleRequestBody.keywordsAlarmRuleDescription)
            && Objects.equals(this.keywordsRequests, updateKeywordsAlarmRuleRequestBody.keywordsRequests)
            && Objects.equals(this.frequency, updateKeywordsAlarmRuleRequestBody.frequency)
            && Objects.equals(this.keywordsAlarmLevel, updateKeywordsAlarmRuleRequestBody.keywordsAlarmLevel)
            && Objects.equals(this.keywordsAlarmSend, updateKeywordsAlarmRuleRequestBody.keywordsAlarmSend)
            && Objects.equals(this.keywordsAlarmSendCode, updateKeywordsAlarmRuleRequestBody.keywordsAlarmSendCode)
            && Objects.equals(this.domainId, updateKeywordsAlarmRuleRequestBody.domainId)
            && Objects.equals(this.notificationSaveRule, updateKeywordsAlarmRuleRequestBody.notificationSaveRule)
            && Objects.equals(this.whetherEnglish, updateKeywordsAlarmRuleRequestBody.whetherEnglish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordsAlarmRuleId,
            keywordsAlarmRuleName,
            keywordsAlarmRuleDescription,
            keywordsRequests,
            frequency,
            keywordsAlarmLevel,
            keywordsAlarmSend,
            keywordsAlarmSendCode,
            domainId,
            notificationSaveRule,
            whetherEnglish);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeywordsAlarmRuleRequestBody {\n");
        sb.append("    keywordsAlarmRuleId: ").append(toIndentedString(keywordsAlarmRuleId)).append("\n");
        sb.append("    keywordsAlarmRuleName: ").append(toIndentedString(keywordsAlarmRuleName)).append("\n");
        sb.append("    keywordsAlarmRuleDescription: ")
            .append(toIndentedString(keywordsAlarmRuleDescription))
            .append("\n");
        sb.append("    keywordsRequests: ").append(toIndentedString(keywordsRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    keywordsAlarmLevel: ").append(toIndentedString(keywordsAlarmLevel)).append("\n");
        sb.append("    keywordsAlarmSend: ").append(toIndentedString(keywordsAlarmSend)).append("\n");
        sb.append("    keywordsAlarmSendCode: ").append(toIndentedString(keywordsAlarmSendCode)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    notificationSaveRule: ").append(toIndentedString(notificationSaveRule)).append("\n");
        sb.append("    whetherEnglish: ").append(toIndentedString(whetherEnglish)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
