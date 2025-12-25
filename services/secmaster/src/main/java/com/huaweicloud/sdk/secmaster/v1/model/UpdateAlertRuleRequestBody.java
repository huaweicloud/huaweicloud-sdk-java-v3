package com.huaweicloud.sdk.secmaster.v1.model;

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
 * UpdateAlertRuleRequestBody
 */
public class UpdateAlertRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private Map<String, String> alertType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_properties")

    private Map<String, String> customProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_grouping")

    private Boolean eventGrouping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    /**
     * **参数解释**: 查询语法类型 - SQL查询 **约束限制**: 不涉及  **取值范围**: - SQL **默认值**:  SQL
     */
    public static final class QueryTypeEnum {

        /**
         * Enum SQL for value: "SQL"
         */
        public static final QueryTypeEnum SQL = new QueryTypeEnum("SQL");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("SQL", SQL);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryTypeEnum(value));
        }

        public static QueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private Schedule schedule;

    /**
     * **参数解释**: 告警等级 - TIPS 提示 - LOW 低危 - MEDIUM 中危 - HIGH 高危 - FATAL 致命  **约束限制** 不涉及 **取值范围**: - TIPS - LOW - MEDIUM - HIGH - FATAL  **默认值** 不涉及
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "simulation")

    private Boolean simulation;

    /**
     * **参数解释**: 状态 - ENABLED 启用 - DISABLED 禁用  **约束限制** 不涉及 **取值范围**: - ENABLED - DISABLED  **默认值** 不涉及
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
    @JsonProperty(value = "suppression")

    private Boolean suppression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<AlertRuleTrigger> triggers = null;

    public UpdateAlertRuleRequestBody withAlertType(Map<String, String> alertType) {
        this.alertType = alertType;
        return this;
    }

    public UpdateAlertRuleRequestBody putAlertTypeItem(String key, String alertTypeItem) {
        if (this.alertType == null) {
            this.alertType = new HashMap<>();
        }
        this.alertType.put(key, alertTypeItem);
        return this;
    }

    public UpdateAlertRuleRequestBody withAlertType(Consumer<Map<String, String>> alertTypeSetter) {
        if (this.alertType == null) {
            this.alertType = new HashMap<>();
        }
        alertTypeSetter.accept(this.alertType);
        return this;
    }

    /**
     * 告警类型，通过“查询数据类列表” 接口获取
     * @return alertType
     */
    public Map<String, String> getAlertType() {
        return alertType;
    }

    public void setAlertType(Map<String, String> alertType) {
        this.alertType = alertType;
    }

    public UpdateAlertRuleRequestBody withCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    public UpdateAlertRuleRequestBody putCustomPropertiesItem(String key, String customPropertiesItem) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        this.customProperties.put(key, customPropertiesItem);
        return this;
    }

    public UpdateAlertRuleRequestBody withCustomProperties(Consumer<Map<String, String>> customPropertiesSetter) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        customPropertiesSetter.accept(this.customProperties);
        return this;
    }

    /**
     * 自定义扩展信息
     * @return customProperties
     */
    public Map<String, String> getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
    }

    public UpdateAlertRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAlertRuleRequestBody withEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
        return this;
    }

    /**
     * 告警分组
     * @return eventGrouping
     */
    public Boolean getEventGrouping() {
        return eventGrouping;
    }

    public void setEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
    }

    public UpdateAlertRuleRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询语句
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public UpdateAlertRuleRequestBody withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * **参数解释**: 查询语法类型 - SQL查询 **约束限制**: 不涉及  **取值范围**: - SQL **默认值**:  SQL
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public UpdateAlertRuleRequestBody withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 告警规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public UpdateAlertRuleRequestBody withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public UpdateAlertRuleRequestBody withSchedule(Consumer<Schedule> scheduleSetter) {
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

    public UpdateAlertRuleRequestBody withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 告警等级 - TIPS 提示 - LOW 低危 - MEDIUM 中危 - HIGH 高危 - FATAL 致命  **约束限制** 不涉及 **取值范围**: - TIPS - LOW - MEDIUM - HIGH - FATAL  **默认值** 不涉及
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public UpdateAlertRuleRequestBody withSimulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }

    /**
     * 模拟告警
     * @return simulation
     */
    public Boolean getSimulation() {
        return simulation;
    }

    public void setSimulation(Boolean simulation) {
        this.simulation = simulation;
    }

    public UpdateAlertRuleRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 状态 - ENABLED 启用 - DISABLED 禁用  **约束限制** 不涉及 **取值范围**: - ENABLED - DISABLED  **默认值** 不涉及
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateAlertRuleRequestBody withSuppression(Boolean suppression) {
        this.suppression = suppression;
        return this;
    }

    /**
     * 告警抑制
     * @return suppression
     */
    public Boolean getSuppression() {
        return suppression;
    }

    public void setSuppression(Boolean suppression) {
        this.suppression = suppression;
    }

    public UpdateAlertRuleRequestBody withTriggers(List<AlertRuleTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public UpdateAlertRuleRequestBody addTriggersItem(AlertRuleTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public UpdateAlertRuleRequestBody withTriggers(Consumer<List<AlertRuleTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 告警触发规则
     * @return triggers
     */
    public List<AlertRuleTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<AlertRuleTrigger> triggers) {
        this.triggers = triggers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlertRuleRequestBody that = (UpdateAlertRuleRequestBody) obj;
        return Objects.equals(this.alertType, that.alertType)
            && Objects.equals(this.customProperties, that.customProperties)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.eventGrouping, that.eventGrouping) && Objects.equals(this.query, that.query)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.simulation, that.simulation) && Objects.equals(this.status, that.status)
            && Objects.equals(this.suppression, that.suppression) && Objects.equals(this.triggers, that.triggers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertType,
            customProperties,
            description,
            eventGrouping,
            query,
            queryType,
            ruleName,
            schedule,
            severity,
            simulation,
            status,
            suppression,
            triggers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlertRuleRequestBody {\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
        sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eventGrouping: ").append(toIndentedString(eventGrouping)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    suppression: ").append(toIndentedString(suppression)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
