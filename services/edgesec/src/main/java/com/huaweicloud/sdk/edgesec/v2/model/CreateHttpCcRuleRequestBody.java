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
 * CreateHttpCcRuleRequestBody
 */
public class CreateHttpCcRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private Integer mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_num")

    private Integer limitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_period")

    private Integer limitPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private Integer lockTime;

    /**
     * 限速模式：   - ip：IP限速，根据IP区分单个Web访问者。   - cookie：用户限速，根据Cookie键值区分单个Web访问者   - header：用户限速，根据Header区分单个Web访问者。   - ip_segment_c：根据IP C段区分单个Web访问者。
     */
    public static final class TagTypeEnum {

        /**
         * Enum IP for value: "ip"
         */
        public static final TagTypeEnum IP = new TagTypeEnum("ip");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final TagTypeEnum COOKIE = new TagTypeEnum("cookie");

        /**
         * Enum HEADER for value: "header"
         */
        public static final TagTypeEnum HEADER = new TagTypeEnum("header");

        /**
         * Enum IP_SEGMENT_C for value: "ip_segment_c"
         */
        public static final TagTypeEnum IP_SEGMENT_C = new TagTypeEnum("ip_segment_c");

        private static final Map<String, TagTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TagTypeEnum> createStaticFields() {
            Map<String, TagTypeEnum> map = new HashMap<>();
            map.put("ip", IP);
            map.put("cookie", COOKIE);
            map.put("header", HEADER);
            map.put("ip_segment_c", IP_SEGMENT_C);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TagTypeEnum(String value) {
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
        public static TagTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TagTypeEnum(value));
        }

        public static TagTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TagTypeEnum) {
                return this.value.equals(((TagTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private TagTypeEnum tagType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_index")

    private String tagIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_condition")

    private HttpCcRuleCondition tagCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unlock_num")

    private Integer unlockNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_aggregation")

    private Boolean domainAggregation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<HttpCcRuleCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private HttpRuleAction action;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Long terminal;

    /**
     * period每日生效时间类型，目前只有day
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

    public CreateHttpCcRuleRequestBody withName(String name) {
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

    public CreateHttpCcRuleRequestBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * cc规则优先级，越大优先级越高，默认1，创建必填
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

    public CreateHttpCcRuleRequestBody withDescription(String description) {
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

    public CreateHttpCcRuleRequestBody withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * cc规则防护模式，现在只支持创建高级cc规则防护模式。   - 0：标准，只支持对域名的防护路径做限制。  - 1：高级，支持对路径、IP、Cookie、Header、Params字段做限制。
     * minimum: 0
     * maximum: 1
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public CreateHttpCcRuleRequestBody withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 所有用户的周期内请求次数
     * minimum: 0
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public CreateHttpCcRuleRequestBody withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * 单个用户的周期内请求次数
     * minimum: 0
     * maximum: 2147483647
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public CreateHttpCcRuleRequestBody withLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
        return this;
    }

    /**
     * 限速周期
     * minimum: 0
     * maximum: 3600
     * @return limitPeriod
     */
    public Integer getLimitPeriod() {
        return limitPeriod;
    }

    public void setLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
    }

    public CreateHttpCcRuleRequestBody withLockTime(Integer lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 阻断时长
     * minimum: 0
     * maximum: 2147483647
     * @return lockTime
     */
    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    public CreateHttpCcRuleRequestBody withTagType(TagTypeEnum tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * 限速模式：   - ip：IP限速，根据IP区分单个Web访问者。   - cookie：用户限速，根据Cookie键值区分单个Web访问者   - header：用户限速，根据Header区分单个Web访问者。   - ip_segment_c：根据IP C段区分单个Web访问者。
     * @return tagType
     */
    public TagTypeEnum getTagType() {
        return tagType;
    }

    public void setTagType(TagTypeEnum tagType) {
        this.tagType = tagType;
    }

    public CreateHttpCcRuleRequestBody withTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
        return this;
    }

    /**
     * 防护模式标签
     * @return tagIndex
     */
    public String getTagIndex() {
        return tagIndex;
    }

    public void setTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
    }

    public CreateHttpCcRuleRequestBody withTagCondition(HttpCcRuleCondition tagCondition) {
        this.tagCondition = tagCondition;
        return this;
    }

    public CreateHttpCcRuleRequestBody withTagCondition(Consumer<HttpCcRuleCondition> tagConditionSetter) {
        if (this.tagCondition == null) {
            this.tagCondition = new HttpCcRuleCondition();
            tagConditionSetter.accept(this.tagCondition);
        }

        return this;
    }

    /**
     * Get tagCondition
     * @return tagCondition
     */
    public HttpCcRuleCondition getTagCondition() {
        return tagCondition;
    }

    public void setTagCondition(HttpCcRuleCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    public CreateHttpCcRuleRequestBody withUnlockNum(Integer unlockNum) {
        this.unlockNum = unlockNum;
        return this;
    }

    /**
     * 放行次数
     * minimum: 0
     * maximum: 2147483647
     * @return unlockNum
     */
    public Integer getUnlockNum() {
        return unlockNum;
    }

    public void setUnlockNum(Integer unlockNum) {
        this.unlockNum = unlockNum;
    }

    public CreateHttpCcRuleRequestBody withDomainAggregation(Boolean domainAggregation) {
        this.domainAggregation = domainAggregation;
        return this;
    }

    /**
     * 是否聚合域名
     * @return domainAggregation
     */
    public Boolean getDomainAggregation() {
        return domainAggregation;
    }

    public void setDomainAggregation(Boolean domainAggregation) {
        this.domainAggregation = domainAggregation;
    }

    public CreateHttpCcRuleRequestBody withConditions(List<HttpCcRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateHttpCcRuleRequestBody addConditionsItem(HttpCcRuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateHttpCcRuleRequestBody withConditions(Consumer<List<HttpCcRuleCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * cc规则防护规则限速条件，当cc防护规则为高级模式（mode参数值为1）时，该参数必填。
     * @return conditions
     */
    public List<HttpCcRuleCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<HttpCcRuleCondition> conditions) {
        this.conditions = conditions;
    }

    public CreateHttpCcRuleRequestBody withAction(HttpRuleAction action) {
        this.action = action;
        return this;
    }

    public CreateHttpCcRuleRequestBody withAction(Consumer<HttpRuleAction> actionSetter) {
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

    public CreateHttpCcRuleRequestBody withTimeMode(TimeModeEnum timeMode) {
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

    public CreateHttpCcRuleRequestBody withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * customize生效时间区间开始
     * minimum: 946656000
     * maximum: 4102415999
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public CreateHttpCcRuleRequestBody withTerminal(Long terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * customize生效时间区间结束
     * minimum: 946656000
     * maximum: 4102415999
     * @return terminal
     */
    public Long getTerminal() {
        return terminal;
    }

    public void setTerminal(Long terminal) {
        this.terminal = terminal;
    }

    public CreateHttpCcRuleRequestBody withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * period每日生效时间类型，目前只有day
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public CreateHttpCcRuleRequestBody withTimeRange(List<TimeRangeItem> timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public CreateHttpCcRuleRequestBody addTimeRangeItem(TimeRangeItem timeRangeItem) {
        if (this.timeRange == null) {
            this.timeRange = new ArrayList<>();
        }
        this.timeRange.add(timeRangeItem);
        return this;
    }

    public CreateHttpCcRuleRequestBody withTimeRange(Consumer<List<TimeRangeItem>> timeRangeSetter) {
        if (this.timeRange == null) {
            this.timeRange = new ArrayList<>();
        }
        timeRangeSetter.accept(this.timeRange);
        return this;
    }

    /**
     * period每日生效时间区间
     * @return timeRange
     */
    public List<TimeRangeItem> getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(List<TimeRangeItem> timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHttpCcRuleRequestBody that = (CreateHttpCcRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.description, that.description) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.limitNum, that.limitNum)
            && Objects.equals(this.limitPeriod, that.limitPeriod) && Objects.equals(this.lockTime, that.lockTime)
            && Objects.equals(this.tagType, that.tagType) && Objects.equals(this.tagIndex, that.tagIndex)
            && Objects.equals(this.tagCondition, that.tagCondition) && Objects.equals(this.unlockNum, that.unlockNum)
            && Objects.equals(this.domainAggregation, that.domainAggregation)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.action, that.action)
            && Objects.equals(this.timeMode, that.timeMode) && Objects.equals(this.start, that.start)
            && Objects.equals(this.terminal, that.terminal) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.timeRange, that.timeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            priority,
            description,
            mode,
            totalNum,
            limitNum,
            limitPeriod,
            lockTime,
            tagType,
            tagIndex,
            tagCondition,
            unlockNum,
            domainAggregation,
            conditions,
            action,
            timeMode,
            start,
            terminal,
            periodType,
            timeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHttpCcRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    limitPeriod: ").append(toIndentedString(limitPeriod)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
        sb.append("    tagIndex: ").append(toIndentedString(tagIndex)).append("\n");
        sb.append("    tagCondition: ").append(toIndentedString(tagCondition)).append("\n");
        sb.append("    unlockNum: ").append(toIndentedString(unlockNum)).append("\n");
        sb.append("    domainAggregation: ").append(toIndentedString(domainAggregation)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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
