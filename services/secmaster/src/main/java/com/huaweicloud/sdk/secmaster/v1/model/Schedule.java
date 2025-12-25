package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Schedule
 */
public class Schedule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_interval")

    private Integer delayInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_interval")

    private Integer frequencyInterval;

    /**
     * **参数解释**: 调度间隔单位 - MINUTE10 10分钟 - HOUR 小时 - DAY 天  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY  **默认值** 不涉及
     */
    public static final class FrequencyUnitEnum {

        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final FrequencyUnitEnum MINUTE = new FrequencyUnitEnum("MINUTE");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final FrequencyUnitEnum HOUR = new FrequencyUnitEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final FrequencyUnitEnum DAY = new FrequencyUnitEnum("DAY");

        private static final Map<String, FrequencyUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrequencyUnitEnum> createStaticFields() {
            Map<String, FrequencyUnitEnum> map = new HashMap<>();
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrequencyUnitEnum(String value) {
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
        public static FrequencyUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrequencyUnitEnum(value));
        }

        public static FrequencyUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrequencyUnitEnum) {
                return this.value.equals(((FrequencyUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_unit")

    private FrequencyUnitEnum frequencyUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overtime_interval")

    private Integer overtimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_interval")

    private Integer periodInterval;

    /**
     * **参数解释**: 时间窗口单位 - MINUTE10 10分钟 - HOUR 小时 - DAY 天  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY  **默认值** 不涉及
     */
    public static final class PeriodUnitEnum {

        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final PeriodUnitEnum MINUTE = new PeriodUnitEnum("MINUTE");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final PeriodUnitEnum HOUR = new PeriodUnitEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final PeriodUnitEnum DAY = new PeriodUnitEnum("DAY");

        private static final Map<String, PeriodUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodUnitEnum> createStaticFields() {
            Map<String, PeriodUnitEnum> map = new HashMap<>();
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodUnitEnum(String value) {
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
        public static PeriodUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodUnitEnum(value));
        }

        public static PeriodUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodUnitEnum) {
                return this.value.equals(((PeriodUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_unit")

    private PeriodUnitEnum periodUnit;

    public Schedule withDelayInterval(Integer delayInterval) {
        this.delayInterval = delayInterval;
        return this;
    }

    /**
     * 延迟间隔
     * minimum: 0
     * maximum: 10
     * @return delayInterval
     */
    public Integer getDelayInterval() {
        return delayInterval;
    }

    public void setDelayInterval(Integer delayInterval) {
        this.delayInterval = delayInterval;
    }

    public Schedule withFrequencyInterval(Integer frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
        return this;
    }

    /**
     * 调度间隔
     * minimum: 1
     * maximum: 60
     * @return frequencyInterval
     */
    public Integer getFrequencyInterval() {
        return frequencyInterval;
    }

    public void setFrequencyInterval(Integer frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
    }

    public Schedule withFrequencyUnit(FrequencyUnitEnum frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
        return this;
    }

    /**
     * **参数解释**: 调度间隔单位 - MINUTE10 10分钟 - HOUR 小时 - DAY 天  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY  **默认值** 不涉及
     * @return frequencyUnit
     */
    public FrequencyUnitEnum getFrequencyUnit() {
        return frequencyUnit;
    }

    public void setFrequencyUnit(FrequencyUnitEnum frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }

    public Schedule withOvertimeInterval(Integer overtimeInterval) {
        this.overtimeInterval = overtimeInterval;
        return this;
    }

    /**
     * 超时间隔
     * minimum: 0
     * maximum: 10
     * @return overtimeInterval
     */
    public Integer getOvertimeInterval() {
        return overtimeInterval;
    }

    public void setOvertimeInterval(Integer overtimeInterval) {
        this.overtimeInterval = overtimeInterval;
    }

    public Schedule withPeriodInterval(Integer periodInterval) {
        this.periodInterval = periodInterval;
        return this;
    }

    /**
     * 时间窗口间隔
     * minimum: 1
     * maximum: 60
     * @return periodInterval
     */
    public Integer getPeriodInterval() {
        return periodInterval;
    }

    public void setPeriodInterval(Integer periodInterval) {
        this.periodInterval = periodInterval;
    }

    public Schedule withPeriodUnit(PeriodUnitEnum periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }

    /**
     * **参数解释**: 时间窗口单位 - MINUTE10 10分钟 - HOUR 小时 - DAY 天  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY  **默认值** 不涉及
     * @return periodUnit
     */
    public PeriodUnitEnum getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(PeriodUnitEnum periodUnit) {
        this.periodUnit = periodUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Schedule that = (Schedule) obj;
        return Objects.equals(this.delayInterval, that.delayInterval)
            && Objects.equals(this.frequencyInterval, that.frequencyInterval)
            && Objects.equals(this.frequencyUnit, that.frequencyUnit)
            && Objects.equals(this.overtimeInterval, that.overtimeInterval)
            && Objects.equals(this.periodInterval, that.periodInterval)
            && Objects.equals(this.periodUnit, that.periodUnit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(delayInterval, frequencyInterval, frequencyUnit, overtimeInterval, periodInterval, periodUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Schedule {\n");
        sb.append("    delayInterval: ").append(toIndentedString(delayInterval)).append("\n");
        sb.append("    frequencyInterval: ").append(toIndentedString(frequencyInterval)).append("\n");
        sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
        sb.append("    overtimeInterval: ").append(toIndentedString(overtimeInterval)).append("\n");
        sb.append("    periodInterval: ").append(toIndentedString(periodInterval)).append("\n");
        sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
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
