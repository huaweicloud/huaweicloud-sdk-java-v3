package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询指定队列定时扩缩容信息的响应参数。
 */
public class QueuePlanEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_name")

    @JacksonXmlProperty(localName = "plan_name")

    private String planName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cu")

    @JacksonXmlProperty(localName = "target_cu")

    private Integer targetCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_hour")

    @JacksonXmlProperty(localName = "start_hour")

    private Integer startHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_minute")

    @JacksonXmlProperty(localName = "start_minute")

    private Integer startMinute;

    /**
     * 
     */
    public static final class RepeatDayEnum {

        /**
         * Enum SUNDAY for value: "SUNDAY"
         */
        public static final RepeatDayEnum SUNDAY = new RepeatDayEnum("SUNDAY");

        /**
         * Enum _MONDAY for value: " MONDAY"
         */
        public static final RepeatDayEnum _MONDAY = new RepeatDayEnum(" MONDAY");

        /**
         * Enum _TUESDAY for value: " TUESDAY"
         */
        public static final RepeatDayEnum _TUESDAY = new RepeatDayEnum(" TUESDAY");

        /**
         * Enum _WEDNESDAY for value: " WEDNESDAY"
         */
        public static final RepeatDayEnum _WEDNESDAY = new RepeatDayEnum(" WEDNESDAY");

        /**
         * Enum _THURSDAY for value: " THURSDAY"
         */
        public static final RepeatDayEnum _THURSDAY = new RepeatDayEnum(" THURSDAY");

        /**
         * Enum _FRIDAY for value: " FRIDAY"
         */
        public static final RepeatDayEnum _FRIDAY = new RepeatDayEnum(" FRIDAY");

        /**
         * Enum _SATURDAY for value: " SATURDAY"
         */
        public static final RepeatDayEnum _SATURDAY = new RepeatDayEnum(" SATURDAY");

        private static final Map<String, RepeatDayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RepeatDayEnum> createStaticFields() {
            Map<String, RepeatDayEnum> map = new HashMap<>();
            map.put("SUNDAY", SUNDAY);
            map.put(" MONDAY", _MONDAY);
            map.put(" TUESDAY", _TUESDAY);
            map.put(" WEDNESDAY", _WEDNESDAY);
            map.put(" THURSDAY", _THURSDAY);
            map.put(" FRIDAY", _FRIDAY);
            map.put(" SATURDAY", _SATURDAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RepeatDayEnum(String value) {
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
        public static RepeatDayEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RepeatDayEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RepeatDayEnum(value);
            }
            return result;
        }

        public static RepeatDayEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RepeatDayEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RepeatDayEnum) {
                return this.value.equals(((RepeatDayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_day")

    @JacksonXmlProperty(localName = "repeat_day")

    private List<RepeatDayEnum> repeatDay = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_date_begin")

    @JacksonXmlProperty(localName = "valid_date_begin")

    private Long validDateBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_date_end")

    @JacksonXmlProperty(localName = "valid_date_end")

    private Long validDateEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activate")

    @JacksonXmlProperty(localName = "activate")

    private Boolean activate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execute_time")

    @JacksonXmlProperty(localName = "last_execute_time")

    private Long lastExecuteTime;

    public QueuePlanEntity withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 扩缩容计划的ID编号。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QueuePlanEntity withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * 扩缩容计划的名称。
     * @return planName
     */
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public QueuePlanEntity withTargetCu(Integer targetCu) {
        this.targetCu = targetCu;
        return this;
    }

    /**
     * 队列扩缩容计划的目标CU值。
     * @return targetCu
     */
    public Integer getTargetCu() {
        return targetCu;
    }

    public void setTargetCu(Integer targetCu) {
        this.targetCu = targetCu;
    }

    public QueuePlanEntity withStartHour(Integer startHour) {
        this.startHour = startHour;
        return this;
    }

    /**
     * 队列扩缩容计划的起始时（24小时制）。
     * minimum: 0
     * maximum: 23
     * @return startHour
     */
    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    public QueuePlanEntity withStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
        return this;
    }

    /**
     * 定时扩缩容计划的起始分。
     * minimum: 0
     * maximum: 59
     * @return startMinute
     */
    public Integer getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
    }

    public QueuePlanEntity withRepeatDay(List<RepeatDayEnum> repeatDay) {
        this.repeatDay = repeatDay;
        return this;
    }

    public QueuePlanEntity addRepeatDayItem(RepeatDayEnum repeatDayItem) {
        if (this.repeatDay == null) {
            this.repeatDay = new ArrayList<>();
        }
        this.repeatDay.add(repeatDayItem);
        return this;
    }

    public QueuePlanEntity withRepeatDay(Consumer<List<RepeatDayEnum>> repeatDaySetter) {
        if (this.repeatDay == null) {
            this.repeatDay = new ArrayList<>();
        }
        repeatDaySetter.accept(this.repeatDay);
        return this;
    }

    /**
     * 定时扩缩容计划的重复周期规律
     * @return repeatDay
     */
    public List<RepeatDayEnum> getRepeatDay() {
        return repeatDay;
    }

    public void setRepeatDay(List<RepeatDayEnum> repeatDay) {
        this.repeatDay = repeatDay;
    }

    public QueuePlanEntity withValidDateBegin(Long validDateBegin) {
        this.validDateBegin = validDateBegin;
        return this;
    }

    /**
     * 有效期开始时间（13位时间戳）
     * @return validDateBegin
     */
    public Long getValidDateBegin() {
        return validDateBegin;
    }

    public void setValidDateBegin(Long validDateBegin) {
        this.validDateBegin = validDateBegin;
    }

    public QueuePlanEntity withValidDateEnd(Long validDateEnd) {
        this.validDateEnd = validDateEnd;
        return this;
    }

    /**
     * 有效期结束时间（13位时间戳） 
     * @return validDateEnd
     */
    public Long getValidDateEnd() {
        return validDateEnd;
    }

    public void setValidDateEnd(Long validDateEnd) {
        this.validDateEnd = validDateEnd;
    }

    public QueuePlanEntity withActivate(Boolean activate) {
        this.activate = activate;
        return this;
    }

    /**
     * 当前的扩缩容计划是否激活。
     * @return activate
     */
    public Boolean getActivate() {
        return activate;
    }

    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    public QueuePlanEntity withLastExecuteTime(Long lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
        return this;
    }

    /**
     * 当前扩缩容计划最近一次执行的时间。
     * @return lastExecuteTime
     */
    public Long getLastExecuteTime() {
        return lastExecuteTime;
    }

    public void setLastExecuteTime(Long lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueuePlanEntity queuePlanEntity = (QueuePlanEntity) o;
        return Objects.equals(this.id, queuePlanEntity.id) && Objects.equals(this.planName, queuePlanEntity.planName)
            && Objects.equals(this.targetCu, queuePlanEntity.targetCu)
            && Objects.equals(this.startHour, queuePlanEntity.startHour)
            && Objects.equals(this.startMinute, queuePlanEntity.startMinute)
            && Objects.equals(this.repeatDay, queuePlanEntity.repeatDay)
            && Objects.equals(this.validDateBegin, queuePlanEntity.validDateBegin)
            && Objects.equals(this.validDateEnd, queuePlanEntity.validDateEnd)
            && Objects.equals(this.activate, queuePlanEntity.activate)
            && Objects.equals(this.lastExecuteTime, queuePlanEntity.lastExecuteTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            planName,
            targetCu,
            startHour,
            startMinute,
            repeatDay,
            validDateBegin,
            validDateEnd,
            activate,
            lastExecuteTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueuePlanEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    targetCu: ").append(toIndentedString(targetCu)).append("\n");
        sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
        sb.append("    startMinute: ").append(toIndentedString(startMinute)).append("\n");
        sb.append("    repeatDay: ").append(toIndentedString(repeatDay)).append("\n");
        sb.append("    validDateBegin: ").append(toIndentedString(validDateBegin)).append("\n");
        sb.append("    validDateEnd: ").append(toIndentedString(validDateEnd)).append("\n");
        sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
        sb.append("    lastExecuteTime: ").append(toIndentedString(lastExecuteTime)).append("\n");
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
