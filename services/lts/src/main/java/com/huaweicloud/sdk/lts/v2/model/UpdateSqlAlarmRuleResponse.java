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

/** Response Object */
public class UpdateSqlAlarmRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexId")

    private String indexId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

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

    /** 告警级别 */
    public static final class SqlAlarmLevelEnum {

        /** Enum INFO for value: "Info" */
        public static final SqlAlarmLevelEnum INFO = new SqlAlarmLevelEnum("Info");

        /** Enum MINOR for value: "Minor" */
        public static final SqlAlarmLevelEnum MINOR = new SqlAlarmLevelEnum("Minor");

        /** Enum MAJOR for value: "Major" */
        public static final SqlAlarmLevelEnum MAJOR = new SqlAlarmLevelEnum("Major");

        /** Enum CRITICAL for value: "CRITICAL" */
        public static final SqlAlarmLevelEnum CRITICAL = new SqlAlarmLevelEnum("CRITICAL");

        private static final Map<String, SqlAlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SqlAlarmLevelEnum> createStaticFields() {
            Map<String, SqlAlarmLevelEnum> map = new HashMap<>();
            map.put("Info", INFO);
            map.put("Minor", MINOR);
            map.put("Major", MAJOR);
            map.put("CRITICAL", CRITICAL);
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

    private Object createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Object updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<Topics> topics = null;

    public UpdateSqlAlarmRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 测试
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateSqlAlarmRuleResponse withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /** 测试
     * 
     * @return indexId */
    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    public UpdateSqlAlarmRuleResponse withKey(String key) {
        this.key = key;
        return this;
    }

    /** 测试
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UpdateSqlAlarmRuleResponse withLanguage(String language) {
        this.language = language;
        return this;
    }

    /** 测试
     * 
     * @return language */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public UpdateSqlAlarmRuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 测试
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateSqlAlarmRuleResponse withSqlAlarmRuleName(String sqlAlarmRuleName) {
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

    public UpdateSqlAlarmRuleResponse withSqlAlarmRuleId(String sqlAlarmRuleId) {
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

    public UpdateSqlAlarmRuleResponse withSqlAlarmRuleDescription(String sqlAlarmRuleDescription) {
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

    public UpdateSqlAlarmRuleResponse withSqlRequests(List<SqlRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
        return this;
    }

    public UpdateSqlAlarmRuleResponse addSqlRequestsItem(SqlRequest sqlRequestsItem) {
        if (this.sqlRequests == null) {
            this.sqlRequests = new ArrayList<>();
        }
        this.sqlRequests.add(sqlRequestsItem);
        return this;
    }

    public UpdateSqlAlarmRuleResponse withSqlRequests(Consumer<List<SqlRequest>> sqlRequestsSetter) {
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

    public UpdateSqlAlarmRuleResponse withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public UpdateSqlAlarmRuleResponse withFrequency(Consumer<Frequency> frequencySetter) {
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

    public UpdateSqlAlarmRuleResponse withConditionExpression(String conditionExpression) {
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

    public UpdateSqlAlarmRuleResponse withSqlAlarmLevel(SqlAlarmLevelEnum sqlAlarmLevel) {
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

    public UpdateSqlAlarmRuleResponse withSqlAlarmSend(Boolean sqlAlarmSend) {
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

    public UpdateSqlAlarmRuleResponse withDomainId(String domainId) {
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

    public UpdateSqlAlarmRuleResponse withCreateTime(Object createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间(毫秒时间戳)
     * 
     * @return createTime */
    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public UpdateSqlAlarmRuleResponse withUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 更新时间(毫秒时间戳)
     * 
     * @return updateTime */
    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateSqlAlarmRuleResponse withTopics(List<Topics> topics) {
        this.topics = topics;
        return this;
    }

    public UpdateSqlAlarmRuleResponse addTopicsItem(Topics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public UpdateSqlAlarmRuleResponse withTopics(Consumer<List<Topics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /** 主题
     * 
     * @return topics */
    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSqlAlarmRuleResponse updateSqlAlarmRuleResponse = (UpdateSqlAlarmRuleResponse) o;
        return Objects.equals(this.id, updateSqlAlarmRuleResponse.id)
            && Objects.equals(this.indexId, updateSqlAlarmRuleResponse.indexId)
            && Objects.equals(this.key, updateSqlAlarmRuleResponse.key)
            && Objects.equals(this.language, updateSqlAlarmRuleResponse.language)
            && Objects.equals(this.projectId, updateSqlAlarmRuleResponse.projectId)
            && Objects.equals(this.sqlAlarmRuleName, updateSqlAlarmRuleResponse.sqlAlarmRuleName)
            && Objects.equals(this.sqlAlarmRuleId, updateSqlAlarmRuleResponse.sqlAlarmRuleId)
            && Objects.equals(this.sqlAlarmRuleDescription, updateSqlAlarmRuleResponse.sqlAlarmRuleDescription)
            && Objects.equals(this.sqlRequests, updateSqlAlarmRuleResponse.sqlRequests)
            && Objects.equals(this.frequency, updateSqlAlarmRuleResponse.frequency)
            && Objects.equals(this.conditionExpression, updateSqlAlarmRuleResponse.conditionExpression)
            && Objects.equals(this.sqlAlarmLevel, updateSqlAlarmRuleResponse.sqlAlarmLevel)
            && Objects.equals(this.sqlAlarmSend, updateSqlAlarmRuleResponse.sqlAlarmSend)
            && Objects.equals(this.domainId, updateSqlAlarmRuleResponse.domainId)
            && Objects.equals(this.createTime, updateSqlAlarmRuleResponse.createTime)
            && Objects.equals(this.updateTime, updateSqlAlarmRuleResponse.updateTime)
            && Objects.equals(this.topics, updateSqlAlarmRuleResponse.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            indexId,
            key,
            language,
            projectId,
            sqlAlarmRuleName,
            sqlAlarmRuleId,
            sqlAlarmRuleDescription,
            sqlRequests,
            frequency,
            conditionExpression,
            sqlAlarmLevel,
            sqlAlarmSend,
            domainId,
            createTime,
            updateTime,
            topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSqlAlarmRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    sqlAlarmRuleName: ").append(toIndentedString(sqlAlarmRuleName)).append("\n");
        sb.append("    sqlAlarmRuleId: ").append(toIndentedString(sqlAlarmRuleId)).append("\n");
        sb.append("    sqlAlarmRuleDescription: ").append(toIndentedString(sqlAlarmRuleDescription)).append("\n");
        sb.append("    sqlRequests: ").append(toIndentedString(sqlRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    sqlAlarmLevel: ").append(toIndentedString(sqlAlarmLevel)).append("\n");
        sb.append("    sqlAlarmSend: ").append(toIndentedString(sqlAlarmSend)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
