package com.huaweicloud.sdk.edgesec.v2.model;

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
 * CreateHttpAccessControlRuleRequestBody
 */
public class CreateHttpAccessControlRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Long terminal;

    /**
     * 生效模式
     */
    public static final class TimeModeEnum {

        /**
         * Enum PERMANENT for value: "permanent"
         */
        public static final TimeModeEnum PERMANENT = new TimeModeEnum("permanent");

        /**
         * Enum PERIOD for value: "period"
         */
        public static final TimeModeEnum PERIOD = new TimeModeEnum("period");

        /**
         * Enum CUSTOMIZE for value: "customize"
         */
        public static final TimeModeEnum CUSTOMIZE = new TimeModeEnum("customize");

        private static final Map<String, TimeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeModeEnum> createStaticFields() {
            Map<String, TimeModeEnum> map = new HashMap<>();
            map.put("permanent", PERMANENT);
            map.put("period", PERIOD);
            map.put("customize", CUSTOMIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeModeEnum(String value) {
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
        public static TimeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeModeEnum(value));
        }

        public static TimeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeModeEnum) {
                return this.value.equals(((TimeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_mode")

    private TimeModeEnum timeMode;

    /**
     * time_mode为period时必传，每日生效时间类型，目前只有day
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum DAY for value: "day"
         */
        public static final PeriodTypeEnum DAY = new PeriodTypeEnum("day");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("day", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodTypeEnum(String value) {
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
        public static PeriodTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private PeriodTypeEnum periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private List<TimeRangeItem> timeRange = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<HttpAccessControlRuleCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private HttpRuleAction action;

    public CreateHttpAccessControlRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateHttpAccessControlRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，最长512字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateHttpAccessControlRuleRequestBody withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 精准防护规则生效的起始时间戳（秒）。当time=true，才需要填写该参数。
     * minimum: 0
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public CreateHttpAccessControlRuleRequestBody withTerminal(Long terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 精准防护规则生效的终止时间戳（秒）。当time=true，才需要填写该参数。
     * minimum: 0
     * @return terminal
     */
    public Long getTerminal() {
        return terminal;
    }

    public void setTerminal(Long terminal) {
        this.terminal = terminal;
    }

    public CreateHttpAccessControlRuleRequestBody withTimeMode(TimeModeEnum timeMode) {
        this.timeMode = timeMode;
        return this;
    }

    /**
     * 生效模式
     * @return timeMode
     */
    public TimeModeEnum getTimeMode() {
        return timeMode;
    }

    public void setTimeMode(TimeModeEnum timeMode) {
        this.timeMode = timeMode;
    }

    public CreateHttpAccessControlRuleRequestBody withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * time_mode为period时必传，每日生效时间类型，目前只有day
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public CreateHttpAccessControlRuleRequestBody withTimeRange(List<TimeRangeItem> timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public CreateHttpAccessControlRuleRequestBody addTimeRangeItem(TimeRangeItem timeRangeItem) {
        if (this.timeRange == null) {
            this.timeRange = new ArrayList<>();
        }
        this.timeRange.add(timeRangeItem);
        return this;
    }

    public CreateHttpAccessControlRuleRequestBody withTimeRange(Consumer<List<TimeRangeItem>> timeRangeSetter) {
        if (this.timeRange == null) {
            this.timeRange = new ArrayList<>();
        }
        timeRangeSetter.accept(this.timeRange);
        return this;
    }

    /**
     * time_mode为period时必传，每日生效时间区间
     * @return timeRange
     */
    public List<TimeRangeItem> getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(List<TimeRangeItem> timeRange) {
        this.timeRange = timeRange;
    }

    public CreateHttpAccessControlRuleRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * time_mode为period时必传，时区，例如：UTC+8
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CreateHttpAccessControlRuleRequestBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 执行该规则的优先级，值越小，优先级越高，值相同时，规则创建时间早，优先级越高。取值范围：1到100。
     * minimum: 1
     * maximum: 100
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateHttpAccessControlRuleRequestBody withConditions(List<HttpAccessControlRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateHttpAccessControlRuleRequestBody addConditionsItem(HttpAccessControlRuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateHttpAccessControlRuleRequestBody withConditions(
        Consumer<List<HttpAccessControlRuleCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 命中条件
     * @return conditions
     */
    public List<HttpAccessControlRuleCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<HttpAccessControlRuleCondition> conditions) {
        this.conditions = conditions;
    }

    public CreateHttpAccessControlRuleRequestBody withAction(HttpRuleAction action) {
        this.action = action;
        return this;
    }

    public CreateHttpAccessControlRuleRequestBody withAction(Consumer<HttpRuleAction> actionSetter) {
        if (this.action == null) {
            this.action = new HttpRuleAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public HttpRuleAction getAction() {
        return action;
    }

    public void setAction(HttpRuleAction action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHttpAccessControlRuleRequestBody that = (CreateHttpAccessControlRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.start, that.start) && Objects.equals(this.terminal, that.terminal)
            && Objects.equals(this.timeMode, that.timeMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.timeRange, that.timeRange) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            start,
            terminal,
            timeMode,
            periodType,
            timeRange,
            timeZone,
            priority,
            conditions,
            action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHttpAccessControlRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
