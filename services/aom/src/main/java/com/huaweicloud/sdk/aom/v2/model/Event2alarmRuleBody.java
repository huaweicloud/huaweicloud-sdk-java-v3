package com.huaweicloud.sdk.aom.v2.model;

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
 * 事件类告警实体
 */
public class Event2alarmRuleBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Integer updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_provider")

    private String resourceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Event2alarmRuleBodyMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_policies")

    private List<Event2alarmRuleBodyTriggerPolicies> triggerPolicies = null;

    /**
     * 告警类型。notification：直接告警。denoising：告警降噪。
     */
    public static final class AlarmTypeEnum {

        /**
         * Enum NOTIFICATION for value: "notification"
         */
        public static final AlarmTypeEnum NOTIFICATION = new AlarmTypeEnum("notification");

        /**
         * Enum DENOISING for value: "denoising"
         */
        public static final AlarmTypeEnum DENOISING = new AlarmTypeEnum("denoising");

        private static final Map<String, AlarmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmTypeEnum> createStaticFields() {
            Map<String, AlarmTypeEnum> map = new HashMap<>();
            map.put("notification", NOTIFICATION);
            map.put("denoising", DENOISING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmTypeEnum(String value) {
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
        public static AlarmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmTypeEnum(value));
        }

        public static AlarmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmTypeEnum) {
                return this.value.equals(((AlarmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private AlarmTypeEnum alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_rule")

    private String actionRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inhibit_rule")

    private String inhibitRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_group_rule")

    private String routeGroupRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_names")

    private List<String> eventNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrated")

    private Boolean migrated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<SmnTopics> topics = null;

    public Event2alarmRuleBody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户项目id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Event2alarmRuleBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称。规则名称包含大小写字母，数字，特殊字符（_-）和汉字组成，不能以特殊字符开头或结尾，最大长度为100。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event2alarmRuleBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述。描述包含大小写字母，数字，特殊字符（_-<>=,.）和汉字组成，不能以下划线、中划线开头结尾，最大长度为1024。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event2alarmRuleBody withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Event2alarmRuleBody withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Event2alarmRuleBody withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * 事件源
     * @return resourceProvider
     */
    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public Event2alarmRuleBody withMetadata(Event2alarmRuleBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Event2alarmRuleBody withMetadata(Consumer<Event2alarmRuleBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Event2alarmRuleBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Event2alarmRuleBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Event2alarmRuleBodyMetadata metadata) {
        this.metadata = metadata;
    }

    public Event2alarmRuleBody withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 规则是否启用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Event2alarmRuleBody withTriggerPolicies(List<Event2alarmRuleBodyTriggerPolicies> triggerPolicies) {
        this.triggerPolicies = triggerPolicies;
        return this;
    }

    public Event2alarmRuleBody addTriggerPoliciesItem(Event2alarmRuleBodyTriggerPolicies triggerPoliciesItem) {
        if (this.triggerPolicies == null) {
            this.triggerPolicies = new ArrayList<>();
        }
        this.triggerPolicies.add(triggerPoliciesItem);
        return this;
    }

    public Event2alarmRuleBody withTriggerPolicies(
        Consumer<List<Event2alarmRuleBodyTriggerPolicies>> triggerPoliciesSetter) {
        if (this.triggerPolicies == null) {
            this.triggerPolicies = new ArrayList<>();
        }
        triggerPoliciesSetter.accept(this.triggerPolicies);
        return this;
    }

    /**
     * 触发策略
     * @return triggerPolicies
     */
    public List<Event2alarmRuleBodyTriggerPolicies> getTriggerPolicies() {
        return triggerPolicies;
    }

    public void setTriggerPolicies(List<Event2alarmRuleBodyTriggerPolicies> triggerPolicies) {
        this.triggerPolicies = triggerPolicies;
    }

    public Event2alarmRuleBody withAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * 告警类型。notification：直接告警。denoising：告警降噪。
     * @return alarmType
     */
    public AlarmTypeEnum getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
    }

    public Event2alarmRuleBody withActionRule(String actionRule) {
        this.actionRule = actionRule;
        return this;
    }

    /**
     * 告警行动规则
     * @return actionRule
     */
    public String getActionRule() {
        return actionRule;
    }

    public void setActionRule(String actionRule) {
        this.actionRule = actionRule;
    }

    public Event2alarmRuleBody withInhibitRule(String inhibitRule) {
        this.inhibitRule = inhibitRule;
        return this;
    }

    /**
     * 告警抑制规则
     * @return inhibitRule
     */
    public String getInhibitRule() {
        return inhibitRule;
    }

    public void setInhibitRule(String inhibitRule) {
        this.inhibitRule = inhibitRule;
    }

    public Event2alarmRuleBody withRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
        return this;
    }

    /**
     * 告警分组规则
     * @return routeGroupRule
     */
    public String getRouteGroupRule() {
        return routeGroupRule;
    }

    public void setRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
    }

    public Event2alarmRuleBody withEventNames(List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    public Event2alarmRuleBody addEventNamesItem(String eventNamesItem) {
        if (this.eventNames == null) {
            this.eventNames = new ArrayList<>();
        }
        this.eventNames.add(eventNamesItem);
        return this;
    }

    public Event2alarmRuleBody withEventNames(Consumer<List<String>> eventNamesSetter) {
        if (this.eventNames == null) {
            this.eventNames = new ArrayList<>();
        }
        eventNamesSetter.accept(this.eventNames);
        return this;
    }

    /**
     * 事件名称
     * @return eventNames
     */
    public List<String> getEventNames() {
        return eventNames;
    }

    public void setEventNames(List<String> eventNames) {
        this.eventNames = eventNames;
    }

    public Event2alarmRuleBody withMigrated(Boolean migrated) {
        this.migrated = migrated;
        return this;
    }

    /**
     * 是否迁移到2.0
     * @return migrated
     */
    public Boolean getMigrated() {
        return migrated;
    }

    public void setMigrated(Boolean migrated) {
        this.migrated = migrated;
    }

    public Event2alarmRuleBody withTopics(List<SmnTopics> topics) {
        this.topics = topics;
        return this;
    }

    public Event2alarmRuleBody addTopicsItem(SmnTopics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public Event2alarmRuleBody withTopics(Consumer<List<SmnTopics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * smn信息
     * @return topics
     */
    public List<SmnTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<SmnTopics> topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event2alarmRuleBody that = (Event2alarmRuleBody) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.resourceProvider, that.resourceProvider)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.triggerPolicies, that.triggerPolicies)
            && Objects.equals(this.alarmType, that.alarmType) && Objects.equals(this.actionRule, that.actionRule)
            && Objects.equals(this.inhibitRule, that.inhibitRule)
            && Objects.equals(this.routeGroupRule, that.routeGroupRule)
            && Objects.equals(this.eventNames, that.eventNames) && Objects.equals(this.migrated, that.migrated)
            && Objects.equals(this.topics, that.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId,
            name,
            description,
            createTime,
            updateTime,
            resourceProvider,
            metadata,
            enable,
            triggerPolicies,
            alarmType,
            actionRule,
            inhibitRule,
            routeGroupRule,
            eventNames,
            migrated,
            topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event2alarmRuleBody {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    resourceProvider: ").append(toIndentedString(resourceProvider)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    triggerPolicies: ").append(toIndentedString(triggerPolicies)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    actionRule: ").append(toIndentedString(actionRule)).append("\n");
        sb.append("    inhibitRule: ").append(toIndentedString(inhibitRule)).append("\n");
        sb.append("    routeGroupRule: ").append(toIndentedString(routeGroupRule)).append("\n");
        sb.append("    eventNames: ").append(toIndentedString(eventNames)).append("\n");
        sb.append("    migrated: ").append(toIndentedString(migrated)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
