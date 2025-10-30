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
 * SqlAlarmRuleRespList
 */
public class SqlAlarmRuleRespList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_name")

    private String sqlAlarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_css_sql")

    private Boolean isCssSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_id")

    private String sqlAlarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_description")

    private String sqlAlarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_requests")

    private List<SqlRequest> sqlRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private FrequencyRespBody frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")

    private String conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<Topics> topics = null;

    /**
     * 告警级别
     */
    public static final class SqlAlarmLevelEnum {

        /**
         * Enum INFO for value: "Info"
         */
        public static final SqlAlarmLevelEnum INFO = new SqlAlarmLevelEnum("Info");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final SqlAlarmLevelEnum MINOR = new SqlAlarmLevelEnum("Minor");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final SqlAlarmLevelEnum MAJOR = new SqlAlarmLevelEnum("Major");

        /**
         * Enum CRITICAL for value: "Critical"
         */
        public static final SqlAlarmLevelEnum CRITICAL = new SqlAlarmLevelEnum("Critical");

        private static final Map<String, SqlAlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SqlAlarmLevelEnum> createStaticFields() {
            Map<String, SqlAlarmLevelEnum> map = new HashMap<>();
            map.put("Info", INFO);
            map.put("Minor", MINOR);
            map.put("Major", MAJOR);
            map.put("Critical", CRITICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SqlAlarmLevelEnum(String value) {
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
        public static SqlAlarmLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SqlAlarmLevelEnum(value));
        }

        public static SqlAlarmLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SqlAlarmLevelEnum) {
                return this.value.equals(((SqlAlarmLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_level")

    private SqlAlarmLevelEnum sqlAlarmLevel;

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
    @JsonProperty(value = "template_name")

    private String templateName;

    /**
     * 告警状态
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING_ for value: "RUNNING 启用"
         */
        public static final StatusEnum RUNNING_ = new StatusEnum("RUNNING 启用");

        /**
         * Enum STOPPING_ for value: "STOPPING 停止"
         */
        public static final StatusEnum STOPPING_ = new StatusEnum("STOPPING 停止");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RUNNING 启用", RUNNING_);
            map.put("STOPPING 停止", STOPPING_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_condition_count")

    private Integer triggerConditionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_condition_frequency")

    private Integer triggerConditionFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_recovery_policy")

    private Boolean whetherRecoveryPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_policy")

    private Integer recoveryPolicy;

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
    @JsonProperty(value = "tags")

    private List<TagsResBody> tags = null;

    public SqlAlarmRuleRespList withSqlAlarmRuleName(String sqlAlarmRuleName) {
        this.sqlAlarmRuleName = sqlAlarmRuleName;
        return this;
    }

    /**
     * SQL告警名称
     * @return sqlAlarmRuleName
     */
    public String getSqlAlarmRuleName() {
        return sqlAlarmRuleName;
    }

    public void setSqlAlarmRuleName(String sqlAlarmRuleName) {
        this.sqlAlarmRuleName = sqlAlarmRuleName;
    }

    public SqlAlarmRuleRespList withIsCssSql(Boolean isCssSql) {
        this.isCssSql = isCssSql;
        return this;
    }

    /**
     * 是否管道符sql查询
     * @return isCssSql
     */
    public Boolean getIsCssSql() {
        return isCssSql;
    }

    public void setIsCssSql(Boolean isCssSql) {
        this.isCssSql = isCssSql;
    }

    public SqlAlarmRuleRespList withSqlAlarmRuleId(String sqlAlarmRuleId) {
        this.sqlAlarmRuleId = sqlAlarmRuleId;
        return this;
    }

    /**
     * SQL告警规则id
     * @return sqlAlarmRuleId
     */
    public String getSqlAlarmRuleId() {
        return sqlAlarmRuleId;
    }

    public void setSqlAlarmRuleId(String sqlAlarmRuleId) {
        this.sqlAlarmRuleId = sqlAlarmRuleId;
    }

    public SqlAlarmRuleRespList withSqlAlarmRuleDescription(String sqlAlarmRuleDescription) {
        this.sqlAlarmRuleDescription = sqlAlarmRuleDescription;
        return this;
    }

    /**
     * SQL告警信息描述
     * @return sqlAlarmRuleDescription
     */
    public String getSqlAlarmRuleDescription() {
        return sqlAlarmRuleDescription;
    }

    public void setSqlAlarmRuleDescription(String sqlAlarmRuleDescription) {
        this.sqlAlarmRuleDescription = sqlAlarmRuleDescription;
    }

    public SqlAlarmRuleRespList withSqlRequests(List<SqlRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
        return this;
    }

    public SqlAlarmRuleRespList addSqlRequestsItem(SqlRequest sqlRequestsItem) {
        if (this.sqlRequests == null) {
            this.sqlRequests = new ArrayList<>();
        }
        this.sqlRequests.add(sqlRequestsItem);
        return this;
    }

    public SqlAlarmRuleRespList withSqlRequests(Consumer<List<SqlRequest>> sqlRequestsSetter) {
        if (this.sqlRequests == null) {
            this.sqlRequests = new ArrayList<>();
        }
        sqlRequestsSetter.accept(this.sqlRequests);
        return this;
    }

    /**
     * SQL详细信息
     * @return sqlRequests
     */
    public List<SqlRequest> getSqlRequests() {
        return sqlRequests;
    }

    public void setSqlRequests(List<SqlRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
    }

    public SqlAlarmRuleRespList withFrequency(FrequencyRespBody frequency) {
        this.frequency = frequency;
        return this;
    }

    public SqlAlarmRuleRespList withFrequency(Consumer<FrequencyRespBody> frequencySetter) {
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

    public SqlAlarmRuleRespList withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * 条件表达式
     * @return conditionExpression
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public SqlAlarmRuleRespList withTopics(List<Topics> topics) {
        this.topics = topics;
        return this;
    }

    public SqlAlarmRuleRespList addTopicsItem(Topics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public SqlAlarmRuleRespList withTopics(Consumer<List<Topics>> topicsSetter) {
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

    public SqlAlarmRuleRespList withSqlAlarmLevel(SqlAlarmLevelEnum sqlAlarmLevel) {
        this.sqlAlarmLevel = sqlAlarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return sqlAlarmLevel
     */
    public SqlAlarmLevelEnum getSqlAlarmLevel() {
        return sqlAlarmLevel;
    }

    public void setSqlAlarmLevel(SqlAlarmLevelEnum sqlAlarmLevel) {
        this.sqlAlarmLevel = sqlAlarmLevel;
    }

    public SqlAlarmRuleRespList withDomainId(String domainId) {
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

    public SqlAlarmRuleRespList withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（毫秒时间戳）
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

    public SqlAlarmRuleRespList withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（毫秒时间戳）
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

    public SqlAlarmRuleRespList withTemplateName(String templateName) {
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

    public SqlAlarmRuleRespList withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 告警状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SqlAlarmRuleRespList withTriggerConditionCount(Integer triggerConditionCount) {
        this.triggerConditionCount = triggerConditionCount;
        return this;
    }

    /**
     * 触发条件：触发周期;默认为1
     * @return triggerConditionCount
     */
    public Integer getTriggerConditionCount() {
        return triggerConditionCount;
    }

    public void setTriggerConditionCount(Integer triggerConditionCount) {
        this.triggerConditionCount = triggerConditionCount;
    }

    public SqlAlarmRuleRespList withTriggerConditionFrequency(Integer triggerConditionFrequency) {
        this.triggerConditionFrequency = triggerConditionFrequency;
        return this;
    }

    /**
     * 触发条件：触发周期;默认为1
     * @return triggerConditionFrequency
     */
    public Integer getTriggerConditionFrequency() {
        return triggerConditionFrequency;
    }

    public void setTriggerConditionFrequency(Integer triggerConditionFrequency) {
        this.triggerConditionFrequency = triggerConditionFrequency;
    }

    public SqlAlarmRuleRespList withWhetherRecoveryPolicy(Boolean whetherRecoveryPolicy) {
        this.whetherRecoveryPolicy = whetherRecoveryPolicy;
        return this;
    }

    /**
     * 是否打开恢复通知;默认false
     * @return whetherRecoveryPolicy
     */
    public Boolean getWhetherRecoveryPolicy() {
        return whetherRecoveryPolicy;
    }

    public void setWhetherRecoveryPolicy(Boolean whetherRecoveryPolicy) {
        this.whetherRecoveryPolicy = whetherRecoveryPolicy;
    }

    public SqlAlarmRuleRespList withRecoveryPolicy(Integer recoveryPolicy) {
        this.recoveryPolicy = recoveryPolicy;
        return this;
    }

    /**
     * 恢复策略周期;默认为3
     * @return recoveryPolicy
     */
    public Integer getRecoveryPolicy() {
        return recoveryPolicy;
    }

    public void setRecoveryPolicy(Integer recoveryPolicy) {
        this.recoveryPolicy = recoveryPolicy;
    }

    public SqlAlarmRuleRespList withNotificationFrequency(NotificationFrequencyEnum notificationFrequency) {
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

    public SqlAlarmRuleRespList withAlarmActionRuleName(String alarmActionRuleName) {
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

    public SqlAlarmRuleRespList withTags(List<TagsResBody> tags) {
        this.tags = tags;
        return this;
    }

    public SqlAlarmRuleRespList addTagsItem(TagsResBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SqlAlarmRuleRespList withTags(Consumer<List<TagsResBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 告警标签信息。
     * @return tags
     */
    public List<TagsResBody> getTags() {
        return tags;
    }

    public void setTags(List<TagsResBody> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlAlarmRuleRespList that = (SqlAlarmRuleRespList) obj;
        return Objects.equals(this.sqlAlarmRuleName, that.sqlAlarmRuleName)
            && Objects.equals(this.isCssSql, that.isCssSql) && Objects.equals(this.sqlAlarmRuleId, that.sqlAlarmRuleId)
            && Objects.equals(this.sqlAlarmRuleDescription, that.sqlAlarmRuleDescription)
            && Objects.equals(this.sqlRequests, that.sqlRequests) && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.topics, that.topics) && Objects.equals(this.sqlAlarmLevel, that.sqlAlarmLevel)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.triggerConditionCount, that.triggerConditionCount)
            && Objects.equals(this.triggerConditionFrequency, that.triggerConditionFrequency)
            && Objects.equals(this.whetherRecoveryPolicy, that.whetherRecoveryPolicy)
            && Objects.equals(this.recoveryPolicy, that.recoveryPolicy)
            && Objects.equals(this.notificationFrequency, that.notificationFrequency)
            && Objects.equals(this.alarmActionRuleName, that.alarmActionRuleName)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlAlarmRuleName,
            isCssSql,
            sqlAlarmRuleId,
            sqlAlarmRuleDescription,
            sqlRequests,
            frequency,
            conditionExpression,
            topics,
            sqlAlarmLevel,
            domainId,
            createTime,
            updateTime,
            templateName,
            status,
            triggerConditionCount,
            triggerConditionFrequency,
            whetherRecoveryPolicy,
            recoveryPolicy,
            notificationFrequency,
            alarmActionRuleName,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlAlarmRuleRespList {\n");
        sb.append("    sqlAlarmRuleName: ").append(toIndentedString(sqlAlarmRuleName)).append("\n");
        sb.append("    isCssSql: ").append(toIndentedString(isCssSql)).append("\n");
        sb.append("    sqlAlarmRuleId: ").append(toIndentedString(sqlAlarmRuleId)).append("\n");
        sb.append("    sqlAlarmRuleDescription: ").append(toIndentedString(sqlAlarmRuleDescription)).append("\n");
        sb.append("    sqlRequests: ").append(toIndentedString(sqlRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    sqlAlarmLevel: ").append(toIndentedString(sqlAlarmLevel)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerConditionCount: ").append(toIndentedString(triggerConditionCount)).append("\n");
        sb.append("    triggerConditionFrequency: ").append(toIndentedString(triggerConditionFrequency)).append("\n");
        sb.append("    whetherRecoveryPolicy: ").append(toIndentedString(whetherRecoveryPolicy)).append("\n");
        sb.append("    recoveryPolicy: ").append(toIndentedString(recoveryPolicy)).append("\n");
        sb.append("    notificationFrequency: ").append(toIndentedString(notificationFrequency)).append("\n");
        sb.append("    alarmActionRuleName: ").append(toIndentedString(alarmActionRuleName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
