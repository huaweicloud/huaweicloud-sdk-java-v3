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

/** UpdateSqlAlarmRuleRequestBody */
public class UpdateSqlAlarmRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_id")

    private String sqlAlarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_name")

    private String sqlAlarmRuleName;

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

    /** 发送主题 0:不变 1:新增 2:修改 3:删除 */
    public static final class SqlAlarmSendCodeEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final SqlAlarmSendCodeEnum NUMBER_0 = new SqlAlarmSendCodeEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final SqlAlarmSendCodeEnum NUMBER_1 = new SqlAlarmSendCodeEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final SqlAlarmSendCodeEnum NUMBER_2 = new SqlAlarmSendCodeEnum(2);

        /** Enum NUMBER_3 for value: 3 */
        public static final SqlAlarmSendCodeEnum NUMBER_3 = new SqlAlarmSendCodeEnum(3);

        private static final Map<Integer, SqlAlarmSendCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, SqlAlarmSendCodeEnum> createStaticFields() {
            Map<Integer, SqlAlarmSendCodeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        SqlAlarmSendCodeEnum(Integer value) {
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
        public static SqlAlarmSendCodeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            SqlAlarmSendCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SqlAlarmSendCodeEnum(value);
            }
            return result;
        }

        public static SqlAlarmSendCodeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            SqlAlarmSendCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SqlAlarmSendCodeEnum) {
                return this.value.equals(((SqlAlarmSendCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_send_code")

    private SqlAlarmSendCodeEnum sqlAlarmSendCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_save_rule")

    private NotificationSaveRule notificationSaveRule;

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

    public UpdateSqlAlarmRuleRequestBody withSqlAlarmRuleId(String sqlAlarmRuleId) {
        this.sqlAlarmRuleId = sqlAlarmRuleId;
        return this;
    }

    /** SQL告警id
     * 
     * @return sqlAlarmRuleId */
    public String getSqlAlarmRuleId() {
        return sqlAlarmRuleId;
    }

    public void setSqlAlarmRuleId(String sqlAlarmRuleId) {
        this.sqlAlarmRuleId = sqlAlarmRuleId;
    }

    public UpdateSqlAlarmRuleRequestBody withSqlAlarmRuleName(String sqlAlarmRuleName) {
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

    public UpdateSqlAlarmRuleRequestBody withSqlAlarmRuleDescription(String sqlAlarmRuleDescription) {
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

    public UpdateSqlAlarmRuleRequestBody withSqlRequests(List<SqlRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
        return this;
    }

    public UpdateSqlAlarmRuleRequestBody addSqlRequestsItem(SqlRequest sqlRequestsItem) {
        if (this.sqlRequests == null) {
            this.sqlRequests = new ArrayList<>();
        }
        this.sqlRequests.add(sqlRequestsItem);
        return this;
    }

    public UpdateSqlAlarmRuleRequestBody withSqlRequests(Consumer<List<SqlRequest>> sqlRequestsSetter) {
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

    public UpdateSqlAlarmRuleRequestBody withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public UpdateSqlAlarmRuleRequestBody withFrequency(Consumer<Frequency> frequencySetter) {
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

    public UpdateSqlAlarmRuleRequestBody withConditionExpression(String conditionExpression) {
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

    public UpdateSqlAlarmRuleRequestBody withSqlAlarmLevel(SqlAlarmLevelEnum sqlAlarmLevel) {
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

    public UpdateSqlAlarmRuleRequestBody withSqlAlarmSend(Boolean sqlAlarmSend) {
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

    public UpdateSqlAlarmRuleRequestBody withSqlAlarmSendCode(SqlAlarmSendCodeEnum sqlAlarmSendCode) {
        this.sqlAlarmSendCode = sqlAlarmSendCode;
        return this;
    }

    /** 发送主题 0:不变 1:新增 2:修改 3:删除 minimum: 0 maximum: 3
     * 
     * @return sqlAlarmSendCode */
    public SqlAlarmSendCodeEnum getSqlAlarmSendCode() {
        return sqlAlarmSendCode;
    }

    public void setSqlAlarmSendCode(SqlAlarmSendCodeEnum sqlAlarmSendCode) {
        this.sqlAlarmSendCode = sqlAlarmSendCode;
    }

    public UpdateSqlAlarmRuleRequestBody withDomainId(String domainId) {
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

    public UpdateSqlAlarmRuleRequestBody withNotificationSaveRule(NotificationSaveRule notificationSaveRule) {
        this.notificationSaveRule = notificationSaveRule;
        return this;
    }

    public UpdateSqlAlarmRuleRequestBody withNotificationSaveRule(
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

    public UpdateSqlAlarmRuleRequestBody withLanguage(LanguageEnum language) {
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
        UpdateSqlAlarmRuleRequestBody updateSqlAlarmRuleRequestBody = (UpdateSqlAlarmRuleRequestBody) o;
        return Objects.equals(this.sqlAlarmRuleId, updateSqlAlarmRuleRequestBody.sqlAlarmRuleId)
            && Objects.equals(this.sqlAlarmRuleName, updateSqlAlarmRuleRequestBody.sqlAlarmRuleName)
            && Objects.equals(this.sqlAlarmRuleDescription, updateSqlAlarmRuleRequestBody.sqlAlarmRuleDescription)
            && Objects.equals(this.sqlRequests, updateSqlAlarmRuleRequestBody.sqlRequests)
            && Objects.equals(this.frequency, updateSqlAlarmRuleRequestBody.frequency)
            && Objects.equals(this.conditionExpression, updateSqlAlarmRuleRequestBody.conditionExpression)
            && Objects.equals(this.sqlAlarmLevel, updateSqlAlarmRuleRequestBody.sqlAlarmLevel)
            && Objects.equals(this.sqlAlarmSend, updateSqlAlarmRuleRequestBody.sqlAlarmSend)
            && Objects.equals(this.sqlAlarmSendCode, updateSqlAlarmRuleRequestBody.sqlAlarmSendCode)
            && Objects.equals(this.domainId, updateSqlAlarmRuleRequestBody.domainId)
            && Objects.equals(this.notificationSaveRule, updateSqlAlarmRuleRequestBody.notificationSaveRule)
            && Objects.equals(this.language, updateSqlAlarmRuleRequestBody.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlAlarmRuleId,
            sqlAlarmRuleName,
            sqlAlarmRuleDescription,
            sqlRequests,
            frequency,
            conditionExpression,
            sqlAlarmLevel,
            sqlAlarmSend,
            sqlAlarmSendCode,
            domainId,
            notificationSaveRule,
            language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSqlAlarmRuleRequestBody {\n");
        sb.append("    sqlAlarmRuleId: ").append(toIndentedString(sqlAlarmRuleId)).append("\n");
        sb.append("    sqlAlarmRuleName: ").append(toIndentedString(sqlAlarmRuleName)).append("\n");
        sb.append("    sqlAlarmRuleDescription: ").append(toIndentedString(sqlAlarmRuleDescription)).append("\n");
        sb.append("    sqlRequests: ").append(toIndentedString(sqlRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    sqlAlarmLevel: ").append(toIndentedString(sqlAlarmLevel)).append("\n");
        sb.append("    sqlAlarmSend: ").append(toIndentedString(sqlAlarmSend)).append("\n");
        sb.append("    sqlAlarmSendCode: ").append(toIndentedString(sqlAlarmSendCode)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    notificationSaveRule: ").append(toIndentedString(notificationSaveRule)).append("\n");
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
