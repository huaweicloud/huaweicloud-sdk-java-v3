package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ShowAlertRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    /**
     * query_type. SQL, CBSL.
     */
    public static final class QueryTypeEnum {

        /**
         * Enum SQL for value: "SQL"
         */
        public static final QueryTypeEnum SQL = new QueryTypeEnum("SQL");

        /**
         * Enum CBSL for value: "CBSL"
         */
        public static final QueryTypeEnum CBSL = new QueryTypeEnum("CBSL");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("SQL", SQL);
            map.put("CBSL", CBSL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryTypeEnum(String value) {
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
        public static QueryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QueryTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QueryTypeEnum(value);
            }
            return result;
        }

        public static QueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QueryTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryTypeEnum) {
                return this.value.equals(((QueryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryTypeEnum queryType;

    /**
     * status. ENABLED, DISABLED
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final StatusEnum DISABLED = new StatusEnum("DISABLED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /**
     * severity. TIPS, LOW, MEDIUM, HIGH, FATAL
     */
    public static final class SeverityEnum {

        /**
         * Enum TIPS for value: "TIPS"
         */
        public static final SeverityEnum TIPS = new SeverityEnum("TIPS");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final SeverityEnum LOW = new SeverityEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final SeverityEnum MEDIUM = new SeverityEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final SeverityEnum HIGH = new SeverityEnum("HIGH");

        /**
         * Enum FATAL for value: "FATAL"
         */
        public static final SeverityEnum FATAL = new SeverityEnum("FATAL");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("TIPS", TIPS);
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            map.put("FATAL", FATAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SeverityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SeverityEnum(value);
            }
            return result;
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SeverityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accumulated_times")

    private Integer accumulatedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_properties")

    private Map<String, String> customProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_grouping")

    private Boolean eventGrouping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private Schedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<AlertRuleTrigger> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowAlertRuleResponse withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * rule_id
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ShowAlertRuleResponse withPipeId(String pipeId) {
        this.pipeId = pipeId;
        return this;
    }

    /**
     * pipe_id
     * @return pipeId
     */
    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public ShowAlertRuleResponse withPipeName(String pipeName) {
        this.pipeName = pipeName;
        return this;
    }

    /**
     * pipe_name
     * @return pipeName
     */
    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public ShowAlertRuleResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * create_by
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ShowAlertRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * create_time
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowAlertRuleResponse withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * update_by
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public ShowAlertRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * update_time
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowAlertRuleResponse withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * delete_time
     * minimum: 0
     * maximum: 9223372036854775807
     * @return deleteTime
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public ShowAlertRuleResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * rule_name
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ShowAlertRuleResponse withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * query
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ShowAlertRuleResponse withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * query_type. SQL, CBSL.
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public ShowAlertRuleResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * status. ENABLED, DISABLED
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowAlertRuleResponse withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * severity. TIPS, LOW, MEDIUM, HIGH, FATAL
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public ShowAlertRuleResponse withAccumulatedTimes(Integer accumulatedTimes) {
        this.accumulatedTimes = accumulatedTimes;
        return this;
    }

    /**
     * accumulated_times
     * minimum: 1
     * maximum: 1000
     * @return accumulatedTimes
     */
    public Integer getAccumulatedTimes() {
        return accumulatedTimes;
    }

    public void setAccumulatedTimes(Integer accumulatedTimes) {
        this.accumulatedTimes = accumulatedTimes;
    }

    public ShowAlertRuleResponse withCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    public ShowAlertRuleResponse putCustomPropertiesItem(String key, String customPropertiesItem) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        this.customProperties.put(key, customPropertiesItem);
        return this;
    }

    public ShowAlertRuleResponse withCustomProperties(Consumer<Map<String, String>> customPropertiesSetter) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        customPropertiesSetter.accept(this.customProperties);
        return this;
    }

    /**
     * custom_properties
     * @return customProperties
     */
    public Map<String, String> getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
    }

    public ShowAlertRuleResponse withEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
        return this;
    }

    /**
     * event_grouping
     * @return eventGrouping
     */
    public Boolean getEventGrouping() {
        return eventGrouping;
    }

    public void setEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
    }

    public ShowAlertRuleResponse withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public ShowAlertRuleResponse withSchedule(Consumer<Schedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new Schedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ShowAlertRuleResponse withTriggers(List<AlertRuleTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ShowAlertRuleResponse addTriggersItem(AlertRuleTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ShowAlertRuleResponse withTriggers(Consumer<List<AlertRuleTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * triggers
     * @return triggers
     */
    public List<AlertRuleTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<AlertRuleTrigger> triggers) {
        this.triggers = triggers;
    }

    public ShowAlertRuleResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAlertRuleResponse showAlertRuleResponse = (ShowAlertRuleResponse) o;
        return Objects.equals(this.ruleId, showAlertRuleResponse.ruleId)
            && Objects.equals(this.pipeId, showAlertRuleResponse.pipeId)
            && Objects.equals(this.pipeName, showAlertRuleResponse.pipeName)
            && Objects.equals(this.createBy, showAlertRuleResponse.createBy)
            && Objects.equals(this.createTime, showAlertRuleResponse.createTime)
            && Objects.equals(this.updateBy, showAlertRuleResponse.updateBy)
            && Objects.equals(this.updateTime, showAlertRuleResponse.updateTime)
            && Objects.equals(this.deleteTime, showAlertRuleResponse.deleteTime)
            && Objects.equals(this.ruleName, showAlertRuleResponse.ruleName)
            && Objects.equals(this.query, showAlertRuleResponse.query)
            && Objects.equals(this.queryType, showAlertRuleResponse.queryType)
            && Objects.equals(this.status, showAlertRuleResponse.status)
            && Objects.equals(this.severity, showAlertRuleResponse.severity)
            && Objects.equals(this.accumulatedTimes, showAlertRuleResponse.accumulatedTimes)
            && Objects.equals(this.customProperties, showAlertRuleResponse.customProperties)
            && Objects.equals(this.eventGrouping, showAlertRuleResponse.eventGrouping)
            && Objects.equals(this.schedule, showAlertRuleResponse.schedule)
            && Objects.equals(this.triggers, showAlertRuleResponse.triggers)
            && Objects.equals(this.xRequestId, showAlertRuleResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId,
            pipeId,
            pipeName,
            createBy,
            createTime,
            updateBy,
            updateTime,
            deleteTime,
            ruleName,
            query,
            queryType,
            status,
            severity,
            accumulatedTimes,
            customProperties,
            eventGrouping,
            schedule,
            triggers,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlertRuleResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    accumulatedTimes: ").append(toIndentedString(accumulatedTimes)).append("\n");
        sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
        sb.append("    eventGrouping: ").append(toIndentedString(eventGrouping)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
