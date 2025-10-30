package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateKeywordsAlarmRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_id")

    private String keywordsAlarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_name")

    private String keywordsAlarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_alias")

    private String alarmRuleAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_description")

    private String keywordsAlarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_requests")

    private List<KeywordsResBody> keywordsRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private FrequencyRespBody frequency;

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
         * Enum CRITICAL for value: "Critical"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeywordsAlarmLevelEnum(value));
        }

        public static KeywordsAlarmLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")

    private String conditionExpression;

    /**
     * 通知频率,单位(分钟)
     */
    public static final class NotificationFrequencyEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final NotificationFrequencyEnum NUMBER_0 = new NotificationFrequencyEnum(0);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final NotificationFrequencyEnum NUMBER_5 = new NotificationFrequencyEnum(5);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final NotificationFrequencyEnum NUMBER_10 = new NotificationFrequencyEnum(10);

        /**
         * Enum NUMBER_15 for value: 15
         */
        public static final NotificationFrequencyEnum NUMBER_15 = new NotificationFrequencyEnum(15);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final NotificationFrequencyEnum NUMBER_30 = new NotificationFrequencyEnum(30);

        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final NotificationFrequencyEnum NUMBER_60 = new NotificationFrequencyEnum(60);

        /**
         * Enum NUMBER_180 for value: 180
         */
        public static final NotificationFrequencyEnum NUMBER_180 = new NotificationFrequencyEnum(180);

        /**
         * Enum NUMBER_360 for value: 360
         */
        public static final NotificationFrequencyEnum NUMBER_360 = new NotificationFrequencyEnum(360);

        private static final Map<Integer, NotificationFrequencyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, NotificationFrequencyEnum> createStaticFields() {
            Map<Integer, NotificationFrequencyEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(5, NUMBER_5);
            map.put(10, NUMBER_10);
            map.put(15, NUMBER_15);
            map.put(30, NUMBER_30);
            map.put(60, NUMBER_60);
            map.put(180, NUMBER_180);
            map.put(360, NUMBER_360);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        NotificationFrequencyEnum(Integer value) {
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
        public static NotificationFrequencyEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationFrequencyEnum(value));
        }

        public static NotificationFrequencyEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationFrequencyEnum) {
                return this.value.equals(((NotificationFrequencyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_frequency")

    private NotificationFrequencyEnum notificationFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_rule_name")

    private String alarmActionRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_policy")

    private Integer recoveryPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsResBody> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_condition_count")

    private Integer triggerConditionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_condition_frequency")

    private Integer triggerConditionFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_recovery_policy")

    private Boolean whetherRecoveryPolicy;

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
        return this;
    }

    /**
     * 关键词告警id
     * @return keywordsAlarmRuleId
     */
    public String getKeywordsAlarmRuleId() {
        return keywordsAlarmRuleId;
    }

    public void setKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
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

    public UpdateKeywordsAlarmRuleResponse withAlarmRuleAlias(String alarmRuleAlias) {
        this.alarmRuleAlias = alarmRuleAlias;
        return this;
    }

    /**
     * 规则名称
     * @return alarmRuleAlias
     */
    public String getAlarmRuleAlias() {
        return alarmRuleAlias;
    }

    public void setAlarmRuleAlias(String alarmRuleAlias) {
        this.alarmRuleAlias = alarmRuleAlias;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
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

    public UpdateKeywordsAlarmRuleResponse withKeywordsRequests(List<KeywordsResBody> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse addKeywordsRequestsItem(KeywordsResBody keywordsRequestsItem) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        this.keywordsRequests.add(keywordsRequestsItem);
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsRequests(
        Consumer<List<KeywordsResBody>> keywordsRequestsSetter) {
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
    public List<KeywordsResBody> getKeywordsRequests() {
        return keywordsRequests;
    }

    public void setKeywordsRequests(List<KeywordsResBody> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
    }

    public UpdateKeywordsAlarmRuleResponse withFrequency(FrequencyRespBody frequency) {
        this.frequency = frequency;
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse withFrequency(Consumer<FrequencyRespBody> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new FrequencyRespBody();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /**
     * Get frequency
     * @return frequency
     */
    public FrequencyRespBody getFrequency() {
        return frequency;
    }

    public void setFrequency(FrequencyRespBody frequency) {
        this.frequency = frequency;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
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

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmSend(Boolean keywordsAlarmSend) {
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

    public UpdateKeywordsAlarmRuleResponse withDomainId(String domainId) {
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

    public UpdateKeywordsAlarmRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间(毫秒时间戳)
     * minimum: 13
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateKeywordsAlarmRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间(毫秒时间戳)
     * minimum: 13
     * maximum: 13
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateKeywordsAlarmRuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateKeywordsAlarmRuleResponse withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * 情况表述
     * @return conditionExpression
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public UpdateKeywordsAlarmRuleResponse withNotificationFrequency(NotificationFrequencyEnum notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
        return this;
    }

    /**
     * 通知频率,单位(分钟)
     * @return notificationFrequency
     */
    public NotificationFrequencyEnum getNotificationFrequency() {
        return notificationFrequency;
    }

    public void setNotificationFrequency(NotificationFrequencyEnum notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
    }

    public UpdateKeywordsAlarmRuleResponse withAlarmActionRuleName(String alarmActionRuleName) {
        this.alarmActionRuleName = alarmActionRuleName;
        return this;
    }

    /**
     * 告警行动规则名称 >alarm_action_rule_name和notification_save_rule可以选填一个，如果都填，优先选择alarm_action_rule_name
     * @return alarmActionRuleName
     */
    public String getAlarmActionRuleName() {
        return alarmActionRuleName;
    }

    public void setAlarmActionRuleName(String alarmActionRuleName) {
        this.alarmActionRuleName = alarmActionRuleName;
    }

    public UpdateKeywordsAlarmRuleResponse withRecoveryPolicy(Integer recoveryPolicy) {
        this.recoveryPolicy = recoveryPolicy;
        return this;
    }

    /**
     * **参数解释：** 告警恢复策略周期次数。 配置的最近统计周期次数内，如果不满足触发条件且开启恢复时通知开关，则会发送恢复告警通知。 **取值范围：** - 最小值为1 - 最大值为10
     * @return recoveryPolicy
     */
    public Integer getRecoveryPolicy() {
        return recoveryPolicy;
    }

    public void setRecoveryPolicy(Integer recoveryPolicy) {
        this.recoveryPolicy = recoveryPolicy;
    }

    public UpdateKeywordsAlarmRuleResponse withTags(List<TagsResBody> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse addTagsItem(TagsResBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse withTags(Consumer<List<TagsResBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 告警标签信息。标签是以键值对（key-value）的形式表示，key和value为一一对应关系。
     * @return tags
     */
    public List<TagsResBody> getTags() {
        return tags;
    }

    public void setTags(List<TagsResBody> tags) {
        this.tags = tags;
    }

    public UpdateKeywordsAlarmRuleResponse withTriggerConditionCount(Integer triggerConditionCount) {
        this.triggerConditionCount = triggerConditionCount;
        return this;
    }

    /**
     * **参数解释：** 告警触发条件：满足条件次数。满足条件次数是指设置的关键词。 在统计周期次数内且满足条件次数时，可触发关键词告警。 **取值范围：** 不涉及。
     * @return triggerConditionCount
     */
    public Integer getTriggerConditionCount() {
        return triggerConditionCount;
    }

    public void setTriggerConditionCount(Integer triggerConditionCount) {
        this.triggerConditionCount = triggerConditionCount;
    }

    public UpdateKeywordsAlarmRuleResponse withTriggerConditionFrequency(Integer triggerConditionFrequency) {
        this.triggerConditionFrequency = triggerConditionFrequency;
        return this;
    }

    /**
     * **参数解释：** 告警触发条件：统计周期次数。统计周期次数指高级设置的统计周期。 当在统计周期次数内且满足条件次数时，可触发关键词告警。 **取值范围：** - 最小值为1 - 最大值为10
     * @return triggerConditionFrequency
     */
    public Integer getTriggerConditionFrequency() {
        return triggerConditionFrequency;
    }

    public void setTriggerConditionFrequency(Integer triggerConditionFrequency) {
        this.triggerConditionFrequency = triggerConditionFrequency;
    }

    public UpdateKeywordsAlarmRuleResponse withWhetherRecoveryPolicy(Boolean whetherRecoveryPolicy) {
        this.whetherRecoveryPolicy = whetherRecoveryPolicy;
        return this;
    }

    /**
     * **参数解释：** 是否配置告警恢复策略。满足该策略时，会发送告警恢复通知。 **取值范围：** true：配置告警恢复策略。 false：不配置告警恢复策略。
     * @return whetherRecoveryPolicy
     */
    public Boolean getWhetherRecoveryPolicy() {
        return whetherRecoveryPolicy;
    }

    public void setWhetherRecoveryPolicy(Boolean whetherRecoveryPolicy) {
        this.whetherRecoveryPolicy = whetherRecoveryPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKeywordsAlarmRuleResponse that = (UpdateKeywordsAlarmRuleResponse) obj;
        return Objects.equals(this.keywordsAlarmRuleId, that.keywordsAlarmRuleId)
            && Objects.equals(this.keywordsAlarmRuleName, that.keywordsAlarmRuleName)
            && Objects.equals(this.alarmRuleAlias, that.alarmRuleAlias)
            && Objects.equals(this.keywordsAlarmRuleDescription, that.keywordsAlarmRuleDescription)
            && Objects.equals(this.keywordsRequests, that.keywordsRequests)
            && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.keywordsAlarmLevel, that.keywordsAlarmLevel)
            && Objects.equals(this.keywordsAlarmSend, that.keywordsAlarmSend)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.notificationFrequency, that.notificationFrequency)
            && Objects.equals(this.alarmActionRuleName, that.alarmActionRuleName)
            && Objects.equals(this.recoveryPolicy, that.recoveryPolicy) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.triggerConditionCount, that.triggerConditionCount)
            && Objects.equals(this.triggerConditionFrequency, that.triggerConditionFrequency)
            && Objects.equals(this.whetherRecoveryPolicy, that.whetherRecoveryPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordsAlarmRuleId,
            keywordsAlarmRuleName,
            alarmRuleAlias,
            keywordsAlarmRuleDescription,
            keywordsRequests,
            frequency,
            keywordsAlarmLevel,
            keywordsAlarmSend,
            domainId,
            createTime,
            updateTime,
            projectId,
            conditionExpression,
            notificationFrequency,
            alarmActionRuleName,
            recoveryPolicy,
            tags,
            triggerConditionCount,
            triggerConditionFrequency,
            whetherRecoveryPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeywordsAlarmRuleResponse {\n");
        sb.append("    keywordsAlarmRuleId: ").append(toIndentedString(keywordsAlarmRuleId)).append("\n");
        sb.append("    keywordsAlarmRuleName: ").append(toIndentedString(keywordsAlarmRuleName)).append("\n");
        sb.append("    alarmRuleAlias: ").append(toIndentedString(alarmRuleAlias)).append("\n");
        sb.append("    keywordsAlarmRuleDescription: ")
            .append(toIndentedString(keywordsAlarmRuleDescription))
            .append("\n");
        sb.append("    keywordsRequests: ").append(toIndentedString(keywordsRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    keywordsAlarmLevel: ").append(toIndentedString(keywordsAlarmLevel)).append("\n");
        sb.append("    keywordsAlarmSend: ").append(toIndentedString(keywordsAlarmSend)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    notificationFrequency: ").append(toIndentedString(notificationFrequency)).append("\n");
        sb.append("    alarmActionRuleName: ").append(toIndentedString(alarmActionRuleName)).append("\n");
        sb.append("    recoveryPolicy: ").append(toIndentedString(recoveryPolicy)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    triggerConditionCount: ").append(toIndentedString(triggerConditionCount)).append("\n");
        sb.append("    triggerConditionFrequency: ").append(toIndentedString(triggerConditionFrequency)).append("\n");
        sb.append("    whetherRecoveryPolicy: ").append(toIndentedString(whetherRecoveryPolicy)).append("\n");
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
