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

/** SqlAlarmRuleRespList */
public class SqlAlarmRuleRespList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_name")

    private String sqlAlarmRuleName;

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

    private Frequency frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")

    private String conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<Topics> topics = null;

    /** 告警级别 */
    public static final class SqlAlarmLevelEnum {

        /** Enum INFO for value: "Info" */
        public static final SqlAlarmLevelEnum INFO = new SqlAlarmLevelEnum("Info");

        /** Enum MINOR for value: "Minor" */
        public static final SqlAlarmLevelEnum MINOR = new SqlAlarmLevelEnum("Minor");

        /** Enum MAJOR for value: "Major" */
        public static final SqlAlarmLevelEnum MAJOR = new SqlAlarmLevelEnum("Major");

        /** Enum CRITICAL for value: "Critical" */
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
            SqlAlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SqlAlarmLevelEnum(value);
            }
            return result;
        }

        public static SqlAlarmLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SqlAlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "sql_alarm_send")

    private Boolean sqlAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    /** 邮件附加信息是否英文 */
    public static final class LanguageEnum {

        /** Enum ZH_CN for value: "zh-cn" */
        public static final LanguageEnum ZH_CN = new LanguageEnum("zh-cn");

        /** Enum EN_US for value: "en-us" */
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
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LanguageEnum(value);
            }
            return result;
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public SqlAlarmRuleRespList withSqlAlarmRuleName(String sqlAlarmRuleName) {
        this.sqlAlarmRuleName = sqlAlarmRuleName;
        return this;
    }

    /** SQL告警名称
     * 
     * @return sqlAlarmRuleName */
    public String getSqlAlarmRuleName() {
        return sqlAlarmRuleName;
    }

    public void setSqlAlarmRuleName(String sqlAlarmRuleName) {
        this.sqlAlarmRuleName = sqlAlarmRuleName;
    }

    public SqlAlarmRuleRespList withSqlAlarmRuleId(String sqlAlarmRuleId) {
        this.sqlAlarmRuleId = sqlAlarmRuleId;
        return this;
    }

    /** SQL告警规则id
     * 
     * @return sqlAlarmRuleId */
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

    /** SQL告警信息描述
     * 
     * @return sqlAlarmRuleDescription */
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

    /** SQL详细信息
     * 
     * @return sqlRequests */
    public List<SqlRequest> getSqlRequests() {
        return sqlRequests;
    }

    public void setSqlRequests(List<SqlRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
    }

    public SqlAlarmRuleRespList withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public SqlAlarmRuleRespList withFrequency(Consumer<Frequency> frequencySetter) {
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

    public SqlAlarmRuleRespList withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /** 条件表达式
     * 
     * @return conditionExpression */
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

    /** 主题信息
     * 
     * @return topics */
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

    /** 告警级别
     * 
     * @return sqlAlarmLevel */
    public SqlAlarmLevelEnum getSqlAlarmLevel() {
        return sqlAlarmLevel;
    }

    public void setSqlAlarmLevel(SqlAlarmLevelEnum sqlAlarmLevel) {
        this.sqlAlarmLevel = sqlAlarmLevel;
    }

    public SqlAlarmRuleRespList withSqlAlarmSend(Boolean sqlAlarmSend) {
        this.sqlAlarmSend = sqlAlarmSend;
        return this;
    }

    /** 是否发送
     * 
     * @return sqlAlarmSend */
    public Boolean getSqlAlarmSend() {
        return sqlAlarmSend;
    }

    public void setSqlAlarmSend(Boolean sqlAlarmSend) {
        this.sqlAlarmSend = sqlAlarmSend;
    }

    public SqlAlarmRuleRespList withDomainId(String domainId) {
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

    public SqlAlarmRuleRespList withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间(毫秒时间戳) minimum: 13 maximum: 13
     * 
     * @return createTime */
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

    /** 更新时间(毫秒时间戳) minimum: 13 maximum: 13
     * 
     * @return updateTime */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public SqlAlarmRuleRespList withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /** 邮件附加信息是否英文
     * 
     * @return language */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlAlarmRuleRespList sqlAlarmRuleRespList = (SqlAlarmRuleRespList) o;
        return Objects.equals(this.sqlAlarmRuleName, sqlAlarmRuleRespList.sqlAlarmRuleName)
            && Objects.equals(this.sqlAlarmRuleId, sqlAlarmRuleRespList.sqlAlarmRuleId)
            && Objects.equals(this.sqlAlarmRuleDescription, sqlAlarmRuleRespList.sqlAlarmRuleDescription)
            && Objects.equals(this.sqlRequests, sqlAlarmRuleRespList.sqlRequests)
            && Objects.equals(this.frequency, sqlAlarmRuleRespList.frequency)
            && Objects.equals(this.conditionExpression, sqlAlarmRuleRespList.conditionExpression)
            && Objects.equals(this.topics, sqlAlarmRuleRespList.topics)
            && Objects.equals(this.sqlAlarmLevel, sqlAlarmRuleRespList.sqlAlarmLevel)
            && Objects.equals(this.sqlAlarmSend, sqlAlarmRuleRespList.sqlAlarmSend)
            && Objects.equals(this.domainId, sqlAlarmRuleRespList.domainId)
            && Objects.equals(this.createTime, sqlAlarmRuleRespList.createTime)
            && Objects.equals(this.updateTime, sqlAlarmRuleRespList.updateTime)
            && Objects.equals(this.language, sqlAlarmRuleRespList.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlAlarmRuleName,
            sqlAlarmRuleId,
            sqlAlarmRuleDescription,
            sqlRequests,
            frequency,
            conditionExpression,
            topics,
            sqlAlarmLevel,
            sqlAlarmSend,
            domainId,
            createTime,
            updateTime,
            language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlAlarmRuleRespList {\n");
        sb.append("    sqlAlarmRuleName: ").append(toIndentedString(sqlAlarmRuleName)).append("\n");
        sb.append("    sqlAlarmRuleId: ").append(toIndentedString(sqlAlarmRuleId)).append("\n");
        sb.append("    sqlAlarmRuleDescription: ").append(toIndentedString(sqlAlarmRuleDescription)).append("\n");
        sb.append("    sqlRequests: ").append(toIndentedString(sqlRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    sqlAlarmLevel: ").append(toIndentedString(sqlAlarmLevel)).append("\n");
        sb.append("    sqlAlarmSend: ").append(toIndentedString(sqlAlarmSend)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
